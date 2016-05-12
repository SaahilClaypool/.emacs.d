_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Get the state of this object.
         *
         * @return an instance of AccessibleStateSet containing the current
         * state set of the object
         * @see AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    protected class AccessibleAWTFrame extends AccessibleAWTWindow

    /**
     * This class implements accessibility support for the
     * <code>Frame</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to frame user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this Frame.
     * For frames, the AccessibleContext takes the form of an
     * AccessibleAWTFrame.
     * A new AccessibleAWTFrame instance is created if necessary.
     *
     * @return an AccessibleAWTFrame that serves as the
     *         AccessibleContext of this Frame
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code>.  Tries
     * to read an icon <code>Image</code>, which is optional
     * data available as of 1.4.  If an icon <code>Image</code>
     * is not available, but anything other than an EOF
     * is detected, an <code>OptionalDataException</code>
     * will be thrown.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @exception java.io.OptionalDataException if an icon <code>Image</code>
     *   is not available, but anything other than an EOF
     *   is detected
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless()
     * @see java.awt.Image
     * @see #getIconImage
     * @see #setIconImage(Image)
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * an optional serializable icon <code>Image</code>, which is
     * available as of 1.4.
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @serialData an optional icon <code>Image</code>
     * @see java.awt.Image
     * @see #getIconImage
     * @see #setIconImage(Image)
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    private int frameSerializedDataVersion = 1;

    /**
     * <code>Frame</code>'s Serialized Data Version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public static Frame[] getFrames() {

    /**
     * Returns an array of all {@code Frame}s created by this application.
     * If called from an applet, the array includes only the {@code Frame}s
     * accessible by that applet.
     * <p>
     * <b>Warning:</b> this method may return system created frames, such
     * as a shared, hidden frame which is used by Swing. Applications
     * should not assume the existence of these frames, nor should an
     * application assume anything about these frames such as component
     * positions, <code>LayoutManager</code>s or serialization.
     * <p>
     * <b>Note</b>: To obtain a list of all ownerless windows, including
     * ownerless {@code Dialog}s (introduced in release 1.6), use {@link
     * Window#getOwnerlessWindows Window.getOwnerlessWindows}.
     *
     * @see Window#getWindows()
     * @see Window#getOwnerlessWindows
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>Component.getCursor()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>Component.setCursor(Cursor)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>Frame</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return the parameter string of this frame
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void removeNotify() {

    /**
     * Makes this Frame undisplayable by removing its connection
     * to its native screen resource. Making a Frame undisplayable
     * will cause any of its children to be made undisplayable.
     * This method is called by the toolkit internally and should
     * not be called directly by programs.
     * @see Component#isDisplayable
     * @see #addNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void remove(MenuComponent m) {

    /**
     * Removes the specified menu bar from this frame.
     * @param    m   the menu component to remove.
     *           If <code>m</code> is <code>null</code>, then
     *           no action is taken
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public boolean isUndecorated() {

    /**
     * Indicates whether this frame is undecorated.
     * By default, all frames are initially decorated.
     * @return    <code>true</code> if frame is undecorated;
     *                        <code>false</code> otherwise.
     * @see       java.awt.Frame#setUndecorated(boolean)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setUndecorated(boolean undecorated) {

    /**
     * Disables or enables decorations for this frame.
     * <p>
     * This method can only be called while the frame is not displayable. To
     * make this frame decorated, it must be opaque and have the default shape,
     * otherwise the {@code IllegalComponentStateException} will be thrown.
     * Refer to {@link Window#setShape}, {@link Window#setOpacity} and {@link
     * Window#setBackground} for details
     *
     * @param  undecorated {@code true} if no frame decorations are to be
     *         enabled; {@code false} if frame decorations are to be enabled
     *
     * @throws IllegalComponentStateException if the frame is displayable
     * @throws IllegalComponentStateException if {@code undecorated} is
     *      {@code false}, and this frame does not have the default shape
     * @throws IllegalComponentStateException if {@code undecorated} is
     *      {@code false}, and this frame opacity is less than {@code 1.0f}
     * @throws IllegalComponentStateException if {@code undecorated} is
     *      {@code false}, and the alpha value of this frame background
     *      color is less than {@code 1.0f}
     *
     * @see    #isUndecorated
     * @see    Component#isDisplayable
     * @see    Window#getShape
     * @see    Window#getOpacity
     * @see    Window#getBackground
     * @see    javax.swing.JFrame#setDefaultLookAndFeelDecorated(boolean)
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public Rectangle getMaximizedBounds() {

    /**
     * Gets maximized bounds for this frame.
     * Some fields may contain <code>Integer.MAX_VALUE</code> to indicate
     * that system supplied values for this field must be used.
     *
     * @return  maximized bounds for this frame;  may be <code>null</code>
     * @see     #setMaximizedBounds(Rectangle)
     * @since   1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setMaximizedBounds(Rectangle bounds) {

    /**
     * Sets the maximized bounds for this frame.
     * <p>
     * When a frame is in maximized state the system supplies some
     * defaults bounds.  This method allows some or all of those
     * system supplied values to be overridden.
     * <p>
     * If <code>bounds</code> is <code>null</code>, accept bounds
     * supplied by the system.  If non-<code>null</code> you can
     * override some of the system supplied values while accepting
     * others by setting those fields you want to accept from system
     * to <code>Integer.MAX_VALUE</code>.
     * <p>
     * Note, the given maximized bounds are used as a hint for the native
     * system, because the underlying platform may not support setting the
     * location and/or size of the maximized windows.  If that is the case, the
     * provided values do not affect the appearance of the frame in the
     * maximized state.
     *
     * @param bounds  bounds for the maximized state
     * @see #getMaximizedBounds()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public int getExtendedState() {

    /**
     * Gets the state of this frame. The state is
     * represented as a bitwise mask.
     * <ul>
     * <li><code>NORMAL</code>
     * <br>Indicates that no state bits are set.
     * <li><code>ICONIFIED</code>
     * <li><code>MAXIMIZED_HORIZ</code>
     * <li><code>MAXIMIZED_VERT</code>
     * <li><code>MAXIMIZED_BOTH</code>
     * <br>Concatenates <code>MAXIMIZED_HORIZ</code>
     * and <code>MAXIMIZED_VERT</code>.
     * </ul>
     *
     * @return  a bitwise mask of frame state constants
     * @see     #setExtendedState(int)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public synchronized int getState() {

    /**
     * Gets the state of this frame (obsolete).
     * <p>
     * In older versions of JDK a frame state could only be NORMAL or
     * ICONIFIED.  Since JDK 1.4 set of supported frame states is
     * expanded and frame state is represented as a bitwise mask.
     * <p>
     * For compatibility with old programs this method still returns
     * <code>Frame.NORMAL</code> and <code>Frame.ICONIFIED</code> but
     * it only reports the iconic state of the frame, other aspects of
     * frame state are not reported by this method.
     *
     * @return  <code>Frame.NORMAL</code> or <code>Frame.ICONIFIED</code>.
     * @see     #setState(int)
     * @see     #getExtendedState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setExtendedState(int state) {

    /**
     * Sets the state of this frame. The state is
     * represented as a bitwise mask.
     * <ul>
     * <li><code>NORMAL</code>
     * <br>Indicates that no state bits are set.
     * <li><code>ICONIFIED</code>
     * <li><code>MAXIMIZED_HORIZ</code>
     * <li><code>MAXIMIZED_VERT</code>
     * <li><code>MAXIMIZED_BOTH</code>
     * <br>Concatenates <code>MAXIMIZED_HORIZ</code>
     * and <code>MAXIMIZED_VERT</code>.
     * </ul>
     * <p>Note that if the state is not supported on a
     * given platform, neither the state nor the return
     * value of the {@link #getExtendedState} method will
     * be changed. The application may determine whether
     * a specific state is supported via the {@link
     * java.awt.Toolkit#isFrameStateSupported} method.
     * <p><b>If the frame is currently visible on the
     * screen</b> (the {@link #isShowing} method returns
     * {@code true}), the developer should examine the
     * return value of the {@link
     * java.awt.event.WindowEvent#getNewState} method of
     * the {@code WindowEvent} received through the
     * {@link java.awt.event.WindowStateListener} to
     * determine that the state has actually been
     * changed.
     * <p><b>If the frame is not visible on the
     * screen</b>, the events may or may not be
     * generated.  In this case the developer may assume
     * that the state changes immediately after this
     * method returns.  Later, when the {@code
     * setVisible(true)} method is invoked, the frame
     * will attempt to apply this state. Receiving any
     * {@link
     * java.awt.event.WindowEvent#WINDOW_STATE_CHANGED}
     * events is not guaranteed in this case also.
     *
     * @param state a bitwise mask of frame state constants
     * @since   1.4
     * @see java.awt.Window#addWindowStateListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public synchronized void setState(int state) {

    /**
     * Sets the state of this frame (obsolete).
     * <p>
     * In older versions of JDK a frame state could only be NORMAL or
     * ICONIFIED.  Since JDK 1.4 set of supported frame states is
     * expanded and frame state is represented as a bitwise mask.
     * <p>
     * For compatibility with applications developed
     * earlier this method still accepts
     * {@code Frame.NORMAL} and
     * {@code Frame.ICONIFIED} only.  The iconic
     * state of the frame is only changed, other aspects
     * of frame state are not affected by this method. If
     * the state passed to this method is neither {@code
     * Frame.NORMAL} nor {@code Frame.ICONIFIED} the
     * method performs no actions at all.
     * <p>Note that if the state is not supported on a
     * given platform, neither the state nor the return
     * value of the {@link #getState} method will be
     * changed. The application may determine whether a
     * specific state is supported via the {@link
     * java.awt.Toolkit#isFrameStateSupported} method.
     * <p><b>If the frame is currently visible on the
     * screen</b> (the {@link #isShowing} method returns
     * {@code true}), the developer should examine the
     * return value of the  {@link
     * java.awt.event.WindowEvent#getNewState} method of
     * the {@code WindowEvent} received through the
     * {@link java.awt.event.WindowStateListener} to
     * determine that the state has actually been
     * changed.
     * <p><b>If the frame is not visible on the
     * screen</b>, the events may or may not be
     * generated.  In this case the developer may assume
     * that the state changes immediately after this
     * method returns.  Later, when the {@code
     * setVisible(true)} method is invoked, the frame
     * will attempt to apply this state. Receiving any
     * {@link
     * java.awt.event.WindowEvent#WINDOW_STATE_CHANGED}
     * events is not guaranteed in this case also.
     *
     * @param state either <code>Frame.NORMAL</code> or
     *     <code>Frame.ICONIFIED</code>.
     * @see #setExtendedState(int)
     * @see java.awt.Window#addWindowStateListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setResizable(boolean resizable) {

    /**
     * Sets whether this frame is resizable by the user.
     * @param    resizable   <code>true</code> if this frame is resizable;
     *                       <code>false</code> otherwise.
     * @see      java.awt.Frame#isResizable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public boolean isResizable() {

    /**
     * Indicates whether this frame is resizable by the user.
     * By default, all frames are initially resizable.
     * @return    <code>true</code> if the user can resize this frame;
     *                        <code>false</code> otherwise.
     * @see       java.awt.Frame#setResizable(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setMenuBar(MenuBar mb) {

    /**
     * Sets the menu bar for this frame to the specified menu bar.
     * @param     mb the menu bar being set.
     *            If this parameter is <code>null</code> then any
     *            existing menu bar on this frame is removed.
     * @see       #getMenuBar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public MenuBar getMenuBar() {

    /**
     * Gets the menu bar for this frame.
     * @return    the menu bar for this frame, or <code>null</code>
     *                   if this frame doesn't have a menu bar.
     * @see       #setMenuBar(MenuBar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setIconImage(Image image) {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public Image getIconImage() {

    /**
     * Returns the image to be displayed as the icon for this frame.
     * <p>
     * This method is obsolete and kept for backward compatibility
     * only. Use {@link Window#getIconImages Window.getIconImages()} instead.
     * <p>
     * If a list of several images was specified as a Window's icon,
     * this method will return the first item of the list.
     *
     * @return    the icon image for this frame, or <code>null</code>
     *                    if this frame doesn't have an icon image.
     * @see       #setIconImage(Image)
     * @see       Window#getIconImages()
     * @see       Window#setIconImages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setTitle(String title) {

    /**
     * Sets the title for this frame to the specified string.
     * @param title the title to be displayed in the frame's border.
     *              A <code>null</code> value
     *              is treated as an empty string, "".
     * @see      #getTitle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public String getTitle() {

    /**
     * Gets the title of the frame.  The title is displayed in the
     * frame's border.
     * @return    the title of this frame, or an empty string ("")
     *                if this frame doesn't have a title.
     * @see       #setTitle(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void addNotify() {

    /**
     * Makes this Frame displayable by connecting it to
     * a native screen resource.  Making a frame displayable will
     * cause any of its children to be made displayable.
     * This method is called internally by the toolkit and should
     * not be called directly by programs.
     * @see Component#isDisplayable
     * @see #removeNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public Frame(String title, GraphicsConfiguration gc) {

    /**
     * Constructs a new, initially invisible <code>Frame</code> object
     * with the specified title and a
     * <code>GraphicsConfiguration</code>.
     * @param title the title to be displayed in the frame's border.
     *              A <code>null</code> value
     *              is treated as an empty string, "".
     * @param gc the <code>GraphicsConfiguration</code>
     * of the target screen device.  If <code>gc</code> is
     * <code>null</code>, the system default
     * <code>GraphicsConfiguration</code> is assumed.
     * @exception IllegalArgumentException if <code>gc</code>
     * is not from a screen device.
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless()
     * @see java.awt.Component#setSize
     * @see java.awt.Component#setVisible(boolean)
     * @see java.awt.GraphicsConfiguration#getBounds
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public Frame(String title) throws HeadlessException {

    /**
     * Constructs a new, initially invisible <code>Frame</code> object
     * with the specified title.
     * @param title the title to be displayed in the frame's border.
     *              A <code>null</code> value
     *              is treated as an empty string, "".
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless()
     * @see java.awt.Component#setSize
     * @see java.awt.Component#setVisible(boolean)
     * @see java.awt.GraphicsConfiguration#getBounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public Frame(GraphicsConfiguration gc) {

    /**
     * Constructs a new, initially invisible {@code Frame} with the
     * specified {@code GraphicsConfiguration}.
     *
     * @param gc the <code>GraphicsConfiguration</code>
     * of the target screen device. If <code>gc</code>
     * is <code>null</code>, the system default
     * <code>GraphicsConfiguration</code> is assumed.
     * @exception IllegalArgumentException if
     * <code>gc</code> is not from a screen device.
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless()
     * @since     1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public Frame() throws HeadlessException {

    /**
     * Constructs a new instance of <code>Frame</code> that is
     * initially invisible.  The title of the <code>Frame</code>
     * is empty.
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless()
     * @see Component#setSize
     * @see Component#setVisible(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    boolean     mbManagement = false;   /* used only by the Motif impl. */

    /**
     * <code>mbManagement</code> is only used by the Motif implementation.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    boolean undecorated = false;

    /**
     * This field indicates whether the frame is undecorated.
     * This property can only be changed while the frame is not displayable.
     * <code>undecorated</code> will be true if the frame is
     * undecorated, otherwise it will be false.
     *
     * @serial
     * @see #setUndecorated(boolean)
     * @see #isUndecorated()
     * @see Component#isDisplayable()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    boolean     resizable = true;

    /**
     * This field indicates whether the frame is resizable.
     * This property can be changed at any time.
     * <code>resizable</code> will be true if the frame is
     * resizable, otherwise it will be false.
     *
     * @serial
     * @see #isResizable()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    MenuBar     menuBar;

    /**
     * The frames menubar.  If <code>menuBar</code> = null
     * the frame will not have a menubar.
     *
     * @serial
     * @see #getMenuBar
     * @see #setMenuBar(MenuBar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    String      title = "Untitled";

    /**
     * This is the title of the frame.  It can be changed
     * at any time.  <code>title</code> can be null and if
     * this is the case the <code>title</code> = "".
     *
     * @serial
     * @see #getTitle
     * @see #setTitle(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    Rectangle maximizedBounds;

    /**
     * Maximized bounds for this frame.
     * @see     #setMaximizedBounds(Rectangle)
     * @see     #getMaximizedBounds
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public static final int MAXIMIZED_BOTH = MAXIMIZED_VERT | MAXIMIZED_HORIZ;

    /**
     * This state bit mask indicates that frame is fully maximized
     * (that is both horizontally and vertically).  It is just a
     * convenience alias for
     * <code>MAXIMIZED_VERT&nbsp;|&nbsp;MAXIMIZED_HORIZ</code>.
     *
     * <p>Note that the correct test for frame being fully maximized is
     * <pre>
     *     (state &amp; Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH
     * </pre>
     *
     * <p>To test is frame is maximized in <em>some</em> direction use
     * <pre>
     *     (state &amp; Frame.MAXIMIZED_BOTH) != 0
     * </pre>
     *
     * @see #setExtendedState(int)
     * @see #getExtendedState
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public static final int MAXIMIZED_VERT = 4;

    /**
     * This state bit indicates that frame is maximized in the
     * vertical direction.
     * @see #setExtendedState(int)
     * @see #getExtendedState
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public static final int MAXIMIZED_HORIZ = 2;

    /**
     * This state bit indicates that frame is maximized in the
     * horizontal direction.
     * @see #setExtendedState(int)
     * @see #getExtendedState
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public static final int ICONIFIED = 1;

    /**
     * This state bit indicates that frame is iconified.
     * @see #setExtendedState(int)
     * @see #getExtendedState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public static final int NORMAL = 0;

    /**
     * Frame is in the "normal" state.  This symbolic constant names a
     * frame state with all state bits cleared.
     * @see #setExtendedState(int)
     * @see #getExtendedState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.MOVE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.HAND_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.E_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.W_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.S_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.N_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.NE_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.NW_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.SE_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.SW_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.WAIT_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.TEXT_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.CROSSHAIR_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.DEFAULT_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
public class Frame extends Window implements MenuContainer {

/**
 * A <code>Frame</code> is a top-level window with a title and a border.
 * <p>
 * The size of the frame includes any area designated for the
 * border.  The dimensions of the border area may be obtained
 * using the <code>getInsets</code> method, however, since
 * these dimensions are platform-dependent, a valid insets
 * value cannot be obtained until the frame is made displayable
 * by either calling <code>pack</code> or <code>show</code>.
 * Since the border area is included in the overall size of the
 * frame, the border effectively obscures a portion of the frame,
 * constraining the area available for rendering and/or displaying
 * subcomponents to the rectangle which has an upper-left corner
 * location of <code>(insets.left, insets.top)</code>, and has a size of
 * <code>width - (insets.left + insets.right)</code> by
 * <code>height - (insets.top + insets.bottom)</code>.
 * <p>
 * The default layout for a frame is <code>BorderLayout</code>.
 * <p>
 * A frame may have its native decorations (i.e. <code>Frame</code>
 * and <code>Titlebar</code>) turned off
 * with <code>setUndecorated</code>. This can only be done while the frame
 * is not {@link Component#isDisplayable() displayable}.
 * <p>
 * In a multi-screen environment, you can create a <code>Frame</code>
 * on a different screen device by constructing the <code>Frame</code>
 * with {@link #Frame(GraphicsConfiguration)} or
 * {@link #Frame(String title, GraphicsConfiguration)}.  The
 * <code>GraphicsConfiguration</code> object is one of the
 * <code>GraphicsConfiguration</code> objects of the target screen
 * device.
 * <p>
 * In a virtual device multi-screen environment in which the desktop
 * area could span multiple physical screen devices, the bounds of all
 * configurations are relative to the virtual-coordinate system.  The
 * origin of the virtual-coordinate system is at the upper left-hand
 * corner of the primary physical screen.  Depending on the location
 * of the primary screen in the virtual device, negative coordinates
 * are possible, as shown in the following figure.
 * <p>
 * <img src="doc-files/MultiScreen.gif"
 * alt="Diagram of virtual device encompassing three physical screens and one primary physical screen. The primary physical screen
 * shows (0,0) coords while a different physical screen shows (-80,-100) coords."
 * style="float:center; margin: 7px 10px;">
 * <p>
 * In such an environment, when calling <code>setLocation</code>,
 * you must pass a virtual coordinate to this method.  Similarly,
 * calling <code>getLocationOnScreen</code> on a <code>Frame</code>
 * returns virtual device coordinates.  Call the <code>getBounds</code>
 * method of a <code>GraphicsConfiguration</code> to find its origin in
 * the virtual coordinate system.
 * <p>
 * The following code sets the
 * location of the <code>Frame</code> at (10, 10) relative
 * to the origin of the physical screen of the corresponding
 * <code>GraphicsConfiguration</code>.  If the bounds of the
 * <code>GraphicsConfiguration</code> is not taken into account, the
 * <code>Frame</code> location would be set at (10, 10) relative to the
 * virtual-coordinate system and would appear on the primary physical
 * screen, which might be different from the physical screen of the
 * specified <code>GraphicsConfiguration</code>.
 *
 * <pre>
 *      Frame f = new Frame(GraphicsConfiguration gc);
 *      Rectangle bounds = gc.getBounds();
 *      f.setLocation(10 + bounds.x, 10 + bounds.y);
 * </pre>
 *
 * <p>
 * Frames are capable of generating the following types of
 * <code>WindowEvent</code>s:
 * <ul>
 * <li><code>WINDOW_OPENED</code>
 * <li><code>WINDOW_CLOSING</code>:
 *     <br>If the program doesn't
 *     explicitly hide or dispose the window while processing
 *     this event, the window close operation is canceled.
 * <li><code>WINDOW_CLOSED</code>
 * <li><code>WINDOW_ICONIFIED</code>
 * <li><code>WINDOW_DEICONIFIED</code>
 * <li><code>WINDOW_ACTIVATED</code>
 * <li><code>WINDOW_DEACTIVATED</code>
 * <li><code>WINDOW_GAINED_FOCUS</code>
 * <li><code>WINDOW_LOST_FOCUS</code>
 * <li><code>WINDOW_STATE_CHANGED</code>
 * </ul>
 *
 * @author      Sami Shaio
 * @see WindowEvent
 * @see Window#addWindowListener
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Get the state of this object.
         *
         * @return an instance of AccessibleStateSet containing the current
         * state set of the object
         * @see AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    protected class AccessibleAWTFrame extends AccessibleAWTWindow

    /**
     * This class implements accessibility support for the
     * <code>Frame</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to frame user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this Frame.
     * For frames, the AccessibleContext takes the form of an
     * AccessibleAWTFrame.
     * A new AccessibleAWTFrame instance is created if necessary.
     *
     * @return an AccessibleAWTFrame that serves as the
     *         AccessibleContext of this Frame
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the <code>ObjectInputStream</code>.  Tries
     * to read an icon <code>Image</code>, which is optional
     * data available as of 1.4.  If an icon <code>Image</code>
     * is not available, but anything other than an EOF
     * is detected, an <code>OptionalDataException</code>
     * will be thrown.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @exception java.io.OptionalDataException if an icon <code>Image</code>
     *   is not available, but anything other than an EOF
     *   is detected
     * @exception HeadlessException if
     *   <code>GraphicsEnvironment.isHeadless</code> returns
     *   <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless()
     * @see java.awt.Image
     * @see #getIconImage
     * @see #setIconImage(Image)
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes default serializable fields to stream.  Writes
     * an optional serializable icon <code>Image</code>, which is
     * available as of 1.4.
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @serialData an optional icon <code>Image</code>
     * @see java.awt.Image
     * @see #getIconImage
     * @see #setIconImage(Image)
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    private int frameSerializedDataVersion = 1;

    /**
     * <code>Frame</code>'s Serialized Data Version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public static Frame[] getFrames() {

    /**
     * Returns an array of all {@code Frame}s created by this application.
     * If called from an applet, the array includes only the {@code Frame}s
     * accessible by that applet.
     * <p>
     * <b>Warning:</b> this method may return system created frames, such
     * as a shared, hidden frame which is used by Swing. Applications
     * should not assume the existence of these frames, nor should an
     * application assume anything about these frames such as component
     * positions, <code>LayoutManager</code>s or serialization.
     * <p>
     * <b>Note</b>: To obtain a list of all ownerless windows, including
     * ownerless {@code Dialog}s (introduced in release 1.6), use {@link
     * Window#getOwnerlessWindows Window.getOwnerlessWindows}.
     *
     * @see Window#getWindows()
     * @see Window#getOwnerlessWindows
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>Component.getCursor()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>Component.setCursor(Cursor)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>Frame</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return the parameter string of this frame
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void removeNotify() {

    /**
     * Makes this Frame undisplayable by removing its connection
     * to its native screen resource. Making a Frame undisplayable
     * will cause any of its children to be made undisplayable.
     * This method is called by the toolkit internally and should
     * not be called directly by programs.
     * @see Component#isDisplayable
     * @see #addNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void remove(MenuComponent m) {

    /**
     * Removes the specified menu bar from this frame.
     * @param    m   the menu component to remove.
     *           If <code>m</code> is <code>null</code>, then
     *           no action is taken
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public boolean isUndecorated() {

    /**
     * Indicates whether this frame is undecorated.
     * By default, all frames are initially decorated.
     * @return    <code>true</code> if frame is undecorated;
     *                        <code>false</code> otherwise.
     * @see       java.awt.Frame#setUndecorated(boolean)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setUndecorated(boolean undecorated) {

    /**
     * Disables or enables decorations for this frame.
     * <p>
     * This method can only be called while the frame is not displayable. To
     * make this frame decorated, it must be opaque and have the default shape,
     * otherwise the {@code IllegalComponentStateException} will be thrown.
     * Refer to {@link Window#setShape}, {@link Window#setOpacity} and {@link
     * Window#setBackground} for details
     *
     * @param  undecorated {@code true} if no frame decorations are to be
     *         enabled; {@code false} if frame decorations are to be enabled
     *
     * @throws IllegalComponentStateException if the frame is displayable
     * @throws IllegalComponentStateException if {@code undecorated} is
     *      {@code false}, and this frame does not have the default shape
     * @throws IllegalComponentStateException if {@code undecorated} is
     *      {@code false}, and this frame opacity is less than {@code 1.0f}
     * @throws IllegalComponentStateException if {@code undecorated} is
     *      {@code false}, and the alpha value of this frame background
     *      color is less than {@code 1.0f}
     *
     * @see    #isUndecorated
     * @see    Component#isDisplayable
     * @see    Window#getShape
     * @see    Window#getOpacity
     * @see    Window#getBackground
     * @see    javax.swing.JFrame#setDefaultLookAndFeelDecorated(boolean)
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public Rectangle getMaximizedBounds() {

    /**
     * Gets maximized bounds for this frame.
     * Some fields may contain <code>Integer.MAX_VALUE</code> to indicate
     * that system supplied values for this field must be used.
     *
     * @return  maximized bounds for this frame;  may be <code>null</code>
     * @see     #setMaximizedBounds(Rectangle)
     * @since   1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setMaximizedBounds(Rectangle bounds) {

    /**
     * Sets the maximized bounds for this frame.
     * <p>
     * When a frame is in maximized state the system supplies some
     * defaults bounds.  This method allows some or all of those
     * system supplied values to be overridden.
     * <p>
     * If <code>bounds</code> is <code>null</code>, accept bounds
     * supplied by the system.  If non-<code>null</code> you can
     * override some of the system supplied values while accepting
     * others by setting those fields you want to accept from system
     * to <code>Integer.MAX_VALUE</code>.
     * <p>
     * Note, the given maximized bounds are used as a hint for the native
     * system, because the underlying platform may not support setting the
     * location and/or size of the maximized windows.  If that is the case, the
     * provided values do not affect the appearance of the frame in the
     * maximized state.
     *
     * @param bounds  bounds for the maximized state
     * @see #getMaximizedBounds()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public int getExtendedState() {

    /**
     * Gets the state of this frame. The state is
     * represented as a bitwise mask.
     * <ul>
     * <li><code>NORMAL</code>
     * <br>Indicates that no state bits are set.
     * <li><code>ICONIFIED</code>
     * <li><code>MAXIMIZED_HORIZ</code>
     * <li><code>MAXIMIZED_VERT</code>
     * <li><code>MAXIMIZED_BOTH</code>
     * <br>Concatenates <code>MAXIMIZED_HORIZ</code>
     * and <code>MAXIMIZED_VERT</code>.
     * </ul>
     *
     * @return  a bitwise mask of frame state constants
     * @see     #setExtendedState(int)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public synchronized int getState() {

    /**
     * Gets the state of this frame (obsolete).
     * <p>
     * In older versions of JDK a frame state could only be NORMAL or
     * ICONIFIED.  Since JDK 1.4 set of supported frame states is
     * expanded and frame state is represented as a bitwise mask.
     * <p>
     * For compatibility with old programs this method still returns
     * <code>Frame.NORMAL</code> and <code>Frame.ICONIFIED</code> but
     * it only reports the iconic state of the frame, other aspects of
     * frame state are not reported by this method.
     *
     * @return  <code>Frame.NORMAL</code> or <code>Frame.ICONIFIED</code>.
     * @see     #setState(int)
     * @see     #getExtendedState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setExtendedState(int state) {

    /**
     * Sets the state of this frame. The state is
     * represented as a bitwise mask.
     * <ul>
     * <li><code>NORMAL</code>
     * <br>Indicates that no state bits are set.
     * <li><code>ICONIFIED</code>
     * <li><code>MAXIMIZED_HORIZ</code>
     * <li><code>MAXIMIZED_VERT</code>
     * <li><code>MAXIMIZED_BOTH</code>
     * <br>Concatenates <code>MAXIMIZED_HORIZ</code>
     * and <code>MAXIMIZED_VERT</code>.
     * </ul>
     * <p>Note that if the state is not supported on a
     * given platform, neither the state nor the return
     * value of the {@link #getExtendedState} method will
     * be changed. The application may determine whether
     * a specific state is supported via the {@link
     * java.awt.Toolkit#isFrameStateSupported} method.
     * <p><b>If the frame is currently visible on the
     * screen</b> (the {@link #isShowing} method returns
     * {@code true}), the developer should examine the
     * return value of the {@link
     * java.awt.event.WindowEvent#getNewState} method of
     * the {@code WindowEvent} received through the
     * {@link java.awt.event.WindowStateListener} to
     * determine that the state has actually been
     * changed.
     * <p><b>If the frame is not visible on the
     * screen</b>, the events may or may not be
     * generated.  In this case the developer may assume
     * that the state changes immediately after this
     * method returns.  Later, when the {@code
     * setVisible(true)} method is invoked, the frame
     * will attempt to apply this state. Receiving any
     * {@link
     * java.awt.event.WindowEvent#WINDOW_STATE_CHANGED}
     * events is not guaranteed in this case also.
     *
     * @param state a bitwise mask of frame state constants
     * @since   1.4
     * @see java.awt.Window#addWindowStateListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public synchronized void setState(int state) {

    /**
     * Sets the state of this frame (obsolete).
     * <p>
     * In older versions of JDK a frame state could only be NORMAL or
     * ICONIFIED.  Since JDK 1.4 set of supported frame states is
     * expanded and frame state is represented as a bitwise mask.
     * <p>
     * For compatibility with applications developed
     * earlier this method still accepts
     * {@code Frame.NORMAL} and
     * {@code Frame.ICONIFIED} only.  The iconic
     * state of the frame is only changed, other aspects
     * of frame state are not affected by this method. If
     * the state passed to this method is neither {@code
     * Frame.NORMAL} nor {@code Frame.ICONIFIED} the
     * method performs no actions at all.
     * <p>Note that if the state is not supported on a
     * given platform, neither the state nor the return
     * value of the {@link #getState} method will be
     * changed. The application may determine whether a
     * specific state is supported via the {@link
     * java.awt.Toolkit#isFrameStateSupported} method.
     * <p><b>If the frame is currently visible on the
     * screen</b> (the {@link #isShowing} method returns
     * {@code true}), the developer should examine the
     * return value of the  {@link
     * java.awt.event.WindowEvent#getNewState} method of
     * the {@code WindowEvent} received through the
     * {@link java.awt.event.WindowStateListener} to
     * determine that the state has actually been
     * changed.
     * <p><b>If the frame is not visible on the
     * screen</b>, the events may or may not be
     * generated.  In this case the developer may assume
     * that the state changes immediately after this
     * method returns.  Later, when the {@code
     * setVisible(true)} method is invoked, the frame
     * will attempt to apply this state. Receiving any
     * {@link
     * java.awt.event.WindowEvent#WINDOW_STATE_CHANGED}
     * events is not guaranteed in this case also.
     *
     * @param state either <code>Frame.NORMAL</code> or
     *     <code>Frame.ICONIFIED</code>.
     * @see #setExtendedState(int)
     * @see java.awt.Window#addWindowStateListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setResizable(boolean resizable) {

    /**
     * Sets whether this frame is resizable by the user.
     * @param    resizable   <code>true</code> if this frame is resizable;
     *                       <code>false</code> otherwise.
     * @see      java.awt.Frame#isResizable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public boolean isResizable() {

    /**
     * Indicates whether this frame is resizable by the user.
     * By default, all frames are initially resizable.
     * @return    <code>true</code> if the user can resize this frame;
     *                        <code>false</code> otherwise.
     * @see       java.awt.Frame#setResizable(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setMenuBar(MenuBar mb) {

    /**
     * Sets the menu bar for this frame to the specified menu bar.
     * @param     mb the menu bar being set.
     *            If this parameter is <code>null</code> then any
     *            existing menu bar on this frame is removed.
     * @see       #getMenuBar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public MenuBar getMenuBar() {

    /**
     * Gets the menu bar for this frame.
     * @return    the menu bar for this frame, or <code>null</code>
     *                   if this frame doesn't have a menu bar.
     * @see       #setMenuBar(MenuBar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setIconImage(Image image) {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public Image getIconImage() {

    /**
     * Returns the image to be displayed as the icon for this frame.
     * <p>
     * This method is obsolete and kept for backward compatibility
     * only. Use {@link Window#getIconImages Window.getIconImages()} instead.
     * <p>
     * If a list of several images was specified as a Window's icon,
     * this method will return the first item of the list.
     *
     * @return    the icon image for this frame, or <code>null</code>
     *                    if this frame doesn't have an icon image.
     * @see       #setIconImage(Image)
     * @see       Window#getIconImages()
     * @see       Window#setIconImages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void setTitle(String title) {

    /**
     * Sets the title for this frame to the specified string.
     * @param title the title to be displayed in the frame's border.
     *              A <code>null</code> value
     *              is treated as an empty string, "".
     * @see      #getTitle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public String getTitle() {

    /**
     * Gets the title of the frame.  The title is displayed in the
     * frame's border.
     * @return    the title of this frame, or an empty string ("")
     *                if this frame doesn't have a title.
     * @see       #setTitle(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public void addNotify() {

    /**
     * Makes this Frame displayable by connecting it to
     * a native screen resource.  Making a frame displayable will
     * cause any of its children to be made displayable.
     * This method is called internally by the toolkit and should
     * not be called directly by programs.
     * @see Component#isDisplayable
     * @see #removeNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public Frame(String title, GraphicsConfiguration gc) {

    /**
     * Constructs a new, initially invisible <code>Frame</code> object
     * with the specified title and a
     * <code>GraphicsConfiguration</code>.
     * @param title the title to be displayed in the frame's border.
     *              A <code>null</code> value
     *              is treated as an empty string, "".
     * @param gc the <code>GraphicsConfiguration</code>
     * of the target screen device.  If <code>gc</code> is
     * <code>null</code>, the system default
     * <code>GraphicsConfiguration</code> is assumed.
     * @exception IllegalArgumentException if <code>gc</code>
     * is not from a screen device.
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless()
     * @see java.awt.Component#setSize
     * @see java.awt.Component#setVisible(boolean)
     * @see java.awt.GraphicsConfiguration#getBounds
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public Frame(String title) throws HeadlessException {

    /**
     * Constructs a new, initially invisible <code>Frame</code> object
     * with the specified title.
     * @param title the title to be displayed in the frame's border.
     *              A <code>null</code> value
     *              is treated as an empty string, "".
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless()
     * @see java.awt.Component#setSize
     * @see java.awt.Component#setVisible(boolean)
     * @see java.awt.GraphicsConfiguration#getBounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public Frame(GraphicsConfiguration gc) {

    /**
     * Constructs a new, initially invisible {@code Frame} with the
     * specified {@code GraphicsConfiguration}.
     *
     * @param gc the <code>GraphicsConfiguration</code>
     * of the target screen device. If <code>gc</code>
     * is <code>null</code>, the system default
     * <code>GraphicsConfiguration</code> is assumed.
     * @exception IllegalArgumentException if
     * <code>gc</code> is not from a screen device.
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless()
     * @since     1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public Frame() throws HeadlessException {

    /**
     * Constructs a new instance of <code>Frame</code> that is
     * initially invisible.  The title of the <code>Frame</code>
     * is empty.
     * @exception HeadlessException when
     *     <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless()
     * @see Component#setSize
     * @see Component#setVisible(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    boolean     mbManagement = false;   /* used only by the Motif impl. */

    /**
     * <code>mbManagement</code> is only used by the Motif implementation.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    boolean undecorated = false;

    /**
     * This field indicates whether the frame is undecorated.
     * This property can only be changed while the frame is not displayable.
     * <code>undecorated</code> will be true if the frame is
     * undecorated, otherwise it will be false.
     *
     * @serial
     * @see #setUndecorated(boolean)
     * @see #isUndecorated()
     * @see Component#isDisplayable()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    boolean     resizable = true;

    /**
     * This field indicates whether the frame is resizable.
     * This property can be changed at any time.
     * <code>resizable</code> will be true if the frame is
     * resizable, otherwise it will be false.
     *
     * @serial
     * @see #isResizable()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    MenuBar     menuBar;

    /**
     * The frames menubar.  If <code>menuBar</code> = null
     * the frame will not have a menubar.
     *
     * @serial
     * @see #getMenuBar
     * @see #setMenuBar(MenuBar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    String      title = "Untitled";

    /**
     * This is the title of the frame.  It can be changed
     * at any time.  <code>title</code> can be null and if
     * this is the case the <code>title</code> = "".
     *
     * @serial
     * @see #getTitle
     * @see #setTitle(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    Rectangle maximizedBounds;

    /**
     * Maximized bounds for this frame.
     * @see     #setMaximizedBounds(Rectangle)
     * @see     #getMaximizedBounds
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public static final int MAXIMIZED_BOTH = MAXIMIZED_VERT | MAXIMIZED_HORIZ;

    /**
     * This state bit mask indicates that frame is fully maximized
     * (that is both horizontally and vertically).  It is just a
     * convenience alias for
     * <code>MAXIMIZED_VERT&nbsp;|&nbsp;MAXIMIZED_HORIZ</code>.
     *
     * <p>Note that the correct test for frame being fully maximized is
     * <pre>
     *     (state &amp; Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH
     * </pre>
     *
     * <p>To test is frame is maximized in <em>some</em> direction use
     * <pre>
     *     (state &amp; Frame.MAXIMIZED_BOTH) != 0
     * </pre>
     *
     * @see #setExtendedState(int)
     * @see #getExtendedState
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public static final int MAXIMIZED_VERT = 4;

    /**
     * This state bit indicates that frame is maximized in the
     * vertical direction.
     * @see #setExtendedState(int)
     * @see #getExtendedState
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public static final int MAXIMIZED_HORIZ = 2;

    /**
     * This state bit indicates that frame is maximized in the
     * horizontal direction.
     * @see #setExtendedState(int)
     * @see #getExtendedState
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public static final int ICONIFIED = 1;

    /**
     * This state bit indicates that frame is iconified.
     * @see #setExtendedState(int)
     * @see #getExtendedState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    public static final int NORMAL = 0;

    /**
     * Frame is in the "normal" state.  This symbolic constant names a
     * frame state with all state bits cleared.
     * @see #setExtendedState(int)
     * @see #getExtendedState
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.MOVE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.HAND_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.E_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.W_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.S_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.N_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.NE_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.NW_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.SE_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.SW_RESIZE_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.WAIT_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.TEXT_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.CROSSHAIR_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
    @Deprecated

   /**
    * @deprecated   replaced by <code>Cursor.DEFAULT_CURSOR</code>.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Frame.java
public class Frame extends Window implements MenuContainer {

/**
 * A <code>Frame</code> is a top-level window with a title and a border.
 * <p>
 * The size of the frame includes any area designated for the
 * border.  The dimensions of the border area may be obtained
 * using the <code>getInsets</code> method, however, since
 * these dimensions are platform-dependent, a valid insets
 * value cannot be obtained until the frame is made displayable
 * by either calling <code>pack</code> or <code>show</code>.
 * Since the border area is included in the overall size of the
 * frame, the border effectively obscures a portion of the frame,
 * constraining the area available for rendering and/or displaying
 * subcomponents to the rectangle which has an upper-left corner
 * location of <code>(insets.left, insets.top)</code>, and has a size of
 * <code>width - (insets.left + insets.right)</code> by
 * <code>height - (insets.top + insets.bottom)</code>.
 * <p>
 * The default layout for a frame is <code>BorderLayout</code>.
 * <p>
 * A frame may have its native decorations (i.e. <code>Frame</code>
 * and <code>Titlebar</code>) turned off
 * with <code>setUndecorated</code>. This can only be done while the frame
 * is not {@link Component#isDisplayable() displayable}.
 * <p>
 * In a multi-screen environment, you can create a <code>Frame</code>
 * on a different screen device by constructing the <code>Frame</code>
 * with {@link #Frame(GraphicsConfiguration)} or
 * {@link #Frame(String title, GraphicsConfiguration)}.  The
 * <code>GraphicsConfiguration</code> object is one of the
 * <code>GraphicsConfiguration</code> objects of the target screen
 * device.
 * <p>
 * In a virtual device multi-screen environment in which the desktop
 * area could span multiple physical screen devices, the bounds of all
 * configurations are relative to the virtual-coordinate system.  The
 * origin of the virtual-coordinate system is at the upper left-hand
 * corner of the primary physical screen.  Depending on the location
 * of the primary screen in the virtual device, negative coordinates
 * are possible, as shown in the following figure.
 * <p>
 * <img src="doc-files/MultiScreen.gif"
 * alt="Diagram of virtual device encompassing three physical screens and one primary physical screen. The primary physical screen
 * shows (0,0) coords while a different physical screen shows (-80,-100) coords."
 * style="float:center; margin: 7px 10px;">
 * <p>
 * In such an environment, when calling <code>setLocation</code>,
 * you must pass a virtual coordinate to this method.  Similarly,
 * calling <code>getLocationOnScreen</code> on a <code>Frame</code>
 * returns virtual device coordinates.  Call the <code>getBounds</code>
 * method of a <code>GraphicsConfiguration</code> to find its origin in
 * the virtual coordinate system.
 * <p>
 * The following code sets the
 * location of the <code>Frame</code> at (10, 10) relative
 * to the origin of the physical screen of the corresponding
 * <code>GraphicsConfiguration</code>.  If the bounds of the
 * <code>GraphicsConfiguration</code> is not taken into account, the
 * <code>Frame</code> location would be set at (10, 10) relative to the
 * virtual-coordinate system and would appear on the primary physical
 * screen, which might be different from the physical screen of the
 * specified <code>GraphicsConfiguration</code>.
 *
 * <pre>
 *      Frame f = new Frame(GraphicsConfiguration gc);
 *      Rectangle bounds = gc.getBounds();
 *      f.setLocation(10 + bounds.x, 10 + bounds.y);
 * </pre>
 *
 * <p>
 * Frames are capable of generating the following types of
 * <code>WindowEvent</code>s:
 * <ul>
 * <li><code>WINDOW_OPENED</code>
 * <li><code>WINDOW_CLOSING</code>:
 *     <br>If the program doesn't
 *     explicitly hide or dispose the window while processing
 *     this event, the window close operation is canceled.
 * <li><code>WINDOW_CLOSED</code>
 * <li><code>WINDOW_ICONIFIED</code>
 * <li><code>WINDOW_DEICONIFIED</code>
 * <li><code>WINDOW_ACTIVATED</code>
 * <li><code>WINDOW_DEACTIVATED</code>
 * <li><code>WINDOW_GAINED_FOCUS</code>
 * <li><code>WINDOW_LOST_FOCUS</code>
 * <li><code>WINDOW_STATE_CHANGED</code>
 * </ul>
 *
 * @author      Sami Shaio
 * @see WindowEvent
 * @see Window#addWindowListener
 * @since       JDK1.0
 */
