_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void updateListBoxSelectionForEvent(MouseEvent anEvent,boolean shouldScroll) {

    /**
     * A utility method used by the event listeners.  Given a mouse event, it changes
     * the list selection to the list item below the mouse.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    private Point getPopupLocation() {

    /**
     * Calculates the upper left location of the Popup.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected Rectangle computePopupBounds(int px,int py,int pw,int ph) {

    /**
     * Calculate the placement and size of the popup portion of the combo box based
     * on the combo box location and the enclosing screen bounds. If
     * no transformations are required, then the returned rectangle will
     * have the same values as the parameters.
     *
     * @param px starting x location
     * @param py starting y location
     * @param pw starting width
     * @param ph starting height
     * @return a rectangle which represents the placement and size of the popup
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected int getPopupHeightForRowCount(int maxRowCount) {

    /**
     * Retrieves the height of the popup based on the current
     * ListCellRenderer and the maximum row count.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    private void setListSelection(int selectedIndex) {

    /**
     * Sets the list selection index to the selectedIndex. This
     * method is used to synchronize the list selection with the
     * combo box selection.
     *
     * @param selectedIndex the index to set the list
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void togglePopup() {

    /**
     * Makes the popup visible if it is hidden and makes it hidden if it is
     * visible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void delegateFocus( MouseEvent e ) {

    /**
     * This is is a utility method that helps event handlers figure out where to
     * send the focus when the popup is brought up.  The standard implementation
     * delegates the focus to the editor (if the combo box is editable) or to
     * the JComboBox if it is not editable.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this BasicComboPopup.
     * The AccessibleContext will have its parent set to the ComboBox.
     *
     * @return an AccessibleContext for the BasicComboPopup
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void autoScrollDown() {

    /**
     * This protected method is implementation specific and should be private.
     * do not call or override.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void autoScrollUp() {

    /**
     * This protected method is implementation specific and should be private.
     * do not call or override.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void stopAutoScrolling() {

    /**
     * This protected method is implementation specific and should be private.
     * do not call or override.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void startAutoScrolling( int direction ) {

    /**
     * This protected method is implementation specific and should be private.
     * do not call or override.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    public boolean isFocusTraversable() {

    /**
     * Overridden to unconditionally return false.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected class PropertyChangeHandler implements PropertyChangeListener {

    /**
     * This listener watches for bound properties that have changed in the
     * combo box.
     * <p>
     * Subclasses which wish to listen to combo box property changes should
     * call the superclass methods to ensure that the combo popup correctly
     * handles property changes.
     *
     * @see #createPropertyChangeListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected class ItemHandler implements ItemListener {

    /**
     * This listener watches for changes to the selection in the
     * combo box.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected class ListMouseMotionHandler extends MouseMotionAdapter {

    /**
     * This listener changes the selected item as you move the mouse over the list.
     * The selection change is not committed to the model, this is for user feedback only.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected class ListMouseHandler extends MouseAdapter {

    /**
     * This listener hides the popup when the mouse is released in the list.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    public class ListDataHandler implements ListDataListener {

    /**
     * As of 1.4, this class is now obsolete, doesn't do anything, and
     * is only included for backwards API compatibility. Do not call or
     * override.
     * <p>
     * The functionality has been migrated into <code>ItemHandler</code>.
     *
     * @see #createItemListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected class ListSelectionHandler implements ListSelectionListener {

    /**
     * As of Java 2 platform v 1.4, this class is now obsolete, doesn't do anything, and
     * is only included for backwards API compatibility. Do not call or
     * override.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    public class InvocationKeyHandler extends KeyAdapter {

    /**
     * As of Java 2 platform v 1.4, this class is now obsolete and is only included for
     * backwards API compatibility. Do not instantiate or subclass.
     * <p>
     * All the functionality of this class has been included in
     * BasicComboBoxUI ActionMap/InputMap methods.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected class InvocationMouseMotionHandler extends MouseMotionAdapter {

    /**
     * This listener watches for dragging and updates the current selection in the
     * list if it is dragging over the list.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
        public void mouseReleased( MouseEvent e ) {

        /**
         * Responds to the user terminating
         * a click or drag that began on the combo box.
         *
         * @param e the mouse-release event to be handled
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
        public void mousePressed( MouseEvent e ) {

        /**
         * Responds to mouse-pressed events on the combo box.
         *
         * @param e the mouse-press event to be handled
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected class InvocationMouseHandler extends MouseAdapter {

    /**
     * A listener to be registered upon the combo box
     * (<em>not</em> its popup menu)
     * to handle mouse events
     * that affect the state of the popup menu.
     * The main purpose of this listener is to make the popup menu
     * appear and disappear.
     * This listener also helps
     * with click-and-drag scenarios by setting the selection if the mouse was
     * released over the list during a drag.
     *
     * <p>
     * <strong>Warning:</strong>
     * We recommend that you <em>not</em>
     * create subclasses of this class.
     * If you absolutely must create a subclass,
     * be sure to invoke the superclass
     * version of each method.
     *
     * @see BasicComboPopup#createMouseListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void installComboBoxModelListeners( ComboBoxModel model ) {

    /**
     * Installs the listeners on the combo box model. Any listeners installed
     * on the combo box model should be removed in
     * <code>uninstallComboBoxModelListeners</code>.
     *
     * @param model The combo box model to install listeners
     * @see #uninstallComboBoxModelListeners
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void installComboBoxListeners() {

    /**
     * This method adds the necessary listeners to the JComboBox.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void configurePopup() {

    /**
     * Configures the popup portion of the combo box. This method is called
     * when the UI class is created.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void configureScroller() {

    /**
     * Configures the scrollable portion which holds the list within
     * the combo box popup. This method is called when the UI class
     * is created.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected JScrollPane createScroller() {

    /**
     * Creates the scroll pane which houses the scrollable list.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void installListListeners() {

    /**
     * Adds the listeners to the list control.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void configureList() {

    /**
     * Configures the list which is used to hold the combo box items in the
     * popup. This method is called when the UI class
     * is created.
     *
     * @see #createList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected JList createList() {

    /**
     * Creates the JList used in the popup to display
     * the items in the combo box model. This method is called when the UI class
     * is created.
     *
     * @return a <code>JList</code> used to display the combo box items
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected ItemListener createItemListener() {

    /**
     * Creates an <code>ItemListener</code> which will be added to the
     * combo box. If this method returns null then it will not
     * be added to the combo box.
     * <p>
     * Subclasses may override this method to return instances of their own
     * ItemEvent handlers.
     *
     * @return an instance of an <code>ItemListener</code> or null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected PropertyChangeListener createPropertyChangeListener() {

    /**
     * Creates a <code>PropertyChangeListener</code> which will be added to
     * the combo box. If this method returns null then it will not
     * be added to the combo box.
     *
     * @return an instance of a <code>PropertyChangeListener</code> or null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected MouseMotionListener createListMouseMotionListener() {

    /**
     * Creates a mouse motion listener that watches for mouse motion
     * events in the popup's list. If this method returns null then it will
     * not be added to the combo box.
     *
     * @return an instance of a <code>MouseMotionListener</code> or null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected MouseListener createListMouseListener() {

    /**
     * Creates a mouse listener that watches for mouse events in
     * the popup's list. If this method returns null then it will
     * not be added to the combo box.
     *
     * @return an instance of a <code>MouseListener</code> or null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected ListDataListener createListDataListener() {

    /**
     * Creates a list data listener which will be added to the
     * <code>ComboBoxModel</code>. If this method returns null then
     * it will not be added to the combo box model.
     *
     * @return an instance of a <code>ListDataListener</code> or null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected ListSelectionListener createListSelectionListener() {

    /**
     * Creates a list selection listener that watches for selection changes in
     * the popup's list.  If this method returns null then it will not
     * be added to the popup list.
     *
     * @return an instance of a <code>ListSelectionListener</code> or null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected KeyListener createKeyListener() {

    /**
     * Creates the key listener that will be added to the combo box. If
     * this method returns null then it will not be added to the combo box.
     *
     * @return a <code>KeyListener</code> or null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected MouseMotionListener createMouseMotionListener() {

    /**
     * Creates the mouse motion listener which will be added to the combo
     * box.
     *
     * <strong>Warning:</strong>
     * When overriding this method, make sure to maintain the existing
     * behavior.
     *
     * @return a <code>MouseMotionListener</code> which will be added to
     *         the combo box or null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected MouseListener createMouseListener() {

    /**
     * Creates a listener
     * that will watch for mouse-press and release events on the combo box.
     *
     * <strong>Warning:</strong>
     * When overriding this method, make sure to maintain the existing
     * behavior.
     *
     * @return a <code>MouseListener</code> which will be added to
     * the combo box or null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected void uninstallComboBoxModelListeners( ComboBoxModel model ) {

    /**
     * Removes the listeners from the combo box model
     *
     * @param model The combo box model to install listeners
     * @see #installComboBoxModelListeners
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    public void uninstallingUI() {

    /**
     * Called when the UI is uninstalling.  Since this popup isn't in the component
     * tree, it won't get it's uninstallUI() called.  It removes the listeners that
     * were added in addComboBoxListeners().
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    public KeyListener getKeyListener() {

    /**
     * Implementation of ComboPopup.getKeyListener().
     *
     * @return a <code>KeyListener</code> or null
     * @see ComboPopup#getKeyListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    public MouseMotionListener getMouseMotionListener() {

    /**
     * Implementation of ComboPopup.getMouseMotionListener().
     *
     * @return a <code>MouseMotionListener</code> or null
     * @see ComboPopup#getMouseMotionListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    public MouseListener getMouseListener() {

    /**
     * Implementation of ComboPopup.getMouseListener().
     *
     * @return a <code>MouseListener</code> or null
     * @see ComboPopup#getMouseListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    public JList getList() {

    /**
     * Implementation of ComboPopup.getList().
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    public void hide() {

    /**
     * Implementation of ComboPopup.hide().
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    public void show() {

    /**
     * Implementation of ComboPopup.show().
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected Timer                    autoscrollTimer;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected ItemListener             itemListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the create method instead
     *
     * @see #createItemListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected ListDataListener         listDataListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the create method instead
     *
     * @see #createListDataListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected PropertyChangeListener   propertyChangeListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the create method instead
     *
     * @see #createPropertyChangeListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected MouseMotionListener      listMouseMotionListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the create method instead
     *
     * @see #createListMouseMotionListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected MouseListener            listMouseListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the create method instead.
     *
     * @see #createListMouseListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected ListSelectionListener    listSelectionListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the create method instead.
     *
     * @see #createListSelectionListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected KeyListener              keyListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the accessor or create methods instead.
     *
     * @see #getKeyListener
     * @see #createKeyListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected MouseListener            mouseListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the accessor or create methods instead.
     *
     * @see #getMouseListener
     * @see #createMouseListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected MouseMotionListener      mouseMotionListener;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the accessor or create methods instead.
     *
     * @see #getMouseMotionListener
     * @see #createMouseMotionListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    private Handler handler;

    /**
     * Implementation of all the listener classes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected boolean                  valueIsAdjusting = false;

    /**
     * As of Java 2 platform v1.4 this previously undocumented field is no
     * longer used.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected JScrollPane              scroller;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the create method instead
     *
     * @see #createScroller
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
    protected JList                    list;

    /**
     * This protected field is implementation specific. Do not access directly
     * or override. Use the accessor methods instead.
     *
     * @see #getList
     * @see #createList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicComboPopup.java
public class BasicComboPopup extends JPopupMenu implements ComboPopup {

/**
 * This is a basic implementation of the <code>ComboPopup</code> interface.
 *
 * This class represents the ui for the popup portion of the combo box.
 * <p>
 * All event handling is handled by listener classes created with the
 * <code>createxxxListener()</code> methods and internal classes.
 * You can change the behavior of this class by overriding the
 * <code>createxxxListener()</code> methods and supplying your own
 * event listeners or subclassing from the ones supplied in this class.
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
 * @author Tom Santos
 * @author Mark Davidson
 */
