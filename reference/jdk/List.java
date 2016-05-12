_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void removeFocusListener(FocusListener l) {

            /**
             * Removes the specified focus listener so it no longer receives
             * focus events from this component.
             *
             * @param l the focus listener
             * @see #addFocusListener
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void addFocusListener(FocusListener l) {

            /**
             * Adds the specified focus listener to receive focus events from
             * this component.
             *
             * @param l the focus listener
             * @see #removeFocusListener
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void requestFocus() {

            /**
             * Requests focus for this object.  If this object cannot accept
             * focus, nothing will happen.  Otherwise, the object will attempt
             * to take focus.
             * @see #isFocusTraversable
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public boolean isFocusTraversable() {

            /**
             * Returns whether this object can accept focus or not.   Objects
             * that can accept focus will also have the
             * <code>AccessibleState.FOCUSABLE</code> state set in their
             * <code>AccessibleStateSet</code>.
             *
             * @return true if object can accept focus; otherwise false
             * @see AccessibleContext#getAccessibleStateSet
             * @see AccessibleState#FOCUSABLE
             * @see AccessibleState#FOCUSED
             * @see AccessibleStateSet
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Accessible getAccessibleAt(Point p) {

            /**
             * Returns the <code>Accessible</code> child, if one exists,
             * contained at the local coordinate <code>Point</code>.
             *
             * @param p the point relative to the coordinate system of this
             *     object
             * @return the <code>Accessible</code>, if it exists,
             *     at the specified location; otherwise <code>null</code>
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setSize(Dimension d) {

            /**
             * Resizes this object so that it has width and height.
             *
             * @param d - The dimension specifying the new size of the object.
             * @see #getSize
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Dimension getSize() {

            /**
             * Returns the size of this object in the form of a Dimension
             * object.  The height field of the Dimension object contains this
             * objects's height, and the width field of the Dimension object
             * contains this object's width.
             *
             * @return A Dimension object that indicates the size of this
             * component; null if this object is not on the screen
             * @see #setSize
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setBounds(Rectangle r) {

            /**
             * Sets the bounds of this object in the form of a Rectangle
             * object.  The bounds specify this object's width, height, and
             * location relative to its parent.
             *
             * @param r rectangle indicating this component's bounds
             * @see #getBounds
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Rectangle getBounds() {

            /**
             * Gets the bounds of this object in the form of a Rectangle object.
             * The bounds specify this object's width, height, and location
             * relative to its parent.
             *
             * @return A rectangle indicating this component's bounds; null if
             * this object is not on the screen.
             * @see #contains
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setLocation(Point p) {

            /**
             * Sets the location of the object relative to the parent.
             * @param p the new position for the top-left corner
             * @see #getLocation
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Point getLocation() {

            /**
             * Gets the location of the object relative to the parent in the
             * form of a point specifying the object's top-left corner in the
             * screen's coordinate space.
             *
             * @return An instance of Point representing the top-left corner of
             * the objects's bounds in the coordinate space of the screen; null
             * if this object or its parent are not on the screen
             * @see #getBounds
             * @see #getLocationOnScreen
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Point getLocationOnScreen() {

            /**
             * Returns the location of the object on the screen.
             *
             * @return location of object on screen; null if this object
             * is not on the screen
             * @see #getBounds
             * @see #getLocation
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public boolean contains(Point p) {

            /**
             * Checks whether the specified point is within this object's
             * bounds, where the point's x and y coordinates are defined to
             * be relative to the coordinate system of the object.
             *
             * @param p the Point relative to the coordinate system of the
             * object
             * @return true if object contains Point; otherwise false
             * @see #getBounds
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public boolean isShowing() {

            /**
             * Determine if the object is showing.  This is determined by
             * checking the visibility of the object and visibility of the
             * object ancestors.
             * Note: this will return true even if the object is obscured
             * by another (for example, it to object is underneath a menu
             * that was pulled down).
             *
             * @return true if object is showing; otherwise, false
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setVisible(boolean b) {

            /**
             * Set the visible state of the object.
             *
             * @param b if true, shows this object; otherwise, hides it
             * @see #isVisible
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public boolean isVisible() {

            /**
             * Determine if the object is visible.  Note: this means that the
             * object intends to be visible; however, it may not be
             * showing on the screen because one of the objects that this object
             * is contained by is currently not visible.  To determine if an
             * object is showing on the screen, use isShowing().
             * <p>Objects that are visible will also have the
             * AccessibleState.VISIBLE state set in their AccessibleStateSet.
             *
             * @return true if object is visible; otherwise, false
             * @see #setVisible
             * @see AccessibleContext#getAccessibleStateSet
             * @see AccessibleState#VISIBLE
             * @see AccessibleStateSet
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setEnabled(boolean b) {

            /**
             * Set the enabled state of the object.
             *
             * @param b if true, enables this object; otherwise, disables it
             * @see #isEnabled
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public boolean isEnabled() {

            /**
             * Determine if the object is enabled.  Objects that are enabled
             * will also have the AccessibleState.ENABLED state set in their
             * AccessibleStateSet.
             *
             * @return true if object is enabled; otherwise, false
             * @see #setEnabled
             * @see AccessibleContext#getAccessibleStateSet
             * @see AccessibleState#ENABLED
             * @see AccessibleStateSet
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public FontMetrics getFontMetrics(Font f) {

            /**
             * Get the FontMetrics of this object.
             *
             * @param f the Font
             * @return the FontMetrics, if supported, the object; otherwise, null
             * @see #getFont
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setFont(Font f) {

            /**
             * Set the Font of this object.
             *
             * @param f the new Font for the object
             * @see #getFont
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Font getFont() {

            /**
             * Get the Font of this object.
             *
             * @return the Font,if supported, for the object; otherwise, null
             * @see #setFont
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setCursor(Cursor cursor) {

            /**
             * Set the Cursor of this object.
             * <p>
             * The method may have no visual effect if the Java platform
             * implementation and/or the native system do not support
             * changing the mouse cursor shape.
             * @param cursor the new Cursor for the object
             * @see #getCursor
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Cursor getCursor() {

            /**
             * Get the Cursor of this object.
             *
             * @return the Cursor, if supported, of the object; otherwise, null
             * @see #setCursor
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setForeground(Color c) {

            /**
             * Set the foreground color of this object.
             *
             * @param c the new Color for the foreground
             * @see #getForeground
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Color getForeground() {

            /**
             * Get the foreground color of this object.
             *
             * @return the foreground color, if supported, of the object;
             * otherwise, null
             * @see #setForeground
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setBackground(Color c) {

            /**
             * Set the background color of this object.
             *
             * @param c the new Color for the background
             * @see #setBackground
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Color getBackground() {

            /**
             * Get the background color of this object.
             *
             * @return the background color, if supported, of the object;
             * otherwise, null
             * @see #setBackground
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Accessible getAccessibleChild(int i) {

            /**
             * Return the specified Accessible child of the object.  The
             * Accessible children of an Accessible object are zero-based,
             * so the first child of an Accessible child is at index 0, the
             * second child is at index 1, and so on.
             *
             * @param i zero-based index of child
             * @return the Accessible child of the object
             * @see #getAccessibleChildrenCount
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public int getAccessibleChildrenCount() {

            /**
             * Returns the number of accessible children of the object.
             *
             * @return the number of accessible children of the object.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public int getAccessibleIndexInParent() {

            /**
             * Get the 0-based index of this object in its accessible parent.
             *
             * @return the 0-based index of this object in its parent; -1 if
             * this object does not have an accessible parent.
             *
             * @see #getAccessibleParent
             * @see #getAccessibleChildrenCount
             * @see #getAccessibleChild
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Locale getLocale() {

            /**
             * Gets the locale of the component. If the component does not
             * have a locale, then the locale of its parent is returned.
             *
             * @return This component's locale.  If this component does not have
             * a locale, the locale of its parent is returned.
             *
             * @exception IllegalComponentStateException
             * If the Component does not have its own locale and has not yet
             * been added to a containment hierarchy such that the locale can
             * be determined from the containing parent.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public AccessibleStateSet getAccessibleStateSet() {

            /**
             * Get the state set of this object.  The AccessibleStateSet of an
             * object is composed of a set of unique AccessibleState's.  A
             * change in the AccessibleStateSet of an object will cause a
             * PropertyChangeEvent to be fired for the
             * ACCESSIBLE_STATE_PROPERTY property.
             *
             * @return an instance of AccessibleStateSet containing the
             * current state set of the object
             * @see AccessibleStateSet
             * @see AccessibleState
             * @see #addPropertyChangeListener
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public AccessibleRole getAccessibleRole() {

            /**
             * Get the role of this object.
             *
             * @return an instance of AccessibleRole describing the role of
             * the object
             * @see AccessibleRole
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public AccessibleContext getAccessibleContext() {

          /**
           * Gets the AccessibleContext for this object.  In the
           * implementation of the Java Accessibility API for this class,
           * return this object, which acts as its own AccessibleContext.
           *
           * @return this object
           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        protected class AccessibleAWTListChild extends AccessibleAWTComponent

       /**
        * This class implements accessibility support for
        * List children.  It provides an implementation of the
        * Java Accessibility API appropriate to list children
        * user-interface elements.
        * @since 1.3
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
         public void selectAllAccessibleSelection() {

        /**
         * Causes every selected item in the object to be selected
         * if the object supports multiple selections.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
         public void clearAccessibleSelection() {

        /**
         * Clears the selection in the object, so that nothing in the
         * object is selected.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
         public void removeAccessibleSelection(int i) {

        /**
         * Removes the specified selected item in the object from the object's
         * selection.  If the specified item isn't currently selected, this
         * method has no effect.
         *
         * @param i the zero-based index of selectable items
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
         public void addAccessibleSelection(int i) {

        /**
         * Adds the specified selected item in the object to the object's
         * selection.  If the object supports multiple selections,
         * the specified item is added to any existing selection, otherwise
         * it replaces any existing selection in the object.  If the
         * specified item is already selected, this method has no effect.
         *
         * @param i the zero-based index of selectable items
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        public boolean isAccessibleChildSelected(int i) {

        /**
         * Returns true if the current child of this object is selected.
         *
         * @param i the zero-based index of the child in this Accessible
         * object.
         * @see AccessibleContext#getAccessibleChild
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
         public Accessible getAccessibleSelection(int i) {

        /**
         * Returns an Accessible representing the specified selected item
         * in the object.  If there isn't a selection, or there are
         * fewer items selected than the integer passed in, the return
         * value will be null.
         *
         * @param i the zero-based index of selected items
         * @return an Accessible containing the selected item
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
         public int getAccessibleSelectionCount() {

        /**
         * Returns the number of items currently selected.
         * If no items are selected, the return value will be 0.
         *
         * @return the number of items currently selected.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        public AccessibleSelection getAccessibleSelection() {

        /**
         * Get the AccessibleSelection associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleSelection interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Return the nth Accessible child of the object.
         *
         * @param i zero-based index of child
         * @return the nth Accessible child of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children in the object.  If all
         * of the children of this object implement Accessible, than this
         * method should return the number of children of this object.
         *
         * @return the number of accessible children in the object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        public Accessible getAccessibleAt(Point p) {

        /**
         * Returns the Accessible child contained at the local coordinate
         * Point, if one exists.
         *
         * @return the Accessible at the specified location, if it exists
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Get the state set of this object.
         *
         * @return an instance of AccessibleState containing the current state
         * of the object
         * @see AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    protected class AccessibleAWTList extends AccessibleAWTComponent

    /**
     * This class implements accessibility support for the
     * <code>List</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to list user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> associated with this
     * <code>List</code>. For lists, the <code>AccessibleContext</code>
     * takes the form of an <code>AccessibleAWTList</code>.
     * A new <code>AccessibleAWTList</code> instance is created, if necessary.
     *
     * @return an <code>AccessibleAWTList</code> that serves as the
     *         <code>AccessibleContext</code> of this <code>List</code>
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code> and if it
     * isn't <code>null</code> adds a listener to receive
     * both item events and action events (as specified
     * by the key stored in the stream) fired by the
     * <code>List</code>.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the <code>ObjectInputStream</code> to write
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see #removeItemListener(ItemListener)
     * @see #addItemListener(ItemListener)
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable <code>ItemListeners</code>
     * and <code>ActionListeners</code> as optional data.
     * The non-serializable listeners are detected and
     * no attempt is made to serialize them.
     *
     * @serialData <code>null</code> terminated sequence of 0
     *  or more pairs; the pair consists of a <code>String</code>
     *  and an <code>Object</code>; the <code>String</code>
     *  indicates the type of object and is one of the
     *  following:
     *  <code>itemListenerK</code> indicating an
     *    <code>ItemListener</code> object;
     *  <code>actionListenerK</code> indicating an
     *    <code>ActionListener</code> object
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see java.awt.Component#itemListenerK
     * @see java.awt.Component#actionListenerK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    private int listSerializedDataVersion = 1;

    /**
     * The <code>List</code> component's
     * Serialized Data Version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * Not for public use in the future.
     * This method is expected to be retained only as a package
     * private method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    protected String paramString() {

    /**
     * Returns the parameter string representing the state of this
     * scrolling list. This string is useful for debugging.
     * @return    the parameter string of this scrolling list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    protected void processActionEvent(ActionEvent e) {

    /**
     * Processes action events occurring on this component
     * by dispatching them to any registered
     * <code>ActionListener</code> objects.
     * <p>
     * This method is not called unless action events are
     * enabled for this component. Action events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>ActionListener</code> object is registered
     * via <code>addActionListener</code>.
     * <li>Action events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the action event
     * @see         java.awt.event.ActionEvent
     * @see         java.awt.event.ActionListener
     * @see         #addActionListener
     * @see         java.awt.Component#enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    protected void processItemEvent(ItemEvent e) {

    /**
     * Processes item events occurring on this list by
     * dispatching them to any registered
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
     * @see         #addItemListener
     * @see         java.awt.Component#enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this scrolling list. If an event is
     * an instance of <code>ItemEvent</code>, it invokes the
     * <code>processItemEvent</code> method. Else, if the
     * event is an instance of <code>ActionEvent</code>,
     * it invokes <code>processActionEvent</code>.
     * If the event is not an item event or an action event,
     * it invokes <code>processEvent</code> on the superclass.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param        e the event
     * @see          java.awt.event.ActionEvent
     * @see          java.awt.event.ItemEvent
     * @see          #processActionEvent
     * @see          #processItemEvent
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>List</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>List</code> <code>l</code>
     * for its item listeners with the following code:
     *
     * <pre>ItemListener[] ils = (ItemListener[])(l.getListeners(ItemListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this list,
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized ActionListener[] getActionListeners() {

    /**
     * Returns an array of all the action listeners
     * registered on this list.
     *
     * @return all of this list's <code>ActionListener</code>s
     *         or an empty array if no action
     *         listeners are currently registered
     *
     * @see             #addActionListener
     * @see             #removeActionListener
     * @see             java.awt.event.ActionEvent
     * @see             java.awt.event.ActionListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void removeActionListener(ActionListener l) {

    /**
     * Removes the specified action listener so that it no longer
     * receives action events from this list. Action events
     * occur when a user double-clicks on a list item.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param           l     the action listener
     * @see             #addActionListener
     * @see             #getActionListeners
     * @see             java.awt.event.ActionEvent
     * @see             java.awt.event.ActionListener
     * @since           JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void addActionListener(ActionListener l) {

    /**
     * Adds the specified action listener to receive action events from
     * this list. Action events occur when a user double-clicks
     * on a list item or types Enter when the list has the keyboard
     * focus.
     * <p>
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param         l the action listener
     * @see           #removeActionListener
     * @see           #getActionListeners
     * @see           java.awt.event.ActionEvent
     * @see           java.awt.event.ActionListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized ItemListener[] getItemListeners() {

    /**
     * Returns an array of all the item listeners
     * registered on this list.
     *
     * @return all of this list's <code>ItemListener</code>s
     *         or an empty array if no item
     *         listeners are currently registered
     *
     * @see             #addItemListener
     * @see             #removeItemListener
     * @see             java.awt.event.ItemEvent
     * @see             java.awt.event.ItemListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void removeItemListener(ItemListener l) {

    /**
     * Removes the specified item listener so that it no longer
     * receives item events from this list.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param           l the item listener
     * @see             #addItemListener
     * @see             #getItemListeners
     * @see             java.awt.event.ItemEvent
     * @see             java.awt.event.ItemListener
     * @since           JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void addItemListener(ItemListener l) {

    /**
     * Adds the specified item listener to receive item events from
     * this list.  Item events are sent in response to user input, but not
     * in response to calls to <code>select</code> or <code>deselect</code>.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param         l the item listener
     * @see           #removeItemListener
     * @see           #getItemListeners
     * @see           #select
     * @see           #deselect
     * @see           java.awt.event.ItemEvent
     * @see           java.awt.event.ItemListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMinimumSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public Dimension getMinimumSize() {

    /**
     * Determines the minimum size of this scrolling list.
     * @return       the minimum dimensions needed
     *                        to display this scrolling list
     * @see          java.awt.Component#getMinimumSize()
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMinimumSize(int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public Dimension getMinimumSize(int rows) {

    /**
     * Gets the minimum dimensions for a list with the specified
     * number of rows.
     * @param      rows    number of rows in the list
     * @return     the minimum dimensions for displaying this scrolling list
     *             given that the specified number of rows must be visible
     * @see        java.awt.Component#getMinimumSize
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getPreferredSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public Dimension getPreferredSize() {

    /**
     * Gets the preferred size of this scrolling list.
     * @return     the preferred dimensions for displaying this scrolling list
     * @see        java.awt.Component#getPreferredSize
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getPreferredSize(int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public Dimension getPreferredSize(int rows) {

    /**
     * Gets the preferred dimensions for a list with the specified
     * number of rows.
     * @param      rows    number of rows in the list
     * @return     the preferred dimensions for displaying this scrolling list
     *             given that the specified number of rows must be visible
     * @see        java.awt.Component#getPreferredSize
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void makeVisible(int index) {

    /**
     * Makes the item at the specified index visible.
     * @param       index    the position of the item
     * @see         #getVisibleIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public int getVisibleIndex() {

    /**
     * Gets the index of the item that was last made visible by
     * the method <code>makeVisible</code>.
     * @return      the index of the item that was last made visible
     * @see         #makeVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setMultipleMode(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void setMultipleMode(boolean b) {

    /**
     * Sets the flag that determines whether this list
     * allows multiple selections.
     * When the selection mode is changed from multiple-selection to
     * single-selection, the selected items change as follows:
     * If a selected item has the location cursor, only that
     * item will remain selected.  If no selected item has the
     * location cursor, all items will be deselected.
     * @param       b   if <code>true</code> then multiple selections
     *                      are allowed; otherwise, only one item from
     *                      the list can be selected at once
     * @see         #isMultipleMode
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>isMultipleMode()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public boolean isMultipleMode() {

    /**
     * Determines whether this list allows multiple selections.
     * @return     <code>true</code> if this list allows multiple
     *                 selections; otherwise, <code>false</code>
     * @see        #setMultipleMode
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public int getRows() {

    /**
     * Gets the number of visible lines in this list.  Note that
     * once the <code>List</code> has been created, this number
     * will never change.
     * @return     the number of visible lines in this scrolling list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>isIndexSelected(int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public boolean isIndexSelected(int index) {

    /**
     * Determines if the specified item in this scrolling list is
     * selected.
     * @param      index   the item to be checked
     * @return     <code>true</code> if the specified item has been
     *                       selected; <code>false</code> otherwise
     * @see        #select
     * @see        #deselect
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void deselect(int index) {

    /**
     * Deselects the item at the specified index.
     * <p>
     * Note that passing out of range parameters is invalid,
     * and will result in unspecified behavior.
     * <p>
     * If the item at the specified index is not selected,
     * then the operation is ignored.
     * @param        index the position of the item to deselect
     * @see          #select
     * @see          #getSelectedItem
     * @see          #isIndexSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void select(int index) {

    /**
     * Selects the item at the specified index in the scrolling list.
     *<p>
     * Note that passing out of range parameters is invalid,
     * and will result in unspecified behavior.
     *
     * <p>Note that this method should be primarily used to
     * initially select an item in this component.
     * Programmatically calling this method will <i>not</i> trigger
     * an <code>ItemEvent</code>.  The only way to trigger an
     * <code>ItemEvent</code> is by user interaction.
     *
     * @param        index the position of the item to select
     * @see          #getSelectedItem
     * @see          #deselect
     * @see          #isIndexSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public Object[] getSelectedObjects() {

    /**
     * Gets the selected items on this scrolling list in an array of Objects.
     * @return        an array of <code>Object</code>s representing the
     *                selected items on this scrolling list;
     *                if no item is selected, a zero-length array is returned.
     * @see #getSelectedItems
     * @see ItemSelectable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized String[] getSelectedItems() {

    /**
     * Gets the selected items on this scrolling list.
     *
     * @return        an array of the selected items on this scrolling list;
     *                if no item is selected, a zero-length array is returned.
     * @see           #select
     * @see           #deselect
     * @see           #isIndexSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized String getSelectedItem() {

    /**
     * Gets the selected item on this scrolling list.
     *
     * @return        the selected item on the list;
     *                if no item is selected, or if multiple items are
     *                selected, <code>null</code> is returned.
     * @see           #select
     * @see           #deselect
     * @see           #isIndexSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized int[] getSelectedIndexes() {

    /**
     * Gets the selected indexes on the list.
     *
     * @return        an array of the selected indexes on this scrolling list;
     *                if no item is selected, a zero-length array is returned.
     * @see           #select
     * @see           #deselect
     * @see           #isIndexSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized int getSelectedIndex() {

    /**
     * Gets the index of the selected item on the list,
     *
     * @return        the index of the selected item;
     *                if no item is selected, or if multiple items are
     *                selected, <code>-1</code> is returned.
     * @see           #select
     * @see           #deselect
     * @see           #isIndexSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated     replaced by <code>remove(String)</code>
     *                         and <code>remove(int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void remove(int position) {

    /**
     * Removes the item at the specified position
     * from this scrolling list.
     * If the item with the specified position is selected, and is the
     * only selected item in the list, the list is set to have no selection.
     * @param      position   the index of the item to delete
     * @see        #add(String, int)
     * @since      JDK1.1
     * @exception    ArrayIndexOutOfBoundsException
     *               if the <code>position</code> is less than 0 or
     *               greater than <code>getItemCount()-1</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void remove(String item) {

    /**
     * Removes the first occurrence of an item from the list.
     * If the specified item is selected, and is the only selected
     * item in the list, the list is set to have no selection.
     * @param        item  the item to remove from the list
     * @exception    IllegalArgumentException
     *                     if the item doesn't exist in the list
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>removeAll()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void removeAll() {

    /**
     * Removes all items from this list.
     * @see #remove
     * @see #delItems
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void replaceItem(String newValue, int index) {

    /**
     * Replaces the item at the specified index in the scrolling list
     * with the new string.
     * @param       newValue   a new string to replace an existing item
     * @param       index      the position of the item to replace
     * @exception ArrayIndexOutOfBoundsException if <code>index</code>
     *          is out of range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated      replaced by <code>add(String, int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void add(String item, int index) {

    /**
     * Adds the specified item to the the scrolling list
     * at the position indicated by the index.  The index is
     * zero-based.  If the value of the index is less than zero,
     * or if the value of the index is greater than or equal to
     * the number of items in the list, then the item is added
     * to the end of the list.
     * @param       item   the item to be added;
     *              if this parameter is <code>null</code> then the item is
     *              treated as an empty string, <code>""</code>
     * @param       index  the position at which to add the item
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated      replaced by <code>add(String)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void add(String item) {

    /**
     * Adds the specified item to the end of scrolling list.
     * @param item the item to be added
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized String[] getItems() {

    /**
     * Gets the items in the list.
     * @return       a string array containing items of the list
     * @see          #select
     * @see          #deselect
     * @see          #isIndexSelected
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public String getItem(int index) {

    /**
     * Gets the item associated with the specified index.
     * @return       an item that is associated with
     *                    the specified index
     * @param        index the position of the item
     * @see          #getItemCount
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getItemCount()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public int getItemCount() {

    /**
     * Gets the number of items in the list.
     * @return     the number of items in the list
     * @see        #getItem
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void removeNotify() {

    /**
     * Removes the peer for this list.  The peer allows us to modify the
     * list's appearance without changing its functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void addNotify() {

    /**
     * Creates the peer for the list.  The peer allows us to modify the
     * list's appearance without changing its functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by
     * <code>getName</code> when the name is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public List(int rows, boolean multipleMode) throws HeadlessException {

    /**
     * Creates a new scrolling list initialized to display the specified
     * number of rows. Note that if zero rows are specified, then
     * the list will be created with a default of four rows.
     * Also note that the number of visible rows in the list cannot
     * be changed after it has been created.
     * If the value of <code>multipleMode</code> is
     * <code>true</code>, then the user can select multiple items from
     * the list. If it is <code>false</code>, only one item at a time
     * can be selected.
     * @param       rows   the number of items to show.
     * @param       multipleMode   if <code>true</code>,
     *                     then multiple selections are allowed;
     *                     otherwise, only one item can be selected at a time.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    final static int    DEFAULT_VISIBLE_ROWS = 4;

    /**
     * The default number of visible rows is 4.  A list with
     * zero rows is unusable and unsightly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public List(int rows) throws HeadlessException {

    /**
     * Creates a new scrolling list initialized with the specified
     * number of visible lines. By default, multiple selections are
     * not allowed.  Note that this is a convenience method for
     * <code>List(rows, false)</code>.  Also note that the number
     * of visible rows in the list cannot be changed after it has
     * been created.
     * @param       rows the number of items to show.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public List() throws HeadlessException {

    /**
     * Creates a new scrolling list.
     * By default, there are four visible lines and multiple selections are
     * not allowed.  Note that this is a convenience method for
     * <code>List(0, false)</code>.  Also note that the number of visible
     * lines in the list cannot be changed after it has been created.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    int         visibleIndex = -1;

    /**
     * This variable contains the value that will be used
     * when trying to make a particular list item visible.
     *
     * @serial
     * @see #makeVisible(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    int         selected[] = new int[0];

    /**
     * <code>selected</code> is an array that will contain
     * the indices of items that have been selected.
     *
     * @serial
     * @see #getSelectedIndexes()
     * @see #getSelectedIndex()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    boolean     multipleMode = false;

    /**
     * <code>multipleMode</code> is a variable that will
     * be set to <code>true</code> if a list component is to be set to
     * multiple selection mode, that is where the user can
     * select more than one item in a list at one time.
     * <code>multipleMode</code> will be set to false if the
     * list component is set to single selection, that is where
     * the user can only select one item on the list at any
     * one time.
     *
     * @serial
     * @see #isMultipleMode()
     * @see #setMultipleMode(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    int         rows = 0;

    /**
     * This field will represent the number of visible rows in the
     * <code>List</code> Component.  It is specified only once, and
     * that is when the list component is actually
     * created.  It will never change.
     *
     * @serial
     * @see #getRows()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
public class List extends Component implements ItemSelectable, Accessible {

/**
 * The <code>List</code> component presents the user with a
 * scrolling list of text items. The list can be set up so that
 * the user can choose either one item or multiple items.
 * <p>
 * For example, the code&nbsp;.&nbsp;.&nbsp;.
 *
 * <hr><blockquote><pre>
 * List lst = new List(4, false);
 * lst.add("Mercury");
 * lst.add("Venus");
 * lst.add("Earth");
 * lst.add("JavaSoft");
 * lst.add("Mars");
 * lst.add("Jupiter");
 * lst.add("Saturn");
 * lst.add("Uranus");
 * lst.add("Neptune");
 * lst.add("Pluto");
 * cnt.add(lst);
 * </pre></blockquote><hr>
 * <p>
 * where <code>cnt</code> is a container, produces the following
 * scrolling list:
 * <p>
 * <img src="doc-files/List-1.gif"
 * alt="Shows a list containing: Venus, Earth, JavaSoft, and Mars. Javasoft is selected." style="float:center; margin: 7px 10px;">
 * <p>
 * If the List allows multiple selections, then clicking on
 * an item that is already selected deselects it. In the preceding
 * example, only one item from the scrolling list can be selected
 * at a time, since the second argument when creating the new scrolling
 * list is <code>false</code>. If the List does not allow multiple
 * selections, selecting an item causes any other selected item
 * to be deselected.
 * <p>
 * Note that the list in the example shown was created with four visible
 * rows.  Once the list has been created, the number of visible rows
 * cannot be changed.  A default <code>List</code> is created with
 * four rows, so that <code>lst = new List()</code> is equivalent to
 * <code>list = new List(4, false)</code>.
 * <p>
 * Beginning with Java&nbsp;1.1, the Abstract Window Toolkit
 * sends the <code>List</code> object all mouse, keyboard, and focus events
 * that occur over it. (The old AWT event model is being maintained
 * only for backwards compatibility, and its use is discouraged.)
 * <p>
 * When an item is selected or deselected by the user, AWT sends an instance
 * of <code>ItemEvent</code> to the list.
 * When the user double-clicks on an item in a scrolling list,
 * AWT sends an instance of <code>ActionEvent</code> to the
 * list following the item event. AWT also generates an action event
 * when the user presses the return key while an item in the
 * list is selected.
 * <p>
 * If an application wants to perform some action based on an item
 * in this list being selected or activated by the user, it should implement
 * <code>ItemListener</code> or <code>ActionListener</code>
 * as appropriate and register the new listener to receive
 * events from this list.
 * <p>
 * For multiple-selection scrolling lists, it is considered a better
 * user interface to use an external gesture (such as clicking on a
 * button) to trigger the action.
 * @author      Sami Shaio
 * @see         java.awt.event.ItemEvent
 * @see         java.awt.event.ItemListener
 * @see         java.awt.event.ActionEvent
 * @see         java.awt.event.ActionListener
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void removeFocusListener(FocusListener l) {

            /**
             * Removes the specified focus listener so it no longer receives
             * focus events from this component.
             *
             * @param l the focus listener
             * @see #addFocusListener
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void addFocusListener(FocusListener l) {

            /**
             * Adds the specified focus listener to receive focus events from
             * this component.
             *
             * @param l the focus listener
             * @see #removeFocusListener
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void requestFocus() {

            /**
             * Requests focus for this object.  If this object cannot accept
             * focus, nothing will happen.  Otherwise, the object will attempt
             * to take focus.
             * @see #isFocusTraversable
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public boolean isFocusTraversable() {

            /**
             * Returns whether this object can accept focus or not.   Objects
             * that can accept focus will also have the
             * <code>AccessibleState.FOCUSABLE</code> state set in their
             * <code>AccessibleStateSet</code>.
             *
             * @return true if object can accept focus; otherwise false
             * @see AccessibleContext#getAccessibleStateSet
             * @see AccessibleState#FOCUSABLE
             * @see AccessibleState#FOCUSED
             * @see AccessibleStateSet
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Accessible getAccessibleAt(Point p) {

            /**
             * Returns the <code>Accessible</code> child, if one exists,
             * contained at the local coordinate <code>Point</code>.
             *
             * @param p the point relative to the coordinate system of this
             *     object
             * @return the <code>Accessible</code>, if it exists,
             *     at the specified location; otherwise <code>null</code>
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setSize(Dimension d) {

            /**
             * Resizes this object so that it has width and height.
             *
             * @param d - The dimension specifying the new size of the object.
             * @see #getSize
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Dimension getSize() {

            /**
             * Returns the size of this object in the form of a Dimension
             * object.  The height field of the Dimension object contains this
             * objects's height, and the width field of the Dimension object
             * contains this object's width.
             *
             * @return A Dimension object that indicates the size of this
             * component; null if this object is not on the screen
             * @see #setSize
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setBounds(Rectangle r) {

            /**
             * Sets the bounds of this object in the form of a Rectangle
             * object.  The bounds specify this object's width, height, and
             * location relative to its parent.
             *
             * @param r rectangle indicating this component's bounds
             * @see #getBounds
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Rectangle getBounds() {

            /**
             * Gets the bounds of this object in the form of a Rectangle object.
             * The bounds specify this object's width, height, and location
             * relative to its parent.
             *
             * @return A rectangle indicating this component's bounds; null if
             * this object is not on the screen.
             * @see #contains
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setLocation(Point p) {

            /**
             * Sets the location of the object relative to the parent.
             * @param p the new position for the top-left corner
             * @see #getLocation
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Point getLocation() {

            /**
             * Gets the location of the object relative to the parent in the
             * form of a point specifying the object's top-left corner in the
             * screen's coordinate space.
             *
             * @return An instance of Point representing the top-left corner of
             * the objects's bounds in the coordinate space of the screen; null
             * if this object or its parent are not on the screen
             * @see #getBounds
             * @see #getLocationOnScreen
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Point getLocationOnScreen() {

            /**
             * Returns the location of the object on the screen.
             *
             * @return location of object on screen; null if this object
             * is not on the screen
             * @see #getBounds
             * @see #getLocation
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public boolean contains(Point p) {

            /**
             * Checks whether the specified point is within this object's
             * bounds, where the point's x and y coordinates are defined to
             * be relative to the coordinate system of the object.
             *
             * @param p the Point relative to the coordinate system of the
             * object
             * @return true if object contains Point; otherwise false
             * @see #getBounds
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public boolean isShowing() {

            /**
             * Determine if the object is showing.  This is determined by
             * checking the visibility of the object and visibility of the
             * object ancestors.
             * Note: this will return true even if the object is obscured
             * by another (for example, it to object is underneath a menu
             * that was pulled down).
             *
             * @return true if object is showing; otherwise, false
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setVisible(boolean b) {

            /**
             * Set the visible state of the object.
             *
             * @param b if true, shows this object; otherwise, hides it
             * @see #isVisible
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public boolean isVisible() {

            /**
             * Determine if the object is visible.  Note: this means that the
             * object intends to be visible; however, it may not be
             * showing on the screen because one of the objects that this object
             * is contained by is currently not visible.  To determine if an
             * object is showing on the screen, use isShowing().
             * <p>Objects that are visible will also have the
             * AccessibleState.VISIBLE state set in their AccessibleStateSet.
             *
             * @return true if object is visible; otherwise, false
             * @see #setVisible
             * @see AccessibleContext#getAccessibleStateSet
             * @see AccessibleState#VISIBLE
             * @see AccessibleStateSet
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setEnabled(boolean b) {

            /**
             * Set the enabled state of the object.
             *
             * @param b if true, enables this object; otherwise, disables it
             * @see #isEnabled
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public boolean isEnabled() {

            /**
             * Determine if the object is enabled.  Objects that are enabled
             * will also have the AccessibleState.ENABLED state set in their
             * AccessibleStateSet.
             *
             * @return true if object is enabled; otherwise, false
             * @see #setEnabled
             * @see AccessibleContext#getAccessibleStateSet
             * @see AccessibleState#ENABLED
             * @see AccessibleStateSet
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public FontMetrics getFontMetrics(Font f) {

            /**
             * Get the FontMetrics of this object.
             *
             * @param f the Font
             * @return the FontMetrics, if supported, the object; otherwise, null
             * @see #getFont
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setFont(Font f) {

            /**
             * Set the Font of this object.
             *
             * @param f the new Font for the object
             * @see #getFont
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Font getFont() {

            /**
             * Get the Font of this object.
             *
             * @return the Font,if supported, for the object; otherwise, null
             * @see #setFont
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setCursor(Cursor cursor) {

            /**
             * Set the Cursor of this object.
             * <p>
             * The method may have no visual effect if the Java platform
             * implementation and/or the native system do not support
             * changing the mouse cursor shape.
             * @param cursor the new Cursor for the object
             * @see #getCursor
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Cursor getCursor() {

            /**
             * Get the Cursor of this object.
             *
             * @return the Cursor, if supported, of the object; otherwise, null
             * @see #setCursor
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setForeground(Color c) {

            /**
             * Set the foreground color of this object.
             *
             * @param c the new Color for the foreground
             * @see #getForeground
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Color getForeground() {

            /**
             * Get the foreground color of this object.
             *
             * @return the foreground color, if supported, of the object;
             * otherwise, null
             * @see #setForeground
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public void setBackground(Color c) {

            /**
             * Set the background color of this object.
             *
             * @param c the new Color for the background
             * @see #setBackground
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Color getBackground() {

            /**
             * Get the background color of this object.
             *
             * @return the background color, if supported, of the object;
             * otherwise, null
             * @see #setBackground
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Accessible getAccessibleChild(int i) {

            /**
             * Return the specified Accessible child of the object.  The
             * Accessible children of an Accessible object are zero-based,
             * so the first child of an Accessible child is at index 0, the
             * second child is at index 1, and so on.
             *
             * @param i zero-based index of child
             * @return the Accessible child of the object
             * @see #getAccessibleChildrenCount
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public int getAccessibleChildrenCount() {

            /**
             * Returns the number of accessible children of the object.
             *
             * @return the number of accessible children of the object.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public int getAccessibleIndexInParent() {

            /**
             * Get the 0-based index of this object in its accessible parent.
             *
             * @return the 0-based index of this object in its parent; -1 if
             * this object does not have an accessible parent.
             *
             * @see #getAccessibleParent
             * @see #getAccessibleChildrenCount
             * @see #getAccessibleChild
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public Locale getLocale() {

            /**
             * Gets the locale of the component. If the component does not
             * have a locale, then the locale of its parent is returned.
             *
             * @return This component's locale.  If this component does not have
             * a locale, the locale of its parent is returned.
             *
             * @exception IllegalComponentStateException
             * If the Component does not have its own locale and has not yet
             * been added to a containment hierarchy such that the locale can
             * be determined from the containing parent.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public AccessibleStateSet getAccessibleStateSet() {

            /**
             * Get the state set of this object.  The AccessibleStateSet of an
             * object is composed of a set of unique AccessibleState's.  A
             * change in the AccessibleStateSet of an object will cause a
             * PropertyChangeEvent to be fired for the
             * ACCESSIBLE_STATE_PROPERTY property.
             *
             * @return an instance of AccessibleStateSet containing the
             * current state set of the object
             * @see AccessibleStateSet
             * @see AccessibleState
             * @see #addPropertyChangeListener
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public AccessibleRole getAccessibleRole() {

            /**
             * Get the role of this object.
             *
             * @return an instance of AccessibleRole describing the role of
             * the object
             * @see AccessibleRole
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
            public AccessibleContext getAccessibleContext() {

          /**
           * Gets the AccessibleContext for this object.  In the
           * implementation of the Java Accessibility API for this class,
           * return this object, which acts as its own AccessibleContext.
           *
           * @return this object
           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        protected class AccessibleAWTListChild extends AccessibleAWTComponent

       /**
        * This class implements accessibility support for
        * List children.  It provides an implementation of the
        * Java Accessibility API appropriate to list children
        * user-interface elements.
        * @since 1.3
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
         public void selectAllAccessibleSelection() {

        /**
         * Causes every selected item in the object to be selected
         * if the object supports multiple selections.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
         public void clearAccessibleSelection() {

        /**
         * Clears the selection in the object, so that nothing in the
         * object is selected.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
         public void removeAccessibleSelection(int i) {

        /**
         * Removes the specified selected item in the object from the object's
         * selection.  If the specified item isn't currently selected, this
         * method has no effect.
         *
         * @param i the zero-based index of selectable items
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
         public void addAccessibleSelection(int i) {

        /**
         * Adds the specified selected item in the object to the object's
         * selection.  If the object supports multiple selections,
         * the specified item is added to any existing selection, otherwise
         * it replaces any existing selection in the object.  If the
         * specified item is already selected, this method has no effect.
         *
         * @param i the zero-based index of selectable items
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        public boolean isAccessibleChildSelected(int i) {

        /**
         * Returns true if the current child of this object is selected.
         *
         * @param i the zero-based index of the child in this Accessible
         * object.
         * @see AccessibleContext#getAccessibleChild
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
         public Accessible getAccessibleSelection(int i) {

        /**
         * Returns an Accessible representing the specified selected item
         * in the object.  If there isn't a selection, or there are
         * fewer items selected than the integer passed in, the return
         * value will be null.
         *
         * @param i the zero-based index of selected items
         * @return an Accessible containing the selected item
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
         public int getAccessibleSelectionCount() {

        /**
         * Returns the number of items currently selected.
         * If no items are selected, the return value will be 0.
         *
         * @return the number of items currently selected.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        public AccessibleSelection getAccessibleSelection() {

        /**
         * Get the AccessibleSelection associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleSelection interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Return the nth Accessible child of the object.
         *
         * @param i zero-based index of child
         * @return the nth Accessible child of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children in the object.  If all
         * of the children of this object implement Accessible, than this
         * method should return the number of children of this object.
         *
         * @return the number of accessible children in the object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        public Accessible getAccessibleAt(Point p) {

        /**
         * Returns the Accessible child contained at the local coordinate
         * Point, if one exists.
         *
         * @return the Accessible at the specified location, if it exists
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Get the state set of this object.
         *
         * @return an instance of AccessibleState containing the current state
         * of the object
         * @see AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    protected class AccessibleAWTList extends AccessibleAWTComponent

    /**
     * This class implements accessibility support for the
     * <code>List</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to list user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> associated with this
     * <code>List</code>. For lists, the <code>AccessibleContext</code>
     * takes the form of an <code>AccessibleAWTList</code>.
     * A new <code>AccessibleAWTList</code> instance is created, if necessary.
     *
     * @return an <code>AccessibleAWTList</code> that serves as the
     *         <code>AccessibleContext</code> of this <code>List</code>
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code> and if it
     * isn't <code>null</code> adds a listener to receive
     * both item events and action events (as specified
     * by the key stored in the stream) fired by the
     * <code>List</code>.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the <code>ObjectInputStream</code> to write
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see #removeItemListener(ItemListener)
     * @see #addItemListener(ItemListener)
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable <code>ItemListeners</code>
     * and <code>ActionListeners</code> as optional data.
     * The non-serializable listeners are detected and
     * no attempt is made to serialize them.
     *
     * @serialData <code>null</code> terminated sequence of 0
     *  or more pairs; the pair consists of a <code>String</code>
     *  and an <code>Object</code>; the <code>String</code>
     *  indicates the type of object and is one of the
     *  following:
     *  <code>itemListenerK</code> indicating an
     *    <code>ItemListener</code> object;
     *  <code>actionListenerK</code> indicating an
     *    <code>ActionListener</code> object
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @see AWTEventMulticaster#save(ObjectOutputStream, String, EventListener)
     * @see java.awt.Component#itemListenerK
     * @see java.awt.Component#actionListenerK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    private int listSerializedDataVersion = 1;

    /**
     * The <code>List</code> component's
     * Serialized Data Version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * Not for public use in the future.
     * This method is expected to be retained only as a package
     * private method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    protected String paramString() {

    /**
     * Returns the parameter string representing the state of this
     * scrolling list. This string is useful for debugging.
     * @return    the parameter string of this scrolling list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    protected void processActionEvent(ActionEvent e) {

    /**
     * Processes action events occurring on this component
     * by dispatching them to any registered
     * <code>ActionListener</code> objects.
     * <p>
     * This method is not called unless action events are
     * enabled for this component. Action events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>ActionListener</code> object is registered
     * via <code>addActionListener</code>.
     * <li>Action events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the action event
     * @see         java.awt.event.ActionEvent
     * @see         java.awt.event.ActionListener
     * @see         #addActionListener
     * @see         java.awt.Component#enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    protected void processItemEvent(ItemEvent e) {

    /**
     * Processes item events occurring on this list by
     * dispatching them to any registered
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
     * @see         #addItemListener
     * @see         java.awt.Component#enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this scrolling list. If an event is
     * an instance of <code>ItemEvent</code>, it invokes the
     * <code>processItemEvent</code> method. Else, if the
     * event is an instance of <code>ActionEvent</code>,
     * it invokes <code>processActionEvent</code>.
     * If the event is not an item event or an action event,
     * it invokes <code>processEvent</code> on the superclass.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param        e the event
     * @see          java.awt.event.ActionEvent
     * @see          java.awt.event.ItemEvent
     * @see          #processActionEvent
     * @see          #processItemEvent
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>List</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>List</code> <code>l</code>
     * for its item listeners with the following code:
     *
     * <pre>ItemListener[] ils = (ItemListener[])(l.getListeners(ItemListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this list,
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized ActionListener[] getActionListeners() {

    /**
     * Returns an array of all the action listeners
     * registered on this list.
     *
     * @return all of this list's <code>ActionListener</code>s
     *         or an empty array if no action
     *         listeners are currently registered
     *
     * @see             #addActionListener
     * @see             #removeActionListener
     * @see             java.awt.event.ActionEvent
     * @see             java.awt.event.ActionListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void removeActionListener(ActionListener l) {

    /**
     * Removes the specified action listener so that it no longer
     * receives action events from this list. Action events
     * occur when a user double-clicks on a list item.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param           l     the action listener
     * @see             #addActionListener
     * @see             #getActionListeners
     * @see             java.awt.event.ActionEvent
     * @see             java.awt.event.ActionListener
     * @since           JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void addActionListener(ActionListener l) {

    /**
     * Adds the specified action listener to receive action events from
     * this list. Action events occur when a user double-clicks
     * on a list item or types Enter when the list has the keyboard
     * focus.
     * <p>
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param         l the action listener
     * @see           #removeActionListener
     * @see           #getActionListeners
     * @see           java.awt.event.ActionEvent
     * @see           java.awt.event.ActionListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized ItemListener[] getItemListeners() {

    /**
     * Returns an array of all the item listeners
     * registered on this list.
     *
     * @return all of this list's <code>ItemListener</code>s
     *         or an empty array if no item
     *         listeners are currently registered
     *
     * @see             #addItemListener
     * @see             #removeItemListener
     * @see             java.awt.event.ItemEvent
     * @see             java.awt.event.ItemListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void removeItemListener(ItemListener l) {

    /**
     * Removes the specified item listener so that it no longer
     * receives item events from this list.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param           l the item listener
     * @see             #addItemListener
     * @see             #getItemListeners
     * @see             java.awt.event.ItemEvent
     * @see             java.awt.event.ItemListener
     * @since           JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void addItemListener(ItemListener l) {

    /**
     * Adds the specified item listener to receive item events from
     * this list.  Item events are sent in response to user input, but not
     * in response to calls to <code>select</code> or <code>deselect</code>.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param         l the item listener
     * @see           #removeItemListener
     * @see           #getItemListeners
     * @see           #select
     * @see           #deselect
     * @see           java.awt.event.ItemEvent
     * @see           java.awt.event.ItemListener
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMinimumSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public Dimension getMinimumSize() {

    /**
     * Determines the minimum size of this scrolling list.
     * @return       the minimum dimensions needed
     *                        to display this scrolling list
     * @see          java.awt.Component#getMinimumSize()
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMinimumSize(int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public Dimension getMinimumSize(int rows) {

    /**
     * Gets the minimum dimensions for a list with the specified
     * number of rows.
     * @param      rows    number of rows in the list
     * @return     the minimum dimensions for displaying this scrolling list
     *             given that the specified number of rows must be visible
     * @see        java.awt.Component#getMinimumSize
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getPreferredSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public Dimension getPreferredSize() {

    /**
     * Gets the preferred size of this scrolling list.
     * @return     the preferred dimensions for displaying this scrolling list
     * @see        java.awt.Component#getPreferredSize
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getPreferredSize(int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public Dimension getPreferredSize(int rows) {

    /**
     * Gets the preferred dimensions for a list with the specified
     * number of rows.
     * @param      rows    number of rows in the list
     * @return     the preferred dimensions for displaying this scrolling list
     *             given that the specified number of rows must be visible
     * @see        java.awt.Component#getPreferredSize
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void makeVisible(int index) {

    /**
     * Makes the item at the specified index visible.
     * @param       index    the position of the item
     * @see         #getVisibleIndex
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public int getVisibleIndex() {

    /**
     * Gets the index of the item that was last made visible by
     * the method <code>makeVisible</code>.
     * @return      the index of the item that was last made visible
     * @see         #makeVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setMultipleMode(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void setMultipleMode(boolean b) {

    /**
     * Sets the flag that determines whether this list
     * allows multiple selections.
     * When the selection mode is changed from multiple-selection to
     * single-selection, the selected items change as follows:
     * If a selected item has the location cursor, only that
     * item will remain selected.  If no selected item has the
     * location cursor, all items will be deselected.
     * @param       b   if <code>true</code> then multiple selections
     *                      are allowed; otherwise, only one item from
     *                      the list can be selected at once
     * @see         #isMultipleMode
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>isMultipleMode()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public boolean isMultipleMode() {

    /**
     * Determines whether this list allows multiple selections.
     * @return     <code>true</code> if this list allows multiple
     *                 selections; otherwise, <code>false</code>
     * @see        #setMultipleMode
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public int getRows() {

    /**
     * Gets the number of visible lines in this list.  Note that
     * once the <code>List</code> has been created, this number
     * will never change.
     * @return     the number of visible lines in this scrolling list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>isIndexSelected(int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public boolean isIndexSelected(int index) {

    /**
     * Determines if the specified item in this scrolling list is
     * selected.
     * @param      index   the item to be checked
     * @return     <code>true</code> if the specified item has been
     *                       selected; <code>false</code> otherwise
     * @see        #select
     * @see        #deselect
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void deselect(int index) {

    /**
     * Deselects the item at the specified index.
     * <p>
     * Note that passing out of range parameters is invalid,
     * and will result in unspecified behavior.
     * <p>
     * If the item at the specified index is not selected,
     * then the operation is ignored.
     * @param        index the position of the item to deselect
     * @see          #select
     * @see          #getSelectedItem
     * @see          #isIndexSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void select(int index) {

    /**
     * Selects the item at the specified index in the scrolling list.
     *<p>
     * Note that passing out of range parameters is invalid,
     * and will result in unspecified behavior.
     *
     * <p>Note that this method should be primarily used to
     * initially select an item in this component.
     * Programmatically calling this method will <i>not</i> trigger
     * an <code>ItemEvent</code>.  The only way to trigger an
     * <code>ItemEvent</code> is by user interaction.
     *
     * @param        index the position of the item to select
     * @see          #getSelectedItem
     * @see          #deselect
     * @see          #isIndexSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public Object[] getSelectedObjects() {

    /**
     * Gets the selected items on this scrolling list in an array of Objects.
     * @return        an array of <code>Object</code>s representing the
     *                selected items on this scrolling list;
     *                if no item is selected, a zero-length array is returned.
     * @see #getSelectedItems
     * @see ItemSelectable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized String[] getSelectedItems() {

    /**
     * Gets the selected items on this scrolling list.
     *
     * @return        an array of the selected items on this scrolling list;
     *                if no item is selected, a zero-length array is returned.
     * @see           #select
     * @see           #deselect
     * @see           #isIndexSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized String getSelectedItem() {

    /**
     * Gets the selected item on this scrolling list.
     *
     * @return        the selected item on the list;
     *                if no item is selected, or if multiple items are
     *                selected, <code>null</code> is returned.
     * @see           #select
     * @see           #deselect
     * @see           #isIndexSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized int[] getSelectedIndexes() {

    /**
     * Gets the selected indexes on the list.
     *
     * @return        an array of the selected indexes on this scrolling list;
     *                if no item is selected, a zero-length array is returned.
     * @see           #select
     * @see           #deselect
     * @see           #isIndexSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized int getSelectedIndex() {

    /**
     * Gets the index of the selected item on the list,
     *
     * @return        the index of the selected item;
     *                if no item is selected, or if multiple items are
     *                selected, <code>-1</code> is returned.
     * @see           #select
     * @see           #deselect
     * @see           #isIndexSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated     replaced by <code>remove(String)</code>
     *                         and <code>remove(int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void remove(int position) {

    /**
     * Removes the item at the specified position
     * from this scrolling list.
     * If the item with the specified position is selected, and is the
     * only selected item in the list, the list is set to have no selection.
     * @param      position   the index of the item to delete
     * @see        #add(String, int)
     * @since      JDK1.1
     * @exception    ArrayIndexOutOfBoundsException
     *               if the <code>position</code> is less than 0 or
     *               greater than <code>getItemCount()-1</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void remove(String item) {

    /**
     * Removes the first occurrence of an item from the list.
     * If the specified item is selected, and is the only selected
     * item in the list, the list is set to have no selection.
     * @param        item  the item to remove from the list
     * @exception    IllegalArgumentException
     *                     if the item doesn't exist in the list
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>removeAll()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void removeAll() {

    /**
     * Removes all items from this list.
     * @see #remove
     * @see #delItems
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized void replaceItem(String newValue, int index) {

    /**
     * Replaces the item at the specified index in the scrolling list
     * with the new string.
     * @param       newValue   a new string to replace an existing item
     * @param       index      the position of the item to replace
     * @exception ArrayIndexOutOfBoundsException if <code>index</code>
     *          is out of range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated      replaced by <code>add(String, int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void add(String item, int index) {

    /**
     * Adds the specified item to the the scrolling list
     * at the position indicated by the index.  The index is
     * zero-based.  If the value of the index is less than zero,
     * or if the value of the index is greater than or equal to
     * the number of items in the list, then the item is added
     * to the end of the list.
     * @param       item   the item to be added;
     *              if this parameter is <code>null</code> then the item is
     *              treated as an empty string, <code>""</code>
     * @param       index  the position at which to add the item
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated      replaced by <code>add(String)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void add(String item) {

    /**
     * Adds the specified item to the end of scrolling list.
     * @param item the item to be added
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public synchronized String[] getItems() {

    /**
     * Gets the items in the list.
     * @return       a string array containing items of the list
     * @see          #select
     * @see          #deselect
     * @see          #isIndexSelected
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public String getItem(int index) {

    /**
     * Gets the item associated with the specified index.
     * @return       an item that is associated with
     *                    the specified index
     * @param        index the position of the item
     * @see          #getItemCount
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getItemCount()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public int getItemCount() {

    /**
     * Gets the number of items in the list.
     * @return     the number of items in the list
     * @see        #getItem
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void removeNotify() {

    /**
     * Removes the peer for this list.  The peer allows us to modify the
     * list's appearance without changing its functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public void addNotify() {

    /**
     * Creates the peer for the list.  The peer allows us to modify the
     * list's appearance without changing its functionality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by
     * <code>getName</code> when the name is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public List(int rows, boolean multipleMode) throws HeadlessException {

    /**
     * Creates a new scrolling list initialized to display the specified
     * number of rows. Note that if zero rows are specified, then
     * the list will be created with a default of four rows.
     * Also note that the number of visible rows in the list cannot
     * be changed after it has been created.
     * If the value of <code>multipleMode</code> is
     * <code>true</code>, then the user can select multiple items from
     * the list. If it is <code>false</code>, only one item at a time
     * can be selected.
     * @param       rows   the number of items to show.
     * @param       multipleMode   if <code>true</code>,
     *                     then multiple selections are allowed;
     *                     otherwise, only one item can be selected at a time.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    final static int    DEFAULT_VISIBLE_ROWS = 4;

    /**
     * The default number of visible rows is 4.  A list with
     * zero rows is unusable and unsightly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public List(int rows) throws HeadlessException {

    /**
     * Creates a new scrolling list initialized with the specified
     * number of visible lines. By default, multiple selections are
     * not allowed.  Note that this is a convenience method for
     * <code>List(rows, false)</code>.  Also note that the number
     * of visible rows in the list cannot be changed after it has
     * been created.
     * @param       rows the number of items to show.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    public List() throws HeadlessException {

    /**
     * Creates a new scrolling list.
     * By default, there are four visible lines and multiple selections are
     * not allowed.  Note that this is a convenience method for
     * <code>List(0, false)</code>.  Also note that the number of visible
     * lines in the list cannot be changed after it has been created.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    int         visibleIndex = -1;

    /**
     * This variable contains the value that will be used
     * when trying to make a particular list item visible.
     *
     * @serial
     * @see #makeVisible(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    int         selected[] = new int[0];

    /**
     * <code>selected</code> is an array that will contain
     * the indices of items that have been selected.
     *
     * @serial
     * @see #getSelectedIndexes()
     * @see #getSelectedIndex()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    boolean     multipleMode = false;

    /**
     * <code>multipleMode</code> is a variable that will
     * be set to <code>true</code> if a list component is to be set to
     * multiple selection mode, that is where the user can
     * select more than one item in a list at one time.
     * <code>multipleMode</code> will be set to false if the
     * list component is set to single selection, that is where
     * the user can only select one item on the list at any
     * one time.
     *
     * @serial
     * @see #isMultipleMode()
     * @see #setMultipleMode(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
    int         rows = 0;

    /**
     * This field will represent the number of visible rows in the
     * <code>List</code> Component.  It is specified only once, and
     * that is when the list component is actually
     * created.  It will never change.
     *
     * @serial
     * @see #getRows()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/List.java
public class List extends Component implements ItemSelectable, Accessible {

/**
 * The <code>List</code> component presents the user with a
 * scrolling list of text items. The list can be set up so that
 * the user can choose either one item or multiple items.
 * <p>
 * For example, the code&nbsp;.&nbsp;.&nbsp;.
 *
 * <hr><blockquote><pre>
 * List lst = new List(4, false);
 * lst.add("Mercury");
 * lst.add("Venus");
 * lst.add("Earth");
 * lst.add("JavaSoft");
 * lst.add("Mars");
 * lst.add("Jupiter");
 * lst.add("Saturn");
 * lst.add("Uranus");
 * lst.add("Neptune");
 * lst.add("Pluto");
 * cnt.add(lst);
 * </pre></blockquote><hr>
 * <p>
 * where <code>cnt</code> is a container, produces the following
 * scrolling list:
 * <p>
 * <img src="doc-files/List-1.gif"
 * alt="Shows a list containing: Venus, Earth, JavaSoft, and Mars. Javasoft is selected." style="float:center; margin: 7px 10px;">
 * <p>
 * If the List allows multiple selections, then clicking on
 * an item that is already selected deselects it. In the preceding
 * example, only one item from the scrolling list can be selected
 * at a time, since the second argument when creating the new scrolling
 * list is <code>false</code>. If the List does not allow multiple
 * selections, selecting an item causes any other selected item
 * to be deselected.
 * <p>
 * Note that the list in the example shown was created with four visible
 * rows.  Once the list has been created, the number of visible rows
 * cannot be changed.  A default <code>List</code> is created with
 * four rows, so that <code>lst = new List()</code> is equivalent to
 * <code>list = new List(4, false)</code>.
 * <p>
 * Beginning with Java&nbsp;1.1, the Abstract Window Toolkit
 * sends the <code>List</code> object all mouse, keyboard, and focus events
 * that occur over it. (The old AWT event model is being maintained
 * only for backwards compatibility, and its use is discouraged.)
 * <p>
 * When an item is selected or deselected by the user, AWT sends an instance
 * of <code>ItemEvent</code> to the list.
 * When the user double-clicks on an item in a scrolling list,
 * AWT sends an instance of <code>ActionEvent</code> to the
 * list following the item event. AWT also generates an action event
 * when the user presses the return key while an item in the
 * list is selected.
 * <p>
 * If an application wants to perform some action based on an item
 * in this list being selected or activated by the user, it should implement
 * <code>ItemListener</code> or <code>ActionListener</code>
 * as appropriate and register the new listener to receive
 * events from this list.
 * <p>
 * For multiple-selection scrolling lists, it is considered a better
 * user interface to use an external gesture (such as clicking on a
 * button) to trigger the action.
 * @author      Sami Shaio
 * @see         java.awt.event.ItemEvent
 * @see         java.awt.event.ItemListener
 * @see         java.awt.event.ActionEvent
 * @see         java.awt.event.ActionListener
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    @Override

    /**
     * Creates a {@link Spliterator} over the elements in this list.
     *
     * <p>The {@code Spliterator} reports {@link Spliterator#SIZED} and
     * {@link Spliterator#ORDERED}.  Implementations should document the
     * reporting of additional characteristic values.
     *
     * @implSpec
     * The default implementation creates a
     * <em><a href="Spliterator.html#binding">late-binding</a></em> spliterator
     * from the list's {@code Iterator}.  The spliterator inherits the
     * <em>fail-fast</em> properties of the list's iterator.
     *
     * @implNote
     * The created {@code Spliterator} additionally reports
     * {@link Spliterator#SUBSIZED}.
     *
     * @return a {@code Spliterator} over the elements in this list
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    List<E> subList(int fromIndex, int toIndex);

    /**
     * Returns a view of the portion of this list between the specified
     * <tt>fromIndex</tt>, inclusive, and <tt>toIndex</tt>, exclusive.  (If
     * <tt>fromIndex</tt> and <tt>toIndex</tt> are equal, the returned list is
     * empty.)  The returned list is backed by this list, so non-structural
     * changes in the returned list are reflected in this list, and vice-versa.
     * The returned list supports all of the optional list operations supported
     * by this list.<p>
     *
     * This method eliminates the need for explicit range operations (of
     * the sort that commonly exist for arrays).  Any operation that expects
     * a list can be used as a range operation by passing a subList view
     * instead of a whole list.  For example, the following idiom
     * removes a range of elements from a list:
     * <pre>{@code
     *      list.subList(from, to).clear();
     * }</pre>
     * Similar idioms may be constructed for <tt>indexOf</tt> and
     * <tt>lastIndexOf</tt>, and all of the algorithms in the
     * <tt>Collections</tt> class can be applied to a subList.<p>
     *
     * The semantics of the list returned by this method become undefined if
     * the backing list (i.e., this list) is <i>structurally modified</i> in
     * any way other than via the returned list.  (Structural modifications are
     * those that change the size of this list, or otherwise perturb it in such
     * a fashion that iterations in progress may yield incorrect results.)
     *
     * @param fromIndex low endpoint (inclusive) of the subList
     * @param toIndex high endpoint (exclusive) of the subList
     * @return a view of the specified range within this list
     * @throws IndexOutOfBoundsException for an illegal endpoint index value
     *         (<tt>fromIndex &lt; 0 || toIndex &gt; size ||
     *         fromIndex &gt; toIndex</tt>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    ListIterator<E> listIterator(int index);

    /**
     * Returns a list iterator over the elements in this list (in proper
     * sequence), starting at the specified position in the list.
     * The specified index indicates the first element that would be
     * returned by an initial call to {@link ListIterator#next next}.
     * An initial call to {@link ListIterator#previous previous} would
     * return the element with the specified index minus one.
     *
     * @param index index of the first element to be returned from the
     *        list iterator (by a call to {@link ListIterator#next next})
     * @return a list iterator over the elements in this list (in proper
     *         sequence), starting at the specified position in the list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > size()})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    ListIterator<E> listIterator();

    /**
     * Returns a list iterator over the elements in this list (in proper
     * sequence).
     *
     * @return a list iterator over the elements in this list (in proper
     *         sequence)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    int lastIndexOf(Object o);

    /**
     * Returns the index of the last occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * More formally, returns the highest index <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
     * or -1 if there is no such index.
     *
     * @param o element to search for
     * @return the index of the last occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this list
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    int indexOf(Object o);

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * More formally, returns the lowest index <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
     * or -1 if there is no such index.
     *
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this list
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    E remove(int index);

    /**
     * Removes the element at the specified position in this list (optional
     * operation).  Shifts any subsequent elements to the left (subtracts one
     * from their indices).  Returns the element that was removed from the
     * list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws UnsupportedOperationException if the <tt>remove</tt> operation
     *         is not supported by this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    void add(int index, E element);

    /**
     * Inserts the specified element at the specified position in this list
     * (optional operation).  Shifts the element currently at that position
     * (if any) and any subsequent elements to the right (adds one to their
     * indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws UnsupportedOperationException if the <tt>add</tt> operation
     *         is not supported by this list
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this list
     * @throws NullPointerException if the specified element is null and
     *         this list does not permit null elements
     * @throws IllegalArgumentException if some property of the specified
     *         element prevents it from being added to this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt; size()</tt>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    E set(int index, E element);

    /**
     * Replaces the element at the specified position in this list with the
     * specified element (optional operation).
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws UnsupportedOperationException if the <tt>set</tt> operation
     *         is not supported by this list
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this list
     * @throws NullPointerException if the specified element is null and
     *         this list does not permit null elements
     * @throws IllegalArgumentException if some property of the specified
     *         element prevents it from being added to this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    E get(int index);

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    int hashCode();

    /**
     * Returns the hash code value for this list.  The hash code of a list
     * is defined to be the result of the following calculation:
     * <pre>{@code
     *     int hashCode = 1;
     *     for (E e : list)
     *         hashCode = 31*hashCode + (e==null ? 0 : e.hashCode());
     * }</pre>
     * This ensures that <tt>list1.equals(list2)</tt> implies that
     * <tt>list1.hashCode()==list2.hashCode()</tt> for any two lists,
     * <tt>list1</tt> and <tt>list2</tt>, as required by the general
     * contract of {@link Object#hashCode}.
     *
     * @return the hash code value for this list
     * @see Object#equals(Object)
     * @see #equals(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    boolean equals(Object o);

    /**
     * Compares the specified object with this list for equality.  Returns
     * <tt>true</tt> if and only if the specified object is also a list, both
     * lists have the same size, and all corresponding pairs of elements in
     * the two lists are <i>equal</i>.  (Two elements <tt>e1</tt> and
     * <tt>e2</tt> are <i>equal</i> if <tt>(e1==null ? e2==null :
     * e1.equals(e2))</tt>.)  In other words, two lists are defined to be
     * equal if they contain the same elements in the same order.  This
     * definition ensures that the equals method works properly across
     * different implementations of the <tt>List</tt> interface.
     *
     * @param o the object to be compared for equality with this list
     * @return <tt>true</tt> if the specified object is equal to this list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    void clear();

    /**
     * Removes all of the elements from this list (optional operation).
     * The list will be empty after this call returns.
     *
     * @throws UnsupportedOperationException if the <tt>clear</tt> operation
     *         is not supported by this list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    @SuppressWarnings({"unchecked", "rawtypes"})

    /**
     * Sorts this list according to the order induced by the specified
     * {@link Comparator}.
     *
     * <p>All elements in this list must be <i>mutually comparable</i> using the
     * specified comparator (that is, {@code c.compare(e1, e2)} must not throw
     * a {@code ClassCastException} for any elements {@code e1} and {@code e2}
     * in the list).
     *
     * <p>If the specified comparator is {@code null} then all elements in this
     * list must implement the {@link Comparable} interface and the elements'
     * {@linkplain Comparable natural ordering} should be used.
     *
     * <p>This list must be modifiable, but need not be resizable.
     *
     * @implSpec
     * The default implementation obtains an array containing all elements in
     * this list, sorts the array, and iterates over this list resetting each
     * element from the corresponding position in the array. (This avoids the
     * n<sup>2</sup> log(n) performance that would result from attempting
     * to sort a linked list in place.)
     *
     * @implNote
     * This implementation is a stable, adaptive, iterative mergesort that
     * requires far fewer than n lg(n) comparisons when the input array is
     * partially sorted, while offering the performance of a traditional
     * mergesort when the input array is randomly ordered.  If the input array
     * is nearly sorted, the implementation requires approximately n
     * comparisons.  Temporary storage requirements vary from a small constant
     * for nearly sorted input arrays to n/2 object references for randomly
     * ordered input arrays.
     *
     * <p>The implementation takes equal advantage of ascending and
     * descending order in its input array, and can take advantage of
     * ascending and descending order in different parts of the same
     * input array.  It is well-suited to merging two or more sorted arrays:
     * simply concatenate the arrays and sort the resulting array.
     *
     * <p>The implementation was adapted from Tim Peters's list sort for Python
     * (<a href="http://svn.python.org/projects/python/trunk/Objects/listsort.txt">
     * TimSort</a>).  It uses techniques from Peter McIlroy's "Optimistic
     * Sorting and Information Theoretic Complexity", in Proceedings of the
     * Fourth Annual ACM-SIAM Symposium on Discrete Algorithms, pp 467-474,
     * January 1993.
     *
     * @param c the {@code Comparator} used to compare list elements.
     *          A {@code null} value indicates that the elements'
     *          {@linkplain Comparable natural ordering} should be used
     * @throws ClassCastException if the list contains elements that are not
     *         <i>mutually comparable</i> using the specified comparator
     * @throws UnsupportedOperationException if the list's list-iterator does
     *         not support the {@code set} operation
     * @throws IllegalArgumentException
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     *         if the comparator is found to violate the {@link Comparator}
     *         contract
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    default void replaceAll(UnaryOperator<E> operator) {

    /**
     * Replaces each element of this list with the result of applying the
     * operator to that element.  Errors or runtime exceptions thrown by
     * the operator are relayed to the caller.
     *
     * @implSpec
     * The default implementation is equivalent to, for this {@code list}:
     * <pre>{@code
     *     final ListIterator<E> li = list.listIterator();
     *     while (li.hasNext()) {
     *         li.set(operator.apply(li.next()));
     *     }
     * }</pre>
     *
     * If the list's list-iterator does not support the {@code set} operation
     * then an {@code UnsupportedOperationException} will be thrown when
     * replacing the first element.
     *
     * @param operator the operator to apply to each element
     * @throws UnsupportedOperationException if this list is unmodifiable.
     *         Implementations may throw this exception if an element
     *         cannot be replaced or if, in general, modification is not
     *         supported
     * @throws NullPointerException if the specified operator is null or
     *         if the operator result is a null value and this list does
     *         not permit null elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>)
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    boolean retainAll(Collection<?> c);

    /**
     * Retains only the elements in this list that are contained in the
     * specified collection (optional operation).  In other words, removes
     * from this list all of its elements that are not contained in the
     * specified collection.
     *
     * @param c collection containing elements to be retained in this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>retainAll</tt> operation
     *         is not supported by this list
     * @throws ClassCastException if the class of an element of this list
     *         is incompatible with the specified collection
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if this list contains a null element and the
     *         specified collection does not permit null elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>),
     *         or if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    boolean removeAll(Collection<?> c);

    /**
     * Removes from this list all of its elements that are contained in the
     * specified collection (optional operation).
     *
     * @param c collection containing elements to be removed from this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>removeAll</tt> operation
     *         is not supported by this list
     * @throws ClassCastException if the class of an element of this list
     *         is incompatible with the specified collection
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if this list contains a null element and the
     *         specified collection does not permit null elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>),
     *         or if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    boolean addAll(int index, Collection<? extends E> c);

    /**
     * Inserts all of the elements in the specified collection into this
     * list at the specified position (optional operation).  Shifts the
     * element currently at that position (if any) and any subsequent
     * elements to the right (increases their indices).  The new elements
     * will appear in this list in the order that they are returned by the
     * specified collection's iterator.  The behavior of this operation is
     * undefined if the specified collection is modified while the
     * operation is in progress.  (Note that this will occur if the specified
     * collection is this list, and it's nonempty.)
     *
     * @param index index at which to insert the first element from the
     *              specified collection
     * @param c collection containing elements to be added to this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>addAll</tt> operation
     *         is not supported by this list
     * @throws ClassCastException if the class of an element of the specified
     *         collection prevents it from being added to this list
     * @throws NullPointerException if the specified collection contains one
     *         or more null elements and this list does not permit null
     *         elements, or if the specified collection is null
     * @throws IllegalArgumentException if some property of an element of the
     *         specified collection prevents it from being added to this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt; size()</tt>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    boolean addAll(Collection<? extends E> c);

    /**
     * Appends all of the elements in the specified collection to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator (optional operation).  The behavior of this
     * operation is undefined if the specified collection is modified while
     * the operation is in progress.  (Note that this will occur if the
     * specified collection is this list, and it's nonempty.)
     *
     * @param c collection containing elements to be added to this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>addAll</tt> operation
     *         is not supported by this list
     * @throws ClassCastException if the class of an element of the specified
     *         collection prevents it from being added to this list
     * @throws NullPointerException if the specified collection contains one
     *         or more null elements and this list does not permit null
     *         elements, or if the specified collection is null
     * @throws IllegalArgumentException if some property of an element of the
     *         specified collection prevents it from being added to this list
     * @see #add(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    boolean containsAll(Collection<?> c);

    /**
     * Returns <tt>true</tt> if this list contains all of the elements of the
     * specified collection.
     *
     * @param  c collection to be checked for containment in this list
     * @return <tt>true</tt> if this list contains all of the elements of the
     *         specified collection
     * @throws ClassCastException if the types of one or more elements
     *         in the specified collection are incompatible with this
     *         list
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified collection contains one
     *         or more null elements and this list does not permit null
     *         elements
     *         (<a href="Collection.html#optional-restrictions">optional</a>),
     *         or if the specified collection is null
     * @see #contains(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    boolean remove(Object o);

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present (optional operation).  If this list does not contain
     * the element, it is unchanged.  More formally, removes the element with
     * the lowest index <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>
     * (if such an element exists).  Returns <tt>true</tt> if this list
     * contained the specified element (or equivalently, if this list changed
     * as a result of the call).
     *
     * @param o element to be removed from this list, if present
     * @return <tt>true</tt> if this list contained the specified element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this list
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws UnsupportedOperationException if the <tt>remove</tt> operation
     *         is not supported by this list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    boolean add(E e);

    /**
     * Appends the specified element to the end of this list (optional
     * operation).
     *
     * <p>Lists that support this operation may place limitations on what
     * elements may be added to this list.  In particular, some
     * lists will refuse to add null elements, and others will impose
     * restrictions on the type of elements that may be added.  List
     * classes should clearly specify in their documentation any restrictions
     * on what elements may be added.
     *
     * @param e element to be appended to this list
     * @return <tt>true</tt> (as specified by {@link Collection#add})
     * @throws UnsupportedOperationException if the <tt>add</tt> operation
     *         is not supported by this list
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this list
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     * @throws IllegalArgumentException if some property of this element
     *         prevents it from being added to this list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    <T> T[] toArray(T[] a);

    /**
     * Returns an array containing all of the elements in this list in
     * proper sequence (from first to last element); the runtime type of
     * the returned array is that of the specified array.  If the list fits
     * in the specified array, it is returned therein.  Otherwise, a new
     * array is allocated with the runtime type of the specified array and
     * the size of this list.
     *
     * <p>If the list fits in the specified array with room to spare (i.e.,
     * the array has more elements than the list), the element in the array
     * immediately following the end of the list is set to <tt>null</tt>.
     * (This is useful in determining the length of the list <i>only</i> if
     * the caller knows that the list does not contain any null elements.)
     *
     * <p>Like the {@link #toArray()} method, this method acts as bridge between
     * array-based and collection-based APIs.  Further, this method allows
     * precise control over the runtime type of the output array, and may,
     * under certain circumstances, be used to save allocation costs.
     *
     * <p>Suppose <tt>x</tt> is a list known to contain only strings.
     * The following code can be used to dump the list into a newly
     * allocated array of <tt>String</tt>:
     *
     * <pre>{@code
     *     String[] y = x.toArray(new String[0]);
     * }</pre>
     *
     * Note that <tt>toArray(new Object[0])</tt> is identical in function to
     * <tt>toArray()</tt>.
     *
     * @param a the array into which the elements of this list are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose.
     * @return an array containing the elements of this list
     * @throws ArrayStoreException if the runtime type of the specified array
     *         is not a supertype of the runtime type of every element in
     *         this list
     * @throws NullPointerException if the specified array is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    Object[] toArray();

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence (from first to last element).
     *
     * <p>The returned array will be "safe" in that no references to it are
     * maintained by this list.  (In other words, this method must
     * allocate a new array even if this list is backed by an array).
     * The caller is thus free to modify the returned array.
     *
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this list in proper
     *         sequence
     * @see Arrays#asList(Object[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    Iterator<E> iterator();

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     *
     * @return an iterator over the elements in this list in proper sequence
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    boolean contains(Object o);

    /**
     * Returns <tt>true</tt> if this list contains the specified element.
     * More formally, returns <tt>true</tt> if and only if this list contains
     * at least one element <tt>e</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
     *
     * @param o element whose presence in this list is to be tested
     * @return <tt>true</tt> if this list contains the specified element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this list
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    boolean isEmpty();

    /**
     * Returns <tt>true</tt> if this list contains no elements.
     *
     * @return <tt>true</tt> if this list contains no elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
    int size();

    /**
     * Returns the number of elements in this list.  If this list contains
     * more than <tt>Integer.MAX_VALUE</tt> elements, returns
     * <tt>Integer.MAX_VALUE</tt>.
     *
     * @return the number of elements in this list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/List.java
public interface List<E> extends Collection<E> {

/**
 * An ordered collection (also known as a <i>sequence</i>).  The user of this
 * interface has precise control over where in the list each element is
 * inserted.  The user can access elements by their integer index (position in
 * the list), and search for elements in the list.<p>
 *
 * Unlike sets, lists typically allow duplicate elements.  More formally,
 * lists typically allow pairs of elements <tt>e1</tt> and <tt>e2</tt>
 * such that <tt>e1.equals(e2)</tt>, and they typically allow multiple
 * null elements if they allow null elements at all.  It is not inconceivable
 * that someone might wish to implement a list that prohibits duplicates, by
 * throwing runtime exceptions when the user attempts to insert them, but we
 * expect this usage to be rare.<p>
 *
 * The <tt>List</tt> interface places additional stipulations, beyond those
 * specified in the <tt>Collection</tt> interface, on the contracts of the
 * <tt>iterator</tt>, <tt>add</tt>, <tt>remove</tt>, <tt>equals</tt>, and
 * <tt>hashCode</tt> methods.  Declarations for other inherited methods are
 * also included here for convenience.<p>
 *
 * The <tt>List</tt> interface provides four methods for positional (indexed)
 * access to list elements.  Lists (like Java arrays) are zero based.  Note
 * that these operations may execute in time proportional to the index value
 * for some implementations (the <tt>LinkedList</tt> class, for
 * example). Thus, iterating over the elements in a list is typically
 * preferable to indexing through it if the caller does not know the
 * implementation.<p>
 *
 * The <tt>List</tt> interface provides a special iterator, called a
 * <tt>ListIterator</tt>, that allows element insertion and replacement, and
 * bidirectional access in addition to the normal operations that the
 * <tt>Iterator</tt> interface provides.  A method is provided to obtain a
 * list iterator that starts at a specified position in the list.<p>
 *
 * The <tt>List</tt> interface provides two methods to search for a specified
 * object.  From a performance standpoint, these methods should be used with
 * caution.  In many implementations they will perform costly linear
 * searches.<p>
 *
 * The <tt>List</tt> interface provides two methods to efficiently insert and
 * remove multiple elements at an arbitrary point in the list.<p>
 *
 * Note: While it is permissible for lists to contain themselves as elements,
 * extreme caution is advised: the <tt>equals</tt> and <tt>hashCode</tt>
 * methods are no longer well defined on such a list.
 *
 * <p>Some list implementations have restrictions on the elements that
 * they may contain.  For example, some implementations prohibit null elements,
 * and some have restrictions on the types of their elements.  Attempting to
 * add an ineligible element throws an unchecked exception, typically
 * <tt>NullPointerException</tt> or <tt>ClassCastException</tt>.  Attempting
 * to query the presence of an ineligible element may throw an exception,
 * or it may simply return false; some implementations will exhibit the former
 * behavior and some will exhibit the latter.  More generally, attempting an
 * operation on an ineligible element whose completion would not result in
 * the insertion of an ineligible element into the list may throw an
 * exception or it may succeed, at the option of the implementation.
 * Such exceptions are marked as "optional" in the specification for this
 * interface.
 *
 * <p>This interface is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @param <E> the type of elements in this list
 *
 * @author  Josh Bloch
 * @author  Neal Gafter
 * @see Collection
 * @see Set
 * @see ArrayList
 * @see LinkedList
 * @see Vector
 * @see Arrays#asList(Object[])
 * @see Collections#nCopies(int, Object)
 * @see Collections#EMPTY_LIST
 * @see AbstractList
 * @see AbstractSequentialList
 * @since 1.2
 */
