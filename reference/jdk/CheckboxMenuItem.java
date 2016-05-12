_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public Number getMaximumAccessibleValue() {

        /**
         * Get the maximum value of this object as a Number.
         *
         * @return Maximum value of the object; null if this object does not
         * have a maximum value
         * @see #getMinimumAccessibleValue
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public Number getMinimumAccessibleValue() {

        /**
         * Get the minimum value of this object as a Number.
         *
         * @return Minimum value of the object; null if this object does not
         * have a minimum value
         * @see #getMaximumAccessibleValue
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public boolean setCurrentAccessibleValue(Number n) {

        /**
         * Set the value of this object as a Number.
         *
         * @return true if the value was set; otherwise false
         * @see #getCurrentAccessibleValue
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public Number getCurrentAccessibleValue() {

        /**
         * Get the value of this object as a Number.  If the value has not been
         * set, the return value will be null.
         *
         * @return value of the object
         * @see #setCurrentAccessibleValue
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public boolean doAccessibleAction(int i) {

        /**
         * Perform the specified Action on the object
         *
         * @param i zero-based index of actions
         * @return true if the action was performed; otherwise false.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public String getAccessibleActionDescription(int i) {

        /**
         * Return a description of the specified action of the object.
         *
         * @param i zero-based index of the actions
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public int getAccessibleActionCount() {

        /**
         * Returns the number of Actions available in this object.
         * If there is more than one, the first one is the "default"
         * action.
         *
         * @return the number of Actions in this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public AccessibleValue getAccessibleValue() {

        /**
         * Get the AccessibleValue associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleValue interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public AccessibleAction getAccessibleAction() {

        /**
         * Get the AccessibleAction associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleAction interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    protected class AccessibleAWTCheckboxMenuItem extends AccessibleAWTMenuItem

    /**
     * Inner class of CheckboxMenuItem used to provide default support for
     * accessibility.  This class is not meant to be used directly by
     * application developers, but is instead meant only to be
     * subclassed by menu component developers.
     * <p>
     * This class implements accessibility support for the
     * <code>CheckboxMenuItem</code> class.  It provides an implementation
     * of the Java Accessibility API appropriate to checkbox menu item
     * user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this CheckboxMenuItem.
     * For checkbox menu items, the AccessibleContext takes the
     * form of an AccessibleAWTCheckboxMenuItem.
     * A new AccessibleAWTCheckboxMenuItem is created if necessary.
     *
     * @return an AccessibleAWTCheckboxMenuItem that serves as the
     *         AccessibleContext of this CheckboxMenuItem
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable <code>ItemListeners</code>
     * as optional data.  The non-serializable
     * <code>ItemListeners</code> are detected and
     * no attempt is made to serialize them.
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @serialData <code>null</code> terminated sequence of
     *  0 or more pairs; the pair consists of a <code>String</code>
     *  and an <code>Object</code>; the <code>String</code> indicates
     *  the type of object and is one of the following:
     *  <code>itemListenerK</code> indicating an
     *    <code>ItemListener</code> object
     *
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see java.awt.Component#itemListenerK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public String paramString() {

    /**
     * Returns a string representing the state of this
     * <code>CheckBoxMenuItem</code>. This
     * method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return     the parameter string of this check box menu item
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    protected void processItemEvent(ItemEvent e) {

    /**
     * Processes item events occurring on this check box menu item by
     * dispatching them to any registered <code>ItemListener</code> objects.
     * <p>
     * This method is not called unless item events are
     * enabled for this menu item. Item events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>ItemListener</code> object is registered
     * via <code>addItemListener</code>.
     * <li>Item events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the item event
     * @see         java.awt.event.ItemEvent
     * @see         java.awt.event.ItemListener
     * @see         #addItemListener
     * @see         java.awt.MenuItem#enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this check box menu item.
     * If the event is an instance of <code>ItemEvent</code>,
     * this method invokes the <code>processItemEvent</code> method.
     * If the event is not an item event,
     * it invokes <code>processEvent</code> on the superclass.
     * <p>
     * Check box menu items currently support only item events.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param        e the event
     * @see          java.awt.event.ItemEvent
     * @see          #processItemEvent
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>CheckboxMenuItem</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>CheckboxMenuItem</code> <code>c</code>
     * for its item listeners with the following code:
     *
     * <pre>ItemListener[] ils = (ItemListener[])(c.getListeners(ItemListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this checkbox menuitem,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getItemListeners
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public synchronized ItemListener[] getItemListeners() {

    /**
     * Returns an array of all the item listeners
     * registered on this checkbox menuitem.
     *
     * @return all of this checkbox menuitem's <code>ItemListener</code>s
     *         or an empty array if no item
     *         listeners are currently registered
     *
     * @see           #addItemListener
     * @see           #removeItemListener
     * @see           java.awt.event.ItemEvent
     * @see           java.awt.event.ItemListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public synchronized void removeItemListener(ItemListener l) {

    /**
     * Removes the specified item listener so that it no longer receives
     * item events from this check box menu item.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param         l the item listener
     * @see           #addItemListener
     * @see           #getItemListeners
     * @see           java.awt.event.ItemEvent
     * @see           java.awt.event.ItemListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public synchronized void addItemListener(ItemListener l) {

    /**
     * Adds the specified item listener to receive item events from
     * this check box menu item.  Item events are sent in response to user
     * actions, but not in response to calls to setState().
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param         l the item listener
     * @see           #removeItemListener
     * @see           #getItemListeners
     * @see           #setState
     * @see           java.awt.event.ItemEvent
     * @see           java.awt.event.ItemListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public synchronized Object[] getSelectedObjects() {

    /**
     * Returns the an array (length 1) containing the checkbox menu item
     * label or null if the checkbox is not selected.
     * @see ItemSelectable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public synchronized void setState(boolean b) {

    /**
     * Sets this check box menu item to the specified state.
     * The boolean value <code>true</code> indicates "on" while
     * <code>false</code> indicates "off."
     *
     * <p>Note that this method should be primarily used to
     * initialize the state of the check box menu item.
     * Programmatically setting the state of the check box
     * menu item will <i>not</i> trigger
     * an <code>ItemEvent</code>.  The only way to trigger an
     * <code>ItemEvent</code> is by user interaction.
     *
     * @param      b   <code>true</code> if the check box
     *             menu item is on, otherwise <code>false</code>
     * @see        #getState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public boolean getState() {

    /**
     * Determines whether the state of this check box menu item
     * is "on" or "off."
     *
     * @return      the state of this check box menu item, where
     *                     <code>true</code> indicates "on" and
     *                     <code>false</code> indicates "off"
     * @see        #setState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public void addNotify() {

    /**
     * Creates the peer of the checkbox item.  This peer allows us to
     * change the look of the checkbox item without changing its
     * functionality.
     * Most applications do not call this method directly.
     * @see     java.awt.Toolkit#createCheckboxMenuItem(java.awt.CheckboxMenuItem)
     * @see     java.awt.Component#getToolkit()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    String constructComponentName() {

    /**
     * Construct a name for this MenuComponent.  Called by getName() when
     * the name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public CheckboxMenuItem(String label, boolean state)

    /**
     * Create a check box menu item with the specified label and state.
     * @param      label   a string label for the check box menu item,
     *                     or <code>null</code> for an unlabeled menu item.
     * @param      state   the initial state of the menu item, where
     *                     <code>true</code> indicates "on" and
     *                     <code>false</code> indicates "off."
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public CheckboxMenuItem(String label) throws HeadlessException {

    /**
     * Create a check box menu item with the specified label.
     * The item's state is initially set to "off."

     * @param     label   a string label for the check box menu item,
     *                or <code>null</code> for an unlabeled menu item.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public CheckboxMenuItem() throws HeadlessException {

    /**
     * Create a check box menu item with an empty label.
     * The item's state is initially set to "off."
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since   JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    boolean state = false;

   /**
    * The state of a checkbox menu item
    * @serial
    * @see #getState()
    * @see #setState(boolean)
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
public class CheckboxMenuItem extends MenuItem implements ItemSelectable, Accessible {

/**
 * This class represents a check box that can be included in a menu.
 * Selecting the check box in the menu changes its state from
 * "on" to "off" or from "off" to "on."
 * <p>
 * The following picture depicts a menu which contains an instance
 * of <code>CheckBoxMenuItem</code>:
 * <p>
 * <img src="doc-files/MenuBar-1.gif"
 * alt="Menu labeled Examples, containing items Basic, Simple, Check, and More Examples. The Check item is a CheckBoxMenuItem instance, in the off state."
 * style="float:center; margin: 7px 10px;">
 * <p>
 * The item labeled <code>Check</code> shows a check box menu item
 * in its "off" state.
 * <p>
 * When a check box menu item is selected, AWT sends an item event to
 * the item. Since the event is an instance of <code>ItemEvent</code>,
 * the <code>processEvent</code> method examines the event and passes
 * it along to <code>processItemEvent</code>. The latter method redirects
 * the event to any <code>ItemListener</code> objects that have
 * registered an interest in item events generated by this menu item.
 *
 * @author      Sami Shaio
 * @see         java.awt.event.ItemEvent
 * @see         java.awt.event.ItemListener
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public Number getMaximumAccessibleValue() {

        /**
         * Get the maximum value of this object as a Number.
         *
         * @return Maximum value of the object; null if this object does not
         * have a maximum value
         * @see #getMinimumAccessibleValue
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public Number getMinimumAccessibleValue() {

        /**
         * Get the minimum value of this object as a Number.
         *
         * @return Minimum value of the object; null if this object does not
         * have a minimum value
         * @see #getMaximumAccessibleValue
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public boolean setCurrentAccessibleValue(Number n) {

        /**
         * Set the value of this object as a Number.
         *
         * @return true if the value was set; otherwise false
         * @see #getCurrentAccessibleValue
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public Number getCurrentAccessibleValue() {

        /**
         * Get the value of this object as a Number.  If the value has not been
         * set, the return value will be null.
         *
         * @return value of the object
         * @see #setCurrentAccessibleValue
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public boolean doAccessibleAction(int i) {

        /**
         * Perform the specified Action on the object
         *
         * @param i zero-based index of actions
         * @return true if the action was performed; otherwise false.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public String getAccessibleActionDescription(int i) {

        /**
         * Return a description of the specified action of the object.
         *
         * @param i zero-based index of the actions
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public int getAccessibleActionCount() {

        /**
         * Returns the number of Actions available in this object.
         * If there is more than one, the first one is the "default"
         * action.
         *
         * @return the number of Actions in this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public AccessibleValue getAccessibleValue() {

        /**
         * Get the AccessibleValue associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleValue interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
        public AccessibleAction getAccessibleAction() {

        /**
         * Get the AccessibleAction associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleAction interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    protected class AccessibleAWTCheckboxMenuItem extends AccessibleAWTMenuItem

    /**
     * Inner class of CheckboxMenuItem used to provide default support for
     * accessibility.  This class is not meant to be used directly by
     * application developers, but is instead meant only to be
     * subclassed by menu component developers.
     * <p>
     * This class implements accessibility support for the
     * <code>CheckboxMenuItem</code> class.  It provides an implementation
     * of the Java Accessibility API appropriate to checkbox menu item
     * user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this CheckboxMenuItem.
     * For checkbox menu items, the AccessibleContext takes the
     * form of an AccessibleAWTCheckboxMenuItem.
     * A new AccessibleAWTCheckboxMenuItem is created if necessary.
     *
     * @return an AccessibleAWTCheckboxMenuItem that serves as the
     *         AccessibleContext of this CheckboxMenuItem
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable <code>ItemListeners</code>
     * as optional data.  The non-serializable
     * <code>ItemListeners</code> are detected and
     * no attempt is made to serialize them.
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @serialData <code>null</code> terminated sequence of
     *  0 or more pairs; the pair consists of a <code>String</code>
     *  and an <code>Object</code>; the <code>String</code> indicates
     *  the type of object and is one of the following:
     *  <code>itemListenerK</code> indicating an
     *    <code>ItemListener</code> object
     *
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see java.awt.Component#itemListenerK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public String paramString() {

    /**
     * Returns a string representing the state of this
     * <code>CheckBoxMenuItem</code>. This
     * method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return     the parameter string of this check box menu item
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    protected void processItemEvent(ItemEvent e) {

    /**
     * Processes item events occurring on this check box menu item by
     * dispatching them to any registered <code>ItemListener</code> objects.
     * <p>
     * This method is not called unless item events are
     * enabled for this menu item. Item events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>ItemListener</code> object is registered
     * via <code>addItemListener</code>.
     * <li>Item events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the item event
     * @see         java.awt.event.ItemEvent
     * @see         java.awt.event.ItemListener
     * @see         #addItemListener
     * @see         java.awt.MenuItem#enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this check box menu item.
     * If the event is an instance of <code>ItemEvent</code>,
     * this method invokes the <code>processItemEvent</code> method.
     * If the event is not an item event,
     * it invokes <code>processEvent</code> on the superclass.
     * <p>
     * Check box menu items currently support only item events.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param        e the event
     * @see          java.awt.event.ItemEvent
     * @see          #processItemEvent
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>CheckboxMenuItem</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>CheckboxMenuItem</code> <code>c</code>
     * for its item listeners with the following code:
     *
     * <pre>ItemListener[] ils = (ItemListener[])(c.getListeners(ItemListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this checkbox menuitem,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getItemListeners
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public synchronized ItemListener[] getItemListeners() {

    /**
     * Returns an array of all the item listeners
     * registered on this checkbox menuitem.
     *
     * @return all of this checkbox menuitem's <code>ItemListener</code>s
     *         or an empty array if no item
     *         listeners are currently registered
     *
     * @see           #addItemListener
     * @see           #removeItemListener
     * @see           java.awt.event.ItemEvent
     * @see           java.awt.event.ItemListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public synchronized void removeItemListener(ItemListener l) {

    /**
     * Removes the specified item listener so that it no longer receives
     * item events from this check box menu item.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param         l the item listener
     * @see           #addItemListener
     * @see           #getItemListeners
     * @see           java.awt.event.ItemEvent
     * @see           java.awt.event.ItemListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public synchronized void addItemListener(ItemListener l) {

    /**
     * Adds the specified item listener to receive item events from
     * this check box menu item.  Item events are sent in response to user
     * actions, but not in response to calls to setState().
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param         l the item listener
     * @see           #removeItemListener
     * @see           #getItemListeners
     * @see           #setState
     * @see           java.awt.event.ItemEvent
     * @see           java.awt.event.ItemListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public synchronized Object[] getSelectedObjects() {

    /**
     * Returns the an array (length 1) containing the checkbox menu item
     * label or null if the checkbox is not selected.
     * @see ItemSelectable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public synchronized void setState(boolean b) {

    /**
     * Sets this check box menu item to the specified state.
     * The boolean value <code>true</code> indicates "on" while
     * <code>false</code> indicates "off."
     *
     * <p>Note that this method should be primarily used to
     * initialize the state of the check box menu item.
     * Programmatically setting the state of the check box
     * menu item will <i>not</i> trigger
     * an <code>ItemEvent</code>.  The only way to trigger an
     * <code>ItemEvent</code> is by user interaction.
     *
     * @param      b   <code>true</code> if the check box
     *             menu item is on, otherwise <code>false</code>
     * @see        #getState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public boolean getState() {

    /**
     * Determines whether the state of this check box menu item
     * is "on" or "off."
     *
     * @return      the state of this check box menu item, where
     *                     <code>true</code> indicates "on" and
     *                     <code>false</code> indicates "off"
     * @see        #setState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public void addNotify() {

    /**
     * Creates the peer of the checkbox item.  This peer allows us to
     * change the look of the checkbox item without changing its
     * functionality.
     * Most applications do not call this method directly.
     * @see     java.awt.Toolkit#createCheckboxMenuItem(java.awt.CheckboxMenuItem)
     * @see     java.awt.Component#getToolkit()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    String constructComponentName() {

    /**
     * Construct a name for this MenuComponent.  Called by getName() when
     * the name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public CheckboxMenuItem(String label, boolean state)

    /**
     * Create a check box menu item with the specified label and state.
     * @param      label   a string label for the check box menu item,
     *                     or <code>null</code> for an unlabeled menu item.
     * @param      state   the initial state of the menu item, where
     *                     <code>true</code> indicates "on" and
     *                     <code>false</code> indicates "off."
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public CheckboxMenuItem(String label) throws HeadlessException {

    /**
     * Create a check box menu item with the specified label.
     * The item's state is initially set to "off."

     * @param     label   a string label for the check box menu item,
     *                or <code>null</code> for an unlabeled menu item.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    public CheckboxMenuItem() throws HeadlessException {

    /**
     * Create a check box menu item with an empty label.
     * The item's state is initially set to "off."
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since   JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
    boolean state = false;

   /**
    * The state of a checkbox menu item
    * @serial
    * @see #getState()
    * @see #setState(boolean)
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CheckboxMenuItem.java
public class CheckboxMenuItem extends MenuItem implements ItemSelectable, Accessible {

/**
 * This class represents a check box that can be included in a menu.
 * Selecting the check box in the menu changes its state from
 * "on" to "off" or from "off" to "on."
 * <p>
 * The following picture depicts a menu which contains an instance
 * of <code>CheckBoxMenuItem</code>:
 * <p>
 * <img src="doc-files/MenuBar-1.gif"
 * alt="Menu labeled Examples, containing items Basic, Simple, Check, and More Examples. The Check item is a CheckBoxMenuItem instance, in the off state."
 * style="float:center; margin: 7px 10px;">
 * <p>
 * The item labeled <code>Check</code> shows a check box menu item
 * in its "off" state.
 * <p>
 * When a check box menu item is selected, AWT sends an item event to
 * the item. Since the event is an instance of <code>ItemEvent</code>,
 * the <code>processEvent</code> method examines the event and passes
 * it along to <code>processItemEvent</code>. The latter method redirects
 * the event to any <code>ItemListener</code> objects that have
 * registered an interest in item events generated by this menu item.
 *
 * @author      Sami Shaio
 * @see         java.awt.event.ItemEvent
 * @see         java.awt.event.ItemListener
 * @since       JDK1.0
 */
