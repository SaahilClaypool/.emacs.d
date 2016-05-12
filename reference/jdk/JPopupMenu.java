_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public boolean isPopupTrigger(MouseEvent e) {

    /**
     * Returns true if the <code>MouseEvent</code> is considered a popup trigger
     * by the <code>JPopupMenu</code>'s currently installed UI.
     *
     * @return true if the mouse event is a popup trigger
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
        public String getUIClassID()

        /**
         * Returns the name of the L&amp;F class that renders this component.
         *
         * @return the string "PopupMenuSeparatorUI"
         * @see JComponent#getUIClassID
         * @see UIDefaults#getUI
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    @SuppressWarnings("serial")

    /**
     * A popup menu-specific separator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public Component getComponent() {

    /**
     * Returns this <code>JPopupMenu</code> component.
     * @return this <code>JPopupMenu</code> object
     * @see MenuElement#getComponent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public MenuElement[] getSubElements() {

    /**
     * Returns an array of <code>MenuElement</code>s containing the submenu
     * for this menu component.  It will only return items conforming to
     * the <code>JMenuElement</code> interface.
     * If popup menu is <code>null</code> returns
     * an empty array.  This method is required to conform to the
     * <code>MenuElement</code> interface.
     *
     * @return an array of <code>MenuElement</code> objects
     * @see MenuElement#getSubElements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void menuSelectionChanged(boolean isIncluded) {

    /**
     * Messaged when the menubar selection changes to activate or
     * deactivate this menu. This implements the
     * <code>javax.swing.MenuElement</code> interface.
     * Overrides <code>MenuElement.menuSelectionChanged</code>.
     *
     * @param isIncluded  true if this menu is active, false if
     *        it is not
     * @see MenuElement#menuSelectionChanged(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    private void fireMenuKeyTyped(MenuKeyEvent event) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param event a <code>MenuKeyEvent</code>
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    private void fireMenuKeyReleased(MenuKeyEvent event) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param event a <code>MenuKeyEvent</code>
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    private void fireMenuKeyPressed(MenuKeyEvent event) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param event a <code>MenuKeyEvent</code>
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    private void processMenuKeyEvent(MenuKeyEvent e) {

    /**
     * Handles a keystroke in a menu.
     *
     * @param e  a <code>MenuKeyEvent</code> object
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void processKeyEvent(KeyEvent e, MenuElement path[],
                                MenuSelectionManager manager) {

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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void processMouseEvent(MouseEvent event,MenuElement path[],MenuSelectionManager manager) {}

    /**
     * This method is required to conform to the
     * <code>MenuElement</code> interface, but it not implemented.
     * @see MenuElement#processMouseEvent(MouseEvent, MenuElement[], MenuSelectionManager)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
// Serialization support.

////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
        public void propertyChange(PropertyChangeEvent e) {

        /**
         * This method gets called when a bound property is changed.
         * @param e A <code>PropertyChangeEvent</code> object describing
         * the event source and the property that has changed. Must not be null.
         *
         * @throws NullPointerException if the parameter is null.
         * @since 1.5
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of
         * the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
        protected AccessibleJPopupMenu() {

        /**
         * AccessibleJPopupMenu constructor
         *
         * @since 1.5
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    @SuppressWarnings("serial")

    /**
     * This class implements accessibility support for the
     * <code>JPopupMenu</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to popup menu user-interface
     * elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this JPopupMenu.
     * For JPopupMenus, the AccessibleContext takes the form of an
     * AccessibleJPopupMenu.
     * A new AccessibleJPopupMenu instance is created if necessary.
     *
     * @return an AccessibleJPopupMenu that serves as the
     *         AccessibleContext of this JPopupMenu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JPopupMenu</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JPopupMenu</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    boolean isSubPopupMenu(JPopupMenu popup) {

    /**
     * Examines the list of menu items to determine whether
     * <code>popup</code> is a popup menu.
     *
     * @param popup  a <code>JPopupMenu</code>
     * @return true if <code>popup</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public Insets getMargin() {

    /**
     * Returns the margin, in pixels, between the popup menu's border and
     * its containers.
     *
     * @return an <code>Insets</code> object containing the margin values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    protected void paintBorder(Graphics g) {

    /**
     * Paints the popup menu's border if the <code>borderPainted</code>
     * property is <code>true</code>.
     * @param g  the <code>Graphics</code> object
     *
     * @see JComponent#paint
     * @see JComponent#setBorder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void setBorderPainted(boolean b) {

    /**
     * Sets whether the border should be painted.
     *
     * @param b if true, the border is painted.
     * @see #isBorderPainted
     * @beaninfo
     * description: Is the border of the popup menu painted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public boolean isBorderPainted() {

    /**
     * Checks whether the border should be painted.
     *
     * @return true if the border is painted, false otherwise
     * @see #setBorderPainted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void setSelected(Component sel) {

    /**
     * Sets the currently selected component,  This will result
     * in a change to the selection model.
     *
     * @param sel the <code>Component</code> to select
     * @beaninfo
     * description: The selected component on the popup menu
     *      expert: true
     *      hidden: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void setPopupSize(int width, int height) {

    /**
     * Sets the size of the Popup window to the specified width and
     * height. This is equivalent to
     *  <code>setPreferredSize(new Dimension(width, height))</code>.
     *
     * @param width the new width of the Popup in pixels
     * @param height the new height of the Popup in pixels
     * @beaninfo
     * description: The size of the popup menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void setPopupSize(Dimension d) {

    /**
     * Sets the size of the Popup window using a <code>Dimension</code> object.
     * This is equivalent to <code>setPreferredSize(d)</code>.
     *
     * @param d   the <code>Dimension</code> specifying the new size
     * of this component.
     * @beaninfo
     * description: The size of the popup menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public int getComponentIndex(Component c) {

    /**
     * Returns the index of the specified component.
     *
     * @param  c the <code>Component</code> to find
     * @return the index of the component, where 0 is the first;
     *         or -1 if the component is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    @Deprecated

    /**
     * Returns the component at the specified index.
     *
     * @param i  the index of the component, where 0 is the first
     * @return the <code>Component</code> at that index
     * @deprecated replaced by {@link java.awt.Container#getComponent(int)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    JPopupMenu getRootPopupMenu() {

    /**
     * Returns the popup menu which is at the root of the menu system
     * for this popup menu.
     *
     * @return the topmost grandparent <code>JPopupMenu</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void show(Component invoker, int x, int y) {

    /**
     * Displays the popup menu at the position x,y in the coordinate
     * space of the component invoker.
     *
     * @param invoker the component in whose space the popup menu is to appear
     * @param x the x coordinate in invoker's coordinate space at which
     * the popup menu is to be displayed
     * @param y the y coordinate in invoker's coordinate space at which
     * the popup menu is to be displayed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void setInvoker(Component invoker) {

    /**
     * Sets the invoker of this popup menu -- the component in which
     * the popup menu menu is to be displayed.
     *
     * @param invoker the <code>Component</code> in which the popup
     *          menu is displayed
     * @beaninfo
     * description: The invoking component for the popup menu
     *      expert: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public Component getInvoker() {

    /**
     * Returns the component which is the 'invoker' of this
     * popup menu.
     *
     * @return the <code>Component</code> in which the popup menu is displayed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    private boolean isPopupMenu() {

    /**
     * Returns true if the popup menu is a standalone popup menu
     * rather than the submenu of a <code>JMenu</code>.
     *
     * @return true if this menu is a standalone popup menu, otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void setLocation(int x, int y) {

    /**
     * Sets the location of the upper left corner of the
     * popup menu using x, y coordinates.
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code JPopupMenu} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     *
     * @param x the x coordinate of the popup's new position
     *          in the screen's coordinate space
     * @param y the y coordinate of the popup's new position
     *          in the screen's coordinate space
     * @beaninfo
     * description: The location of the popup menu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public boolean isVisible() {

    /**
     * Returns true if the popup menu is visible (currently
     * being displayed).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    private void showPopup() {

    /**
     * Retrieves <code>Popup</code> instance from the
     * <code>PopupMenuUI</code> that has had <code>show</code> invoked on
     * it. If the current <code>popup</code> is non-null,
     * this will invoke <code>dispose</code> of it, and then
     * <code>show</code> the new one.
     * <p>
     * This does NOT fire any events, it is up the caller to dispatch
     * the necessary events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void setVisible(boolean b) {

    /**
     * Sets the visibility of the popup menu.
     *
     * @param b true to make the popup visible, or false to
     *          hide it
     * @beaninfo
     *           bound: true
     *     description: Makes the popup visible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void pack() {

    /**
     * Lays out the container so that it uses the minimum space
     * needed to display its contents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    // package private

    /**
     * Always returns true since popups, by definition, should always
     * be on top of all other windows.
     * @return true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    protected void firePopupMenuCanceled() {

    /**
     * Notifies <code>PopupMenuListeners</code> that this popup menu is
     * cancelled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    protected void firePopupMenuWillBecomeInvisible() {

    /**
     * Notifies <code>PopupMenuListener</code>s that this popup menu will
     * become invisible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    protected void firePopupMenuWillBecomeVisible() {

    /**
     * Notifies <code>PopupMenuListener</code>s that this popup menu will
     * become visible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public MenuKeyListener[] getMenuKeyListeners() {

    /**
     * Returns an array of all the <code>MenuKeyListener</code>s added
     * to this JPopupMenu with addMenuKeyListener().
     *
     * @return all of the <code>MenuKeyListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void removeMenuKeyListener(MenuKeyListener l) {

    /**
     * Removes a <code>MenuKeyListener</code> from the popup menu.
     *
     * @param l the <code>MenuKeyListener</code> to be removed
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void addMenuKeyListener(MenuKeyListener l) {

    /**
     * Adds a <code>MenuKeyListener</code> to the popup menu.
     *
     * @param l the <code>MenuKeyListener</code> to be added
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public PopupMenuListener[] getPopupMenuListeners() {

    /**
     * Returns an array of all the <code>PopupMenuListener</code>s added
     * to this JMenuItem with addPopupMenuListener().
     *
     * @return all of the <code>PopupMenuListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void removePopupMenuListener(PopupMenuListener l) {

    /**
     * Removes a <code>PopupMenu</code> listener.
     *
     * @param l  the <code>PopupMenuListener</code> to remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void addPopupMenuListener(PopupMenuListener l) {

    /**
     *  Adds a <code>PopupMenu</code> listener.
     *
     *  @param l  the <code>PopupMenuListener</code> to add
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void insert(Component component, int index) {

    /**
     * Inserts the specified component into the menu at a given
     * position.
     *
     * @param component  the <code>Component</code> to insert
     * @param index      specifies the position at which
     *                   to insert the component, where 0 is the first
     * @exception IllegalArgumentException if <code>index</code> &lt; 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void insert(Action a, int index) {

    /**
     * Inserts a menu item for the specified <code>Action</code> object at
     * a given position.
     *
     * @param a  the <code>Action</code> object to insert
     * @param index      specifies the position at which to insert the
     *                   <code>Action</code>, where 0 is the first
     * @exception IllegalArgumentException if <code>index</code> &lt; 0
     * @see Action
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void addSeparator() {

    /**
     * Appends a new separator at the end of the menu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void setLabel(String label) {

    /**
     * Sets the popup menu's label.  Different look and feels may choose
     * to display or not display this.
     *
     * @param label a string specifying the label for the popup menu
     *
     * @see #setLabel
     * @beaninfo
     * description: The label for the popup menu.
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public String getLabel() {

    /**
     * Returns the popup menu's label
     *
     * @return a string containing the popup menu's label
     * @see #setLabel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public boolean isLightWeightPopupEnabled() {

    /**
     * Gets the <code>lightWeightPopupEnabled</code> property.
     *
     * @return the value of the <code>lightWeightPopupEnabled</code> property
     * @see #setLightWeightPopupEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void setLightWeightPopupEnabled(boolean aFlag) {

    /**
     * Sets the value of the <code>lightWeightPopupEnabled</code> property,
     * which by default is <code>true</code>.
     * By default, when a look and feel displays a popup,
     * it can choose to
     * use a lightweight (all-Java) popup.
     * Lightweight popup windows are more efficient than heavyweight
     * (native peer) windows,
     * but lightweight and heavyweight components do not mix well in a GUI.
     * If your application mixes lightweight and heavyweight components,
     * you should disable lightweight popups.
     * Some look and feels might always use heavyweight popups,
     * no matter what the value of this property.
     *
     * @param aFlag  <code>false</code> to disable lightweight popups
     * @beaninfo
     * description: Determines whether lightweight popups are used when possible
     *      expert: true
     *
     * @see #isLightWeightPopupEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void remove(int pos) {

    /**
     * Removes the component at the specified index from this popup menu.
     *
     * @param       pos the position of the item to be removed
     * @exception   IllegalArgumentException if the value of
     *                          <code>pos</code> &lt; 0, or if the value of
     *                          <code>pos</code> is greater than the
     *                          number of items
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    protected PropertyChangeListener createActionChangeListener(JMenuItem b) {

    /**
     * Returns a properly configured <code>PropertyChangeListener</code>
     * which updates the control as changes to the <code>Action</code> occur.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    protected JMenuItem createActionComponent(Action a) {

    /**
     * Factory method which creates the <code>JMenuItem</code> for
     * <code>Actions</code> added to the <code>JPopupMenu</code>.
     *
     * @param a the <code>Action</code> for the menu item to be added
     * @return the new menu item
     * @see Action
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    static boolean canPopupOverlapTaskBar() {

    /**
     * Returns whether popup is allowed to be shown above the task bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    private GraphicsConfiguration getCurrentGraphicsConfiguration(
            Point popupLocation) {

    /**
     * Tries to find GraphicsConfiguration
     * that contains the mouse cursor position.
     * Can return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    Point adjustPopupLocationToFitScreen(int xPosition, int yPosition) {

    /**
     * Returns an point which has been adjusted to take into account of the
     * desktop bounds, taskbar and multi-monitor configuration.
     * <p>
     * This adustment may be cancelled by invoking the application with
     * -Djavax.swing.adjustPopupLocationToFit=false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public JMenuItem add(Action a) {

    /**
     * Appends a new menu item to the end of the menu which
     * dispatches the specified <code>Action</code> object.
     *
     * @param a the <code>Action</code> to add to the menu
     * @return the new menu item
     * @see Action
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public JMenuItem add(String s) {

    /**
     * Creates a new menu item with the specified text and appends
     * it to the end of this menu.
     *
     * @param s the string for the menu item to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public JMenuItem add(JMenuItem menuItem) {

    /**
     * Appends the specified menu item to the end of this menu.
     *
     * @param menuItem the <code>JMenuItem</code> to add
     * @return the <code>JMenuItem</code> added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void setSelectionModel(SingleSelectionModel model) {

    /**
     * Sets the model object to handle single selections.
     *
     * @param model the new <code>SingleSelectionModel</code>
     * @see SingleSelectionModel
     * @beaninfo
     * description: The selection model for the popup menu
     *      expert: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public SingleSelectionModel getSelectionModel() {

    /**
     * Returns the model object that handles single selections.
     *
     * @return the <code>selectionModel</code> property
     * @see SingleSelectionModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    protected void processKeyEvent(KeyEvent evt) {

    /**
     * Processes key stroke events such as mnemonics and accelerators.
     *
     * @param evt  the key event to be processed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public String getUIClassID() {

    /**
     * Returns the name of the L&amp;F class that renders this component.
     *
     * @return the string "PopupMenuUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void updateUI() {

    /**
     * Resets the UI property to a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public void setUI(PopupMenuUI ui) {

    /**
     * Sets the L&amp;F object that renders this component.
     *
     * @param ui the new <code>PopupMenuUI</code> L&amp;F object
     * @see UIDefaults#getUI
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the Component's LookAndFeel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public PopupMenuUI getUI() {

    /**
     * Returns the look and feel (L&amp;F) object that renders this component.
     *
     * @return the <code>PopupMenuUI</code> object that renders this component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public JPopupMenu(String label) {

    /**
     * Constructs a <code>JPopupMenu</code> with the specified title.
     *
     * @param label  the string that a UI may use to display as a title
     * for the popup menu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public JPopupMenu() {

    /**
     * Constructs a <code>JPopupMenu</code> without an "invoker".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public static boolean getDefaultLightWeightPopupEnabled() {

    /**
     *  Gets the <code>defaultLightWeightPopupEnabled</code> property,
     *  which by default is <code>true</code>.
     *
     *  @return the value of the <code>defaultLightWeightPopupEnabled</code>
     *          property
     *
     *  @see #setDefaultLightWeightPopupEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    public static void setDefaultLightWeightPopupEnabled(boolean aFlag) {

    /**
     *  Sets the default value of the <code>lightWeightPopupEnabled</code>
     *  property.
     *
     *  @param aFlag <code>true</code> if popups can be lightweight,
     *               otherwise <code>false</code>
     *  @see #getDefaultLightWeightPopupEnabled
     *  @see #setLightWeightPopupEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    private    boolean   lightWeightPopup         = true;

    /**
     * Used to indicate if lightweight popups should be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    static boolean popupPostionFixDisabled = false;

    /** Bug#4425878-Property javax.swing.adjustPopupLocationToFit introduced */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    private static final Object defaultLWPopupEnabledKey =

    /**
     * Key used in AppContext to determine if light way popups are the default.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
    private static final String uiClassID = "PopupMenuUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JPopupMenu.java
@SuppressWarnings("serial")

/**
 * An implementation of a popup menu -- a small window that pops up
 * and displays a series of choices. A <code>JPopupMenu</code> is used for the
 * menu that appears when the user selects an item on the menu bar.
 * It is also used for "pull-right" menu that appears when the
 * selects a menu item that activates it. Finally, a <code>JPopupMenu</code>
 * can also be used anywhere else you want a menu to appear.  For
 * example, when the user right-clicks in a specified area.
 * <p>
 * For information and examples of using popup menus, see
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
 * description: A small window that pops up and displays a series of choices.
 *
 * @author Georges Saab
 * @author David Karlton
 * @author Arnaud Weber
 */
