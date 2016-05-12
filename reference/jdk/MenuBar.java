_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    protected class AccessibleAWTMenuBar extends AccessibleAWTMenuComponent

    /**
     * Inner class of MenuBar used to provide default support for
     * accessibility.  This class is not meant to be used directly by
     * application developers, but is instead meant only to be
     * subclassed by menu component developers.
     * <p>
     * This class implements accessibility support for the
     * <code>MenuBar</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to menu bar user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    int getAccessibleChildIndex(MenuComponent child) {

    /**
     * Defined in MenuComponent. Overridden here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this MenuBar.
     * For menu bars, the AccessibleContext takes the form of an
     * AccessibleAWTMenuBar.
     * A new AccessibleAWTMenuBar instance is created if necessary.
     *
     * @return an AccessibleAWTMenuBar that serves as the
     *         AccessibleContext of this MenuBar
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
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
     * @see #writeObject(java.io.ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see #readObject(java.io.ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    private int menuBarSerializedDataVersion = 1;

    /**
     * The MenuBar's serialized data version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public void deleteShortcut(MenuShortcut s) {

    /**
     * Deletes the specified menu shortcut.
     * @param     s the menu shortcut to delete.
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
     public MenuItem getShortcutMenuItem(MenuShortcut s) {

    /**
     * Gets the instance of <code>MenuItem</code> associated
     * with the specified <code>MenuShortcut</code> object,
     * or <code>null</code> if none of the menu items being managed
     * by this menu bar is associated with the specified menu
     * shortcut.
     * @param        s the specified menu shortcut.
     * @see          java.awt.MenuItem
     * @see          java.awt.MenuShortcut
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public synchronized Enumeration<MenuShortcut> shortcuts() {

    /**
     * Gets an enumeration of all menu shortcuts this menu bar
     * is managing.
     * @return      an enumeration of menu shortcuts that this
     *                      menu bar is managing.
     * @see         java.awt.MenuShortcut
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public Menu getMenu(int i) {

    /**
     * Gets the specified menu.
     * @param      i the index position of the menu to be returned.
     * @return     the menu at the specified index of this menu bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMenuCount()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public int getMenuCount() {

    /**
     * Gets the number of menus on the menu bar.
     * @return     the number of menus on the menu bar.
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public void remove(MenuComponent m) {

    /**
     * Removes the specified menu component from this menu bar.
     * @param        m the menu component to be removed.
     * @see          java.awt.MenuBar#add(java.awt.Menu)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public void remove(final int index) {

    /**
     * Removes the menu located at the specified
     * index from this menu bar.
     * @param        index   the position of the menu to be removed.
     * @see          java.awt.MenuBar#add(java.awt.Menu)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public Menu add(Menu m) {

    /**
     * Adds the specified menu to the menu bar.
     * If the menu has been part of another menu bar,
     * removes it from that menu bar.
     *
     * @param        m   the menu to be added
     * @return       the menu added
     * @see          java.awt.MenuBar#remove(int)
     * @see          java.awt.MenuBar#remove(java.awt.MenuComponent)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public void setHelpMenu(final Menu m) {

    /**
     * Sets the specified menu to be this menu bar's help menu.
     * If this menu bar has an existing help menu, the old help menu is
     * removed from the menu bar, and replaced with the specified menu.
     * @param m    the menu to be set as the help menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public Menu getHelpMenu() {

    /**
     * Gets the help menu on the menu bar.
     * @return    the help menu on this menu bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public void removeNotify() {

    /**
     * Removes the menu bar's peer.  The peer allows us to change the
     * appearance of the menu bar without changing any of the menu bar's
     * functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public void addNotify() {

    /**
     * Creates the menu bar's peer.  The peer allows us to change the
     * appearance of the menu bar without changing any of the menu bar's
     * functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    String constructComponentName() {

    /**
     * Construct a name for this MenuComponent.  Called by getName() when
     * the name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public MenuBar() throws HeadlessException {

    /**
     * Creates a new menu bar.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    Menu helpMenu;

    /**
     * This menu is a special menu dedicated to
     * help.  The one thing to note about this menu
     * is that on some platforms it appears at the
     * right edge of the menubar.
     *
     * @serial
     * @see #getHelpMenu()
     * @see #setHelpMenu(Menu)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    Vector<Menu> menus = new Vector<>();

    /**
     * This field represents a vector of the
     * actual menus that will be part of the MenuBar.
     *
     * @serial
     * @see #countMenus()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
public class MenuBar extends MenuComponent implements MenuContainer, Accessible {

/**
 * The <code>MenuBar</code> class encapsulates the platform's
 * concept of a menu bar bound to a frame. In order to associate
 * the menu bar with a <code>Frame</code> object, call the
 * frame's <code>setMenuBar</code> method.
 * <p>
 * <A NAME="mbexample"></A><!-- target for cross references -->
 * This is what a menu bar might look like:
 * <p>
 * <img src="doc-files/MenuBar-1.gif"
 * alt="Diagram of MenuBar containing 2 menus: Examples and Options.
 * Examples menu is expanded showing items: Basic, Simple, Check, and More Examples."
 * style="float:center; margin: 7px 10px;">
 * <p>
 * A menu bar handles keyboard shortcuts for menu items, passing them
 * along to its child menus.
 * (Keyboard shortcuts, which are optional, provide the user with
 * an alternative to the mouse for invoking a menu item and the
 * action that is associated with it.)
 * Each menu item can maintain an instance of <code>MenuShortcut</code>.
 * The <code>MenuBar</code> class defines several methods,
 * {@link MenuBar#shortcuts} and
 * {@link MenuBar#getShortcutMenuItem}
 * that retrieve information about the shortcuts a given
 * menu bar is managing.
 *
 * @author Sami Shaio
 * @see        java.awt.Frame
 * @see        java.awt.Frame#setMenuBar(java.awt.MenuBar)
 * @see        java.awt.Menu
 * @see        java.awt.MenuItem
 * @see        java.awt.MenuShortcut
 * @since      JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    protected class AccessibleAWTMenuBar extends AccessibleAWTMenuComponent

    /**
     * Inner class of MenuBar used to provide default support for
     * accessibility.  This class is not meant to be used directly by
     * application developers, but is instead meant only to be
     * subclassed by menu component developers.
     * <p>
     * This class implements accessibility support for the
     * <code>MenuBar</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to menu bar user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    int getAccessibleChildIndex(MenuComponent child) {

    /**
     * Defined in MenuComponent. Overridden here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this MenuBar.
     * For menu bars, the AccessibleContext takes the form of an
     * AccessibleAWTMenuBar.
     * A new AccessibleAWTMenuBar instance is created if necessary.
     *
     * @return an AccessibleAWTMenuBar that serves as the
     *         AccessibleContext of this MenuBar
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
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
     * @see #writeObject(java.io.ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see #readObject(java.io.ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    private int menuBarSerializedDataVersion = 1;

    /**
     * The MenuBar's serialized data version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public void deleteShortcut(MenuShortcut s) {

    /**
     * Deletes the specified menu shortcut.
     * @param     s the menu shortcut to delete.
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
     public MenuItem getShortcutMenuItem(MenuShortcut s) {

    /**
     * Gets the instance of <code>MenuItem</code> associated
     * with the specified <code>MenuShortcut</code> object,
     * or <code>null</code> if none of the menu items being managed
     * by this menu bar is associated with the specified menu
     * shortcut.
     * @param        s the specified menu shortcut.
     * @see          java.awt.MenuItem
     * @see          java.awt.MenuShortcut
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public synchronized Enumeration<MenuShortcut> shortcuts() {

    /**
     * Gets an enumeration of all menu shortcuts this menu bar
     * is managing.
     * @return      an enumeration of menu shortcuts that this
     *                      menu bar is managing.
     * @see         java.awt.MenuShortcut
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public Menu getMenu(int i) {

    /**
     * Gets the specified menu.
     * @param      i the index position of the menu to be returned.
     * @return     the menu at the specified index of this menu bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMenuCount()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public int getMenuCount() {

    /**
     * Gets the number of menus on the menu bar.
     * @return     the number of menus on the menu bar.
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public void remove(MenuComponent m) {

    /**
     * Removes the specified menu component from this menu bar.
     * @param        m the menu component to be removed.
     * @see          java.awt.MenuBar#add(java.awt.Menu)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public void remove(final int index) {

    /**
     * Removes the menu located at the specified
     * index from this menu bar.
     * @param        index   the position of the menu to be removed.
     * @see          java.awt.MenuBar#add(java.awt.Menu)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public Menu add(Menu m) {

    /**
     * Adds the specified menu to the menu bar.
     * If the menu has been part of another menu bar,
     * removes it from that menu bar.
     *
     * @param        m   the menu to be added
     * @return       the menu added
     * @see          java.awt.MenuBar#remove(int)
     * @see          java.awt.MenuBar#remove(java.awt.MenuComponent)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public void setHelpMenu(final Menu m) {

    /**
     * Sets the specified menu to be this menu bar's help menu.
     * If this menu bar has an existing help menu, the old help menu is
     * removed from the menu bar, and replaced with the specified menu.
     * @param m    the menu to be set as the help menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public Menu getHelpMenu() {

    /**
     * Gets the help menu on the menu bar.
     * @return    the help menu on this menu bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public void removeNotify() {

    /**
     * Removes the menu bar's peer.  The peer allows us to change the
     * appearance of the menu bar without changing any of the menu bar's
     * functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public void addNotify() {

    /**
     * Creates the menu bar's peer.  The peer allows us to change the
     * appearance of the menu bar without changing any of the menu bar's
     * functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    String constructComponentName() {

    /**
     * Construct a name for this MenuComponent.  Called by getName() when
     * the name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    public MenuBar() throws HeadlessException {

    /**
     * Creates a new menu bar.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    Menu helpMenu;

    /**
     * This menu is a special menu dedicated to
     * help.  The one thing to note about this menu
     * is that on some platforms it appears at the
     * right edge of the menubar.
     *
     * @serial
     * @see #getHelpMenu()
     * @see #setHelpMenu(Menu)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
    Vector<Menu> menus = new Vector<>();

    /**
     * This field represents a vector of the
     * actual menus that will be part of the MenuBar.
     *
     * @serial
     * @see #countMenus()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuBar.java
public class MenuBar extends MenuComponent implements MenuContainer, Accessible {

/**
 * The <code>MenuBar</code> class encapsulates the platform's
 * concept of a menu bar bound to a frame. In order to associate
 * the menu bar with a <code>Frame</code> object, call the
 * frame's <code>setMenuBar</code> method.
 * <p>
 * <A NAME="mbexample"></A><!-- target for cross references -->
 * This is what a menu bar might look like:
 * <p>
 * <img src="doc-files/MenuBar-1.gif"
 * alt="Diagram of MenuBar containing 2 menus: Examples and Options.
 * Examples menu is expanded showing items: Basic, Simple, Check, and More Examples."
 * style="float:center; margin: 7px 10px;">
 * <p>
 * A menu bar handles keyboard shortcuts for menu items, passing them
 * along to its child menus.
 * (Keyboard shortcuts, which are optional, provide the user with
 * an alternative to the mouse for invoking a menu item and the
 * action that is associated with it.)
 * Each menu item can maintain an instance of <code>MenuShortcut</code>.
 * The <code>MenuBar</code> class defines several methods,
 * {@link MenuBar#shortcuts} and
 * {@link MenuBar#getShortcutMenuItem}
 * that retrieve information about the shortcuts a given
 * menu bar is managing.
 *
 * @author Sami Shaio
 * @see        java.awt.Frame
 * @see        java.awt.Frame#setMenuBar(java.awt.MenuBar)
 * @see        java.awt.Menu
 * @see        java.awt.MenuItem
 * @see        java.awt.MenuShortcut
 * @since      JDK1.0
 */
