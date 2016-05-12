_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
    public boolean isComponentPartOfCurrentMenu(Component c) {

    /**
     * Return true if c is part of the currently used menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
    public void processKeyEvent(KeyEvent e) {

    /**
     * When a MenuElement receives an event from a KeyListener, it should never process the event
     * directly. Instead all MenuElements should call this method with the event.
     *
     * @param e  a KeyEvent object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
                if (p.x >= 0 && p.x < cWidth && p.y >= 0 && p.y < cHeight) {

                /** Return the deepest component on the selection
                 *  path in whose bounds the event's point occurs
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
    public Component componentForPoint(Component source, Point sourcePoint) {

    /**
     * Returns the component in the currently selected path
     * which contains sourcePoint.
     *
     * @param source The component in whose coordinate space sourcePoint
     *        is given
     * @param sourcePoint The point which is being tested
     * @return The component in the currently selected path which
     *         contains sourcePoint (relative to the source component's
     *         coordinate space.  If sourcePoint is not inside a component
     *         on the currently selected path, null is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
                if(
                   (p.x >= 0 && p.x < cWidth && p.y >= 0 && p.y < cHeight)) {

                /** Send the event to visible menu element if menu element currently in
                 *  the selected path or contains the event location
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
    public void processMouseEvent(MouseEvent event) {

    /**
     * When a MenuElement receives an event from a MouseListener, it should never process the event
     * directly. Instead all MenuElements should call this method with the event.
     *
     * @param event  a MouseEvent object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
    protected void fireStateChanged() {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is created lazily.
     *
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
    public ChangeListener[] getChangeListeners() {

    /**
     * Returns an array of all the <code>ChangeListener</code>s added
     * to this MenuSelectionManager with addChangeListener().
     *
     * @return all of the <code>ChangeListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
    public void removeChangeListener(ChangeListener l) {

    /**
     * Removes a ChangeListener from the button.
     *
     * @param l the listener to remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
    public void addChangeListener(ChangeListener l) {

    /**
     * Adds a ChangeListener to the button.
     *
     * @param l the listener to add
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
    public void clearSelectedPath() {

    /**
     * Tell the menu selection to close and unselect all the menu components. Call this method
     * when a choice has been made
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
    public MenuElement[] getSelectedPath() {

    /**
     * Returns the path to the currently selected menu item
     *
     * @return an array of MenuElement objects representing the selected path
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
    public void setSelectedPath(MenuElement[] path) {

    /**
     * Changes the selection in the menu hierarchy.  The elements
     * in the array are sorted in order from the root menu
     * element to the currently selected menu element.
     * <p>
     * Note that this method is public but is used by the look and
     * feel engine and should not be called by client applications.
     *
     * @param path  an array of <code>MenuElement</code> objects specifying
     *        the selected path
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
    protected transient ChangeEvent changeEvent = null;

    /**
     * Only one ChangeEvent is needed per button model instance since the
     * event's only state is the source property.  The source of events
     * generated is always "this".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
    public static MenuSelectionManager defaultManager() {

    /**
     * Returns the default menu selection manager.
     *
     * @return a MenuSelectionManager object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/MenuSelectionManager.java
public class MenuSelectionManager {

/**
 * A MenuSelectionManager owns the selection in menu hierarchy.
 *
 * @author Arnaud Weber
 */
