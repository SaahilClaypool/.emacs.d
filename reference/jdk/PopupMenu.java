_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    protected class AccessibleAWTPopupMenu extends AccessibleAWTMenu

    /**
     * Inner class of PopupMenu used to provide default support for
     * accessibility.  This class is not meant to be used directly by
     * application developers, but is instead meant only to be
     * subclassed by menu component developers.
     * <p>
     * The class used to obtain the accessible role for this object.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> associated with this
     * <code>PopupMenu</code>.
     *
     * @return the <code>AccessibleContext</code> of this
     *                <code>PopupMenu</code>
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    public void show(Component origin, int x, int y) {

   /**
     * Shows the popup menu at the x, y position relative to an origin
     * component.
     * The origin component must be contained within the component
     * hierarchy of the popup menu's parent.  Both the origin and the parent
     * must be showing on the screen for this method to be valid.
     * <p>
     * If this <code>PopupMenu</code> is being used as a <code>Menu</code>
     * (i.e., it has a non-<code>Component</code> parent),
     * then you cannot call this method on the <code>PopupMenu</code>.
     *
     * @param origin the component which defines the coordinate space
     * @param x the x coordinate position to popup the menu
     * @param y the y coordinate position to popup the menu
     * @exception NullPointerException  if the parent is <code>null</code>
     * @exception IllegalArgumentException  if this <code>PopupMenu</code>
     *                has a non-<code>Component</code> parent
     * @exception IllegalArgumentException if the origin is not in the
     *                parent's hierarchy
     * @exception RuntimeException if the parent is not showing on screen
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    public void addNotify() {

    /**
     * Creates the popup menu's peer.
     * The peer allows us to change the appearance of the popup menu without
     * changing any of the popup menu's functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    String constructComponentName() {

    /**
     * Constructs a name for this <code>MenuComponent</code>.
     * Called by <code>getName</code> when the name is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    public MenuContainer getParent() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    public PopupMenu(String label) throws HeadlessException {

    /**
     * Creates a new popup menu with the specified name.
     *
     * @param label a non-<code>null</code> string specifying
     *                the popup menu's label
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    public PopupMenu() throws HeadlessException {

    /**
     * Creates a new popup menu with an empty name.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
public class PopupMenu extends Menu {

/**
 * A class that implements a menu which can be dynamically popped up
 * at a specified position within a component.
 * <p>
 * As the inheritance hierarchy implies, a <code>PopupMenu</code>
 *  can be used anywhere a <code>Menu</code> can be used.
 * However, if you use a <code>PopupMenu</code> like a <code>Menu</code>
 * (e.g., you add it to a <code>MenuBar</code>), then you <b>cannot</b>
 * call <code>show</code> on that <code>PopupMenu</code>.
 *
 * @author      Amy Fowler
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    protected class AccessibleAWTPopupMenu extends AccessibleAWTMenu

    /**
     * Inner class of PopupMenu used to provide default support for
     * accessibility.  This class is not meant to be used directly by
     * application developers, but is instead meant only to be
     * subclassed by menu component developers.
     * <p>
     * The class used to obtain the accessible role for this object.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> associated with this
     * <code>PopupMenu</code>.
     *
     * @return the <code>AccessibleContext</code> of this
     *                <code>PopupMenu</code>
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    public void show(Component origin, int x, int y) {

   /**
     * Shows the popup menu at the x, y position relative to an origin
     * component.
     * The origin component must be contained within the component
     * hierarchy of the popup menu's parent.  Both the origin and the parent
     * must be showing on the screen for this method to be valid.
     * <p>
     * If this <code>PopupMenu</code> is being used as a <code>Menu</code>
     * (i.e., it has a non-<code>Component</code> parent),
     * then you cannot call this method on the <code>PopupMenu</code>.
     *
     * @param origin the component which defines the coordinate space
     * @param x the x coordinate position to popup the menu
     * @param y the y coordinate position to popup the menu
     * @exception NullPointerException  if the parent is <code>null</code>
     * @exception IllegalArgumentException  if this <code>PopupMenu</code>
     *                has a non-<code>Component</code> parent
     * @exception IllegalArgumentException if the origin is not in the
     *                parent's hierarchy
     * @exception RuntimeException if the parent is not showing on screen
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    public void addNotify() {

    /**
     * Creates the popup menu's peer.
     * The peer allows us to change the appearance of the popup menu without
     * changing any of the popup menu's functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    String constructComponentName() {

    /**
     * Constructs a name for this <code>MenuComponent</code>.
     * Called by <code>getName</code> when the name is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    public MenuContainer getParent() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    public PopupMenu(String label) throws HeadlessException {

    /**
     * Creates a new popup menu with the specified name.
     *
     * @param label a non-<code>null</code> string specifying
     *                the popup menu's label
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
    public PopupMenu() throws HeadlessException {

    /**
     * Creates a new popup menu with an empty name.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PopupMenu.java
public class PopupMenu extends Menu {

/**
 * A class that implements a menu which can be dynamically popped up
 * at a specified position within a component.
 * <p>
 * As the inheritance hierarchy implies, a <code>PopupMenu</code>
 *  can be used anywhere a <code>Menu</code> can be used.
 * However, if you use a <code>PopupMenu</code> like a <code>Menu</code>
 * (e.g., you add it to a <code>MenuBar</code>), then you <b>cannot</b>
 * call <code>show</code> on that <code>PopupMenu</code>.
 *
 * @author      Amy Fowler
 */
