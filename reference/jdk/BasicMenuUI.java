_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicMenuUI.java
        public void menuKeyTyped(MenuKeyEvent e) {

        /**
         * Open the Menu
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicMenuUI.java
        public void mouseDragged(MouseEvent e) {

        /**
         * Invoked when a mouse button is pressed on the menu and then dragged.
         * Delegates the mouse event to the MenuSelectionManager.
         *
         * @param e the mouse event
         * @see java.awt.event.MouseMotionListener#mouseDragged
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicMenuUI.java
        public void mouseEntered(MouseEvent e) {

        /**
         * Invoked when the cursor enters the menu. This method sets the selected
         * path for the MenuSelectionManager and handles the case
         * in which a menu item is used to pop up an additional menu, as in a
         * hierarchical menu system.
         *
         * @param e the mouse event; not used
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicMenuUI.java
        public void mouseReleased(MouseEvent e) {

        /**
         * Invoked when the mouse has been released on the menu. Delegates the
         * mouse event to the MenuSelectionManager.
         *
         * @param e the mouse event
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicMenuUI.java
        public void mousePressed(MouseEvent e) {

        /**
         * Invoked when the mouse has been clicked on the menu. This
         * method clears or sets the selection path of the
         * MenuSelectionManager.
         *
         * @param e the mouse event
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicMenuUI.java
    public class ChangeHandler implements ChangeListener {

    /**
     * As of Java 2 platform 1.4, this previously undocumented class
     * is now obsolete. KeyBindings are now managed by the popup menu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicMenuUI.java
        public void mouseDragged(MouseEvent e) {

        /**
         * Invoked when a mouse button is pressed on the menu and then dragged.
         * Delegates the mouse event to the MenuSelectionManager.
         *
         * @param e the mouse event
         * @see java.awt.event.MouseMotionListener#mouseDragged
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicMenuUI.java
        public void mouseEntered(MouseEvent e) {

        /**
         * Invoked when the cursor enters the menu. This method sets the selected
         * path for the MenuSelectionManager and handles the case
         * in which a menu item is used to pop up an additional menu, as in a
         * hierarchical menu system.
         *
         * @param e the mouse event; not used
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicMenuUI.java
        public void mouseReleased(MouseEvent e) {

        /**
         * Invoked when the mouse has been released on the menu. Delegates the
         * mouse event to the MenuSelectionManager.
         *
         * @param e the mouse event
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicMenuUI.java
        public void mousePressed(MouseEvent e) {

        /**
         * Invoked when the mouse has been clicked on the menu. This
         * method clears or sets the selection path of the
         * MenuSelectionManager.
         *
         * @param e the mouse event
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicMenuUI.java
    protected class MouseInputHandler implements MouseInputListener {

    /**
     * Instantiated and used by a menu item to handle the current menu selection
     * from mouse events. A MouseInputHandler processes and forwards all mouse events
     * to a shared instance of the MenuSelectionManager.
     * <p>
     * This class is protected so that it can be subclassed by other look and
     * feels to implement their own mouse handling behavior. All overridden
     * methods should call the parent methods so that the menu selection
     * is correct.
     *
     * @see javax.swing.MenuSelectionManager
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicMenuUI.java
    private InputMap selectedWindowInputMap;

    /** Uses as the parent of the windowInputMap when selected. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicMenuUI.java
public class BasicMenuUI extends BasicMenuItemUI

/**
 * A default L&amp;F implementation of MenuUI.  This implementation
 * is a "combined" view/controller.
 *
 * @author Georges Saab
 * @author David Karlton
 * @author Arnaud Weber
 */
