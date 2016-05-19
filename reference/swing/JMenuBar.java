_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException

    /**
     * See JComponent.readObject() for information about serialization
     * in Swing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public void removeNotify() {

    /**
     * Overrides <code>JComponent.removeNotify</code> to unregister this
     * menu bar with the current keyboard manager.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public void addNotify() {

    /**
     * Overrides <code>JComponent.addNotify</code> to register this
     * menu bar with the current keyboard manager.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    protected boolean processKeyBinding(KeyStroke ks, KeyEvent e,
                                        int condition, boolean pressed) {

    /**
     * Subclassed to check all the child menus.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
        public void selectAllAccessibleSelection() {

        /**
         * Normally causes every selected item in the object to be selected
         * if the object supports multiple selections.  This method
         * makes no sense in a menu bar, and so does nothing.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
        public void clearAccessibleSelection() {

        /**
         * Clears the selection in the object, so that nothing in the
         * object is selected.  This will close any open menu.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
        public void removeAccessibleSelection(int i) {

        /**
         * Removes the nth selected item in the object from the object's
         * selection.  If the nth item isn't currently selected, this
         * method has no effect.  Otherwise, it closes the popup menu.
         *
         * @param i the zero-based index of selectable items
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
        public void addAccessibleSelection(int i) {

        /**
         * Selects the nth menu in the menu bar, forcing it to
         * pop up.  If another menu is popped up, this will force
         * it to close.  If the nth menu is already selected, this
         * method has no effect.
         *
         * @param i the zero-based index of selectable items
         * @see #getAccessibleStateSet
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
        public boolean isAccessibleChildSelected(int i) {

        /**
         * Returns true if the current child of this object is selected.
         *
         * @param i the zero-based index of the child in this Accessible
         * object.
         * @see AccessibleContext#getAccessibleChild
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
         public Accessible getAccessibleSelection(int i) {

        /**
         * Returns the currently selected menu if one is selected,
         * otherwise null.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
         public int getAccessibleSelectionCount() {

        /**
         * Returns 1 if a menu is currently selected in this menu bar.
         *
         * @return 1 if a menu is currently selected, else 0
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
        public AccessibleSelection getAccessibleSelection() {

        /**
         * Get the AccessibleSelection associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleSelection interface on behalf of itself.
         *
         * @return this object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Get the accessible state set of this object.
         *
         * @return an instance of AccessibleState containing the current state
         *         of the object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    @SuppressWarnings("serial")

    /**
     * This class implements accessibility support for the
     * <code>JMenuBar</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to menu bar user-interface
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    /**

////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
// Accessibility support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JMenuBar</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JMenuBar</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public Component getComponent() {

    /**
     * Implemented to be a <code>MenuElement</code>. Returns this object.
     *
     * @return the current <code>Component</code> (this)
     * @see #getSubElements
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public MenuElement[] getSubElements() {

    /**
     * Implemented to be a <code>MenuElement</code> -- returns the
     * menus in this menu bar.
     * This is the reason for implementing the <code>MenuElement</code>
     * interface -- so that the menu bar can be treated the same as
     * other menu elements.
     * @return an array of menu items in the menu bar.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public void menuSelectionChanged(boolean isIncluded) {

    /**
     * Implemented to be a <code>MenuElement</code> -- does nothing.
     *
     * @see #getSubElements
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public void processKeyEvent(KeyEvent e,MenuElement path[],MenuSelectionManager manager) {

    /**
     * Implemented to be a <code>MenuElement</code> -- does nothing.
     *
     * @see #getSubElements
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public void processMouseEvent(MouseEvent event,MenuElement path[],MenuSelectionManager manager) {

    /**
     * Implemented to be a <code>MenuElement</code> -- does nothing.
     *
     * @see #getSubElements
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public Insets getMargin() {

    /**
     * Returns the margin between the menubar's border and
     * its menus.  If there is no previous margin, it will create
     * a default margin with zero size.
     *
     * @return an <code>Insets</code> object containing the margin values
     * @see Insets
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public void setMargin(Insets m) {

    /**
     * Sets the margin between the menubar's border and
     * its menus. Setting to <code>null</code> will cause the menubar to
     * use the default margins.
     *
     * @param m an Insets object containing the margin values
     * @see Insets
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: The space between the menubar's border and its contents
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    protected void paintBorder(Graphics g) {

    /**
     * Paints the menubar's border if <code>BorderPainted</code>
     * property is true.
     *
     * @param g the <code>Graphics</code> context to use for painting
     * @see JComponent#paint
     * @see JComponent#setBorder
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public void setBorderPainted(boolean b) {

    /**
     * Sets whether the border should be painted.
     *
     * @param b if true and border property is not <code>null</code>,
     *          the border is painted.
     * @see #isBorderPainted
     * @beaninfo
     *        bound: true
     *    attribute: visualUpdate true
     *  description: Whether the border should be painted.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public boolean isBorderPainted() {

    /**
     * Returns true if the menu bars border should be painted.
     *
     * @return  true if the border should be painted, else false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public boolean isSelected() {

    /**
     * Returns true if the menu bar currently has a component selected.
     *
     * @return true if a selection has been made, else false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public void setSelected(Component sel) {

    /**
     * Sets the currently selected component, producing a
     * a change to the selection model.
     *
     * @param sel the <code>Component</code> to select
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public int getComponentIndex(Component c) {

    /**
     * Returns the index of the specified component.
     *
     * @param c  the <code>Component</code> to find
     * @return an integer giving the component's position, where 0 is first;
     *          or -1 if it can't be found
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    @Deprecated

    /**
     * Returns the component at the specified index.
     *
     * @param i an integer specifying the position, where 0 is first
     * @return the <code>Component</code> at the position,
     *          or <code>null</code> for an invalid index
     * @deprecated replaced by <code>getComponent(int i)</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    @Transient

    /**
     * Gets the help menu for the menu bar.  This method is not yet
     * implemented and will throw an exception.
     *
     * @return the <code>JMenu</code> that delivers help to the user
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public void setHelpMenu(JMenu menu) {

    /**
     * Sets the help menu that appears when the user selects the
     * "help" option in the menu bar. This method is not yet implemented
     * and will throw an exception.
     *
     * @param menu the JMenu that delivers help to the user
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public int getMenuCount() {

    /**
     * Returns the number of items in the menu bar.
     *
     * @return the number of items in the menu bar
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public JMenu getMenu(int index) {

    /**
     * Returns the menu at the specified position in the menu bar.
     *
     * @param index  an integer giving the position in the menu bar, where
     *               0 is the first position
     * @return the <code>JMenu</code> at that position, or <code>null</code> if
     *          if there is no <code>JMenu</code> at that position (ie. if
     *          it is a <code>JMenuItem</code>)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public JMenu add(JMenu c) {

    /**
     * Appends the specified menu to the end of the menu bar.
     *
     * @param c the <code>JMenu</code> component to add
     * @return the menu component
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public void setSelectionModel(SingleSelectionModel model) {

    /**
     * Sets the model object to handle single selections.
     *
     * @param model the <code>SingleSelectionModel</code> to use
     * @see SingleSelectionModel
     * @beaninfo
     *       bound: true
     * description: The selection model, recording which child is selected.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public SingleSelectionModel getSelectionModel() {

    /**
     * Returns the model object that handles single selections.
     *
     * @return the <code>SingleSelectionModel</code> property
     * @see SingleSelectionModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public String getUIClassID() {

    /**
     * Returns the name of the L&amp;F class that renders this component.
     *
     * @return the string "MenuBarUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public void updateUI() {

    /**
     * Resets the UI property with a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public void setUI(MenuBarUI ui) {

    /**
     * Sets the L&amp;F object that renders this component.
     *
     * @param ui the new MenuBarUI L&amp;F object
     * @see UIDefaults#getUI
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the Component's LookAndFeel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public MenuBarUI getUI() {

    /**
     * Returns the menubar's current UI.
     * @see #setUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    public JMenuBar() {

    /**
     * Creates a new menu bar.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
    private static final String uiClassID = "MenuBarUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JMenuBar.java
@SuppressWarnings("serial")

/**
 * An implementation of a menu bar. You add <code>JMenu</code> objects to the
 * menu bar to construct a menu. When the user selects a <code>JMenu</code>
 * object, its associated <code>JPopupMenu</code> is displayed, allowing the
 * user to select one of the <code>JMenuItems</code> on it.
 * <p>
 * For information and examples of using menu bars see
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
 * <p>
 * <strong>Warning:</strong>
 * By default, pressing the Tab key does not transfer focus from a <code>
 * JMenuBar</code> which is added to a container together with other Swing
 * components, because the <code>focusTraversalKeysEnabled</code> property
 * of <code>JMenuBar</code> is set to <code>false</code>. To resolve this,
 * you should call the <code>JMenuBar.setFocusTraversalKeysEnabled(true)</code>
 * method.
 * @beaninfo
 *   attribute: isContainer true
 * description: A container for holding and displaying menus.
 *
 * @author Georges Saab
 * @author David Karlton
 * @author Arnaud Weber
 * @see JMenu
 * @see JPopupMenu
 * @see JMenuItem
 */
