_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    protected class AccessibleJApplet extends AccessibleApplet {

    /**
     * This class implements accessibility support for the
     * <code>JApplet</code> class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this JApplet.
     * For JApplets, the AccessibleContext takes the form of an
     * AccessibleJApplet.
     * A new AccessibleJApplet instance is created if necessary.
     *
     * @return an AccessibleJApplet that serves as the
     *         AccessibleContext of this JApplet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    protected String paramString() {

    /**
     * Returns a string representation of this JApplet. This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this JApplet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public Graphics getGraphics() {

    /**
     * {@inheritDoc}
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public void setGlassPane(Component glassPane) {

    /**
     * Sets the glassPane property.
     * This method is called by the constructor.
     * @param glassPane the glassPane object for this applet
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public Component getGlassPane() {

    /**
     * Returns the glassPane object for this applet.
     *
     * @see #setGlassPane
     * @see RootPaneContainer#getGlassPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public void setLayeredPane(JLayeredPane layeredPane) {

    /**
     * Sets the layeredPane property.  This method is called by the constructor.
     * @param layeredPane the layeredPane object for this applet
     *
     * @see #getLayeredPane
     * @see RootPaneContainer#setLayeredPane
     *
     * @beaninfo
     *     hidden: true
     *     description: The pane which holds the various applet layers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public JLayeredPane getLayeredPane() {

    /**
     * Returns the layeredPane object for this applet.
     *
     * @exception java.awt.IllegalComponentStateException (a runtime
     *            exception) if the layered pane parameter is null
     * @see #setLayeredPane
     * @see RootPaneContainer#getLayeredPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public void setContentPane(Container contentPane) {

   /**
     * Sets the contentPane property.  This method is called by the constructor.
     * @param contentPane the contentPane object for this applet
     *
     * @exception java.awt.IllegalComponentStateException (a runtime
     *            exception) if the content pane parameter is null
     * @see #getContentPane
     * @see RootPaneContainer#setContentPane
     *
     * @beaninfo
     *     hidden: true
     *     description: The client area of the applet where child
     *                  components are normally inserted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public Container getContentPane() {

    /**
     * Returns the contentPane object for this applet.
     *
     * @see #setContentPane
     * @see RootPaneContainer#getContentPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    protected void setRootPane(JRootPane root) {

    /**
     * Sets the rootPane property.  This method is called by the constructor.
     * @param root the rootPane object for this applet
     *
     * @see #getRootPane
     *
     * @beaninfo
     *   hidden: true
     * description: the RootPane object for this applet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public JRootPane getRootPane() {

    /**
     * Returns the rootPane object for this applet.
     *
     * @see #setRootPane
     * @see RootPaneContainer#getRootPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public void remove(Component comp) {

    /**
     * Removes the specified component from the container. If
     * <code>comp</code> is not the <code>rootPane</code>, this will forward
     * the call to the <code>contentPane</code>. This will do nothing if
     * <code>comp</code> is not a child of the <code>JFrame</code> or
     * <code>contentPane</code>.
     *
     * @param comp the component to be removed
     * @throws NullPointerException if <code>comp</code> is null
     * @see #add
     * @see javax.swing.RootPaneContainer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    protected void setRootPaneCheckingEnabled(boolean enabled) {

    /**
     * Sets whether calls to <code>add</code> and
     * <code>setLayout</code> are forwarded to the <code>contentPane</code>.
     *
     * @param enabled  true if <code>add</code> and <code>setLayout</code>
     *        are forwarded, false if they should operate directly on the
     *        <code>JApplet</code>.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public JMenuBar getJMenuBar() {

   /**
    * Returns the menubar set on this applet.
    *
    * @see #setJMenuBar
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public void setJMenuBar(JMenuBar menuBar) {

   /**
    * Sets the menubar for this applet.
    * @param menuBar the menubar being placed in the applet
    *
    * @see #getJMenuBar
    *
    * @beaninfo
    *      hidden: true
    * description: The menubar for accessing pulldown menus from this applet.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public void update(Graphics g) {

    /**
     * Just calls <code>paint(g)</code>.  This method was overridden to
     * prevent an unnecessary call to clear the background.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
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
     * Note: When used with {@code JApplet}, {@code TransferHandler} only
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    protected JRootPane createRootPane() {

    /** Called by the constructor methods to create the default rootPane. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    public JApplet() throws HeadlessException {

    /**
     * Creates a swing applet instance.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see JComponent#getDefaultLocale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    private TransferHandler transferHandler;

    /**
     * The <code>TransferHandler</code> for this applet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    protected boolean rootPaneCheckingEnabled = false;

    /**
     * If true then calls to <code>add</code> and <code>setLayout</code>
     * will be forwarded to the <code>contentPane</code>. This is initially
     * false, but is set to true when the <code>JApplet</code> is constructed.
     *
     * @see #isRootPaneCheckingEnabled
     * @see #setRootPaneCheckingEnabled
     * @see javax.swing.RootPaneContainer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
    protected JRootPane rootPane;

    /**
     * @see #getRootPane
     * @see #setRootPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JApplet.java
public class JApplet extends Applet implements Accessible,

/**
 * An extended version of <code>java.applet.Applet</code> that adds support for
 * the JFC/Swing component architecture.
 * You can find task-oriented documentation about using <code>JApplet</code>
 * in <em>The Java Tutorial</em>,
 * in the section
 * <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/applet.html">How to Make Applets</a>.
 * <p>
 * The <code>JApplet</code> class is slightly incompatible with
 * <code>java.applet.Applet</code>.  <code>JApplet</code> contains a
 * <code>JRootPane</code> as its only child.  The <code>contentPane</code>
 * should be the parent of any children of the <code>JApplet</code>.
 * As a convenience, the {@code add}, {@code remove}, and {@code setLayout}
 * methods of this class are overridden, so that they delegate calls
 * to the corresponding methods of the {@code ContentPane}.
 * For example, you can add a child component to an applet as follows:
 * <pre>
 *       applet.add(child);
 * </pre>
 *
 * And the child will be added to the <code>contentPane</code>.
 * The <code>contentPane</code> will always be non-<code>null</code>.
 * Attempting to set it to <code>null</code> will cause the
 * <code>JApplet</code> to throw an exception. The default
 * <code>contentPane</code> will have a <code>BorderLayout</code>
 * manager set on it.
 * Refer to {@link javax.swing.RootPaneContainer}
 * for details on adding, removing and setting the <code>LayoutManager</code>
 * of a <code>JApplet</code>.
 * <p>
 * Please see the <code>JRootPane</code> documentation for a
 * complete description of the <code>contentPane</code>, <code>glassPane</code>,
 * and <code>layeredPane</code> properties.
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
 * @see javax.swing.RootPaneContainer
 * @beaninfo
 *      attribute: isContainer true
 *      attribute: containerDelegate getContentPane
 *    description: Swing's Applet subclass.
 *
 * @author Arnaud Weber
 */
