_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
        public void selectAllAccessibleSelection() {

        /**
         * Normally causes every selected item in the object to be selected
         * if the object supports multiple selections.  This method
         * makes no sense in a menu bar, and so does nothing.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
        public void clearAccessibleSelection() {

        /**
         * Clears the selection in the object, so that nothing in the
         * object is selected.  This will close any open sub-menu.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
        public void removeAccessibleSelection(int i) {

        /**
         * Removes the nth item from the selection.  In general, menus
         * can only have one item within them selected at a time
         * (e.g. one sub-menu popped open).
         *
         * @param i the zero-based index of the selected item
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
        public void addAccessibleSelection(int i) {

        /**
         * Selects the <code>i</code>th menu in the menu.
         * If that item is a submenu,
         * it will pop up in response.  If a different item is already
         * popped up, this will force it to close.  If this is a sub-menu
         * that is already popped up (selected), this method has no
         * effect.
         *
         * @param i the index of the item to be selected
         * @see #getAccessibleStateSet
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
        public boolean isAccessibleChildSelected(int i) {

        /**
         * Returns true if the current child of this object is selected
         * (that is, if this child is a popped-up submenu).
         *
         * @param i the zero-based index of the child in this Accessible
         * object.
         * @see AccessibleContext#getAccessibleChild
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
        public Accessible getAccessibleSelection(int i) {

        /**
         * Returns the currently selected sub-menu if one is selected,
         * otherwise null (there can only be one selection, and it can
         * only be a sub-menu, as otherwise menu items don't remain
         * selected).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
        public int getAccessibleSelectionCount() {

        /**
         * Returns 1 if a sub-menu is currently selected in this menu.
         *
         * @return 1 if a menu is currently selected, else 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Returns the nth Accessible child of the object.
         *
         * @param i zero-based index of child
         * @return the nth Accessible child of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children in the object.  If all
         * of the children of this object implement Accessible, than this
         * method should return the number of children of this object.
         *
         * @return the number of accessible children in the object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    @SuppressWarnings("serial")

    /**
     * This class implements accessibility support for the
     * <code>JMenu</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to menu user-interface elements.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this JMenu.
     * For JMenus, the AccessibleContext takes the form of an
     * AccessibleJMenu.
     * A new AccessibleJMenu instance is created if necessary.
     *
     * @return an AccessibleJMenu that serves as the
     *         AccessibleContext of this JMenu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JMenu</code>. This
     * method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this JMenu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See <code>readObject</code> and <code>writeObject</code> in
     * <code>JComponent</code> for more
     * information about serialization in Swing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void doClick(int pressTime) {

    /**
     * Programmatically performs a "click".  This overrides the method
     * <code>AbstractButton.doClick</code> in order to make the menu pop up.
     * @param pressTime  indicates the number of milliseconds the
     *          button was pressed for
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    protected void processKeyEvent(KeyEvent evt) {

    /**
     * Processes key stroke events such as mnemonics and accelerators.
     *
     * @param evt  the key event to be processed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void setAccelerator(KeyStroke keyStroke) {

    /**
     * <code>setAccelerator</code> is not defined for <code>JMenu</code>.
     * Use <code>setMnemonic</code> instead.
     * @param keyStroke  the keystroke combination which will invoke
     *                  the <code>JMenuItem</code>'s actionlisteners
     *                  without navigating the menu hierarchy
     * @exception Error  if invoked -- this method is not defined for JMenu.
     *                  Use <code>setMnemonic</code> instead
     *
     * @beaninfo
     *     description: The keystroke combination which will invoke the JMenuItem's
     *                  actionlisteners without navigating the menu hierarchy
     *          hidden: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void applyComponentOrientation(ComponentOrientation o) {

    /**
     * Sets the <code>ComponentOrientation</code> property of this menu
     * and all components contained within it. This includes all
     * components returned by {@link #getMenuComponents getMenuComponents}.
     *
     * @param o the new component orientation of this menu and
     *        the components contained within it.
     * @exception NullPointerException if <code>orientation</code> is null.
     * @see java.awt.Component#setComponentOrientation
     * @see java.awt.Component#getComponentOrientation
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public Component getComponent() {

    /**
     * Returns the <code>java.awt.Component</code> used to
     * paint this <code>MenuElement</code>.
     * The returned component is used to convert events and detect if
     * an event is inside a menu component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public MenuElement[] getSubElements() {

    /**
     * Returns an array of <code>MenuElement</code>s containing the submenu
     * for this menu component.  If popup menu is <code>null</code> returns
     * an empty array.  This method is required to conform to the
     * <code>MenuElement</code> interface.  Note that since
     * <code>JSeparator</code>s do not conform to the <code>MenuElement</code>
     * interface, this array will only contain <code>JMenuItem</code>s.
     *
     * @return an array of <code>MenuElement</code> objects
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void menuSelectionChanged(boolean isIncluded) {

    /**
     * Messaged when the menubar selection changes to activate or
     * deactivate this menu.
     * Overrides <code>JMenuItem.menuSelectionChanged</code>.
     *
     * @param isIncluded  true if this menu is active, false if
     *        it is not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
        public void windowClosing(WindowEvent e) {

        /**
         * Deselect the menu when the popup is closed from outside.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
        public WinListener(JPopupMenu p) {

        /**
         *  Create the window listener for the specified popup.
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    @SuppressWarnings("serial")

    /**
     * A listener class that watches for a popup window closing.
     * When the popup is closing, the listener deselects the menu.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    protected WinListener createWinListener(JPopupMenu p) {

    /**
     * Creates a window-closing listener for the popup.
     *
     * @param p the <code>JPopupMenu</code>
     * @return the new window-closing listener
     *
     * @see WinListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    protected void fireMenuCanceled() {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is created lazily.
     *
     * @exception Error if there is a <code>null</code> listener
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    protected void fireMenuDeselected() {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is created lazily.
     *
     * @exception Error if there is a <code>null</code> listener
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    protected void fireMenuSelected() {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is created lazily.
     *
     * @exception Error  if there is a <code>null</code> listener
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public MenuListener[] getMenuListeners() {

    /**
     * Returns an array of all the <code>MenuListener</code>s added
     * to this JMenu with addMenuListener().
     *
     * @return all of the <code>MenuListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void removeMenuListener(MenuListener l) {

    /**
     * Removes a listener for menu events.
     *
     * @param l the listener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void addMenuListener(MenuListener l) {

    /**
     * Adds a listener for menu events.
     *
     * @param l the listener to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public JPopupMenu getPopupMenu() {

    /**
     * Returns the popupmenu associated with this menu.  If there is
     * no popupmenu, it will create one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public boolean isMenuComponent(Component c) {

    /**
     * Returns true if the specified component exists in the
     * submenu hierarchy.
     *
     * @param c the <code>Component</code> to be tested
     * @return true if the <code>Component</code> exists, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public boolean isTopLevelMenu() {

    /**
     * Returns true if the menu is a 'top-level menu', that is, if it is
     * the direct child of a menubar.
     *
     * @return true if the menu is activated from the menu bar;
     *         false if the menu is activated from a menu item
     *         on another menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public Component[] getMenuComponents() {

    /**
     * Returns an array of <code>Component</code>s of the menu's
     * subcomponents.  Note that this returns all <code>Component</code>s
     * in the popup menu, including separators.
     *
     * @return an array of <code>Component</code>s or an empty array
     *          if there is no popup menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public Component getMenuComponent(int n) {

    /**
     * Returns the component at position <code>n</code>.
     *
     * @param n the position of the component to be returned
     * @return the component requested, or <code>null</code>
     *                  if there is no popup menu
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public int getMenuComponentCount() {

    /**
     * Returns the number of components on the menu.
     *
     * @return an integer containing the number of components on the menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void removeAll() {

    /**
     * Removes all menu items from this menu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void remove(Component c) {

    /**
     * Removes the component <code>c</code> from this menu.
     *
     * @param       c the component to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void remove(int pos) {

    /**
     * Removes the menu item at the specified index from this menu.
     *
     * @param       pos the position of the item to be removed
     * @exception   IllegalArgumentException if the value of
     *                       <code>pos</code> &lt; 0, or if <code>pos</code>
     *                       is greater than the number of menu items
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void remove(JMenuItem item) {

    /**
     * Removes the specified menu item from this menu.  If there is no
     * popup menu, this method will have no effect.
     *
     * @param    item the <code>JMenuItem</code> to be removed from the menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public boolean isTearOff() {

    /**
     * Returns true if the menu can be torn off.  This method is not
     * yet implemented.
     *
     * @return true if the menu can be torn off, else false
     * @exception  Error  if invoked -- this method is not yet implemented
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public int getItemCount() {

    /**
     * Returns the number of items on the menu, including separators.
     * This method is included for AWT compatibility.
     *
     * @return an integer equal to the number of items on the menu
     * @see #getMenuComponentCount
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public JMenuItem getItem(int pos) {

    /**
     * Returns the <code>JMenuItem</code> at the specified position.
     * If the component at <code>pos</code> is not a menu item,
     * <code>null</code> is returned.
     * This method is included for AWT compatibility.
     *
     * @param pos    an integer specifying the position
     * @exception   IllegalArgumentException if the value of
     *                       <code>pos</code> &lt; 0
     * @return  the menu item at the specified position; or <code>null</code>
     *          if the item as the specified position is not a menu item
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void insertSeparator(int index) {

    /**
     * Inserts a separator at the specified position.
     *
     * @param       index an integer specifying the position at which to
     *                    insert the menu separator
     * @exception   IllegalArgumentException if the value of
     *                       <code>index</code> &lt; 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public JMenuItem insert(Action a, int pos) {

    /**
     * Inserts a new menu item attached to the specified <code>Action</code>
     * object at a given position.
     *
     * @param a the <code>Action</code> object for the menu item to add
     * @param pos an integer specifying the position at which to add the
     *               new menu item
     * @exception IllegalArgumentException if the value of
     *                  <code>pos</code> &lt; 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public JMenuItem insert(JMenuItem mi, int pos) {

    /**
     * Inserts the specified <code>JMenuitem</code> at a given position.
     *
     * @param mi the <code>JMenuitem</code> to add
     * @param pos an integer specifying the position at which to add the
     *               new <code>JMenuitem</code>
     * @return the new menu item
     * @exception IllegalArgumentException if the value of
     *                  <code>pos</code> &lt; 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void insert(String s, int pos) {

    /**
     * Inserts a new menu item with the specified text at a
     * given position.
     *
     * @param s the text for the menu item to add
     * @param pos an integer specifying the position at which to add the
     *               new menu item
     * @exception IllegalArgumentException when the value of
     *                  <code>pos</code> &lt; 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void addSeparator()

    /**
     * Appends a new separator to the end of the menu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    protected PropertyChangeListener createActionChangeListener(JMenuItem b) {

    /**
     * Returns a properly configured <code>PropertyChangeListener</code>
     * which updates the control as changes to the <code>Action</code> occur.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    protected JMenuItem createActionComponent(Action a) {

    /**
     * Factory method which creates the <code>JMenuItem</code> for
     * <code>Action</code>s added to the <code>JMenu</code>.
     *
     * @param a the <code>Action</code> for the menu item to be added
     * @return the new menu item
     * @see Action
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public JMenuItem add(Action a) {

    /**
     * Creates a new menu item attached to the specified
     * <code>Action</code> object and appends it to the end of this menu.
     *
     * @param a the <code>Action</code> for the menu item to be added
     * @see Action
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public JMenuItem add(String s) {

    /**
     * Creates a new menu item with the specified text and appends
     * it to the end of this menu.
     *
     * @param s the string for the menu item to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public Component add(Component c, int index) {

    /**
     * Adds the specified component to this container at the given
     * position. If <code>index</code> equals -1, the component will
     * be appended to the end.
     * @param     c   the <code>Component</code> to add
     * @param     index    the position at which to insert the component
     * @return    the <code>Component</code> added
     * @see       #remove
     * @see java.awt.Container#add(Component, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public Component add(Component c) {

    /**
     * Appends a component to the end of this menu.
     * Returns the component added.
     *
     * @param c the <code>Component</code> to add
     * @return the <code>Component</code> added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public JMenuItem add(JMenuItem menuItem) {

    /**
     * Appends a menu item to the end of this menu.
     * Returns the menu item added.
     *
     * @param menuItem the <code>JMenuitem</code> to be added
     * @return the <code>JMenuItem</code> added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void setMenuLocation(int x, int y) {

    /**
     * Sets the location of the popup component.
     *
     * @param x the x coordinate of the popup's new position
     * @param y the y coordinate of the popup's new position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    protected WinListener popupListener;

    /**
     * The window-closing listener for the popup.
     *
     * @see WinListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void setDelay(int d) {

    /**
     * Sets the suggested delay before the menu's <code>PopupMenu</code>
     * is popped up or down.  Each look and feel (L&amp;F) may determine
     * it's own policy for observing the delay property.  In most cases,
     * the delay is not observed for top level menus or while dragging.
     * This method is a property of the look and feel code and is used
     * to manage the idiosyncrasies of the various UI implementations.
     *
     * @param       d the number of milliseconds to delay
     * @exception   IllegalArgumentException if <code>d</code>
     *                       is less than 0
     * @beaninfo
     *      description: The delay between menu selection and making the popup menu visible
     *           expert: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public int getDelay() {

    /**
     * Returns the suggested delay, in milliseconds, before submenus
     * are popped up or down.
     * Each look and feel (L&amp;F) may determine its own policy for
     * observing the <code>delay</code> property.
     * In most cases, the delay is not observed for top level menus
     * or while dragging.  The default for <code>delay</code> is 0.
     * This method is a property of the look and feel code and is used
     * to manage the idiosyncrasies of the various UI implementations.
     *
     *
     * @return the <code>delay</code> property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    protected Point getPopupMenuOrigin() {

    /**
     * Computes the origin for the <code>JMenu</code>'s popup menu.
     * This method uses Look and Feel properties named
     * <code>Menu.menuPopupOffsetX</code>,
     * <code>Menu.menuPopupOffsetY</code>,
     * <code>Menu.submenuPopupOffsetX</code>, and
     * <code>Menu.submenuPopupOffsetY</code>
     * to adjust the exact location of popup.
     *
     * @return a <code>Point</code> in the coordinate space of the
     *          menu which should be used as the origin
     *          of the <code>JMenu</code>'s popup menu
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void setPopupMenuVisible(boolean b) {

    /**
     * Sets the visibility of the menu's popup.  If the menu is
     * not enabled, this method will have no effect.
     *
     * @param b  a boolean value -- true to make the menu visible,
     *           false to hide it
     * @beaninfo
     *      description: The popup menu's visibility
     *           expert: true
     *           hidden: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public boolean isPopupMenuVisible() {

    /**
     * Returns true if the menu's popup window is visible.
     *
     * @return true if the menu is visible, else false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void setSelected(boolean b) {

    /**
     * Sets the selection status of the menu.
     *
     * @param b  true to select (highlight) the menu; false to de-select
     *          the menu
     * @beaninfo
     *      description: When the menu is selected, its popup child is shown.
     *           expert: true
     *           hidden: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public boolean isSelected() {

    /**
     * Returns true if the menu is currently selected (highlighted).
     *
     * @return true if the menu is selected, else false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void setModel(ButtonModel newModel) {

    /**
     * Sets the data model for the "menu button" -- the label
     * that the user clicks to open or close the menu.
     *
     * @param newModel the <code>ButtonModel</code>
     * @see #getModel
     * @beaninfo
     * description: The menu's model
     *       bound: true
     *      expert: true
     *      hidden: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public String getUIClassID() {

    /**
     * Returns the name of the L&amp;F class that renders this component.
     *
     * @return the string "MenuUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public void updateUI() {

    /**
     * Resets the UI property with a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    void initFocusability() {

    /**
     * Overriden to do nothing. We want JMenu to be focusable, but
     * <code>JMenuItem</code> doesn't want to be, thus we override this
     * do nothing. We don't invoke <code>setFocusable(true)</code> after
     * super's constructor has completed as this has the side effect that
     * <code>JMenu</code> will be considered traversable via the
     * keyboard, which we don't want. Making a Component traversable by
     * the keyboard after invoking <code>setFocusable(true)</code> is OK,
     * as <code>setFocusable</code> is new API
     * and is speced as such, but internally we don't want to use it like
     * this else we change the keyboard traversability.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public JMenu(String s, boolean b) {

    /**
     * Constructs a new <code>JMenu</code> with the supplied string as
     * its text and specified as a tear-off menu or not.
     *
     * @param s the text for the menu label
     * @param b can the menu be torn off (not yet implemented)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public JMenu(Action a) {

    /**
     * Constructs a menu whose properties are taken from the
     * <code>Action</code> supplied.
     * @param a an <code>Action</code>
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public JMenu(String s) {

    /**
     * Constructs a new <code>JMenu</code> with the supplied string
     * as its text.
     *
     * @param s  the text for the menu label
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    public JMenu() {

    /**
     * Constructs a new <code>JMenu</code> with no text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
    private static final String uiClassID = "MenuUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JMenu.java
@SuppressWarnings("serial")

/**
 * An implementation of a menu -- a popup window containing
 * <code>JMenuItem</code>s that
 * is displayed when the user selects an item on the <code>JMenuBar</code>.
 * In addition to <code>JMenuItem</code>s, a <code>JMenu</code> can
 * also contain <code>JSeparator</code>s.
 * <p>
 * In essence, a menu is a button with an associated <code>JPopupMenu</code>.
 * When the "button" is pressed, the <code>JPopupMenu</code> appears. If the
 * "button" is on the <code>JMenuBar</code>, the menu is a top-level window.
 * If the "button" is another menu item, then the <code>JPopupMenu</code> is
 * "pull-right" menu.
 * <p>
 * Menus can be configured, and to some degree controlled, by
 * <code><a href="Action.html">Action</a></code>s.  Using an
 * <code>Action</code> with a menu has many benefits beyond directly
 * configuring a menu.  Refer to <a href="Action.html#buttonActions">
 * Swing Components Supporting <code>Action</code></a> for more
 * details, and you can find more information in <a
 * href="https://docs.oracle.com/javase/tutorial/uiswing/misc/action.html">How
 * to Use Actions</a>, a section in <em>The Java Tutorial</em>.
 * <p>
 * For information and examples of using menus see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html">How to Use Menus</a>,
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
 *   attribute: isContainer true
 * description: A popup window containing menu items displayed in a menu bar.
 *
 * @author Georges Saab
 * @author David Karlton
 * @author Arnaud Weber
 * @see JMenuItem
 * @see JSeparator
 * @see JMenuBar
 * @see JPopupMenu
 */
