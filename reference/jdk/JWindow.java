_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    @SuppressWarnings("serial")

    /**
     * This class implements accessibility support for the
     * <code>JWindow</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to window user-interface
     * elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this JWindow.
     * For JWindows, the AccessibleContext takes the form of an
     * AccessibleJWindow.
     * A new AccessibleJWindow instance is created if necessary.
     *
     * @return an AccessibleJWindow that serves as the
     *         AccessibleContext of this JWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    protected AccessibleContext accessibleContext = null;

    /** The accessible context property. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JWindow</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JWindow</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public void repaint(long time, int x, int y, int width, int height) {

    /**
     * Repaints the specified rectangle of this component within
     * <code>time</code> milliseconds.  Refer to <code>RepaintManager</code>
     * for details on how the repaint is handled.
     *
     * @param     time   maximum time in milliseconds before update
     * @param     x    the <i>x</i> coordinate
     * @param     y    the <i>y</i> coordinate
     * @param     width    the width
     * @param     height   the height
     * @see       RepaintManager
     * @since     1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public Graphics getGraphics() {

    /**
     * {@inheritDoc}
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public void setGlassPane(Component glassPane) {

    /**
     * Sets the <code>glassPane</code> property.
     * This method is called by the constructor.
     * @param glassPane the <code>glassPane</code> object for this window
     *
     * @see #getGlassPane
     * @see RootPaneContainer#setGlassPane
     *
     * @beaninfo
     *     hidden: true
     *     description: A transparent pane used for menu rendering.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public Component getGlassPane() {

    /**
     * Returns the <code>glassPane Component</code> for this window.
     *
     * @return the <code>glassPane</code> property
     * @see #setGlassPane
     * @see RootPaneContainer#getGlassPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public void setLayeredPane(JLayeredPane layeredPane) {

    /**
     * Sets the <code>layeredPane</code> property.
     * This method is called by the constructor.
     *
     * @param layeredPane the new <code>layeredPane</code> object
     *
     * @exception IllegalComponentStateException (a runtime
     *            exception) if the content pane parameter is <code>null</code>
     * @see #getLayeredPane
     * @see RootPaneContainer#setLayeredPane
     *
     * @beaninfo
     *     hidden: true
     *     description: The pane which holds the various window layers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public JLayeredPane getLayeredPane() {

    /**
     * Returns the <code>layeredPane</code> object for this window.
     *
     * @return the <code>layeredPane</code> property
     * @see #setLayeredPane
     * @see RootPaneContainer#getLayeredPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public void setContentPane(Container contentPane) {

    /**
     * Sets the <code>contentPane</code> property for this window.
     * This method is called by the constructor.
     *
     * @param contentPane the new <code>contentPane</code>
     *
     * @exception IllegalComponentStateException (a runtime
     *            exception) if the content pane parameter is <code>null</code>
     * @see #getContentPane
     * @see RootPaneContainer#setContentPane
     *
     * @beaninfo
     *     hidden: true
     *     description: The client area of the window where child
     *                  components are normally inserted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public Container getContentPane() {

    /**
     * Returns the <code>Container</code> which is the <code>contentPane</code>
     * for this window.
     *
     * @return the <code>contentPane</code> property
     * @see #setContentPane
     * @see RootPaneContainer#getContentPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    protected void setRootPane(JRootPane root) {

    /**
     * Sets the new <code>rootPane</code> object for this window.
     * This method is called by the constructor.
     *
     * @param root the new <code>rootPane</code> property
     * @see #getRootPane
     *
     * @beaninfo
     *        hidden: true
     *   description: the RootPane object for this window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public JRootPane getRootPane() {

    /**
     * Returns the <code>rootPane</code> object for this window.
     * @return the <code>rootPane</code> property for this window
     *
     * @see #setRootPane
     * @see RootPaneContainer#getRootPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public void setLayout(LayoutManager manager) {

    /**
     * Sets the <code>LayoutManager</code>.
     * Overridden to conditionally forward the call to the
     * <code>contentPane</code>.
     * Refer to {@link javax.swing.RootPaneContainer} for
     * more information.
     *
     * @param manager the <code>LayoutManager</code>
     * @see #setRootPaneCheckingEnabled
     * @see javax.swing.RootPaneContainer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public void remove(Component comp) {

    /**
     * Removes the specified component from the container. If
     * <code>comp</code> is not the <code>rootPane</code>, this will forward
     * the call to the <code>contentPane</code>. This will do nothing if
     * <code>comp</code> is not a child of the <code>JWindow</code> or
     * <code>contentPane</code>.
     *
     * @param comp the component to be removed
     * @throws NullPointerException if <code>comp</code> is null
     * @see #add
     * @see javax.swing.RootPaneContainer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    protected void addImpl(Component comp, Object constraints, int index)

    /**
     * Adds the specified child <code>Component</code>.
     * This method is overridden to conditionally forward calls to the
     * <code>contentPane</code>.
     * By default, children are added to the <code>contentPane</code> instead
     * of the frame, refer to {@link javax.swing.RootPaneContainer} for
     * details.
     *
     * @param comp the component to be enhanced
     * @param constraints the constraints to be respected
     * @param index the index
     * @exception IllegalArgumentException if <code>index</code> is invalid
     * @exception IllegalArgumentException if adding the container's parent
     *                  to itself
     * @exception IllegalArgumentException if adding a window to a container
     *
     * @see #setRootPaneCheckingEnabled
     * @see javax.swing.RootPaneContainer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    protected void setRootPaneCheckingEnabled(boolean enabled) {

    /**
     * Sets whether calls to <code>add</code> and
     * <code>setLayout</code> are forwarded to the <code>contentPane</code>.
     *
     * @param enabled  true if <code>add</code> and <code>setLayout</code>
     *        are forwarded, false if they should operate directly on the
     *        <code>JWindow</code>.
     *
     * @see #addImpl
     * @see #setLayout
     * @see #isRootPaneCheckingEnabled
     * @see javax.swing.RootPaneContainer
     * @beaninfo
     *      hidden: true
     * description: Whether the add and setLayout methods are forwarded
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public void update(Graphics g) {

    /**
     * Calls <code>paint(g)</code>.  This method was overridden to
     * prevent an unnecessary call to clear the background.
     *
     * @param g  the <code>Graphics</code> context in which to paint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public TransferHandler getTransferHandler() {

    /**
     * Gets the <code>transferHandler</code> property.
     *
     * @return the value of the <code>transferHandler</code> property
     *
     * @see TransferHandler
     * @see #setTransferHandler
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public void setTransferHandler(TransferHandler newHandler) {

    /**
     * Sets the {@code transferHandler} property, which is a mechanism to
     * support transfer of data into this component. Use {@code null}
     * if the component does not support data transfer operations.
     * <p>
     * If the system property {@code suppressSwingDropSupport} is {@code false}
     * (the default) and the current drop target on this component is either
     * {@code null} or not a user-set drop target, this method will change the
     * drop target as follows: If {@code newHandler} is {@code null} it will
     * clear the drop target. If not {@code null} it will install a new
     * {@code DropTarget}.
     * <p>
     * Note: When used with {@code JWindow}, {@code TransferHandler} only
     * provides data import capability, as the data export related methods
     * are currently typed to {@code JComponent}.
     * <p>
     * Please see
     * <a href="https://docs.oracle.com/javase/tutorial/uiswing/dnd/index.html">
     * How to Use Drag and Drop and Data Transfer</a>, a section in
     * <em>The Java Tutorial</em>, for more information.
     *
     * @param newHandler the new {@code TransferHandler}
     *
     * @see TransferHandler
     * @see #getTransferHandler
     * @see java.awt.Component#setDropTarget
     * @since 1.6
     *
     * @beaninfo
     *        bound: true
     *       hidden: true
     *  description: Mechanism for transfer of data into the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    protected boolean isRootPaneCheckingEnabled() {

    /**
     * Returns whether calls to <code>add</code> and
     * <code>setLayout</code> are forwarded to the <code>contentPane</code>.
     *
     * @return true if <code>add</code> and <code>setLayout</code>
     *         are forwarded; false otherwise
     *
     * @see #addImpl
     * @see #setLayout
     * @see #setRootPaneCheckingEnabled
     * @see javax.swing.RootPaneContainer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    protected JRootPane createRootPane() {

    /**
     * Called by the constructor methods to create the default
     * <code>rootPane</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    protected void windowInit() {

    /**
     * Called by the constructors to init the <code>JWindow</code> properly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public JWindow(Window owner, GraphicsConfiguration gc) {

    /**
     * Creates a window with the specified owner window and
     * <code>GraphicsConfiguration</code> of a screen device. If
     * <code>owner</code> is <code>null</code>, the shared owner will be used
     * and this window will not be focusable.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @param owner the window from which the window is displayed
     * @param gc the <code>GraphicsConfiguration</code> that is used
     *          to construct the new window with; if gc is <code>null</code>,
     *          the system default <code>GraphicsConfiguration</code>
     *          is assumed, unless <code>owner</code> is also null, in which
     *          case the <code>GraphicsConfiguration</code> from the
     *          shared owner frame will be used.
     * @throws HeadlessException if
     *         <code>GraphicsEnvironment.isHeadless()</code> returns true.
     * @throws IllegalArgumentException if <code>gc</code> is not from
     *         a screen device.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #isFocusableWindow
     * @see JComponent#getDefaultLocale
     *
     * @since  1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public JWindow(Window owner) {

    /**
     * Creates a window with the specified owner window. This window
     * will not be focusable unless its owner is showing on the screen.
     * If <code>owner</code> is <code>null</code>, the shared owner
     * will be used and this window will not be focusable.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @param owner the window from which the window is displayed
     * @throws HeadlessException if
     *         <code>GraphicsEnvironment.isHeadless()</code> returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #isFocusableWindow
     * @see JComponent#getDefaultLocale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public JWindow(Frame owner) {

    /**
     * Creates a window with the specified owner frame.
     * If <code>owner</code> is <code>null</code>, the shared owner
     * will be used and this window will not be focusable. Also,
     * this window will not be focusable unless its owner is showing
     * on the screen.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @param owner the frame from which the window is displayed
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #isFocusableWindow
     * @see JComponent#getDefaultLocale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public JWindow(GraphicsConfiguration gc) {

    /**
     * Creates a window with the specified <code>GraphicsConfiguration</code>
     * of a screen device. This window will not be focusable.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @param gc the <code>GraphicsConfiguration</code> that is used
     *          to construct the new window with; if gc is <code>null</code>,
     *          the system default <code>GraphicsConfiguration</code>
     *          is assumed
     * @throws HeadlessException If
     *         <code>GraphicsEnvironment.isHeadless()</code> returns true.
     * @throws IllegalArgumentException if <code>gc</code> is not from
     *         a screen device.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #isFocusableWindow
     * @see JComponent#getDefaultLocale
     *
     * @since  1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    public JWindow() {

    /**
     * Creates a window with no specified owner. This window will not be
     * focusable.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @throws HeadlessException if
     *         <code>GraphicsEnvironment.isHeadless()</code> returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #isFocusableWindow
     * @see JComponent#getDefaultLocale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    private TransferHandler transferHandler;

    /**
     * The <code>TransferHandler</code> for this window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    protected boolean rootPaneCheckingEnabled = false;

    /**
     * If true then calls to <code>add</code> and <code>setLayout</code>
     * will be forwarded to the <code>contentPane</code>. This is initially
     * false, but is set to true when the <code>JWindow</code> is constructed.
     *
     * @see #isRootPaneCheckingEnabled
     * @see #setRootPaneCheckingEnabled
     * @see javax.swing.RootPaneContainer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
    protected JRootPane rootPane;

    /**
     * The <code>JRootPane</code> instance that manages the
     * <code>contentPane</code>
     * and optional <code>menuBar</code> for this frame, as well as the
     * <code>glassPane</code>.
     *
     * @see #getRootPane
     * @see #setRootPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JWindow.java
@SuppressWarnings("serial")

/**
 * A <code>JWindow</code> is a container that can be displayed anywhere on the
 * user's desktop. It does not have the title bar, window-management buttons,
 * or other trimmings associated with a <code>JFrame</code>, but it is still a
 * "first-class citizen" of the user's desktop, and can exist anywhere
 * on it.
 * <p>
 * The <code>JWindow</code> component contains a <code>JRootPane</code>
 * as its only child.  The <code>contentPane</code> should be the parent
 * of any children of the <code>JWindow</code>.
 * As a convenience, the {@code add}, {@code remove}, and {@code setLayout}
 * methods of this class are overridden, so that they delegate calls
 * to the corresponding methods of the {@code ContentPane}.
 * For example, you can add a child component to a window as follows:
 * <pre>
 *       window.add(child);
 * </pre>
 * And the child will be added to the contentPane.
 * The <code>contentPane</code> will always be non-<code>null</code>.
 * Attempting to set it to <code>null</code> will cause the <code>JWindow</code>
 * to throw an exception. The default <code>contentPane</code> will have a
 * <code>BorderLayout</code> manager set on it.
 * Refer to {@link javax.swing.RootPaneContainer}
 * for details on adding, removing and setting the <code>LayoutManager</code>
 * of a <code>JWindow</code>.
 * <p>
 * Please see the {@link JRootPane} documentation for a complete description of
 * the <code>contentPane</code>, <code>glassPane</code>, and
 * <code>layeredPane</code> components.
 * <p>
 * In a multi-screen environment, you can create a <code>JWindow</code>
 * on a different screen device.  See {@link java.awt.Window} for more
 * information.
 * <p>
 * <strong>Warning:</strong> Swing is not thread safe. For more
 * information see <a
 * href="package-summary.html#threading">Swing's Threading
 * Policy</a>.
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
 * @see JRootPane
 *
 * @beaninfo
 *      attribute: isContainer true
 *      attribute: containerDelegate getContentPane
 *    description: A toplevel window which has no system border or controls.
 *
 * @author David Kloba
 */
