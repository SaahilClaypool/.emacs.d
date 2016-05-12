_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Region getOpaqueShape() {

    /**
     * Returns the "opaque shape" of the component.
     *
     * The opaque shape of a lightweight components is the actual shape that
     * needs to be cut off of the heavyweight components in order to mix this
     * lightweight component correctly with them.
     *
     * The method is overriden in the java.awt.Container to handle non-opaque
     * containers containing opaque children.
     *
     * See 6637655 for details.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final Region getNormalShape() {

    /**
     * Returns the full shape of the component located in window coordinates
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private Region getAppliedShape() {

    /**
     * Returns the shape previously set with applyCompoundShape().
     * If the component is LW or no shape was applied yet,
     * the method returns the normal shape.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void applyCompoundShape(Region shape) {

    /**
     * Applies the shape to the component
     * @param shape Shape to be applied to the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final boolean areBoundsValid() {

    /**
     * Check whether we can trust the current bounds of the component.
     * The return value of false indicates that the container of the
     * component is invalid, and therefore needs to be layed out, which would
     * probably mean changing the bounds of its children.
     * Null-layout of the container or absence of the container mean
     * the bounds of the component are final and can be trusted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    static boolean isInstanceOf(Object obj, String className) {

    /**
     * Checks that the given object is instance of the given class.
     * @param obj Object to be checked
     * @param className The name of the class. Must be fully-qualified class name.
     * @return true, if this object is instanceof given class,
     *         false, otherwise, or if obj or className is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    AccessibleStateSet getAccessibleStateSet() {

    /**
     * Gets the current state set of this object.
     *
     * @return an instance of <code>AccessibleStateSet</code>
     *    containing the current state set of the object
     * @see AccessibleState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    int getAccessibleIndexInParent() {

    /**
     * Gets the index of this object in its accessible parent.
     * If this object does not have an accessible parent, returns
     * -1.
     *
     * @return the index of this object in its accessible parent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void removeFocusListener(FocusListener l) {

        /**
         * Removes the specified focus listener so it no longer receives focus
         * events from this component.
         *
         * @param l the focus listener
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void addFocusListener(FocusListener l) {

        /**
         * Adds the specified focus listener to receive focus events from this
         * component.
         *
         * @param l the focus listener
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void requestFocus() {

        /**
         * Requests focus for this object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean isFocusTraversable() {

        /**
         * Returns whether this object can accept focus or not.
         *
         * @return true if object can accept focus; otherwise false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Accessible getAccessibleAt(Point p) {

        /**
         * Returns the <code>Accessible</code> child,
         * if one exists, contained at the local
         * coordinate <code>Point</code>.  Otherwise returns
         * <code>null</code>.
         *
         * @param p the point defining the top-left corner of
         *      the <code>Accessible</code>, given in the
         *      coordinate space of the object's parent
         * @return the <code>Accessible</code>, if it exists,
         *      at the specified location; else <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void setSize(Dimension d) {

        /**
         * Resizes this object so that it has width and height.
         *
         * @param d - the dimension specifying the new size of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Dimension getSize() {

        /**
         * Returns the size of this object in the form of a
         * <code>Dimension</code> object. The height field of the
         * <code>Dimension</code> object contains this objects's
         * height, and the width field of the <code>Dimension</code>
         * object contains this object's width.
         *
         * @return a <code>Dimension</code> object that indicates
         *     the size of this component; <code>null</code> if
         *     this object is not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Rectangle getBounds() {

        /**
         * Gets the bounds of this object in the form of a Rectangle object.
         * The bounds specify this object's width, height, and location
         * relative to its parent.
         *
         * @return a rectangle indicating this component's bounds;
         *   <code>null</code> if this object is not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void setLocation(Point p) {

        /**
         * Sets the location of the object relative to the parent.
         * @param p  the coordinates of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Point getLocation() {

        /**
         * Gets the location of the object relative to the parent in the form
         * of a point specifying the object's top-left corner in the screen's
         * coordinate space.
         *
         * @return an instance of Point representing the top-left corner of
         * the object's bounds in the coordinate space of the screen;
         * <code>null</code> if this object or its parent are not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Point getLocationOnScreen() {

        /**
         * Returns the location of the object on the screen.
         *
         * @return location of object on screen -- can be
         *    <code>null</code> if this object is not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean contains(Point p) {

        /**
         * Checks whether the specified point is within this object's bounds,
         * where the point's x and y coordinates are defined to be relative to
         * the coordinate system of the object.
         *
         * @param p the <code>Point</code> relative to the
         *     coordinate system of the object
         * @return true if object contains <code>Point</code>; otherwise false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void setVisible(boolean b) {

        /**
         * Sets the visible state of the object.
         *
         * @param b if true, shows this object; otherwise, hides it
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void setEnabled(boolean b) {

        /**
         * Sets the enabled state of the object.
         *
         * @param b if true, enables this object; otherwise, disables it
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean isEnabled() {

        /**
         * Determines if the object is enabled.
         *
         * @return true if object is enabled; otherwise, false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public FontMetrics getFontMetrics(Font f) {

        /**
         * Gets the <code>FontMetrics</code> of this object.
         *
         * @param f the <code>Font</code>
         * @return the <code>FontMetrics</code>, if supported,
         *     the object; otherwise, <code>null</code>
         * @see #getFont
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void setFont(Font f) {

        /**
         * Sets the <code>Font</code> of this object.
         *
         * @param f the new <code>Font</code> for the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Font getFont() {

        /**
         * Gets the <code>Font</code> of this object.
         *
         * @return the <code>Font</code>, if supported,
         *    for the object; otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Cursor getCursor() {

        /**
         * Gets the <code>Cursor</code> of this object.
         *
         * @return the <code>Cursor</code>, if supported,
         *     of the object; otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void setForeground(Color c) {

        /**
         * Sets the foreground color of this object.
         *
         * @param c the new <code>Color</code> for the foreground
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Color getForeground() {

        /**
         * Gets the foreground color of this object.
         *
         * @return the foreground color, if supported, of the object;
         *     otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Color getBackground() {

        /**
         * Gets the background color of this object.
         *
         * @return the background color, if supported, of the object;
         *      otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public AccessibleComponent getAccessibleComponent() {

        /**
         * Gets the <code>AccessibleComponent</code> associated
         * with this object if one exists.
         * Otherwise return <code>null</code>.
         *
         * @return the component
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Locale getLocale() {

        /**
         * Returns the locale of this object.
         *
         * @return the locale of this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Returns the nth <code>Accessible</code> child of the object.
         *
         * @param i zero-based index of child
         * @return the nth <code>Accessible</code> child of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public int getAccessibleIndexInParent() {

        /**
         * Gets the index of this object in its accessible parent.
         *
         * @return the index of this object in its parent; or -1 if this
         *    object does not have an accessible parent
         * @see #getAccessibleParent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Accessible getAccessibleParent() {

        /**
         * Gets the <code>Accessible</code> parent of this object.
         * If the parent of this object implements <code>Accessible</code>,
         * this method should simply return <code>getParent</code>.
         *
         * @return the <code>Accessible</code> parent of this
         *      object -- can be <code>null</code> if this
         *      object does not have an <code>Accessible</code> parent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Gets the state of this object.
         *
         * @return an instance of <code>AccessibleStateSet</code>
         *       containing the current state set of the object
         * @see javax.accessibility.AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Gets the role of this object.
         *
         * @return an instance of <code>AccessibleRole</code>
         *      describing the role of the object
         * @see javax.accessibility.AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
         *        <code>null</code> if this object does not have a description
         * @see javax.accessibility.AccessibleContext#setAccessibleDescription
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public String getAccessibleName() {

        /**
         * Gets the accessible name of this object.  This should almost never
         * return <code>java.awt.Component.getName()</code>,
         * as that generally isn't a localized name,
         * and doesn't have meaning for the user.  If the
         * object is fundamentally a text object (e.g. a menu item), the
         * accessible name should be the text of the object (e.g. "save").
         * If the object has a tooltip, the tooltip text may also be an
         * appropriate String to return.
         *
         * @return the localized name of the object -- can be
         *         <code>null</code> if this
         *         object does not have a name
         * @see javax.accessibility.AccessibleContext#setAccessibleName
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void removePropertyChangeListener(PropertyChangeListener listener) {

        /**
         * Remove a PropertyChangeListener from the listener list.
         * This removes a PropertyChangeListener that was registered
         * for all properties.
         *
         * @param listener  The PropertyChangeListener to be removed
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void addPropertyChangeListener(PropertyChangeListener listener) {

        /**
         * Adds a <code>PropertyChangeListener</code> to the listener list.
         *
         * @param listener  the property change listener to be added
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected class AccessibleAWTFocusHandler implements FocusListener {

        /**
         * Fire PropertyChange listener, if one is registered,
         * when focus events happen
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected class AccessibleAWTComponentHandler implements ComponentListener {

        /**
         * Fire PropertyChange listener, if one is registered,
         * when shown/hidden..
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        private volatile transient int propertyListenersCount = 0;

        /**
         * Number of PropertyChangeListener objects registered. It's used
         * to add/remove ComponentListener and FocusListener to track
         * target Component's state.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected AccessibleAWTComponent() {

        /**
         * Though the class is abstract, this should be called by
         * all sub-classes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected abstract class AccessibleAWTComponent extends AccessibleContext

    /**
     * Inner class of Component used to provide default support for
     * accessibility.  This class is not meant to be used directly by
     * application developers, but is instead meant only to be
     * subclassed by component developers.
     * <p>
     * The class used to obtain the accessible role for this object.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> associated
     * with this <code>Component</code>.
     * The method implemented by this base
     * class returns null.  Classes that extend <code>Component</code>
     * should implement this method to return the
     * <code>AccessibleContext</code> associated with the subclass.
     *
     *
     * @return the <code>AccessibleContext</code> of this
     *    <code>Component</code>
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected AccessibleContext accessibleContext = null;

    /**
     * The {@code AccessibleContext} associated with this {@code Component}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Window getContainingWindow() {

    /**
     * Returns the <code>Window</code> ancestor of the component.
     * @return Window ancestor of the component or component by itself if it is Window;
     *         null, if component is not a part of window hierarchy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final void relocateComponent() {

    /**
     * Fix the location of the HW component in a LW container hierarchy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final boolean canBeFocusOwnerRecursively() {

    /**
     * Checks that this component meets the prerequesites to be focus owner:
     * - it is enabled, visible, focusable
     * - it's parents are all enabled and showing
     * - top-level window is focusable
     * - if focus cycle root has DefaultFocusTraversalPolicy then it also checks that this policy accepts
     * this component as focus owner
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void applyComponentOrientation(ComponentOrientation orientation) {

    /**
     * Sets the <code>ComponentOrientation</code> property of this component
     * and all components contained within it.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     *
     * @param orientation the new component orientation of this component and
     *        the components contained within it.
     * @exception NullPointerException if <code>orientation</code> is null.
     * @see #setComponentOrientation
     * @see #getComponentOrientation
     * @see #invalidate
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public ComponentOrientation getComponentOrientation() {

    /**
     * Retrieves the language-sensitive orientation that is to be used to order
     * the elements or text within this component.  <code>LayoutManager</code>
     * and <code>Component</code>
     * subclasses that wish to respect orientation should call this method to
     * get the component's orientation before performing layout or drawing.
     *
     * @see ComponentOrientation
     *
     * @author Laura Werner, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setComponentOrientation(ComponentOrientation o) {

    /**
     * Sets the language-sensitive orientation that is to be used to order
     * the elements or text within this component.  Language-sensitive
     * <code>LayoutManager</code> and <code>Component</code>
     * subclasses will use this property to
     * determine how to lay out and draw components.
     * <p>
     * At construction time, a component's orientation is set to
     * <code>ComponentOrientation.UNKNOWN</code>,
     * indicating that it has not been specified
     * explicitly.  The UNKNOWN orientation behaves the same as
     * <code>ComponentOrientation.LEFT_TO_RIGHT</code>.
     * <p>
     * To set the orientation of a single component, use this method.
     * To set the orientation of an entire component
     * hierarchy, use
     * {@link #applyComponentOrientation applyComponentOrientation}.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     *
     * @see ComponentOrientation
     * @see #invalidate
     *
     * @author Laura Werner, IBM
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code> and if it isn't
     * <code>null</code> adds a listener to receive a variety
     * of events fired by the component.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a variety of serializable listeners as optional data.
     * The non-serializable listeners are detected and
     * no attempt is made to serialize them.
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @serialData <code>null</code> terminated sequence of
     *   0 or more pairs; the pair consists of a <code>String</code>
     *   and an <code>Object</code>; the <code>String</code> indicates
     *   the type of object and is one of the following (as of 1.4):
     *   <code>componentListenerK</code> indicating an
     *     <code>ComponentListener</code> object;
     *   <code>focusListenerK</code> indicating an
     *     <code>FocusListener</code> object;
     *   <code>keyListenerK</code> indicating an
     *     <code>KeyListener</code> object;
     *   <code>mouseListenerK</code> indicating an
     *     <code>MouseListener</code> object;
     *   <code>mouseMotionListenerK</code> indicating an
     *     <code>MouseMotionListener</code> object;
     *   <code>inputMethodListenerK</code> indicating an
     *     <code>InputMethodListener</code> object;
     *   <code>hierarchyListenerK</code> indicating an
     *     <code>HierarchyListener</code> object;
     *   <code>hierarchyBoundsListenerK</code> indicating an
     *     <code>HierarchyBoundsListener</code> object;
     *   <code>mouseWheelListenerK</code> indicating an
     *     <code>MouseWheelListener</code> object
     * @serialData an optional <code>ComponentOrientation</code>
     *    (after <code>inputMethodListener</code>, as of 1.2)
     *
     * @see AWTEventMulticaster#save(java.io.ObjectOutputStream, java.lang.String, java.util.EventListener)
     * @see #componentListenerK
     * @see #focusListenerK
     * @see #keyListenerK
     * @see #mouseListenerK
     * @see #mouseMotionListenerK
     * @see #inputMethodListenerK
     * @see #hierarchyListenerK
     * @see #hierarchyBoundsListenerK
     * @see #mouseWheelListenerK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private void doSwingSerialization() {

    /**
     * This hack is for Swing serialization. It will invoke
     * the Swing package private method <code>compWriteObjectNotify</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private int componentSerializedDataVersion = 4;

    /**
     * Component Serialized Data Version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void firePropertyChange(String propertyName, double oldValue, double newValue) {

    /**
     * Reports a bound property change.
     *
     * @param propertyName the programmatic name of the property
     *          that was changed
     * @param oldValue the old value of the property (as a double)
     * @param newValue the new value of the property (as a double)
     * @see #firePropertyChange(java.lang.String, java.lang.Object,
     *          java.lang.Object)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void firePropertyChange(String propertyName, float oldValue, float newValue) {

    /**
     * Reports a bound property change.
     *
     * @param propertyName the programmatic name of the property
     *          that was changed
     * @param oldValue the old value of the property (as a float)
     * @param newValue the new value of the property (as a float)
     * @see #firePropertyChange(java.lang.String, java.lang.Object,
     *          java.lang.Object)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void firePropertyChange(String propertyName, long oldValue, long newValue) {

    /**
     * Reports a bound property change.
     *
     * @param propertyName the programmatic name of the property
     *          that was changed
     * @param oldValue the old value of the property (as a long)
     * @param newValue the new value of the property (as a long)
     * @see #firePropertyChange(java.lang.String, java.lang.Object,
     *          java.lang.Object)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void firePropertyChange(String propertyName, short oldValue, short newValue) {

    /**
     * Reports a bound property change.
     *
     * @param propertyName the programmatic name of the property
     *          that was changed
     * @param oldValue the old value of the property (as a short)
     * @param newValue the old value of the property (as a short)
     * @see #firePropertyChange(java.lang.String, java.lang.Object,
     *          java.lang.Object)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void firePropertyChange(String propertyName, char oldValue, char newValue) {

    /**
     * Reports a bound property change.
     *
     * @param propertyName the programmatic name of the property
     *          that was changed
     * @param oldValue the old value of the property (as a char)
     * @param newValue the new value of the property (as a char)
     * @see #firePropertyChange(java.lang.String, java.lang.Object,
     *          java.lang.Object)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void firePropertyChange(String propertyName, byte oldValue, byte newValue) {

    /**
     * Reports a bound property change.
     *
     * @param propertyName the programmatic name of the property
     *          that was changed
     * @param oldValue the old value of the property (as a byte)
     * @param newValue the new value of the property (as a byte)
     * @see #firePropertyChange(java.lang.String, java.lang.Object,
     *          java.lang.Object)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void firePropertyChange(String propertyName,
                                      int oldValue, int newValue) {

    /**
     * Support for reporting bound property changes for integer properties.
     * This method can be called when a bound property has changed and it will
     * send the appropriate PropertyChangeEvent to any registered
     * PropertyChangeListeners.
     *
     * @param propertyName the property whose value has changed
     * @param oldValue the property's previous value
     * @param newValue the property's new value
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void firePropertyChange(String propertyName,
                                      boolean oldValue, boolean newValue) {

    /**
     * Support for reporting bound property changes for boolean properties.
     * This method can be called when a bound property has changed and it will
     * send the appropriate PropertyChangeEvent to any registered
     * PropertyChangeListeners.
     *
     * @param propertyName the property whose value has changed
     * @param oldValue the property's previous value
     * @param newValue the property's new value
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void firePropertyChange(String propertyName,
                                      Object oldValue, Object newValue) {

    /**
     * Support for reporting bound property changes for Object properties.
     * This method can be called when a bound property has changed and it will
     * send the appropriate PropertyChangeEvent to any registered
     * PropertyChangeListeners.
     *
     * @param propertyName the property whose value has changed
     * @param oldValue the property's previous value
     * @param newValue the property's new value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public PropertyChangeListener[] getPropertyChangeListeners(
                                                                            String propertyName) {

    /**
     * Returns an array of all the listeners which have been associated
     * with the named property.
     *
     * @return all of the <code>PropertyChangeListener</code>s associated with
     *         the named property; if no such listeners have been added or
     *         if <code>propertyName</code> is <code>null</code>, an empty
     *         array is returned
     *
     * @see #addPropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
     * @see #removePropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
     * @see #getPropertyChangeListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void removePropertyChangeListener(
                                                          String propertyName,
                                                          PropertyChangeListener listener) {

    /**
     * Removes a <code>PropertyChangeListener</code> from the listener
     * list for a specific property. This method should be used to remove
     * <code>PropertyChangeListener</code>s
     * that were registered for a specific bound property.
     * <p>
     * If <code>propertyName</code> or <code>listener</code> is <code>null</code>,
     * no exception is thrown and no action is taken.
     *
     * @param propertyName a valid property name
     * @param listener the PropertyChangeListener to be removed
     *
     * @see #addPropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
     * @see #getPropertyChangeListeners(java.lang.String)
     * @see #removePropertyChangeListener(java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void addPropertyChangeListener(
                                                       String propertyName,
                                                       PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list for a specific
     * property. The specified property may be user-defined, or one of the
     * following:
     * <ul>
     *    <li>this Component's font ("font")</li>
     *    <li>this Component's background color ("background")</li>
     *    <li>this Component's foreground color ("foreground")</li>
     *    <li>this Component's focusability ("focusable")</li>
     *    <li>this Component's focus traversal keys enabled state
     *        ("focusTraversalKeysEnabled")</li>
     *    <li>this Component's Set of FORWARD_TRAVERSAL_KEYS
     *        ("forwardFocusTraversalKeys")</li>
     *    <li>this Component's Set of BACKWARD_TRAVERSAL_KEYS
     *        ("backwardFocusTraversalKeys")</li>
     *    <li>this Component's Set of UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleFocusTraversalKeys")</li>
     * </ul>
     * Note that if this <code>Component</code> is inheriting a bound property, then no
     * event will be fired in response to a change in the inherited property.
     * <p>
     * If <code>propertyName</code> or <code>listener</code> is <code>null</code>,
     * no exception is thrown and no action is taken.
     *
     * @param propertyName one of the property names listed above
     * @param listener the property change listener to be added
     *
     * @see #removePropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
     * @see #getPropertyChangeListeners(java.lang.String)
     * @see #addPropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public PropertyChangeListener[] getPropertyChangeListeners() {

    /**
     * Returns an array of all the property change listeners
     * registered on this component.
     *
     * @return all of this component's <code>PropertyChangeListener</code>s
     *         or an empty array if no property change
     *         listeners are currently registered
     *
     * @see      #addPropertyChangeListener
     * @see      #removePropertyChangeListener
     * @see      #getPropertyChangeListeners(java.lang.String)
     * @see      java.beans.PropertyChangeSupport#getPropertyChangeListeners
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void removePropertyChangeListener(
                                                          PropertyChangeListener listener) {

    /**
     * Removes a PropertyChangeListener from the listener list. This method
     * should be used to remove PropertyChangeListeners that were registered
     * for all bound properties of this class.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param listener the PropertyChangeListener to be removed
     *
     * @see #addPropertyChangeListener
     * @see #getPropertyChangeListeners
     * @see #removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void addPropertyChangeListener(
                                                       PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list. The listener is
     * registered for all bound properties of this class, including the
     * following:
     * <ul>
     *    <li>this Component's font ("font")</li>
     *    <li>this Component's background color ("background")</li>
     *    <li>this Component's foreground color ("foreground")</li>
     *    <li>this Component's focusability ("focusable")</li>
     *    <li>this Component's focus traversal keys enabled state
     *        ("focusTraversalKeysEnabled")</li>
     *    <li>this Component's Set of FORWARD_TRAVERSAL_KEYS
     *        ("forwardFocusTraversalKeys")</li>
     *    <li>this Component's Set of BACKWARD_TRAVERSAL_KEYS
     *        ("backwardFocusTraversalKeys")</li>
     *    <li>this Component's Set of UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleFocusTraversalKeys")</li>
     *    <li>this Component's preferred size ("preferredSize")</li>
     *    <li>this Component's minimum size ("minimumSize")</li>
     *    <li>this Component's maximum size ("maximumSize")</li>
     *    <li>this Component's name ("name")</li>
     * </ul>
     * Note that if this <code>Component</code> is inheriting a bound property, then no
     * event will be fired in response to a change in the inherited property.
     * <p>
     * If <code>listener</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     *
     * @param    listener  the property change listener to be added
     *
     * @see #removePropertyChangeListener
     * @see #getPropertyChangeListeners
     * @see #addPropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void list(PrintWriter out, int indent) {

    /**
     * Prints out a list, starting at the specified indentation, to
     * the specified print writer.
     * @param out the print writer to print to
     * @param indent the number of spaces to indent
     * @throws NullPointerException if {@code out} is {@code null}
     * @see       java.io.PrintStream#println(java.lang.Object)
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void list(PrintWriter out) {

    /**
     * Prints a listing to the specified print writer.
     * @param  out  the print writer to print to
     * @throws NullPointerException if {@code out} is {@code null}
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void list(PrintStream out, int indent) {

    /**
     * Prints out a list, starting at the specified indentation, to the
     * specified print stream.
     * @param     out      a print stream
     * @param     indent   number of spaces to indent
     * @see       java.io.PrintStream#println(java.lang.Object)
     * @throws    NullPointerException if {@code out} is {@code null}
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void list(PrintStream out) {

    /**
     * Prints a listing of this component to the specified output
     * stream.
     * @param    out   a print stream
     * @throws   NullPointerException if {@code out} is {@code null}
     * @since    JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void list() {

    /**
     * Prints a listing of this component to the standard system output
     * stream <code>System.out</code>.
     * @see       java.lang.System#out
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public String toString() {

    /**
     * Returns a string representation of this component and its values.
     * @return    a string representation of this component
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this component. This
     * method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return  a string representation of this component's state
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @SuppressWarnings("unchecked")

    /**
     * Removes the specified popup menu from the component.
     * @param     popup the popup menu to be removed
     * @see       #add(PopupMenu)
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void add(PopupMenu popup) {

    /**
     * Adds the specified popup menu to the component.
     * @param     popup the popup menu to be added to the component.
     * @see       #remove(MenuComponent)
     * @exception NullPointerException if {@code popup} is {@code null}
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isFocusOwner() {

    /**
     * Returns <code>true</code> if this <code>Component</code> is the
     *    focus owner.
     *
     * @return <code>true</code> if this <code>Component</code> is the
     *     focus owner; <code>false</code> otherwise
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean hasFocus() {

    /**
     * Returns <code>true</code> if this <code>Component</code> is the
     * focus owner.  This method is obsolete, and has been replaced by
     * <code>isFocusOwner()</code>.
     *
     * @return <code>true</code> if this <code>Component</code> is the
     *         focus owner; <code>false</code> otherwise
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void transferFocusUpCycle() {

    /**
     * Transfers the focus up one focus traversal cycle. Typically, the focus
     * owner is set to this Component's focus cycle root, and the current focus
     * cycle root is set to the new focus owner's focus cycle root. If,
     * however, this Component's focus cycle root is a Window, then the focus
     * owner is set to the focus cycle root's default Component to focus, and
     * the current focus cycle root is unchanged.
     *
     * @see       #requestFocus()
     * @see       Container#isFocusCycleRoot()
     * @see       Container#setFocusCycleRoot(boolean)
     * @since     1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void transferFocusBackward() {

    /**
     * Transfers the focus to the previous component, as though this Component
     * were the focus owner.
     * @see       #requestFocus()
     * @since     1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by transferFocus().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void transferFocus() {

    /**
     * Transfers the focus to the next component, as though this Component were
     * the focus owner.
     * @see       #requestFocus()
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isFocusCycleRoot(Container container) {

    /**
     * Returns whether the specified Container is the focus cycle root of this
     * Component's focus traversal cycle. Each focus traversal cycle has only
     * a single focus cycle root and each Component which is not a Container
     * belongs to only a single focus traversal cycle.
     *
     * @param container the Container to be tested
     * @return <code>true</code> if the specified Container is a focus-cycle-
     *         root of this Component; <code>false</code> otherwise
     * @see Container#isFocusCycleRoot()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Container getFocusCycleRootAncestor() {

    /**
     * Returns the Container which is the focus cycle root of this Component's
     * focus traversal cycle. Each focus traversal cycle has only a single
     * focus cycle root and each Component which is not a Container belongs to
     * only a single focus traversal cycle. Containers which are focus cycle
     * roots belong to two cycles: one rooted at the Container itself, and one
     * rooted at the Container's nearest focus-cycle-root ancestor. For such
     * Containers, this method will return the Container's nearest focus-cycle-
     * root ancestor.
     *
     * @return this Component's nearest focus-cycle-root ancestor
     * @see Container#isFocusCycleRoot()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected boolean requestFocusInWindow(boolean temporary) {

    /**
     * Requests that this <code>Component</code> get the input focus,
     * if this <code>Component</code>'s top-level ancestor is already
     * the focused <code>Window</code>.  This component must be
     * displayable, focusable, visible and all of its ancestors (with
     * the exception of the top-level Window) must be visible for the
     * request to be granted. Every effort will be made to honor the
     * request; however, in some cases it may be impossible to do
     * so. Developers must never assume that this component is the
     * focus owner until this component receives a FOCUS_GAINED event.
     * <p>
     * This method returns a boolean value. If <code>false</code> is returned,
     * the request is <b>guaranteed to fail</b>. If <code>true</code> is
     * returned, the request will succeed <b>unless</b> it is vetoed, or an
     * extraordinary event, such as disposal of the component's peer, occurs
     * before the request can be granted by the native windowing system. Again,
     * while a return value of <code>true</code> indicates that the request is
     * likely to succeed, developers must never assume that this component is
     * the focus owner until this component receives a FOCUS_GAINED event.
     * <p>
     * This method cannot be used to set the focus owner to no component at
     * all. Use <code>KeyboardFocusManager.clearGlobalFocusOwner</code>
     * instead.
     * <p>
     * The focus behavior of this method can be implemented uniformly across
     * platforms, and thus developers are strongly encouraged to use this
     * method over <code>requestFocus</code> when possible. Code which relies
     * on <code>requestFocus</code> may exhibit different focus behavior on
     * different platforms.
     * <p>
     * Every effort will be made to ensure that <code>FocusEvent</code>s
     * generated as a
     * result of this request will have the specified temporary value. However,
     * because specifying an arbitrary temporary state may not be implementable
     * on all native windowing systems, correct behavior for this method can be
     * guaranteed only for lightweight components. This method is not intended
     * for general use, but exists instead as a hook for lightweight component
     * libraries, such as Swing.
     *
     * <p>Note: Not all focus transfers result from invoking this method. As
     * such, a component may receive focus without this or any of the other
     * {@code requestFocus} methods of {@code Component} being invoked.
     *
     * @param temporary true if the focus change is temporary,
     *        such as when the window loses the focus; for
     *        more information on temporary focus changes see the
     *<a href="../../java/awt/doc-files/FocusSpec.html">Focus Specification</a>
     * @return <code>false</code> if the focus change request is guaranteed to
     *         fail; <code>true</code> if it is likely to succeed
     * @see #requestFocus
     * @see java.awt.event.FocusEvent
     * @see #addFocusListener
     * @see #isFocusable
     * @see #isDisplayable
     * @see KeyboardFocusManager#clearGlobalFocusOwner
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean requestFocusInWindow() {

    /**
     * Requests that this Component get the input focus, if this
     * Component's top-level ancestor is already the focused
     * Window. This component must be displayable, focusable, visible
     * and all of its ancestors (with the exception of the top-level
     * Window) must be visible for the request to be granted. Every
     * effort will be made to honor the request; however, in some
     * cases it may be impossible to do so. Developers must never
     * assume that this Component is the focus owner until this
     * Component receives a FOCUS_GAINED event.
     * <p>
     * This method returns a boolean value. If <code>false</code> is returned,
     * the request is <b>guaranteed to fail</b>. If <code>true</code> is
     * returned, the request will succeed <b>unless</b> it is vetoed, or an
     * extraordinary event, such as disposal of the Component's peer, occurs
     * before the request can be granted by the native windowing system. Again,
     * while a return value of <code>true</code> indicates that the request is
     * likely to succeed, developers must never assume that this Component is
     * the focus owner until this Component receives a FOCUS_GAINED event.
     * <p>
     * This method cannot be used to set the focus owner to no Component at
     * all. Use <code>KeyboardFocusManager.clearGlobalFocusOwner()</code>
     * instead.
     * <p>
     * The focus behavior of this method can be implemented uniformly across
     * platforms, and thus developers are strongly encouraged to use this
     * method over <code>requestFocus</code> when possible. Code which relies
     * on <code>requestFocus</code> may exhibit different focus behavior on
     * different platforms.
     *
     * <p>Note: Not all focus transfers result from invoking this method. As
     * such, a component may receive focus without this or any of the other
     * {@code requestFocus} methods of {@code Component} being invoked.
     *
     * @return <code>false</code> if the focus change request is guaranteed to
     *         fail; <code>true</code> if it is likely to succeed
     * @see #requestFocus
     * @see java.awt.event.FocusEvent
     * @see #addFocusListener
     * @see #isFocusable
     * @see #isDisplayable
     * @see KeyboardFocusManager#clearGlobalFocusOwner
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected boolean requestFocus(boolean temporary) {

    /**
     * Requests that this <code>Component</code> get the input focus,
     * and that this <code>Component</code>'s top-level ancestor
     * become the focused <code>Window</code>. This component must be
     * displayable, focusable, visible and all of its ancestors (with
     * the exception of the top-level Window) must be visible for the
     * request to be granted. Every effort will be made to honor the
     * request; however, in some cases it may be impossible to do
     * so. Developers must never assume that this component is the
     * focus owner until this component receives a FOCUS_GAINED
     * event. If this request is denied because this component's
     * top-level window cannot become the focused window, the request
     * will be remembered and will be granted when the window is later
     * focused by the user.
     * <p>
     * This method returns a boolean value. If <code>false</code> is returned,
     * the request is <b>guaranteed to fail</b>. If <code>true</code> is
     * returned, the request will succeed <b>unless</b> it is vetoed, or an
     * extraordinary event, such as disposal of the component's peer, occurs
     * before the request can be granted by the native windowing system. Again,
     * while a return value of <code>true</code> indicates that the request is
     * likely to succeed, developers must never assume that this component is
     * the focus owner until this component receives a FOCUS_GAINED event.
     * <p>
     * This method cannot be used to set the focus owner to no component at
     * all. Use <code>KeyboardFocusManager.clearGlobalFocusOwner</code>
     * instead.
     * <p>
     * Because the focus behavior of this method is platform-dependent,
     * developers are strongly encouraged to use
     * <code>requestFocusInWindow</code> when possible.
     * <p>
     * Every effort will be made to ensure that <code>FocusEvent</code>s
     * generated as a
     * result of this request will have the specified temporary value. However,
     * because specifying an arbitrary temporary state may not be implementable
     * on all native windowing systems, correct behavior for this method can be
     * guaranteed only for lightweight <code>Component</code>s.
     * This method is not intended
     * for general use, but exists instead as a hook for lightweight component
     * libraries, such as Swing.
     *
     * <p>Note: Not all focus transfers result from invoking this method. As
     * such, a component may receive focus without this or any of the other
     * {@code requestFocus} methods of {@code Component} being invoked.
     *
     * @param temporary true if the focus change is temporary,
     *        such as when the window loses the focus; for
     *        more information on temporary focus changes see the
     *<a href="../../java/awt/doc-files/FocusSpec.html">Focus Specification</a>
     * @return <code>false</code> if the focus change request is guaranteed to
     *         fail; <code>true</code> if it is likely to succeed
     * @see java.awt.event.FocusEvent
     * @see #addFocusListener
     * @see #isFocusable
     * @see #isDisplayable
     * @see KeyboardFocusManager#clearGlobalFocusOwner
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void requestFocus() {

    /**
     * Requests that this Component get the input focus, and that this
     * Component's top-level ancestor become the focused Window. This
     * component must be displayable, focusable, visible and all of
     * its ancestors (with the exception of the top-level Window) must
     * be visible for the request to be granted. Every effort will be
     * made to honor the request; however, in some cases it may be
     * impossible to do so. Developers must never assume that this
     * Component is the focus owner until this Component receives a
     * FOCUS_GAINED event. If this request is denied because this
     * Component's top-level Window cannot become the focused Window,
     * the request will be remembered and will be granted when the
     * Window is later focused by the user.
     * <p>
     * This method cannot be used to set the focus owner to no Component at
     * all. Use <code>KeyboardFocusManager.clearGlobalFocusOwner()</code>
     * instead.
     * <p>
     * Because the focus behavior of this method is platform-dependent,
     * developers are strongly encouraged to use
     * <code>requestFocusInWindow</code> when possible.
     *
     * <p>Note: Not all focus transfers result from invoking this method. As
     * such, a component may receive focus without this or any of the other
     * {@code requestFocus} methods of {@code Component} being invoked.
     *
     * @see #requestFocusInWindow
     * @see java.awt.event.FocusEvent
     * @see #addFocusListener
     * @see #isFocusable
     * @see #isDisplayable
     * @see KeyboardFocusManager#clearGlobalFocusOwner
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean getFocusTraversalKeysEnabled() {

    /**
     * Returns whether focus traversal keys are enabled for this Component.
     * Components for which focus traversal keys are disabled receive key
     * events for focus traversal keys. Components for which focus traversal
     * keys are enabled do not see these events; instead, the events are
     * automatically converted to traversal operations.
     *
     * @return whether focus traversal keys are enabled for this Component
     * @see #setFocusTraversalKeysEnabled
     * @see #setFocusTraversalKeys
     * @see #getFocusTraversalKeys
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setFocusTraversalKeysEnabled(boolean
                                             focusTraversalKeysEnabled) {

    /**
     * Sets whether focus traversal keys are enabled for this Component.
     * Components for which focus traversal keys are disabled receive key
     * events for focus traversal keys. Components for which focus traversal
     * keys are enabled do not see these events; instead, the events are
     * automatically converted to traversal operations.
     *
     * @param focusTraversalKeysEnabled whether focus traversal keys are
     *        enabled for this Component
     * @see #getFocusTraversalKeysEnabled
     * @see #setFocusTraversalKeys
     * @see #getFocusTraversalKeys
     * @since 1.4
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean areFocusTraversalKeysSet(int id) {

    /**
     * Returns whether the Set of focus traversal keys for the given focus
     * traversal operation has been explicitly defined for this Component. If
     * this method returns <code>false</code>, this Component is inheriting the
     * Set from an ancestor, or from the current KeyboardFocusManager.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS
     * @return <code>true</code> if the the Set of focus traversal keys for the
     *         given focus traversal operation has been explicitly defined for
     *         this Component; <code>false</code> otherwise.
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Set<AWTKeyStroke> getFocusTraversalKeys(int id) {

    /**
     * Returns the Set of focus traversal keys for a given traversal operation
     * for this Component. (See
     * <code>setFocusTraversalKeys</code> for a full description of each key.)
     * <p>
     * If a Set of traversal keys has not been explicitly defined for this
     * Component, then this Component's parent's Set is returned. If no Set
     * has been explicitly defined for any of this Component's ancestors, then
     * the current KeyboardFocusManager's default Set is returned.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS
     * @return the Set of AWTKeyStrokes for the specified operation. The Set
     *         will be unmodifiable, and may be empty. null will never be
     *         returned.
     * @see #setFocusTraversalKeys
     * @see KeyboardFocusManager#FORWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#BACKWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#UP_CYCLE_TRAVERSAL_KEYS
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setFocusTraversalKeys(int id,
                                      Set<? extends AWTKeyStroke> keystrokes)

    /**
     * Sets the focus traversal keys for a given traversal operation for this
     * Component.
     * <p>
     * The default values for a Component's focus traversal keys are
     * implementation-dependent. Sun recommends that all implementations for a
     * particular native platform use the same default values. The
     * recommendations for Windows and Unix are listed below. These
     * recommendations are used in the Sun AWT implementations.
     *
     * <table border=1 summary="Recommended default values for a Component's focus traversal keys">
     * <tr>
     *    <th>Identifier</th>
     *    <th>Meaning</th>
     *    <th>Default</th>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS</td>
     *    <td>Normal forward keyboard traversal</td>
     *    <td>TAB on KEY_PRESSED, CTRL-TAB on KEY_PRESSED</td>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS</td>
     *    <td>Normal reverse keyboard traversal</td>
     *    <td>SHIFT-TAB on KEY_PRESSED, CTRL-SHIFT-TAB on KEY_PRESSED</td>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS</td>
     *    <td>Go up one focus traversal cycle</td>
     *    <td>none</td>
     * </tr>
     * </table>
     *
     * To disable a traversal key, use an empty Set; Collections.EMPTY_SET is
     * recommended.
     * <p>
     * Using the AWTKeyStroke API, client code can specify on which of two
     * specific KeyEvents, KEY_PRESSED or KEY_RELEASED, the focus traversal
     * operation will occur. Regardless of which KeyEvent is specified,
     * however, all KeyEvents related to the focus traversal key, including the
     * associated KEY_TYPED event, will be consumed, and will not be dispatched
     * to any Component. It is a runtime error to specify a KEY_TYPED event as
     * mapping to a focus traversal operation, or to map the same event to
     * multiple default focus traversal operations.
     * <p>
     * If a value of null is specified for the Set, this Component inherits the
     * Set from its parent. If all ancestors of this Component have null
     * specified for the Set, then the current KeyboardFocusManager's default
     * Set is used.
     * <p>
     * This method may throw a {@code ClassCastException} if any {@code Object}
     * in {@code keystrokes} is not an {@code AWTKeyStroke}.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS
     * @param keystrokes the Set of AWTKeyStroke for the specified operation
     * @see #getFocusTraversalKeys
     * @see KeyboardFocusManager#FORWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#BACKWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#UP_CYCLE_TRAVERSAL_KEYS
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or if keystrokes
     *         contains null, or if any keystroke represents a KEY_TYPED event,
     *         or if any keystroke already maps to another focus traversal
     *         operation for this Component
     * @since 1.4
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setFocusable(boolean focusable) {

    /**
     * Sets the focusable state of this Component to the specified value. This
     * value overrides the Component's default focusability.
     *
     * @param focusable indicates whether this Component is focusable
     * @see #isFocusable
     * @since 1.4
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isFocusable() {

    /**
     * Returns whether this Component can be focused.
     *
     * @return <code>true</code> if this Component is focusable;
     *         <code>false</code> otherwise.
     * @see #setFocusable
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * Returns whether this <code>Component</code> can become the focus
     * owner.
     *
     * @return <code>true</code> if this <code>Component</code> is
     * focusable; <code>false</code> otherwise
     * @see #setFocusable
     * @since JDK1.1
     * @deprecated As of 1.4, replaced by <code>isFocusable()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processFocusEvent(FocusEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processFocusEvent(FocusEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void removeNotify() {

    /**
     * Makes this <code>Component</code> undisplayable by destroying it native
     * screen resource.
     * <p>
     * This method is called by the toolkit internally and should
     * not be called directly by programs. Code overriding
     * this method should call <code>super.removeNotify</code> as
     * the first line of the overriding method.
     *
     * @see       #isDisplayable
     * @see       #addNotify
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void addNotify() {

    /**
     * Makes this <code>Component</code> displayable by connecting it to a
     * native screen resource.
     * This method is called internally by the toolkit and should
     * not be called directly by programs.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @see       #isDisplayable
     * @see       #removeNotify
     * @see #invalidate
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * should register this component as ActionListener on component
     * which fires action events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processKeyEvent(KeyEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processKeyEvent(KeyEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processMouseEvent(MouseEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processMouseEvent(MouseEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processMouseMotionEvent(MouseEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processMouseEvent(MouseEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processMouseMotionEvent(MouseEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processMouseEvent(MouseEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1
     * replaced by processEvent(AWTEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processHierarchyBoundsEvent(HierarchyEvent e) {

    /**
     * Processes hierarchy bounds events occurring on this component by
     * dispatching them to any registered
     * <code>HierarchyBoundsListener</code> objects.
     * <p>
     * This method is not called unless hierarchy bounds events
     * are enabled for this component. Hierarchy bounds events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>HierarchyBoundsListener</code> object is registered
     * via <code>addHierarchyBoundsListener</code>.
     * <li>Hierarchy bounds events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the hierarchy event
     * @see         java.awt.event.HierarchyEvent
     * @see         java.awt.event.HierarchyBoundsListener
     * @see         #addHierarchyBoundsListener
     * @see         #enableEvents
     * @since       1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processHierarchyEvent(HierarchyEvent e) {

    /**
     * Processes hierarchy events occurring on this component by
     * dispatching them to any registered
     * <code>HierarchyListener</code> objects.
     * <p>
     * This method is not called unless hierarchy events
     * are enabled for this component. Hierarchy events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>HierarchyListener</code> object is registered
     * via <code>addHierarchyListener</code>.
     * <li>Hierarchy events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the hierarchy event
     * @see         java.awt.event.HierarchyEvent
     * @see         java.awt.event.HierarchyListener
     * @see         #addHierarchyListener
     * @see         #enableEvents
     * @since       1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processInputMethodEvent(InputMethodEvent e) {

    /**
     * Processes input method events occurring on this component by
     * dispatching them to any registered
     * <code>InputMethodListener</code> objects.
     * <p>
     * This method is not called unless input method events
     * are enabled for this component. Input method events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>InputMethodListener</code> object is registered
     * via <code>addInputMethodListener</code>.
     * <li>Input method events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the input method event
     * @see         java.awt.event.InputMethodEvent
     * @see         java.awt.event.InputMethodListener
     * @see         #addInputMethodListener
     * @see         #enableEvents
     * @since       1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processMouseWheelEvent(MouseWheelEvent e) {

    /**
     * Processes mouse wheel events occurring on this component by
     * dispatching them to any registered
     * <code>MouseWheelListener</code> objects.
     * <p>
     * This method is not called unless mouse wheel events are
     * enabled for this component. Mouse wheel events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>A <code>MouseWheelListener</code> object is registered
     * via <code>addMouseWheelListener</code>.
     * <li>Mouse wheel events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>
     * For information on how mouse wheel events are dispatched, see
     * the class description for {@link MouseWheelEvent}.
     * <p>
     * Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the mouse wheel event
     * @see         java.awt.event.MouseWheelEvent
     * @see         java.awt.event.MouseWheelListener
     * @see         #addMouseWheelListener
     * @see         #enableEvents
     * @since       1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processMouseMotionEvent(MouseEvent e) {

    /**
     * Processes mouse motion events occurring on this component by
     * dispatching them to any registered
     * <code>MouseMotionListener</code> objects.
     * <p>
     * This method is not called unless mouse motion events are
     * enabled for this component. Mouse motion events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>A <code>MouseMotionListener</code> object is registered
     * via <code>addMouseMotionListener</code>.
     * <li>Mouse motion events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the mouse motion event
     * @see         java.awt.event.MouseEvent
     * @see         java.awt.event.MouseMotionListener
     * @see         #addMouseMotionListener
     * @see         #enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processMouseEvent(MouseEvent e) {

    /**
     * Processes mouse events occurring on this component by
     * dispatching them to any registered
     * <code>MouseListener</code> objects.
     * <p>
     * This method is not called unless mouse events are
     * enabled for this component. Mouse events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>A <code>MouseListener</code> object is registered
     * via <code>addMouseListener</code>.
     * <li>Mouse events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the mouse event
     * @see         java.awt.event.MouseEvent
     * @see         java.awt.event.MouseListener
     * @see         #addMouseListener
     * @see         #enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processKeyEvent(KeyEvent e) {

    /**
     * Processes key events occurring on this component by
     * dispatching them to any registered
     * <code>KeyListener</code> objects.
     * <p>
     * This method is not called unless key events are
     * enabled for this component. Key events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>A <code>KeyListener</code> object is registered
     * via <code>addKeyListener</code>.
     * <li>Key events are enabled via <code>enableEvents</code>.
     * </ul>
     *
     * <p>
     * If key events are enabled for a <code>Component</code>,
     * the current <code>KeyboardFocusManager</code> determines
     * whether or not a key event should be dispatched to
     * registered <code>KeyListener</code> objects.  The
     * <code>DefaultKeyboardFocusManager</code> will not dispatch
     * key events to a <code>Component</code> that is not the focus
     * owner or is not showing.
     * <p>
     * As of J2SE 1.4, <code>KeyEvent</code>s are redirected to
     * the focus owner. Please see the
     * <a href="doc-files/FocusSpec.html">Focus Specification</a>
     * for further information.
     * <p>
     * Calling a <code>Component</code>'s <code>dispatchEvent</code>
     * method with a <code>KeyEvent</code> as the argument will
     * result in a call to the <code>Component</code>'s
     * <code>processKeyEvent</code> method regardless of the
     * current <code>KeyboardFocusManager</code> as long as the
     * component is showing, focused, and enabled, and key events
     * are enabled on it.
     * <p>If the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the key event
     * @see         java.awt.event.KeyEvent
     * @see         java.awt.event.KeyListener
     * @see         java.awt.KeyboardFocusManager
     * @see         java.awt.DefaultKeyboardFocusManager
     * @see         #processEvent
     * @see         #dispatchEvent
     * @see         #addKeyListener
     * @see         #enableEvents
     * @see         #isShowing
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processFocusEvent(FocusEvent e) {

    /**
     * Processes focus events occurring on this component by
     * dispatching them to any registered
     * <code>FocusListener</code> objects.
     * <p>
     * This method is not called unless focus events are
     * enabled for this component. Focus events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>A <code>FocusListener</code> object is registered
     * via <code>addFocusListener</code>.
     * <li>Focus events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>
     * If focus events are enabled for a <code>Component</code>,
     * the current <code>KeyboardFocusManager</code> determines
     * whether or not a focus event should be dispatched to
     * registered <code>FocusListener</code> objects.  If the
     * events are to be dispatched, the <code>KeyboardFocusManager</code>
     * calls the <code>Component</code>'s <code>dispatchEvent</code>
     * method, which results in a call to the <code>Component</code>'s
     * <code>processFocusEvent</code> method.
     * <p>
     * If focus events are enabled for a <code>Component</code>, calling
     * the <code>Component</code>'s <code>dispatchEvent</code> method
     * with a <code>FocusEvent</code> as the argument will result in a
     * call to the <code>Component</code>'s <code>processFocusEvent</code>
     * method regardless of the current <code>KeyboardFocusManager</code>.
     *
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the focus event
     * @see         java.awt.event.FocusEvent
     * @see         java.awt.event.FocusListener
     * @see         java.awt.KeyboardFocusManager
     * @see         #addFocusListener
     * @see         #enableEvents
     * @see         #dispatchEvent
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processComponentEvent(ComponentEvent e) {

    /**
     * Processes component events occurring on this component by
     * dispatching them to any registered
     * <code>ComponentListener</code> objects.
     * <p>
     * This method is not called unless component events are
     * enabled for this component. Component events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>A <code>ComponentListener</code> object is registered
     * via <code>addComponentListener</code>.
     * <li>Component events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the component event
     * @see         java.awt.event.ComponentEvent
     * @see         java.awt.event.ComponentListener
     * @see         #addComponentListener
     * @see         #enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events occurring on this component. By default this
     * method calls the appropriate
     * <code>process&lt;event&nbsp;type&gt;Event</code>
     * method for the given class of event.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param     e the event
     * @see       #processComponentEvent
     * @see       #processFocusEvent
     * @see       #processKeyEvent
     * @see       #processMouseEvent
     * @see       #processMouseMotionEvent
     * @see       #processInputMethodEvent
     * @see       #processHierarchyEvent
     * @see       #processMouseWheelEvent
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected AWTEvent coalesceEvents(AWTEvent existingEvent,
                                      AWTEvent newEvent) {

    /**
     * Potentially coalesce an event being posted with an existing
     * event.  This method is called by <code>EventQueue.postEvent</code>
     * if an event with the same ID as the event to be posted is found in
     * the queue (both events must have this component as their source).
     * This method either returns a coalesced event which replaces
     * the existing event (and the new event is then discarded), or
     * <code>null</code> to indicate that no combining should be done
     * (add the second event to the end of the queue).  Either event
     * parameter may be modified and returned, as the other one is discarded
     * unless <code>null</code> is returned.
     * <p>
     * This implementation of <code>coalesceEvents</code> coalesces
     * two event types: mouse move (and drag) events,
     * and paint (and update) events.
     * For mouse move events the last event is always returned, causing
     * intermediate moves to be discarded.  For paint events, the new
     * event is coalesced into a complex <code>RepaintArea</code> in the peer.
     * The new <code>AWTEvent</code> is always returned.
     *
     * @param  existingEvent  the event already on the <code>EventQueue</code>
     * @param  newEvent       the event being posted to the
     *          <code>EventQueue</code>
     * @return a coalesced event, or <code>null</code> indicating that no
     *          coalescing was done
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final boolean isCoalescingEnabled() {

    /**
     * Indicates whether coalesceEvents may do something.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private static boolean isCoalesceEventsOverriden(Class<?> clazz) {

    /**
     * Indicates whether a class or its superclasses override coalesceEvents.
     * Must be called with lock on coalesceMap and privileged.
     * @see checkCoalescing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private static final Class[] coalesceEventsParams = {

    /**
     * Parameter types of coalesceEvents(AWTEvent,AWTEVent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
     private boolean checkCoalescing() {

    /**
     * Indicates whether this class overrides coalesceEvents.
     * It is assumed that all classes that are loaded from the bootstrap
     *   do not.
     * The boostrap class loader is assumed to be represented by null.
     * We do not check that the method really overrides
     *   (it might be static, private or package private).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private static final Map<Class<?>, Boolean> coalesceMap =

    /**
     * Weak map of known coalesceEvent overriders.
     * Value indicates whether overriden.
     * Bootstrap classes are not included.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    transient private boolean coalescingEnabled = checkCoalescing();

    /**
     * @see #isCoalescingEnabled
     * @see #checkCoalescing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected final void disableEvents(long eventsToDisable) {

    /**
     * Disables the events defined by the specified event mask parameter
     * from being delivered to this component.
     * @param      eventsToDisable   the event mask defining the event types
     * @see        #enableEvents
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected final void enableEvents(long eventsToEnable) {

    /**
     * Enables the events defined by the specified event mask parameter
     * to be delivered to this component.
     * <p>
     * Event types are automatically enabled when a listener for
     * that event type is added to the component.
     * <p>
     * This method only needs to be invoked by subclasses of
     * <code>Component</code> which desire to have the specified event
     * types delivered to <code>processEvent</code> regardless of whether
     * or not a listener is registered.
     * @param      eventsToEnable   the event mask defining the event types
     * @see        #processEvent
     * @see        #disableEvents
     * @see        AWTEvent
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public InputContext getInputContext() {

    /**
     * Gets the input context used by this component for handling
     * the communication with input methods when text is entered
     * in this component. By default, the input context used for
     * the parent component is returned. Components may
     * override this to return a private input context.
     *
     * @return the input context used by this component;
     *          <code>null</code> if no context can be determined
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public InputMethodRequests getInputMethodRequests() {

    /**
     * Gets the input method request handler which supports
     * requests from input methods for this component. A component
     * that supports on-the-spot text input must override this
     * method to return an <code>InputMethodRequests</code> instance.
     * At the same time, it also has to handle input method events.
     *
     * @return the input method request handler for this component,
     *          <code>null</code> by default
     * @see #addInputMethodListener
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>Component</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>Component</code> <code>c</code>
     * for its mouse listeners with the following code:
     *
     * <pre>MouseListener[] mls = (MouseListener[])(c.getListeners(MouseListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this component,
     *          or an empty array if no such listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     * @throws NullPointerException if {@code listenerType} is {@code null}
     * @see #getComponentListeners
     * @see #getFocusListeners
     * @see #getHierarchyListeners
     * @see #getHierarchyBoundsListeners
     * @see #getKeyListeners
     * @see #getMouseListeners
     * @see #getMouseMotionListeners
     * @see #getMouseWheelListeners
     * @see #getInputMethodListeners
     * @see #getPropertyChangeListeners
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized InputMethodListener[] getInputMethodListeners() {

    /**
     * Returns an array of all the input method listeners
     * registered on this component.
     *
     * @return all of this component's <code>InputMethodListener</code>s
     *         or an empty array if no input method
     *         listeners are currently registered
     *
     * @see      #addInputMethodListener
     * @see      #removeInputMethodListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeInputMethodListener(InputMethodListener l) {

    /**
     * Removes the specified input method listener so that it no longer
     * receives input method events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the input method listener
     * @see      java.awt.event.InputMethodEvent
     * @see      java.awt.event.InputMethodListener
     * @see      #addInputMethodListener
     * @see      #getInputMethodListeners
     * @since    1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addInputMethodListener(InputMethodListener l) {

    /**
     * Adds the specified input method listener to receive
     * input method events from this component. A component will
     * only receive input method events from input methods
     * if it also overrides <code>getInputMethodRequests</code> to return an
     * <code>InputMethodRequests</code> instance.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="{@docRoot}/java/awt/doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the input method listener
     * @see      java.awt.event.InputMethodEvent
     * @see      java.awt.event.InputMethodListener
     * @see      #removeInputMethodListener
     * @see      #getInputMethodListeners
     * @see      #getInputMethodRequests
     * @since    1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized MouseWheelListener[] getMouseWheelListeners() {

    /**
     * Returns an array of all the mouse wheel listeners
     * registered on this component.
     *
     * @return all of this component's <code>MouseWheelListener</code>s
     *         or an empty array if no mouse wheel
     *         listeners are currently registered
     *
     * @see      #addMouseWheelListener
     * @see      #removeMouseWheelListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeMouseWheelListener(MouseWheelListener l) {

    /**
     * Removes the specified mouse wheel listener so that it no longer
     * receives mouse wheel events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the mouse wheel listener.
     * @see      java.awt.event.MouseWheelEvent
     * @see      java.awt.event.MouseWheelListener
     * @see      #addMouseWheelListener
     * @see      #getMouseWheelListeners
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addMouseWheelListener(MouseWheelListener l) {

    /**
     * Adds the specified mouse wheel listener to receive mouse wheel events
     * from this component.  Containers also receive mouse wheel events from
     * sub-components.
     * <p>
     * For information on how mouse wheel events are dispatched, see
     * the class description for {@link MouseWheelEvent}.
     * <p>
     * If l is <code>null</code>, no exception is thrown and no
     * action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the mouse wheel listener
     * @see      java.awt.event.MouseWheelEvent
     * @see      java.awt.event.MouseWheelListener
     * @see      #removeMouseWheelListener
     * @see      #getMouseWheelListeners
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized MouseMotionListener[] getMouseMotionListeners() {

    /**
     * Returns an array of all the mouse motion listeners
     * registered on this component.
     *
     * @return all of this component's <code>MouseMotionListener</code>s
     *         or an empty array if no mouse motion
     *         listeners are currently registered
     *
     * @see      #addMouseMotionListener
     * @see      #removeMouseMotionListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeMouseMotionListener(MouseMotionListener l) {

    /**
     * Removes the specified mouse motion listener so that it no longer
     * receives mouse motion events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the mouse motion listener
     * @see      java.awt.event.MouseEvent
     * @see      java.awt.event.MouseMotionListener
     * @see      #addMouseMotionListener
     * @see      #getMouseMotionListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addMouseMotionListener(MouseMotionListener l) {

    /**
     * Adds the specified mouse motion listener to receive mouse motion
     * events from this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the mouse motion listener
     * @see      java.awt.event.MouseEvent
     * @see      java.awt.event.MouseMotionListener
     * @see      #removeMouseMotionListener
     * @see      #getMouseMotionListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized MouseListener[] getMouseListeners() {

    /**
     * Returns an array of all the mouse listeners
     * registered on this component.
     *
     * @return all of this component's <code>MouseListener</code>s
     *         or an empty array if no mouse
     *         listeners are currently registered
     *
     * @see      #addMouseListener
     * @see      #removeMouseListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeMouseListener(MouseListener l) {

    /**
     * Removes the specified mouse listener so that it no longer
     * receives mouse events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the mouse listener
     * @see      java.awt.event.MouseEvent
     * @see      java.awt.event.MouseListener
     * @see      #addMouseListener
     * @see      #getMouseListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addMouseListener(MouseListener l) {

    /**
     * Adds the specified mouse listener to receive mouse events from
     * this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the mouse listener
     * @see      java.awt.event.MouseEvent
     * @see      java.awt.event.MouseListener
     * @see      #removeMouseListener
     * @see      #getMouseListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized KeyListener[] getKeyListeners() {

    /**
     * Returns an array of all the key listeners
     * registered on this component.
     *
     * @return all of this component's <code>KeyListener</code>s
     *         or an empty array if no key
     *         listeners are currently registered
     *
     * @see      #addKeyListener
     * @see      #removeKeyListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeKeyListener(KeyListener l) {

    /**
     * Removes the specified key listener so that it no longer
     * receives key events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the key listener
     * @see      java.awt.event.KeyEvent
     * @see      java.awt.event.KeyListener
     * @see      #addKeyListener
     * @see      #getKeyListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addKeyListener(KeyListener l) {

    /**
     * Adds the specified key listener to receive key events from
     * this component.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the key listener.
     * @see      java.awt.event.KeyEvent
     * @see      java.awt.event.KeyListener
     * @see      #removeKeyListener
     * @see      #getKeyListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized HierarchyBoundsListener[] getHierarchyBoundsListeners() {

    /**
     * Returns an array of all the hierarchy bounds listeners
     * registered on this component.
     *
     * @return all of this component's <code>HierarchyBoundsListener</code>s
     *         or an empty array if no hierarchy bounds
     *         listeners are currently registered
     *
     * @see      #addHierarchyBoundsListener
     * @see      #removeHierarchyBoundsListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void removeHierarchyBoundsListener(HierarchyBoundsListener l) {

    /**
     * Removes the specified hierarchy bounds listener so that it no longer
     * receives hierarchy bounds events from this component. This method
     * performs no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the hierarchy bounds listener
     * @see      java.awt.event.HierarchyEvent
     * @see      java.awt.event.HierarchyBoundsListener
     * @see      #addHierarchyBoundsListener
     * @see      #getHierarchyBoundsListeners
     * @since    1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void addHierarchyBoundsListener(HierarchyBoundsListener l) {

    /**
     * Adds the specified hierarchy bounds listener to receive hierarchy
     * bounds events from this component when the hierarchy to which this
     * container belongs changes.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the hierarchy bounds listener
     * @see      java.awt.event.HierarchyEvent
     * @see      java.awt.event.HierarchyBoundsListener
     * @see      #removeHierarchyBoundsListener
     * @see      #getHierarchyBoundsListeners
     * @since    1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized HierarchyListener[] getHierarchyListeners() {

    /**
     * Returns an array of all the hierarchy listeners
     * registered on this component.
     *
     * @return all of this component's <code>HierarchyListener</code>s
     *         or an empty array if no hierarchy
     *         listeners are currently registered
     *
     * @see      #addHierarchyListener
     * @see      #removeHierarchyListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void removeHierarchyListener(HierarchyListener l) {

    /**
     * Removes the specified hierarchy listener so that it no longer
     * receives hierarchy changed events from this component. This method
     * performs no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the hierarchy listener
     * @see      java.awt.event.HierarchyEvent
     * @see      java.awt.event.HierarchyListener
     * @see      #addHierarchyListener
     * @see      #getHierarchyListeners
     * @since    1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void addHierarchyListener(HierarchyListener l) {

    /**
     * Adds the specified hierarchy listener to receive hierarchy changed
     * events from this component when the hierarchy to which this container
     * belongs changes.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the hierarchy listener
     * @see      java.awt.event.HierarchyEvent
     * @see      java.awt.event.HierarchyListener
     * @see      #removeHierarchyListener
     * @see      #getHierarchyListeners
     * @since    1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized FocusListener[] getFocusListeners() {

    /**
     * Returns an array of all the focus listeners
     * registered on this component.
     *
     * @return all of this component's <code>FocusListener</code>s
     *         or an empty array if no component
     *         listeners are currently registered
     *
     * @see #addFocusListener
     * @see #removeFocusListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeFocusListener(FocusListener l) {

    /**
     * Removes the specified focus listener so that it no longer
     * receives focus events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the focus listener
     * @see      java.awt.event.FocusEvent
     * @see      java.awt.event.FocusListener
     * @see      #addFocusListener
     * @see      #getFocusListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addFocusListener(FocusListener l) {

    /**
     * Adds the specified focus listener to receive focus events from
     * this component when this component gains input focus.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the focus listener
     * @see      java.awt.event.FocusEvent
     * @see      java.awt.event.FocusListener
     * @see      #removeFocusListener
     * @see      #getFocusListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized ComponentListener[] getComponentListeners() {

    /**
     * Returns an array of all the component listeners
     * registered on this component.
     *
     * @return all <code>ComponentListener</code>s of this component
     *         or an empty array if no component
     *         listeners are currently registered
     *
     * @see #addComponentListener
     * @see #removeComponentListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeComponentListener(ComponentListener l) {

    /**
     * Removes the specified component listener so that it no longer
     * receives component events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     * @param    l   the component listener
     * @see      java.awt.event.ComponentEvent
     * @see      java.awt.event.ComponentListener
     * @see      #addComponentListener
     * @see      #getComponentListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addComponentListener(ComponentListener l) {

    /**
     * Adds the specified component listener to receive component events from
     * this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the component listener
     * @see      java.awt.event.ComponentEvent
     * @see      java.awt.event.ComponentListener
     * @see      #removeComponentListener
     * @see      #getComponentListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by dispatchEvent(AWTEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public final void dispatchEvent(AWTEvent e) {

    /**
     * Dispatches an event to this component or one of its sub components.
     * Calls <code>processEvent</code> before returning for 1.1-style
     * events which have been enabled for the <code>Component</code>.
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>dispatchEvent(AWTEvent e)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Component getComponentAt(Point p) {

    /**
     * Returns the component or subcomponent that contains the
     * specified point.
     * @param     p   the point
     * @see       java.awt.Component#contains
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by getComponentAt(int, int).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Component getComponentAt(int x, int y) {

    /**
     * Determines if this component or one of its immediate
     * subcomponents contains the (<i>x</i>,&nbsp;<i>y</i>) location,
     * and if so, returns the containing component. This method only
     * looks one level deep. If the point (<i>x</i>,&nbsp;<i>y</i>) is
     * inside a subcomponent that itself has subcomponents, it does not
     * go looking down the subcomponent tree.
     * <p>
     * The <code>locate</code> method of <code>Component</code> simply
     * returns the component itself if the (<i>x</i>,&nbsp;<i>y</i>)
     * coordinate location is inside its bounding box, and <code>null</code>
     * otherwise.
     * @param     x   the <i>x</i> coordinate
     * @param     y   the <i>y</i> coordinate
     * @return    the component or subcomponent that contains the
     *                (<i>x</i>,&nbsp;<i>y</i>) location;
     *                <code>null</code> if the location
     *                is outside this component
     * @see       #contains(int, int)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean contains(Point p) {

    /**
     * Checks whether this component "contains" the specified point,
     * where the point's <i>x</i> and <i>y</i> coordinates are defined
     * to be relative to the coordinate system of this component.
     * @param     p     the point
     * @throws    NullPointerException if {@code p} is {@code null}
     * @see       #getComponentAt(Point)
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by contains(int, int).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean contains(int x, int y) {

    /**
     * Checks whether this component "contains" the specified point,
     * where <code>x</code> and <code>y</code> are defined to be
     * relative to the coordinate system of this component.
     * @param     x   the <i>x</i> coordinate of the point
     * @param     y   the <i>y</i> coordinate of the point
     * @see       #getComponentAt(int, int)
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean getIgnoreRepaint() {

    /**
     * @return whether or not paint messages received from the operating system
     * should be ignored.
     *
     * @since 1.4
     * @see #setIgnoreRepaint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setIgnoreRepaint(boolean ignoreRepaint) {

    /**
     * Sets whether or not paint messages received from the operating system
     * should be ignored.  This does not affect paint events generated in
     * software by the AWT, unless they are an immediate response to an
     * OS-level paint message.
     * <p>
     * This is useful, for example, if running under full-screen mode and
     * better performance is desired, or if page-flipping is used as the
     * buffer strategy.
     *
     * @since 1.4
     * @see #getIgnoreRepaint
     * @see Canvas#createBufferStrategy
     * @see Window#createBufferStrategy
     * @see java.awt.image.BufferStrategy
     * @see GraphicsDevice#setFullScreenWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private class SingleBufferStrategy extends BufferStrategy {

    /**
     * Inner class for flipping buffers on a component.  That component must
     * be a <code>Canvas</code> or <code>Window</code>.
     * @see Canvas
     * @see Window
     * @see java.awt.image.BufferStrategy
     * @author Michael Martak
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private class BltSubRegionBufferStrategy extends BltBufferStrategy

    /**
     * Private class to perform sub-region blitting.  Swing will use
     * this subclass via the SubRegionShowable interface in order to
     * copy only the area changed during a repaint.
     * See javax.swing.BufferStrategyPaintManager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private class FlipSubRegionBufferStrategy extends FlipBufferStrategy

    /**
     * Private class to perform sub-region flipping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean contentsRestored() {

        /**
         * @return whether the drawing buffer was recently restored from a lost
         * state and reinitialized to the default background color (white)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean contentsLost() {

        /**
         * @return whether the drawing buffer was lost since the last call to
         * <code>getDrawGraphics</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected void revalidate() {

        /**
         * Restore the drawing buffer if it has been lost
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        void showSubRegion(int x1, int y1, int x2, int y2) {

        /**
         * Package-private method to present a specific rectangular area
         * of this buffer.  This class currently shows only the entire
         * buffer, by calling showSubRegion() with the full dimensions of
         * the buffer.  Subclasses (e.g., BltSubRegionBufferStrategy
         * and FlipSubRegionBufferStrategy) may have region-specific show
         * methods that call this method with actual sub regions of the
         * buffer.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void show() {

        /**
         * Makes the next available buffer visible.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        Image getBackBuffer() {

        /**
         * @return direct access to the back buffer, as an image.
         * If there is no back buffer, returns null.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Graphics getDrawGraphics() {

        /**
         * @return the draw graphics
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public BufferCapabilities getCapabilities() {

        /**
         * @return the buffering capabilities of this strategy
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected void createBackBuffers(int numBuffers) {

        /**
         * Creates the back buffers
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void dispose() {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected BltBufferStrategy(int numBuffers, BufferCapabilities caps) {

        /**
         * Creates a new blt buffer strategy around a component
         * @param numBuffers number of buffers to create, including the
         * front buffer
         * @param caps the capabilities of the buffers
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        private Insets insets;

        /**
         * Insets for the hosting Component.  The size of the back buffer
         * is constrained by these.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected boolean validatedContents; // = false

        /**
         * Whether or not the drawing buffer has been recently restored from
         * a lost state.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected BufferCapabilities caps; // = null

        /**
         * The buffering capabilities
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected class BltBufferStrategy extends BufferStrategy {

    /**
     * Inner class for blitting offscreen surfaces to a component.
     *
     * @author Michael Martak
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void dispose() {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        void showSubRegion(int x1, int y1, int x2, int y2) {

        /**
         * Makes specified region of the the next available buffer visible
         * by either blitting or flipping.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void show() {

        /**
         * Makes the next available buffer visible by either blitting or
         * flipping.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean contentsRestored() {

        /**
         * @return whether the drawing buffer was recently restored from a lost
         * state and reinitialized to the default background color (white)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean contentsLost() {

        /**
         * @return whether the drawing buffer was lost since the last call to
         * <code>getDrawGraphics</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected void revalidate() {

        /**
         * Restore the drawing buffer if it has been lost
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Graphics getDrawGraphics() {

        /**
         * @return the graphics on the drawing buffer.  This method may not
         * be synchronized for performance reasons; use of this method by multiple
         * threads should be handled at the application level.  Disposal of the
         * graphics object must be handled by the application.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public BufferCapabilities getCapabilities() {

        /**
         * @return the buffering capabilities of this strategy
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected void destroyBuffers() {

        /**
         * Destroys the buffers created through this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected void flip(BufferCapabilities.FlipContents flipAction) {

        /**
         * Flipping moves the contents of the back buffer to the front buffer,
         * either by copying or by moving the video pointer.
         * @param flipAction an integer value describing the flipping action
         * for the contents of the back buffer.  This should be one of the
         * values of the <code>BufferCapabilities.FlipContents</code>
         * property.
         * @exception IllegalStateException if the buffers have not yet
         * been created
         * @see java.awt.BufferCapabilities#getFlipContents()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected Image getBackBuffer() {

        /**
         * @return direct access to the back buffer, as an image.
         * @exception IllegalStateException if the buffers have not yet
         * been created
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        private void updateInternalBuffers() {

        /**
         * Updates internal buffers (both volatile and non-volatile)
         * by requesting the back-buffer from the peer.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected void createBuffers(int numBuffers, BufferCapabilities caps)

        /**
         * Creates one or more complex, flipping buffers with the given
         * capabilities.
         * @param numBuffers number of buffers to create; must be greater than
         * one
         * @param caps the capabilities of the buffers.
         * <code>BufferCapabilities.isPageFlipping</code> must be
         * <code>true</code>.
         * @exception AWTException if the capabilities supplied could not be
         * supported or met
         * @exception IllegalStateException if the component has no peer
         * @exception IllegalArgumentException if numBuffers is less than two,
         * or if <code>BufferCapabilities.isPageFlipping</code> is not
         * <code>true</code>.
         * @see java.awt.BufferCapabilities#isPageFlipping()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected FlipBufferStrategy(int numBuffers, BufferCapabilities caps)

        /**
         * Creates a new flipping buffer strategy for this component.
         * The component must be a <code>Canvas</code> or <code>Window</code>.
         * @see Canvas
         * @see Window
         * @param numBuffers the number of buffers
         * @param caps the capabilities of the buffers
         * @exception AWTException if the capabilities supplied could not be
         * supported or met
         * @exception ClassCastException if the component is not a canvas or
         * window.
         * @exception IllegalStateException if the component has no peer
         * @exception IllegalArgumentException if {@code numBuffers} is less than two,
         * or if {@code BufferCapabilities.isPageFlipping} is not
         * {@code true}.
         * @see #createBuffers(int, BufferCapabilities)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        int width;

        /**
         * Size of the back buffers.  (Note: these fields were added in 6.0
         * but kept package-private to avoid exposing them in the spec.
         * None of these fields/methods really should have been marked
         * protected when they were introduced in 1.4, but now we just have
         * to live with that decision.)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected VolatileImage drawVBuffer; // = null

        /**
         * The drawing buffer as a volatile image
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected BufferCapabilities caps; // = null

        /**
         * The buffering capabilities
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected class FlipBufferStrategy extends BufferStrategy {

    /**
     * Inner class for flipping buffers on a component.  That component must
     * be a <code>Canvas</code> or <code>Window</code>.
     * @see Canvas
     * @see Window
     * @see java.awt.image.BufferStrategy
     * @author Michael Martak
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Image getBackBuffer() {

    /**
     * @return the back buffer currently used by this component's
     * BufferStrategy.  If there is no BufferStrategy or no
     * back buffer, this method returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    BufferStrategy getBufferStrategy() {

    /**
     * @return the buffer strategy used by this component
     * @see Window#createBufferStrategy
     * @see Canvas#createBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private class ProxyCapabilities extends ExtendedBufferCapabilities {

    /**
     * This is a proxy capabilities class used when a FlipBufferStrategy
     * is created instead of the requested Blit strategy.
     *
     * @see sun.java2d.SunGraphicsEnvironment#isFlipStrategyPreferred(ComponentPeer)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void createBufferStrategy(int numBuffers,
                              BufferCapabilities caps) throws AWTException {

    /**
     * Creates a new strategy for multi-buffering on this component with the
     * required buffer capabilities.  This is useful, for example, if only
     * accelerated memory or page flipping is desired (as specified by the
     * buffer capabilities).
     * <p>
     * Each time this method
     * is called, <code>dispose</code> will be invoked on the existing
     * <code>BufferStrategy</code>.
     * @param numBuffers number of buffers to create
     * @param caps the required capabilities for creating the buffer strategy;
     * cannot be <code>null</code>
     * @exception AWTException if the capabilities supplied could not be
     * supported or met; this may happen, for example, if there is not enough
     * accelerated memory currently available, or if page flipping is specified
     * but not possible.
     * @exception IllegalArgumentException if numBuffers is less than 1, or if
     * caps is <code>null</code>
     * @see Window#getBufferStrategy()
     * @see Canvas#getBufferStrategy()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void createBufferStrategy(int numBuffers) {

    /**
     * Creates a new strategy for multi-buffering on this component.
     * Multi-buffering is useful for rendering performance.  This method
     * attempts to create the best strategy available with the number of
     * buffers supplied.  It will always create a <code>BufferStrategy</code>
     * with that number of buffers.
     * A page-flipping strategy is attempted first, then a blitting strategy
     * using accelerated buffers.  Finally, an unaccelerated blitting
     * strategy is used.
     * <p>
     * Each time this method is called,
     * the existing buffer strategy for this component is discarded.
     * @param numBuffers number of buffers to create, including the front buffer
     * @exception IllegalArgumentException if numBuffers is less than 1.
     * @exception IllegalStateException if the component is not displayable
     * @see #isDisplayable
     * @see Window#getBufferStrategy()
     * @see Canvas#getBufferStrategy()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int checkImage(Image image, int width, int height,
                          ImageObserver observer) {

    /**
     * Returns the status of the construction of a screen representation
     * of the specified image.
     * <p>
     * This method does not cause the image to begin loading. An
     * application must use the <code>prepareImage</code> method
     * to force the loading of an image.
     * <p>
     * The <code>checkImage</code> method of <code>Component</code>
     * calls its peer's <code>checkImage</code> method to calculate
     * the flags. If this component does not yet have a peer, the
     * component's toolkit's <code>checkImage</code> method is called
     * instead.
     * <p>
     * Information on the flags returned by this method can be found
     * with the discussion of the <code>ImageObserver</code> interface.
     * @param     image   the <code>Image</code> object whose status
     *                    is being checked
     * @param     width   the width of the scaled version
     *                    whose status is to be checked
     * @param     height  the height of the scaled version
     *                    whose status is to be checked
     * @param     observer   the <code>ImageObserver</code> object
     *                    to be notified as the image is being prepared
     * @return    the bitwise inclusive <b>OR</b> of
     *            <code>ImageObserver</code> flags indicating what
     *            information about the image is currently available
     * @see      #prepareImage(Image, int, int, java.awt.image.ImageObserver)
     * @see      Toolkit#checkImage(Image, int, int, java.awt.image.ImageObserver)
     * @see      java.awt.image.ImageObserver
     * @since    JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int checkImage(Image image, ImageObserver observer) {

    /**
     * Returns the status of the construction of a screen representation
     * of the specified image.
     * <p>
     * This method does not cause the image to begin loading. An
     * application must use the <code>prepareImage</code> method
     * to force the loading of an image.
     * <p>
     * Information on the flags returned by this method can be found
     * with the discussion of the <code>ImageObserver</code> interface.
     * @param     image   the <code>Image</code> object whose status
     *            is being checked
     * @param     observer   the <code>ImageObserver</code>
     *            object to be notified as the image is being prepared
     * @return  the bitwise inclusive <b>OR</b> of
     *            <code>ImageObserver</code> flags indicating what
     *            information about the image is currently available
     * @see      #prepareImage(Image, int, int, java.awt.image.ImageObserver)
     * @see      Toolkit#checkImage(Image, int, int, java.awt.image.ImageObserver)
     * @see      java.awt.image.ImageObserver
     * @since    JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean prepareImage(Image image, int width, int height,
                                ImageObserver observer) {

    /**
     * Prepares an image for rendering on this component at the
     * specified width and height.
     * <p>
     * The image data is downloaded asynchronously in another thread,
     * and an appropriately scaled screen representation of the image is
     * generated.
     * @param     image    the instance of <code>Image</code>
     *            for which to prepare a screen representation
     * @param     width    the width of the desired screen representation
     * @param     height   the height of the desired screen representation
     * @param     observer   the <code>ImageObserver</code> object
     *            to be notified as the image is being prepared
     * @return    <code>true</code> if the image has already been fully
     *          prepared; <code>false</code> otherwise
     * @see       java.awt.image.ImageObserver
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean prepareImage(Image image, ImageObserver observer) {

    /**
     * Prepares an image for rendering on this component.  The image
     * data is downloaded asynchronously in another thread and the
     * appropriate screen representation of the image is generated.
     * @param     image   the <code>Image</code> for which to
     *                    prepare a screen representation
     * @param     observer   the <code>ImageObserver</code> object
     *                       to be notified as the image is being prepared
     * @return    <code>true</code> if the image has already been fully
     *           prepared; <code>false</code> otherwise
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public VolatileImage createVolatileImage(int width, int height,
                                             ImageCapabilities caps) throws AWTException {

    /**
     * Creates a volatile off-screen drawable image, with the given capabilities.
     * The contents of this image may be lost at any time due
     * to operating system issues, so the image must be managed
     * via the <code>VolatileImage</code> interface.
     * @param width the specified width.
     * @param height the specified height.
     * @param caps the image capabilities
     * @exception AWTException if an image with the specified capabilities cannot
     * be created
     * @return a VolatileImage object, which can be used
     * to manage surface contents loss and capabilities.
     * @see java.awt.image.VolatileImage
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public VolatileImage createVolatileImage(int width, int height) {

    /**
     * Creates a volatile off-screen drawable image
     *     to be used for double buffering.
     * @param     width the specified width.
     * @param     height the specified height.
     * @return    an off-screen drawable image, which can be used for double
     *    buffering.  The return value may be <code>null</code> if the
     *    component is not displayable.  This will always happen if
     *    <code>GraphicsEnvironment.isHeadless()</code> returns
     *    <code>true</code>.
     * @see java.awt.image.VolatileImage
     * @see #isDisplayable
     * @see GraphicsEnvironment#isHeadless
     * @since     1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Image createImage(int width, int height) {

    /**
     * Creates an off-screen drawable image
     *     to be used for double buffering.
     * @param     width the specified width
     * @param     height the specified height
     * @return    an off-screen drawable image, which can be used for double
     *    buffering.  The return value may be <code>null</code> if the
     *    component is not displayable.  This will always happen if
     *    <code>GraphicsEnvironment.isHeadless()</code> returns
     *    <code>true</code>.
     * @see #isDisplayable
     * @see GraphicsEnvironment#isHeadless
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Image createImage(ImageProducer producer) {

    /**
     * Creates an image from the specified image producer.
     * @param     producer  the image producer
     * @return    the image produced
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean imageUpdate(Image img, int infoflags,
                               int x, int y, int w, int h) {

    /**
     * Repaints the component when the image has changed.
     * This <code>imageUpdate</code> method of an <code>ImageObserver</code>
     * is called when more information about an
     * image which had been previously requested using an asynchronous
     * routine such as the <code>drawImage</code> method of
     * <code>Graphics</code> becomes available.
     * See the definition of <code>imageUpdate</code> for
     * more information on this method and its arguments.
     * <p>
     * The <code>imageUpdate</code> method of <code>Component</code>
     * incrementally draws an image on the component as more of the bits
     * of the image are available.
     * <p>
     * If the system property <code>awt.image.incrementaldraw</code>
     * is missing or has the value <code>true</code>, the image is
     * incrementally drawn. If the system property has any other value,
     * then the image is not drawn until it has been completely loaded.
     * <p>
     * Also, if incremental drawing is in effect, the value of the
     * system property <code>awt.image.redrawrate</code> is interpreted
     * as an integer to give the maximum redraw rate, in milliseconds. If
     * the system property is missing or cannot be interpreted as an
     * integer, the redraw rate is once every 100ms.
     * <p>
     * The interpretation of the <code>x</code>, <code>y</code>,
     * <code>width</code>, and <code>height</code> arguments depends on
     * the value of the <code>infoflags</code> argument.
     *
     * @param     img   the image being observed
     * @param     infoflags   see <code>imageUpdate</code> for more information
     * @param     x   the <i>x</i> coordinate
     * @param     y   the <i>y</i> coordinate
     * @param     w   the width
     * @param     h   the height
     * @return    <code>false</code> if the infoflags indicate that the
     *            image is completely loaded; <code>true</code> otherwise.
     *
     * @see     java.awt.image.ImageObserver
     * @see     Graphics#drawImage(Image, int, int, Color, java.awt.image.ImageObserver)
     * @see     Graphics#drawImage(Image, int, int, java.awt.image.ImageObserver)
     * @see     Graphics#drawImage(Image, int, int, int, int, Color, java.awt.image.ImageObserver)
     * @see     Graphics#drawImage(Image, int, int, int, int, java.awt.image.ImageObserver)
     * @see     java.awt.image.ImageObserver#imageUpdate(java.awt.Image, int, int, int, int, int)
     * @since   JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void printHeavyweightComponents(Graphics g) {

    /**
     * Prints all the heavyweight subcomponents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void lightweightPrint(Graphics g) {

    /**
     * Simulates the peer callbacks into java.awt for printing of
     * lightweight Components.
     * @param     g   the graphics context to use for printing
     * @see       #printAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void printAll(Graphics g) {

    /**
     * Prints this component and all of its subcomponents.
     * <p>
     * The origin of the graphics context, its
     * (<code>0</code>,&nbsp;<code>0</code>) coordinate point, is the
     * top-left corner of this component. The clipping region of the
     * graphics context is the bounding rectangle of this component.
     * @param     g   the graphics context to use for printing
     * @see       #print(Graphics)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void print(Graphics g) {

    /**
     * Prints this component. Applications should override this method
     * for components that must do special processing before being
     * printed or should be printed differently than they are painted.
     * <p>
     * The default implementation of this method calls the
     * <code>paint</code> method.
     * <p>
     * The origin of the graphics context, its
     * (<code>0</code>,&nbsp;<code>0</code>) coordinate point, is the
     * top-left corner of this component. The clipping region of the
     * graphics context is the bounding rectangle of this component.
     * @param     g   the graphics context to use for printing
     * @see       #paint(Graphics)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void repaint(long tm, int x, int y, int width, int height) {

    /**
     * Repaints the specified rectangle of this component within
     * <code>tm</code> milliseconds.
     * <p>
     * If this component is a lightweight component, this method causes
     * a call to this component's <code>paint</code> method.
     * Otherwise, this method causes a call to this component's
     * <code>update</code> method.
     * <p>
     * <b>Note</b>: For more information on the paint mechanisms utilitized
     * by AWT and Swing, including information on how to write the most
     * efficient painting code, see
     * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.
     *
     * @param     tm   maximum time in milliseconds before update
     * @param     x    the <i>x</i> coordinate
     * @param     y    the <i>y</i> coordinate
     * @param     width    the width
     * @param     height   the height
     * @see       #update(Graphics)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void repaint(int x, int y, int width, int height) {

    /**
     * Repaints the specified rectangle of this component.
     * <p>
     * If this component is a lightweight component, this method
     * causes a call to this component's <code>paint</code> method
     * as soon as possible.  Otherwise, this method causes a call to
     * this component's <code>update</code> method as soon as possible.
     * <p>
     * <b>Note</b>: For more information on the paint mechanisms utilitized
     * by AWT and Swing, including information on how to write the most
     * efficient painting code, see
     * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.
     *
     * @param     x   the <i>x</i> coordinate
     * @param     y   the <i>y</i> coordinate
     * @param     width   the width
     * @param     height  the height
     * @see       #update(Graphics)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void repaint(long tm) {

    /**
     * Repaints the component.  If this component is a lightweight
     * component, this results in a call to <code>paint</code>
     * within <code>tm</code> milliseconds.
     * <p>
     * <b>Note</b>: For more information on the paint mechanisms utilitized
     * by AWT and Swing, including information on how to write the most
     * efficient painting code, see
     * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.
     *
     * @param tm maximum time in milliseconds before update
     * @see #paint
     * @see #update(Graphics)
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void repaint() {

    /**
     * Repaints this component.
     * <p>
     * If this component is a lightweight component, this method
     * causes a call to this component's <code>paint</code>
     * method as soon as possible.  Otherwise, this method causes
     * a call to this component's <code>update</code> method as soon
     * as possible.
     * <p>
     * <b>Note</b>: For more information on the paint mechanisms utilitized
     * by AWT and Swing, including information on how to write the most
     * efficient painting code, see
     * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.

     *
     * @see       #update(Graphics)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void paintHeavyweightComponents(Graphics g) {

    /**
     * Paints all the heavyweight subcomponents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void lightweightPaint(Graphics g) {

    /**
     * Simulates the peer callbacks into java.awt for painting of
     * lightweight Components.
     * @param     g   the graphics context to use for painting
     * @see       #paintAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void paintAll(Graphics g) {

    /**
     * Paints this component and all of its subcomponents.
     * <p>
     * The origin of the graphics context, its
     * (<code>0</code>,&nbsp;<code>0</code>) coordinate point, is the
     * top-left corner of this component. The clipping region of the
     * graphics context is the bounding rectangle of this component.
     *
     * @param     g   the graphics context to use for painting
     * @see       #paint
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void update(Graphics g) {

    /**
     * Updates this component.
     * <p>
     * If this component is not a lightweight component, the
     * AWT calls the <code>update</code> method in response to
     * a call to <code>repaint</code>.  You can assume that
     * the background is not cleared.
     * <p>
     * The <code>update</code> method of <code>Component</code>
     * calls this component's <code>paint</code> method to redraw
     * this component.  This method is commonly overridden by subclasses
     * which need to do additional work in response to a call to
     * <code>repaint</code>.
     * Subclasses of Component that override this method should either
     * call <code>super.update(g)</code>, or call <code>paint(g)</code>
     * directly from their <code>update</code> method.
     * <p>
     * The origin of the graphics context, its
     * (<code>0</code>,&nbsp;<code>0</code>) coordinate point, is the
     * top-left corner of this component. The clipping region of the
     * graphics context is the bounding rectangle of this component.
     *
     * <p>
     * <b>Note</b>: For more information on the paint mechanisms utilitized
     * by AWT and Swing, including information on how to write the most
     * efficient painting code, see
     * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.
     *
     * @param g the specified context to use for updating
     * @see       #paint
     * @see       #repaint()
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void paint(Graphics g) {

    /**
     * Paints this component.
     * <p>
     * This method is called when the contents of the component should
     * be painted; such as when the component is first being shown or
     * is damaged and in need of repair.  The clip rectangle in the
     * <code>Graphics</code> parameter is set to the area
     * which needs to be painted.
     * Subclasses of <code>Component</code> that override this
     * method need not call <code>super.paint(g)</code>.
     * <p>
     * For performance reasons, <code>Component</code>s with zero width
     * or height aren't considered to need painting when they are first shown,
     * and also aren't considered to need repair.
     * <p>
     * <b>Note</b>: For more information on the paint mechanisms utilitized
     * by AWT and Swing, including information on how to write the most
     * efficient painting code, see
     * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.
     *
     * @param g the graphics context to use for painting
     * @see       #update
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isCursorSet() {

    /**
     * Returns whether the cursor has been explicitly set for this Component.
     * If this method returns <code>false</code>, this Component is inheriting
     * its cursor from an ancestor.
     *
     * @return <code>true</code> if the cursor has been explicitly set for this
     *         Component; <code>false</code> otherwise.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Cursor getCursor() {

    /**
     * Gets the cursor set in the component. If the component does
     * not have a cursor set, the cursor of its parent is returned.
     * If no cursor is set in the entire hierarchy,
     * <code>Cursor.DEFAULT_CURSOR</code> is returned.
     * @see #setCursor
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final void updateCursorImmediately() {

    /**
     * Updates the cursor.  May not be invoked from the native
     * message pump.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setCursor(Cursor cursor) {

    /**
     * Sets the cursor image to the specified cursor.  This cursor
     * image is displayed when the <code>contains</code> method for
     * this component returns true for the current cursor location, and
     * this Component is visible, displayable, and enabled. Setting the
     * cursor of a <code>Container</code> causes that cursor to be displayed
     * within all of the container's subcomponents, except for those
     * that have a non-<code>null</code> cursor.
     * <p>
     * The method may have no visual effect if the Java platform
     * implementation and/or the native system do not support
     * changing the mouse cursor shape.
     * @param cursor One of the constants defined
     *          by the <code>Cursor</code> class;
     *          if this parameter is <code>null</code>
     *          then this component will inherit
     *          the cursor of its parent
     * @see       #isEnabled
     * @see       #isShowing
     * @see       #getCursor
     * @see       #contains
     * @see       Toolkit#createCustomCursor
     * @see       Cursor
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public FontMetrics getFontMetrics(Font font) {

    /**
     * Gets the font metrics for the specified font.
     * Warning: Since Font metrics are affected by the
     * {@link java.awt.font.FontRenderContext FontRenderContext} and
     * this method does not provide one, it can return only metrics for
     * the default render context which may not match that used when
     * rendering on the Component if {@link Graphics2D} functionality is being
     * used. Instead metrics can be obtained at rendering time by calling
     * {@link Graphics#getFontMetrics()} or text measurement APIs on the
     * {@link Font Font} class.
     * @param font the font for which font metrics is to be
     *          obtained
     * @return the font metrics for <code>font</code>
     * @see       #getFont
     * @see       #getPeer
     * @see       java.awt.peer.ComponentPeer#getFontMetrics(Font)
     * @see       Toolkit#getFontMetrics(Font)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Graphics getGraphics() {

    /**
     * Creates a graphics context for this component. This method will
     * return <code>null</code> if this component is currently not
     * displayable.
     * @return a graphics context for this component, or <code>null</code>
     *             if it has none
     * @see       #paint
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final void revalidateSynchronously() {

    /**
     * Revalidates the component synchronously.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void revalidate() {

    /**
     * Revalidates the component hierarchy up to the nearest validate root.
     * <p>
     * This method first invalidates the component hierarchy starting from this
     * component up to the nearest validate root. Afterwards, the component
     * hierarchy is validated starting from the nearest validate root.
     * <p>
     * This is a convenience method supposed to help application developers
     * avoid looking for validate roots manually. Basically, it's equivalent to
     * first calling the {@link #invalidate()} method on this component, and
     * then calling the {@link #validate()} method on the nearest validate
     * root.
     *
     * @see Container#isValidateRoot
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final void invalidateIfValid() {

    /** Invalidates the component unless it is already invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void invalidateParent() {

    /**
     * Invalidates the parent of this component if any.
     *
     * This method MUST BE invoked under the TreeLock.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void invalidate() {

    /**
     * Invalidates this component and its ancestors.
     * <p>
     * By default, all the ancestors of the component up to the top-most
     * container of the hierarchy are marked invalid. If the {@code
     * java.awt.smartInvalidate} system property is set to {@code true},
     * invalidation stops on the nearest validate root of this component.
     * Marking a container <i>invalid</i> indicates that the container needs to
     * be laid out.
     * <p>
     * This method is called automatically when any layout-related information
     * changes (e.g. setting the bounds of the component, or adding the
     * component to a container).
     * <p>
     * This method might be called often, so it should work fast.
     *
     * @see       #validate
     * @see       #doLayout
     * @see       LayoutManager
     * @see       java.awt.Container#isValidateRoot
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void validate() {

    /**
     * Validates this component.
     * <p>
     * The meaning of the term <i>validating</i> is defined by the ancestors of
     * this class. See {@link Container#validate} for more details.
     *
     * @see       #invalidate
     * @see       #doLayout()
     * @see       LayoutManager
     * @see       Container#validate
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>doLayout()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void doLayout() {

    /**
     * Prompts the layout manager to lay out this component. This is
     * usually called when the component (more specifically, container)
     * is validated.
     * @see #validate
     * @see LayoutManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public BaselineResizeBehavior getBaselineResizeBehavior() {

    /**
     * Returns an enum indicating how the baseline of the component
     * changes as the size changes.  This method is primarily meant for
     * layout managers and GUI builders.
     * <p>
     * The default implementation returns
     * <code>BaselineResizeBehavior.OTHER</code>.  Subclasses that have a
     * baseline should override appropriately.  Subclasses should
     * never return <code>null</code>; if the baseline can not be
     * calculated return <code>BaselineResizeBehavior.OTHER</code>.  Callers
     * should first ask for the baseline using
     * <code>getBaseline</code> and if a value &gt;= 0 is returned use
     * this method.  It is acceptable for this method to return a
     * value other than <code>BaselineResizeBehavior.OTHER</code> even if
     * <code>getBaseline</code> returns a value less than 0.
     *
     * @return an enum indicating how the baseline changes as the component
     *         size changes
     * @see #getBaseline(int, int)
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int getBaseline(int width, int height) {

    /**
     * Returns the baseline.  The baseline is measured from the top of
     * the component.  This method is primarily meant for
     * <code>LayoutManager</code>s to align components along their
     * baseline.  A return value less than 0 indicates this component
     * does not have a reasonable baseline and that
     * <code>LayoutManager</code>s should not align this component on
     * its baseline.
     * <p>
     * The default implementation returns -1.  Subclasses that support
     * baseline should override appropriately.  If a value &gt;= 0 is
     * returned, then the component has a valid baseline for any
     * size &gt;= the minimum size and <code>getBaselineResizeBehavior</code>
     * can be used to determine how the baseline changes with size.
     *
     * @param width the width to get the baseline for
     * @param height the height to get the baseline for
     * @return the baseline or &lt; 0 indicating there is no reasonable
     *         baseline
     * @throws IllegalArgumentException if width or height is &lt; 0
     * @see #getBaselineResizeBehavior
     * @see java.awt.FontMetrics
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public float getAlignmentY() {

    /**
     * Returns the alignment along the y axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public float getAlignmentX() {

    /**
     * Returns the alignment along the x axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Dimension getMaximumSize() {

    /**
     * Gets the maximum size of this component.
     * @return a dimension object indicating this component's maximum size
     * @see #getMinimumSize
     * @see #getPreferredSize
     * @see LayoutManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isMaximumSizeSet() {

    /**
     * Returns true if the maximum size has been set to a non-<code>null</code>
     * value otherwise returns false.
     *
     * @return true if <code>maximumSize</code> is non-<code>null</code>,
     *          false otherwise
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setMaximumSize(Dimension maximumSize) {

    /**
     * Sets the maximum size of this component to a constant
     * value.  Subsequent calls to <code>getMaximumSize</code> will always
     * return this value.  Setting the maximum size to <code>null</code>
     * restores the default behavior.
     *
     * @param maximumSize a <code>Dimension</code> containing the
     *          desired maximum allowable size
     * @see #getMaximumSize
     * @see #isMaximumSizeSet
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMinimumSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Dimension getMinimumSize() {

    /**
     * Gets the minimum size of this component.
     * @return a dimension object indicating this component's minimum size
     * @see #getPreferredSize
     * @see LayoutManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isMinimumSizeSet() {

    /**
     * Returns whether or not <code>setMinimumSize</code> has been
     * invoked with a non-null value.
     *
     * @return true if <code>setMinimumSize</code> has been invoked with a
     *              non-null value.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setMinimumSize(Dimension minimumSize) {

    /**
     * Sets the minimum size of this component to a constant
     * value.  Subsequent calls to <code>getMinimumSize</code> will always
     * return this value.  Setting the minimum size to <code>null</code>
     * restores the default behavior.
     *
     * @param minimumSize the new minimum size of this component
     * @see #getMinimumSize
     * @see #isMinimumSizeSet
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getPreferredSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Dimension getPreferredSize() {

    /**
     * Gets the preferred size of this component.
     * @return a dimension object indicating this component's preferred size
     * @see #getMinimumSize
     * @see LayoutManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isPreferredSizeSet() {

    /**
     * Returns true if the preferred size has been set to a
     * non-<code>null</code> value otherwise returns false.
     *
     * @return true if <code>setPreferredSize</code> has been invoked
     *         with a non-null value.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setPreferredSize(Dimension preferredSize) {

    /**
     * Sets the preferred size of this component to a constant
     * value.  Subsequent calls to <code>getPreferredSize</code> will always
     * return this value.  Setting the preferred size to <code>null</code>
     * restores the default behavior.
     *
     * @param preferredSize The new preferred size, or null
     * @see #getPreferredSize
     * @see #isPreferredSizeSet
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isLightweight() {

    /**
     * A lightweight component doesn't have a native toolkit peer.
     * Subclasses of <code>Component</code> and <code>Container</code>,
     * other than the ones defined in this package like <code>Button</code>
     * or <code>Scrollbar</code>, are lightweight.
     * All of the Swing components are lightweights.
     * <p>
     * This method will always return <code>false</code> if this component
     * is not displayable because it is impossible to determine the
     * weight of an undisplayable component.
     *
     * @return true if this component has a lightweight peer; false if
     *         it has a native peer or no peer
     * @see #isDisplayable
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isOpaque() {

    /**
     * Returns true if this component is completely opaque, returns
     * false by default.
     * <p>
     * An opaque component paints every pixel within its
     * rectangular region. A non-opaque component paints only some of
     * its pixels, allowing the pixels underneath it to "show through".
     * A component that does not fully paint its pixels therefore
     * provides a degree of transparency.
     * <p>
     * Subclasses that guarantee to always completely paint their
     * contents should override this method and return true.
     *
     * @return true if this component is completely opaque
     * @see #isLightweight
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Point getLocation(Point rv) {

    /**
     * Stores the x,y origin of this component into "return value" <b>rv</b>
     * and return <b>rv</b>.   If rv is <code>null</code> a new
     * <code>Point</code> is allocated.
     * This version of <code>getLocation</code> is useful if the
     * caller wants to avoid allocating a new <code>Point</code>
     * object on the heap.
     *
     * @param rv the return value, modified to the components location
     * @return rv
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Dimension getSize(Dimension rv) {

    /**
     * Stores the width/height of this component into "return value" <b>rv</b>
     * and return <b>rv</b>.   If rv is <code>null</code> a new
     * <code>Dimension</code> object is allocated.  This version of
     * <code>getSize</code> is useful if the caller wants to avoid
     * allocating a new <code>Dimension</code> object on the heap.
     *
     * @param rv the return value, modified to the components size
     * @return rv
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Rectangle getBounds(Rectangle rv) {

    /**
     * Stores the bounds of this component into "return value" <b>rv</b> and
     * return <b>rv</b>.  If rv is <code>null</code> a new
     * <code>Rectangle</code> is allocated.
     * This version of <code>getBounds</code> is useful if the caller
     * wants to avoid allocating a new <code>Rectangle</code> object
     * on the heap.
     *
     * @param rv the return value, modified to the components bounds
     * @return rv
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int getHeight() {

    /**
     * Returns the current height of this component.
     * This method is preferable to writing
     * <code>component.getBounds().height</code>,
     * or <code>component.getSize().height</code> because it
     * doesn't cause any heap allocations.
     *
     * @return the current height of this component
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int getWidth() {

    /**
     * Returns the current width of this component.
     * This method is preferable to writing
     * <code>component.getBounds().width</code>,
     * or <code>component.getSize().width</code> because it
     * doesn't cause any heap allocations.
     *
     * @return the current width of this component
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int getY() {

    /**
     * Returns the current y coordinate of the components origin.
     * This method is preferable to writing
     * <code>component.getBounds().y</code>,
     * or <code>component.getLocation().y</code> because it
     * doesn't cause any heap allocations.
     *
     * @return the current y coordinate of the components origin
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int getX() {

    /**
     * Returns the current x coordinate of the components origin.
     * This method is preferable to writing
     * <code>component.getBounds().x</code>,
     * or <code>component.getLocation().x</code> because it doesn't
     * cause any heap allocations.
     *
     * @return the current x coordinate of the components origin
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setBounds(Rectangle r) {

    /**
     * Moves and resizes this component to conform to the new
     * bounding rectangle <code>r</code>. This component's new
     * position is specified by <code>r.x</code> and <code>r.y</code>,
     * and its new size is specified by <code>r.width</code> and
     * <code>r.height</code>
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param r the new bounding rectangle for this component
     * @throws NullPointerException if {@code r} is {@code null}
     * @see       #getBounds
     * @see       #setLocation(int, int)
     * @see       #setLocation(Point)
     * @see       #setSize(int, int)
     * @see       #setSize(Dimension)
     * @see #invalidate
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setBounds(int, int, int, int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setBounds(int x, int y, int width, int height) {

    /**
     * Moves and resizes this component. The new location of the top-left
     * corner is specified by <code>x</code> and <code>y</code>, and the
     * new size is specified by <code>width</code> and <code>height</code>.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param x the new <i>x</i>-coordinate of this component
     * @param y the new <i>y</i>-coordinate of this component
     * @param width the new <code>width</code> of this component
     * @param height the new <code>height</code> of this
     *          component
     * @see #getBounds
     * @see #setLocation(int, int)
     * @see #setLocation(Point)
     * @see #setSize(int, int)
     * @see #setSize(Dimension)
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getBounds()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Rectangle getBounds() {

    /**
     * Gets the bounds of this component in the form of a
     * <code>Rectangle</code> object. The bounds specify this
     * component's width, height, and location relative to
     * its parent.
     * @return a rectangle indicating this component's bounds
     * @see #setBounds
     * @see #getLocation
     * @see #getSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setSize(Dimension)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setSize(Dimension d) {

    /**
     * Resizes this component so that it has width <code>d.width</code>
     * and height <code>d.height</code>.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param d the dimension specifying the new size
     *          of this component
     * @throws NullPointerException if {@code d} is {@code null}
     * @see #setSize
     * @see #setBounds
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setSize(int, int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setSize(int width, int height) {

    /**
     * Resizes this component so that it has width <code>width</code>
     * and height <code>height</code>.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param width the new width of this component in pixels
     * @param height the new height of this component in pixels
     * @see #getSize
     * @see #setBounds
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Dimension getSize() {

    /**
     * Returns the size of this component in the form of a
     * <code>Dimension</code> object. The <code>height</code>
     * field of the <code>Dimension</code> object contains
     * this component's height, and the <code>width</code>
     * field of the <code>Dimension</code> object contains
     * this component's width.
     * @return a <code>Dimension</code> object that indicates the
     *          size of this component
     * @see #setSize
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setLocation(Point p) {

    /**
     * Moves this component to a new location. The top-left corner of
     * the new location is specified by point <code>p</code>. Point
     * <code>p</code> is given in the parent's coordinate space.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param p the point defining the top-left corner
     *          of the new location, given in the coordinate space of this
     *          component's parent
     * @see #getLocation
     * @see #setBounds
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setLocation(int, int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setLocation(int x, int y) {

    /**
     * Moves this component to a new location. The top-left corner of
     * the new location is specified by the <code>x</code> and <code>y</code>
     * parameters in the coordinate space of this component's parent.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param x the <i>x</i>-coordinate of the new location's
     *          top-left corner in the parent's coordinate space
     * @param y the <i>y</i>-coordinate of the new location's
     *          top-left corner in the parent's coordinate space
     * @see #getLocation
     * @see #setBounds
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getLocation()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Point getLocationOnScreen() {

    /**
     * Gets the location of this component in the form of a point
     * specifying the component's top-left corner in the screen's
     * coordinate space.
     * @return an instance of <code>Point</code> representing
     *          the top-left corner of the component's bounds in the
     *          coordinate space of the screen
     * @throws IllegalComponentStateException if the
     *          component is not showing on the screen
     * @see #setLocation
     * @see #getLocation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Point getLocation() {

    /**
     * Gets the location of this component in the form of a
     * point specifying the component's top-left corner.
     * The location will be relative to the parent's coordinate space.
     * <p>
     * Due to the asynchronous nature of native event handling, this
     * method can return outdated values (for instance, after several calls
     * of <code>setLocation()</code> in rapid succession).  For this
     * reason, the recommended method of obtaining a component's position is
     * within <code>java.awt.event.ComponentListener.componentMoved()</code>,
     * which is called after the operating system has finished moving the
     * component.
     * </p>
     * @return an instance of <code>Point</code> representing
     *          the top-left corner of the component's bounds in
     *          the coordinate space of the component's parent
     * @see #setLocation
     * @see #getLocationOnScreen
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public ColorModel getColorModel() {

    /**
     * Gets the instance of <code>ColorModel</code> used to display
     * the component on the output device.
     * @return the color model used by this component
     * @see java.awt.image.ColorModel
     * @see java.awt.peer.ComponentPeer#getColorModel()
     * @see Toolkit#getColorModel()
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setLocale(Locale l) {

    /**
     * Sets the locale of this component.  This is a bound property.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param l the locale to become this component's locale
     * @see #getLocale
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Locale getLocale() {

    /**
     * Gets the locale of this component.
     * @return this component's locale; if this component does not
     *          have a locale, the locale of its parent is returned
     * @see #setLocale
     * @exception IllegalComponentStateException if the <code>Component</code>
     *          does not have its own locale and has not yet been added to
     *          a containment hierarchy such that the locale can be determined
     *          from the containing parent
     * @since  JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isFontSet() {

    /**
     * Returns whether the font has been explicitly set for this Component. If
     * this method returns <code>false</code>, this Component is inheriting its
     * font from an ancestor.
     *
     * @return <code>true</code> if the font has been explicitly set for this
     *         Component; <code>false</code> otherwise.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setFont(Font f) {

    /**
     * Sets the font of this component.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param f the font to become this component's font;
     *          if this parameter is <code>null</code> then this
     *          component will inherit the font of its parent
     * @see #getFont
     * @see #invalidate
     * @since JDK1.0
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Transient

    /**
     * Gets the font of this component.
     * @return this component's font; if a font has not been set
     * for this component, the font of its parent is returned
     * @see #setFont
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isBackgroundSet() {

    /**
     * Returns whether the background color has been explicitly set for this
     * Component. If this method returns <code>false</code>, this Component is
     * inheriting its background color from an ancestor.
     *
     * @return <code>true</code> if the background color has been explicitly
     *         set for this Component; <code>false</code> otherwise.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setBackground(Color c) {

    /**
     * Sets the background color of this component.
     * <p>
     * The background color affects each component differently and the
     * parts of the component that are affected by the background color
     * may differ between operating systems.
     *
     * @param c the color to become this component's color;
     *          if this parameter is <code>null</code>, then this
     *          component will inherit the background color of its parent
     * @see #getBackground
     * @since JDK1.0
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Transient

    /**
     * Gets the background color of this component.
     * @return this component's background color; if this component does
     *          not have a background color,
     *          the background color of its parent is returned
     * @see #setBackground
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isForegroundSet() {

    /**
     * Returns whether the foreground color has been explicitly set for this
     * Component. If this method returns <code>false</code>, this Component is
     * inheriting its foreground color from an ancestor.
     *
     * @return <code>true</code> if the foreground color has been explicitly
     *         set for this Component; <code>false</code> otherwise.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setForeground(Color c) {

    /**
     * Sets the foreground color of this component.
     * @param c the color to become this component's
     *          foreground color; if this parameter is <code>null</code>
     *          then this component will inherit
     *          the foreground color of its parent
     * @see #getForeground
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Transient

    /**
     * Gets the foreground color of this component.
     * @return this component's foreground color; if this component does
     * not have a foreground color, the foreground color of its parent
     * is returned
     * @see #setForeground
     * @since JDK1.0
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setVisible(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setVisible(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setVisible(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setVisible(boolean b) {

    /**
     * Shows or hides this component depending on the value of parameter
     * <code>b</code>.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param b  if <code>true</code>, shows this component;
     * otherwise, hides this component
     * @see #isVisible
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void enableInputMethods(boolean enable) {

    /**
     * Enables or disables input method support for this component. If input
     * method support is enabled and the component also processes key events,
     * incoming events are offered to
     * the current input method and will only be processed by the component or
     * dispatched to its listeners if the input method does not consume them.
     * By default, input method support is enabled.
     *
     * @param enable true to enable, false to disable
     * @see #processKeyEvent
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isDoubleBuffered() {

    /**
     * Returns true if this component is painted to an offscreen image
     * ("buffer") that's copied to the screen later.  Component
     * subclasses that support double buffering should override this
     * method to return true if double buffering is enabled.
     *
     * @return false by default
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setEnabled(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setEnabled(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setEnabled(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setEnabled(boolean b) {

    /**
     * Enables or disables this component, depending on the value of the
     * parameter <code>b</code>. An enabled component can respond to user
     * input and generate events. Components are enabled initially by default.
     *
     * <p>Note: Disabling a lightweight component does not prevent it from
     * receiving MouseEvents.
     * <p>Note: Disabling a heavyweight container prevents all components
     * in this container from receiving any input events.  But disabling a
     * lightweight container affects only this container.
     *
     * @param     b   If <code>true</code>, this component is
     *            enabled; otherwise this component is disabled
     * @see #isEnabled
     * @see #isLightweight
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isEnabled() {

    /**
     * Determines whether this component is enabled. An enabled component
     * can respond to user input and generate events. Components are
     * enabled initially by default. A component may be enabled or disabled by
     * calling its <code>setEnabled</code> method.
     * @return <code>true</code> if the component is enabled,
     *          <code>false</code> otherwise
     * @see #setEnabled
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isShowing() {

    /**
     * Determines whether this component is showing on screen. This means
     * that the component must be visible, and it must be in a container
     * that is visible and showing.
     * <p>
     * <strong>Note:</strong> sometimes there is no way to detect whether the
     * {@code Component} is actually visible to the user.  This can happen when:
     * <ul>
     * <li>the component has been added to a visible {@code ScrollPane} but
     * the {@code Component} is not currently in the scroll pane's view port.
     * <li>the {@code Component} is obscured by another {@code Component} or
     * {@code Container}.
     * </ul>
     * @return <code>true</code> if the component is showing,
     *          <code>false</code> otherwise
     * @see #setVisible
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean isSameOrAncestorOf(Component comp, boolean allowChildren) {

    /**
     * Overridden in Container. Must be called under TreeLock.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Point getMousePosition() throws HeadlessException {

    /**
     * Returns the position of the mouse pointer in this <code>Component</code>'s
     * coordinate space if the <code>Component</code> is directly under the mouse
     * pointer, otherwise returns <code>null</code>.
     * If the <code>Component</code> is not showing on the screen, this method
     * returns <code>null</code> even if the mouse pointer is above the area
     * where the <code>Component</code> would be displayed.
     * If the <code>Component</code> is partially or fully obscured by other
     * <code>Component</code>s or native windows, this method returns a non-null
     * value only if the mouse pointer is located above the unobscured part of the
     * <code>Component</code>.
     * <p>
     * For <code>Container</code>s it returns a non-null value if the mouse is
     * above the <code>Container</code> itself or above any of its descendants.
     * Use {@link Container#getMousePosition(boolean)} if you need to exclude children.
     * <p>
     * Sometimes the exact mouse coordinates are not important, and the only thing
     * that matters is whether a specific <code>Component</code> is under the mouse
     * pointer. If the return value of this method is <code>null</code>, mouse
     * pointer is not directly above the <code>Component</code>.
     *
     * @exception HeadlessException if GraphicsEnvironment.isHeadless() returns true
     * @see       #isShowing
     * @see       Container#getMousePosition
     * @return    mouse coordinates relative to this <code>Component</code>, or null
     * @since     1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Component findUnderMouseInWindow(PointerInfo pi) {

    /**
     * Assuming that mouse location is stored in PointerInfo passed
     * to this method, it finds a Component that is in the same
     * Window as this Component and is located under the mouse pointer.
     * If no such Component exists, null is returned.
     * NOTE: this method should be called under the protection of
     * tree lock, as it is done in Component.getMousePosition() and
     * Container.getMousePosition(boolean).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Point pointRelativeToComponent(Point absolute) {

    /**
     * Translates absolute coordinates into coordinates in the coordinate
     * space of this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private Rectangle getRecursivelyVisibleBounds() {

    /**
     * Determines the bounds of a visible part of the component relative to its
     * parent.
     *
     * @return the visible part of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean isRecursivelyVisible() {

    /**
     * Determines whether this component will be displayed on the screen.
     * @return <code>true</code> if the component and all of its ancestors
     *          until a toplevel window or null parent are visible,
     *          <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Transient

    /**
     * Determines whether this component should be visible when its
     * parent is visible. Components are
     * initially visible, with the exception of top level components such
     * as <code>Frame</code> objects.
     * @return <code>true</code> if the component is visible,
     * <code>false</code> otherwise
     * @see #setVisible
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isDisplayable() {

    /**
     * Determines whether this component is displayable. A component is
     * displayable when it is connected to a native screen resource.
     * <p>
     * A component is made displayable either when it is added to
     * a displayable containment hierarchy or when its containment
     * hierarchy is made displayable.
     * A containment hierarchy is made displayable when its ancestor
     * window is either packed or made visible.
     * <p>
     * A component is made undisplayable either when it is removed from
     * a displayable containment hierarchy or when its containment hierarchy
     * is made undisplayable.  A containment hierarchy is made
     * undisplayable when its ancestor window is disposed.
     *
     * @return <code>true</code> if the component is displayable,
     * <code>false</code> otherwise
     * @see Container#add(Component)
     * @see Window#pack
     * @see Window#show
     * @see Container#remove(Component)
     * @see Window#dispose
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isValid() {

    /**
     * Determines whether this component is valid. A component is valid
     * when it is correctly sized and positioned within its parent
     * container and all its children are also valid.
     * In order to account for peers' size requirements, components are invalidated
     * before they are first shown on the screen. By the time the parent container
     * is fully realized, all its components will be valid.
     * @return <code>true</code> if the component is valid, <code>false</code>
     * otherwise
     * @see #validate
     * @see #invalidate
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Toolkit getToolkit() {

    /**
     * Gets the toolkit of this component. Note that
     * the frame that contains a component controls which
     * toolkit is used by that component. Therefore if the component
     * is moved from one frame to another, the toolkit it uses may change.
     * @return  the toolkit of this component
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public final Object getTreeLock() {

    /**
     * Gets this component's locking object (the object that owns the thread
     * synchronization monitor) for AWT component-tree and layout
     * operations.
     * @return this component's locking object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void checkGD(String stringID) {

    /**
     * Checks that this component's <code>GraphicsDevice</code>
     * <code>idString</code> matches the string argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public GraphicsConfiguration getGraphicsConfiguration() {

    /**
     * Gets the <code>GraphicsConfiguration</code> associated with this
     * <code>Component</code>.
     * If the <code>Component</code> has not been assigned a specific
     * <code>GraphicsConfiguration</code>,
     * the <code>GraphicsConfiguration</code> of the
     * <code>Component</code> object's top-level container is
     * returned.
     * If the <code>Component</code> has been created, but not yet added
     * to a <code>Container</code>, this method returns <code>null</code>.
     *
     * @return the <code>GraphicsConfiguration</code> used by this
     *          <code>Component</code> or <code>null</code>
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized DropTarget getDropTarget() { return dropTarget; }

    /**
     * Gets the <code>DropTarget</code> associated with this
     * <code>Component</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void setDropTarget(DropTarget dt) {

    /**
     * Associate a <code>DropTarget</code> with this component.
     * The <code>Component</code> will receive drops only if it
     * is enabled.
     *
     * @see #isEnabled
     * @param dt The DropTarget
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * programs should not directly manipulate peers;
     * replaced by <code>boolean isDisplayable()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Container getParent() {

    /**
     * Gets the parent of this component.
     * @return the parent container of this component
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setName(String name) {

    /**
     * Sets the name of the component to the specified string.
     * @param name  the string that is to be this
     *           component's name
     * @see #getName
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public String getName() {

    /**
     * Gets the name of the component.
     * @return this component's name
     * @see    #setName
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    String constructComponentName() {

    /**
     * Constructs a name for this component.  Called by <code>getName</code>
     * when the name is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected Component() {

    /**
     * Constructs a new component. Class <code>Component</code> can be
     * extended directly to create a lightweight component that does not
     * utilize an opaque native window. A lightweight component must be
     * hosted by a native container somewhere higher up in the component
     * tree (for example, by a <code>Frame</code> object).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    int getBoundsOp() {

    /**
     * Should only be used in subclass getBounds to check that part of bounds
     * is actualy changing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        OTHER

        /**
         * Indicates the baseline resize behavior can not be expressed using
         * any of the other constants.  This may also indicate the baseline
         * varies with the width of the component.  This is also returned
         * by components that do not have a baseline.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        CENTER_OFFSET,

        /**
         * Indicates the baseline remains a fixed distance from
         * the center of the component.  That is, for any height H the
         * difference between <code>getBaseline(w, H)</code> and
         * <code>H / 2</code> is the same (plus or minus one depending upon
         * rounding error).
         * <p>
         * Because of possible rounding errors it is recommended
         * you ask for the baseline with two consecutive heights and use
         * the return value to determine if you need to pad calculations
         * by 1.  The following shows how to calculate the baseline for
         * any height:
         * <pre>
         *   Dimension preferredSize = component.getPreferredSize();
         *   int baseline = getBaseline(preferredSize.width,
         *                              preferredSize.height);
         *   int nextBaseline = getBaseline(preferredSize.width,
         *                                  preferredSize.height + 1);
         *   // Amount to add to height when calculating where baseline
         *   // lands for a particular height:
         *   int padding = 0;
         *   // Where the baseline is relative to the mid point
         *   int baselineOffset = baseline - height / 2;
         *   if (preferredSize.height % 2 == 0 &amp;&amp;
         *       baseline != nextBaseline) {
         *       padding = 1;
         *   }
         *   else if (preferredSize.height % 2 == 1 &amp;&amp;
         *            baseline == nextBaseline) {
         *       baselineOffset--;
         *       padding = 1;
         *   }
         *   // The following calculates where the baseline lands for
         *   // the height z:
         *   int calculatedBaseline = (z + padding) / 2 + baselineOffset;
         * </pre>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        CONSTANT_DESCENT,

        /**
         * Indicates the baseline remains fixed relative to the height
         * and does not change as the width is varied.  That is, for
         * any height H the difference between H and
         * <code>getBaseline(w, H)</code> is the same.  For example, a
         * <code>JLabel</code> containing non-empty text with a
         * vertical alignment of <code>BOTTOM</code> should have a
         * baseline type of <code>CONSTANT_DESCENT</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public enum BaselineResizeBehavior {

    /**
     * Enumeration of the common ways the baseline of a component can
     * change as the size changes.  The baseline resize behavior is
     * primarily for layout managers that need to know how the
     * position of the baseline changes as the component size changes.
     * In general the baseline resize behavior will be valid for sizes
     * greater than or equal to the minimum size (the actual minimum
     * size; not a developer specified minimum size).  For sizes
     * smaller than the minimum size the baseline may change in a way
     * other than the baseline resize behavior indicates.  Similarly,
     * as the size approaches <code>Integer.MAX_VALUE</code> and/or
     * <code>Short.MAX_VALUE</code> the baseline may change in a way
     * other than the baseline resize behavior indicates.
     *
     * @see #getBaselineResizeBehavior
     * @see #getBaseline(int,int)
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private int boundsOp = ComponentPeer.DEFAULT_OPERATION;

    /**
     * Pseudoparameter for direct Geometry API (setLocation, setBounds setSize
     * to signal setBounds what's changing. Should be used under TreeLock.
     * This is only needed due to the inability to change the cross-calling
     * order of public and deprecated methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private PropertyChangeSupport changeSupport;

    /**
     * If any <code>PropertyChangeListeners</code> have been registered,
     * the <code>changeSupport</code> field describes them.
     *
     * @serial
     * @since 1.2
     * @see #addPropertyChangeListener
     * @see #removePropertyChangeListener
     * @see #firePropertyChange
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public static final float RIGHT_ALIGNMENT = 1.0f;

    /**
     * Ease-of-use constant for <code>getAlignmentX</code>.
     * Specifies an alignment to the right side of the component.
     * @see     #getAlignmentX
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public static final float LEFT_ALIGNMENT = 0.0f;

    /**
     * Ease-of-use constant for <code>getAlignmentX</code>.
     * Specifies an alignment to the left side of the component.
     * @see     #getAlignmentX
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public static final float BOTTOM_ALIGNMENT = 1.0f;

    /**
     * Ease-of-use constant for <code>getAlignmentY</code>.
     * Specifies an alignment to the bottom of the component.
     * @see     #getAlignmentY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public static final float CENTER_ALIGNMENT = 0.5f;

    /**
     * Ease-of-use constant for <code>getAlignmentY</code> and
     * <code>getAlignmentX</code>. Specifies an alignment to
     * the center of the component
     * @see     #getAlignmentX
     * @see     #getAlignmentY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public static final float TOP_ALIGNMENT = 0.0f;

    /**
     * Ease-of-use constant for <code>getAlignmentY()</code>.
     * Specifies an alignment to the top of the component.
     * @see     #getAlignmentY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    static boolean isInc;

    /**
     * Static properties for incremental drawing.
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    long eventMask = AWTEvent.INPUT_METHODS_ENABLED_MASK;

    /**
     * The <code>eventMask</code> is ONLY set by subclasses via
     * <code>enableEvents</code>.
     * The mask should NOT be set when listeners are registered
     * so that we can distinguish the difference between when
     * listeners request events and subclasses request them.
     * One bit is used to indicate whether input methods are
     * enabled; this bit is set by <code>enableInputMethods</code> and is
     * on by default.
     *
     * @serial
     * @see #enableInputMethods
     * @see AWTEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final static String actionListenerK = "actionL";

    /** Internal, constants for serialization */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean newEventsOnly = false;

    /**
     * <code>newEventsOnly</code> will be true if the event is
     * one of the event types enabled for the component.
     * It will then allow for normal processing to
     * continue.  If it is false the event is passed
     * to the component's parent and up the ancestor
     * tree until the event has been consumed.
     *
     * @serial
     * @see #dispatchEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    transient ComponentOrientation componentOrientation

    /**
     * The orientation for this component.
     * @see #getComponentOrientation
     * @see #setComponentOrientation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean maxSizeSet;

    /**
     * Whether or not setMaximumSize has been invoked with a non-null value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Dimension maxSize;

    /**
     * Maximum size
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean prefSizeSet;

    /**
     * Whether or not setPreferredSize has been invoked with a non-null value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Dimension prefSize;

    /**
     * Preferred size.
     * (This field perhaps should have been transient).
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean minSizeSet;

    /**
     * Whether or not setMinimumSize has been invoked with a non-null value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Dimension minSize;

    /**
     * Minimum size.
     * (This field perhaps should have been transient).
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    static final Object LOCK = new AWTTreeLock();

    /**
     * The locking object for AWT component-tree and layout operations.
     *
     * @see #getTreeLock
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private boolean focusTraversalKeysEnabled = true;

    /**
     * Indicates whether focus traversal keys are enabled for this Component.
     * Components for which focus traversal keys are disabled receive key
     * events for focus traversal keys. Components for which focus traversal
     * keys are enabled do not see these events; instead, the events are
     * automatically converted to traversal operations.
     *
     * @serial
     * @see #setFocusTraversalKeysEnabled
     * @see #getFocusTraversalKeysEnabled
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Set<AWTKeyStroke>[] focusTraversalKeys;

    /**
     * The focus traversal keys. These keys will generate focus traversal
     * behavior for Components for which focus traversal keys are enabled. If a
     * value of null is specified for a traversal key, this Component inherits
     * that traversal key from its parent. If all ancestors of this Component
     * have null specified for that traversal key, then the current
     * KeyboardFocusManager's default traversal key is used.
     *
     * @serial
     * @see #setFocusTraversalKeys
     * @see #getFocusTraversalKeys
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private int isFocusTraversableOverridden = FOCUS_TRAVERSABLE_UNKNOWN;

    /**
     * Tracks whether this Component is relying on default focus travesability.
     *
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private boolean focusable = true;

    /**
     * Indicates whether this Component can be focused.
     *
     * @serial
     * @see #setFocusable
     * @see #isFocusable
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private boolean nameExplicitlySet = false;

    /**
     * A bool to determine whether the name has
     * been set explicitly. <code>nameExplicitlySet</code> will
     * be false if the name has not been set and
     * true if it has.
     *
     * @serial
     * @see #getName
     * @see #setName(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private String name;

    /**
     * A component's name.
     * This field can be <code>null</code>.
     *
     * @serial
     * @see #getName
     * @see #setName(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Vector<PopupMenu> popups;

    /**
     * @serial
     * @see #add
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    DropTarget dropTarget;

    /**
     * The <code>DropTarget</code> associated with this component.
     *
     * @since 1.2
     * @serial
     * @see #setDropTarget
     * @see #getDropTarget
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private volatile boolean valid = false;

    /**
     * True when the object is valid. An invalid object needs to
     * be layed out. This flag is set to false when the object
     * size is changed.
     *
     * @serial
     * @see #isValid
     * @see #validate
     * @see #invalidate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean enabled = true;

    /**
     * True when the object is enabled. An object that is not
     * enabled does not interact with the user.
     *
     * @serial
     * @see #isEnabled
     * @see #setEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean visible = true;

    /**
     * True when the object is visible. An object that is not
     * visible is not drawn on the screen.
     *
     * @serial
     * @see #isVisible
     * @see #setVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean ignoreRepaint = false;

    /**
     * True when the object should ignore all repaint events.
     *
     * @since 1.4
     * @serial
     * @see #setIgnoreRepaint
     * @see #getIgnoreRepaint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    transient BufferStrategy bufferStrategy = null;

    /**
     * A reference to a <code>BufferStrategy</code> object
     * used to manipulate the buffers on this component.
     *
     * @since 1.4
     * @see java.awt.image.BufferStrategy
     * @see #getBufferStrategy()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private transient GraphicsConfiguration graphicsConfig = null;

    /**
     * A reference to a <code>GraphicsConfiguration</code> object
     * used to describe the characteristics of a graphics
     * destination.
     * This value can be <code>null</code>.
     *
     * @since 1.3
     * @serial
     * @see GraphicsConfiguration
     * @see #getGraphicsConfiguration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Locale      locale;

    /**
     * The locale for the component.
     *
     * @serial
     * @see #getLocale
     * @see #setLocale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Cursor      cursor;

    /**
     * The cursor displayed when pointer is over this component.
     * This value can be <code>null</code>.
     *
     * @serial
     * @see #getCursor
     * @see #setCursor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Font        peerFont;

    /**
     * The font which the peer is currently using.
     * (<code>null</code> if no peer exists.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    volatile Font font;

    /**
     * The font used by this component.
     * The <code>font</code> can be <code>null</code>.
     *
     * @serial
     * @see #getFont
     * @see #setFont
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Color       background;

    /**
     * The background color for this component.
     * <code>background</code> can be <code>null</code>.
     *
     * @serial
     * @see #getBackground
     * @see #setBackground
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Color       foreground;

    /**
     * The foreground color for this component.
     * <code>foreground</code> can be <code>null</code>.
     *
     * @serial
     * @see #getForeground
     * @see #setForeground
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    int height;

    /**
     * The height of the component.
     *
     * @serial
     * @see #getSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    int width;

    /**
     * The width of the component.
     *
     * @serial
     * @see #getSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    int y;

    /**
     * The y position of the component in the parent's coordinate system.
     *
     * @serial
     * @see #getLocation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    int x;

    /**
     * The x position of the component in the parent's coordinate system.
     *
     * @serial
     * @see #getLocation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    transient AppContext appContext;

    /**
     * The <code>AppContext</code> of the component. Applets/Plugin may
     * change the AppContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    transient Container parent;

    /**
     * The parent of the object. It may be <code>null</code>
     * for top-level components.
     * @see #getParent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    transient ComponentPeer peer;

    /**
     * The peer of the component. The peer implements the component's
     * behavior. The peer is set when the <code>Component</code> is
     * added to a container that also is a peer.
     * @see #addNotify
     * @see #removeNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
public abstract class Component implements ImageObserver, MenuContainer,

/**
 * A <em>component</em> is an object having a graphical representation
 * that can be displayed on the screen and that can interact with the
 * user. Examples of components are the buttons, checkboxes, and scrollbars
 * of a typical graphical user interface. <p>
 * The <code>Component</code> class is the abstract superclass of
 * the nonmenu-related Abstract Window Toolkit components. Class
 * <code>Component</code> can also be extended directly to create a
 * lightweight component. A lightweight component is a component that is
 * not associated with a native window. On the contrary, a heavyweight
 * component is associated with a native window. The {@link #isLightweight()}
 * method may be used to distinguish between the two kinds of the components.
 * <p>
 * Lightweight and heavyweight components may be mixed in a single component
 * hierarchy. However, for correct operating of such a mixed hierarchy of
 * components, the whole hierarchy must be valid. When the hierarchy gets
 * invalidated, like after changing the bounds of components, or
 * adding/removing components to/from containers, the whole hierarchy must be
 * validated afterwards by means of the {@link Container#validate()} method
 * invoked on the top-most invalid container of the hierarchy.
 *
 * <h3>Serialization</h3>
 * It is important to note that only AWT listeners which conform
 * to the <code>Serializable</code> protocol will be saved when
 * the object is stored.  If an AWT object has listeners that
 * aren't marked serializable, they will be dropped at
 * <code>writeObject</code> time.  Developers will need, as always,
 * to consider the implications of making an object serializable.
 * One situation to watch out for is this:
 * <pre>
 *    import java.awt.*;
 *    import java.awt.event.*;
 *    import java.io.Serializable;
 *
 *    class MyApp implements ActionListener, Serializable
 *    {
 *        BigObjectThatShouldNotBeSerializedWithAButton bigOne;
 *        Button aButton = new Button();
 *
 *        MyApp()
 *        {
 *            // Oops, now aButton has a listener with a reference
 *            // to bigOne!
 *            aButton.addActionListener(this);
 *        }
 *
 *        public void actionPerformed(ActionEvent e)
 *        {
 *            System.out.println("Hello There");
 *        }
 *    }
 * </pre>
 * In this example, serializing <code>aButton</code> by itself
 * will cause <code>MyApp</code> and everything it refers to
 * to be serialized as well.  The problem is that the listener
 * is serializable by coincidence, not by design.  To separate
 * the decisions about <code>MyApp</code> and the
 * <code>ActionListener</code> being serializable one can use a
 * nested class, as in the following example:
 * <pre>
 *    import java.awt.*;
 *    import java.awt.event.*;
 *    import java.io.Serializable;
 *
 *    class MyApp implements java.io.Serializable
 *    {
 *         BigObjectThatShouldNotBeSerializedWithAButton bigOne;
 *         Button aButton = new Button();
 *
 *         static class MyActionListener implements ActionListener
 *         {
 *             public void actionPerformed(ActionEvent e)
 *             {
 *                 System.out.println("Hello There");
 *             }
 *         }
 *
 *         MyApp()
 *         {
 *             aButton.addActionListener(new MyActionListener());
 *         }
 *    }
 * </pre>
 * <p>
 * <b>Note</b>: For more information on the paint mechanisms utilitized
 * by AWT and Swing, including information on how to write the most
 * efficient painting code, see
 * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.
 * <p>
 * For details on the focus subsystem, see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/misc/focus.html">
 * How to Use the Focus Subsystem</a>,
 * a section in <em>The Java Tutorial</em>, and the
 * <a href="../../java/awt/doc-files/FocusSpec.html">Focus Specification</a>
 * for more information.
 *
 * @author      Arthur van Hoff
 * @author      Sami Shaio
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Region getOpaqueShape() {

    /**
     * Returns the "opaque shape" of the component.
     *
     * The opaque shape of a lightweight components is the actual shape that
     * needs to be cut off of the heavyweight components in order to mix this
     * lightweight component correctly with them.
     *
     * The method is overriden in the java.awt.Container to handle non-opaque
     * containers containing opaque children.
     *
     * See 6637655 for details.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final Region getNormalShape() {

    /**
     * Returns the full shape of the component located in window coordinates
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private Region getAppliedShape() {

    /**
     * Returns the shape previously set with applyCompoundShape().
     * If the component is LW or no shape was applied yet,
     * the method returns the normal shape.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void applyCompoundShape(Region shape) {

    /**
     * Applies the shape to the component
     * @param shape Shape to be applied to the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final boolean areBoundsValid() {

    /**
     * Check whether we can trust the current bounds of the component.
     * The return value of false indicates that the container of the
     * component is invalid, and therefore needs to be layed out, which would
     * probably mean changing the bounds of its children.
     * Null-layout of the container or absence of the container mean
     * the bounds of the component are final and can be trusted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    static boolean isInstanceOf(Object obj, String className) {

    /**
     * Checks that the given object is instance of the given class.
     * @param obj Object to be checked
     * @param className The name of the class. Must be fully-qualified class name.
     * @return true, if this object is instanceof given class,
     *         false, otherwise, or if obj or className is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    AccessibleStateSet getAccessibleStateSet() {

    /**
     * Gets the current state set of this object.
     *
     * @return an instance of <code>AccessibleStateSet</code>
     *    containing the current state set of the object
     * @see AccessibleState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    int getAccessibleIndexInParent() {

    /**
     * Gets the index of this object in its accessible parent.
     * If this object does not have an accessible parent, returns
     * -1.
     *
     * @return the index of this object in its accessible parent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void removeFocusListener(FocusListener l) {

        /**
         * Removes the specified focus listener so it no longer receives focus
         * events from this component.
         *
         * @param l the focus listener
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void addFocusListener(FocusListener l) {

        /**
         * Adds the specified focus listener to receive focus events from this
         * component.
         *
         * @param l the focus listener
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void requestFocus() {

        /**
         * Requests focus for this object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean isFocusTraversable() {

        /**
         * Returns whether this object can accept focus or not.
         *
         * @return true if object can accept focus; otherwise false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Accessible getAccessibleAt(Point p) {

        /**
         * Returns the <code>Accessible</code> child,
         * if one exists, contained at the local
         * coordinate <code>Point</code>.  Otherwise returns
         * <code>null</code>.
         *
         * @param p the point defining the top-left corner of
         *      the <code>Accessible</code>, given in the
         *      coordinate space of the object's parent
         * @return the <code>Accessible</code>, if it exists,
         *      at the specified location; else <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void setSize(Dimension d) {

        /**
         * Resizes this object so that it has width and height.
         *
         * @param d - the dimension specifying the new size of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Dimension getSize() {

        /**
         * Returns the size of this object in the form of a
         * <code>Dimension</code> object. The height field of the
         * <code>Dimension</code> object contains this objects's
         * height, and the width field of the <code>Dimension</code>
         * object contains this object's width.
         *
         * @return a <code>Dimension</code> object that indicates
         *     the size of this component; <code>null</code> if
         *     this object is not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Rectangle getBounds() {

        /**
         * Gets the bounds of this object in the form of a Rectangle object.
         * The bounds specify this object's width, height, and location
         * relative to its parent.
         *
         * @return a rectangle indicating this component's bounds;
         *   <code>null</code> if this object is not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void setLocation(Point p) {

        /**
         * Sets the location of the object relative to the parent.
         * @param p  the coordinates of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Point getLocation() {

        /**
         * Gets the location of the object relative to the parent in the form
         * of a point specifying the object's top-left corner in the screen's
         * coordinate space.
         *
         * @return an instance of Point representing the top-left corner of
         * the object's bounds in the coordinate space of the screen;
         * <code>null</code> if this object or its parent are not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Point getLocationOnScreen() {

        /**
         * Returns the location of the object on the screen.
         *
         * @return location of object on screen -- can be
         *    <code>null</code> if this object is not on the screen
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean contains(Point p) {

        /**
         * Checks whether the specified point is within this object's bounds,
         * where the point's x and y coordinates are defined to be relative to
         * the coordinate system of the object.
         *
         * @param p the <code>Point</code> relative to the
         *     coordinate system of the object
         * @return true if object contains <code>Point</code>; otherwise false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void setVisible(boolean b) {

        /**
         * Sets the visible state of the object.
         *
         * @param b if true, shows this object; otherwise, hides it
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void setEnabled(boolean b) {

        /**
         * Sets the enabled state of the object.
         *
         * @param b if true, enables this object; otherwise, disables it
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean isEnabled() {

        /**
         * Determines if the object is enabled.
         *
         * @return true if object is enabled; otherwise, false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public FontMetrics getFontMetrics(Font f) {

        /**
         * Gets the <code>FontMetrics</code> of this object.
         *
         * @param f the <code>Font</code>
         * @return the <code>FontMetrics</code>, if supported,
         *     the object; otherwise, <code>null</code>
         * @see #getFont
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void setFont(Font f) {

        /**
         * Sets the <code>Font</code> of this object.
         *
         * @param f the new <code>Font</code> for the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Font getFont() {

        /**
         * Gets the <code>Font</code> of this object.
         *
         * @return the <code>Font</code>, if supported,
         *    for the object; otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Cursor getCursor() {

        /**
         * Gets the <code>Cursor</code> of this object.
         *
         * @return the <code>Cursor</code>, if supported,
         *     of the object; otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void setForeground(Color c) {

        /**
         * Sets the foreground color of this object.
         *
         * @param c the new <code>Color</code> for the foreground
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Color getForeground() {

        /**
         * Gets the foreground color of this object.
         *
         * @return the foreground color, if supported, of the object;
         *     otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Color getBackground() {

        /**
         * Gets the background color of this object.
         *
         * @return the background color, if supported, of the object;
         *      otherwise, <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public AccessibleComponent getAccessibleComponent() {

        /**
         * Gets the <code>AccessibleComponent</code> associated
         * with this object if one exists.
         * Otherwise return <code>null</code>.
         *
         * @return the component
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Locale getLocale() {

        /**
         * Returns the locale of this object.
         *
         * @return the locale of this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Returns the nth <code>Accessible</code> child of the object.
         *
         * @param i zero-based index of child
         * @return the nth <code>Accessible</code> child of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public int getAccessibleIndexInParent() {

        /**
         * Gets the index of this object in its accessible parent.
         *
         * @return the index of this object in its parent; or -1 if this
         *    object does not have an accessible parent
         * @see #getAccessibleParent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Accessible getAccessibleParent() {

        /**
         * Gets the <code>Accessible</code> parent of this object.
         * If the parent of this object implements <code>Accessible</code>,
         * this method should simply return <code>getParent</code>.
         *
         * @return the <code>Accessible</code> parent of this
         *      object -- can be <code>null</code> if this
         *      object does not have an <code>Accessible</code> parent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Gets the state of this object.
         *
         * @return an instance of <code>AccessibleStateSet</code>
         *       containing the current state set of the object
         * @see javax.accessibility.AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Gets the role of this object.
         *
         * @return an instance of <code>AccessibleRole</code>
         *      describing the role of the object
         * @see javax.accessibility.AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
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
         *        <code>null</code> if this object does not have a description
         * @see javax.accessibility.AccessibleContext#setAccessibleDescription
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public String getAccessibleName() {

        /**
         * Gets the accessible name of this object.  This should almost never
         * return <code>java.awt.Component.getName()</code>,
         * as that generally isn't a localized name,
         * and doesn't have meaning for the user.  If the
         * object is fundamentally a text object (e.g. a menu item), the
         * accessible name should be the text of the object (e.g. "save").
         * If the object has a tooltip, the tooltip text may also be an
         * appropriate String to return.
         *
         * @return the localized name of the object -- can be
         *         <code>null</code> if this
         *         object does not have a name
         * @see javax.accessibility.AccessibleContext#setAccessibleName
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void removePropertyChangeListener(PropertyChangeListener listener) {

        /**
         * Remove a PropertyChangeListener from the listener list.
         * This removes a PropertyChangeListener that was registered
         * for all properties.
         *
         * @param listener  The PropertyChangeListener to be removed
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void addPropertyChangeListener(PropertyChangeListener listener) {

        /**
         * Adds a <code>PropertyChangeListener</code> to the listener list.
         *
         * @param listener  the property change listener to be added
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected class AccessibleAWTFocusHandler implements FocusListener {

        /**
         * Fire PropertyChange listener, if one is registered,
         * when focus events happen
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected class AccessibleAWTComponentHandler implements ComponentListener {

        /**
         * Fire PropertyChange listener, if one is registered,
         * when shown/hidden..
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        private volatile transient int propertyListenersCount = 0;

        /**
         * Number of PropertyChangeListener objects registered. It's used
         * to add/remove ComponentListener and FocusListener to track
         * target Component's state.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected AccessibleAWTComponent() {

        /**
         * Though the class is abstract, this should be called by
         * all sub-classes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected abstract class AccessibleAWTComponent extends AccessibleContext

    /**
     * Inner class of Component used to provide default support for
     * accessibility.  This class is not meant to be used directly by
     * application developers, but is instead meant only to be
     * subclassed by component developers.
     * <p>
     * The class used to obtain the accessible role for this object.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> associated
     * with this <code>Component</code>.
     * The method implemented by this base
     * class returns null.  Classes that extend <code>Component</code>
     * should implement this method to return the
     * <code>AccessibleContext</code> associated with the subclass.
     *
     *
     * @return the <code>AccessibleContext</code> of this
     *    <code>Component</code>
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected AccessibleContext accessibleContext = null;

    /**
     * The {@code AccessibleContext} associated with this {@code Component}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Window getContainingWindow() {

    /**
     * Returns the <code>Window</code> ancestor of the component.
     * @return Window ancestor of the component or component by itself if it is Window;
     *         null, if component is not a part of window hierarchy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final void relocateComponent() {

    /**
     * Fix the location of the HW component in a LW container hierarchy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final boolean canBeFocusOwnerRecursively() {

    /**
     * Checks that this component meets the prerequesites to be focus owner:
     * - it is enabled, visible, focusable
     * - it's parents are all enabled and showing
     * - top-level window is focusable
     * - if focus cycle root has DefaultFocusTraversalPolicy then it also checks that this policy accepts
     * this component as focus owner
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void applyComponentOrientation(ComponentOrientation orientation) {

    /**
     * Sets the <code>ComponentOrientation</code> property of this component
     * and all components contained within it.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     *
     * @param orientation the new component orientation of this component and
     *        the components contained within it.
     * @exception NullPointerException if <code>orientation</code> is null.
     * @see #setComponentOrientation
     * @see #getComponentOrientation
     * @see #invalidate
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public ComponentOrientation getComponentOrientation() {

    /**
     * Retrieves the language-sensitive orientation that is to be used to order
     * the elements or text within this component.  <code>LayoutManager</code>
     * and <code>Component</code>
     * subclasses that wish to respect orientation should call this method to
     * get the component's orientation before performing layout or drawing.
     *
     * @see ComponentOrientation
     *
     * @author Laura Werner, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setComponentOrientation(ComponentOrientation o) {

    /**
     * Sets the language-sensitive orientation that is to be used to order
     * the elements or text within this component.  Language-sensitive
     * <code>LayoutManager</code> and <code>Component</code>
     * subclasses will use this property to
     * determine how to lay out and draw components.
     * <p>
     * At construction time, a component's orientation is set to
     * <code>ComponentOrientation.UNKNOWN</code>,
     * indicating that it has not been specified
     * explicitly.  The UNKNOWN orientation behaves the same as
     * <code>ComponentOrientation.LEFT_TO_RIGHT</code>.
     * <p>
     * To set the orientation of a single component, use this method.
     * To set the orientation of an entire component
     * hierarchy, use
     * {@link #applyComponentOrientation applyComponentOrientation}.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     *
     * @see ComponentOrientation
     * @see #invalidate
     *
     * @author Laura Werner, IBM
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code> and if it isn't
     * <code>null</code> adds a listener to receive a variety
     * of events fired by the component.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * a variety of serializable listeners as optional data.
     * The non-serializable listeners are detected and
     * no attempt is made to serialize them.
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @serialData <code>null</code> terminated sequence of
     *   0 or more pairs; the pair consists of a <code>String</code>
     *   and an <code>Object</code>; the <code>String</code> indicates
     *   the type of object and is one of the following (as of 1.4):
     *   <code>componentListenerK</code> indicating an
     *     <code>ComponentListener</code> object;
     *   <code>focusListenerK</code> indicating an
     *     <code>FocusListener</code> object;
     *   <code>keyListenerK</code> indicating an
     *     <code>KeyListener</code> object;
     *   <code>mouseListenerK</code> indicating an
     *     <code>MouseListener</code> object;
     *   <code>mouseMotionListenerK</code> indicating an
     *     <code>MouseMotionListener</code> object;
     *   <code>inputMethodListenerK</code> indicating an
     *     <code>InputMethodListener</code> object;
     *   <code>hierarchyListenerK</code> indicating an
     *     <code>HierarchyListener</code> object;
     *   <code>hierarchyBoundsListenerK</code> indicating an
     *     <code>HierarchyBoundsListener</code> object;
     *   <code>mouseWheelListenerK</code> indicating an
     *     <code>MouseWheelListener</code> object
     * @serialData an optional <code>ComponentOrientation</code>
     *    (after <code>inputMethodListener</code>, as of 1.2)
     *
     * @see AWTEventMulticaster#save(java.io.ObjectOutputStream, java.lang.String, java.util.EventListener)
     * @see #componentListenerK
     * @see #focusListenerK
     * @see #keyListenerK
     * @see #mouseListenerK
     * @see #mouseMotionListenerK
     * @see #inputMethodListenerK
     * @see #hierarchyListenerK
     * @see #hierarchyBoundsListenerK
     * @see #mouseWheelListenerK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private void doSwingSerialization() {

    /**
     * This hack is for Swing serialization. It will invoke
     * the Swing package private method <code>compWriteObjectNotify</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private int componentSerializedDataVersion = 4;

    /**
     * Component Serialized Data Version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void firePropertyChange(String propertyName, double oldValue, double newValue) {

    /**
     * Reports a bound property change.
     *
     * @param propertyName the programmatic name of the property
     *          that was changed
     * @param oldValue the old value of the property (as a double)
     * @param newValue the new value of the property (as a double)
     * @see #firePropertyChange(java.lang.String, java.lang.Object,
     *          java.lang.Object)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void firePropertyChange(String propertyName, float oldValue, float newValue) {

    /**
     * Reports a bound property change.
     *
     * @param propertyName the programmatic name of the property
     *          that was changed
     * @param oldValue the old value of the property (as a float)
     * @param newValue the new value of the property (as a float)
     * @see #firePropertyChange(java.lang.String, java.lang.Object,
     *          java.lang.Object)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void firePropertyChange(String propertyName, long oldValue, long newValue) {

    /**
     * Reports a bound property change.
     *
     * @param propertyName the programmatic name of the property
     *          that was changed
     * @param oldValue the old value of the property (as a long)
     * @param newValue the new value of the property (as a long)
     * @see #firePropertyChange(java.lang.String, java.lang.Object,
     *          java.lang.Object)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void firePropertyChange(String propertyName, short oldValue, short newValue) {

    /**
     * Reports a bound property change.
     *
     * @param propertyName the programmatic name of the property
     *          that was changed
     * @param oldValue the old value of the property (as a short)
     * @param newValue the old value of the property (as a short)
     * @see #firePropertyChange(java.lang.String, java.lang.Object,
     *          java.lang.Object)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void firePropertyChange(String propertyName, char oldValue, char newValue) {

    /**
     * Reports a bound property change.
     *
     * @param propertyName the programmatic name of the property
     *          that was changed
     * @param oldValue the old value of the property (as a char)
     * @param newValue the new value of the property (as a char)
     * @see #firePropertyChange(java.lang.String, java.lang.Object,
     *          java.lang.Object)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void firePropertyChange(String propertyName, byte oldValue, byte newValue) {

    /**
     * Reports a bound property change.
     *
     * @param propertyName the programmatic name of the property
     *          that was changed
     * @param oldValue the old value of the property (as a byte)
     * @param newValue the new value of the property (as a byte)
     * @see #firePropertyChange(java.lang.String, java.lang.Object,
     *          java.lang.Object)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void firePropertyChange(String propertyName,
                                      int oldValue, int newValue) {

    /**
     * Support for reporting bound property changes for integer properties.
     * This method can be called when a bound property has changed and it will
     * send the appropriate PropertyChangeEvent to any registered
     * PropertyChangeListeners.
     *
     * @param propertyName the property whose value has changed
     * @param oldValue the property's previous value
     * @param newValue the property's new value
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void firePropertyChange(String propertyName,
                                      boolean oldValue, boolean newValue) {

    /**
     * Support for reporting bound property changes for boolean properties.
     * This method can be called when a bound property has changed and it will
     * send the appropriate PropertyChangeEvent to any registered
     * PropertyChangeListeners.
     *
     * @param propertyName the property whose value has changed
     * @param oldValue the property's previous value
     * @param newValue the property's new value
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void firePropertyChange(String propertyName,
                                      Object oldValue, Object newValue) {

    /**
     * Support for reporting bound property changes for Object properties.
     * This method can be called when a bound property has changed and it will
     * send the appropriate PropertyChangeEvent to any registered
     * PropertyChangeListeners.
     *
     * @param propertyName the property whose value has changed
     * @param oldValue the property's previous value
     * @param newValue the property's new value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public PropertyChangeListener[] getPropertyChangeListeners(
                                                                            String propertyName) {

    /**
     * Returns an array of all the listeners which have been associated
     * with the named property.
     *
     * @return all of the <code>PropertyChangeListener</code>s associated with
     *         the named property; if no such listeners have been added or
     *         if <code>propertyName</code> is <code>null</code>, an empty
     *         array is returned
     *
     * @see #addPropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
     * @see #removePropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
     * @see #getPropertyChangeListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void removePropertyChangeListener(
                                                          String propertyName,
                                                          PropertyChangeListener listener) {

    /**
     * Removes a <code>PropertyChangeListener</code> from the listener
     * list for a specific property. This method should be used to remove
     * <code>PropertyChangeListener</code>s
     * that were registered for a specific bound property.
     * <p>
     * If <code>propertyName</code> or <code>listener</code> is <code>null</code>,
     * no exception is thrown and no action is taken.
     *
     * @param propertyName a valid property name
     * @param listener the PropertyChangeListener to be removed
     *
     * @see #addPropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
     * @see #getPropertyChangeListeners(java.lang.String)
     * @see #removePropertyChangeListener(java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void addPropertyChangeListener(
                                                       String propertyName,
                                                       PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list for a specific
     * property. The specified property may be user-defined, or one of the
     * following:
     * <ul>
     *    <li>this Component's font ("font")</li>
     *    <li>this Component's background color ("background")</li>
     *    <li>this Component's foreground color ("foreground")</li>
     *    <li>this Component's focusability ("focusable")</li>
     *    <li>this Component's focus traversal keys enabled state
     *        ("focusTraversalKeysEnabled")</li>
     *    <li>this Component's Set of FORWARD_TRAVERSAL_KEYS
     *        ("forwardFocusTraversalKeys")</li>
     *    <li>this Component's Set of BACKWARD_TRAVERSAL_KEYS
     *        ("backwardFocusTraversalKeys")</li>
     *    <li>this Component's Set of UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleFocusTraversalKeys")</li>
     * </ul>
     * Note that if this <code>Component</code> is inheriting a bound property, then no
     * event will be fired in response to a change in the inherited property.
     * <p>
     * If <code>propertyName</code> or <code>listener</code> is <code>null</code>,
     * no exception is thrown and no action is taken.
     *
     * @param propertyName one of the property names listed above
     * @param listener the property change listener to be added
     *
     * @see #removePropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
     * @see #getPropertyChangeListeners(java.lang.String)
     * @see #addPropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public PropertyChangeListener[] getPropertyChangeListeners() {

    /**
     * Returns an array of all the property change listeners
     * registered on this component.
     *
     * @return all of this component's <code>PropertyChangeListener</code>s
     *         or an empty array if no property change
     *         listeners are currently registered
     *
     * @see      #addPropertyChangeListener
     * @see      #removePropertyChangeListener
     * @see      #getPropertyChangeListeners(java.lang.String)
     * @see      java.beans.PropertyChangeSupport#getPropertyChangeListeners
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void removePropertyChangeListener(
                                                          PropertyChangeListener listener) {

    /**
     * Removes a PropertyChangeListener from the listener list. This method
     * should be used to remove PropertyChangeListeners that were registered
     * for all bound properties of this class.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param listener the PropertyChangeListener to be removed
     *
     * @see #addPropertyChangeListener
     * @see #getPropertyChangeListeners
     * @see #removePropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void addPropertyChangeListener(
                                                       PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list. The listener is
     * registered for all bound properties of this class, including the
     * following:
     * <ul>
     *    <li>this Component's font ("font")</li>
     *    <li>this Component's background color ("background")</li>
     *    <li>this Component's foreground color ("foreground")</li>
     *    <li>this Component's focusability ("focusable")</li>
     *    <li>this Component's focus traversal keys enabled state
     *        ("focusTraversalKeysEnabled")</li>
     *    <li>this Component's Set of FORWARD_TRAVERSAL_KEYS
     *        ("forwardFocusTraversalKeys")</li>
     *    <li>this Component's Set of BACKWARD_TRAVERSAL_KEYS
     *        ("backwardFocusTraversalKeys")</li>
     *    <li>this Component's Set of UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleFocusTraversalKeys")</li>
     *    <li>this Component's preferred size ("preferredSize")</li>
     *    <li>this Component's minimum size ("minimumSize")</li>
     *    <li>this Component's maximum size ("maximumSize")</li>
     *    <li>this Component's name ("name")</li>
     * </ul>
     * Note that if this <code>Component</code> is inheriting a bound property, then no
     * event will be fired in response to a change in the inherited property.
     * <p>
     * If <code>listener</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     *
     * @param    listener  the property change listener to be added
     *
     * @see #removePropertyChangeListener
     * @see #getPropertyChangeListeners
     * @see #addPropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void list(PrintWriter out, int indent) {

    /**
     * Prints out a list, starting at the specified indentation, to
     * the specified print writer.
     * @param out the print writer to print to
     * @param indent the number of spaces to indent
     * @throws NullPointerException if {@code out} is {@code null}
     * @see       java.io.PrintStream#println(java.lang.Object)
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void list(PrintWriter out) {

    /**
     * Prints a listing to the specified print writer.
     * @param  out  the print writer to print to
     * @throws NullPointerException if {@code out} is {@code null}
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void list(PrintStream out, int indent) {

    /**
     * Prints out a list, starting at the specified indentation, to the
     * specified print stream.
     * @param     out      a print stream
     * @param     indent   number of spaces to indent
     * @see       java.io.PrintStream#println(java.lang.Object)
     * @throws    NullPointerException if {@code out} is {@code null}
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void list(PrintStream out) {

    /**
     * Prints a listing of this component to the specified output
     * stream.
     * @param    out   a print stream
     * @throws   NullPointerException if {@code out} is {@code null}
     * @since    JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void list() {

    /**
     * Prints a listing of this component to the standard system output
     * stream <code>System.out</code>.
     * @see       java.lang.System#out
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public String toString() {

    /**
     * Returns a string representation of this component and its values.
     * @return    a string representation of this component
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this component. This
     * method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return  a string representation of this component's state
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @SuppressWarnings("unchecked")

    /**
     * Removes the specified popup menu from the component.
     * @param     popup the popup menu to be removed
     * @see       #add(PopupMenu)
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void add(PopupMenu popup) {

    /**
     * Adds the specified popup menu to the component.
     * @param     popup the popup menu to be added to the component.
     * @see       #remove(MenuComponent)
     * @exception NullPointerException if {@code popup} is {@code null}
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isFocusOwner() {

    /**
     * Returns <code>true</code> if this <code>Component</code> is the
     *    focus owner.
     *
     * @return <code>true</code> if this <code>Component</code> is the
     *     focus owner; <code>false</code> otherwise
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean hasFocus() {

    /**
     * Returns <code>true</code> if this <code>Component</code> is the
     * focus owner.  This method is obsolete, and has been replaced by
     * <code>isFocusOwner()</code>.
     *
     * @return <code>true</code> if this <code>Component</code> is the
     *         focus owner; <code>false</code> otherwise
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void transferFocusUpCycle() {

    /**
     * Transfers the focus up one focus traversal cycle. Typically, the focus
     * owner is set to this Component's focus cycle root, and the current focus
     * cycle root is set to the new focus owner's focus cycle root. If,
     * however, this Component's focus cycle root is a Window, then the focus
     * owner is set to the focus cycle root's default Component to focus, and
     * the current focus cycle root is unchanged.
     *
     * @see       #requestFocus()
     * @see       Container#isFocusCycleRoot()
     * @see       Container#setFocusCycleRoot(boolean)
     * @since     1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void transferFocusBackward() {

    /**
     * Transfers the focus to the previous component, as though this Component
     * were the focus owner.
     * @see       #requestFocus()
     * @since     1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by transferFocus().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void transferFocus() {

    /**
     * Transfers the focus to the next component, as though this Component were
     * the focus owner.
     * @see       #requestFocus()
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isFocusCycleRoot(Container container) {

    /**
     * Returns whether the specified Container is the focus cycle root of this
     * Component's focus traversal cycle. Each focus traversal cycle has only
     * a single focus cycle root and each Component which is not a Container
     * belongs to only a single focus traversal cycle.
     *
     * @param container the Container to be tested
     * @return <code>true</code> if the specified Container is a focus-cycle-
     *         root of this Component; <code>false</code> otherwise
     * @see Container#isFocusCycleRoot()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Container getFocusCycleRootAncestor() {

    /**
     * Returns the Container which is the focus cycle root of this Component's
     * focus traversal cycle. Each focus traversal cycle has only a single
     * focus cycle root and each Component which is not a Container belongs to
     * only a single focus traversal cycle. Containers which are focus cycle
     * roots belong to two cycles: one rooted at the Container itself, and one
     * rooted at the Container's nearest focus-cycle-root ancestor. For such
     * Containers, this method will return the Container's nearest focus-cycle-
     * root ancestor.
     *
     * @return this Component's nearest focus-cycle-root ancestor
     * @see Container#isFocusCycleRoot()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected boolean requestFocusInWindow(boolean temporary) {

    /**
     * Requests that this <code>Component</code> get the input focus,
     * if this <code>Component</code>'s top-level ancestor is already
     * the focused <code>Window</code>.  This component must be
     * displayable, focusable, visible and all of its ancestors (with
     * the exception of the top-level Window) must be visible for the
     * request to be granted. Every effort will be made to honor the
     * request; however, in some cases it may be impossible to do
     * so. Developers must never assume that this component is the
     * focus owner until this component receives a FOCUS_GAINED event.
     * <p>
     * This method returns a boolean value. If <code>false</code> is returned,
     * the request is <b>guaranteed to fail</b>. If <code>true</code> is
     * returned, the request will succeed <b>unless</b> it is vetoed, or an
     * extraordinary event, such as disposal of the component's peer, occurs
     * before the request can be granted by the native windowing system. Again,
     * while a return value of <code>true</code> indicates that the request is
     * likely to succeed, developers must never assume that this component is
     * the focus owner until this component receives a FOCUS_GAINED event.
     * <p>
     * This method cannot be used to set the focus owner to no component at
     * all. Use <code>KeyboardFocusManager.clearGlobalFocusOwner</code>
     * instead.
     * <p>
     * The focus behavior of this method can be implemented uniformly across
     * platforms, and thus developers are strongly encouraged to use this
     * method over <code>requestFocus</code> when possible. Code which relies
     * on <code>requestFocus</code> may exhibit different focus behavior on
     * different platforms.
     * <p>
     * Every effort will be made to ensure that <code>FocusEvent</code>s
     * generated as a
     * result of this request will have the specified temporary value. However,
     * because specifying an arbitrary temporary state may not be implementable
     * on all native windowing systems, correct behavior for this method can be
     * guaranteed only for lightweight components. This method is not intended
     * for general use, but exists instead as a hook for lightweight component
     * libraries, such as Swing.
     *
     * <p>Note: Not all focus transfers result from invoking this method. As
     * such, a component may receive focus without this or any of the other
     * {@code requestFocus} methods of {@code Component} being invoked.
     *
     * @param temporary true if the focus change is temporary,
     *        such as when the window loses the focus; for
     *        more information on temporary focus changes see the
     *<a href="../../java/awt/doc-files/FocusSpec.html">Focus Specification</a>
     * @return <code>false</code> if the focus change request is guaranteed to
     *         fail; <code>true</code> if it is likely to succeed
     * @see #requestFocus
     * @see java.awt.event.FocusEvent
     * @see #addFocusListener
     * @see #isFocusable
     * @see #isDisplayable
     * @see KeyboardFocusManager#clearGlobalFocusOwner
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean requestFocusInWindow() {

    /**
     * Requests that this Component get the input focus, if this
     * Component's top-level ancestor is already the focused
     * Window. This component must be displayable, focusable, visible
     * and all of its ancestors (with the exception of the top-level
     * Window) must be visible for the request to be granted. Every
     * effort will be made to honor the request; however, in some
     * cases it may be impossible to do so. Developers must never
     * assume that this Component is the focus owner until this
     * Component receives a FOCUS_GAINED event.
     * <p>
     * This method returns a boolean value. If <code>false</code> is returned,
     * the request is <b>guaranteed to fail</b>. If <code>true</code> is
     * returned, the request will succeed <b>unless</b> it is vetoed, or an
     * extraordinary event, such as disposal of the Component's peer, occurs
     * before the request can be granted by the native windowing system. Again,
     * while a return value of <code>true</code> indicates that the request is
     * likely to succeed, developers must never assume that this Component is
     * the focus owner until this Component receives a FOCUS_GAINED event.
     * <p>
     * This method cannot be used to set the focus owner to no Component at
     * all. Use <code>KeyboardFocusManager.clearGlobalFocusOwner()</code>
     * instead.
     * <p>
     * The focus behavior of this method can be implemented uniformly across
     * platforms, and thus developers are strongly encouraged to use this
     * method over <code>requestFocus</code> when possible. Code which relies
     * on <code>requestFocus</code> may exhibit different focus behavior on
     * different platforms.
     *
     * <p>Note: Not all focus transfers result from invoking this method. As
     * such, a component may receive focus without this or any of the other
     * {@code requestFocus} methods of {@code Component} being invoked.
     *
     * @return <code>false</code> if the focus change request is guaranteed to
     *         fail; <code>true</code> if it is likely to succeed
     * @see #requestFocus
     * @see java.awt.event.FocusEvent
     * @see #addFocusListener
     * @see #isFocusable
     * @see #isDisplayable
     * @see KeyboardFocusManager#clearGlobalFocusOwner
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected boolean requestFocus(boolean temporary) {

    /**
     * Requests that this <code>Component</code> get the input focus,
     * and that this <code>Component</code>'s top-level ancestor
     * become the focused <code>Window</code>. This component must be
     * displayable, focusable, visible and all of its ancestors (with
     * the exception of the top-level Window) must be visible for the
     * request to be granted. Every effort will be made to honor the
     * request; however, in some cases it may be impossible to do
     * so. Developers must never assume that this component is the
     * focus owner until this component receives a FOCUS_GAINED
     * event. If this request is denied because this component's
     * top-level window cannot become the focused window, the request
     * will be remembered and will be granted when the window is later
     * focused by the user.
     * <p>
     * This method returns a boolean value. If <code>false</code> is returned,
     * the request is <b>guaranteed to fail</b>. If <code>true</code> is
     * returned, the request will succeed <b>unless</b> it is vetoed, or an
     * extraordinary event, such as disposal of the component's peer, occurs
     * before the request can be granted by the native windowing system. Again,
     * while a return value of <code>true</code> indicates that the request is
     * likely to succeed, developers must never assume that this component is
     * the focus owner until this component receives a FOCUS_GAINED event.
     * <p>
     * This method cannot be used to set the focus owner to no component at
     * all. Use <code>KeyboardFocusManager.clearGlobalFocusOwner</code>
     * instead.
     * <p>
     * Because the focus behavior of this method is platform-dependent,
     * developers are strongly encouraged to use
     * <code>requestFocusInWindow</code> when possible.
     * <p>
     * Every effort will be made to ensure that <code>FocusEvent</code>s
     * generated as a
     * result of this request will have the specified temporary value. However,
     * because specifying an arbitrary temporary state may not be implementable
     * on all native windowing systems, correct behavior for this method can be
     * guaranteed only for lightweight <code>Component</code>s.
     * This method is not intended
     * for general use, but exists instead as a hook for lightweight component
     * libraries, such as Swing.
     *
     * <p>Note: Not all focus transfers result from invoking this method. As
     * such, a component may receive focus without this or any of the other
     * {@code requestFocus} methods of {@code Component} being invoked.
     *
     * @param temporary true if the focus change is temporary,
     *        such as when the window loses the focus; for
     *        more information on temporary focus changes see the
     *<a href="../../java/awt/doc-files/FocusSpec.html">Focus Specification</a>
     * @return <code>false</code> if the focus change request is guaranteed to
     *         fail; <code>true</code> if it is likely to succeed
     * @see java.awt.event.FocusEvent
     * @see #addFocusListener
     * @see #isFocusable
     * @see #isDisplayable
     * @see KeyboardFocusManager#clearGlobalFocusOwner
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void requestFocus() {

    /**
     * Requests that this Component get the input focus, and that this
     * Component's top-level ancestor become the focused Window. This
     * component must be displayable, focusable, visible and all of
     * its ancestors (with the exception of the top-level Window) must
     * be visible for the request to be granted. Every effort will be
     * made to honor the request; however, in some cases it may be
     * impossible to do so. Developers must never assume that this
     * Component is the focus owner until this Component receives a
     * FOCUS_GAINED event. If this request is denied because this
     * Component's top-level Window cannot become the focused Window,
     * the request will be remembered and will be granted when the
     * Window is later focused by the user.
     * <p>
     * This method cannot be used to set the focus owner to no Component at
     * all. Use <code>KeyboardFocusManager.clearGlobalFocusOwner()</code>
     * instead.
     * <p>
     * Because the focus behavior of this method is platform-dependent,
     * developers are strongly encouraged to use
     * <code>requestFocusInWindow</code> when possible.
     *
     * <p>Note: Not all focus transfers result from invoking this method. As
     * such, a component may receive focus without this or any of the other
     * {@code requestFocus} methods of {@code Component} being invoked.
     *
     * @see #requestFocusInWindow
     * @see java.awt.event.FocusEvent
     * @see #addFocusListener
     * @see #isFocusable
     * @see #isDisplayable
     * @see KeyboardFocusManager#clearGlobalFocusOwner
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean getFocusTraversalKeysEnabled() {

    /**
     * Returns whether focus traversal keys are enabled for this Component.
     * Components for which focus traversal keys are disabled receive key
     * events for focus traversal keys. Components for which focus traversal
     * keys are enabled do not see these events; instead, the events are
     * automatically converted to traversal operations.
     *
     * @return whether focus traversal keys are enabled for this Component
     * @see #setFocusTraversalKeysEnabled
     * @see #setFocusTraversalKeys
     * @see #getFocusTraversalKeys
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setFocusTraversalKeysEnabled(boolean
                                             focusTraversalKeysEnabled) {

    /**
     * Sets whether focus traversal keys are enabled for this Component.
     * Components for which focus traversal keys are disabled receive key
     * events for focus traversal keys. Components for which focus traversal
     * keys are enabled do not see these events; instead, the events are
     * automatically converted to traversal operations.
     *
     * @param focusTraversalKeysEnabled whether focus traversal keys are
     *        enabled for this Component
     * @see #getFocusTraversalKeysEnabled
     * @see #setFocusTraversalKeys
     * @see #getFocusTraversalKeys
     * @since 1.4
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean areFocusTraversalKeysSet(int id) {

    /**
     * Returns whether the Set of focus traversal keys for the given focus
     * traversal operation has been explicitly defined for this Component. If
     * this method returns <code>false</code>, this Component is inheriting the
     * Set from an ancestor, or from the current KeyboardFocusManager.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS
     * @return <code>true</code> if the the Set of focus traversal keys for the
     *         given focus traversal operation has been explicitly defined for
     *         this Component; <code>false</code> otherwise.
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Set<AWTKeyStroke> getFocusTraversalKeys(int id) {

    /**
     * Returns the Set of focus traversal keys for a given traversal operation
     * for this Component. (See
     * <code>setFocusTraversalKeys</code> for a full description of each key.)
     * <p>
     * If a Set of traversal keys has not been explicitly defined for this
     * Component, then this Component's parent's Set is returned. If no Set
     * has been explicitly defined for any of this Component's ancestors, then
     * the current KeyboardFocusManager's default Set is returned.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS
     * @return the Set of AWTKeyStrokes for the specified operation. The Set
     *         will be unmodifiable, and may be empty. null will never be
     *         returned.
     * @see #setFocusTraversalKeys
     * @see KeyboardFocusManager#FORWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#BACKWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#UP_CYCLE_TRAVERSAL_KEYS
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setFocusTraversalKeys(int id,
                                      Set<? extends AWTKeyStroke> keystrokes)

    /**
     * Sets the focus traversal keys for a given traversal operation for this
     * Component.
     * <p>
     * The default values for a Component's focus traversal keys are
     * implementation-dependent. Sun recommends that all implementations for a
     * particular native platform use the same default values. The
     * recommendations for Windows and Unix are listed below. These
     * recommendations are used in the Sun AWT implementations.
     *
     * <table border=1 summary="Recommended default values for a Component's focus traversal keys">
     * <tr>
     *    <th>Identifier</th>
     *    <th>Meaning</th>
     *    <th>Default</th>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS</td>
     *    <td>Normal forward keyboard traversal</td>
     *    <td>TAB on KEY_PRESSED, CTRL-TAB on KEY_PRESSED</td>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS</td>
     *    <td>Normal reverse keyboard traversal</td>
     *    <td>SHIFT-TAB on KEY_PRESSED, CTRL-SHIFT-TAB on KEY_PRESSED</td>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS</td>
     *    <td>Go up one focus traversal cycle</td>
     *    <td>none</td>
     * </tr>
     * </table>
     *
     * To disable a traversal key, use an empty Set; Collections.EMPTY_SET is
     * recommended.
     * <p>
     * Using the AWTKeyStroke API, client code can specify on which of two
     * specific KeyEvents, KEY_PRESSED or KEY_RELEASED, the focus traversal
     * operation will occur. Regardless of which KeyEvent is specified,
     * however, all KeyEvents related to the focus traversal key, including the
     * associated KEY_TYPED event, will be consumed, and will not be dispatched
     * to any Component. It is a runtime error to specify a KEY_TYPED event as
     * mapping to a focus traversal operation, or to map the same event to
     * multiple default focus traversal operations.
     * <p>
     * If a value of null is specified for the Set, this Component inherits the
     * Set from its parent. If all ancestors of this Component have null
     * specified for the Set, then the current KeyboardFocusManager's default
     * Set is used.
     * <p>
     * This method may throw a {@code ClassCastException} if any {@code Object}
     * in {@code keystrokes} is not an {@code AWTKeyStroke}.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS
     * @param keystrokes the Set of AWTKeyStroke for the specified operation
     * @see #getFocusTraversalKeys
     * @see KeyboardFocusManager#FORWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#BACKWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#UP_CYCLE_TRAVERSAL_KEYS
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or if keystrokes
     *         contains null, or if any keystroke represents a KEY_TYPED event,
     *         or if any keystroke already maps to another focus traversal
     *         operation for this Component
     * @since 1.4
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setFocusable(boolean focusable) {

    /**
     * Sets the focusable state of this Component to the specified value. This
     * value overrides the Component's default focusability.
     *
     * @param focusable indicates whether this Component is focusable
     * @see #isFocusable
     * @since 1.4
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isFocusable() {

    /**
     * Returns whether this Component can be focused.
     *
     * @return <code>true</code> if this Component is focusable;
     *         <code>false</code> otherwise.
     * @see #setFocusable
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * Returns whether this <code>Component</code> can become the focus
     * owner.
     *
     * @return <code>true</code> if this <code>Component</code> is
     * focusable; <code>false</code> otherwise
     * @see #setFocusable
     * @since JDK1.1
     * @deprecated As of 1.4, replaced by <code>isFocusable()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processFocusEvent(FocusEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processFocusEvent(FocusEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void removeNotify() {

    /**
     * Makes this <code>Component</code> undisplayable by destroying it native
     * screen resource.
     * <p>
     * This method is called by the toolkit internally and should
     * not be called directly by programs. Code overriding
     * this method should call <code>super.removeNotify</code> as
     * the first line of the overriding method.
     *
     * @see       #isDisplayable
     * @see       #addNotify
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void addNotify() {

    /**
     * Makes this <code>Component</code> displayable by connecting it to a
     * native screen resource.
     * This method is called internally by the toolkit and should
     * not be called directly by programs.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @see       #isDisplayable
     * @see       #removeNotify
     * @see #invalidate
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * should register this component as ActionListener on component
     * which fires action events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processKeyEvent(KeyEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processKeyEvent(KeyEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processMouseEvent(MouseEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processMouseEvent(MouseEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processMouseMotionEvent(MouseEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processMouseEvent(MouseEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processMouseMotionEvent(MouseEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by processMouseEvent(MouseEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1
     * replaced by processEvent(AWTEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processHierarchyBoundsEvent(HierarchyEvent e) {

    /**
     * Processes hierarchy bounds events occurring on this component by
     * dispatching them to any registered
     * <code>HierarchyBoundsListener</code> objects.
     * <p>
     * This method is not called unless hierarchy bounds events
     * are enabled for this component. Hierarchy bounds events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>HierarchyBoundsListener</code> object is registered
     * via <code>addHierarchyBoundsListener</code>.
     * <li>Hierarchy bounds events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the hierarchy event
     * @see         java.awt.event.HierarchyEvent
     * @see         java.awt.event.HierarchyBoundsListener
     * @see         #addHierarchyBoundsListener
     * @see         #enableEvents
     * @since       1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processHierarchyEvent(HierarchyEvent e) {

    /**
     * Processes hierarchy events occurring on this component by
     * dispatching them to any registered
     * <code>HierarchyListener</code> objects.
     * <p>
     * This method is not called unless hierarchy events
     * are enabled for this component. Hierarchy events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>HierarchyListener</code> object is registered
     * via <code>addHierarchyListener</code>.
     * <li>Hierarchy events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the hierarchy event
     * @see         java.awt.event.HierarchyEvent
     * @see         java.awt.event.HierarchyListener
     * @see         #addHierarchyListener
     * @see         #enableEvents
     * @since       1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processInputMethodEvent(InputMethodEvent e) {

    /**
     * Processes input method events occurring on this component by
     * dispatching them to any registered
     * <code>InputMethodListener</code> objects.
     * <p>
     * This method is not called unless input method events
     * are enabled for this component. Input method events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>An <code>InputMethodListener</code> object is registered
     * via <code>addInputMethodListener</code>.
     * <li>Input method events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the input method event
     * @see         java.awt.event.InputMethodEvent
     * @see         java.awt.event.InputMethodListener
     * @see         #addInputMethodListener
     * @see         #enableEvents
     * @since       1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processMouseWheelEvent(MouseWheelEvent e) {

    /**
     * Processes mouse wheel events occurring on this component by
     * dispatching them to any registered
     * <code>MouseWheelListener</code> objects.
     * <p>
     * This method is not called unless mouse wheel events are
     * enabled for this component. Mouse wheel events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>A <code>MouseWheelListener</code> object is registered
     * via <code>addMouseWheelListener</code>.
     * <li>Mouse wheel events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>
     * For information on how mouse wheel events are dispatched, see
     * the class description for {@link MouseWheelEvent}.
     * <p>
     * Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the mouse wheel event
     * @see         java.awt.event.MouseWheelEvent
     * @see         java.awt.event.MouseWheelListener
     * @see         #addMouseWheelListener
     * @see         #enableEvents
     * @since       1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processMouseMotionEvent(MouseEvent e) {

    /**
     * Processes mouse motion events occurring on this component by
     * dispatching them to any registered
     * <code>MouseMotionListener</code> objects.
     * <p>
     * This method is not called unless mouse motion events are
     * enabled for this component. Mouse motion events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>A <code>MouseMotionListener</code> object is registered
     * via <code>addMouseMotionListener</code>.
     * <li>Mouse motion events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the mouse motion event
     * @see         java.awt.event.MouseEvent
     * @see         java.awt.event.MouseMotionListener
     * @see         #addMouseMotionListener
     * @see         #enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processMouseEvent(MouseEvent e) {

    /**
     * Processes mouse events occurring on this component by
     * dispatching them to any registered
     * <code>MouseListener</code> objects.
     * <p>
     * This method is not called unless mouse events are
     * enabled for this component. Mouse events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>A <code>MouseListener</code> object is registered
     * via <code>addMouseListener</code>.
     * <li>Mouse events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the mouse event
     * @see         java.awt.event.MouseEvent
     * @see         java.awt.event.MouseListener
     * @see         #addMouseListener
     * @see         #enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processKeyEvent(KeyEvent e) {

    /**
     * Processes key events occurring on this component by
     * dispatching them to any registered
     * <code>KeyListener</code> objects.
     * <p>
     * This method is not called unless key events are
     * enabled for this component. Key events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>A <code>KeyListener</code> object is registered
     * via <code>addKeyListener</code>.
     * <li>Key events are enabled via <code>enableEvents</code>.
     * </ul>
     *
     * <p>
     * If key events are enabled for a <code>Component</code>,
     * the current <code>KeyboardFocusManager</code> determines
     * whether or not a key event should be dispatched to
     * registered <code>KeyListener</code> objects.  The
     * <code>DefaultKeyboardFocusManager</code> will not dispatch
     * key events to a <code>Component</code> that is not the focus
     * owner or is not showing.
     * <p>
     * As of J2SE 1.4, <code>KeyEvent</code>s are redirected to
     * the focus owner. Please see the
     * <a href="doc-files/FocusSpec.html">Focus Specification</a>
     * for further information.
     * <p>
     * Calling a <code>Component</code>'s <code>dispatchEvent</code>
     * method with a <code>KeyEvent</code> as the argument will
     * result in a call to the <code>Component</code>'s
     * <code>processKeyEvent</code> method regardless of the
     * current <code>KeyboardFocusManager</code> as long as the
     * component is showing, focused, and enabled, and key events
     * are enabled on it.
     * <p>If the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the key event
     * @see         java.awt.event.KeyEvent
     * @see         java.awt.event.KeyListener
     * @see         java.awt.KeyboardFocusManager
     * @see         java.awt.DefaultKeyboardFocusManager
     * @see         #processEvent
     * @see         #dispatchEvent
     * @see         #addKeyListener
     * @see         #enableEvents
     * @see         #isShowing
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processFocusEvent(FocusEvent e) {

    /**
     * Processes focus events occurring on this component by
     * dispatching them to any registered
     * <code>FocusListener</code> objects.
     * <p>
     * This method is not called unless focus events are
     * enabled for this component. Focus events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>A <code>FocusListener</code> object is registered
     * via <code>addFocusListener</code>.
     * <li>Focus events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>
     * If focus events are enabled for a <code>Component</code>,
     * the current <code>KeyboardFocusManager</code> determines
     * whether or not a focus event should be dispatched to
     * registered <code>FocusListener</code> objects.  If the
     * events are to be dispatched, the <code>KeyboardFocusManager</code>
     * calls the <code>Component</code>'s <code>dispatchEvent</code>
     * method, which results in a call to the <code>Component</code>'s
     * <code>processFocusEvent</code> method.
     * <p>
     * If focus events are enabled for a <code>Component</code>, calling
     * the <code>Component</code>'s <code>dispatchEvent</code> method
     * with a <code>FocusEvent</code> as the argument will result in a
     * call to the <code>Component</code>'s <code>processFocusEvent</code>
     * method regardless of the current <code>KeyboardFocusManager</code>.
     *
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the focus event
     * @see         java.awt.event.FocusEvent
     * @see         java.awt.event.FocusListener
     * @see         java.awt.KeyboardFocusManager
     * @see         #addFocusListener
     * @see         #enableEvents
     * @see         #dispatchEvent
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processComponentEvent(ComponentEvent e) {

    /**
     * Processes component events occurring on this component by
     * dispatching them to any registered
     * <code>ComponentListener</code> objects.
     * <p>
     * This method is not called unless component events are
     * enabled for this component. Component events are enabled
     * when one of the following occurs:
     * <ul>
     * <li>A <code>ComponentListener</code> object is registered
     * via <code>addComponentListener</code>.
     * <li>Component events are enabled via <code>enableEvents</code>.
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param       e the component event
     * @see         java.awt.event.ComponentEvent
     * @see         java.awt.event.ComponentListener
     * @see         #addComponentListener
     * @see         #enableEvents
     * @since       JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events occurring on this component. By default this
     * method calls the appropriate
     * <code>process&lt;event&nbsp;type&gt;Event</code>
     * method for the given class of event.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param     e the event
     * @see       #processComponentEvent
     * @see       #processFocusEvent
     * @see       #processKeyEvent
     * @see       #processMouseEvent
     * @see       #processMouseMotionEvent
     * @see       #processInputMethodEvent
     * @see       #processHierarchyEvent
     * @see       #processMouseWheelEvent
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected AWTEvent coalesceEvents(AWTEvent existingEvent,
                                      AWTEvent newEvent) {

    /**
     * Potentially coalesce an event being posted with an existing
     * event.  This method is called by <code>EventQueue.postEvent</code>
     * if an event with the same ID as the event to be posted is found in
     * the queue (both events must have this component as their source).
     * This method either returns a coalesced event which replaces
     * the existing event (and the new event is then discarded), or
     * <code>null</code> to indicate that no combining should be done
     * (add the second event to the end of the queue).  Either event
     * parameter may be modified and returned, as the other one is discarded
     * unless <code>null</code> is returned.
     * <p>
     * This implementation of <code>coalesceEvents</code> coalesces
     * two event types: mouse move (and drag) events,
     * and paint (and update) events.
     * For mouse move events the last event is always returned, causing
     * intermediate moves to be discarded.  For paint events, the new
     * event is coalesced into a complex <code>RepaintArea</code> in the peer.
     * The new <code>AWTEvent</code> is always returned.
     *
     * @param  existingEvent  the event already on the <code>EventQueue</code>
     * @param  newEvent       the event being posted to the
     *          <code>EventQueue</code>
     * @return a coalesced event, or <code>null</code> indicating that no
     *          coalescing was done
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final boolean isCoalescingEnabled() {

    /**
     * Indicates whether coalesceEvents may do something.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private static boolean isCoalesceEventsOverriden(Class<?> clazz) {

    /**
     * Indicates whether a class or its superclasses override coalesceEvents.
     * Must be called with lock on coalesceMap and privileged.
     * @see checkCoalescing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private static final Class[] coalesceEventsParams = {

    /**
     * Parameter types of coalesceEvents(AWTEvent,AWTEVent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
     private boolean checkCoalescing() {

    /**
     * Indicates whether this class overrides coalesceEvents.
     * It is assumed that all classes that are loaded from the bootstrap
     *   do not.
     * The boostrap class loader is assumed to be represented by null.
     * We do not check that the method really overrides
     *   (it might be static, private or package private).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private static final Map<Class<?>, Boolean> coalesceMap =

    /**
     * Weak map of known coalesceEvent overriders.
     * Value indicates whether overriden.
     * Bootstrap classes are not included.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    transient private boolean coalescingEnabled = checkCoalescing();

    /**
     * @see #isCoalescingEnabled
     * @see #checkCoalescing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected final void disableEvents(long eventsToDisable) {

    /**
     * Disables the events defined by the specified event mask parameter
     * from being delivered to this component.
     * @param      eventsToDisable   the event mask defining the event types
     * @see        #enableEvents
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected final void enableEvents(long eventsToEnable) {

    /**
     * Enables the events defined by the specified event mask parameter
     * to be delivered to this component.
     * <p>
     * Event types are automatically enabled when a listener for
     * that event type is added to the component.
     * <p>
     * This method only needs to be invoked by subclasses of
     * <code>Component</code> which desire to have the specified event
     * types delivered to <code>processEvent</code> regardless of whether
     * or not a listener is registered.
     * @param      eventsToEnable   the event mask defining the event types
     * @see        #processEvent
     * @see        #disableEvents
     * @see        AWTEvent
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public InputContext getInputContext() {

    /**
     * Gets the input context used by this component for handling
     * the communication with input methods when text is entered
     * in this component. By default, the input context used for
     * the parent component is returned. Components may
     * override this to return a private input context.
     *
     * @return the input context used by this component;
     *          <code>null</code> if no context can be determined
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public InputMethodRequests getInputMethodRequests() {

    /**
     * Gets the input method request handler which supports
     * requests from input methods for this component. A component
     * that supports on-the-spot text input must override this
     * method to return an <code>InputMethodRequests</code> instance.
     * At the same time, it also has to handle input method events.
     *
     * @return the input method request handler for this component,
     *          <code>null</code> by default
     * @see #addInputMethodListener
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>Component</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>Component</code> <code>c</code>
     * for its mouse listeners with the following code:
     *
     * <pre>MouseListener[] mls = (MouseListener[])(c.getListeners(MouseListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this component,
     *          or an empty array if no such listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     * @throws NullPointerException if {@code listenerType} is {@code null}
     * @see #getComponentListeners
     * @see #getFocusListeners
     * @see #getHierarchyListeners
     * @see #getHierarchyBoundsListeners
     * @see #getKeyListeners
     * @see #getMouseListeners
     * @see #getMouseMotionListeners
     * @see #getMouseWheelListeners
     * @see #getInputMethodListeners
     * @see #getPropertyChangeListeners
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized InputMethodListener[] getInputMethodListeners() {

    /**
     * Returns an array of all the input method listeners
     * registered on this component.
     *
     * @return all of this component's <code>InputMethodListener</code>s
     *         or an empty array if no input method
     *         listeners are currently registered
     *
     * @see      #addInputMethodListener
     * @see      #removeInputMethodListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeInputMethodListener(InputMethodListener l) {

    /**
     * Removes the specified input method listener so that it no longer
     * receives input method events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the input method listener
     * @see      java.awt.event.InputMethodEvent
     * @see      java.awt.event.InputMethodListener
     * @see      #addInputMethodListener
     * @see      #getInputMethodListeners
     * @since    1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addInputMethodListener(InputMethodListener l) {

    /**
     * Adds the specified input method listener to receive
     * input method events from this component. A component will
     * only receive input method events from input methods
     * if it also overrides <code>getInputMethodRequests</code> to return an
     * <code>InputMethodRequests</code> instance.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="{@docRoot}/java/awt/doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the input method listener
     * @see      java.awt.event.InputMethodEvent
     * @see      java.awt.event.InputMethodListener
     * @see      #removeInputMethodListener
     * @see      #getInputMethodListeners
     * @see      #getInputMethodRequests
     * @since    1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized MouseWheelListener[] getMouseWheelListeners() {

    /**
     * Returns an array of all the mouse wheel listeners
     * registered on this component.
     *
     * @return all of this component's <code>MouseWheelListener</code>s
     *         or an empty array if no mouse wheel
     *         listeners are currently registered
     *
     * @see      #addMouseWheelListener
     * @see      #removeMouseWheelListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeMouseWheelListener(MouseWheelListener l) {

    /**
     * Removes the specified mouse wheel listener so that it no longer
     * receives mouse wheel events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the mouse wheel listener.
     * @see      java.awt.event.MouseWheelEvent
     * @see      java.awt.event.MouseWheelListener
     * @see      #addMouseWheelListener
     * @see      #getMouseWheelListeners
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addMouseWheelListener(MouseWheelListener l) {

    /**
     * Adds the specified mouse wheel listener to receive mouse wheel events
     * from this component.  Containers also receive mouse wheel events from
     * sub-components.
     * <p>
     * For information on how mouse wheel events are dispatched, see
     * the class description for {@link MouseWheelEvent}.
     * <p>
     * If l is <code>null</code>, no exception is thrown and no
     * action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the mouse wheel listener
     * @see      java.awt.event.MouseWheelEvent
     * @see      java.awt.event.MouseWheelListener
     * @see      #removeMouseWheelListener
     * @see      #getMouseWheelListeners
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized MouseMotionListener[] getMouseMotionListeners() {

    /**
     * Returns an array of all the mouse motion listeners
     * registered on this component.
     *
     * @return all of this component's <code>MouseMotionListener</code>s
     *         or an empty array if no mouse motion
     *         listeners are currently registered
     *
     * @see      #addMouseMotionListener
     * @see      #removeMouseMotionListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeMouseMotionListener(MouseMotionListener l) {

    /**
     * Removes the specified mouse motion listener so that it no longer
     * receives mouse motion events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the mouse motion listener
     * @see      java.awt.event.MouseEvent
     * @see      java.awt.event.MouseMotionListener
     * @see      #addMouseMotionListener
     * @see      #getMouseMotionListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addMouseMotionListener(MouseMotionListener l) {

    /**
     * Adds the specified mouse motion listener to receive mouse motion
     * events from this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the mouse motion listener
     * @see      java.awt.event.MouseEvent
     * @see      java.awt.event.MouseMotionListener
     * @see      #removeMouseMotionListener
     * @see      #getMouseMotionListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized MouseListener[] getMouseListeners() {

    /**
     * Returns an array of all the mouse listeners
     * registered on this component.
     *
     * @return all of this component's <code>MouseListener</code>s
     *         or an empty array if no mouse
     *         listeners are currently registered
     *
     * @see      #addMouseListener
     * @see      #removeMouseListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeMouseListener(MouseListener l) {

    /**
     * Removes the specified mouse listener so that it no longer
     * receives mouse events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the mouse listener
     * @see      java.awt.event.MouseEvent
     * @see      java.awt.event.MouseListener
     * @see      #addMouseListener
     * @see      #getMouseListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addMouseListener(MouseListener l) {

    /**
     * Adds the specified mouse listener to receive mouse events from
     * this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the mouse listener
     * @see      java.awt.event.MouseEvent
     * @see      java.awt.event.MouseListener
     * @see      #removeMouseListener
     * @see      #getMouseListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized KeyListener[] getKeyListeners() {

    /**
     * Returns an array of all the key listeners
     * registered on this component.
     *
     * @return all of this component's <code>KeyListener</code>s
     *         or an empty array if no key
     *         listeners are currently registered
     *
     * @see      #addKeyListener
     * @see      #removeKeyListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeKeyListener(KeyListener l) {

    /**
     * Removes the specified key listener so that it no longer
     * receives key events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the key listener
     * @see      java.awt.event.KeyEvent
     * @see      java.awt.event.KeyListener
     * @see      #addKeyListener
     * @see      #getKeyListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addKeyListener(KeyListener l) {

    /**
     * Adds the specified key listener to receive key events from
     * this component.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the key listener.
     * @see      java.awt.event.KeyEvent
     * @see      java.awt.event.KeyListener
     * @see      #removeKeyListener
     * @see      #getKeyListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized HierarchyBoundsListener[] getHierarchyBoundsListeners() {

    /**
     * Returns an array of all the hierarchy bounds listeners
     * registered on this component.
     *
     * @return all of this component's <code>HierarchyBoundsListener</code>s
     *         or an empty array if no hierarchy bounds
     *         listeners are currently registered
     *
     * @see      #addHierarchyBoundsListener
     * @see      #removeHierarchyBoundsListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void removeHierarchyBoundsListener(HierarchyBoundsListener l) {

    /**
     * Removes the specified hierarchy bounds listener so that it no longer
     * receives hierarchy bounds events from this component. This method
     * performs no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the hierarchy bounds listener
     * @see      java.awt.event.HierarchyEvent
     * @see      java.awt.event.HierarchyBoundsListener
     * @see      #addHierarchyBoundsListener
     * @see      #getHierarchyBoundsListeners
     * @since    1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void addHierarchyBoundsListener(HierarchyBoundsListener l) {

    /**
     * Adds the specified hierarchy bounds listener to receive hierarchy
     * bounds events from this component when the hierarchy to which this
     * container belongs changes.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the hierarchy bounds listener
     * @see      java.awt.event.HierarchyEvent
     * @see      java.awt.event.HierarchyBoundsListener
     * @see      #removeHierarchyBoundsListener
     * @see      #getHierarchyBoundsListeners
     * @since    1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized HierarchyListener[] getHierarchyListeners() {

    /**
     * Returns an array of all the hierarchy listeners
     * registered on this component.
     *
     * @return all of this component's <code>HierarchyListener</code>s
     *         or an empty array if no hierarchy
     *         listeners are currently registered
     *
     * @see      #addHierarchyListener
     * @see      #removeHierarchyListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void removeHierarchyListener(HierarchyListener l) {

    /**
     * Removes the specified hierarchy listener so that it no longer
     * receives hierarchy changed events from this component. This method
     * performs no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the hierarchy listener
     * @see      java.awt.event.HierarchyEvent
     * @see      java.awt.event.HierarchyListener
     * @see      #addHierarchyListener
     * @see      #getHierarchyListeners
     * @since    1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void addHierarchyListener(HierarchyListener l) {

    /**
     * Adds the specified hierarchy listener to receive hierarchy changed
     * events from this component when the hierarchy to which this container
     * belongs changes.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the hierarchy listener
     * @see      java.awt.event.HierarchyEvent
     * @see      java.awt.event.HierarchyListener
     * @see      #removeHierarchyListener
     * @see      #getHierarchyListeners
     * @since    1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized FocusListener[] getFocusListeners() {

    /**
     * Returns an array of all the focus listeners
     * registered on this component.
     *
     * @return all of this component's <code>FocusListener</code>s
     *         or an empty array if no component
     *         listeners are currently registered
     *
     * @see #addFocusListener
     * @see #removeFocusListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeFocusListener(FocusListener l) {

    /**
     * Removes the specified focus listener so that it no longer
     * receives focus events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the focus listener
     * @see      java.awt.event.FocusEvent
     * @see      java.awt.event.FocusListener
     * @see      #addFocusListener
     * @see      #getFocusListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addFocusListener(FocusListener l) {

    /**
     * Adds the specified focus listener to receive focus events from
     * this component when this component gains input focus.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the focus listener
     * @see      java.awt.event.FocusEvent
     * @see      java.awt.event.FocusListener
     * @see      #removeFocusListener
     * @see      #getFocusListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized ComponentListener[] getComponentListeners() {

    /**
     * Returns an array of all the component listeners
     * registered on this component.
     *
     * @return all <code>ComponentListener</code>s of this component
     *         or an empty array if no component
     *         listeners are currently registered
     *
     * @see #addComponentListener
     * @see #removeComponentListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void removeComponentListener(ComponentListener l) {

    /**
     * Removes the specified component listener so that it no longer
     * receives component events from this component. This method performs
     * no function, nor does it throw an exception, if the listener
     * specified by the argument was not previously added to this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     * @param    l   the component listener
     * @see      java.awt.event.ComponentEvent
     * @see      java.awt.event.ComponentListener
     * @see      #addComponentListener
     * @see      #getComponentListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void addComponentListener(ComponentListener l) {

    /**
     * Adds the specified component listener to receive component events from
     * this component.
     * If listener <code>l</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the component listener
     * @see      java.awt.event.ComponentEvent
     * @see      java.awt.event.ComponentListener
     * @see      #removeComponentListener
     * @see      #getComponentListeners
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by dispatchEvent(AWTEvent).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public final void dispatchEvent(AWTEvent e) {

    /**
     * Dispatches an event to this component or one of its sub components.
     * Calls <code>processEvent</code> before returning for 1.1-style
     * events which have been enabled for the <code>Component</code>.
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>dispatchEvent(AWTEvent e)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Component getComponentAt(Point p) {

    /**
     * Returns the component or subcomponent that contains the
     * specified point.
     * @param     p   the point
     * @see       java.awt.Component#contains
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by getComponentAt(int, int).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Component getComponentAt(int x, int y) {

    /**
     * Determines if this component or one of its immediate
     * subcomponents contains the (<i>x</i>,&nbsp;<i>y</i>) location,
     * and if so, returns the containing component. This method only
     * looks one level deep. If the point (<i>x</i>,&nbsp;<i>y</i>) is
     * inside a subcomponent that itself has subcomponents, it does not
     * go looking down the subcomponent tree.
     * <p>
     * The <code>locate</code> method of <code>Component</code> simply
     * returns the component itself if the (<i>x</i>,&nbsp;<i>y</i>)
     * coordinate location is inside its bounding box, and <code>null</code>
     * otherwise.
     * @param     x   the <i>x</i> coordinate
     * @param     y   the <i>y</i> coordinate
     * @return    the component or subcomponent that contains the
     *                (<i>x</i>,&nbsp;<i>y</i>) location;
     *                <code>null</code> if the location
     *                is outside this component
     * @see       #contains(int, int)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean contains(Point p) {

    /**
     * Checks whether this component "contains" the specified point,
     * where the point's <i>x</i> and <i>y</i> coordinates are defined
     * to be relative to the coordinate system of this component.
     * @param     p     the point
     * @throws    NullPointerException if {@code p} is {@code null}
     * @see       #getComponentAt(Point)
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by contains(int, int).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean contains(int x, int y) {

    /**
     * Checks whether this component "contains" the specified point,
     * where <code>x</code> and <code>y</code> are defined to be
     * relative to the coordinate system of this component.
     * @param     x   the <i>x</i> coordinate of the point
     * @param     y   the <i>y</i> coordinate of the point
     * @see       #getComponentAt(int, int)
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean getIgnoreRepaint() {

    /**
     * @return whether or not paint messages received from the operating system
     * should be ignored.
     *
     * @since 1.4
     * @see #setIgnoreRepaint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setIgnoreRepaint(boolean ignoreRepaint) {

    /**
     * Sets whether or not paint messages received from the operating system
     * should be ignored.  This does not affect paint events generated in
     * software by the AWT, unless they are an immediate response to an
     * OS-level paint message.
     * <p>
     * This is useful, for example, if running under full-screen mode and
     * better performance is desired, or if page-flipping is used as the
     * buffer strategy.
     *
     * @since 1.4
     * @see #getIgnoreRepaint
     * @see Canvas#createBufferStrategy
     * @see Window#createBufferStrategy
     * @see java.awt.image.BufferStrategy
     * @see GraphicsDevice#setFullScreenWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private class SingleBufferStrategy extends BufferStrategy {

    /**
     * Inner class for flipping buffers on a component.  That component must
     * be a <code>Canvas</code> or <code>Window</code>.
     * @see Canvas
     * @see Window
     * @see java.awt.image.BufferStrategy
     * @author Michael Martak
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private class BltSubRegionBufferStrategy extends BltBufferStrategy

    /**
     * Private class to perform sub-region blitting.  Swing will use
     * this subclass via the SubRegionShowable interface in order to
     * copy only the area changed during a repaint.
     * See javax.swing.BufferStrategyPaintManager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private class FlipSubRegionBufferStrategy extends FlipBufferStrategy

    /**
     * Private class to perform sub-region flipping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean contentsRestored() {

        /**
         * @return whether the drawing buffer was recently restored from a lost
         * state and reinitialized to the default background color (white)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean contentsLost() {

        /**
         * @return whether the drawing buffer was lost since the last call to
         * <code>getDrawGraphics</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected void revalidate() {

        /**
         * Restore the drawing buffer if it has been lost
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        void showSubRegion(int x1, int y1, int x2, int y2) {

        /**
         * Package-private method to present a specific rectangular area
         * of this buffer.  This class currently shows only the entire
         * buffer, by calling showSubRegion() with the full dimensions of
         * the buffer.  Subclasses (e.g., BltSubRegionBufferStrategy
         * and FlipSubRegionBufferStrategy) may have region-specific show
         * methods that call this method with actual sub regions of the
         * buffer.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void show() {

        /**
         * Makes the next available buffer visible.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        Image getBackBuffer() {

        /**
         * @return direct access to the back buffer, as an image.
         * If there is no back buffer, returns null.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Graphics getDrawGraphics() {

        /**
         * @return the draw graphics
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public BufferCapabilities getCapabilities() {

        /**
         * @return the buffering capabilities of this strategy
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected void createBackBuffers(int numBuffers) {

        /**
         * Creates the back buffers
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void dispose() {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected BltBufferStrategy(int numBuffers, BufferCapabilities caps) {

        /**
         * Creates a new blt buffer strategy around a component
         * @param numBuffers number of buffers to create, including the
         * front buffer
         * @param caps the capabilities of the buffers
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        private Insets insets;

        /**
         * Insets for the hosting Component.  The size of the back buffer
         * is constrained by these.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected boolean validatedContents; // = false

        /**
         * Whether or not the drawing buffer has been recently restored from
         * a lost state.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected BufferCapabilities caps; // = null

        /**
         * The buffering capabilities
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected class BltBufferStrategy extends BufferStrategy {

    /**
     * Inner class for blitting offscreen surfaces to a component.
     *
     * @author Michael Martak
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void dispose() {

        /**
         * {@inheritDoc}
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        void showSubRegion(int x1, int y1, int x2, int y2) {

        /**
         * Makes specified region of the the next available buffer visible
         * by either blitting or flipping.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public void show() {

        /**
         * Makes the next available buffer visible by either blitting or
         * flipping.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean contentsRestored() {

        /**
         * @return whether the drawing buffer was recently restored from a lost
         * state and reinitialized to the default background color (white)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public boolean contentsLost() {

        /**
         * @return whether the drawing buffer was lost since the last call to
         * <code>getDrawGraphics</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected void revalidate() {

        /**
         * Restore the drawing buffer if it has been lost
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public Graphics getDrawGraphics() {

        /**
         * @return the graphics on the drawing buffer.  This method may not
         * be synchronized for performance reasons; use of this method by multiple
         * threads should be handled at the application level.  Disposal of the
         * graphics object must be handled by the application.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        public BufferCapabilities getCapabilities() {

        /**
         * @return the buffering capabilities of this strategy
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected void destroyBuffers() {

        /**
         * Destroys the buffers created through this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected void flip(BufferCapabilities.FlipContents flipAction) {

        /**
         * Flipping moves the contents of the back buffer to the front buffer,
         * either by copying or by moving the video pointer.
         * @param flipAction an integer value describing the flipping action
         * for the contents of the back buffer.  This should be one of the
         * values of the <code>BufferCapabilities.FlipContents</code>
         * property.
         * @exception IllegalStateException if the buffers have not yet
         * been created
         * @see java.awt.BufferCapabilities#getFlipContents()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected Image getBackBuffer() {

        /**
         * @return direct access to the back buffer, as an image.
         * @exception IllegalStateException if the buffers have not yet
         * been created
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        private void updateInternalBuffers() {

        /**
         * Updates internal buffers (both volatile and non-volatile)
         * by requesting the back-buffer from the peer.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected void createBuffers(int numBuffers, BufferCapabilities caps)

        /**
         * Creates one or more complex, flipping buffers with the given
         * capabilities.
         * @param numBuffers number of buffers to create; must be greater than
         * one
         * @param caps the capabilities of the buffers.
         * <code>BufferCapabilities.isPageFlipping</code> must be
         * <code>true</code>.
         * @exception AWTException if the capabilities supplied could not be
         * supported or met
         * @exception IllegalStateException if the component has no peer
         * @exception IllegalArgumentException if numBuffers is less than two,
         * or if <code>BufferCapabilities.isPageFlipping</code> is not
         * <code>true</code>.
         * @see java.awt.BufferCapabilities#isPageFlipping()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected FlipBufferStrategy(int numBuffers, BufferCapabilities caps)

        /**
         * Creates a new flipping buffer strategy for this component.
         * The component must be a <code>Canvas</code> or <code>Window</code>.
         * @see Canvas
         * @see Window
         * @param numBuffers the number of buffers
         * @param caps the capabilities of the buffers
         * @exception AWTException if the capabilities supplied could not be
         * supported or met
         * @exception ClassCastException if the component is not a canvas or
         * window.
         * @exception IllegalStateException if the component has no peer
         * @exception IllegalArgumentException if {@code numBuffers} is less than two,
         * or if {@code BufferCapabilities.isPageFlipping} is not
         * {@code true}.
         * @see #createBuffers(int, BufferCapabilities)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        int width;

        /**
         * Size of the back buffers.  (Note: these fields were added in 6.0
         * but kept package-private to avoid exposing them in the spec.
         * None of these fields/methods really should have been marked
         * protected when they were introduced in 1.4, but now we just have
         * to live with that decision.)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected VolatileImage drawVBuffer; // = null

        /**
         * The drawing buffer as a volatile image
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        protected BufferCapabilities caps; // = null

        /**
         * The buffering capabilities
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected class FlipBufferStrategy extends BufferStrategy {

    /**
     * Inner class for flipping buffers on a component.  That component must
     * be a <code>Canvas</code> or <code>Window</code>.
     * @see Canvas
     * @see Window
     * @see java.awt.image.BufferStrategy
     * @author Michael Martak
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Image getBackBuffer() {

    /**
     * @return the back buffer currently used by this component's
     * BufferStrategy.  If there is no BufferStrategy or no
     * back buffer, this method returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    BufferStrategy getBufferStrategy() {

    /**
     * @return the buffer strategy used by this component
     * @see Window#createBufferStrategy
     * @see Canvas#createBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private class ProxyCapabilities extends ExtendedBufferCapabilities {

    /**
     * This is a proxy capabilities class used when a FlipBufferStrategy
     * is created instead of the requested Blit strategy.
     *
     * @see sun.java2d.SunGraphicsEnvironment#isFlipStrategyPreferred(ComponentPeer)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void createBufferStrategy(int numBuffers,
                              BufferCapabilities caps) throws AWTException {

    /**
     * Creates a new strategy for multi-buffering on this component with the
     * required buffer capabilities.  This is useful, for example, if only
     * accelerated memory or page flipping is desired (as specified by the
     * buffer capabilities).
     * <p>
     * Each time this method
     * is called, <code>dispose</code> will be invoked on the existing
     * <code>BufferStrategy</code>.
     * @param numBuffers number of buffers to create
     * @param caps the required capabilities for creating the buffer strategy;
     * cannot be <code>null</code>
     * @exception AWTException if the capabilities supplied could not be
     * supported or met; this may happen, for example, if there is not enough
     * accelerated memory currently available, or if page flipping is specified
     * but not possible.
     * @exception IllegalArgumentException if numBuffers is less than 1, or if
     * caps is <code>null</code>
     * @see Window#getBufferStrategy()
     * @see Canvas#getBufferStrategy()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void createBufferStrategy(int numBuffers) {

    /**
     * Creates a new strategy for multi-buffering on this component.
     * Multi-buffering is useful for rendering performance.  This method
     * attempts to create the best strategy available with the number of
     * buffers supplied.  It will always create a <code>BufferStrategy</code>
     * with that number of buffers.
     * A page-flipping strategy is attempted first, then a blitting strategy
     * using accelerated buffers.  Finally, an unaccelerated blitting
     * strategy is used.
     * <p>
     * Each time this method is called,
     * the existing buffer strategy for this component is discarded.
     * @param numBuffers number of buffers to create, including the front buffer
     * @exception IllegalArgumentException if numBuffers is less than 1.
     * @exception IllegalStateException if the component is not displayable
     * @see #isDisplayable
     * @see Window#getBufferStrategy()
     * @see Canvas#getBufferStrategy()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int checkImage(Image image, int width, int height,
                          ImageObserver observer) {

    /**
     * Returns the status of the construction of a screen representation
     * of the specified image.
     * <p>
     * This method does not cause the image to begin loading. An
     * application must use the <code>prepareImage</code> method
     * to force the loading of an image.
     * <p>
     * The <code>checkImage</code> method of <code>Component</code>
     * calls its peer's <code>checkImage</code> method to calculate
     * the flags. If this component does not yet have a peer, the
     * component's toolkit's <code>checkImage</code> method is called
     * instead.
     * <p>
     * Information on the flags returned by this method can be found
     * with the discussion of the <code>ImageObserver</code> interface.
     * @param     image   the <code>Image</code> object whose status
     *                    is being checked
     * @param     width   the width of the scaled version
     *                    whose status is to be checked
     * @param     height  the height of the scaled version
     *                    whose status is to be checked
     * @param     observer   the <code>ImageObserver</code> object
     *                    to be notified as the image is being prepared
     * @return    the bitwise inclusive <b>OR</b> of
     *            <code>ImageObserver</code> flags indicating what
     *            information about the image is currently available
     * @see      #prepareImage(Image, int, int, java.awt.image.ImageObserver)
     * @see      Toolkit#checkImage(Image, int, int, java.awt.image.ImageObserver)
     * @see      java.awt.image.ImageObserver
     * @since    JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int checkImage(Image image, ImageObserver observer) {

    /**
     * Returns the status of the construction of a screen representation
     * of the specified image.
     * <p>
     * This method does not cause the image to begin loading. An
     * application must use the <code>prepareImage</code> method
     * to force the loading of an image.
     * <p>
     * Information on the flags returned by this method can be found
     * with the discussion of the <code>ImageObserver</code> interface.
     * @param     image   the <code>Image</code> object whose status
     *            is being checked
     * @param     observer   the <code>ImageObserver</code>
     *            object to be notified as the image is being prepared
     * @return  the bitwise inclusive <b>OR</b> of
     *            <code>ImageObserver</code> flags indicating what
     *            information about the image is currently available
     * @see      #prepareImage(Image, int, int, java.awt.image.ImageObserver)
     * @see      Toolkit#checkImage(Image, int, int, java.awt.image.ImageObserver)
     * @see      java.awt.image.ImageObserver
     * @since    JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean prepareImage(Image image, int width, int height,
                                ImageObserver observer) {

    /**
     * Prepares an image for rendering on this component at the
     * specified width and height.
     * <p>
     * The image data is downloaded asynchronously in another thread,
     * and an appropriately scaled screen representation of the image is
     * generated.
     * @param     image    the instance of <code>Image</code>
     *            for which to prepare a screen representation
     * @param     width    the width of the desired screen representation
     * @param     height   the height of the desired screen representation
     * @param     observer   the <code>ImageObserver</code> object
     *            to be notified as the image is being prepared
     * @return    <code>true</code> if the image has already been fully
     *          prepared; <code>false</code> otherwise
     * @see       java.awt.image.ImageObserver
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean prepareImage(Image image, ImageObserver observer) {

    /**
     * Prepares an image for rendering on this component.  The image
     * data is downloaded asynchronously in another thread and the
     * appropriate screen representation of the image is generated.
     * @param     image   the <code>Image</code> for which to
     *                    prepare a screen representation
     * @param     observer   the <code>ImageObserver</code> object
     *                       to be notified as the image is being prepared
     * @return    <code>true</code> if the image has already been fully
     *           prepared; <code>false</code> otherwise
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public VolatileImage createVolatileImage(int width, int height,
                                             ImageCapabilities caps) throws AWTException {

    /**
     * Creates a volatile off-screen drawable image, with the given capabilities.
     * The contents of this image may be lost at any time due
     * to operating system issues, so the image must be managed
     * via the <code>VolatileImage</code> interface.
     * @param width the specified width.
     * @param height the specified height.
     * @param caps the image capabilities
     * @exception AWTException if an image with the specified capabilities cannot
     * be created
     * @return a VolatileImage object, which can be used
     * to manage surface contents loss and capabilities.
     * @see java.awt.image.VolatileImage
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public VolatileImage createVolatileImage(int width, int height) {

    /**
     * Creates a volatile off-screen drawable image
     *     to be used for double buffering.
     * @param     width the specified width.
     * @param     height the specified height.
     * @return    an off-screen drawable image, which can be used for double
     *    buffering.  The return value may be <code>null</code> if the
     *    component is not displayable.  This will always happen if
     *    <code>GraphicsEnvironment.isHeadless()</code> returns
     *    <code>true</code>.
     * @see java.awt.image.VolatileImage
     * @see #isDisplayable
     * @see GraphicsEnvironment#isHeadless
     * @since     1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Image createImage(int width, int height) {

    /**
     * Creates an off-screen drawable image
     *     to be used for double buffering.
     * @param     width the specified width
     * @param     height the specified height
     * @return    an off-screen drawable image, which can be used for double
     *    buffering.  The return value may be <code>null</code> if the
     *    component is not displayable.  This will always happen if
     *    <code>GraphicsEnvironment.isHeadless()</code> returns
     *    <code>true</code>.
     * @see #isDisplayable
     * @see GraphicsEnvironment#isHeadless
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Image createImage(ImageProducer producer) {

    /**
     * Creates an image from the specified image producer.
     * @param     producer  the image producer
     * @return    the image produced
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean imageUpdate(Image img, int infoflags,
                               int x, int y, int w, int h) {

    /**
     * Repaints the component when the image has changed.
     * This <code>imageUpdate</code> method of an <code>ImageObserver</code>
     * is called when more information about an
     * image which had been previously requested using an asynchronous
     * routine such as the <code>drawImage</code> method of
     * <code>Graphics</code> becomes available.
     * See the definition of <code>imageUpdate</code> for
     * more information on this method and its arguments.
     * <p>
     * The <code>imageUpdate</code> method of <code>Component</code>
     * incrementally draws an image on the component as more of the bits
     * of the image are available.
     * <p>
     * If the system property <code>awt.image.incrementaldraw</code>
     * is missing or has the value <code>true</code>, the image is
     * incrementally drawn. If the system property has any other value,
     * then the image is not drawn until it has been completely loaded.
     * <p>
     * Also, if incremental drawing is in effect, the value of the
     * system property <code>awt.image.redrawrate</code> is interpreted
     * as an integer to give the maximum redraw rate, in milliseconds. If
     * the system property is missing or cannot be interpreted as an
     * integer, the redraw rate is once every 100ms.
     * <p>
     * The interpretation of the <code>x</code>, <code>y</code>,
     * <code>width</code>, and <code>height</code> arguments depends on
     * the value of the <code>infoflags</code> argument.
     *
     * @param     img   the image being observed
     * @param     infoflags   see <code>imageUpdate</code> for more information
     * @param     x   the <i>x</i> coordinate
     * @param     y   the <i>y</i> coordinate
     * @param     w   the width
     * @param     h   the height
     * @return    <code>false</code> if the infoflags indicate that the
     *            image is completely loaded; <code>true</code> otherwise.
     *
     * @see     java.awt.image.ImageObserver
     * @see     Graphics#drawImage(Image, int, int, Color, java.awt.image.ImageObserver)
     * @see     Graphics#drawImage(Image, int, int, java.awt.image.ImageObserver)
     * @see     Graphics#drawImage(Image, int, int, int, int, Color, java.awt.image.ImageObserver)
     * @see     Graphics#drawImage(Image, int, int, int, int, java.awt.image.ImageObserver)
     * @see     java.awt.image.ImageObserver#imageUpdate(java.awt.Image, int, int, int, int, int)
     * @since   JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void printHeavyweightComponents(Graphics g) {

    /**
     * Prints all the heavyweight subcomponents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void lightweightPrint(Graphics g) {

    /**
     * Simulates the peer callbacks into java.awt for printing of
     * lightweight Components.
     * @param     g   the graphics context to use for printing
     * @see       #printAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void printAll(Graphics g) {

    /**
     * Prints this component and all of its subcomponents.
     * <p>
     * The origin of the graphics context, its
     * (<code>0</code>,&nbsp;<code>0</code>) coordinate point, is the
     * top-left corner of this component. The clipping region of the
     * graphics context is the bounding rectangle of this component.
     * @param     g   the graphics context to use for printing
     * @see       #print(Graphics)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void print(Graphics g) {

    /**
     * Prints this component. Applications should override this method
     * for components that must do special processing before being
     * printed or should be printed differently than they are painted.
     * <p>
     * The default implementation of this method calls the
     * <code>paint</code> method.
     * <p>
     * The origin of the graphics context, its
     * (<code>0</code>,&nbsp;<code>0</code>) coordinate point, is the
     * top-left corner of this component. The clipping region of the
     * graphics context is the bounding rectangle of this component.
     * @param     g   the graphics context to use for printing
     * @see       #paint(Graphics)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void repaint(long tm, int x, int y, int width, int height) {

    /**
     * Repaints the specified rectangle of this component within
     * <code>tm</code> milliseconds.
     * <p>
     * If this component is a lightweight component, this method causes
     * a call to this component's <code>paint</code> method.
     * Otherwise, this method causes a call to this component's
     * <code>update</code> method.
     * <p>
     * <b>Note</b>: For more information on the paint mechanisms utilitized
     * by AWT and Swing, including information on how to write the most
     * efficient painting code, see
     * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.
     *
     * @param     tm   maximum time in milliseconds before update
     * @param     x    the <i>x</i> coordinate
     * @param     y    the <i>y</i> coordinate
     * @param     width    the width
     * @param     height   the height
     * @see       #update(Graphics)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void repaint(int x, int y, int width, int height) {

    /**
     * Repaints the specified rectangle of this component.
     * <p>
     * If this component is a lightweight component, this method
     * causes a call to this component's <code>paint</code> method
     * as soon as possible.  Otherwise, this method causes a call to
     * this component's <code>update</code> method as soon as possible.
     * <p>
     * <b>Note</b>: For more information on the paint mechanisms utilitized
     * by AWT and Swing, including information on how to write the most
     * efficient painting code, see
     * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.
     *
     * @param     x   the <i>x</i> coordinate
     * @param     y   the <i>y</i> coordinate
     * @param     width   the width
     * @param     height  the height
     * @see       #update(Graphics)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void repaint(long tm) {

    /**
     * Repaints the component.  If this component is a lightweight
     * component, this results in a call to <code>paint</code>
     * within <code>tm</code> milliseconds.
     * <p>
     * <b>Note</b>: For more information on the paint mechanisms utilitized
     * by AWT and Swing, including information on how to write the most
     * efficient painting code, see
     * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.
     *
     * @param tm maximum time in milliseconds before update
     * @see #paint
     * @see #update(Graphics)
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void repaint() {

    /**
     * Repaints this component.
     * <p>
     * If this component is a lightweight component, this method
     * causes a call to this component's <code>paint</code>
     * method as soon as possible.  Otherwise, this method causes
     * a call to this component's <code>update</code> method as soon
     * as possible.
     * <p>
     * <b>Note</b>: For more information on the paint mechanisms utilitized
     * by AWT and Swing, including information on how to write the most
     * efficient painting code, see
     * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.

     *
     * @see       #update(Graphics)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void paintHeavyweightComponents(Graphics g) {

    /**
     * Paints all the heavyweight subcomponents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void lightweightPaint(Graphics g) {

    /**
     * Simulates the peer callbacks into java.awt for painting of
     * lightweight Components.
     * @param     g   the graphics context to use for painting
     * @see       #paintAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void paintAll(Graphics g) {

    /**
     * Paints this component and all of its subcomponents.
     * <p>
     * The origin of the graphics context, its
     * (<code>0</code>,&nbsp;<code>0</code>) coordinate point, is the
     * top-left corner of this component. The clipping region of the
     * graphics context is the bounding rectangle of this component.
     *
     * @param     g   the graphics context to use for painting
     * @see       #paint
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void update(Graphics g) {

    /**
     * Updates this component.
     * <p>
     * If this component is not a lightweight component, the
     * AWT calls the <code>update</code> method in response to
     * a call to <code>repaint</code>.  You can assume that
     * the background is not cleared.
     * <p>
     * The <code>update</code> method of <code>Component</code>
     * calls this component's <code>paint</code> method to redraw
     * this component.  This method is commonly overridden by subclasses
     * which need to do additional work in response to a call to
     * <code>repaint</code>.
     * Subclasses of Component that override this method should either
     * call <code>super.update(g)</code>, or call <code>paint(g)</code>
     * directly from their <code>update</code> method.
     * <p>
     * The origin of the graphics context, its
     * (<code>0</code>,&nbsp;<code>0</code>) coordinate point, is the
     * top-left corner of this component. The clipping region of the
     * graphics context is the bounding rectangle of this component.
     *
     * <p>
     * <b>Note</b>: For more information on the paint mechanisms utilitized
     * by AWT and Swing, including information on how to write the most
     * efficient painting code, see
     * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.
     *
     * @param g the specified context to use for updating
     * @see       #paint
     * @see       #repaint()
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void paint(Graphics g) {

    /**
     * Paints this component.
     * <p>
     * This method is called when the contents of the component should
     * be painted; such as when the component is first being shown or
     * is damaged and in need of repair.  The clip rectangle in the
     * <code>Graphics</code> parameter is set to the area
     * which needs to be painted.
     * Subclasses of <code>Component</code> that override this
     * method need not call <code>super.paint(g)</code>.
     * <p>
     * For performance reasons, <code>Component</code>s with zero width
     * or height aren't considered to need painting when they are first shown,
     * and also aren't considered to need repair.
     * <p>
     * <b>Note</b>: For more information on the paint mechanisms utilitized
     * by AWT and Swing, including information on how to write the most
     * efficient painting code, see
     * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.
     *
     * @param g the graphics context to use for painting
     * @see       #update
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isCursorSet() {

    /**
     * Returns whether the cursor has been explicitly set for this Component.
     * If this method returns <code>false</code>, this Component is inheriting
     * its cursor from an ancestor.
     *
     * @return <code>true</code> if the cursor has been explicitly set for this
     *         Component; <code>false</code> otherwise.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Cursor getCursor() {

    /**
     * Gets the cursor set in the component. If the component does
     * not have a cursor set, the cursor of its parent is returned.
     * If no cursor is set in the entire hierarchy,
     * <code>Cursor.DEFAULT_CURSOR</code> is returned.
     * @see #setCursor
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final void updateCursorImmediately() {

    /**
     * Updates the cursor.  May not be invoked from the native
     * message pump.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setCursor(Cursor cursor) {

    /**
     * Sets the cursor image to the specified cursor.  This cursor
     * image is displayed when the <code>contains</code> method for
     * this component returns true for the current cursor location, and
     * this Component is visible, displayable, and enabled. Setting the
     * cursor of a <code>Container</code> causes that cursor to be displayed
     * within all of the container's subcomponents, except for those
     * that have a non-<code>null</code> cursor.
     * <p>
     * The method may have no visual effect if the Java platform
     * implementation and/or the native system do not support
     * changing the mouse cursor shape.
     * @param cursor One of the constants defined
     *          by the <code>Cursor</code> class;
     *          if this parameter is <code>null</code>
     *          then this component will inherit
     *          the cursor of its parent
     * @see       #isEnabled
     * @see       #isShowing
     * @see       #getCursor
     * @see       #contains
     * @see       Toolkit#createCustomCursor
     * @see       Cursor
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public FontMetrics getFontMetrics(Font font) {

    /**
     * Gets the font metrics for the specified font.
     * Warning: Since Font metrics are affected by the
     * {@link java.awt.font.FontRenderContext FontRenderContext} and
     * this method does not provide one, it can return only metrics for
     * the default render context which may not match that used when
     * rendering on the Component if {@link Graphics2D} functionality is being
     * used. Instead metrics can be obtained at rendering time by calling
     * {@link Graphics#getFontMetrics()} or text measurement APIs on the
     * {@link Font Font} class.
     * @param font the font for which font metrics is to be
     *          obtained
     * @return the font metrics for <code>font</code>
     * @see       #getFont
     * @see       #getPeer
     * @see       java.awt.peer.ComponentPeer#getFontMetrics(Font)
     * @see       Toolkit#getFontMetrics(Font)
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Graphics getGraphics() {

    /**
     * Creates a graphics context for this component. This method will
     * return <code>null</code> if this component is currently not
     * displayable.
     * @return a graphics context for this component, or <code>null</code>
     *             if it has none
     * @see       #paint
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final void revalidateSynchronously() {

    /**
     * Revalidates the component synchronously.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void revalidate() {

    /**
     * Revalidates the component hierarchy up to the nearest validate root.
     * <p>
     * This method first invalidates the component hierarchy starting from this
     * component up to the nearest validate root. Afterwards, the component
     * hierarchy is validated starting from the nearest validate root.
     * <p>
     * This is a convenience method supposed to help application developers
     * avoid looking for validate roots manually. Basically, it's equivalent to
     * first calling the {@link #invalidate()} method on this component, and
     * then calling the {@link #validate()} method on the nearest validate
     * root.
     *
     * @see Container#isValidateRoot
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final void invalidateIfValid() {

    /** Invalidates the component unless it is already invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void invalidateParent() {

    /**
     * Invalidates the parent of this component if any.
     *
     * This method MUST BE invoked under the TreeLock.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void invalidate() {

    /**
     * Invalidates this component and its ancestors.
     * <p>
     * By default, all the ancestors of the component up to the top-most
     * container of the hierarchy are marked invalid. If the {@code
     * java.awt.smartInvalidate} system property is set to {@code true},
     * invalidation stops on the nearest validate root of this component.
     * Marking a container <i>invalid</i> indicates that the container needs to
     * be laid out.
     * <p>
     * This method is called automatically when any layout-related information
     * changes (e.g. setting the bounds of the component, or adding the
     * component to a container).
     * <p>
     * This method might be called often, so it should work fast.
     *
     * @see       #validate
     * @see       #doLayout
     * @see       LayoutManager
     * @see       java.awt.Container#isValidateRoot
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void validate() {

    /**
     * Validates this component.
     * <p>
     * The meaning of the term <i>validating</i> is defined by the ancestors of
     * this class. See {@link Container#validate} for more details.
     *
     * @see       #invalidate
     * @see       #doLayout()
     * @see       LayoutManager
     * @see       Container#validate
     * @since     JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>doLayout()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void doLayout() {

    /**
     * Prompts the layout manager to lay out this component. This is
     * usually called when the component (more specifically, container)
     * is validated.
     * @see #validate
     * @see LayoutManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public BaselineResizeBehavior getBaselineResizeBehavior() {

    /**
     * Returns an enum indicating how the baseline of the component
     * changes as the size changes.  This method is primarily meant for
     * layout managers and GUI builders.
     * <p>
     * The default implementation returns
     * <code>BaselineResizeBehavior.OTHER</code>.  Subclasses that have a
     * baseline should override appropriately.  Subclasses should
     * never return <code>null</code>; if the baseline can not be
     * calculated return <code>BaselineResizeBehavior.OTHER</code>.  Callers
     * should first ask for the baseline using
     * <code>getBaseline</code> and if a value &gt;= 0 is returned use
     * this method.  It is acceptable for this method to return a
     * value other than <code>BaselineResizeBehavior.OTHER</code> even if
     * <code>getBaseline</code> returns a value less than 0.
     *
     * @return an enum indicating how the baseline changes as the component
     *         size changes
     * @see #getBaseline(int, int)
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int getBaseline(int width, int height) {

    /**
     * Returns the baseline.  The baseline is measured from the top of
     * the component.  This method is primarily meant for
     * <code>LayoutManager</code>s to align components along their
     * baseline.  A return value less than 0 indicates this component
     * does not have a reasonable baseline and that
     * <code>LayoutManager</code>s should not align this component on
     * its baseline.
     * <p>
     * The default implementation returns -1.  Subclasses that support
     * baseline should override appropriately.  If a value &gt;= 0 is
     * returned, then the component has a valid baseline for any
     * size &gt;= the minimum size and <code>getBaselineResizeBehavior</code>
     * can be used to determine how the baseline changes with size.
     *
     * @param width the width to get the baseline for
     * @param height the height to get the baseline for
     * @return the baseline or &lt; 0 indicating there is no reasonable
     *         baseline
     * @throws IllegalArgumentException if width or height is &lt; 0
     * @see #getBaselineResizeBehavior
     * @see java.awt.FontMetrics
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public float getAlignmentY() {

    /**
     * Returns the alignment along the y axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public float getAlignmentX() {

    /**
     * Returns the alignment along the x axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Dimension getMaximumSize() {

    /**
     * Gets the maximum size of this component.
     * @return a dimension object indicating this component's maximum size
     * @see #getMinimumSize
     * @see #getPreferredSize
     * @see LayoutManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isMaximumSizeSet() {

    /**
     * Returns true if the maximum size has been set to a non-<code>null</code>
     * value otherwise returns false.
     *
     * @return true if <code>maximumSize</code> is non-<code>null</code>,
     *          false otherwise
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setMaximumSize(Dimension maximumSize) {

    /**
     * Sets the maximum size of this component to a constant
     * value.  Subsequent calls to <code>getMaximumSize</code> will always
     * return this value.  Setting the maximum size to <code>null</code>
     * restores the default behavior.
     *
     * @param maximumSize a <code>Dimension</code> containing the
     *          desired maximum allowable size
     * @see #getMaximumSize
     * @see #isMaximumSizeSet
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMinimumSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Dimension getMinimumSize() {

    /**
     * Gets the minimum size of this component.
     * @return a dimension object indicating this component's minimum size
     * @see #getPreferredSize
     * @see LayoutManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isMinimumSizeSet() {

    /**
     * Returns whether or not <code>setMinimumSize</code> has been
     * invoked with a non-null value.
     *
     * @return true if <code>setMinimumSize</code> has been invoked with a
     *              non-null value.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setMinimumSize(Dimension minimumSize) {

    /**
     * Sets the minimum size of this component to a constant
     * value.  Subsequent calls to <code>getMinimumSize</code> will always
     * return this value.  Setting the minimum size to <code>null</code>
     * restores the default behavior.
     *
     * @param minimumSize the new minimum size of this component
     * @see #getMinimumSize
     * @see #isMinimumSizeSet
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getPreferredSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Dimension getPreferredSize() {

    /**
     * Gets the preferred size of this component.
     * @return a dimension object indicating this component's preferred size
     * @see #getMinimumSize
     * @see LayoutManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isPreferredSizeSet() {

    /**
     * Returns true if the preferred size has been set to a
     * non-<code>null</code> value otherwise returns false.
     *
     * @return true if <code>setPreferredSize</code> has been invoked
     *         with a non-null value.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setPreferredSize(Dimension preferredSize) {

    /**
     * Sets the preferred size of this component to a constant
     * value.  Subsequent calls to <code>getPreferredSize</code> will always
     * return this value.  Setting the preferred size to <code>null</code>
     * restores the default behavior.
     *
     * @param preferredSize The new preferred size, or null
     * @see #getPreferredSize
     * @see #isPreferredSizeSet
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isLightweight() {

    /**
     * A lightweight component doesn't have a native toolkit peer.
     * Subclasses of <code>Component</code> and <code>Container</code>,
     * other than the ones defined in this package like <code>Button</code>
     * or <code>Scrollbar</code>, are lightweight.
     * All of the Swing components are lightweights.
     * <p>
     * This method will always return <code>false</code> if this component
     * is not displayable because it is impossible to determine the
     * weight of an undisplayable component.
     *
     * @return true if this component has a lightweight peer; false if
     *         it has a native peer or no peer
     * @see #isDisplayable
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isOpaque() {

    /**
     * Returns true if this component is completely opaque, returns
     * false by default.
     * <p>
     * An opaque component paints every pixel within its
     * rectangular region. A non-opaque component paints only some of
     * its pixels, allowing the pixels underneath it to "show through".
     * A component that does not fully paint its pixels therefore
     * provides a degree of transparency.
     * <p>
     * Subclasses that guarantee to always completely paint their
     * contents should override this method and return true.
     *
     * @return true if this component is completely opaque
     * @see #isLightweight
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Point getLocation(Point rv) {

    /**
     * Stores the x,y origin of this component into "return value" <b>rv</b>
     * and return <b>rv</b>.   If rv is <code>null</code> a new
     * <code>Point</code> is allocated.
     * This version of <code>getLocation</code> is useful if the
     * caller wants to avoid allocating a new <code>Point</code>
     * object on the heap.
     *
     * @param rv the return value, modified to the components location
     * @return rv
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Dimension getSize(Dimension rv) {

    /**
     * Stores the width/height of this component into "return value" <b>rv</b>
     * and return <b>rv</b>.   If rv is <code>null</code> a new
     * <code>Dimension</code> object is allocated.  This version of
     * <code>getSize</code> is useful if the caller wants to avoid
     * allocating a new <code>Dimension</code> object on the heap.
     *
     * @param rv the return value, modified to the components size
     * @return rv
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Rectangle getBounds(Rectangle rv) {

    /**
     * Stores the bounds of this component into "return value" <b>rv</b> and
     * return <b>rv</b>.  If rv is <code>null</code> a new
     * <code>Rectangle</code> is allocated.
     * This version of <code>getBounds</code> is useful if the caller
     * wants to avoid allocating a new <code>Rectangle</code> object
     * on the heap.
     *
     * @param rv the return value, modified to the components bounds
     * @return rv
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int getHeight() {

    /**
     * Returns the current height of this component.
     * This method is preferable to writing
     * <code>component.getBounds().height</code>,
     * or <code>component.getSize().height</code> because it
     * doesn't cause any heap allocations.
     *
     * @return the current height of this component
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int getWidth() {

    /**
     * Returns the current width of this component.
     * This method is preferable to writing
     * <code>component.getBounds().width</code>,
     * or <code>component.getSize().width</code> because it
     * doesn't cause any heap allocations.
     *
     * @return the current width of this component
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int getY() {

    /**
     * Returns the current y coordinate of the components origin.
     * This method is preferable to writing
     * <code>component.getBounds().y</code>,
     * or <code>component.getLocation().y</code> because it
     * doesn't cause any heap allocations.
     *
     * @return the current y coordinate of the components origin
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public int getX() {

    /**
     * Returns the current x coordinate of the components origin.
     * This method is preferable to writing
     * <code>component.getBounds().x</code>,
     * or <code>component.getLocation().x</code> because it doesn't
     * cause any heap allocations.
     *
     * @return the current x coordinate of the components origin
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setBounds(Rectangle r) {

    /**
     * Moves and resizes this component to conform to the new
     * bounding rectangle <code>r</code>. This component's new
     * position is specified by <code>r.x</code> and <code>r.y</code>,
     * and its new size is specified by <code>r.width</code> and
     * <code>r.height</code>
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param r the new bounding rectangle for this component
     * @throws NullPointerException if {@code r} is {@code null}
     * @see       #getBounds
     * @see       #setLocation(int, int)
     * @see       #setLocation(Point)
     * @see       #setSize(int, int)
     * @see       #setSize(Dimension)
     * @see #invalidate
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setBounds(int, int, int, int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setBounds(int x, int y, int width, int height) {

    /**
     * Moves and resizes this component. The new location of the top-left
     * corner is specified by <code>x</code> and <code>y</code>, and the
     * new size is specified by <code>width</code> and <code>height</code>.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param x the new <i>x</i>-coordinate of this component
     * @param y the new <i>y</i>-coordinate of this component
     * @param width the new <code>width</code> of this component
     * @param height the new <code>height</code> of this
     *          component
     * @see #getBounds
     * @see #setLocation(int, int)
     * @see #setLocation(Point)
     * @see #setSize(int, int)
     * @see #setSize(Dimension)
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getBounds()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Rectangle getBounds() {

    /**
     * Gets the bounds of this component in the form of a
     * <code>Rectangle</code> object. The bounds specify this
     * component's width, height, and location relative to
     * its parent.
     * @return a rectangle indicating this component's bounds
     * @see #setBounds
     * @see #getLocation
     * @see #getSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setSize(Dimension)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setSize(Dimension d) {

    /**
     * Resizes this component so that it has width <code>d.width</code>
     * and height <code>d.height</code>.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param d the dimension specifying the new size
     *          of this component
     * @throws NullPointerException if {@code d} is {@code null}
     * @see #setSize
     * @see #setBounds
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setSize(int, int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setSize(int width, int height) {

    /**
     * Resizes this component so that it has width <code>width</code>
     * and height <code>height</code>.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param width the new width of this component in pixels
     * @param height the new height of this component in pixels
     * @see #getSize
     * @see #setBounds
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Dimension getSize() {

    /**
     * Returns the size of this component in the form of a
     * <code>Dimension</code> object. The <code>height</code>
     * field of the <code>Dimension</code> object contains
     * this component's height, and the <code>width</code>
     * field of the <code>Dimension</code> object contains
     * this component's width.
     * @return a <code>Dimension</code> object that indicates the
     *          size of this component
     * @see #setSize
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setLocation(Point p) {

    /**
     * Moves this component to a new location. The top-left corner of
     * the new location is specified by point <code>p</code>. Point
     * <code>p</code> is given in the parent's coordinate space.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param p the point defining the top-left corner
     *          of the new location, given in the coordinate space of this
     *          component's parent
     * @see #getLocation
     * @see #setBounds
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setLocation(int, int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setLocation(int x, int y) {

    /**
     * Moves this component to a new location. The top-left corner of
     * the new location is specified by the <code>x</code> and <code>y</code>
     * parameters in the coordinate space of this component's parent.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param x the <i>x</i>-coordinate of the new location's
     *          top-left corner in the parent's coordinate space
     * @param y the <i>y</i>-coordinate of the new location's
     *          top-left corner in the parent's coordinate space
     * @see #getLocation
     * @see #setBounds
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getLocation()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Point getLocationOnScreen() {

    /**
     * Gets the location of this component in the form of a point
     * specifying the component's top-left corner in the screen's
     * coordinate space.
     * @return an instance of <code>Point</code> representing
     *          the top-left corner of the component's bounds in the
     *          coordinate space of the screen
     * @throws IllegalComponentStateException if the
     *          component is not showing on the screen
     * @see #setLocation
     * @see #getLocation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Point getLocation() {

    /**
     * Gets the location of this component in the form of a
     * point specifying the component's top-left corner.
     * The location will be relative to the parent's coordinate space.
     * <p>
     * Due to the asynchronous nature of native event handling, this
     * method can return outdated values (for instance, after several calls
     * of <code>setLocation()</code> in rapid succession).  For this
     * reason, the recommended method of obtaining a component's position is
     * within <code>java.awt.event.ComponentListener.componentMoved()</code>,
     * which is called after the operating system has finished moving the
     * component.
     * </p>
     * @return an instance of <code>Point</code> representing
     *          the top-left corner of the component's bounds in
     *          the coordinate space of the component's parent
     * @see #setLocation
     * @see #getLocationOnScreen
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public ColorModel getColorModel() {

    /**
     * Gets the instance of <code>ColorModel</code> used to display
     * the component on the output device.
     * @return the color model used by this component
     * @see java.awt.image.ColorModel
     * @see java.awt.peer.ComponentPeer#getColorModel()
     * @see Toolkit#getColorModel()
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setLocale(Locale l) {

    /**
     * Sets the locale of this component.  This is a bound property.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param l the locale to become this component's locale
     * @see #getLocale
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Locale getLocale() {

    /**
     * Gets the locale of this component.
     * @return this component's locale; if this component does not
     *          have a locale, the locale of its parent is returned
     * @see #setLocale
     * @exception IllegalComponentStateException if the <code>Component</code>
     *          does not have its own locale and has not yet been added to
     *          a containment hierarchy such that the locale can be determined
     *          from the containing parent
     * @since  JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isFontSet() {

    /**
     * Returns whether the font has been explicitly set for this Component. If
     * this method returns <code>false</code>, this Component is inheriting its
     * font from an ancestor.
     *
     * @return <code>true</code> if the font has been explicitly set for this
     *         Component; <code>false</code> otherwise.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setFont(Font f) {

    /**
     * Sets the font of this component.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param f the font to become this component's font;
     *          if this parameter is <code>null</code> then this
     *          component will inherit the font of its parent
     * @see #getFont
     * @see #invalidate
     * @since JDK1.0
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Transient

    /**
     * Gets the font of this component.
     * @return this component's font; if a font has not been set
     * for this component, the font of its parent is returned
     * @see #setFont
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isBackgroundSet() {

    /**
     * Returns whether the background color has been explicitly set for this
     * Component. If this method returns <code>false</code>, this Component is
     * inheriting its background color from an ancestor.
     *
     * @return <code>true</code> if the background color has been explicitly
     *         set for this Component; <code>false</code> otherwise.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setBackground(Color c) {

    /**
     * Sets the background color of this component.
     * <p>
     * The background color affects each component differently and the
     * parts of the component that are affected by the background color
     * may differ between operating systems.
     *
     * @param c the color to become this component's color;
     *          if this parameter is <code>null</code>, then this
     *          component will inherit the background color of its parent
     * @see #getBackground
     * @since JDK1.0
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Transient

    /**
     * Gets the background color of this component.
     * @return this component's background color; if this component does
     *          not have a background color,
     *          the background color of its parent is returned
     * @see #setBackground
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isForegroundSet() {

    /**
     * Returns whether the foreground color has been explicitly set for this
     * Component. If this method returns <code>false</code>, this Component is
     * inheriting its foreground color from an ancestor.
     *
     * @return <code>true</code> if the foreground color has been explicitly
     *         set for this Component; <code>false</code> otherwise.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setForeground(Color c) {

    /**
     * Sets the foreground color of this component.
     * @param c the color to become this component's
     *          foreground color; if this parameter is <code>null</code>
     *          then this component will inherit
     *          the foreground color of its parent
     * @see #getForeground
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Transient

    /**
     * Gets the foreground color of this component.
     * @return this component's foreground color; if this component does
     * not have a foreground color, the foreground color of its parent
     * is returned
     * @see #setForeground
     * @since JDK1.0
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setVisible(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setVisible(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setVisible(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setVisible(boolean b) {

    /**
     * Shows or hides this component depending on the value of parameter
     * <code>b</code>.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param b  if <code>true</code>, shows this component;
     * otherwise, hides this component
     * @see #isVisible
     * @see #invalidate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void enableInputMethods(boolean enable) {

    /**
     * Enables or disables input method support for this component. If input
     * method support is enabled and the component also processes key events,
     * incoming events are offered to
     * the current input method and will only be processed by the component or
     * dispatched to its listeners if the input method does not consume them.
     * By default, input method support is enabled.
     *
     * @param enable true to enable, false to disable
     * @see #processKeyEvent
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isDoubleBuffered() {

    /**
     * Returns true if this component is painted to an offscreen image
     * ("buffer") that's copied to the screen later.  Component
     * subclasses that support double buffering should override this
     * method to return true if double buffering is enabled.
     *
     * @return false by default
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setEnabled(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setEnabled(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>setEnabled(boolean)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setEnabled(boolean b) {

    /**
     * Enables or disables this component, depending on the value of the
     * parameter <code>b</code>. An enabled component can respond to user
     * input and generate events. Components are enabled initially by default.
     *
     * <p>Note: Disabling a lightweight component does not prevent it from
     * receiving MouseEvents.
     * <p>Note: Disabling a heavyweight container prevents all components
     * in this container from receiving any input events.  But disabling a
     * lightweight container affects only this container.
     *
     * @param     b   If <code>true</code>, this component is
     *            enabled; otherwise this component is disabled
     * @see #isEnabled
     * @see #isLightweight
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isEnabled() {

    /**
     * Determines whether this component is enabled. An enabled component
     * can respond to user input and generate events. Components are
     * enabled initially by default. A component may be enabled or disabled by
     * calling its <code>setEnabled</code> method.
     * @return <code>true</code> if the component is enabled,
     *          <code>false</code> otherwise
     * @see #setEnabled
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isShowing() {

    /**
     * Determines whether this component is showing on screen. This means
     * that the component must be visible, and it must be in a container
     * that is visible and showing.
     * <p>
     * <strong>Note:</strong> sometimes there is no way to detect whether the
     * {@code Component} is actually visible to the user.  This can happen when:
     * <ul>
     * <li>the component has been added to a visible {@code ScrollPane} but
     * the {@code Component} is not currently in the scroll pane's view port.
     * <li>the {@code Component} is obscured by another {@code Component} or
     * {@code Container}.
     * </ul>
     * @return <code>true</code> if the component is showing,
     *          <code>false</code> otherwise
     * @see #setVisible
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean isSameOrAncestorOf(Component comp, boolean allowChildren) {

    /**
     * Overridden in Container. Must be called under TreeLock.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Point getMousePosition() throws HeadlessException {

    /**
     * Returns the position of the mouse pointer in this <code>Component</code>'s
     * coordinate space if the <code>Component</code> is directly under the mouse
     * pointer, otherwise returns <code>null</code>.
     * If the <code>Component</code> is not showing on the screen, this method
     * returns <code>null</code> even if the mouse pointer is above the area
     * where the <code>Component</code> would be displayed.
     * If the <code>Component</code> is partially or fully obscured by other
     * <code>Component</code>s or native windows, this method returns a non-null
     * value only if the mouse pointer is located above the unobscured part of the
     * <code>Component</code>.
     * <p>
     * For <code>Container</code>s it returns a non-null value if the mouse is
     * above the <code>Container</code> itself or above any of its descendants.
     * Use {@link Container#getMousePosition(boolean)} if you need to exclude children.
     * <p>
     * Sometimes the exact mouse coordinates are not important, and the only thing
     * that matters is whether a specific <code>Component</code> is under the mouse
     * pointer. If the return value of this method is <code>null</code>, mouse
     * pointer is not directly above the <code>Component</code>.
     *
     * @exception HeadlessException if GraphicsEnvironment.isHeadless() returns true
     * @see       #isShowing
     * @see       Container#getMousePosition
     * @return    mouse coordinates relative to this <code>Component</code>, or null
     * @since     1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Component findUnderMouseInWindow(PointerInfo pi) {

    /**
     * Assuming that mouse location is stored in PointerInfo passed
     * to this method, it finds a Component that is in the same
     * Window as this Component and is located under the mouse pointer.
     * If no such Component exists, null is returned.
     * NOTE: this method should be called under the protection of
     * tree lock, as it is done in Component.getMousePosition() and
     * Container.getMousePosition(boolean).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Point pointRelativeToComponent(Point absolute) {

    /**
     * Translates absolute coordinates into coordinates in the coordinate
     * space of this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private Rectangle getRecursivelyVisibleBounds() {

    /**
     * Determines the bounds of a visible part of the component relative to its
     * parent.
     *
     * @return the visible part of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean isRecursivelyVisible() {

    /**
     * Determines whether this component will be displayed on the screen.
     * @return <code>true</code> if the component and all of its ancestors
     *          until a toplevel window or null parent are visible,
     *          <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Transient

    /**
     * Determines whether this component should be visible when its
     * parent is visible. Components are
     * initially visible, with the exception of top level components such
     * as <code>Frame</code> objects.
     * @return <code>true</code> if the component is visible,
     * <code>false</code> otherwise
     * @see #setVisible
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isDisplayable() {

    /**
     * Determines whether this component is displayable. A component is
     * displayable when it is connected to a native screen resource.
     * <p>
     * A component is made displayable either when it is added to
     * a displayable containment hierarchy or when its containment
     * hierarchy is made displayable.
     * A containment hierarchy is made displayable when its ancestor
     * window is either packed or made visible.
     * <p>
     * A component is made undisplayable either when it is removed from
     * a displayable containment hierarchy or when its containment hierarchy
     * is made undisplayable.  A containment hierarchy is made
     * undisplayable when its ancestor window is disposed.
     *
     * @return <code>true</code> if the component is displayable,
     * <code>false</code> otherwise
     * @see Container#add(Component)
     * @see Window#pack
     * @see Window#show
     * @see Container#remove(Component)
     * @see Window#dispose
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public boolean isValid() {

    /**
     * Determines whether this component is valid. A component is valid
     * when it is correctly sized and positioned within its parent
     * container and all its children are also valid.
     * In order to account for peers' size requirements, components are invalidated
     * before they are first shown on the screen. By the time the parent container
     * is fully realized, all its components will be valid.
     * @return <code>true</code> if the component is valid, <code>false</code>
     * otherwise
     * @see #validate
     * @see #invalidate
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Toolkit getToolkit() {

    /**
     * Gets the toolkit of this component. Note that
     * the frame that contains a component controls which
     * toolkit is used by that component. Therefore if the component
     * is moved from one frame to another, the toolkit it uses may change.
     * @return  the toolkit of this component
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public final Object getTreeLock() {

    /**
     * Gets this component's locking object (the object that owns the thread
     * synchronization monitor) for AWT component-tree and layout
     * operations.
     * @return this component's locking object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    void checkGD(String stringID) {

    /**
     * Checks that this component's <code>GraphicsDevice</code>
     * <code>idString</code> matches the string argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public GraphicsConfiguration getGraphicsConfiguration() {

    /**
     * Gets the <code>GraphicsConfiguration</code> associated with this
     * <code>Component</code>.
     * If the <code>Component</code> has not been assigned a specific
     * <code>GraphicsConfiguration</code>,
     * the <code>GraphicsConfiguration</code> of the
     * <code>Component</code> object's top-level container is
     * returned.
     * If the <code>Component</code> has been created, but not yet added
     * to a <code>Container</code>, this method returns <code>null</code>.
     *
     * @return the <code>GraphicsConfiguration</code> used by this
     *          <code>Component</code> or <code>null</code>
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized DropTarget getDropTarget() { return dropTarget; }

    /**
     * Gets the <code>DropTarget</code> associated with this
     * <code>Component</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public synchronized void setDropTarget(DropTarget dt) {

    /**
     * Associate a <code>DropTarget</code> with this component.
     * The <code>Component</code> will receive drops only if it
     * is enabled.
     *
     * @see #isEnabled
     * @param dt The DropTarget
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * programs should not directly manipulate peers;
     * replaced by <code>boolean isDisplayable()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public Container getParent() {

    /**
     * Gets the parent of this component.
     * @return the parent container of this component
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public void setName(String name) {

    /**
     * Sets the name of the component to the specified string.
     * @param name  the string that is to be this
     *           component's name
     * @see #getName
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public String getName() {

    /**
     * Gets the name of the component.
     * @return this component's name
     * @see    #setName
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    String constructComponentName() {

    /**
     * Constructs a name for this component.  Called by <code>getName</code>
     * when the name is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    protected Component() {

    /**
     * Constructs a new component. Class <code>Component</code> can be
     * extended directly to create a lightweight component that does not
     * utilize an opaque native window. A lightweight component must be
     * hosted by a native container somewhere higher up in the component
     * tree (for example, by a <code>Frame</code> object).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    int getBoundsOp() {

    /**
     * Should only be used in subclass getBounds to check that part of bounds
     * is actualy changing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        OTHER

        /**
         * Indicates the baseline resize behavior can not be expressed using
         * any of the other constants.  This may also indicate the baseline
         * varies with the width of the component.  This is also returned
         * by components that do not have a baseline.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        CENTER_OFFSET,

        /**
         * Indicates the baseline remains a fixed distance from
         * the center of the component.  That is, for any height H the
         * difference between <code>getBaseline(w, H)</code> and
         * <code>H / 2</code> is the same (plus or minus one depending upon
         * rounding error).
         * <p>
         * Because of possible rounding errors it is recommended
         * you ask for the baseline with two consecutive heights and use
         * the return value to determine if you need to pad calculations
         * by 1.  The following shows how to calculate the baseline for
         * any height:
         * <pre>
         *   Dimension preferredSize = component.getPreferredSize();
         *   int baseline = getBaseline(preferredSize.width,
         *                              preferredSize.height);
         *   int nextBaseline = getBaseline(preferredSize.width,
         *                                  preferredSize.height + 1);
         *   // Amount to add to height when calculating where baseline
         *   // lands for a particular height:
         *   int padding = 0;
         *   // Where the baseline is relative to the mid point
         *   int baselineOffset = baseline - height / 2;
         *   if (preferredSize.height % 2 == 0 &amp;&amp;
         *       baseline != nextBaseline) {
         *       padding = 1;
         *   }
         *   else if (preferredSize.height % 2 == 1 &amp;&amp;
         *            baseline == nextBaseline) {
         *       baselineOffset--;
         *       padding = 1;
         *   }
         *   // The following calculates where the baseline lands for
         *   // the height z:
         *   int calculatedBaseline = (z + padding) / 2 + baselineOffset;
         * </pre>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
        CONSTANT_DESCENT,

        /**
         * Indicates the baseline remains fixed relative to the height
         * and does not change as the width is varied.  That is, for
         * any height H the difference between H and
         * <code>getBaseline(w, H)</code> is the same.  For example, a
         * <code>JLabel</code> containing non-empty text with a
         * vertical alignment of <code>BOTTOM</code> should have a
         * baseline type of <code>CONSTANT_DESCENT</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public enum BaselineResizeBehavior {

    /**
     * Enumeration of the common ways the baseline of a component can
     * change as the size changes.  The baseline resize behavior is
     * primarily for layout managers that need to know how the
     * position of the baseline changes as the component size changes.
     * In general the baseline resize behavior will be valid for sizes
     * greater than or equal to the minimum size (the actual minimum
     * size; not a developer specified minimum size).  For sizes
     * smaller than the minimum size the baseline may change in a way
     * other than the baseline resize behavior indicates.  Similarly,
     * as the size approaches <code>Integer.MAX_VALUE</code> and/or
     * <code>Short.MAX_VALUE</code> the baseline may change in a way
     * other than the baseline resize behavior indicates.
     *
     * @see #getBaselineResizeBehavior
     * @see #getBaseline(int,int)
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private int boundsOp = ComponentPeer.DEFAULT_OPERATION;

    /**
     * Pseudoparameter for direct Geometry API (setLocation, setBounds setSize
     * to signal setBounds what's changing. Should be used under TreeLock.
     * This is only needed due to the inability to change the cross-calling
     * order of public and deprecated methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private PropertyChangeSupport changeSupport;

    /**
     * If any <code>PropertyChangeListeners</code> have been registered,
     * the <code>changeSupport</code> field describes them.
     *
     * @serial
     * @since 1.2
     * @see #addPropertyChangeListener
     * @see #removePropertyChangeListener
     * @see #firePropertyChange
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public static final float RIGHT_ALIGNMENT = 1.0f;

    /**
     * Ease-of-use constant for <code>getAlignmentX</code>.
     * Specifies an alignment to the right side of the component.
     * @see     #getAlignmentX
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public static final float LEFT_ALIGNMENT = 0.0f;

    /**
     * Ease-of-use constant for <code>getAlignmentX</code>.
     * Specifies an alignment to the left side of the component.
     * @see     #getAlignmentX
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public static final float BOTTOM_ALIGNMENT = 1.0f;

    /**
     * Ease-of-use constant for <code>getAlignmentY</code>.
     * Specifies an alignment to the bottom of the component.
     * @see     #getAlignmentY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public static final float CENTER_ALIGNMENT = 0.5f;

    /**
     * Ease-of-use constant for <code>getAlignmentY</code> and
     * <code>getAlignmentX</code>. Specifies an alignment to
     * the center of the component
     * @see     #getAlignmentX
     * @see     #getAlignmentY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    public static final float TOP_ALIGNMENT = 0.0f;

    /**
     * Ease-of-use constant for <code>getAlignmentY()</code>.
     * Specifies an alignment to the top of the component.
     * @see     #getAlignmentY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    static boolean isInc;

    /**
     * Static properties for incremental drawing.
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    long eventMask = AWTEvent.INPUT_METHODS_ENABLED_MASK;

    /**
     * The <code>eventMask</code> is ONLY set by subclasses via
     * <code>enableEvents</code>.
     * The mask should NOT be set when listeners are registered
     * so that we can distinguish the difference between when
     * listeners request events and subclasses request them.
     * One bit is used to indicate whether input methods are
     * enabled; this bit is set by <code>enableInputMethods</code> and is
     * on by default.
     *
     * @serial
     * @see #enableInputMethods
     * @see AWTEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    final static String actionListenerK = "actionL";

    /** Internal, constants for serialization */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean newEventsOnly = false;

    /**
     * <code>newEventsOnly</code> will be true if the event is
     * one of the event types enabled for the component.
     * It will then allow for normal processing to
     * continue.  If it is false the event is passed
     * to the component's parent and up the ancestor
     * tree until the event has been consumed.
     *
     * @serial
     * @see #dispatchEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    transient ComponentOrientation componentOrientation

    /**
     * The orientation for this component.
     * @see #getComponentOrientation
     * @see #setComponentOrientation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean maxSizeSet;

    /**
     * Whether or not setMaximumSize has been invoked with a non-null value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Dimension maxSize;

    /**
     * Maximum size
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean prefSizeSet;

    /**
     * Whether or not setPreferredSize has been invoked with a non-null value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Dimension prefSize;

    /**
     * Preferred size.
     * (This field perhaps should have been transient).
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean minSizeSet;

    /**
     * Whether or not setMinimumSize has been invoked with a non-null value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Dimension minSize;

    /**
     * Minimum size.
     * (This field perhaps should have been transient).
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    static final Object LOCK = new AWTTreeLock();

    /**
     * The locking object for AWT component-tree and layout operations.
     *
     * @see #getTreeLock
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private boolean focusTraversalKeysEnabled = true;

    /**
     * Indicates whether focus traversal keys are enabled for this Component.
     * Components for which focus traversal keys are disabled receive key
     * events for focus traversal keys. Components for which focus traversal
     * keys are enabled do not see these events; instead, the events are
     * automatically converted to traversal operations.
     *
     * @serial
     * @see #setFocusTraversalKeysEnabled
     * @see #getFocusTraversalKeysEnabled
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Set<AWTKeyStroke>[] focusTraversalKeys;

    /**
     * The focus traversal keys. These keys will generate focus traversal
     * behavior for Components for which focus traversal keys are enabled. If a
     * value of null is specified for a traversal key, this Component inherits
     * that traversal key from its parent. If all ancestors of this Component
     * have null specified for that traversal key, then the current
     * KeyboardFocusManager's default traversal key is used.
     *
     * @serial
     * @see #setFocusTraversalKeys
     * @see #getFocusTraversalKeys
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private int isFocusTraversableOverridden = FOCUS_TRAVERSABLE_UNKNOWN;

    /**
     * Tracks whether this Component is relying on default focus travesability.
     *
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private boolean focusable = true;

    /**
     * Indicates whether this Component can be focused.
     *
     * @serial
     * @see #setFocusable
     * @see #isFocusable
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private boolean nameExplicitlySet = false;

    /**
     * A bool to determine whether the name has
     * been set explicitly. <code>nameExplicitlySet</code> will
     * be false if the name has not been set and
     * true if it has.
     *
     * @serial
     * @see #getName
     * @see #setName(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private String name;

    /**
     * A component's name.
     * This field can be <code>null</code>.
     *
     * @serial
     * @see #getName
     * @see #setName(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Vector<PopupMenu> popups;

    /**
     * @serial
     * @see #add
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    DropTarget dropTarget;

    /**
     * The <code>DropTarget</code> associated with this component.
     *
     * @since 1.2
     * @serial
     * @see #setDropTarget
     * @see #getDropTarget
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private volatile boolean valid = false;

    /**
     * True when the object is valid. An invalid object needs to
     * be layed out. This flag is set to false when the object
     * size is changed.
     *
     * @serial
     * @see #isValid
     * @see #validate
     * @see #invalidate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean enabled = true;

    /**
     * True when the object is enabled. An object that is not
     * enabled does not interact with the user.
     *
     * @serial
     * @see #isEnabled
     * @see #setEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean visible = true;

    /**
     * True when the object is visible. An object that is not
     * visible is not drawn on the screen.
     *
     * @serial
     * @see #isVisible
     * @see #setVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    boolean ignoreRepaint = false;

    /**
     * True when the object should ignore all repaint events.
     *
     * @since 1.4
     * @serial
     * @see #setIgnoreRepaint
     * @see #getIgnoreRepaint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    transient BufferStrategy bufferStrategy = null;

    /**
     * A reference to a <code>BufferStrategy</code> object
     * used to manipulate the buffers on this component.
     *
     * @since 1.4
     * @see java.awt.image.BufferStrategy
     * @see #getBufferStrategy()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    private transient GraphicsConfiguration graphicsConfig = null;

    /**
     * A reference to a <code>GraphicsConfiguration</code> object
     * used to describe the characteristics of a graphics
     * destination.
     * This value can be <code>null</code>.
     *
     * @since 1.3
     * @serial
     * @see GraphicsConfiguration
     * @see #getGraphicsConfiguration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Locale      locale;

    /**
     * The locale for the component.
     *
     * @serial
     * @see #getLocale
     * @see #setLocale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Cursor      cursor;

    /**
     * The cursor displayed when pointer is over this component.
     * This value can be <code>null</code>.
     *
     * @serial
     * @see #getCursor
     * @see #setCursor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Font        peerFont;

    /**
     * The font which the peer is currently using.
     * (<code>null</code> if no peer exists.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    volatile Font font;

    /**
     * The font used by this component.
     * The <code>font</code> can be <code>null</code>.
     *
     * @serial
     * @see #getFont
     * @see #setFont
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Color       background;

    /**
     * The background color for this component.
     * <code>background</code> can be <code>null</code>.
     *
     * @serial
     * @see #getBackground
     * @see #setBackground
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    Color       foreground;

    /**
     * The foreground color for this component.
     * <code>foreground</code> can be <code>null</code>.
     *
     * @serial
     * @see #getForeground
     * @see #setForeground
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    int height;

    /**
     * The height of the component.
     *
     * @serial
     * @see #getSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    int width;

    /**
     * The width of the component.
     *
     * @serial
     * @see #getSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    int y;

    /**
     * The y position of the component in the parent's coordinate system.
     *
     * @serial
     * @see #getLocation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    int x;

    /**
     * The x position of the component in the parent's coordinate system.
     *
     * @serial
     * @see #getLocation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    transient AppContext appContext;

    /**
     * The <code>AppContext</code> of the component. Applets/Plugin may
     * change the AppContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    transient Container parent;

    /**
     * The parent of the object. It may be <code>null</code>
     * for top-level components.
     * @see #getParent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
    transient ComponentPeer peer;

    /**
     * The peer of the component. The peer implements the component's
     * behavior. The peer is set when the <code>Component</code> is
     * added to a container that also is a peer.
     * @see #addNotify
     * @see #removeNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Component.java
public abstract class Component implements ImageObserver, MenuContainer,

/**
 * A <em>component</em> is an object having a graphical representation
 * that can be displayed on the screen and that can interact with the
 * user. Examples of components are the buttons, checkboxes, and scrollbars
 * of a typical graphical user interface. <p>
 * The <code>Component</code> class is the abstract superclass of
 * the nonmenu-related Abstract Window Toolkit components. Class
 * <code>Component</code> can also be extended directly to create a
 * lightweight component. A lightweight component is a component that is
 * not associated with a native window. On the contrary, a heavyweight
 * component is associated with a native window. The {@link #isLightweight()}
 * method may be used to distinguish between the two kinds of the components.
 * <p>
 * Lightweight and heavyweight components may be mixed in a single component
 * hierarchy. However, for correct operating of such a mixed hierarchy of
 * components, the whole hierarchy must be valid. When the hierarchy gets
 * invalidated, like after changing the bounds of components, or
 * adding/removing components to/from containers, the whole hierarchy must be
 * validated afterwards by means of the {@link Container#validate()} method
 * invoked on the top-most invalid container of the hierarchy.
 *
 * <h3>Serialization</h3>
 * It is important to note that only AWT listeners which conform
 * to the <code>Serializable</code> protocol will be saved when
 * the object is stored.  If an AWT object has listeners that
 * aren't marked serializable, they will be dropped at
 * <code>writeObject</code> time.  Developers will need, as always,
 * to consider the implications of making an object serializable.
 * One situation to watch out for is this:
 * <pre>
 *    import java.awt.*;
 *    import java.awt.event.*;
 *    import java.io.Serializable;
 *
 *    class MyApp implements ActionListener, Serializable
 *    {
 *        BigObjectThatShouldNotBeSerializedWithAButton bigOne;
 *        Button aButton = new Button();
 *
 *        MyApp()
 *        {
 *            // Oops, now aButton has a listener with a reference
 *            // to bigOne!
 *            aButton.addActionListener(this);
 *        }
 *
 *        public void actionPerformed(ActionEvent e)
 *        {
 *            System.out.println("Hello There");
 *        }
 *    }
 * </pre>
 * In this example, serializing <code>aButton</code> by itself
 * will cause <code>MyApp</code> and everything it refers to
 * to be serialized as well.  The problem is that the listener
 * is serializable by coincidence, not by design.  To separate
 * the decisions about <code>MyApp</code> and the
 * <code>ActionListener</code> being serializable one can use a
 * nested class, as in the following example:
 * <pre>
 *    import java.awt.*;
 *    import java.awt.event.*;
 *    import java.io.Serializable;
 *
 *    class MyApp implements java.io.Serializable
 *    {
 *         BigObjectThatShouldNotBeSerializedWithAButton bigOne;
 *         Button aButton = new Button();
 *
 *         static class MyActionListener implements ActionListener
 *         {
 *             public void actionPerformed(ActionEvent e)
 *             {
 *                 System.out.println("Hello There");
 *             }
 *         }
 *
 *         MyApp()
 *         {
 *             aButton.addActionListener(new MyActionListener());
 *         }
 *    }
 * </pre>
 * <p>
 * <b>Note</b>: For more information on the paint mechanisms utilitized
 * by AWT and Swing, including information on how to write the most
 * efficient painting code, see
 * <a href="http://www.oracle.com/technetwork/java/painting-140037.html">Painting in AWT and Swing</a>.
 * <p>
 * For details on the focus subsystem, see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/misc/focus.html">
 * How to Use the Focus Subsystem</a>,
 * a section in <em>The Java Tutorial</em>, and the
 * <a href="../../java/awt/doc-files/FocusSpec.html">Focus Specification</a>
 * for more information.
 *
 * @author      Arthur van Hoff
 * @author      Sami Shaio
 */
