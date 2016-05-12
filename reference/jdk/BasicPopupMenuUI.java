_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicPopupMenuUI.java
        JPopupMenu getActivePopup(MenuElement[] path) {

        /**
         * Return the last JPopupMenu in <code>path</code>,
         * or <code>null</code> if none found
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicPopupMenuUI.java
    static class MenuKeyboardHelper

    /**
     * This helper is added to MenuSelectionManager as a ChangeListener to
     * listen to menu selection changes. When a menu is activated, it passes
     * focus to its parent JRootPane, and installs an ActionMap/InputMap pair
     * on that JRootPane. Those maps are necessary in order for menu
     * navigation to work. When menu is being deactivated, it restores focus
     * to the component that has had it before menu activation, and uninstalls
     * the maps.
     * This helper is also installed as a KeyListener on root pane when menu
     * is active. It forwards key events to MenuSelectionManager for mnemonic
     * keys handling.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicPopupMenuUI.java
    private class BasicMenuKeyListener implements MenuKeyListener {

    /**
     * Handles mnemonic for children JMenuItems.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicPopupMenuUI.java
    private class BasicPopupMenuListener implements PopupMenuListener {

    /**
     * This Listener fires the Action that provides the correct auditory
     * feedback.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicPopupMenuUI.java
public class BasicPopupMenuUI extends PopupMenuUI {

/**
 * A Windows L&amp;F implementation of PopupMenuUI.  This implementation
 * is a "combined" view/controller.
 *
 * @author Georges Saab
 * @author David Karlton
 * @author Arnaud Weber
 */
