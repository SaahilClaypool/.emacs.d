_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void adjustmentValueChanged(AdjustmentEvent e) {

    /**
     * Invoked when the value of the adjustable has changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    protected class AccessibleAWTScrollPane extends AccessibleAWTContainer

    /**
     * This class implements accessibility support for the
     * <code>ScrollPane</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to scroll pane user-interface
     * elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this ScrollPane.
     * For scroll panes, the AccessibleContext takes the form of an
     * AccessibleAWTScrollPane.
     * A new AccessibleAWTScrollPane instance is created if necessary.
     *
     * @return an AccessibleAWTScrollPane that serves as the
     *         AccessibleContext of this ScrollPane
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
        public void adjustmentValueChanged(AdjustmentEvent e) {

        /**
         * Invoked when the value of the adjustable has changed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads default serializable fields to stream.
     * @exception HeadlessException if
     * <code>GraphicsEnvironment.isHeadless()</code> returns
     * <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * Writes default serializable fields to stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public boolean isWheelScrollingEnabled() {

    /**
     * Indicates whether or not scrolling will take place in response to
     * the mouse wheel.  Wheel scrolling is enabled by default.
     *
     * @see #setWheelScrollingEnabled(boolean)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void setWheelScrollingEnabled(boolean handleWheel) {

    /**
     * Enables/disables scrolling in response to movement of the mouse wheel.
     * Wheel scrolling is enabled by default.
     *
     * @param handleWheel   <code>true</code> if scrolling should be done
     *                      automatically for a MouseWheelEvent,
     *                      <code>false</code> otherwise.
     * @see #isWheelScrollingEnabled
     * @see java.awt.event.MouseWheelEvent
     * @see java.awt.event.MouseWheelListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    protected boolean eventTypeEnabled(int type) {

    /**
     * If wheel scrolling is enabled, we return true for MouseWheelEvents
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    protected void processMouseWheelEvent(MouseWheelEvent e) {

    /**
     * Process mouse wheel events that are delivered to this
     * <code>ScrollPane</code> by scrolling an appropriate amount.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e  the mouse wheel event
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public String paramString() {

    /**
     * Returns a string representing the state of this
     * <code>ScrollPane</code>. This
     * method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return the parameter string of this scroll pane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void addNotify() {

    /**
     * Creates the scroll pane's peer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void printComponents(Graphics g) {

    /**
     * Prints the component in this scroll pane.
     * @param g the specified Graphics window
     * @see Component#print
     * @see Component#printAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>doLayout()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    Dimension calculateChildSize() {

    /**
     * Determine the size to allocate the child component.
     * If the viewport area is bigger than the preferred size
     * of the child then the child is allocated enough
     * to fill the viewport, otherwise the child is given
     * it's preferred size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void doLayout() {

    /**
     * Lays out this container by resizing its child to its preferred size.
     * If the new preferred size of the child causes the current scroll
     * position to be invalid, the scroll position is set to the closest
     * valid position.
     *
     * @see Component#validate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public final void setLayout(LayoutManager mgr) {

    /**
     * Sets the layout manager for this container.  This method is
     * overridden to prevent the layout mgr from being set.
     * @param mgr the specified layout manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    @Transient

    /**
     * Returns the current x,y position within the child which is displayed
     * at the 0,0 location of the scrolled panel's view port.
     * This is a convenience method which interfaces with the adjustable
     * objects which represent the state of the scrollbars.
     * @return the coordinate position for the current scroll position
     * @throws NullPointerException if the scrollpane does not contain
     *     a child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void setScrollPosition(Point p) {

    /**
     * Scrolls to the specified position within the child component.
     * A call to this method is only valid if the scroll pane contains
     * a child and the specified position is within legal scrolling bounds
     * of the child.  Specifying a position outside of the legal scrolling
     * bounds of the child will scroll to the closest legal position.
     * Legal bounds are defined to be the rectangle:
     * x = 0, y = 0, width = (child width - view port width),
     * height = (child height - view port height).
     * This is a convenience method which interfaces with the Adjustable
     * objects which represent the state of the scrollbars.
     * @param p the Point representing the position to scroll to
     * @throws NullPointerException if {@code p} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void setScrollPosition(int x, int y) {

    /**
     * Scrolls to the specified position within the child component.
     * A call to this method is only valid if the scroll pane contains
     * a child.  Specifying a position outside of the legal scrolling bounds
     * of the child will scroll to the closest legal position.
     * Legal bounds are defined to be the rectangle:
     * x = 0, y = 0, width = (child width - view port width),
     * height = (child height - view port height).
     * This is a convenience method which interfaces with the Adjustable
     * objects which represent the state of the scrollbars.
     * @param x the x position to scroll to
     * @param y the y position to scroll to
     * @throws NullPointerException if the scrollpane does not contain
     *     a child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public Adjustable getHAdjustable() {

    /**
     * Returns the <code>ScrollPaneAdjustable</code> object which
     * represents the state of the horizontal scrollbar.
     * The declared return type of this method is
     * <code>Adjustable</code> to maintain backward compatibility.
     * @see java.awt.ScrollPaneAdjustable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public Adjustable getVAdjustable() {

    /**
     * Returns the <code>ScrollPaneAdjustable</code> object which
     * represents the state of the vertical scrollbar.
     * The declared return type of this method is
     * <code>Adjustable</code> to maintain backward compatibility.
     * @see java.awt.ScrollPaneAdjustable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public int getVScrollbarWidth() {

    /**
     * Returns the width that would be occupied by a vertical
     * scrollbar, which is independent of whether it is currently
     * displayed by the scroll pane or not.
     * @return the width of a vertical scrollbar in pixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public int getHScrollbarHeight() {

    /**
     * Returns the height that would be occupied by a horizontal
     * scrollbar, which is independent of whether it is currently
     * displayed by the scroll pane or not.
     * @return the height of a horizontal scrollbar in pixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public Dimension getViewportSize() {

    /**
     * Returns the current size of the scroll pane's view port.
     * @return the size of the view port in pixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public int getScrollbarDisplayPolicy() {

    /**
     * Returns the display policy for the scrollbars.
     * @return the display policy for the scrollbars
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    protected final void addImpl(Component comp, Object constraints, int index) {

    /**
     * Adds the specified component to this scroll pane container.
     * If the scroll pane has an existing child component, that
     * component is removed and the new one is added.
     * @param comp the component to be added
     * @param constraints  not applicable
     * @param index position of child component (must be &lt;= 0)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    @ConstructorProperties({"scrollbarDisplayPolicy"})

    /**
     * Create a new scrollpane container.
     * @param scrollbarDisplayPolicy policy for when scrollbars should be shown
     * @throws IllegalArgumentException if the specified scrollbar
     *     display policy is invalid
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *     returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public ScrollPane() throws HeadlessException {

    /**
     * Create a new scrollpane container with a scrollbar display
     * policy of "as needed".
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *     returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private boolean wheelScrollingEnabled = defaultWheelScroll;

    /**
     * Indicates whether or not scrolling should take place when a
     * MouseWheelEvent is received.
     *
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private ScrollPaneAdjustable hAdjustable;

    /**
     * An adjustable horizontal scrollbar.
     * It is important to note that you must <em>NOT</em> call 3
     * <code>Adjustable</code> methods, namely:
     * <code>setMinimum()</code>, <code>setMaximum()</code>,
     * <code>setVisibleAmount()</code>.
     *
     * @serial
     * @see #getHAdjustable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private ScrollPaneAdjustable vAdjustable;

    /**
     * An adjustable vertical scrollbar.
     * It is important to note that you must <em>NOT</em> call 3
     * <code>Adjustable</code> methods, namely:
     * <code>setMinimum()</code>, <code>setMaximum()</code>,
     * <code>setVisibleAmount()</code>.
     *
     * @serial
     * @see #getVAdjustable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private int scrollbarDisplayPolicy;

    /**
     * There are 3 ways in which a scroll bar can be displayed.
     * This integer will represent one of these 3 displays -
     * (SCROLLBARS_ALWAYS, SCROLLBARS_AS_NEEDED, SCROLLBARS_NEVER)
     *
     * @serial
     * @see #getScrollbarDisplayPolicy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public static final int SCROLLBARS_NEVER = 2;

    /**
     * Specifies that horizontal/vertical scrollbars should never be shown
     * regardless of the respective sizes of the scrollpane and child.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public static final int SCROLLBARS_ALWAYS = 1;

    /**
     * Specifies that horizontal/vertical scrollbars should always be
     * shown regardless of the respective sizes of the scrollpane and child.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public static final int SCROLLBARS_AS_NEEDED = 0;

    /**
     * Specifies that horizontal/vertical scrollbar should be shown
     * only when the size of the child exceeds the size of the scrollpane
     * in the horizontal/vertical dimension.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
public class ScrollPane extends Container implements Accessible {

/**
 * A container class which implements automatic horizontal and/or
 * vertical scrolling for a single child component.  The display
 * policy for the scrollbars can be set to:
 * <OL>
 * <LI>as needed: scrollbars created and shown only when needed by scrollpane
 * <LI>always: scrollbars created and always shown by the scrollpane
 * <LI>never: scrollbars never created or shown by the scrollpane
 * </OL>
 * <P>
 * The state of the horizontal and vertical scrollbars is represented
 * by two <code>ScrollPaneAdjustable</code> objects (one for each
 * dimension) which implement the <code>Adjustable</code> interface.
 * The API provides methods to access those objects such that the
 * attributes on the Adjustable object (such as unitIncrement, value,
 * etc.) can be manipulated.
 * <P>
 * Certain adjustable properties (minimum, maximum, blockIncrement,
 * and visibleAmount) are set internally by the scrollpane in accordance
 * with the geometry of the scrollpane and its child and these should
 * not be set by programs using the scrollpane.
 * <P>
 * If the scrollbar display policy is defined as "never", then the
 * scrollpane can still be programmatically scrolled using the
 * setScrollPosition() method and the scrollpane will move and clip
 * the child's contents appropriately.  This policy is useful if the
 * program needs to create and manage its own adjustable controls.
 * <P>
 * The placement of the scrollbars is controlled by platform-specific
 * properties set by the user outside of the program.
 * <P>
 * The initial size of this container is set to 100x100, but can
 * be reset using setSize().
 * <P>
 * Scrolling with the wheel on a wheel-equipped mouse is enabled by default.
 * This can be disabled using <code>setWheelScrollingEnabled</code>.
 * Wheel scrolling can be customized by setting the block and
 * unit increment of the horizontal and vertical Adjustables.
 * For information on how mouse wheel events are dispatched, see
 * the class description for {@link MouseWheelEvent}.
 * <P>
 * Insets are used to define any space used by scrollbars and any
 * borders created by the scroll pane. getInsets() can be used
 * to get the current value for the insets.  If the value of
 * scrollbarsAlwaysVisible is false, then the value of the insets
 * will change dynamically depending on whether the scrollbars are
 * currently visible or not.
 *
 * @author      Tom Ball
 * @author      Amy Fowler
 * @author      Tim Prinzing
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void adjustmentValueChanged(AdjustmentEvent e) {

    /**
     * Invoked when the value of the adjustable has changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    protected class AccessibleAWTScrollPane extends AccessibleAWTContainer

    /**
     * This class implements accessibility support for the
     * <code>ScrollPane</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to scroll pane user-interface
     * elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this ScrollPane.
     * For scroll panes, the AccessibleContext takes the form of an
     * AccessibleAWTScrollPane.
     * A new AccessibleAWTScrollPane instance is created if necessary.
     *
     * @return an AccessibleAWTScrollPane that serves as the
     *         AccessibleContext of this ScrollPane
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
        public void adjustmentValueChanged(AdjustmentEvent e) {

        /**
         * Invoked when the value of the adjustable has changed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads default serializable fields to stream.
     * @exception HeadlessException if
     * <code>GraphicsEnvironment.isHeadless()</code> returns
     * <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * Writes default serializable fields to stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public boolean isWheelScrollingEnabled() {

    /**
     * Indicates whether or not scrolling will take place in response to
     * the mouse wheel.  Wheel scrolling is enabled by default.
     *
     * @see #setWheelScrollingEnabled(boolean)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void setWheelScrollingEnabled(boolean handleWheel) {

    /**
     * Enables/disables scrolling in response to movement of the mouse wheel.
     * Wheel scrolling is enabled by default.
     *
     * @param handleWheel   <code>true</code> if scrolling should be done
     *                      automatically for a MouseWheelEvent,
     *                      <code>false</code> otherwise.
     * @see #isWheelScrollingEnabled
     * @see java.awt.event.MouseWheelEvent
     * @see java.awt.event.MouseWheelListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    protected boolean eventTypeEnabled(int type) {

    /**
     * If wheel scrolling is enabled, we return true for MouseWheelEvents
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    protected void processMouseWheelEvent(MouseWheelEvent e) {

    /**
     * Process mouse wheel events that are delivered to this
     * <code>ScrollPane</code> by scrolling an appropriate amount.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e  the mouse wheel event
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public String paramString() {

    /**
     * Returns a string representing the state of this
     * <code>ScrollPane</code>. This
     * method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return the parameter string of this scroll pane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void addNotify() {

    /**
     * Creates the scroll pane's peer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void printComponents(Graphics g) {

    /**
     * Prints the component in this scroll pane.
     * @param g the specified Graphics window
     * @see Component#print
     * @see Component#printAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>doLayout()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    Dimension calculateChildSize() {

    /**
     * Determine the size to allocate the child component.
     * If the viewport area is bigger than the preferred size
     * of the child then the child is allocated enough
     * to fill the viewport, otherwise the child is given
     * it's preferred size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void doLayout() {

    /**
     * Lays out this container by resizing its child to its preferred size.
     * If the new preferred size of the child causes the current scroll
     * position to be invalid, the scroll position is set to the closest
     * valid position.
     *
     * @see Component#validate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public final void setLayout(LayoutManager mgr) {

    /**
     * Sets the layout manager for this container.  This method is
     * overridden to prevent the layout mgr from being set.
     * @param mgr the specified layout manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    @Transient

    /**
     * Returns the current x,y position within the child which is displayed
     * at the 0,0 location of the scrolled panel's view port.
     * This is a convenience method which interfaces with the adjustable
     * objects which represent the state of the scrollbars.
     * @return the coordinate position for the current scroll position
     * @throws NullPointerException if the scrollpane does not contain
     *     a child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void setScrollPosition(Point p) {

    /**
     * Scrolls to the specified position within the child component.
     * A call to this method is only valid if the scroll pane contains
     * a child and the specified position is within legal scrolling bounds
     * of the child.  Specifying a position outside of the legal scrolling
     * bounds of the child will scroll to the closest legal position.
     * Legal bounds are defined to be the rectangle:
     * x = 0, y = 0, width = (child width - view port width),
     * height = (child height - view port height).
     * This is a convenience method which interfaces with the Adjustable
     * objects which represent the state of the scrollbars.
     * @param p the Point representing the position to scroll to
     * @throws NullPointerException if {@code p} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public void setScrollPosition(int x, int y) {

    /**
     * Scrolls to the specified position within the child component.
     * A call to this method is only valid if the scroll pane contains
     * a child.  Specifying a position outside of the legal scrolling bounds
     * of the child will scroll to the closest legal position.
     * Legal bounds are defined to be the rectangle:
     * x = 0, y = 0, width = (child width - view port width),
     * height = (child height - view port height).
     * This is a convenience method which interfaces with the Adjustable
     * objects which represent the state of the scrollbars.
     * @param x the x position to scroll to
     * @param y the y position to scroll to
     * @throws NullPointerException if the scrollpane does not contain
     *     a child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public Adjustable getHAdjustable() {

    /**
     * Returns the <code>ScrollPaneAdjustable</code> object which
     * represents the state of the horizontal scrollbar.
     * The declared return type of this method is
     * <code>Adjustable</code> to maintain backward compatibility.
     * @see java.awt.ScrollPaneAdjustable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public Adjustable getVAdjustable() {

    /**
     * Returns the <code>ScrollPaneAdjustable</code> object which
     * represents the state of the vertical scrollbar.
     * The declared return type of this method is
     * <code>Adjustable</code> to maintain backward compatibility.
     * @see java.awt.ScrollPaneAdjustable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public int getVScrollbarWidth() {

    /**
     * Returns the width that would be occupied by a vertical
     * scrollbar, which is independent of whether it is currently
     * displayed by the scroll pane or not.
     * @return the width of a vertical scrollbar in pixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public int getHScrollbarHeight() {

    /**
     * Returns the height that would be occupied by a horizontal
     * scrollbar, which is independent of whether it is currently
     * displayed by the scroll pane or not.
     * @return the height of a horizontal scrollbar in pixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public Dimension getViewportSize() {

    /**
     * Returns the current size of the scroll pane's view port.
     * @return the size of the view port in pixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public int getScrollbarDisplayPolicy() {

    /**
     * Returns the display policy for the scrollbars.
     * @return the display policy for the scrollbars
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    protected final void addImpl(Component comp, Object constraints, int index) {

    /**
     * Adds the specified component to this scroll pane container.
     * If the scroll pane has an existing child component, that
     * component is removed and the new one is added.
     * @param comp the component to be added
     * @param constraints  not applicable
     * @param index position of child component (must be &lt;= 0)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    @ConstructorProperties({"scrollbarDisplayPolicy"})

    /**
     * Create a new scrollpane container.
     * @param scrollbarDisplayPolicy policy for when scrollbars should be shown
     * @throws IllegalArgumentException if the specified scrollbar
     *     display policy is invalid
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *     returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public ScrollPane() throws HeadlessException {

    /**
     * Create a new scrollpane container with a scrollbar display
     * policy of "as needed".
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *     returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private boolean wheelScrollingEnabled = defaultWheelScroll;

    /**
     * Indicates whether or not scrolling should take place when a
     * MouseWheelEvent is received.
     *
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private ScrollPaneAdjustable hAdjustable;

    /**
     * An adjustable horizontal scrollbar.
     * It is important to note that you must <em>NOT</em> call 3
     * <code>Adjustable</code> methods, namely:
     * <code>setMinimum()</code>, <code>setMaximum()</code>,
     * <code>setVisibleAmount()</code>.
     *
     * @serial
     * @see #getHAdjustable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private ScrollPaneAdjustable vAdjustable;

    /**
     * An adjustable vertical scrollbar.
     * It is important to note that you must <em>NOT</em> call 3
     * <code>Adjustable</code> methods, namely:
     * <code>setMinimum()</code>, <code>setMaximum()</code>,
     * <code>setVisibleAmount()</code>.
     *
     * @serial
     * @see #getVAdjustable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private int scrollbarDisplayPolicy;

    /**
     * There are 3 ways in which a scroll bar can be displayed.
     * This integer will represent one of these 3 displays -
     * (SCROLLBARS_ALWAYS, SCROLLBARS_AS_NEEDED, SCROLLBARS_NEVER)
     *
     * @serial
     * @see #getScrollbarDisplayPolicy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public static final int SCROLLBARS_NEVER = 2;

    /**
     * Specifies that horizontal/vertical scrollbars should never be shown
     * regardless of the respective sizes of the scrollpane and child.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public static final int SCROLLBARS_ALWAYS = 1;

    /**
     * Specifies that horizontal/vertical scrollbars should always be
     * shown regardless of the respective sizes of the scrollpane and child.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    public static final int SCROLLBARS_AS_NEEDED = 0;

    /**
     * Specifies that horizontal/vertical scrollbar should be shown
     * only when the size of the child exceeds the size of the scrollpane
     * in the horizontal/vertical dimension.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPane.java
public class ScrollPane extends Container implements Accessible {

/**
 * A container class which implements automatic horizontal and/or
 * vertical scrolling for a single child component.  The display
 * policy for the scrollbars can be set to:
 * <OL>
 * <LI>as needed: scrollbars created and shown only when needed by scrollpane
 * <LI>always: scrollbars created and always shown by the scrollpane
 * <LI>never: scrollbars never created or shown by the scrollpane
 * </OL>
 * <P>
 * The state of the horizontal and vertical scrollbars is represented
 * by two <code>ScrollPaneAdjustable</code> objects (one for each
 * dimension) which implement the <code>Adjustable</code> interface.
 * The API provides methods to access those objects such that the
 * attributes on the Adjustable object (such as unitIncrement, value,
 * etc.) can be manipulated.
 * <P>
 * Certain adjustable properties (minimum, maximum, blockIncrement,
 * and visibleAmount) are set internally by the scrollpane in accordance
 * with the geometry of the scrollpane and its child and these should
 * not be set by programs using the scrollpane.
 * <P>
 * If the scrollbar display policy is defined as "never", then the
 * scrollpane can still be programmatically scrolled using the
 * setScrollPosition() method and the scrollpane will move and clip
 * the child's contents appropriately.  This policy is useful if the
 * program needs to create and manage its own adjustable controls.
 * <P>
 * The placement of the scrollbars is controlled by platform-specific
 * properties set by the user outside of the program.
 * <P>
 * The initial size of this container is set to 100x100, but can
 * be reset using setSize().
 * <P>
 * Scrolling with the wheel on a wheel-equipped mouse is enabled by default.
 * This can be disabled using <code>setWheelScrollingEnabled</code>.
 * Wheel scrolling can be customized by setting the block and
 * unit increment of the horizontal and vertical Adjustables.
 * For information on how mouse wheel events are dispatched, see
 * the class description for {@link MouseWheelEvent}.
 * <P>
 * Insets are used to define any space used by scrollbars and any
 * borders created by the scroll pane. getInsets() can be used
 * to get the current value for the insets.  If the value of
 * scrollbarsAlwaysVisible is false, then the value of the insets
 * will change dynamically depending on whether the scrollbars are
 * currently visible or not.
 *
 * @author      Tom Ball
 * @author      Amy Fowler
 * @author      Tim Prinzing
 */
