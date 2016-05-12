_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
        public boolean doAccessibleAction(int i) {

        /**
         * Perform the specified Action on the object
         *
         * @param i zero-based index of actions
         * @return true if the action was performed; otherwise false.
         * @see #getAccessibleActionCount
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
        public String getAccessibleActionDescription(int i) {

        /**
         * Returns a description of the specified action of the object.
         *
         * @param i zero-based index of the actions
         * @return a String description of the action
         * @see #getAccessibleActionCount
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
        public int getAccessibleActionCount() {

        /**
         * Returns the number of accessible actions available in this object
         * If there are more than one, the first one is considered the "default"
         * action of the object.
         *
         * @return the zero-based number of Actions in this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
        public AccessibleAction getAccessibleAction() {

        /**
         * Get the AccessibleAction associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleAction interface on behalf of itself.
         *
         * @return this object
         * @see AccessibleAction
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    protected class AccessibleAWTChoice extends AccessibleAWTComponent

    /**
     * This class implements accessibility support for the
     * <code>Choice</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to choice user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> associated with this
     * <code>Choice</code>. For <code>Choice</code> components,
     * the <code>AccessibleContext</code> takes the form of an
     * <code>AccessibleAWTChoice</code>. A new <code>AccessibleAWTChoice</code>
     * instance is created if necessary.
     *
     * @return an <code>AccessibleAWTChoice</code> that serves as the
     *         <code>AccessibleContext</code> of this <code>Choice</code>
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code> and if it
     * isn't <code>null</code> adds a listener to receive
     * item events fired by the <code>Choice</code> item.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @serial
     * @see #removeItemListener(ItemListener)
     * @see #addItemListener(ItemListener)
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable <code>ItemListeners</code>
     * as optional data. The non-serializable
     * <code>ItemListeners</code> are detected and
     * no attempt is made to serialize them.
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @serialData <code>null</code> terminated sequence of 0
     *   or more pairs; the pair consists of a <code>String</code>
     *   and an <code>Object</code>; the <code>String</code> indicates
     *   the type of object and is one of the following:
     *   <code>itemListenerK</code> indicating an
     *     <code>ItemListener</code> object
     *
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see java.awt.Component#itemListenerK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>Choice</code>
     * menu. This method is intended to be used only for debugging purposes,
     * and the content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return    the parameter string of this <code>Choice</code> menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    protected void processItemEvent(ItemEvent e) {

    /**
     * Processes item events occurring on this <code>Choice</code>
     * menu by dispatching them to any registered
     * <code>ItemListener</code> objects.
     * <p>
     * This method is not called unless item events are
     * enabled for this component. Item events are enabled
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
     * @see         #addItemListener(ItemListener)
     * @see         java.awt.Component#enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this choice. If the event is an
     * instance of <code>ItemEvent</code>, it invokes the
     * <code>processItemEvent</code> method. Otherwise, it calls its
     * superclass's <code>processEvent</code> method.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param      e the event
     * @see        java.awt.event.ItemEvent
     * @see        #processItemEvent
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>Choice</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>Choice</code> <code>c</code>
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
     *          <code><em>Foo</em>Listener</code>s on this choice,
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized ItemListener[] getItemListeners() {

    /**
     * Returns an array of all the item listeners
     * registered on this choice.
     *
     * @return all of this choice's <code>ItemListener</code>s
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized void removeItemListener(ItemListener l) {

    /**
     * Removes the specified item listener so that it no longer receives
     * item events from this <code>Choice</code> menu.
     * If l is <code>null</code>, no exception is thrown and no
     * action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     * @param         l    the item listener
     * @see           #addItemListener
     * @see           #getItemListeners
     * @see           java.awt.event.ItemEvent
     * @see           java.awt.event.ItemListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized void addItemListener(ItemListener l) {

    /**
     * Adds the specified item listener to receive item events from
     * this <code>Choice</code> menu.  Item events are sent in response
     * to user input, but not in response to calls to <code>select</code>.
     * If l is <code>null</code>, no exception is thrown and no action
     * is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     * @param         l    the item listener
     * @see           #removeItemListener
     * @see           #getItemListeners
     * @see           #select
     * @see           java.awt.event.ItemEvent
     * @see           java.awt.event.ItemListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized void select(String str) {

    /**
     * Sets the selected item in this <code>Choice</code> menu
     * to be the item whose name is equal to the specified string.
     * If more than one item matches (is equal to) the specified string,
     * the one with the smallest index is selected.
     *
     * <p>Note that this method should be primarily used to
     * initially select an item in this component.
     * Programmatically calling this method will <i>not</i> trigger
     * an <code>ItemEvent</code>.  The only way to trigger an
     * <code>ItemEvent</code> is by user interaction.
     *
     * @param       str     the specified string
     * @see         #getSelectedItem
     * @see         #getSelectedIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized void select(int pos) {

    /**
     * Sets the selected item in this <code>Choice</code> menu to be the
     * item at the specified position.
     *
     * <p>Note that this method should be primarily used to
     * initially select an item in this component.
     * Programmatically calling this method will <i>not</i> trigger
     * an <code>ItemEvent</code>.  The only way to trigger an
     * <code>ItemEvent</code> is by user interaction.
     *
     * @param      pos      the position of the selected item
     * @exception  IllegalArgumentException if the specified
     *                            position is greater than the
     *                            number of items or less than zero
     * @see        #getSelectedItem
     * @see        #getSelectedIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public int getSelectedIndex() {

    /**
     * Returns the index of the currently selected item.
     * If nothing is selected, returns -1.
     *
     * @return the index of the currently selected item, or -1 if nothing
     *  is currently selected
     * @see #getSelectedItem
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized Object[] getSelectedObjects() {

    /**
     * Returns an array (length 1) containing the currently selected
     * item.  If this choice has no items, returns <code>null</code>.
     * @see ItemSelectable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized String getSelectedItem() {

    /**
     * Gets a representation of the current choice as a string.
     * @return    a string representation of the currently
     *                     selected item in this choice menu
     * @see       #getSelectedIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void removeAll() {

    /**
     * Removes all items from the choice menu.
     * @see       #remove
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    private void removeNoInvalidate(int position) {

    /**
     * Removes an item from the <code>Choice</code> at the
     * specified position, but does not invalidate the <code>Choice</code>.
     * Client methods must provide their
     * own synchronization before invoking this method.
     * @param      position   the position of the item
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void remove(int position) {

    /**
     * Removes an item from the choice menu
     * at the specified position.  If the item
     * being removed is the currently selected item,
     * then the first item in the choice becomes the
     * selected item.  Otherwise, the currently selected
     * item remains selected (and the selected index is
     * updated accordingly).
     * @param      position the position of the item
     * @throws IndexOutOfBoundsException if the specified
     *          position is out of bounds
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void remove(String item) {

    /**
     * Removes the first occurrence of <code>item</code>
     * from the <code>Choice</code> menu.  If the item
     * being removed is the currently selected item,
     * then the first item in the choice becomes the
     * selected item.  Otherwise, the currently selected
     * item remains selected (and the selected index is
     * updated accordingly).
     * @param      item  the item to remove from this <code>Choice</code> menu
     * @exception  IllegalArgumentException  if the item doesn't
     *                     exist in the choice menu
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void insert(String item, int index) {

    /**
     * Inserts the item into this choice at the specified position.
     * Existing items at an index greater than or equal to
     * <code>index</code> are shifted up by one to accommodate
     * the new item.  If <code>index</code> is greater than or
     * equal to the number of items in this choice,
     * <code>item</code> is added to the end of this choice.
     * <p>
     * If the item is the first one being added to the choice,
     * then the item becomes selected.  Otherwise, if the
     * selected item was one of the items shifted, the first
     * item in the choice becomes the selected item.  If the
     * selected item was no among those shifted, it remains
     * the selected item.
     * @param item the non-<code>null</code> item to be inserted
     * @param index the position at which the item should be inserted
     * @exception IllegalArgumentException if index is less than 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    private void insertNoInvalidate(String item, int index) {

    /**
     * Inserts an item to this <code>Choice</code>,
     * but does not invalidate the <code>Choice</code>.
     * Client methods must provide their own synchronization before
     * invoking this method.
     * @param item the item to be added
     * @param index the new item position
     * @exception NullPointerException if the item's value is equal to
     *          <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void addItem(String item) {

    /**
     * Obsolete as of Java 2 platform v1.1.  Please use the
     * <code>add</code> method instead.
     * <p>
     * Adds an item to this <code>Choice</code> menu.
     * @param item the item to be added
     * @exception NullPointerException if the item's value is equal to
     *          <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void add(String item) {

    /**
     * Adds an item to this <code>Choice</code> menu.
     * @param      item    the item to be added
     * @exception  NullPointerException   if the item's value is
     *                  <code>null</code>
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public String getItem(int index) {

    /**
     * Gets the string at the specified index in this
     * <code>Choice</code> menu.
     * @param      index the index at which to begin
     * @see        #getItemCount
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getItemCount()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public int getItemCount() {

    /**
     * Returns the number of items in this <code>Choice</code> menu.
     * @return the number of items in this <code>Choice</code> menu
     * @see     #getItem
     * @since   JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void addNotify() {

    /**
     * Creates the <code>Choice</code>'s peer.  This peer allows us
     * to change the look
     * of the <code>Choice</code> without changing its functionality.
     * @see     java.awt.Toolkit#createChoice(java.awt.Choice)
     * @see     java.awt.Component#getToolkit()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    String constructComponentName() {

    /**
     * Constructs a name for this component.  Called by
     * <code>getName</code> when the name is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public Choice() throws HeadlessException {

    /**
     * Creates a new choice menu. The menu initially has no items in it.
     * <p>
     * By default, the first item added to the choice menu becomes the
     * selected item, until a different selection is made by the user
     * by calling one of the <code>select</code> methods.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true
     * @see       java.awt.GraphicsEnvironment#isHeadless
     * @see       #select(int)
     * @see       #select(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    int selectedIndex = -1;

    /**
     * The index of the current choice for this <code>Choice</code>
     * or -1 if nothing is selected.
     * @serial
     * @see #getSelectedItem()
     * @see #select(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
public class Choice extends Component implements ItemSelectable, Accessible {

/**
 * The <code>Choice</code> class presents a pop-up menu of choices.
 * The current choice is displayed as the title of the menu.
 * <p>
 * The following code example produces a pop-up menu:
 *
 * <hr><blockquote><pre>
 * Choice ColorChooser = new Choice();
 * ColorChooser.add("Green");
 * ColorChooser.add("Red");
 * ColorChooser.add("Blue");
 * </pre></blockquote><hr>
 * <p>
 * After this choice menu has been added to a panel,
 * it appears as follows in its normal state:
 * <p>
 * <img src="doc-files/Choice-1.gif" alt="The following text describes the graphic"
 * style="float:center; margin: 7px 10px;">
 * <p>
 * In the picture, <code>"Green"</code> is the current choice.
 * Pushing the mouse button down on the object causes a menu to
 * appear with the current choice highlighted.
 * <p>
 * Some native platforms do not support arbitrary resizing of
 * <code>Choice</code> components and the behavior of
 * <code>setSize()/getSize()</code> is bound by
 * such limitations.
 * Native GUI <code>Choice</code> components' size are often bound by such
 * attributes as font size and length of items contained within
 * the <code>Choice</code>.
 * <p>
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
        public boolean doAccessibleAction(int i) {

        /**
         * Perform the specified Action on the object
         *
         * @param i zero-based index of actions
         * @return true if the action was performed; otherwise false.
         * @see #getAccessibleActionCount
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
        public String getAccessibleActionDescription(int i) {

        /**
         * Returns a description of the specified action of the object.
         *
         * @param i zero-based index of the actions
         * @return a String description of the action
         * @see #getAccessibleActionCount
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
        public int getAccessibleActionCount() {

        /**
         * Returns the number of accessible actions available in this object
         * If there are more than one, the first one is considered the "default"
         * action of the object.
         *
         * @return the zero-based number of Actions in this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
        public AccessibleAction getAccessibleAction() {

        /**
         * Get the AccessibleAction associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleAction interface on behalf of itself.
         *
         * @return this object
         * @see AccessibleAction
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    protected class AccessibleAWTChoice extends AccessibleAWTComponent

    /**
     * This class implements accessibility support for the
     * <code>Choice</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to choice user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> associated with this
     * <code>Choice</code>. For <code>Choice</code> components,
     * the <code>AccessibleContext</code> takes the form of an
     * <code>AccessibleAWTChoice</code>. A new <code>AccessibleAWTChoice</code>
     * instance is created if necessary.
     *
     * @return an <code>AccessibleAWTChoice</code> that serves as the
     *         <code>AccessibleContext</code> of this <code>Choice</code>
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code> and if it
     * isn't <code>null</code> adds a listener to receive
     * item events fired by the <code>Choice</code> item.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @serial
     * @see #removeItemListener(ItemListener)
     * @see #addItemListener(ItemListener)
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable <code>ItemListeners</code>
     * as optional data. The non-serializable
     * <code>ItemListeners</code> are detected and
     * no attempt is made to serialize them.
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @serialData <code>null</code> terminated sequence of 0
     *   or more pairs; the pair consists of a <code>String</code>
     *   and an <code>Object</code>; the <code>String</code> indicates
     *   the type of object and is one of the following:
     *   <code>itemListenerK</code> indicating an
     *     <code>ItemListener</code> object
     *
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see java.awt.Component#itemListenerK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>Choice</code>
     * menu. This method is intended to be used only for debugging purposes,
     * and the content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return    the parameter string of this <code>Choice</code> menu
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    protected void processItemEvent(ItemEvent e) {

    /**
     * Processes item events occurring on this <code>Choice</code>
     * menu by dispatching them to any registered
     * <code>ItemListener</code> objects.
     * <p>
     * This method is not called unless item events are
     * enabled for this component. Item events are enabled
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
     * @see         #addItemListener(ItemListener)
     * @see         java.awt.Component#enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this choice. If the event is an
     * instance of <code>ItemEvent</code>, it invokes the
     * <code>processItemEvent</code> method. Otherwise, it calls its
     * superclass's <code>processEvent</code> method.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param      e the event
     * @see        java.awt.event.ItemEvent
     * @see        #processItemEvent
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>Choice</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>Choice</code> <code>c</code>
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
     *          <code><em>Foo</em>Listener</code>s on this choice,
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized ItemListener[] getItemListeners() {

    /**
     * Returns an array of all the item listeners
     * registered on this choice.
     *
     * @return all of this choice's <code>ItemListener</code>s
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized void removeItemListener(ItemListener l) {

    /**
     * Removes the specified item listener so that it no longer receives
     * item events from this <code>Choice</code> menu.
     * If l is <code>null</code>, no exception is thrown and no
     * action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     * @param         l    the item listener
     * @see           #addItemListener
     * @see           #getItemListeners
     * @see           java.awt.event.ItemEvent
     * @see           java.awt.event.ItemListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized void addItemListener(ItemListener l) {

    /**
     * Adds the specified item listener to receive item events from
     * this <code>Choice</code> menu.  Item events are sent in response
     * to user input, but not in response to calls to <code>select</code>.
     * If l is <code>null</code>, no exception is thrown and no action
     * is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     * @param         l    the item listener
     * @see           #removeItemListener
     * @see           #getItemListeners
     * @see           #select
     * @see           java.awt.event.ItemEvent
     * @see           java.awt.event.ItemListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized void select(String str) {

    /**
     * Sets the selected item in this <code>Choice</code> menu
     * to be the item whose name is equal to the specified string.
     * If more than one item matches (is equal to) the specified string,
     * the one with the smallest index is selected.
     *
     * <p>Note that this method should be primarily used to
     * initially select an item in this component.
     * Programmatically calling this method will <i>not</i> trigger
     * an <code>ItemEvent</code>.  The only way to trigger an
     * <code>ItemEvent</code> is by user interaction.
     *
     * @param       str     the specified string
     * @see         #getSelectedItem
     * @see         #getSelectedIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized void select(int pos) {

    /**
     * Sets the selected item in this <code>Choice</code> menu to be the
     * item at the specified position.
     *
     * <p>Note that this method should be primarily used to
     * initially select an item in this component.
     * Programmatically calling this method will <i>not</i> trigger
     * an <code>ItemEvent</code>.  The only way to trigger an
     * <code>ItemEvent</code> is by user interaction.
     *
     * @param      pos      the position of the selected item
     * @exception  IllegalArgumentException if the specified
     *                            position is greater than the
     *                            number of items or less than zero
     * @see        #getSelectedItem
     * @see        #getSelectedIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public int getSelectedIndex() {

    /**
     * Returns the index of the currently selected item.
     * If nothing is selected, returns -1.
     *
     * @return the index of the currently selected item, or -1 if nothing
     *  is currently selected
     * @see #getSelectedItem
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized Object[] getSelectedObjects() {

    /**
     * Returns an array (length 1) containing the currently selected
     * item.  If this choice has no items, returns <code>null</code>.
     * @see ItemSelectable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public synchronized String getSelectedItem() {

    /**
     * Gets a representation of the current choice as a string.
     * @return    a string representation of the currently
     *                     selected item in this choice menu
     * @see       #getSelectedIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void removeAll() {

    /**
     * Removes all items from the choice menu.
     * @see       #remove
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    private void removeNoInvalidate(int position) {

    /**
     * Removes an item from the <code>Choice</code> at the
     * specified position, but does not invalidate the <code>Choice</code>.
     * Client methods must provide their
     * own synchronization before invoking this method.
     * @param      position   the position of the item
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void remove(int position) {

    /**
     * Removes an item from the choice menu
     * at the specified position.  If the item
     * being removed is the currently selected item,
     * then the first item in the choice becomes the
     * selected item.  Otherwise, the currently selected
     * item remains selected (and the selected index is
     * updated accordingly).
     * @param      position the position of the item
     * @throws IndexOutOfBoundsException if the specified
     *          position is out of bounds
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void remove(String item) {

    /**
     * Removes the first occurrence of <code>item</code>
     * from the <code>Choice</code> menu.  If the item
     * being removed is the currently selected item,
     * then the first item in the choice becomes the
     * selected item.  Otherwise, the currently selected
     * item remains selected (and the selected index is
     * updated accordingly).
     * @param      item  the item to remove from this <code>Choice</code> menu
     * @exception  IllegalArgumentException  if the item doesn't
     *                     exist in the choice menu
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void insert(String item, int index) {

    /**
     * Inserts the item into this choice at the specified position.
     * Existing items at an index greater than or equal to
     * <code>index</code> are shifted up by one to accommodate
     * the new item.  If <code>index</code> is greater than or
     * equal to the number of items in this choice,
     * <code>item</code> is added to the end of this choice.
     * <p>
     * If the item is the first one being added to the choice,
     * then the item becomes selected.  Otherwise, if the
     * selected item was one of the items shifted, the first
     * item in the choice becomes the selected item.  If the
     * selected item was no among those shifted, it remains
     * the selected item.
     * @param item the non-<code>null</code> item to be inserted
     * @param index the position at which the item should be inserted
     * @exception IllegalArgumentException if index is less than 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    private void insertNoInvalidate(String item, int index) {

    /**
     * Inserts an item to this <code>Choice</code>,
     * but does not invalidate the <code>Choice</code>.
     * Client methods must provide their own synchronization before
     * invoking this method.
     * @param item the item to be added
     * @param index the new item position
     * @exception NullPointerException if the item's value is equal to
     *          <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void addItem(String item) {

    /**
     * Obsolete as of Java 2 platform v1.1.  Please use the
     * <code>add</code> method instead.
     * <p>
     * Adds an item to this <code>Choice</code> menu.
     * @param item the item to be added
     * @exception NullPointerException if the item's value is equal to
     *          <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void add(String item) {

    /**
     * Adds an item to this <code>Choice</code> menu.
     * @param      item    the item to be added
     * @exception  NullPointerException   if the item's value is
     *                  <code>null</code>
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public String getItem(int index) {

    /**
     * Gets the string at the specified index in this
     * <code>Choice</code> menu.
     * @param      index the index at which to begin
     * @see        #getItemCount
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getItemCount()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public int getItemCount() {

    /**
     * Returns the number of items in this <code>Choice</code> menu.
     * @return the number of items in this <code>Choice</code> menu
     * @see     #getItem
     * @since   JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public void addNotify() {

    /**
     * Creates the <code>Choice</code>'s peer.  This peer allows us
     * to change the look
     * of the <code>Choice</code> without changing its functionality.
     * @see     java.awt.Toolkit#createChoice(java.awt.Choice)
     * @see     java.awt.Component#getToolkit()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    String constructComponentName() {

    /**
     * Constructs a name for this component.  Called by
     * <code>getName</code> when the name is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    public Choice() throws HeadlessException {

    /**
     * Creates a new choice menu. The menu initially has no items in it.
     * <p>
     * By default, the first item added to the choice menu becomes the
     * selected item, until a different selection is made by the user
     * by calling one of the <code>select</code> methods.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true
     * @see       java.awt.GraphicsEnvironment#isHeadless
     * @see       #select(int)
     * @see       #select(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
    int selectedIndex = -1;

    /**
     * The index of the current choice for this <code>Choice</code>
     * or -1 if nothing is selected.
     * @serial
     * @see #getSelectedItem()
     * @see #select(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Choice.java
public class Choice extends Component implements ItemSelectable, Accessible {

/**
 * The <code>Choice</code> class presents a pop-up menu of choices.
 * The current choice is displayed as the title of the menu.
 * <p>
 * The following code example produces a pop-up menu:
 *
 * <hr><blockquote><pre>
 * Choice ColorChooser = new Choice();
 * ColorChooser.add("Green");
 * ColorChooser.add("Red");
 * ColorChooser.add("Blue");
 * </pre></blockquote><hr>
 * <p>
 * After this choice menu has been added to a panel,
 * it appears as follows in its normal state:
 * <p>
 * <img src="doc-files/Choice-1.gif" alt="The following text describes the graphic"
 * style="float:center; margin: 7px 10px;">
 * <p>
 * In the picture, <code>"Green"</code> is the current choice.
 * Pushing the mouse button down on the object causes a menu to
 * appear with the current choice highlighted.
 * <p>
 * Some native platforms do not support arbitrary resizing of
 * <code>Choice</code> components and the behavior of
 * <code>setSize()/getSize()</code> is bound by
 * such limitations.
 * Native GUI <code>Choice</code> components' size are often bound by such
 * attributes as font size and length of items contained within
 * the <code>Choice</code>.
 * <p>
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 * @since       JDK1.0
 */
