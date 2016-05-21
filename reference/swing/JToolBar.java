_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Get the state of this object.
         *
         * @return an instance of AccessibleStateSet containing the current
         * state set of the object
         * @see AccessibleState
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    protected class AccessibleJToolBar extends AccessibleJComponent {

    /**
     * This class implements accessibility support for the
     * <code>JToolBar</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to toolbar user-interface elements.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    /**

////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
// Accessibility support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JToolBar</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JToolBar</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See <code>readObject</code> and <code>writeObject</code> in
     * <code>JComponent</code> for more
     * information about serialization in Swing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
        public Dimension getPreferredSize()

        /**
         * Returns the preferred size for the separator.
         *
         * @return the <code>Dimension</code> object containing the separator's
         *         preferred size
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
        public Dimension getMaximumSize()

        /**
         * Returns the maximum size for the separator.
         *
         * @return the <code>Dimension</code> object containing the separator's
         *         maximum size
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
        public Dimension getMinimumSize()

        /**
         * Returns the minimum size for the separator.
         *
         * @return the <code>Dimension</code> object containing the separator's
         *         minimum size
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
        public Dimension getSeparatorSize()

        /**
         * Returns the size of the separator
         *
         * @return the <code>Dimension</code> object containing the separator's
         *         size (This is a reference, NOT a copy!)
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
        public void setSeparatorSize( Dimension size )

        /**
         * Sets the size of the separator.
         *
         * @param size the new <code>Dimension</code> of the separator
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
        public String getUIClassID()

        /**
         * Returns the name of the L&amp;F class that renders this component.
         *
         * @return the string "ToolBarSeparatorUI"
         * @see JComponent#getUIClassID
         * @see UIDefaults#getUI
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
        public Separator( Dimension size )

        /**
         * Creates a new toolbar separator with the specified size.
         *
         * @param size the <code>Dimension</code> of the separator
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
        public Separator()

        /**
         * Creates a new toolbar separator with the default size
         * as defined by the current look and feel.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    static public class Separator extends JSeparator

    /**
     * A toolbar-specific separator. An object with dimension but
     * no contents used to divide buttons on a tool bar into groups.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    protected void addImpl(Component comp, Object constraints, int index) {

    /**
     * If a <code>JButton</code> is being added, it is initially
     * set to be disabled.
     *
     * @param comp  the component to be enhanced
     * @param constraints  the constraints to be enforced on the component
     * @param index the index of the component
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    protected PropertyChangeListener createActionChangeListener(JButton b) {

    /**
     * Returns a properly configured <code>PropertyChangeListener</code>
     * which updates the control as changes to the <code>Action</code> occur,
     * or <code>null</code> if the default
     * property change listener for the control is desired.
     *
     * @return <code>null</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    protected JButton createActionComponent(Action a) {

    /**
     * Factory method which creates the <code>JButton</code> for
     * <code>Action</code>s added to the <code>JToolBar</code>.
     * The default name is empty if a <code>null</code> action is passed.
     *
     * @param a the <code>Action</code> for the button to be added
     * @return the newly created button
     * @see Action
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public JButton add(Action a) {

    /**
     * Adds a new <code>JButton</code> which dispatches the action.
     *
     * @param a the <code>Action</code> object to add as a new menu item
     * @return the new button which dispatches the action
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public void addSeparator( Dimension size )

    /**
     * Appends a separator of a specified size to the end
     * of the tool bar.
     *
     * @param size the <code>Dimension</code> of the separator
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public void addSeparator()

    /**
     * Appends a separator of default size to the end of the tool bar.
     * The default size is determined by the current look and feel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public boolean isRollover() {

    /**
     * Returns the rollover state.
     *
     * @return true if rollover toolbar buttons are to be drawn; otherwise false
     * @see #setRollover(boolean)
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public void setRollover(boolean rollover) {

    /**
     * Sets the rollover state of this toolbar. If the rollover state is true
     * then the border of the toolbar buttons will be drawn only when the
     * mouse pointer hovers over them. The default value of this property
     * is false.
     * <p>
     * The implementation of a look and feel may choose to ignore this
     * property.
     *
     * @param rollover true for rollover toolbar buttons; otherwise false
     * @since 1.4
     * @beaninfo
     *        bound: true
     *    preferred: true
     *    attribute: visualUpdate true
     *  description: Will draw rollover button borders in the toolbar.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public void setOrientation( int o )

    /**
     * Sets the orientation of the tool bar.  The orientation must have
     * either the value <code>HORIZONTAL</code> or <code>VERTICAL</code>.
     * If <code>orientation</code> is
     * an invalid value, an exception will be thrown.
     *
     * @param o  the new orientation -- either <code>HORIZONTAL</code> or
     *                  <code>VERTICAL</code>
     * @exception IllegalArgumentException if orientation is neither
     *          <code>HORIZONTAL</code> nor <code>VERTICAL</code>
     * @see #getOrientation
     * @beaninfo
     * description: The current orientation of the tool bar
     *       bound: true
     *   preferred: true
     *        enum: HORIZONTAL SwingConstants.HORIZONTAL
     *              VERTICAL   SwingConstants.VERTICAL
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public int getOrientation()

    /**
     * Returns the current orientation of the tool bar.  The value is either
     * <code>HORIZONTAL</code> or <code>VERTICAL</code>.
     *
     * @return an integer representing the current orientation -- either
     *          <code>HORIZONTAL</code> or <code>VERTICAL</code>
     * @see #setOrientation
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public void setFloatable( boolean b )

     /**
      * Sets the <code>floatable</code> property,
      * which must be <code>true</code> for the user to move the tool bar.
      * Typically, a floatable tool bar can be
      * dragged into a different position within the same container
      * or out into its own window.
      * The default value of this property is <code>true</code>.
      * Some look and feels might not implement floatable tool bars;
      * they will ignore this property.
      *
      * @param b if <code>true</code>, the tool bar can be moved;
      *          <code>false</code> otherwise
      * @see #isFloatable
      * @beaninfo
      * description: Can the tool bar be made to float by the user?
      *       bound: true
      *   preferred: true
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public boolean isFloatable()

    /**
     * Gets the <code>floatable</code> property.
     *
     * @return the value of the <code>floatable</code> property
     *
     * @see #setFloatable
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
     protected void paintBorder(Graphics g)

     /**
      * Paints the tool bar's border if the <code>borderPainted</code> property
      * is <code>true</code>.
      *
      * @param g  the <code>Graphics</code> context in which the painting
      *         is done
      * @see JComponent#paint
      * @see JComponent#setBorder
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
     public void setBorderPainted(boolean b)

     /**
      * Sets the <code>borderPainted</code> property, which is
      * <code>true</code> if the border should be painted.
      * The default value for this property is <code>true</code>.
      * Some look and feels might not implement painted borders;
      * they will ignore this property.
      *
      * @param b if true, the border is painted
      * @see #isBorderPainted
      * @beaninfo
      * description: Does the tool bar paint its borders?
      *       bound: true
      *      expert: true
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
     public boolean isBorderPainted()

     /**
      * Gets the <code>borderPainted</code> property.
      *
      * @return the value of the <code>borderPainted</code> property
      * @see #setBorderPainted
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
     public Insets getMargin()

     /**
      * Returns the margin between the tool bar's border and
      * its buttons.
      *
      * @return an <code>Insets</code> object containing the margin values
      * @see Insets
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
     public void setMargin(Insets m)

     /**
      * Sets the margin between the tool bar's border and
      * its buttons. Setting to <code>null</code> causes the tool bar to
      * use the default margins. The tool bar's default <code>Border</code>
      * object uses this value to create the proper margin.
      * However, if a non-default border is set on the tool bar,
      * it is that <code>Border</code> object's responsibility to create the
      * appropriate margin space (otherwise this property will
      * effectively be ignored).
      *
      * @param m an <code>Insets</code> object that defines the space
      *         between the border and the buttons
      * @see Insets
      * @beaninfo
      * description: The margin between the tool bar's border and contents
      *       bound: true
      *      expert: true
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public Component getComponentAtIndex(int i) {

    /**
     * Returns the component at the specified index.
     *
     * @param i  the component's position, where 0 is first
     * @return   the <code>Component</code> at that position,
     *          or <code>null</code> for an invalid index
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public int getComponentIndex(Component c) {

    /**
     * Returns the index of the specified component.
     * (Note: Separators occupy index positions.)
     *
     * @param c  the <code>Component</code> to find
     * @return an integer indicating the component's position,
     *          where 0 is first
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public String getUIClassID() {

    /**
     * Returns the name of the L&amp;F class that renders this component.
     *
     * @return the string "ToolBarUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public void updateUI() {

    /**
     * Notification from the <code>UIFactory</code> that the L&amp;F has changed.
     * Called to replace the UI with the latest version from the
     * <code>UIFactory</code>.
     *
     * @see JComponent#updateUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public void setUI(ToolBarUI ui) {

    /**
     * Sets the L&amp;F object that renders this component.
     *
     * @param ui  the <code>ToolBarUI</code> L&amp;F object
     * @see UIDefaults#getUI
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the Component's LookAndFeel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public ToolBarUI getUI() {

    /**
     * Returns the tool bar's current UI.
     * @see #setUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public JToolBar( String name , int orientation) {

    /**
     * Creates a new tool bar with a specified <code>name</code> and
     * <code>orientation</code>.
     * All other constructors call this constructor.
     * If <code>orientation</code> is an invalid value, an exception will
     * be thrown.
     *
     * @param name  the name of the tool bar
     * @param orientation  the initial orientation -- it must be
     *          either <code>HORIZONTAL</code> or <code>VERTICAL</code>
     * @exception IllegalArgumentException if orientation is neither
     *          <code>HORIZONTAL</code> nor <code>VERTICAL</code>
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public JToolBar( String name ) {

    /**
     * Creates a new tool bar with the specified <code>name</code>.  The
     * name is used as the title of the undocked tool bar.  The default
     * orientation is <code>HORIZONTAL</code>.
     *
     * @param name the name of the tool bar
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public JToolBar( int orientation )

    /**
     * Creates a new tool bar with the specified <code>orientation</code>.
     * The <code>orientation</code> must be either <code>HORIZONTAL</code>
     * or <code>VERTICAL</code>.
     *
     * @param orientation  the orientation desired
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    public JToolBar()

    /**
     * Creates a new tool bar; orientation defaults to <code>HORIZONTAL</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
    private static final String uiClassID = "ToolBarUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JToolBar.java
public class JToolBar extends JComponent implements SwingConstants, Accessible

/**
 * <code>JToolBar</code> provides a component that is useful for
 * displaying commonly used <code>Action</code>s or controls.
 * For examples and information on using tool bars see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/toolbar.html">How to Use Tool Bars</a>,
 * a section in <em>The Java Tutorial</em>.
 *
 * <p>
 * With most look and feels,
 * the user can drag out a tool bar into a separate window
 * (unless the <code>floatable</code> property is set to <code>false</code>).
 * For drag-out to work correctly, it is recommended that you add
 * <code>JToolBar</code> instances to one of the four "sides" of a
 * container whose layout manager is a <code>BorderLayout</code>,
 * and do not add children to any of the other four "sides".
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
 *   attribute: isContainer true
 * description: A component which displays commonly used controls or Actions.
 *
 * @author Georges Saab
 * @author Jeff Shapiro
 * @see Action
 */