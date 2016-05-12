_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    AccessibleStateSet getAccessibleStateSet() {

    /**
     * Gets the state of this object.
     *
     * @return an instance of <code>AccessibleStateSet</code>
     *     containing the current state set of the object
     * @see AccessibleState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    int getAccessibleChildIndex(MenuComponent child) {

    /**
     * Gets the index of the child within this MenuComponent.
     *
     * @param child MenuComponent whose index we are interested in.
     * @return -1 if this object doesn't contain the child,
     *      otherwise, index of the child.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    int getAccessibleIndexInParent() {

    /**
     * Gets the index of this object in its accessible parent.
     *
     * @return -1 if this object does not have an accessible parent;
     *      otherwise, the index of the child in its accessible parent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public void selectAllAccessibleSelection() {

        /**
         * Causes every child of the object to be selected
         * if the object supports multiple selections.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public void clearAccessibleSelection() {

        /**
         * Clears the selection in the object, so that no children in the
         * object are selected.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public void removeAccessibleSelection(int i) {

        /**
         * Removes the specified child of the object from the object's
         * selection.  If the specified item isn't currently selected, this
         * method has no effect.
         *
         * @param i the zero-based index of the child
         * @see AccessibleContext#getAccessibleChild
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public void addAccessibleSelection(int i) {

        /**
         * Adds the specified <code>Accessible</code> child of the object
         * to the object's selection.  If the object supports multiple selections,
         * the specified child is added to any existing selection, otherwise
         * it replaces any existing selection in the object.  If the
         * specified child is already selected, this method has no effect.
         *
         * @param i the zero-based index of the child
         * @see AccessibleContext#getAccessibleChild
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public boolean isAccessibleChildSelected(int i) {

        /**
         * Determines if the current child of this object is selected.
         *
         * @return true if the current child of this object is selected;
         *    else false
         * @param i the zero-based index of the child in this
         *      <code>Accessible</code> object
         * @see AccessibleContext#getAccessibleChild
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public Accessible getAccessibleSelection(int i) {

        /**
         * Returns an <code>Accessible</code> representing the specified
         * selected child in the object.  If there isn't a selection, or there are
         * fewer children selected than the integer passed in, the return
         * value will be <code>null</code>.
         * <p>Note that the index represents the i-th selected child, which
         * is different from the i-th child.
         *
         * @param i the zero-based index of selected children
         * @return the i-th selected child
         * @see #getAccessibleSelectionCount
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public int getAccessibleSelectionCount() {

        /**
         * Returns the number of <code>Accessible</code> children currently selected.
         * If no children are selected, the return value will be 0.
         *
         * @return the number of items currently selected
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void removeFocusListener(java.awt.event.FocusListener l) {

        /**
         * Removes the specified focus listener so it no longer receives focus
         * events from this component.
         *
         * @param l the focus listener
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void addFocusListener(java.awt.event.FocusListener l) {

        /**
         * Adds the specified focus listener to receive focus events from this
         * component.
         *
         * @param l the focus listener
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void requestFocus() {

        /**
         * Requests focus for this object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public boolean isFocusTraversable() {

        /**
         * Returns whether this object can accept focus or not.
         *
         * @return true if object can accept focus; otherwise false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Accessible getAccessibleAt(Point p) {

        /**
         * Returns the <code>Accessible</code> child, if one exists,
         * contained at the local coordinate <code>Point</code>.
         * If there is no <code>Accessible</code> child, <code>null</code>
         * is returned.
         *
         * @param p the point defining the top-left corner of the
         *    <code>Accessible</code>, given in the coordinate space
         *    of the object's parent
         * @return the <code>Accessible</code>, if it exists,
         *    at the specified location; else <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setSize(Dimension d) {

        /**
         * Resizes this object.
         *
         * @param d - the <code>Dimension</code> specifying the
         *    new size of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Dimension getSize() {

        /**
         * Returns the size of this object in the form of a
         * <code>Dimension</code> object. The height field of
         * the <code>Dimension</code> object contains this object's
         * height, and the width field of the <code>Dimension</code>
         * object contains this object's width.
         *
         * @return a <code>Dimension</code> object that indicates the
         *         size of this component; <code>null</code>
         *         if this object is not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setBounds(Rectangle r) {

        /**
         * Sets the bounds of this object in the form of a
         * <code>Rectangle</code> object.
         * The bounds specify this object's width, height, and location
         * relative to its parent.
         *
         * @param r a rectangle indicating this component's bounds
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Rectangle getBounds() {

        /**
         * Gets the bounds of this object in the form of a
         * <code>Rectangle</code> object.
         * The bounds specify this object's width, height, and location
         * relative to its parent.
         *
         * @return a rectangle indicating this component's bounds;
         *     <code>null</code> if this object is not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setLocation(Point p) {

        /**
         * Sets the location of the object relative to the parent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Point getLocation() {

        /**
         * Gets the location of the object relative to the parent in the form
         * of a point specifying the object's top-left corner in the screen's
         * coordinate space.
         *
         * @return an instance of <code>Point</code> representing the
         *    top-left corner of the object's bounds in the coordinate
         *    space of the screen; <code>null</code> if
         *    this object or its parent are not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Point getLocationOnScreen() {

        /**
         * Returns the location of the object on the screen.
         *
         * @return location of object on screen -- can be <code>null</code>
         *     if this object is not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public boolean contains(Point p) {

        /**
         * Checks whether the specified point is within this object's bounds,
         * where the point's x and y coordinates are defined to be relative to
         * the coordinate system of the object.
         *
         * @param p the <code>Point</code> relative to the coordinate
         *     system of the object
         * @return true if object contains <code>Point</code>; otherwise false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public boolean isShowing() {

        /**
         * Determines if the object is showing.  This is determined by checking
         * the visibility of the object and ancestors of the object.  Note:
         * this will return true even if the object is obscured by another
         * (for example, it happens to be underneath a menu that was pulled
         * down).
         *
         * @return true if object is showing; otherwise, false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setVisible(boolean b) {

        /**
         * Sets the visible state of the object.
         *
         * @param b if true, shows this object; otherwise, hides it
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public boolean isVisible() {

        /**
         * Determines if the object is visible.  Note: this means that the
         * object intends to be visible; however, it may not in fact be
         * showing on the screen because one of the objects that this object
         * is contained by is not visible.  To determine if an object is
         * showing on the screen, use <code>isShowing</code>.
         *
         * @return true if object is visible; otherwise, false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setEnabled(boolean b) {

        /**
         * Sets the enabled state of the object.
         *
         * @param b if true, enables this object; otherwise, disables it
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public boolean isEnabled() {

        /**
         * Determines if the object is enabled.
         *
         * @return true if object is enabled; otherwise, false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public FontMetrics getFontMetrics(Font f) {

        /**
         * Gets the <code>FontMetrics</code> of this object.
         *
         * @param f the <code>Font</code>
         * @return the FontMetrics, if supported, the object;
         *              otherwise, <code>null</code>
         * @see #getFont
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setFont(Font f) {

        /**
         * Sets the <code>Font</code> of this object.
         *
         * @param f the new <code>Font</code> for the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Font getFont() {

        /**
         * Gets the <code>Font</code> of this object.
         *
         * @return the <code>Font</code>,if supported, for the object;
         *     otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setCursor(Cursor cursor) {

        /**
         * Sets the <code>Cursor</code> of this object.
         * <p>
         * The method may have no visual effect if the Java platform
         * implementation and/or the native system do not support
         * changing the mouse cursor shape.
         * @param cursor the new <code>Cursor</code> for the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Cursor getCursor() {

        /**
         * Gets the <code>Cursor</code> of this object.
         *
         * @return the <code>Cursor</code>, if supported, of the object;
         *     otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setForeground(Color c) {

        /**
         * Sets the foreground color of this object.
         *
         * @param c the new <code>Color</code> for the foreground
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Color getForeground() {

        /**
         * Gets the foreground color of this object.
         *
         * @return the foreground color, if supported, of the object;
         *     otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setBackground(Color c) {

        /**
         * Sets the background color of this object.
         * (For transparency, see <code>isOpaque</code>.)
         *
         * @param c the new <code>Color</code> for the background
         * @see Component#isOpaque
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Color getBackground() {

        /**
         * Gets the background color of this object.
         *
         * @return the background color, if supported, of the object;
         *     otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public AccessibleComponent getAccessibleComponent() {

        /**
         * Gets the <code>AccessibleComponent</code> associated with
         * this object if one exists.  Otherwise return <code>null</code>.
         *
         * @return the component
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public java.util.Locale getLocale() {

        /**
         * Returns the locale of this object.
         *
         * @return the locale of this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Returns the nth <code>Accessible</code> child of the object.
         *
         * @param i zero-based index of child
         * @return the nth Accessible child of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children in the object.  If all
         * of the children of this object implement <code>Accessible</code>,
         * then this method should return the number of children of this object.
         *
         * @return the number of accessible children in the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public int getAccessibleIndexInParent() {

        /**
         * Gets the index of this object in its accessible parent.
         *
         * @return the index of this object in its parent; -1 if this
         *     object does not have an accessible parent
         * @see #getAccessibleParent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Accessible getAccessibleParent() {

        /**
         * Gets the <code>Accessible</code> parent of this object.
         * If the parent of this object implements <code>Accessible</code>,
         * this method should simply return <code>getParent</code>.
         *
         * @return the <code>Accessible</code> parent of this object -- can
         *    be <code>null</code> if this object does not have an
         *    <code>Accessible</code> parent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Gets the state of this object.
         *
         * @return an instance of <code>AccessibleStateSet</code>
         *     containing the current state set of the object
         * @see AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Gets the role of this object.
         *
         * @return an instance of <code>AccessibleRole</code>
         *     describing the role of the object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public String getAccessibleDescription() {

        /**
         * Gets the accessible description of this object.  This should be
         * a concise, localized description of what this object is - what
         * is its meaning to the user.  If the object has a tooltip, the
         * tooltip text may be an appropriate string to return, assuming
         * it contains a concise description of the object (instead of just
         * the name of the object - e.g. a "Save" icon on a toolbar that
         * had "save" as the tooltip text shouldn't return the tooltip
         * text as the description, but something like "Saves the current
         * text document" instead).
         *
         * @return the localized description of the object -- can be
         *     <code>null</code> if this object does not have a description
         * @see AccessibleContext#setAccessibleDescription
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public String getAccessibleName() {

        /**
         * Gets the accessible name of this object.  This should almost never
         * return <code>java.awt.MenuComponent.getName</code>, as that
         * generally isn't a localized name, and doesn't have meaning for the
         * user.  If the object is fundamentally a text object (e.g. a menu item), the
         * accessible name should be the text of the object (e.g. "save").
         * If the object has a tooltip, the tooltip text may also be an
         * appropriate String to return.
         *
         * @return the localized name of the object -- can be <code>null</code>
         *         if this object does not have a name
         * @see AccessibleContext#setAccessibleName
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public AccessibleSelection getAccessibleSelection() {

        /**
         * Gets the <code>AccessibleSelection</code> associated with this
         * object which allows its <code>Accessible</code> children to be selected.
         *
         * @return <code>AccessibleSelection</code> if supported by object;
         *      else return <code>null</code>
         * @see AccessibleSelection
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        protected AccessibleAWTMenuComponent() {

        /**
         * Although the class is abstract, this should be called by
         * all sub-classes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    protected abstract class AccessibleAWTMenuComponent

    /**
     * Inner class of <code>MenuComponent</code> used to provide
     * default support for accessibility.  This class is not meant
     * to be used directly by application developers, but is instead
     * meant only to be subclassed by menu component developers.
     * <p>
     * The class used to obtain the accessible role for this object.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> associated with
     * this <code>MenuComponent</code>.
     *
     * The method implemented by this base class returns <code>null</code>.
     * Classes that extend <code>MenuComponent</code>
     * should implement this method to return the
     * <code>AccessibleContext</code> associated with the subclass.
     *
     * @return the <code>AccessibleContext</code> of this
     *     <code>MenuComponent</code>
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the menu component from an object input stream.
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @serial
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    protected final Object getTreeLock() {

    /**
     * Gets this component's locking object (the object that owns the thread
     * synchronization monitor) for AWT component-tree and layout
     * operations.
     * @return this component's locking object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public String toString() {

    /**
     * Returns a representation of this menu component as a string.
     * @return  a string representation of this menu component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this
     * <code>MenuComponent</code>. This method is intended to be used
     * only for debugging purposes, and the content and format of the
     * returned string may vary between implementations. The returned
     * string may be empty but may not be <code>null</code>.
     *
     * @return     the parameter string of this menu component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events occurring on this menu component.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the event
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public final void dispatchEvent(AWTEvent e) {

    /**
     * Delivers an event to this component or one of its sub components.
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    @Deprecated

    /**
     * Posts the specified event to the menu.
     * This method is part of the Java&nbsp;1.0 event system
     * and it is maintained only for backwards compatibility.
     * Its use is discouraged, and it may not be supported
     * in the future.
     * @param evt the event which is to take place
     * @deprecated As of JDK version 1.1, replaced by {@link
     * #dispatchEvent(AWTEvent) dispatchEvent}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public void removeNotify() {

    /**
     * Removes the menu component's peer.  The peer allows us to modify the
     * appearance of the menu component without changing the functionality of
     * the menu component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public void setFont(Font f) {

    /**
     * Sets the font to be used for this menu component to the specified
     * font. This font is also used by all subcomponents of this menu
     * component, unless those subcomponents specify a different font.
     * <p>
     * Some platforms may not support setting of all font attributes
     * of a menu component; in such cases, calling <code>setFont</code>
     * will have no effect on the unsupported font attributes of this
     * menu component.  Unless subcomponents of this menu component
     * specify a different font, this font will be used by those
     * subcomponents if supported by the underlying platform.
     *
     * @param     f   the font to be set
     * @see       #getFont
     * @see       Font#getAttributes
     * @see       java.awt.font.TextAttribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public Font getFont() {

    /**
     * Gets the font used for this menu component.
     * @return   the font used in this menu component, if there is one;
     *                  <code>null</code> otherwise
     * @see     java.awt.MenuComponent#setFont
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * programs should not directly manipulate peers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public MenuContainer getParent() {

    /**
     * Returns the parent container for this menu component.
     * @return    the menu component containing this menu component,
     *                 or <code>null</code> if this menu component
     *                 is the outermost component, the menu bar itself
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public void setName(String name) {

    /**
     * Sets the name of the component to the specified string.
     * @param         name    the name of the menu component
     * @see           java.awt.MenuComponent#getName
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public String getName() {

    /**
     * Gets the name of the menu component.
     * @return        the name of the menu component
     * @see           java.awt.MenuComponent#setName(java.lang.String)
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    String constructComponentName() {

    /**
     * Constructs a name for this <code>MenuComponent</code>.
     * Called by <code>getName</code> when the name is <code>null</code>.
     * @return a name for this <code>MenuComponent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public MenuComponent() throws HeadlessException {

    /**
     * Creates a <code>MenuComponent</code>.
     * @exception HeadlessException if
     *    <code>GraphicsEnvironment.isHeadless</code>
     *    returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    boolean newEventsOnly = false;

    /**
     * Defaults to <code>false</code>.
     * @serial
     * @see #dispatchEvent(AWTEvent)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    private boolean nameExplicitlySet = false;

    /**
     * A variable to indicate whether a name is explicitly set.
     * If <code>true</code> the name will be set explicitly.
     * This defaults to <code>false</code>.
     * @serial
     * @see #setName(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    private String name;

    /**
     * The menu component's name, which defaults to <code>null</code>.
     * @serial
     * @see #getName()
     * @see #setName(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    Font font;

    /**
     * The menu component's font. This value can be
     * <code>null</code> at which point a default will be used.
     * This defaults to <code>null</code>.
     *
     * @serial
     * @see #setFont(Font)
     * @see #getFont()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    transient AppContext appContext;

    /**
     * The <code>AppContext</code> of the <code>MenuComponent</code>.
     * This is set in the constructor and never changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
public abstract class MenuComponent implements java.io.Serializable {

/**
 * The abstract class <code>MenuComponent</code> is the superclass
 * of all menu-related components. In this respect, the class
 * <code>MenuComponent</code> is analogous to the abstract superclass
 * <code>Component</code> for AWT components.
 * <p>
 * Menu components receive and process AWT events, just as components do,
 * through the method <code>processEvent</code>.
 *
 * @author      Arthur van Hoff
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    AccessibleStateSet getAccessibleStateSet() {

    /**
     * Gets the state of this object.
     *
     * @return an instance of <code>AccessibleStateSet</code>
     *     containing the current state set of the object
     * @see AccessibleState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    int getAccessibleChildIndex(MenuComponent child) {

    /**
     * Gets the index of the child within this MenuComponent.
     *
     * @param child MenuComponent whose index we are interested in.
     * @return -1 if this object doesn't contain the child,
     *      otherwise, index of the child.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    int getAccessibleIndexInParent() {

    /**
     * Gets the index of this object in its accessible parent.
     *
     * @return -1 if this object does not have an accessible parent;
     *      otherwise, the index of the child in its accessible parent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public void selectAllAccessibleSelection() {

        /**
         * Causes every child of the object to be selected
         * if the object supports multiple selections.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public void clearAccessibleSelection() {

        /**
         * Clears the selection in the object, so that no children in the
         * object are selected.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public void removeAccessibleSelection(int i) {

        /**
         * Removes the specified child of the object from the object's
         * selection.  If the specified item isn't currently selected, this
         * method has no effect.
         *
         * @param i the zero-based index of the child
         * @see AccessibleContext#getAccessibleChild
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public void addAccessibleSelection(int i) {

        /**
         * Adds the specified <code>Accessible</code> child of the object
         * to the object's selection.  If the object supports multiple selections,
         * the specified child is added to any existing selection, otherwise
         * it replaces any existing selection in the object.  If the
         * specified child is already selected, this method has no effect.
         *
         * @param i the zero-based index of the child
         * @see AccessibleContext#getAccessibleChild
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public boolean isAccessibleChildSelected(int i) {

        /**
         * Determines if the current child of this object is selected.
         *
         * @return true if the current child of this object is selected;
         *    else false
         * @param i the zero-based index of the child in this
         *      <code>Accessible</code> object
         * @see AccessibleContext#getAccessibleChild
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public Accessible getAccessibleSelection(int i) {

        /**
         * Returns an <code>Accessible</code> representing the specified
         * selected child in the object.  If there isn't a selection, or there are
         * fewer children selected than the integer passed in, the return
         * value will be <code>null</code>.
         * <p>Note that the index represents the i-th selected child, which
         * is different from the i-th child.
         *
         * @param i the zero-based index of selected children
         * @return the i-th selected child
         * @see #getAccessibleSelectionCount
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
         public int getAccessibleSelectionCount() {

        /**
         * Returns the number of <code>Accessible</code> children currently selected.
         * If no children are selected, the return value will be 0.
         *
         * @return the number of items currently selected
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void removeFocusListener(java.awt.event.FocusListener l) {

        /**
         * Removes the specified focus listener so it no longer receives focus
         * events from this component.
         *
         * @param l the focus listener
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void addFocusListener(java.awt.event.FocusListener l) {

        /**
         * Adds the specified focus listener to receive focus events from this
         * component.
         *
         * @param l the focus listener
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void requestFocus() {

        /**
         * Requests focus for this object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public boolean isFocusTraversable() {

        /**
         * Returns whether this object can accept focus or not.
         *
         * @return true if object can accept focus; otherwise false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Accessible getAccessibleAt(Point p) {

        /**
         * Returns the <code>Accessible</code> child, if one exists,
         * contained at the local coordinate <code>Point</code>.
         * If there is no <code>Accessible</code> child, <code>null</code>
         * is returned.
         *
         * @param p the point defining the top-left corner of the
         *    <code>Accessible</code>, given in the coordinate space
         *    of the object's parent
         * @return the <code>Accessible</code>, if it exists,
         *    at the specified location; else <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setSize(Dimension d) {

        /**
         * Resizes this object.
         *
         * @param d - the <code>Dimension</code> specifying the
         *    new size of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Dimension getSize() {

        /**
         * Returns the size of this object in the form of a
         * <code>Dimension</code> object. The height field of
         * the <code>Dimension</code> object contains this object's
         * height, and the width field of the <code>Dimension</code>
         * object contains this object's width.
         *
         * @return a <code>Dimension</code> object that indicates the
         *         size of this component; <code>null</code>
         *         if this object is not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setBounds(Rectangle r) {

        /**
         * Sets the bounds of this object in the form of a
         * <code>Rectangle</code> object.
         * The bounds specify this object's width, height, and location
         * relative to its parent.
         *
         * @param r a rectangle indicating this component's bounds
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Rectangle getBounds() {

        /**
         * Gets the bounds of this object in the form of a
         * <code>Rectangle</code> object.
         * The bounds specify this object's width, height, and location
         * relative to its parent.
         *
         * @return a rectangle indicating this component's bounds;
         *     <code>null</code> if this object is not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setLocation(Point p) {

        /**
         * Sets the location of the object relative to the parent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Point getLocation() {

        /**
         * Gets the location of the object relative to the parent in the form
         * of a point specifying the object's top-left corner in the screen's
         * coordinate space.
         *
         * @return an instance of <code>Point</code> representing the
         *    top-left corner of the object's bounds in the coordinate
         *    space of the screen; <code>null</code> if
         *    this object or its parent are not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Point getLocationOnScreen() {

        /**
         * Returns the location of the object on the screen.
         *
         * @return location of object on screen -- can be <code>null</code>
         *     if this object is not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public boolean contains(Point p) {

        /**
         * Checks whether the specified point is within this object's bounds,
         * where the point's x and y coordinates are defined to be relative to
         * the coordinate system of the object.
         *
         * @param p the <code>Point</code> relative to the coordinate
         *     system of the object
         * @return true if object contains <code>Point</code>; otherwise false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public boolean isShowing() {

        /**
         * Determines if the object is showing.  This is determined by checking
         * the visibility of the object and ancestors of the object.  Note:
         * this will return true even if the object is obscured by another
         * (for example, it happens to be underneath a menu that was pulled
         * down).
         *
         * @return true if object is showing; otherwise, false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setVisible(boolean b) {

        /**
         * Sets the visible state of the object.
         *
         * @param b if true, shows this object; otherwise, hides it
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public boolean isVisible() {

        /**
         * Determines if the object is visible.  Note: this means that the
         * object intends to be visible; however, it may not in fact be
         * showing on the screen because one of the objects that this object
         * is contained by is not visible.  To determine if an object is
         * showing on the screen, use <code>isShowing</code>.
         *
         * @return true if object is visible; otherwise, false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setEnabled(boolean b) {

        /**
         * Sets the enabled state of the object.
         *
         * @param b if true, enables this object; otherwise, disables it
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public boolean isEnabled() {

        /**
         * Determines if the object is enabled.
         *
         * @return true if object is enabled; otherwise, false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public FontMetrics getFontMetrics(Font f) {

        /**
         * Gets the <code>FontMetrics</code> of this object.
         *
         * @param f the <code>Font</code>
         * @return the FontMetrics, if supported, the object;
         *              otherwise, <code>null</code>
         * @see #getFont
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setFont(Font f) {

        /**
         * Sets the <code>Font</code> of this object.
         *
         * @param f the new <code>Font</code> for the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Font getFont() {

        /**
         * Gets the <code>Font</code> of this object.
         *
         * @return the <code>Font</code>,if supported, for the object;
         *     otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setCursor(Cursor cursor) {

        /**
         * Sets the <code>Cursor</code> of this object.
         * <p>
         * The method may have no visual effect if the Java platform
         * implementation and/or the native system do not support
         * changing the mouse cursor shape.
         * @param cursor the new <code>Cursor</code> for the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Cursor getCursor() {

        /**
         * Gets the <code>Cursor</code> of this object.
         *
         * @return the <code>Cursor</code>, if supported, of the object;
         *     otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setForeground(Color c) {

        /**
         * Sets the foreground color of this object.
         *
         * @param c the new <code>Color</code> for the foreground
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Color getForeground() {

        /**
         * Gets the foreground color of this object.
         *
         * @return the foreground color, if supported, of the object;
         *     otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public void setBackground(Color c) {

        /**
         * Sets the background color of this object.
         * (For transparency, see <code>isOpaque</code>.)
         *
         * @param c the new <code>Color</code> for the background
         * @see Component#isOpaque
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Color getBackground() {

        /**
         * Gets the background color of this object.
         *
         * @return the background color, if supported, of the object;
         *     otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public AccessibleComponent getAccessibleComponent() {

        /**
         * Gets the <code>AccessibleComponent</code> associated with
         * this object if one exists.  Otherwise return <code>null</code>.
         *
         * @return the component
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public java.util.Locale getLocale() {

        /**
         * Returns the locale of this object.
         *
         * @return the locale of this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Returns the nth <code>Accessible</code> child of the object.
         *
         * @param i zero-based index of child
         * @return the nth Accessible child of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children in the object.  If all
         * of the children of this object implement <code>Accessible</code>,
         * then this method should return the number of children of this object.
         *
         * @return the number of accessible children in the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public int getAccessibleIndexInParent() {

        /**
         * Gets the index of this object in its accessible parent.
         *
         * @return the index of this object in its parent; -1 if this
         *     object does not have an accessible parent
         * @see #getAccessibleParent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public Accessible getAccessibleParent() {

        /**
         * Gets the <code>Accessible</code> parent of this object.
         * If the parent of this object implements <code>Accessible</code>,
         * this method should simply return <code>getParent</code>.
         *
         * @return the <code>Accessible</code> parent of this object -- can
         *    be <code>null</code> if this object does not have an
         *    <code>Accessible</code> parent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Gets the state of this object.
         *
         * @return an instance of <code>AccessibleStateSet</code>
         *     containing the current state set of the object
         * @see AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Gets the role of this object.
         *
         * @return an instance of <code>AccessibleRole</code>
         *     describing the role of the object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public String getAccessibleDescription() {

        /**
         * Gets the accessible description of this object.  This should be
         * a concise, localized description of what this object is - what
         * is its meaning to the user.  If the object has a tooltip, the
         * tooltip text may be an appropriate string to return, assuming
         * it contains a concise description of the object (instead of just
         * the name of the object - e.g. a "Save" icon on a toolbar that
         * had "save" as the tooltip text shouldn't return the tooltip
         * text as the description, but something like "Saves the current
         * text document" instead).
         *
         * @return the localized description of the object -- can be
         *     <code>null</code> if this object does not have a description
         * @see AccessibleContext#setAccessibleDescription
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public String getAccessibleName() {

        /**
         * Gets the accessible name of this object.  This should almost never
         * return <code>java.awt.MenuComponent.getName</code>, as that
         * generally isn't a localized name, and doesn't have meaning for the
         * user.  If the object is fundamentally a text object (e.g. a menu item), the
         * accessible name should be the text of the object (e.g. "save").
         * If the object has a tooltip, the tooltip text may also be an
         * appropriate String to return.
         *
         * @return the localized name of the object -- can be <code>null</code>
         *         if this object does not have a name
         * @see AccessibleContext#setAccessibleName
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        public AccessibleSelection getAccessibleSelection() {

        /**
         * Gets the <code>AccessibleSelection</code> associated with this
         * object which allows its <code>Accessible</code> children to be selected.
         *
         * @return <code>AccessibleSelection</code> if supported by object;
         *      else return <code>null</code>
         * @see AccessibleSelection
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
        protected AccessibleAWTMenuComponent() {

        /**
         * Although the class is abstract, this should be called by
         * all sub-classes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    protected abstract class AccessibleAWTMenuComponent

    /**
     * Inner class of <code>MenuComponent</code> used to provide
     * default support for accessibility.  This class is not meant
     * to be used directly by application developers, but is instead
     * meant only to be subclassed by menu component developers.
     * <p>
     * The class used to obtain the accessible role for this object.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> associated with
     * this <code>MenuComponent</code>.
     *
     * The method implemented by this base class returns <code>null</code>.
     * Classes that extend <code>MenuComponent</code>
     * should implement this method to return the
     * <code>AccessibleContext</code> associated with the subclass.
     *
     * @return the <code>AccessibleContext</code> of this
     *     <code>MenuComponent</code>
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the menu component from an object input stream.
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @serial
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    protected final Object getTreeLock() {

    /**
     * Gets this component's locking object (the object that owns the thread
     * synchronization monitor) for AWT component-tree and layout
     * operations.
     * @return this component's locking object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public String toString() {

    /**
     * Returns a representation of this menu component as a string.
     * @return  a string representation of this menu component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this
     * <code>MenuComponent</code>. This method is intended to be used
     * only for debugging purposes, and the content and format of the
     * returned string may vary between implementations. The returned
     * string may be empty but may not be <code>null</code>.
     *
     * @return     the parameter string of this menu component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events occurring on this menu component.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the event
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public final void dispatchEvent(AWTEvent e) {

    /**
     * Delivers an event to this component or one of its sub components.
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    @Deprecated

    /**
     * Posts the specified event to the menu.
     * This method is part of the Java&nbsp;1.0 event system
     * and it is maintained only for backwards compatibility.
     * Its use is discouraged, and it may not be supported
     * in the future.
     * @param evt the event which is to take place
     * @deprecated As of JDK version 1.1, replaced by {@link
     * #dispatchEvent(AWTEvent) dispatchEvent}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public void removeNotify() {

    /**
     * Removes the menu component's peer.  The peer allows us to modify the
     * appearance of the menu component without changing the functionality of
     * the menu component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public void setFont(Font f) {

    /**
     * Sets the font to be used for this menu component to the specified
     * font. This font is also used by all subcomponents of this menu
     * component, unless those subcomponents specify a different font.
     * <p>
     * Some platforms may not support setting of all font attributes
     * of a menu component; in such cases, calling <code>setFont</code>
     * will have no effect on the unsupported font attributes of this
     * menu component.  Unless subcomponents of this menu component
     * specify a different font, this font will be used by those
     * subcomponents if supported by the underlying platform.
     *
     * @param     f   the font to be set
     * @see       #getFont
     * @see       Font#getAttributes
     * @see       java.awt.font.TextAttribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public Font getFont() {

    /**
     * Gets the font used for this menu component.
     * @return   the font used in this menu component, if there is one;
     *                  <code>null</code> otherwise
     * @see     java.awt.MenuComponent#setFont
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * programs should not directly manipulate peers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public MenuContainer getParent() {

    /**
     * Returns the parent container for this menu component.
     * @return    the menu component containing this menu component,
     *                 or <code>null</code> if this menu component
     *                 is the outermost component, the menu bar itself
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public void setName(String name) {

    /**
     * Sets the name of the component to the specified string.
     * @param         name    the name of the menu component
     * @see           java.awt.MenuComponent#getName
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public String getName() {

    /**
     * Gets the name of the menu component.
     * @return        the name of the menu component
     * @see           java.awt.MenuComponent#setName(java.lang.String)
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    String constructComponentName() {

    /**
     * Constructs a name for this <code>MenuComponent</code>.
     * Called by <code>getName</code> when the name is <code>null</code>.
     * @return a name for this <code>MenuComponent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    public MenuComponent() throws HeadlessException {

    /**
     * Creates a <code>MenuComponent</code>.
     * @exception HeadlessException if
     *    <code>GraphicsEnvironment.isHeadless</code>
     *    returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    boolean newEventsOnly = false;

    /**
     * Defaults to <code>false</code>.
     * @serial
     * @see #dispatchEvent(AWTEvent)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    private boolean nameExplicitlySet = false;

    /**
     * A variable to indicate whether a name is explicitly set.
     * If <code>true</code> the name will be set explicitly.
     * This defaults to <code>false</code>.
     * @serial
     * @see #setName(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    private String name;

    /**
     * The menu component's name, which defaults to <code>null</code>.
     * @serial
     * @see #getName()
     * @see #setName(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    Font font;

    /**
     * The menu component's font. This value can be
     * <code>null</code> at which point a default will be used.
     * This defaults to <code>null</code>.
     *
     * @serial
     * @see #setFont(Font)
     * @see #getFont()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
    transient AppContext appContext;

    /**
     * The <code>AppContext</code> of the <code>MenuComponent</code>.
     * This is set in the constructor and never changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MenuComponent.java
public abstract class MenuComponent implements java.io.Serializable {

/**
 * The abstract class <code>MenuComponent</code> is the superclass
 * of all menu-related components. In this respect, the class
 * <code>MenuComponent</code> is analogous to the abstract superclass
 * <code>Component</code> for AWT components.
 * <p>
 * Menu components receive and process AWT events, just as components do,
 * through the method <code>processEvent</code>.
 *
 * @author      Arthur van Hoff
 * @since       JDK1.0
 */
