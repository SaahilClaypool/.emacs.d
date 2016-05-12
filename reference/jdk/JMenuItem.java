_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
        public void stateChanged(ChangeEvent e) {

        /**
         * Supports the change listener interface and fires property changes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    @SuppressWarnings("serial")

    /**
     * This class implements accessibility support for the
     * <code>JMenuItem</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to menu item user-interface
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Returns the <code>AccessibleContext</code> associated with this
     * <code>JMenuItem</code>. For <code>JMenuItem</code>s,
     * the <code>AccessibleContext</code> takes the form of an
     * <code>AccessibleJMenuItem</code>.
     * A new AccessibleJMenuItme instance is created if necessary.
     *
     * @return an <code>AccessibleJMenuItem</code> that serves as the
     *         <code>AccessibleContext</code> of this <code>JMenuItem</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JMenuItem</code>.
     * This method is intended to be used only for debugging purposes,
     * and the content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JMenuItem</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    private void readObject(ObjectInputStream s)

    /**
     * See JComponent.readObject() for information about serialization
     * in Swing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public MenuKeyListener[] getMenuKeyListeners() {

    /**
     * Returns an array of all the <code>MenuKeyListener</code>s added
     * to this JMenuItem with addMenuKeyListener().
     *
     * @return all of the <code>MenuKeyListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void removeMenuKeyListener(MenuKeyListener l) {

    /**
     * Removes a <code>MenuKeyListener</code> from the menu item.
     *
     * @param l the <code>MenuKeyListener</code> to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void addMenuKeyListener(MenuKeyListener l) {

    /**
     * Adds a <code>MenuKeyListener</code> to the menu item.
     *
     * @param l the <code>MenuKeyListener</code> to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public MenuDragMouseListener[] getMenuDragMouseListeners() {

    /**
     * Returns an array of all the <code>MenuDragMouseListener</code>s added
     * to this JMenuItem with addMenuDragMouseListener().
     *
     * @return all of the <code>MenuDragMouseListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void removeMenuDragMouseListener(MenuDragMouseListener l) {

    /**
     * Removes a <code>MenuDragMouseListener</code> from the menu item.
     *
     * @param l the <code>MenuDragMouseListener</code> to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void addMenuDragMouseListener(MenuDragMouseListener l) {

    /**
     * Adds a <code>MenuDragMouseListener</code> to the menu item.
     *
     * @param l the <code>MenuDragMouseListener</code> to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public Component getComponent() {

    /**
     * Returns the <code>java.awt.Component</code> used to paint
     * this object. The returned component will be used to convert
     * events and detect if an event is inside a menu component.
     *
     * @return the <code>Component</code> that paints this menu item
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public MenuElement[] getSubElements() {

    /**
     * This method returns an array containing the sub-menu
     * components for this menu component.
     *
     * @return an array of <code>MenuElement</code>s
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void menuSelectionChanged(boolean isIncluded) {

    /**
     * Called by the <code>MenuSelectionManager</code> when the
     * <code>MenuElement</code> is selected or unselected.
     *
     * @param isIncluded  true if this menu item is on the part of the menu
     *                    path that changed, false if this menu is part of the
     *                    a menu path that changed, but this particular part of
     *                    that path is still the same
     * @see MenuSelectionManager#setSelectedPath(MenuElement[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    protected void fireMenuKeyTyped(MenuKeyEvent event) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param event a <code>MenuKeyEvent</code>
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    protected void fireMenuKeyReleased(MenuKeyEvent event) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param event a <code>MenuKeyEvent</code>
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    protected void fireMenuKeyPressed(MenuKeyEvent event) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param event a <code>MenuKeyEvent</code>
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    protected void fireMenuDragMouseReleased(MenuDragMouseEvent event) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param event a <code>MenuDragMouseEvent</code>
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    protected void fireMenuDragMouseDragged(MenuDragMouseEvent event) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param event a <code>MenuDragMouseEvent</code>
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    protected void fireMenuDragMouseExited(MenuDragMouseEvent event) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param event a <code>MenuDragMouseEvent</code>
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    protected void fireMenuDragMouseEntered(MenuDragMouseEvent event) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param event a <code>MenuMouseDragEvent</code>
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void processMenuKeyEvent(MenuKeyEvent e) {

    /**
     * Handles a keystroke in a menu.
     *
     * @param e  a <code>MenuKeyEvent</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void processMenuDragMouseEvent(MenuDragMouseEvent e) {

    /**
     * Handles mouse drag in a menu.
     *
     * @param e  a <code>MenuDragMouseEvent</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void processKeyEvent(KeyEvent e,MenuElement path[],MenuSelectionManager manager) {

    /**
     * Processes a key event forwarded from the
     * <code>MenuSelectionManager</code> and changes the menu selection,
     * if necessary, by using <code>MenuSelectionManager</code>'s API.
     * <p>
     * Note: you do not have to forward the event to sub-components.
     * This is done automatically by the <code>MenuSelectionManager</code>.
     *
     * @param e  a <code>KeyEvent</code>
     * @param path the <code>MenuElement</code> path array
     * @param manager   the <code>MenuSelectionManager</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void processMouseEvent(MouseEvent e,MenuElement path[],MenuSelectionManager manager) {

    /**
     * Processes a mouse event forwarded from the
     * <code>MenuSelectionManager</code> and changes the menu
     * selection, if necessary, by using the
     * <code>MenuSelectionManager</code>'s API.
     * <p>
     * Note: you do not have to forward the event to sub-components.
     * This is done automatically by the <code>MenuSelectionManager</code>.
     *
     * @param e   a <code>MouseEvent</code>
     * @param path  the <code>MenuElement</code> path array
     * @param manager   the <code>MenuSelectionManager</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    protected void actionPropertyChanged(Action action, String propertyName) {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    protected void configurePropertiesFromAction(Action a) {

    /**
     * {@inheritDoc}
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public KeyStroke getAccelerator() {

    /**
     * Returns the <code>KeyStroke</code> which serves as an accelerator
     * for the menu item.
     * @return a <code>KeyStroke</code> object identifying the
     *          accelerator key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void setAccelerator(KeyStroke keyStroke) {

    /**
     * Sets the key combination which invokes the menu item's
     * action listeners without navigating the menu hierarchy. It is the
     * UI's responsibility to install the correct action.  Note that
     * when the keyboard accelerator is typed, it will work whether or
     * not the menu is currently displayed.
     *
     * @param keyStroke the <code>KeyStroke</code> which will
     *          serve as an accelerator
     * @beaninfo
     *     description: The keystroke combination which will invoke the
     *                  JMenuItem's actionlisteners without navigating the
     *                  menu hierarchy
     *           bound: true
     *       preferred: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    // package private

    /**
     * Returns true since <code>Menu</code>s, by definition,
     * should always be on top of all other windows.  If the menu is
     * in an internal frame false is returned due to the rollover effect
     * for windows laf where the menu is not always on top.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void setEnabled(boolean b) {

    /**
     * Enables or disables the menu item.
     *
     * @param b  true to enable the item
     * @beaninfo
     *    description: Does the component react to user interaction
     *          bound: true
     *      preferred: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public boolean isArmed() {

    /**
     * Returns whether the menu item is "armed".
     *
     * @return true if the menu item is armed, and it can be selected
     * @see #setArmed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void setArmed(boolean b) {

    /**
     * Identifies the menu item as "armed". If the mouse button is
     * released while it is over this item, the menu's action event
     * will fire. If the mouse button is released elsewhere, the
     * event will not fire and the menu item will be disarmed.
     *
     * @param b true to arm the menu item so it can be selected
     * @beaninfo
     *    description: Mouse release will fire an action event
     *         hidden: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public String getUIClassID() {

    /**
     * Returns the suffix used to construct the name of the L&amp;F class used to
     * render this component.
     *
     * @return the string "MenuItemUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void updateUI() {

    /**
     * Resets the UI property with a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void setUI(MenuItemUI ui) {

    /**
     * Sets the look and feel object that renders this component.
     *
     * @param ui  the <code>JMenuItemUI</code> L&amp;F object
     * @see UIDefaults#getUI
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the Component's LookAndFeel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    protected void init(String text, Icon icon) {

    /**
     * Initializes the menu item with the specified text and icon.
     *
     * @param text the text of the <code>JMenuItem</code>
     * @param icon the icon of the <code>JMenuItem</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    void initFocusability() {

    /**
     * Inititalizes the focusability of the the <code>JMenuItem</code>.
     * <code>JMenuItem</code>'s are focusable, but subclasses may
     * want to be, this provides them the opportunity to override this
     * and invoke something else, or nothing at all. Refer to
     * {@link javax.swing.JMenu#initFocusability} for the motivation of
     * this.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public void setModel(ButtonModel newModel) {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public JMenuItem(String text, int mnemonic) {

    /**
     * Creates a <code>JMenuItem</code> with the specified text and
     * keyboard mnemonic.
     *
     * @param text the text of the <code>JMenuItem</code>
     * @param mnemonic the keyboard mnemonic for the <code>JMenuItem</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public JMenuItem(String text, Icon icon) {

    /**
     * Creates a <code>JMenuItem</code> with the specified text and icon.
     *
     * @param text the text of the <code>JMenuItem</code>
     * @param icon the icon of the <code>JMenuItem</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public JMenuItem(Action a) {

    /**
     * Creates a menu item whose properties are taken from the
     * specified <code>Action</code>.
     *
     * @param a the action of the <code>JMenuItem</code>
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public JMenuItem(String text) {

    /**
     * Creates a <code>JMenuItem</code> with the specified text.
     *
     * @param text the text of the <code>JMenuItem</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public JMenuItem(Icon icon) {

    /**
     * Creates a <code>JMenuItem</code> with the specified icon.
     *
     * @param icon the icon of the <code>JMenuItem</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    public JMenuItem() {

    /**
     * Creates a <code>JMenuItem</code> with no set text or icon.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
    private static final String uiClassID = "MenuItemUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenuItem.java
@SuppressWarnings("serial")

/**
 * An implementation of an item in a menu. A menu item is essentially a button
 * sitting in a list. When the user selects the "button", the action
 * associated with the menu item is performed. A <code>JMenuItem</code>
 * contained in a <code>JPopupMenu</code> performs exactly that function.
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
 * For further documentation and for examples, see
 * <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html">How to Use Menus</a>
 * in <em>The Java Tutorial.</em>
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
 * description: An item which can be selected in a menu.
 *
 * @author Georges Saab
 * @author David Karlton
 * @see JPopupMenu
 * @see JMenu
 * @see JCheckBoxMenuItem
 * @see JRadioButtonMenuItem
 */
