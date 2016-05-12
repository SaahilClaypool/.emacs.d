_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    protected class AccessibleAWTMenu extends AccessibleAWTMenuItem

    /**
     * Inner class of Menu used to provide default support for
     * accessibility.  This class is not meant to be used directly by
     * application developers, but is instead meant only to be
     * subclassed by menu component developers.
     * <p>
     * This class implements accessibility support for the
     * <code>Menu</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to menu user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    int getAccessibleChildIndex(MenuComponent child) {

    /**
     * Defined in MenuComponent. Overridden here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this Menu.
     * For menus, the AccessibleContext takes the form of an
     * AccessibleAWTMenu.
     * A new AccessibleAWTMenu instance is created if necessary.
     *
     * @return an AccessibleAWTMenu that serves as the
     *         AccessibleContext of this Menu
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public String paramString() {

    /**
     * Returns a string representing the state of this <code>Menu</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return the parameter string of this menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code>.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    private int menuSerializedDataVersion = 1;

    /**
     * The menu serialized Data Version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void removeAll() {

    /**
     * Removes all items from this menu.
     * @since       JDK1.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void remove(MenuComponent item) {

    /**
     * Removes the specified menu item from this menu.
     * @param  item the item to be removed from the menu.
     *         If <code>item</code> is <code>null</code>
     *         or is not in this menu, this method does
     *         nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void remove(int index) {

    /**
     * Removes the menu item at the specified index from this menu.
     * @param       index the position of the item to be removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void insertSeparator(int index) {

    /**
     * Inserts a separator at the specified position.
     * @param       index the position at which the
     *                       menu separator should be inserted.
     * @exception   IllegalArgumentException if the value of
     *                       <code>index</code> is less than 0.
     * @see         java.awt.Menu#addSeparator
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void addSeparator() {

    /**
     * Adds a separator line, or a hypen, to the menu at the current position.
     * @see         java.awt.Menu#insertSeparator(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void insert(String label, int index) {

    /**
     * Inserts a menu item with the specified label into this menu
     * at the specified position.  This is a convenience method for
     * <code>insert(menuItem, index)</code>.
     *
     * @param       label the text on the item
     * @param       index the position at which the menu item
     *                      should be inserted
     * @see         java.awt.Menu#add(java.lang.String)
     * @see         java.awt.Menu#add(java.awt.MenuItem)
     * @exception     IllegalArgumentException if the value of
     *                    <code>index</code> is less than zero
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void insert(MenuItem menuitem, int index) {

    /**
     * Inserts a menu item into this menu
     * at the specified position.
     *
     * @param         menuitem  the menu item to be inserted.
     * @param         index     the position at which the menu
     *                          item should be inserted.
     * @see           java.awt.Menu#add(java.lang.String)
     * @see           java.awt.Menu#add(java.awt.MenuItem)
     * @exception     IllegalArgumentException if the value of
     *                    <code>index</code> is less than zero
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void add(String label) {

    /**
     * Adds an item with the specified label to this menu.
     *
     * @param       label   the text on the item
     * @see         java.awt.Menu#insert(java.lang.String, int)
     * @see         java.awt.Menu#insert(java.awt.MenuItem, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public MenuItem add(MenuItem mi) {

    /**
     * Adds the specified menu item to this menu. If the
     * menu item has been part of another menu, removes it
     * from that menu.
     *
     * @param       mi   the menu item to be added
     * @return      the menu item added
     * @see         java.awt.Menu#insert(java.lang.String, int)
     * @see         java.awt.Menu#insert(java.awt.MenuItem, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public MenuItem getItem(int index) {

    /**
     * Gets the item located at the specified index of this menu.
     * @param     index the position of the item to be returned.
     * @return    the item located at the specified index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getItemCount()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public int getItemCount() {

    /**
      * Get the number of items in this menu.
      * @return     the number of items in this menu.
      * @since      JDK1.1
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public boolean isTearOff() {

    /**
     * Indicates whether this menu is a tear-off menu.
     * <p>
     * Tear-off functionality may not be supported by all
     * implementations of AWT.  If a particular implementation doesn't
     * support tear-off menus, this value is silently ignored.
     * @return      <code>true</code> if this is a tear-off menu;
     *                         <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void removeNotify() {

    /**
     * Removes the menu's peer.  The peer allows us to modify the appearance
     * of the menu without changing its functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void addNotify() {

    /**
     * Creates the menu's peer.  The peer allows us to modify the
     * appearance of the menu without changing its functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    String constructComponentName() {

    /**
     * Construct a name for this MenuComponent.  Called by getName() when
     * the name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public Menu(String label, boolean tearOff) throws HeadlessException {

    /**
     * Constructs a new menu with the specified label,
     * indicating whether the menu can be torn off.
     * <p>
     * Tear-off functionality may not be supported by all
     * implementations of AWT.  If a particular implementation doesn't
     * support tear-off menus, this value is silently ignored.
     * @param       label the menu's label in the menu bar, or in
     *                   another menu of which this menu is a submenu.
     * @param       tearOff   if <code>true</code>, the menu
     *                   is a tear-off menu.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since       JDK1.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public Menu(String label) throws HeadlessException {

    /**
     * Constructs a new menu with the specified label. This menu is not
     * a tear-off menu.
     * @param       label the menu's label in the menu bar, or in
     *                   another menu of which this menu is a submenu.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public Menu() throws HeadlessException {

    /**
     * Constructs a new menu with an empty label. This menu is not
     * a tear-off menu.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    boolean             isHelpMenu;

    /**
     * This field will be set to <code>true</code>
     * if the Menu in question is actually a help
     * menu.  Otherwise it will be set to <code>
     * false</code>.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    boolean             tearOff;

    /**
     * This field indicates whether the menu has the
     * tear of property or not.  It will be set to
     * <code>true</code> if the menu has the tear off
     * property and it will be set to <code>false</code>
     * if it does not.
     * A torn off menu can be deleted by a user when
     * it is no longer needed.
     *
     * @serial
     * @see #isTearOff()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    Vector<MenuComponent> items = new Vector<>();

    /**
     * A vector of the items that will be part of the Menu.
     *
     * @serial
     * @see #countItems()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
public class Menu extends MenuItem implements MenuContainer, Accessible {

/**
 * A <code>Menu</code> object is a pull-down menu component
 * that is deployed from a menu bar.
 * <p>
 * A menu can optionally be a <i>tear-off</i> menu. A tear-off menu
 * can be opened and dragged away from its parent menu bar or menu.
 * It remains on the screen after the mouse button has been released.
 * The mechanism for tearing off a menu is platform dependent, since
 * the look and feel of the tear-off menu is determined by its peer.
 * On platforms that do not support tear-off menus, the tear-off
 * property is ignored.
 * <p>
 * Each item in a menu must belong to the <code>MenuItem</code>
 * class. It can be an instance of <code>MenuItem</code>, a submenu
 * (an instance of <code>Menu</code>), or a check box (an instance of
 * <code>CheckboxMenuItem</code>).
 *
 * @author Sami Shaio
 * @see     java.awt.MenuItem
 * @see     java.awt.CheckboxMenuItem
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    protected class AccessibleAWTMenu extends AccessibleAWTMenuItem

    /**
     * Inner class of Menu used to provide default support for
     * accessibility.  This class is not meant to be used directly by
     * application developers, but is instead meant only to be
     * subclassed by menu component developers.
     * <p>
     * This class implements accessibility support for the
     * <code>Menu</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to menu user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    int getAccessibleChildIndex(MenuComponent child) {

    /**
     * Defined in MenuComponent. Overridden here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this Menu.
     * For menus, the AccessibleContext takes the form of an
     * AccessibleAWTMenu.
     * A new AccessibleAWTMenu instance is created if necessary.
     *
     * @return an AccessibleAWTMenu that serves as the
     *         AccessibleContext of this Menu
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public String paramString() {

    /**
     * Returns a string representing the state of this <code>Menu</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return the parameter string of this menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code>.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    private int menuSerializedDataVersion = 1;

    /**
     * The menu serialized Data Version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void removeAll() {

    /**
     * Removes all items from this menu.
     * @since       JDK1.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void remove(MenuComponent item) {

    /**
     * Removes the specified menu item from this menu.
     * @param  item the item to be removed from the menu.
     *         If <code>item</code> is <code>null</code>
     *         or is not in this menu, this method does
     *         nothing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void remove(int index) {

    /**
     * Removes the menu item at the specified index from this menu.
     * @param       index the position of the item to be removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void insertSeparator(int index) {

    /**
     * Inserts a separator at the specified position.
     * @param       index the position at which the
     *                       menu separator should be inserted.
     * @exception   IllegalArgumentException if the value of
     *                       <code>index</code> is less than 0.
     * @see         java.awt.Menu#addSeparator
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void addSeparator() {

    /**
     * Adds a separator line, or a hypen, to the menu at the current position.
     * @see         java.awt.Menu#insertSeparator(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void insert(String label, int index) {

    /**
     * Inserts a menu item with the specified label into this menu
     * at the specified position.  This is a convenience method for
     * <code>insert(menuItem, index)</code>.
     *
     * @param       label the text on the item
     * @param       index the position at which the menu item
     *                      should be inserted
     * @see         java.awt.Menu#add(java.lang.String)
     * @see         java.awt.Menu#add(java.awt.MenuItem)
     * @exception     IllegalArgumentException if the value of
     *                    <code>index</code> is less than zero
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void insert(MenuItem menuitem, int index) {

    /**
     * Inserts a menu item into this menu
     * at the specified position.
     *
     * @param         menuitem  the menu item to be inserted.
     * @param         index     the position at which the menu
     *                          item should be inserted.
     * @see           java.awt.Menu#add(java.lang.String)
     * @see           java.awt.Menu#add(java.awt.MenuItem)
     * @exception     IllegalArgumentException if the value of
     *                    <code>index</code> is less than zero
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void add(String label) {

    /**
     * Adds an item with the specified label to this menu.
     *
     * @param       label   the text on the item
     * @see         java.awt.Menu#insert(java.lang.String, int)
     * @see         java.awt.Menu#insert(java.awt.MenuItem, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public MenuItem add(MenuItem mi) {

    /**
     * Adds the specified menu item to this menu. If the
     * menu item has been part of another menu, removes it
     * from that menu.
     *
     * @param       mi   the menu item to be added
     * @return      the menu item added
     * @see         java.awt.Menu#insert(java.lang.String, int)
     * @see         java.awt.Menu#insert(java.awt.MenuItem, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public MenuItem getItem(int index) {

    /**
     * Gets the item located at the specified index of this menu.
     * @param     index the position of the item to be returned.
     * @return    the item located at the specified index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getItemCount()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public int getItemCount() {

    /**
      * Get the number of items in this menu.
      * @return     the number of items in this menu.
      * @since      JDK1.1
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public boolean isTearOff() {

    /**
     * Indicates whether this menu is a tear-off menu.
     * <p>
     * Tear-off functionality may not be supported by all
     * implementations of AWT.  If a particular implementation doesn't
     * support tear-off menus, this value is silently ignored.
     * @return      <code>true</code> if this is a tear-off menu;
     *                         <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void removeNotify() {

    /**
     * Removes the menu's peer.  The peer allows us to modify the appearance
     * of the menu without changing its functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public void addNotify() {

    /**
     * Creates the menu's peer.  The peer allows us to modify the
     * appearance of the menu without changing its functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    String constructComponentName() {

    /**
     * Construct a name for this MenuComponent.  Called by getName() when
     * the name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public Menu(String label, boolean tearOff) throws HeadlessException {

    /**
     * Constructs a new menu with the specified label,
     * indicating whether the menu can be torn off.
     * <p>
     * Tear-off functionality may not be supported by all
     * implementations of AWT.  If a particular implementation doesn't
     * support tear-off menus, this value is silently ignored.
     * @param       label the menu's label in the menu bar, or in
     *                   another menu of which this menu is a submenu.
     * @param       tearOff   if <code>true</code>, the menu
     *                   is a tear-off menu.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since       JDK1.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public Menu(String label) throws HeadlessException {

    /**
     * Constructs a new menu with the specified label. This menu is not
     * a tear-off menu.
     * @param       label the menu's label in the menu bar, or in
     *                   another menu of which this menu is a submenu.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    public Menu() throws HeadlessException {

    /**
     * Constructs a new menu with an empty label. This menu is not
     * a tear-off menu.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    boolean             isHelpMenu;

    /**
     * This field will be set to <code>true</code>
     * if the Menu in question is actually a help
     * menu.  Otherwise it will be set to <code>
     * false</code>.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    boolean             tearOff;

    /**
     * This field indicates whether the menu has the
     * tear of property or not.  It will be set to
     * <code>true</code> if the menu has the tear off
     * property and it will be set to <code>false</code>
     * if it does not.
     * A torn off menu can be deleted by a user when
     * it is no longer needed.
     *
     * @serial
     * @see #isTearOff()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
    Vector<MenuComponent> items = new Vector<>();

    /**
     * A vector of the items that will be part of the Menu.
     *
     * @serial
     * @see #countItems()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Menu.java
public class Menu extends MenuItem implements MenuContainer, Accessible {

/**
 * A <code>Menu</code> object is a pull-down menu component
 * that is deployed from a menu bar.
 * <p>
 * A menu can optionally be a <i>tear-off</i> menu. A tear-off menu
 * can be opened and dragged away from its parent menu bar or menu.
 * It remains on the screen after the mouse button has been released.
 * The mechanism for tearing off a menu is platform dependent, since
 * the look and feel of the tear-off menu is determined by its peer.
 * On platforms that do not support tear-off menus, the tear-off
 * property is ignored.
 * <p>
 * Each item in a menu must belong to the <code>MenuItem</code>
 * class. It can be an instance of <code>MenuItem</code>, a submenu
 * (an instance of <code>Menu</code>), or a check box (an instance of
 * <code>CheckboxMenuItem</code>).
 *
 * @author Sami Shaio
 * @see     java.awt.MenuItem
 * @see     java.awt.CheckboxMenuItem
 * @since   JDK1.0
 */
