_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
class FocusManager implements java.io.Serializable {

/**
 * This class is no longer used, but is maintained for Serialization
 * backward-compatibility.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private Point2D calculateSecurityWarningPosition(double x, double y,
            double w, double h)

    /**
     * Calculate the position of the security warning.
     *
     * This method gets the window location/size as reported by the native
     * system since the locally cached values may represent outdated data.
     *
     * The method is used from the native code, or via AWTAccessor.
     *
     * NOTE: this method is invoked on the toolkit thread, and therefore is not
     * supposed to become public/user-overridable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private static double limit(double value, double min, double max) {

    /**
     * Limit the given double value with the given range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * Applies the shape to the component
     * @param shape Shape to be applied to the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * {@inheritDoc}
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * Indicates if the window is currently opaque.
     * <p>
     * The method returns {@code false} if the background color of the window
     * is not {@code null} and the alpha component of the color is less than
     * {@code 1.0f}. The method returns {@code true} otherwise.
     *
     * @return {@code true} if the window is opaque, {@code false} otherwise
     *
     * @see Window#getBackground
     * @see Window#setBackground(Color)
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * Sets the background color of this window.
     * <p>
     * If the windowing system supports the {@link
     * GraphicsDevice.WindowTranslucency#PERPIXEL_TRANSLUCENT PERPIXEL_TRANSLUCENT}
     * translucency, the alpha component of the given background color
     * may effect the mode of operation for this window: it indicates whether
     * this window must be opaque (alpha equals {@code 1.0f}) or per-pixel translucent
     * (alpha is less than {@code 1.0f}). If the given background color is
     * {@code null}, the window is considered completely opaque.
     * <p>
     * All the following conditions must be met to enable the per-pixel
     * transparency mode for this window:
     * <ul>
     * <li>The {@link GraphicsDevice.WindowTranslucency#PERPIXEL_TRANSLUCENT
     * PERPIXEL_TRANSLUCENT} translucency must be supported by the graphics
     * device where this window is located
     * <li>The window must be undecorated (see {@link Frame#setUndecorated}
     * and {@link Dialog#setUndecorated})
     * <li>The window must not be in full-screen mode (see {@link
     * GraphicsDevice#setFullScreenWindow(Window)})
     * </ul>
     * <p>
     * If the alpha component of the requested background color is less than
     * {@code 1.0f}, and any of the above conditions are not met, the background
     * color of this window will not change, the alpha component of the given
     * background color will not affect the mode of operation for this window,
     * and either the {@code UnsupportedOperationException} or {@code
     * IllegalComponentStateException} will be thrown.
     * <p>
     * When the window is per-pixel translucent, the drawing sub-system
     * respects the alpha value of each individual pixel. If a pixel gets
     * painted with the alpha color component equal to zero, it becomes
     * visually transparent. If the alpha of the pixel is equal to 1.0f, the
     * pixel is fully opaque. Interim values of the alpha color component make
     * the pixel semi-transparent. In this mode, the background of the window
     * gets painted with the alpha value of the given background color. If the
     * alpha value of the argument of this method is equal to {@code 0}, the
     * background is not painted at all.
     * <p>
     * The actual level of translucency of a given pixel also depends on window
     * opacity (see {@link #setOpacity(float)}), as well as the current shape of
     * this window (see {@link #setShape(Shape)}).
     * <p>
     * Note that painting a pixel with the alpha value of {@code 0} may or may
     * not disable the mouse event handling on this pixel. This is a
     * platform-dependent behavior. To make sure the mouse events do not get
     * dispatched to a particular pixel, the pixel must be excluded from the
     * shape of the window.
     * <p>
     * Enabling the per-pixel translucency mode may change the graphics
     * configuration of this window due to the native platform requirements.
     *
     * @param bgColor the color to become this window's background color.
     *
     * @throws IllegalComponentStateException if the alpha value of the given
     *     background color is less than {@code 1.0f} and the window is decorated
     * @throws IllegalComponentStateException if the alpha value of the given
     *     background color is less than {@code 1.0f} and the window is in
     *     full-screen mode
     * @throws UnsupportedOperationException if the alpha value of the given
     *     background color is less than {@code 1.0f} and {@link
     *     GraphicsDevice.WindowTranslucency#PERPIXEL_TRANSLUCENT
     *     PERPIXEL_TRANSLUCENT} translucency is not supported
     *
     * @see Window#getBackground
     * @see Window#isOpaque
     * @see Window#setOpacity(float)
     * @see Window#setShape(Shape)
     * @see Frame#isUndecorated
     * @see Dialog#isUndecorated
     * @see GraphicsDevice.WindowTranslucency
     * @see GraphicsDevice#isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency)
     * @see GraphicsConfiguration#isTranslucencyCapable()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * Gets the background color of this window.
     * <p>
     * Note that the alpha component of the returned color indicates whether
     * the window is in the non-opaque (per-pixel translucent) mode.
     *
     * @return this component's background color
     *
     * @see Window#setBackground(Color)
     * @see Window#isOpaque
     * @see GraphicsDevice.WindowTranslucency
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setShape(Shape shape) {

    /**
     * Sets the shape of the window.
     * <p>
     * Setting a shape cuts off some parts of the window. Only the parts that
     * belong to the given {@link Shape} remain visible and clickable. If
     * the shape argument is {@code null}, this method restores the default
     * shape, making the window rectangular on most platforms.
     * <p>
     * The following conditions must be met to set a non-null shape:
     * <ul>
     * <li>The {@link GraphicsDevice.WindowTranslucency#PERPIXEL_TRANSPARENT
     * PERPIXEL_TRANSPARENT} translucency must be supported by the
     * underlying system
     * <li>The window must be undecorated (see {@link Frame#setUndecorated}
     * and {@link Dialog#setUndecorated})
     * <li>The window must not be in full-screen mode (see {@link
     * GraphicsDevice#setFullScreenWindow(Window)})
     * </ul>
     * <p>
     * If the requested shape is not {@code null}, and any of the above
     * conditions are not met, the shape of this window will not change,
     * and either the {@code UnsupportedOperationException} or {@code
     * IllegalComponentStateException} will be thrown.
     * <p>
     * The translucency levels of individual pixels may also be effected by the
     * alpha component of their color (see {@link Window#setBackground(Color)}) and the
     * opacity value (see {@link #setOpacity(float)}). See {@link
     * GraphicsDevice.WindowTranslucency} for more details.
     *
     * @param shape the shape to set to the window
     *
     * @throws IllegalComponentStateException if the shape is not {@code
     *     null} and the window is decorated
     * @throws IllegalComponentStateException if the shape is not {@code
     *     null} and the window is in full-screen mode
     * @throws UnsupportedOperationException if the shape is not {@code
     *     null} and {@link GraphicsDevice.WindowTranslucency#PERPIXEL_TRANSPARENT
     *     PERPIXEL_TRANSPARENT} translucency is not supported
     *
     * @see Window#getShape()
     * @see Window#setBackground(Color)
     * @see Window#setOpacity(float)
     * @see Frame#isUndecorated
     * @see Dialog#isUndecorated
     * @see GraphicsDevice.WindowTranslucency
     * @see GraphicsDevice#isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency)
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Shape getShape() {

    /**
     * Returns the shape of the window.
     *
     * The value returned by this method may not be the same as
     * previously set with {@code setShape(shape)}, but it is guaranteed
     * to represent the same shape.
     *
     * @return the shape of the window or {@code null} if no
     *     shape is specified for the window
     *
     * @see Window#setShape(Shape)
     * @see GraphicsDevice.WindowTranslucency
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setOpacity(float opacity) {

    /**
     * Sets the opacity of the window.
     * <p>
     * The opacity value is in the range [0..1]. Note that setting the opacity
     * level of 0 may or may not disable the mouse event handling on this
     * window. This is a platform-dependent behavior.
     * <p>
     * The following conditions must be met in order to set the opacity value
     * less than {@code 1.0f}:
     * <ul>
     * <li>The {@link GraphicsDevice.WindowTranslucency#TRANSLUCENT TRANSLUCENT}
     * translucency must be supported by the underlying system
     * <li>The window must be undecorated (see {@link Frame#setUndecorated}
     * and {@link Dialog#setUndecorated})
     * <li>The window must not be in full-screen mode (see {@link
     * GraphicsDevice#setFullScreenWindow(Window)})
     * </ul>
     * <p>
     * If the requested opacity value is less than {@code 1.0f}, and any of the
     * above conditions are not met, the window opacity will not change,
     * and the {@code IllegalComponentStateException} will be thrown.
     * <p>
     * The translucency levels of individual pixels may also be effected by the
     * alpha component of their color (see {@link Window#setBackground(Color)}) and the
     * current shape of this window (see {@link #setShape(Shape)}).
     *
     * @param opacity the opacity level to set to the window
     *
     * @throws IllegalArgumentException if the opacity is out of the range
     *     [0..1]
     * @throws IllegalComponentStateException if the window is decorated and
     *     the opacity is less than {@code 1.0f}
     * @throws IllegalComponentStateException if the window is in full screen
     *     mode, and the opacity is less than {@code 1.0f}
     * @throws UnsupportedOperationException if the {@code
     *     GraphicsDevice.WindowTranslucency#TRANSLUCENT TRANSLUCENT}
     *     translucency is not supported and the opacity is less than
     *     {@code 1.0f}
     *
     * @see Window#getOpacity
     * @see Window#setBackground(Color)
     * @see Window#setShape(Shape)
     * @see Frame#isUndecorated
     * @see Dialog#isUndecorated
     * @see GraphicsDevice.WindowTranslucency
     * @see GraphicsDevice#isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency)
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public float getOpacity() {

    /**
     * Returns the opacity of the window.
     *
     * @return the opacity of the window
     *
     * @see Window#setOpacity(float)
     * @see GraphicsDevice.WindowTranslucency
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    boolean isRecursivelyVisible() {

    /**
     * Determines whether this component will be displayed on the screen.
     * @return {@code true} if the component and all of its ancestors
     *          until a toplevel window are visible, {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setBounds(Rectangle r) {

    /**
     * {@inheritDoc}
     * <p>
     * The {@code r.width} or {@code r.height} values
     * will be automatically enlarged if either is less than
     * the minimum size as specified by previous call to
     * {@code setMinimumSize}.
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     *
     * @see #getBounds
     * @see #setLocation(int, int)
     * @see #setLocation(Point)
     * @see #setSize(int, int)
     * @see #setSize(Dimension)
     * @see #setMinimumSize
     * @see #setLocationByPlatform
     * @see #isLocationByPlatform
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setBounds(int x, int y, int width, int height) {

    /**
     * {@inheritDoc}
     * <p>
     * The {@code width} or {@code height} values
     * are automatically enlarged if either is less than
     * the minimum size as specified by previous call to
     * {@code setMinimumSize}.
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     *
     * @see #getBounds
     * @see #setLocation(int, int)
     * @see #setLocation(Point)
     * @see #setSize(int, int)
     * @see #setSize(Dimension)
     * @see #setMinimumSize
     * @see #setLocationByPlatform
     * @see #isLocationByPlatform
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean isLocationByPlatform() {

    /**
     * Returns {@code true} if this Window will appear at the default location
     * for the native windowing system the next time this Window is made visible.
     * This method always returns {@code false} if the Window is showing on the
     * screen.
     *
     * @return whether this Window will appear at the default location
     * @see #setLocationByPlatform
     * @see #isShowing
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setLocationByPlatform(boolean locationByPlatform) {

    /**
     * Sets whether this Window should appear at the default location for the
     * native windowing system or at the current location (returned by
     * {@code getLocation}) the next time the Window is made visible.
     * This behavior resembles a native window shown without programmatically
     * setting its location.  Most windowing systems cascade windows if their
     * locations are not explicitly set. The actual location is determined once the
     * window is shown on the screen.
     * <p>
     * This behavior can also be enabled by setting the System Property
     * "java.awt.Window.locationByPlatform" to "true", though calls to this method
     * take precedence.
     * <p>
     * Calls to {@code setVisible}, {@code setLocation} and
     * {@code setBounds} after calling {@code setLocationByPlatform} clear
     * this property of the Window.
     * <p>
     * For example, after the following code is executed:
     * <pre>
     * setLocationByPlatform(true);
     * setVisible(true);
     * boolean flag = isLocationByPlatform();
     * </pre>
     * The window will be shown at platform's default location and
     * {@code flag} will be {@code false}.
     * <p>
     * In the following sample:
     * <pre>
     * setLocationByPlatform(true);
     * setLocation(10, 10);
     * boolean flag = isLocationByPlatform();
     * setVisible(true);
     * </pre>
     * The window will be shown at (10, 10) and {@code flag} will be
     * {@code false}.
     *
     * @param locationByPlatform {@code true} if this Window should appear
     *        at the default location, {@code false} if at the current location
     * @throws IllegalComponentStateException if the window
     *         is showing on screen and locationByPlatform is {@code true}.
     * @see #setLocation
     * @see #isShowing
     * @see #setVisible
     * @see #isLocationByPlatform
     * @see java.lang.System#getProperty(String)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    boolean canContainFocusOwner(Component focusOwnerCandidate) {

    /**
     * Checks whether this window can contain focus owner.
     * Verifies that it is focusable and as container it can container focus owner.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public BufferStrategy getBufferStrategy() {

    /**
     * Returns the {@code BufferStrategy} used by this component.  This
     * method will return null if a {@code BufferStrategy} has not yet
     * been created or has been disposed.
     *
     * @return the buffer strategy used by this component
     * @see #createBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void createBufferStrategy(int numBuffers,
        BufferCapabilities caps) throws AWTException {

    /**
     * Creates a new strategy for multi-buffering on this component with the
     * required buffer capabilities.  This is useful, for example, if only
     * accelerated memory or page flipping is desired (as specified by the
     * buffer capabilities).
     * <p>
     * Each time this method
     * is called, the existing buffer strategy for this component is discarded.
     * @param numBuffers number of buffers to create, including the front buffer
     * @param caps the required capabilities for creating the buffer strategy;
     * cannot be {@code null}
     * @exception AWTException if the capabilities supplied could not be
     * supported or met; this may happen, for example, if there is not enough
     * accelerated memory currently available, or if page flipping is specified
     * but not possible.
     * @exception IllegalArgumentException if numBuffers is less than 1, or if
     * caps is {@code null}
     * @see #getBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void createBufferStrategy(int numBuffers) {

    /**
     * Creates a new strategy for multi-buffering on this component.
     * Multi-buffering is useful for rendering performance.  This method
     * attempts to create the best strategy available with the number of
     * buffers supplied.  It will always create a {@code BufferStrategy}
     * with that number of buffers.
     * A page-flipping strategy is attempted first, then a blitting strategy
     * using accelerated buffers.  Finally, an unaccelerated blitting
     * strategy is used.
     * <p>
     * Each time this method is called,
     * the existing buffer strategy for this component is discarded.
     * @param numBuffers number of buffers to create
     * @exception IllegalArgumentException if numBuffers is less than 1.
     * @exception IllegalStateException if the component is not displayable
     * @see #isDisplayable
     * @see #getBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    boolean dispatchMouseWheelToAncestor(MouseWheelEvent e) {return false;}

    /**
     * Overridden from Component.  Top-level Windows don't dispatch to ancestors
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    void deliverMouseWheelToAncestor(MouseWheelEvent e) {}

    /**
     * Overridden from Component.  Top-level Windows should not propagate a
     * MouseWheelEvent beyond themselves into their owning Windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setLocationRelativeTo(Component c) {

    /**
     * Sets the location of the window relative to the specified
     * component according to the following scenarios.
     * <p>
     * The target screen mentioned below is a screen to which
     * the window should be placed after the setLocationRelativeTo
     * method is called.
     * <ul>
     * <li>If the component is {@code null}, or the {@code
     * GraphicsConfiguration} associated with this component is
     * {@code null}, the window is placed in the center of the
     * screen. The center point can be obtained with the {@link
     * GraphicsEnvironment#getCenterPoint
     * GraphicsEnvironment.getCenterPoint} method.
     * <li>If the component is not {@code null}, but it is not
     * currently showing, the window is placed in the center of
     * the target screen defined by the {@code
     * GraphicsConfiguration} associated with this component.
     * <li>If the component is not {@code null} and is shown on
     * the screen, then the window is located in such a way that
     * the center of the window coincides with the center of the
     * component.
     * </ul>
     * <p>
     * If the screens configuration does not allow the window to
     * be moved from one screen to another, then the window is
     * only placed at the location determined according to the
     * above conditions and its {@code GraphicsConfiguration} is
     * not changed.
     * <p>
     * <b>Note</b>: If the lower edge of the window is out of the screen,
     * then the window is placed to the side of the {@code Component}
     * that is closest to the center of the screen. So if the
     * component is on the right part of the screen, the window
     * is placed to its left, and vice versa.
     * <p>
     * If after the window location has been calculated, the upper,
     * left, or right edge of the window is out of the screen,
     * then the window is located in such a way that the upper,
     * left, or right edge of the window coincides with the
     * corresponding edge of the screen. If both left and right
     * edges of the window are out of the screen, the window is
     * placed at the left side of the screen. The similar placement
     * will occur if both top and bottom edges are out of the screen.
     * In that case, the window is placed at the top side of the screen.
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     *
     * @param c  the component in relation to which the window's location
     *           is determined
     * @see java.awt.GraphicsEnvironment#getCenterPoint
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Get the state of this object.
         *
         * @return an instance of AccessibleStateSet containing the current
         * state set of the object
         * @see javax.accessibility.AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see javax.accessibility.AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    protected class AccessibleAWTWindow extends AccessibleAWTContainer

    /**
     * This class implements accessibility support for the
     * {@code Window} class.  It provides an implementation of the
     * Java Accessibility API appropriate to window user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this Window.
     * For windows, the AccessibleContext takes the form of an
     * AccessibleAWTWindow.
     * A new AccessibleAWTWindow instance is created if necessary.
     *
     * @return an AccessibleAWTWindow that serves as the
     *         AccessibleContext of this Window
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the {@code ObjectInputStream} and an optional
     * list of listeners to receive various events fired by
     * the component; also reads a list of
     * (possibly {@code null}) child windows.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the {@code ObjectInputStream} to read
     * @exception HeadlessException if
     *   {@code GraphicsEnvironment.isHeadless} returns
     *   {@code true}
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #writeObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable {@code WindowListener}s and
     * {@code WindowFocusListener}s as optional data.
     * Writes a list of child windows as optional data.
     * Writes a list of icon images as optional data
     *
     * @param s the {@code ObjectOutputStream} to write
     * @serialData {@code null} terminated sequence of
     *    0 or more pairs; the pair consists of a {@code String}
     *    and {@code Object}; the {@code String}
     *    indicates the type of object and is one of the following:
     *    {@code windowListenerK} indicating a
     *      {@code WindowListener} object;
     *    {@code windowFocusWindowK} indicating a
     *      {@code WindowFocusListener} object;
     *    {@code ownedWindowK} indicating a child
     *      {@code Window} object
     *
     * @see AWTEventMulticaster#save(java.io.ObjectOutputStream, java.lang.String, java.util.EventListener)
     * @see Component#windowListenerK
     * @see Component#windowFocusListenerK
     * @see Component#ownedWindowK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private int windowSerializedDataVersion = 2;

    /**
     * The window serialized data version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Type getType() {

    /**
     * Returns the type of the window.
     *
     * @see   #setType
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setType(Type type) {

    /**
     * Sets the type of the window.
     *
     * This method can only be called while the window is not displayable.
     *
     * @throws IllegalComponentStateException if the window
     *         is displayable.
     * @throws IllegalArgumentException if the type is {@code null}
     * @see    Component#isDisplayable
     * @see    #getType
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private Type type = Type.NORMAL;

    /**
     * Window type.
     *
     * Synchronization: ObjectLock
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Deprecated

    /**
     * @deprecated As of J2SE 1.4, replaced by
     * {@link Component#applyComponentOrientation Component.applyComponentOrientation}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Deprecated

    /**
     * @deprecated As of J2SE 1.4, replaced by
     * {@link Component#applyComponentOrientation Component.applyComponentOrientation}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean isShowing() {

    /**
     * Checks if this Window is showing on screen.
     * @see Component#setVisible
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1
     * replaced by {@code dispatchEvent(AWTEvent)}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    void dispatchEventImpl(AWTEvent e) {

    /**
     * Dispatches an event to this window or one of its sub components.
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * Indicates if this container is a validate root.
     * <p>
     * {@code Window} objects are the validate roots, and, therefore, they
     * override this method to return {@code true}.
     *
     * @return {@code true}
     * @since 1.7
     * @see java.awt.Container#isValidateRoot
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void addPropertyChangeListener(String propertyName,
                                          PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list for a specific
     * property. The specified property may be user-defined, or one of the
     * following:
     * <ul>
     *    <li>this Window's font ("font")</li>
     *    <li>this Window's background color ("background")</li>
     *    <li>this Window's foreground color ("foreground")</li>
     *    <li>this Window's focusability ("focusable")</li>
     *    <li>this Window's focus traversal keys enabled state
     *        ("focusTraversalKeysEnabled")</li>
     *    <li>this Window's Set of FORWARD_TRAVERSAL_KEYS
     *        ("forwardFocusTraversalKeys")</li>
     *    <li>this Window's Set of BACKWARD_TRAVERSAL_KEYS
     *        ("backwardFocusTraversalKeys")</li>
     *    <li>this Window's Set of UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleFocusTraversalKeys")</li>
     *    <li>this Window's Set of DOWN_CYCLE_TRAVERSAL_KEYS
     *        ("downCycleFocusTraversalKeys")</li>
     *    <li>this Window's focus traversal policy ("focusTraversalPolicy")
     *        </li>
     *    <li>this Window's focusable Window state ("focusableWindowState")
     *        </li>
     *    <li>this Window's always-on-top state("alwaysOnTop")</li>
     * </ul>
     * Note that if this Window is inheriting a bound property, then no
     * event will be fired in response to a change in the inherited property.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param propertyName one of the property names listed above
     * @param listener the PropertyChangeListener to be added
     *
     * @see #addPropertyChangeListener(java.beans.PropertyChangeListener)
     * @see Component#removePropertyChangeListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list. The listener is
     * registered for all bound properties of this class, including the
     * following:
     * <ul>
     *    <li>this Window's font ("font")</li>
     *    <li>this Window's background color ("background")</li>
     *    <li>this Window's foreground color ("foreground")</li>
     *    <li>this Window's focusability ("focusable")</li>
     *    <li>this Window's focus traversal keys enabled state
     *        ("focusTraversalKeysEnabled")</li>
     *    <li>this Window's Set of FORWARD_TRAVERSAL_KEYS
     *        ("forwardFocusTraversalKeys")</li>
     *    <li>this Window's Set of BACKWARD_TRAVERSAL_KEYS
     *        ("backwardFocusTraversalKeys")</li>
     *    <li>this Window's Set of UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleFocusTraversalKeys")</li>
     *    <li>this Window's Set of DOWN_CYCLE_TRAVERSAL_KEYS
     *        ("downCycleFocusTraversalKeys")</li>
     *    <li>this Window's focus traversal policy ("focusTraversalPolicy")
     *        </li>
     *    <li>this Window's focusable Window state ("focusableWindowState")
     *        </li>
     *    <li>this Window's always-on-top state("alwaysOnTop")</li>
     * </ul>
     * Note that if this Window is inheriting a bound property, then no
     * event will be fired in response to a change in the inherited property.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param    listener  the PropertyChangeListener to be added
     *
     * @see Component#removePropertyChangeListener
     * @see #addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean isAutoRequestFocus() {

    /**
     * Returns whether this window should receive focus on subsequently being shown
     * (with a call to {@link #setVisible setVisible(true)}), or being moved to the front
     * (with a call to {@link #toFront}).
     * <p>
     * By default, the window has {@code autoRequestFocus} value of {@code true}.
     *
     * @return {@code autoRequestFocus} value
     * @see #setAutoRequestFocus
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setAutoRequestFocus(boolean autoRequestFocus) {

    /**
     * Sets whether this window should receive focus on
     * subsequently being shown (with a call to {@link #setVisible setVisible(true)}),
     * or being moved to the front (with a call to {@link #toFront}).
     * <p>
     * Note that {@link #setVisible setVisible(true)} may be called indirectly
     * (e.g. when showing an owner of the window makes the window to be shown).
     * {@link #toFront} may also be called indirectly (e.g. when
     * {@link #setVisible setVisible(true)} is called on already visible window).
     * In all such cases this property takes effect as well.
     * <p>
     * The value of the property is not inherited by owned windows.
     *
     * @param autoRequestFocus whether this window should be focused on
     *        subsequently being shown or being moved to the front
     * @see #isAutoRequestFocus
     * @see #isFocusableWindow
     * @see #setVisible
     * @see #toFront
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setFocusableWindowState(boolean focusableWindowState) {

    /**
     * Sets whether this Window can become the focused Window if it meets
     * the other requirements outlined in {@code isFocusableWindow}. If
     * this Window's focusable Window state is set to {@code false}, then
     * {@code isFocusableWindow} will return {@code false}. If this
     * Window's focusable Window state is set to {@code true}, then
     * {@code isFocusableWindow} may return {@code true} or
     * {@code false} depending upon the other requirements which must be
     * met in order for a Window to be focusable.
     * <p>
     * Setting a Window's focusability state to {@code false} is the
     * standard mechanism for an application to identify to the AWT a Window
     * which will be used as a floating palette or toolbar, and thus should be
     * a non-focusable Window.
     *
     * Setting the focusability state on a visible {@code Window}
     * can have a delayed effect on some platforms &#151; the actual
     * change may happen only when the {@code Window} becomes
     * hidden and then visible again.  To ensure consistent behavior
     * across platforms, set the {@code Window}'s focusable state
     * when the {@code Window} is invisible and then show it.
     *
     * @param focusableWindowState whether this Window can be the focused
     *        Window
     * @see #isFocusableWindow
     * @see #getFocusableWindowState
     * @see #isShowing
     * @see Component#setFocusable
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean getFocusableWindowState() {

    /**
     * Returns whether this Window can become the focused Window if it meets
     * the other requirements outlined in {@code isFocusableWindow}. If
     * this method returns {@code false}, then
     * {@code isFocusableWindow} will return {@code false} as well.
     * If this method returns {@code true}, then
     * {@code isFocusableWindow} may return {@code true} or
     * {@code false} depending upon the other requirements which must be
     * met in order for a Window to be focusable.
     * <p>
     * By default, all Windows have a focusable Window state of
     * {@code true}.
     *
     * @return whether this Window can be the focused Window
     * @see #isFocusableWindow
     * @see #setFocusableWindowState
     * @see #isShowing
     * @see Component#setFocusable
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final boolean isFocusableWindow() {

    /**
     * Returns whether this Window can become the focused Window, that is,
     * whether this Window or any of its subcomponents can become the focus
     * owner. For a Frame or Dialog to be focusable, its focusable Window state
     * must be set to {@code true}. For a Window which is not a Frame or
     * Dialog to be focusable, its focusable Window state must be set to
     * {@code true}, its nearest owning Frame or Dialog must be
     * showing on the screen, and it must contain at least one Component in
     * its focus traversal cycle. If any of these conditions is not met, then
     * neither this Window nor any of its subcomponents can become the focus
     * owner.
     *
     * @return {@code true} if this Window can be the focused Window;
     *         {@code false} otherwise
     * @see #getFocusableWindowState
     * @see #setFocusableWindowState
     * @see #isShowing
     * @see Component#isFocusable
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final Container getFocusCycleRootAncestor() {

    /**
     * Always returns {@code null} because Windows have no ancestors; they
     * represent the top of the Component hierarchy.
     *
     * @return {@code null}
     * @see Container#isFocusCycleRoot()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final boolean isFocusCycleRoot() {

    /**
     * Always returns {@code true} because all Windows must be roots of a
     * focus traversal cycle.
     *
     * @return {@code true}
     * @see #setFocusCycleRoot
     * @see Container#setFocusTraversalPolicy
     * @see Container#getFocusTraversalPolicy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final void setFocusCycleRoot(boolean focusCycleRoot) {

    /**
     * Does nothing because Windows must always be roots of a focus traversal
     * cycle. The passed-in value is ignored.
     *
     * @param focusCycleRoot this value is ignored
     * @see #isFocusCycleRoot
     * @see Container#setFocusTraversalPolicy
     * @see Container#getFocusTraversalPolicy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @SuppressWarnings("unchecked")

    /**
     * Gets a focus traversal key for this Window. (See {@code
     * setFocusTraversalKeys} for a full description of each key.)
     * <p>
     * If the traversal key has not been explicitly set for this Window,
     * then this Window's parent's traversal key is returned. If the
     * traversal key has not been explicitly set for any of this Window's
     * ancestors, then the current KeyboardFocusManager's default traversal key
     * is returned.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @return the AWTKeyStroke for the specified key
     * @see Container#setFocusTraversalKeys
     * @see KeyboardFocusManager#FORWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#BACKWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#UP_CYCLE_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#DOWN_CYCLE_TRAVERSAL_KEYS
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean isFocused() {

    /**
     * Returns whether this Window is focused. If there exists a focus owner,
     * the focused Window is the Window that is, or contains, that focus owner.
     * If there is no focus owner, then no Window is focused.
     * <p>
     * If the focused Window is a Frame or a Dialog it is also the active
     * Window. Otherwise, the active Window is the first Frame or Dialog that
     * is an owner of the focused Window.
     *
     * @return whether this is the focused Window.
     * @see #isActive
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean isActive() {

    /**
     * Returns whether this Window is active. Only a Frame or a Dialog may be
     * active. The native windowing system may denote the active Window or its
     * children with special decorations, such as a highlighted title bar. The
     * active Window is always either the focused Window, or the first Frame or
     * Dialog that is an owner of the focused Window.
     *
     * @return whether this is the active Window.
     * @see #isFocused
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Component getMostRecentFocusOwner() {

    /**
     * Returns the child Component of this Window that will receive the focus
     * when this Window is focused. If this Window is currently focused, this
     * method returns the same Component as {@code getFocusOwner()}. If
     * this Window is not focused, then the child Component that most recently
     * requested focus will be returned. If no child Component has ever
     * requested focus, and this is a focusable Window, then this Window's
     * initial focusable Component is returned. If no child Component has ever
     * requested focus, and this is a non-focusable Window, null is returned.
     *
     * @return the child Component that will receive focus when this Window is
     *         focused
     * @see #getFocusOwner
     * @see #isFocused
     * @see #isFocusableWindow
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Component getFocusOwner() {

    /**
     * Returns the child Component of this Window that has focus if this Window
     * is focused; returns null otherwise.
     *
     * @return the child Component with focus, or null if this Window is not
     *         focused
     * @see #getMostRecentFocusOwner
     * @see #isFocused
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final boolean isAlwaysOnTop() {

    /**
     * Returns whether this window is an always-on-top window.
     * @return {@code true}, if the window is in always-on-top state,
     *         {@code false} otherwise
     * @see #setAlwaysOnTop
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean isAlwaysOnTopSupported() {

    /**
     * Returns whether the always-on-top mode is supported for this
     * window. Some platforms may not support always-on-top windows, some
     * may support only some kinds of top-level windows; for example,
     * a platform may not support always-on-top modal dialogs.
     *
     * @return {@code true}, if the always-on-top mode is supported for
     *         this window and this window's toolkit supports always-on-top windows,
     *         {@code false} otherwise
     *
     * @see #setAlwaysOnTop(boolean)
     * @see #getToolkit
     * @see Toolkit#isAlwaysOnTopSupported
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final void setAlwaysOnTop(boolean alwaysOnTop) throws SecurityException {

    /**
     * Sets whether this window should always be above other windows.  If
     * there are multiple always-on-top windows, their relative order is
     * unspecified and platform dependent.
     * <p>
     * If some other window is already always-on-top then the
     * relative order between these windows is unspecified (depends on
     * platform).  No window can be brought to be over the always-on-top
     * window except maybe another always-on-top window.
     * <p>
     * All windows owned by an always-on-top window inherit this state and
     * automatically become always-on-top.  If a window ceases to be
     * always-on-top, the windows that it owns will no longer be
     * always-on-top.  When an always-on-top window is sent {@link #toBack
     * toBack}, its always-on-top state is set to {@code false}.
     *
     * <p> When this method is called on a window with a value of
     * {@code true}, and the window is visible and the platform
     * supports always-on-top for this window, the window is immediately
     * brought forward, "sticking" it in the top-most position. If the
     * window isn`t currently visible, this method sets the always-on-top
     * state to {@code true} but does not bring the window forward.
     * When the window is later shown, it will be always-on-top.
     *
     * <p> When this method is called on a window with a value of
     * {@code false} the always-on-top state is set to normal. It may also
     * cause an unspecified, platform-dependent change in the z-order of
     * top-level windows, but other always-on-top windows will remain in
     * top-most position. Calling this method with a value of {@code false}
     * on a window that has a normal state has no effect.
     *
     * <p><b>Note</b>: some platforms might not support always-on-top
     * windows.  To detect if always-on-top windows are supported by the
     * current platform, use {@link Toolkit#isAlwaysOnTopSupported()} and
     * {@link Window#isAlwaysOnTopSupported()}.  If always-on-top mode
     * isn't supported for this window or this window's toolkit does not
     * support always-on-top windows, calling this method has no effect.
     * <p>
     * If a SecurityManager is installed, the calling thread must be
     * granted the AWTPermission "setWindowAlwaysOnTop" in
     * order to set the value of this property. If this
     * permission is not granted, this method will throw a
     * SecurityException, and the current value of the property will
     * be left unchanged.
     *
     * @param alwaysOnTop true if the window should always be above other
     *        windows
     * @throws SecurityException if the calling thread does not have
     *         permission to set the value of always-on-top property
     *
     * @see #isAlwaysOnTop
     * @see #toFront
     * @see #toBack
     * @see AWTPermission
     * @see #isAlwaysOnTopSupported
     * @see #getToolkit
     * @see Toolkit#isAlwaysOnTopSupported
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    void preProcessKeyEvent(KeyEvent e) {

    /**
     * Implements a debugging hook -- checks to see if
     * the user has typed <i>control-shift-F1</i>.  If so,
     * the list of child windows is dumped to {@code System.out}.
     * @param e  the keyboard event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    protected void processWindowStateEvent(WindowEvent e) {

    /**
     * Processes window state event occurring on this window by
     * dispatching them to any registered {@code WindowStateListener}
     * objects.
     * NOTE: this method will not be called unless window state events
     * are enabled for this window.  This happens when one of the
     * following occurs:
     * <ul>
     * <li>a {@code WindowStateListener} is registered via
     *    {@code addWindowStateListener}
     * <li>window state events are enabled via {@code enableEvents}
     * </ul>
     * <p>Note that if the event parameter is {@code null}
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the window state event
     * @see java.awt.Component#enableEvents
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    protected void processWindowFocusEvent(WindowEvent e) {

    /**
     * Processes window focus event occurring on this window by
     * dispatching them to any registered WindowFocusListener objects.
     * NOTE: this method will not be called unless window focus events
     * are enabled for this window. This happens when one of the
     * following occurs:
     * <ul>
     * <li>a WindowFocusListener is registered via
     *     {@code addWindowFocusListener}
     * <li>Window focus events are enabled via {@code enableEvents}
     * </ul>
     * <p>Note that if the event parameter is {@code null}
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the window focus event
     * @see Component#enableEvents
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    protected void processWindowEvent(WindowEvent e) {

    /**
     * Processes window events occurring on this window by
     * dispatching them to any registered WindowListener objects.
     * NOTE: This method will not be called unless window events
     * are enabled for this component; this happens when one of the
     * following occurs:
     * <ul>
     * <li>A WindowListener object is registered via
     *     {@code addWindowListener}
     * <li>Window events are enabled via {@code enableEvents}
     * </ul>
     * <p>Note that if the event parameter is {@code null}
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the window event
     * @see Component#enableEvents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this window. If the event is an
     * {@code WindowEvent}, it invokes the
     * {@code processWindowEvent} method, else it invokes its
     * superclass's {@code processEvent}.
     * <p>Note that if the event parameter is {@code null}
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this {@code Window}.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     *
     * You can specify the {@code listenerType} argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * {@code Window} {@code w}
     * for its window listeners with the following code:
     *
     * <pre>WindowListener[] wls = (WindowListener[])(w.getListeners(WindowListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          {@code java.util.EventListener}
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this window,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if {@code listenerType}
     *          doesn't specify a class or interface that implements
     *          {@code java.util.EventListener}
     * @exception NullPointerException if {@code listenerType} is {@code null}
     *
     * @see #getWindowListeners
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized WindowStateListener[] getWindowStateListeners() {

    /**
     * Returns an array of all the window state listeners
     * registered on this window.
     *
     * @return all of this window's {@code WindowStateListener}s
     *         or an empty array if no window state
     *         listeners are currently registered
     *
     * @see #addWindowStateListener
     * @see #removeWindowStateListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized WindowFocusListener[] getWindowFocusListeners() {

    /**
     * Returns an array of all the window focus listeners
     * registered on this window.
     *
     * @return all of this window's {@code WindowFocusListener}s
     *         or an empty array if no window focus
     *         listeners are currently registered
     *
     * @see #addWindowFocusListener
     * @see #removeWindowFocusListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized WindowListener[] getWindowListeners() {

    /**
     * Returns an array of all the window listeners
     * registered on this window.
     *
     * @return all of this window's {@code WindowListener}s
     *         or an empty array if no window
     *         listeners are currently registered
     *
     * @see #addWindowListener
     * @see #removeWindowListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void removeWindowFocusListener(WindowFocusListener l) {

    /**
     * Removes the specified window focus listener so that it no longer
     * receives window events from this window.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the window focus listener
     * @see #addWindowFocusListener
     * @see #getWindowFocusListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void removeWindowStateListener(WindowStateListener l) {

    /**
     * Removes the specified window state listener so that it no
     * longer receives window events from this window.  If
     * {@code l} is {@code null}, no exception is thrown and
     * no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the window state listener
     * @see #addWindowStateListener
     * @see #getWindowStateListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void removeWindowListener(WindowListener l) {

    /**
     * Removes the specified window listener so that it no longer
     * receives window events from this window.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the window listener
     * @see #addWindowListener
     * @see #getWindowListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void addWindowFocusListener(WindowFocusListener l) {

    /**
     * Adds the specified window focus listener to receive window events
     * from this window.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the window focus listener
     * @see #removeWindowFocusListener
     * @see #getWindowFocusListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void addWindowStateListener(WindowStateListener l) {

    /**
     * Adds the specified window state listener to receive window
     * events from this window.  If {@code l} is {@code null},
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the window state listener
     * @see #removeWindowStateListener
     * @see #getWindowStateListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void addWindowListener(WindowListener l) {

    /**
     * Adds the specified window listener to receive window events from
     * this window.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the window listener
     * @see #removeWindowListener
     * @see #getWindowListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Dialog.ModalExclusionType getModalExclusionType() {

    /**
     * Returns the modal exclusion type of this window.
     *
     * @return the modal exclusion type of this window
     *
     * @see java.awt.Dialog.ModalExclusionType
     * @see java.awt.Window#setModalExclusionType
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setModalExclusionType(Dialog.ModalExclusionType exclusionType) {

    /**
     * Specifies the modal exclusion type for this window. If a window is modal
     * excluded, it is not blocked by some modal dialogs. See {@link
     * java.awt.Dialog.ModalExclusionType Dialog.ModalExclusionType} for
     * possible modal exclusion types.
     * <p>
     * If the given type is not supported, {@code NO_EXCLUDE} is used.
     * <p>
     * Note: changing the modal exclusion type for a visible window may have no
     * effect until it is hidden and then shown again.
     *
     * @param exclusionType the modal exclusion type for this window; a {@code null}
     *     value is equivalent to {@link Dialog.ModalExclusionType#NO_EXCLUDE
     *     NO_EXCLUDE}
     * @throws SecurityException if the calling thread does not have permission
     *     to set the modal exclusion property to the window with the given
     *     {@code exclusionType}
     * @see java.awt.Dialog.ModalExclusionType
     * @see java.awt.Window#getModalExclusionType
     * @see java.awt.Toolkit#isModalExclusionTypeSupported
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public static Window[] getOwnerlessWindows() {

    /**
     * Returns an array of all {@code Window}s created by this application
     * that have no owner. They include {@code Frame}s and ownerless
     * {@code Dialog}s and {@code Window}s.
     * If called from an applet, the array includes only the {@code Window}s
     * accessible by that applet.
     * <p>
     * <b>Warning:</b> this method may return system created windows, such
     * as a print dialog. Applications should not assume the existence of
     * these dialogs, nor should an application assume anything about these
     * dialogs such as component positions, {@code LayoutManager}s
     * or serialization.
     *
     * @see Frame#getFrames
     * @see Window#getWindows()
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public static Window[] getWindows() {

    /**
     * Returns an array of all {@code Window}s, both owned and ownerless,
     * created by this application.
     * If called from an applet, the array includes only the {@code Window}s
     * accessible by that applet.
     * <p>
     * <b>Warning:</b> this method may return system created windows, such
     * as a print dialog. Applications should not assume the existence of
     * these dialogs, nor should an application assume anything about these
     * dialogs such as component positions, {@code LayoutManager}s
     * or serialization.
     *
     * @see Frame#getFrames
     * @see Window#getOwnerlessWindows
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Window[] getOwnedWindows() {

    /**
     * Return an array containing all the windows this
     * window currently owns.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Window getOwner() {

    /**
     * Returns the owner of this window.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setCursor(Cursor cursor) {

    /**
     * Set the cursor image to a specified cursor.
     * <p>
     * The method may have no visual effect if the Java platform
     * implementation and/or the native system do not support
     * changing the mouse cursor shape.
     * @param     cursor One of the constants defined
     *            by the {@code Cursor} class. If this parameter is null
     *            then the cursor for this window will be set to the type
     *            Cursor.DEFAULT_CURSOR.
     * @see       Component#getCursor
     * @see       Cursor
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public InputContext getInputContext() {

    /**
     * Gets the input context for this window. A window always has an input context,
     * which is shared by subcomponents unless they create and set their own.
     * @see Component#getInputContext
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Locale getLocale() {

    /**
     * Gets the {@code Locale} object that is associated
     * with this window, if the locale has been set.
     * If no locale has been set, then the default locale
     * is returned.
     * @return    the locale that is set for this window.
     * @see       java.util.Locale
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final String getWarningString() {

    /**
     * Gets the warning string that is displayed with this window.
     * If this window is insecure, the warning string is displayed
     * somewhere in the visible area of the window. A window is
     * insecure if there is a security manager and the security
     * manager denies
     * {@code AWTPermission("showWindowWithoutWarningBanner")}.
     * <p>
     * If the window is secure, then {@code getWarningString}
     * returns {@code null}. If the window is insecure, this
     * method checks for the system property
     * {@code awt.appletWarning}
     * and returns the string value of that property.
     * @return    the warning string for this window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Toolkit getToolkit() {

    /**
     * Returns the toolkit of this frame.
     * @return    the toolkit of this window.
     * @see       Toolkit
     * @see       Toolkit#getDefaultToolkit
     * @see       Component#getToolkit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void toBack() {

    /**
     * If this Window is visible, sends this Window to the back and may cause
     * it to lose focus or activation if it is the focused or active Window.
     * <p>
     * Places this Window at the bottom of the stacking order and shows it
     * behind any other Windows in this VM. No action will take place is this
     * Window is not visible. Some platforms do not allow Windows which are
     * owned by other Windows to appear below their owners. Every attempt will
     * be made to move this Window as low as possible in the stacking order;
     * however, developers should not assume that this method will move this
     * Window below all other windows in every situation.
     * <p>
     * Because of variations in native windowing systems, no guarantees about
     * changes to the focused and active Windows can be made. Developers must
     * never assume that this Window is no longer the focused or active Window
     * until this Window receives a WINDOW_LOST_FOCUS or WINDOW_DEACTIVATED
     * event. On platforms where the top-most window is the focused window,
     * this method will <b>probably</b> cause this Window to lose focus. In
     * that case, the next highest, focusable Window in this VM will receive
     * focus. On platforms where the stacking order does not typically affect
     * the focused window, this method will <b>probably</b> leave the focused
     * and active Windows unchanged.
     *
     * @see       #toFront
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void toFront() {

    /**
     * If this Window is visible, brings this Window to the front and may make
     * it the focused Window.
     * <p>
     * Places this Window at the top of the stacking order and shows it in
     * front of any other Windows in this VM. No action will take place if this
     * Window is not visible. Some platforms do not allow Windows which own
     * other Windows to appear on top of those owned Windows. Some platforms
     * may not permit this VM to place its Windows above windows of native
     * applications, or Windows of other VMs. This permission may depend on
     * whether a Window in this VM is already focused. Every attempt will be
     * made to move this Window as high as possible in the stacking order;
     * however, developers should not assume that this method will move this
     * Window above all other windows in every situation.
     * <p>
     * Developers must never assume that this Window is the focused or active
     * Window until this Window receives a WINDOW_GAINED_FOCUS or WINDOW_ACTIVATED
     * event. On platforms where the top-most window is the focused window, this
     * method will <b>probably</b> focus this Window (if it is not already focused)
     * under the following conditions:
     * <ul>
     * <li> The window meets the requirements outlined in the
     *      {@link #isFocusableWindow} method.
     * <li> The window's property {@code autoRequestFocus} is of the
     *      {@code true} value.
     * <li> Native windowing system allows the window to get focused.
     * </ul>
     * On platforms where the stacking order does not typically affect the focused
     * window, this method will <b>probably</b> leave the focused and active
     * Windows unchanged.
     * <p>
     * If this method causes this Window to be focused, and this Window is a
     * Frame or a Dialog, it will also become activated. If this Window is
     * focused, but it is not a Frame or a Dialog, then the first Frame or
     * Dialog that is an owner of this Window will be activated.
     * <p>
     * If this window is blocked by modal dialog, then the blocking dialog
     * is brought to the front and remains above the blocked window.
     *
     * @see       #toBack
     * @see       #setAutoRequestFocus
     * @see       #isFocusableWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void dispose() {

    /**
     * Releases all of the native screen resources used by this
     * {@code Window}, its subcomponents, and all of its owned
     * children. That is, the resources for these {@code Component}s
     * will be destroyed, any memory they consume will be returned to the
     * OS, and they will be marked as undisplayable.
     * <p>
     * The {@code Window} and its subcomponents can be made displayable
     * again by rebuilding the native resources with a subsequent call to
     * {@code pack} or {@code show}. The states of the recreated
     * {@code Window} and its subcomponents will be identical to the
     * states of these objects at the point where the {@code Window}
     * was disposed (not accounting for additional modifications between
     * those actions).
     * <p>
     * <b>Note</b>: When the last displayable window
     * within the Java virtual machine (VM) is disposed of, the VM may
     * terminate.  See <a href="doc-files/AWTThreadIssues.html#Autoshutdown">
     * AWT Threading Issues</a> for more information.
     * @see Component#isDisplayable
     * @see #pack
     * @see #show
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Deprecated

    /**
     * Hide this Window, its subcomponents, and all of its owned children.
     * The Window and its subcomponents can be made visible again
     * with a call to {@code show}.
     * @see #show
     * @see #dispose
     * @deprecated As of JDK version 1.5, replaced by
     * {@link #setVisible(boolean)}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Deprecated

    /**
     * Makes the Window visible. If the Window and/or its owner
     * are not yet displayable, both are made displayable.  The
     * Window will be validated prior to being made visible.
     * If the Window is already visible, this will bring the Window
     * to the front.
     * @see       Component#isDisplayable
     * @see       #toFront
     * @deprecated As of JDK version 1.5, replaced by
     * {@link #setVisible(boolean)}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setVisible(boolean b) {

    /**
     * Shows or hides this {@code Window} depending on the value of parameter
     * {@code b}.
     * <p>
     * If the method shows the window then the window is also made
     * focused under the following conditions:
     * <ul>
     * <li> The {@code Window} meets the requirements outlined in the
     *      {@link #isFocusableWindow} method.
     * <li> The {@code Window}'s {@code autoRequestFocus} property is of the {@code true} value.
     * <li> Native windowing system allows the {@code Window} to get focused.
     * </ul>
     * There is an exception for the second condition (the value of the
     * {@code autoRequestFocus} property). The property is not taken into account if the
     * window is a modal dialog, which blocks the currently focused window.
     * <p>
     * Developers must never assume that the window is the focused or active window
     * until it receives a WINDOW_GAINED_FOCUS or WINDOW_ACTIVATED event.
     * @param b  if {@code true}, makes the {@code Window} visible,
     * otherwise hides the {@code Window}.
     * If the {@code Window} and/or its owner
     * are not yet displayable, both are made displayable.  The
     * {@code Window} will be validated prior to being made visible.
     * If the {@code Window} is already visible, this will bring the
     * {@code Window} to the front.<p>
     * If {@code false}, hides this {@code Window}, its subcomponents, and all
     * of its owned children.
     * The {@code Window} and its subcomponents can be made visible again
     * with a call to {@code #setVisible(true)}.
     * @see java.awt.Component#isDisplayable
     * @see java.awt.Component#setVisible
     * @see java.awt.Window#toFront
     * @see java.awt.Window#dispose
     * @see java.awt.Window#setAutoRequestFocus
     * @see java.awt.Window#isFocusableWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by {@code setBounds(int, int, int, int)}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * {@inheritDoc}
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * {@inheritDoc}
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setSize(int width, int height) {

    /**
     * {@inheritDoc}
     * <p>
     * The {@code width} and {@code height} values
     * are automatically enlarged if either is less than
     * the minimum size as specified by previous call to
     * {@code setMinimumSize}.
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     *
     * @see #getSize
     * @see #setBounds
     * @see #setMinimumSize
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setSize(Dimension d) {

    /**
     * {@inheritDoc}
     * <p>
     * The {@code d.width} and {@code d.height} values
     * are automatically enlarged if either is less than
     * the minimum size as specified by previous call to
     * {@code setMinimumSize}.
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     *
     * @see #getSize
     * @see #setBounds
     * @see #setMinimumSize
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setMinimumSize(Dimension minimumSize) {

    /**
     * Sets the minimum size of this window to a constant
     * value.  Subsequent calls to {@code getMinimumSize}
     * will always return this value. If current window's
     * size is less than {@code minimumSize} the size of the
     * window is automatically enlarged to honor the minimum size.
     * <p>
     * If the {@code setSize} or {@code setBounds} methods
     * are called afterwards with a width or height less than
     * that was specified by the {@code setMinimumSize} method
     * the window is automatically enlarged to meet
     * the {@code minimumSize} value. The {@code minimumSize}
     * value also affects the behaviour of the {@code pack} method.
     * <p>
     * The default behavior is restored by setting the minimum size
     * parameter to the {@code null} value.
     * <p>
     * Resizing operation may be restricted if the user tries
     * to resize window below the {@code minimumSize} value.
     * This behaviour is platform-dependent.
     *
     * @param minimumSize the new minimum size of this window
     * @see Component#setMinimumSize
     * @see #getMinimumSize
     * @see #isMinimumSizeSet
     * @see #setSize(Dimension)
     * @see #pack
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void pack() {

    /**
     * Causes this Window to be sized to fit the preferred size
     * and layouts of its subcomponents. The resulting width and
     * height of the window are automatically enlarged if either
     * of dimensions is less than the minimum size as specified
     * by the previous call to the {@code setMinimumSize} method.
     * <p>
     * If the window and/or its owner are not displayable yet,
     * both of them are made displayable before calculating
     * the preferred size. The Window is validated after its
     * size is being calculated.
     *
     * @see Component#isDisplayable
     * @see #setMinimumSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void removeNotify() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void addNotify() {

    /**
     * Makes this Window displayable by creating the connection to its
     * native screen resource.
     * This method is called internally by the toolkit and should
     * not be called directly by programs.
     * @see Component#isDisplayable
     * @see Container#removeNotify
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setIconImage(Image image) {

    /**
     * Sets the image to be displayed as the icon for this window.
     * <p>
     * This method can be used instead of {@link #setIconImages setIconImages()}
     * to specify a single image as a window's icon.
     * <p>
     * The following statement:
     * <pre>
     *     setIconImage(image);
     * </pre>
     * is equivalent to:
     * <pre>
     *     ArrayList&lt;Image&gt; imageList = new ArrayList&lt;Image&gt;();
     *     imageList.add(image);
     *     setIconImages(imageList);
     * </pre>
     * <p>
     * Note : Native windowing systems may use different images of differing
     * dimensions to represent a window, depending on the context (e.g.
     * window decoration, window list, taskbar, etc.). They could also use
     * just a single image for all contexts or no image at all.
     *
     * @param     image the icon image to be displayed.
     * @see       #setIconImages
     * @see       #getIconImages()
     * @since     1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void setIconImages(java.util.List<? extends Image> icons) {

    /**
     * Sets the sequence of images to be displayed as the icon
     * for this window. Subsequent calls to {@code getIconImages} will
     * always return a copy of the {@code icons} list.
     * <p>
     * Depending on the platform capabilities one or several images
     * of different dimensions will be used as the window's icon.
     * <p>
     * The {@code icons} list is scanned for the images of most
     * appropriate dimensions from the beginning. If the list contains
     * several images of the same size, the first will be used.
     * <p>
     * Ownerless windows with no icon specified use platfrom-default icon.
     * The icon of an owned window may be inherited from the owner
     * unless explicitly overridden.
     * Setting the icon to {@code null} or empty list restores
     * the default behavior.
     * <p>
     * Note : Native windowing systems may use different images of differing
     * dimensions to represent a window, depending on the context (e.g.
     * window decoration, window list, taskbar, etc.). They could also use
     * just a single image for all contexts or no image at all.
     *
     * @param     icons the list of icon images to be displayed.
     * @see       #getIconImages()
     * @see       #setIconImage(Image)
     * @since     1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public java.util.List<Image> getIconImages() {

    /**
     * Returns the sequence of images to be displayed as the icon for this window.
     * <p>
     * This method returns a copy of the internally stored list, so all operations
     * on the returned object will not affect the window's behavior.
     *
     * @return    the copy of icon images' list for this window, or
     *            empty list if this window doesn't have icon images.
     * @see       #setIconImages
     * @see       #setIconImage(Image)
     * @since     1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Window(Window owner, GraphicsConfiguration gc) {

    /**
     * Constructs a new, initially invisible window with the specified owner
     * {@code Window} and a {@code GraphicsConfiguration}
     * of a screen device. The Window will not be focusable unless
     * its nearest owning {@code Frame} or {@code Dialog}
     * is showing on the screen.
     * <p>
     * If there is a security manager set, it is invoked to check
     * {@code AWTPermission("showWindowWithoutWarningBanner")}. If that
     * check fails with a {@code SecurityException} then a warning banner
     * is created.
     *
     * @param owner the window to act as owner or {@code null}
     *     if this window has no owner
     * @param gc the {@code GraphicsConfiguration} of the target
     *     screen device; if {@code gc} is {@code null},
     *     the system default {@code GraphicsConfiguration} is assumed
     * @exception IllegalArgumentException if {@code gc}
     *     is not from a screen device
     * @exception HeadlessException when
     *     {@code GraphicsEnvironment.isHeadless()} returns
     *     {@code true}
     *
     * @see       java.awt.GraphicsEnvironment#isHeadless
     * @see       GraphicsConfiguration#getBounds
     * @see       #isShowing
     * @since     1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Window(Window owner) {

    /**
     * Constructs a new, initially invisible window with the specified
     * {@code Window} as its owner. This window will not be focusable
     * unless its nearest owning {@code Frame} or {@code Dialog}
     * is showing on the screen.
     * <p>
     * If there is a security manager set, it is invoked to check
     * {@code AWTPermission("showWindowWithoutWarningBanner")}.
     * If that check fails with a {@code SecurityException} then a
     * warning banner is created.
     *
     * @param owner the {@code Window} to act as owner or
     *     {@code null} if this window has no owner
     * @exception IllegalArgumentException if the {@code owner}'s
     *     {@code GraphicsConfiguration} is not from a screen device
     * @exception HeadlessException when
     *     {@code GraphicsEnvironment.isHeadless()} returns
     *     {@code true}
     *
     * @see       java.awt.GraphicsEnvironment#isHeadless
     * @see       #isShowing
     *
     * @since     1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Window(Frame owner) {

    /**
     * Constructs a new, initially invisible window with the specified
     * {@code Frame} as its owner. The window will not be focusable
     * unless its owner is showing on the screen.
     * <p>
     * If there is a security manager set, it is invoked to check
     * {@code AWTPermission("showWindowWithoutWarningBanner")}.
     * If that check fails with a {@code SecurityException} then a warning
     * banner is created.
     *
     * @param owner the {@code Frame} to act as owner or {@code null}
     *    if this window has no owner
     * @exception IllegalArgumentException if the {@code owner}'s
     *    {@code GraphicsConfiguration} is not from a screen device
     * @exception HeadlessException when
     *    {@code GraphicsEnvironment.isHeadless} returns {@code true}
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #isShowing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    Window() throws HeadlessException {

    /**
     * Constructs a new, initially invisible window in the default size.
     * <p>
     * If there is a security manager set, it is invoked to check
     * {@code AWTPermission("showWindowWithoutWarningBanner")}.
     * If that check fails with a {@code SecurityException} then a warning
     * banner is created.
     *
     * @exception HeadlessException when
     *     {@code GraphicsEnvironment.isHeadless()} returns {@code true}
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    Window(GraphicsConfiguration gc) {

    /**
     * Constructs a new, initially invisible window in default size with the
     * specified {@code GraphicsConfiguration}.
     * <p>
     * If there is a security manager, then it is invoked to check
     * {@code AWTPermission("showWindowWithoutWarningBanner")}
     * to determine whether or not the window must be displayed with
     * a warning banner.
     *
     * @param gc the {@code GraphicsConfiguration} of the target screen
     *     device. If {@code gc} is {@code null}, the system default
     *     {@code GraphicsConfiguration} is assumed
     * @exception IllegalArgumentException if {@code gc}
     *    is not from a screen device
     * @exception HeadlessException when
     *     {@code GraphicsEnvironment.isHeadless()} returns {@code true}
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
       accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private transient double securityWarningPointX = 2.0;

    /**
     * These fields represent the desired location for the security
     * warning if this window is untrusted.
     * See com.sun.awt.SecurityWarning for more details.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private transient volatile int securityWarningWidth = 0;

    /**
     * These fields are initialized in the native peer code
     * or via AWTAccessor's WindowAccessor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private Shape shape = null;

    /**
     * The shape assigned to this window. This field is set to {@code null} if
     * no shape is set (rectangular window).
     *
     * @serial
     * @see #getShape()
     * @see #setShape(Shape)
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private float opacity = 1.0f;

    /**
     * The opacity level of the window
     *
     * @serial
     * @see #setOpacity(float)
     * @see #getOpacity()
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private volatile boolean autoRequestFocus = true;

    /**
     * Indicates whether this window should receive focus on
     * subsequently being shown (with a call to {@code setVisible(true)}), or
     * being moved to the front (with a call to {@code toFront()}).
     *
     * @serial
     * @see #setAutoRequestFocus
     * @see #isAutoRequestFocus
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private boolean focusableWindowState = true;

    /**
     * Indicates whether this Window can become the focused Window.
     *
     * @serial
     * @see #getFocusableWindowState
     * @see #setFocusableWindowState
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private FocusManager focusMgr;

    /**
     * Unused. Maintained for serialization backward-compatibility.
     *
     * @serial
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    Dialog.ModalExclusionType modalExclusionType;

    /**
     * @serial
     *
     * @see java.awt.Dialog.ModalExclusionType
     * @see #getModalExclusionType
     * @see #setModalExclusionType
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    transient Dialog modalBlocker;

    /**
     * Contains the modal dialog that blocks this window, or null
     * if the window is unblocked.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    transient Vector<WeakReference<Window>> ownedWindowList =

    /**
     * A vector containing all the windows this
     * window currently owns.
     * @since 1.2
     * @see #getOwnedWindows
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private static final IdentityArrayList<Window> allWindows = new IdentityArrayList<Window>();

    /**
     * Contains all the windows that have a peer object associated,
     * i. e. between addNotify() and removeNotify() calls. The list
     * of all Window instances can be obtained from AppContext object.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private boolean alwaysOnTop;

    /**
     * A boolean value representing Window always-on-top state
     * @since 1.5
     * @serial
     * @see #setAlwaysOnTop
     * @see #isAlwaysOnTop
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    int state;

    /**
     * An Integer value representing the Window State.
     *
     * @serial
     * @since 1.2
     * @see #show
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private transient Component temporaryLostComponent;

    /**
     * Holds the reference to the component which last had focus in this window
     * before it lost focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    transient java.util.List<Image> icons;

    /**
     * {@code icons} is the graphical way we can
     * represent the frames and dialogs.
     * {@code Window} can't display icon but it's
     * being inherited by owned {@code Dialog}s.
     *
     * @serial
     * @see #getIconImages
     * @see #setIconImages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    String      warningString;

    /**
     * This represents the warning message that is
     * to be displayed in a non secure window. ie :
     * a window that has a security manager installed that denies
     * {@code AWTPermission("showWindowWithoutWarningBanner")}.
     * This message can be displayed anywhere in the window.
     *
     * @serial
     * @see #getWarningString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
        POPUP

        /**
         * Represents a <i>popup</i> window.
         *
         * A popup window is a temporary window such as a drop-down menu or a
         * tooltip. On some platforms, windows of that type may be forcibly
         * made undecorated even if they are instances of the {@code Frame} or
         * {@code Dialog} class, and have decorations enabled.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
        UTILITY,

        /**
         * Represents a <i>utility</i> window.
         *
         * A utility window is usually a small window such as a toolbar or a
         * palette. The native system may render the window with smaller
         * title-bar if the window is either a {@code Frame} or a {@code
         * Dialog} object, and if it has its decorations enabled.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public static enum Type {

    /**
     * Enumeration of available <i>window types</i>.
     *
     * A window type defines the generic visual appearance and behavior of a
     * top-level window. For example, the type may affect the kind of
     * decorations of a decorated {@code Frame} or {@code Dialog} instance.
     * <p>
     * Some platforms may not fully support a certain window type. Depending on
     * the level of support, some properties of the window type may be
     * disobeyed.
     *
     * @see   #getType
     * @see   #setType
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
public class Window extends Container implements Accessible {

/**
 * A {@code Window} object is a top-level window with no borders and no
 * menubar.
 * The default layout for a window is {@code BorderLayout}.
 * <p>
 * A window must have either a frame, dialog, or another window defined as its
 * owner when it's constructed.
 * <p>
 * In a multi-screen environment, you can create a {@code Window}
 * on a different screen device by constructing the {@code Window}
 * with {@link #Window(Window, GraphicsConfiguration)}.  The
 * {@code GraphicsConfiguration} object is one of the
 * {@code GraphicsConfiguration} objects of the target screen device.
 * <p>
 * In a virtual device multi-screen environment in which the desktop
 * area could span multiple physical screen devices, the bounds of all
 * configurations are relative to the virtual device coordinate system.
 * The origin of the virtual-coordinate system is at the upper left-hand
 * corner of the primary physical screen.  Depending on the location of
 * the primary screen in the virtual device, negative coordinates are
 * possible, as shown in the following figure.
 * <p>
 * <img src="doc-files/MultiScreen.gif"
 * alt="Diagram shows virtual device containing 4 physical screens. Primary physical screen shows coords (0,0), other screen shows (-80,-100)."
 * style="float:center; margin: 7px 10px;">
 * <p>
 * In such an environment, when calling {@code setLocation},
 * you must pass a virtual coordinate to this method.  Similarly,
 * calling {@code getLocationOnScreen} on a {@code Window} returns
 * virtual device coordinates.  Call the {@code getBounds} method
 * of a {@code GraphicsConfiguration} to find its origin in the virtual
 * coordinate system.
 * <p>
 * The following code sets the location of a {@code Window}
 * at (10, 10) relative to the origin of the physical screen
 * of the corresponding {@code GraphicsConfiguration}.  If the
 * bounds of the {@code GraphicsConfiguration} is not taken
 * into account, the {@code Window} location would be set
 * at (10, 10) relative to the virtual-coordinate system and would appear
 * on the primary physical screen, which might be different from the
 * physical screen of the specified {@code GraphicsConfiguration}.
 *
 * <pre>
 *      Window w = new Window(Window owner, GraphicsConfiguration gc);
 *      Rectangle bounds = gc.getBounds();
 *      w.setLocation(10 + bounds.x, 10 + bounds.y);
 * </pre>
 *
 * <p>
 * Note: the location and size of top-level windows (including
 * {@code Window}s, {@code Frame}s, and {@code Dialog}s)
 * are under the control of the desktop's window management system.
 * Calls to {@code setLocation}, {@code setSize}, and
 * {@code setBounds} are requests (not directives) which are
 * forwarded to the window management system.  Every effort will be
 * made to honor such requests.  However, in some cases the window
 * management system may ignore such requests, or modify the requested
 * geometry in order to place and size the {@code Window} in a way
 * that more closely matches the desktop settings.
 * <p>
 * Due to the asynchronous nature of native event handling, the results
 * returned by {@code getBounds}, {@code getLocation},
 * {@code getLocationOnScreen}, and {@code getSize} might not
 * reflect the actual geometry of the Window on screen until the last
 * request has been processed.  During the processing of subsequent
 * requests these values might change accordingly while the window
 * management system fulfills the requests.
 * <p>
 * An application may set the size and location of an invisible
 * {@code Window} arbitrarily, but the window management system may
 * subsequently change its size and/or location when the
 * {@code Window} is made visible. One or more {@code ComponentEvent}s
 * will be generated to indicate the new geometry.
 * <p>
 * Windows are capable of generating the following WindowEvents:
 * WindowOpened, WindowClosed, WindowGainedFocus, WindowLostFocus.
 *
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 * @see WindowEvent
 * @see #addWindowListener
 * @see java.awt.BorderLayout
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
class FocusManager implements java.io.Serializable {

/**
 * This class is no longer used, but is maintained for Serialization
 * backward-compatibility.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private Point2D calculateSecurityWarningPosition(double x, double y,
            double w, double h)

    /**
     * Calculate the position of the security warning.
     *
     * This method gets the window location/size as reported by the native
     * system since the locally cached values may represent outdated data.
     *
     * The method is used from the native code, or via AWTAccessor.
     *
     * NOTE: this method is invoked on the toolkit thread, and therefore is not
     * supposed to become public/user-overridable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private static double limit(double value, double min, double max) {

    /**
     * Limit the given double value with the given range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * Applies the shape to the component
     * @param shape Shape to be applied to the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * {@inheritDoc}
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * Indicates if the window is currently opaque.
     * <p>
     * The method returns {@code false} if the background color of the window
     * is not {@code null} and the alpha component of the color is less than
     * {@code 1.0f}. The method returns {@code true} otherwise.
     *
     * @return {@code true} if the window is opaque, {@code false} otherwise
     *
     * @see Window#getBackground
     * @see Window#setBackground(Color)
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * Sets the background color of this window.
     * <p>
     * If the windowing system supports the {@link
     * GraphicsDevice.WindowTranslucency#PERPIXEL_TRANSLUCENT PERPIXEL_TRANSLUCENT}
     * translucency, the alpha component of the given background color
     * may effect the mode of operation for this window: it indicates whether
     * this window must be opaque (alpha equals {@code 1.0f}) or per-pixel translucent
     * (alpha is less than {@code 1.0f}). If the given background color is
     * {@code null}, the window is considered completely opaque.
     * <p>
     * All the following conditions must be met to enable the per-pixel
     * transparency mode for this window:
     * <ul>
     * <li>The {@link GraphicsDevice.WindowTranslucency#PERPIXEL_TRANSLUCENT
     * PERPIXEL_TRANSLUCENT} translucency must be supported by the graphics
     * device where this window is located
     * <li>The window must be undecorated (see {@link Frame#setUndecorated}
     * and {@link Dialog#setUndecorated})
     * <li>The window must not be in full-screen mode (see {@link
     * GraphicsDevice#setFullScreenWindow(Window)})
     * </ul>
     * <p>
     * If the alpha component of the requested background color is less than
     * {@code 1.0f}, and any of the above conditions are not met, the background
     * color of this window will not change, the alpha component of the given
     * background color will not affect the mode of operation for this window,
     * and either the {@code UnsupportedOperationException} or {@code
     * IllegalComponentStateException} will be thrown.
     * <p>
     * When the window is per-pixel translucent, the drawing sub-system
     * respects the alpha value of each individual pixel. If a pixel gets
     * painted with the alpha color component equal to zero, it becomes
     * visually transparent. If the alpha of the pixel is equal to 1.0f, the
     * pixel is fully opaque. Interim values of the alpha color component make
     * the pixel semi-transparent. In this mode, the background of the window
     * gets painted with the alpha value of the given background color. If the
     * alpha value of the argument of this method is equal to {@code 0}, the
     * background is not painted at all.
     * <p>
     * The actual level of translucency of a given pixel also depends on window
     * opacity (see {@link #setOpacity(float)}), as well as the current shape of
     * this window (see {@link #setShape(Shape)}).
     * <p>
     * Note that painting a pixel with the alpha value of {@code 0} may or may
     * not disable the mouse event handling on this pixel. This is a
     * platform-dependent behavior. To make sure the mouse events do not get
     * dispatched to a particular pixel, the pixel must be excluded from the
     * shape of the window.
     * <p>
     * Enabling the per-pixel translucency mode may change the graphics
     * configuration of this window due to the native platform requirements.
     *
     * @param bgColor the color to become this window's background color.
     *
     * @throws IllegalComponentStateException if the alpha value of the given
     *     background color is less than {@code 1.0f} and the window is decorated
     * @throws IllegalComponentStateException if the alpha value of the given
     *     background color is less than {@code 1.0f} and the window is in
     *     full-screen mode
     * @throws UnsupportedOperationException if the alpha value of the given
     *     background color is less than {@code 1.0f} and {@link
     *     GraphicsDevice.WindowTranslucency#PERPIXEL_TRANSLUCENT
     *     PERPIXEL_TRANSLUCENT} translucency is not supported
     *
     * @see Window#getBackground
     * @see Window#isOpaque
     * @see Window#setOpacity(float)
     * @see Window#setShape(Shape)
     * @see Frame#isUndecorated
     * @see Dialog#isUndecorated
     * @see GraphicsDevice.WindowTranslucency
     * @see GraphicsDevice#isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency)
     * @see GraphicsConfiguration#isTranslucencyCapable()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * Gets the background color of this window.
     * <p>
     * Note that the alpha component of the returned color indicates whether
     * the window is in the non-opaque (per-pixel translucent) mode.
     *
     * @return this component's background color
     *
     * @see Window#setBackground(Color)
     * @see Window#isOpaque
     * @see GraphicsDevice.WindowTranslucency
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setShape(Shape shape) {

    /**
     * Sets the shape of the window.
     * <p>
     * Setting a shape cuts off some parts of the window. Only the parts that
     * belong to the given {@link Shape} remain visible and clickable. If
     * the shape argument is {@code null}, this method restores the default
     * shape, making the window rectangular on most platforms.
     * <p>
     * The following conditions must be met to set a non-null shape:
     * <ul>
     * <li>The {@link GraphicsDevice.WindowTranslucency#PERPIXEL_TRANSPARENT
     * PERPIXEL_TRANSPARENT} translucency must be supported by the
     * underlying system
     * <li>The window must be undecorated (see {@link Frame#setUndecorated}
     * and {@link Dialog#setUndecorated})
     * <li>The window must not be in full-screen mode (see {@link
     * GraphicsDevice#setFullScreenWindow(Window)})
     * </ul>
     * <p>
     * If the requested shape is not {@code null}, and any of the above
     * conditions are not met, the shape of this window will not change,
     * and either the {@code UnsupportedOperationException} or {@code
     * IllegalComponentStateException} will be thrown.
     * <p>
     * The translucency levels of individual pixels may also be effected by the
     * alpha component of their color (see {@link Window#setBackground(Color)}) and the
     * opacity value (see {@link #setOpacity(float)}). See {@link
     * GraphicsDevice.WindowTranslucency} for more details.
     *
     * @param shape the shape to set to the window
     *
     * @throws IllegalComponentStateException if the shape is not {@code
     *     null} and the window is decorated
     * @throws IllegalComponentStateException if the shape is not {@code
     *     null} and the window is in full-screen mode
     * @throws UnsupportedOperationException if the shape is not {@code
     *     null} and {@link GraphicsDevice.WindowTranslucency#PERPIXEL_TRANSPARENT
     *     PERPIXEL_TRANSPARENT} translucency is not supported
     *
     * @see Window#getShape()
     * @see Window#setBackground(Color)
     * @see Window#setOpacity(float)
     * @see Frame#isUndecorated
     * @see Dialog#isUndecorated
     * @see GraphicsDevice.WindowTranslucency
     * @see GraphicsDevice#isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency)
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Shape getShape() {

    /**
     * Returns the shape of the window.
     *
     * The value returned by this method may not be the same as
     * previously set with {@code setShape(shape)}, but it is guaranteed
     * to represent the same shape.
     *
     * @return the shape of the window or {@code null} if no
     *     shape is specified for the window
     *
     * @see Window#setShape(Shape)
     * @see GraphicsDevice.WindowTranslucency
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setOpacity(float opacity) {

    /**
     * Sets the opacity of the window.
     * <p>
     * The opacity value is in the range [0..1]. Note that setting the opacity
     * level of 0 may or may not disable the mouse event handling on this
     * window. This is a platform-dependent behavior.
     * <p>
     * The following conditions must be met in order to set the opacity value
     * less than {@code 1.0f}:
     * <ul>
     * <li>The {@link GraphicsDevice.WindowTranslucency#TRANSLUCENT TRANSLUCENT}
     * translucency must be supported by the underlying system
     * <li>The window must be undecorated (see {@link Frame#setUndecorated}
     * and {@link Dialog#setUndecorated})
     * <li>The window must not be in full-screen mode (see {@link
     * GraphicsDevice#setFullScreenWindow(Window)})
     * </ul>
     * <p>
     * If the requested opacity value is less than {@code 1.0f}, and any of the
     * above conditions are not met, the window opacity will not change,
     * and the {@code IllegalComponentStateException} will be thrown.
     * <p>
     * The translucency levels of individual pixels may also be effected by the
     * alpha component of their color (see {@link Window#setBackground(Color)}) and the
     * current shape of this window (see {@link #setShape(Shape)}).
     *
     * @param opacity the opacity level to set to the window
     *
     * @throws IllegalArgumentException if the opacity is out of the range
     *     [0..1]
     * @throws IllegalComponentStateException if the window is decorated and
     *     the opacity is less than {@code 1.0f}
     * @throws IllegalComponentStateException if the window is in full screen
     *     mode, and the opacity is less than {@code 1.0f}
     * @throws UnsupportedOperationException if the {@code
     *     GraphicsDevice.WindowTranslucency#TRANSLUCENT TRANSLUCENT}
     *     translucency is not supported and the opacity is less than
     *     {@code 1.0f}
     *
     * @see Window#getOpacity
     * @see Window#setBackground(Color)
     * @see Window#setShape(Shape)
     * @see Frame#isUndecorated
     * @see Dialog#isUndecorated
     * @see GraphicsDevice.WindowTranslucency
     * @see GraphicsDevice#isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency)
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public float getOpacity() {

    /**
     * Returns the opacity of the window.
     *
     * @return the opacity of the window
     *
     * @see Window#setOpacity(float)
     * @see GraphicsDevice.WindowTranslucency
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    boolean isRecursivelyVisible() {

    /**
     * Determines whether this component will be displayed on the screen.
     * @return {@code true} if the component and all of its ancestors
     *          until a toplevel window are visible, {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setBounds(Rectangle r) {

    /**
     * {@inheritDoc}
     * <p>
     * The {@code r.width} or {@code r.height} values
     * will be automatically enlarged if either is less than
     * the minimum size as specified by previous call to
     * {@code setMinimumSize}.
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     *
     * @see #getBounds
     * @see #setLocation(int, int)
     * @see #setLocation(Point)
     * @see #setSize(int, int)
     * @see #setSize(Dimension)
     * @see #setMinimumSize
     * @see #setLocationByPlatform
     * @see #isLocationByPlatform
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setBounds(int x, int y, int width, int height) {

    /**
     * {@inheritDoc}
     * <p>
     * The {@code width} or {@code height} values
     * are automatically enlarged if either is less than
     * the minimum size as specified by previous call to
     * {@code setMinimumSize}.
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     *
     * @see #getBounds
     * @see #setLocation(int, int)
     * @see #setLocation(Point)
     * @see #setSize(int, int)
     * @see #setSize(Dimension)
     * @see #setMinimumSize
     * @see #setLocationByPlatform
     * @see #isLocationByPlatform
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean isLocationByPlatform() {

    /**
     * Returns {@code true} if this Window will appear at the default location
     * for the native windowing system the next time this Window is made visible.
     * This method always returns {@code false} if the Window is showing on the
     * screen.
     *
     * @return whether this Window will appear at the default location
     * @see #setLocationByPlatform
     * @see #isShowing
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setLocationByPlatform(boolean locationByPlatform) {

    /**
     * Sets whether this Window should appear at the default location for the
     * native windowing system or at the current location (returned by
     * {@code getLocation}) the next time the Window is made visible.
     * This behavior resembles a native window shown without programmatically
     * setting its location.  Most windowing systems cascade windows if their
     * locations are not explicitly set. The actual location is determined once the
     * window is shown on the screen.
     * <p>
     * This behavior can also be enabled by setting the System Property
     * "java.awt.Window.locationByPlatform" to "true", though calls to this method
     * take precedence.
     * <p>
     * Calls to {@code setVisible}, {@code setLocation} and
     * {@code setBounds} after calling {@code setLocationByPlatform} clear
     * this property of the Window.
     * <p>
     * For example, after the following code is executed:
     * <pre>
     * setLocationByPlatform(true);
     * setVisible(true);
     * boolean flag = isLocationByPlatform();
     * </pre>
     * The window will be shown at platform's default location and
     * {@code flag} will be {@code false}.
     * <p>
     * In the following sample:
     * <pre>
     * setLocationByPlatform(true);
     * setLocation(10, 10);
     * boolean flag = isLocationByPlatform();
     * setVisible(true);
     * </pre>
     * The window will be shown at (10, 10) and {@code flag} will be
     * {@code false}.
     *
     * @param locationByPlatform {@code true} if this Window should appear
     *        at the default location, {@code false} if at the current location
     * @throws IllegalComponentStateException if the window
     *         is showing on screen and locationByPlatform is {@code true}.
     * @see #setLocation
     * @see #isShowing
     * @see #setVisible
     * @see #isLocationByPlatform
     * @see java.lang.System#getProperty(String)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    boolean canContainFocusOwner(Component focusOwnerCandidate) {

    /**
     * Checks whether this window can contain focus owner.
     * Verifies that it is focusable and as container it can container focus owner.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public BufferStrategy getBufferStrategy() {

    /**
     * Returns the {@code BufferStrategy} used by this component.  This
     * method will return null if a {@code BufferStrategy} has not yet
     * been created or has been disposed.
     *
     * @return the buffer strategy used by this component
     * @see #createBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void createBufferStrategy(int numBuffers,
        BufferCapabilities caps) throws AWTException {

    /**
     * Creates a new strategy for multi-buffering on this component with the
     * required buffer capabilities.  This is useful, for example, if only
     * accelerated memory or page flipping is desired (as specified by the
     * buffer capabilities).
     * <p>
     * Each time this method
     * is called, the existing buffer strategy for this component is discarded.
     * @param numBuffers number of buffers to create, including the front buffer
     * @param caps the required capabilities for creating the buffer strategy;
     * cannot be {@code null}
     * @exception AWTException if the capabilities supplied could not be
     * supported or met; this may happen, for example, if there is not enough
     * accelerated memory currently available, or if page flipping is specified
     * but not possible.
     * @exception IllegalArgumentException if numBuffers is less than 1, or if
     * caps is {@code null}
     * @see #getBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void createBufferStrategy(int numBuffers) {

    /**
     * Creates a new strategy for multi-buffering on this component.
     * Multi-buffering is useful for rendering performance.  This method
     * attempts to create the best strategy available with the number of
     * buffers supplied.  It will always create a {@code BufferStrategy}
     * with that number of buffers.
     * A page-flipping strategy is attempted first, then a blitting strategy
     * using accelerated buffers.  Finally, an unaccelerated blitting
     * strategy is used.
     * <p>
     * Each time this method is called,
     * the existing buffer strategy for this component is discarded.
     * @param numBuffers number of buffers to create
     * @exception IllegalArgumentException if numBuffers is less than 1.
     * @exception IllegalStateException if the component is not displayable
     * @see #isDisplayable
     * @see #getBufferStrategy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    boolean dispatchMouseWheelToAncestor(MouseWheelEvent e) {return false;}

    /**
     * Overridden from Component.  Top-level Windows don't dispatch to ancestors
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    void deliverMouseWheelToAncestor(MouseWheelEvent e) {}

    /**
     * Overridden from Component.  Top-level Windows should not propagate a
     * MouseWheelEvent beyond themselves into their owning Windows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setLocationRelativeTo(Component c) {

    /**
     * Sets the location of the window relative to the specified
     * component according to the following scenarios.
     * <p>
     * The target screen mentioned below is a screen to which
     * the window should be placed after the setLocationRelativeTo
     * method is called.
     * <ul>
     * <li>If the component is {@code null}, or the {@code
     * GraphicsConfiguration} associated with this component is
     * {@code null}, the window is placed in the center of the
     * screen. The center point can be obtained with the {@link
     * GraphicsEnvironment#getCenterPoint
     * GraphicsEnvironment.getCenterPoint} method.
     * <li>If the component is not {@code null}, but it is not
     * currently showing, the window is placed in the center of
     * the target screen defined by the {@code
     * GraphicsConfiguration} associated with this component.
     * <li>If the component is not {@code null} and is shown on
     * the screen, then the window is located in such a way that
     * the center of the window coincides with the center of the
     * component.
     * </ul>
     * <p>
     * If the screens configuration does not allow the window to
     * be moved from one screen to another, then the window is
     * only placed at the location determined according to the
     * above conditions and its {@code GraphicsConfiguration} is
     * not changed.
     * <p>
     * <b>Note</b>: If the lower edge of the window is out of the screen,
     * then the window is placed to the side of the {@code Component}
     * that is closest to the center of the screen. So if the
     * component is on the right part of the screen, the window
     * is placed to its left, and vice versa.
     * <p>
     * If after the window location has been calculated, the upper,
     * left, or right edge of the window is out of the screen,
     * then the window is located in such a way that the upper,
     * left, or right edge of the window coincides with the
     * corresponding edge of the screen. If both left and right
     * edges of the window are out of the screen, the window is
     * placed at the left side of the screen. The similar placement
     * will occur if both top and bottom edges are out of the screen.
     * In that case, the window is placed at the top side of the screen.
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     *
     * @param c  the component in relation to which the window's location
     *           is determined
     * @see java.awt.GraphicsEnvironment#getCenterPoint
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Get the state of this object.
         *
         * @return an instance of AccessibleStateSet containing the current
         * state set of the object
         * @see javax.accessibility.AccessibleState
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see javax.accessibility.AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    protected class AccessibleAWTWindow extends AccessibleAWTContainer

    /**
     * This class implements accessibility support for the
     * {@code Window} class.  It provides an implementation of the
     * Java Accessibility API appropriate to window user-interface elements.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this Window.
     * For windows, the AccessibleContext takes the form of an
     * AccessibleAWTWindow.
     * A new AccessibleAWTWindow instance is created if necessary.
     *
     * @return an AccessibleAWTWindow that serves as the
     *         AccessibleContext of this Window
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads the {@code ObjectInputStream} and an optional
     * list of listeners to receive various events fired by
     * the component; also reads a list of
     * (possibly {@code null}) child windows.
     * Unrecognized keys or values will be ignored.
     *
     * @param s the {@code ObjectInputStream} to read
     * @exception HeadlessException if
     *   {@code GraphicsEnvironment.isHeadless} returns
     *   {@code true}
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #writeObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * Writes default serializable fields to stream.  Writes
     * a list of serializable {@code WindowListener}s and
     * {@code WindowFocusListener}s as optional data.
     * Writes a list of child windows as optional data.
     * Writes a list of icon images as optional data
     *
     * @param s the {@code ObjectOutputStream} to write
     * @serialData {@code null} terminated sequence of
     *    0 or more pairs; the pair consists of a {@code String}
     *    and {@code Object}; the {@code String}
     *    indicates the type of object and is one of the following:
     *    {@code windowListenerK} indicating a
     *      {@code WindowListener} object;
     *    {@code windowFocusWindowK} indicating a
     *      {@code WindowFocusListener} object;
     *    {@code ownedWindowK} indicating a child
     *      {@code Window} object
     *
     * @see AWTEventMulticaster#save(java.io.ObjectOutputStream, java.lang.String, java.util.EventListener)
     * @see Component#windowListenerK
     * @see Component#windowFocusListenerK
     * @see Component#ownedWindowK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private int windowSerializedDataVersion = 2;

    /**
     * The window serialized data version.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Type getType() {

    /**
     * Returns the type of the window.
     *
     * @see   #setType
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setType(Type type) {

    /**
     * Sets the type of the window.
     *
     * This method can only be called while the window is not displayable.
     *
     * @throws IllegalComponentStateException if the window
     *         is displayable.
     * @throws IllegalArgumentException if the type is {@code null}
     * @see    Component#isDisplayable
     * @see    #getType
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private Type type = Type.NORMAL;

    /**
     * Window type.
     *
     * Synchronization: ObjectLock
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Deprecated

    /**
     * @deprecated As of J2SE 1.4, replaced by
     * {@link Component#applyComponentOrientation Component.applyComponentOrientation}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Deprecated

    /**
     * @deprecated As of J2SE 1.4, replaced by
     * {@link Component#applyComponentOrientation Component.applyComponentOrientation}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean isShowing() {

    /**
     * Checks if this Window is showing on screen.
     * @see Component#setVisible
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1
     * replaced by {@code dispatchEvent(AWTEvent)}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    void dispatchEventImpl(AWTEvent e) {

    /**
     * Dispatches an event to this window or one of its sub components.
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * Indicates if this container is a validate root.
     * <p>
     * {@code Window} objects are the validate roots, and, therefore, they
     * override this method to return {@code true}.
     *
     * @return {@code true}
     * @since 1.7
     * @see java.awt.Container#isValidateRoot
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void addPropertyChangeListener(String propertyName,
                                          PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list for a specific
     * property. The specified property may be user-defined, or one of the
     * following:
     * <ul>
     *    <li>this Window's font ("font")</li>
     *    <li>this Window's background color ("background")</li>
     *    <li>this Window's foreground color ("foreground")</li>
     *    <li>this Window's focusability ("focusable")</li>
     *    <li>this Window's focus traversal keys enabled state
     *        ("focusTraversalKeysEnabled")</li>
     *    <li>this Window's Set of FORWARD_TRAVERSAL_KEYS
     *        ("forwardFocusTraversalKeys")</li>
     *    <li>this Window's Set of BACKWARD_TRAVERSAL_KEYS
     *        ("backwardFocusTraversalKeys")</li>
     *    <li>this Window's Set of UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleFocusTraversalKeys")</li>
     *    <li>this Window's Set of DOWN_CYCLE_TRAVERSAL_KEYS
     *        ("downCycleFocusTraversalKeys")</li>
     *    <li>this Window's focus traversal policy ("focusTraversalPolicy")
     *        </li>
     *    <li>this Window's focusable Window state ("focusableWindowState")
     *        </li>
     *    <li>this Window's always-on-top state("alwaysOnTop")</li>
     * </ul>
     * Note that if this Window is inheriting a bound property, then no
     * event will be fired in response to a change in the inherited property.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param propertyName one of the property names listed above
     * @param listener the PropertyChangeListener to be added
     *
     * @see #addPropertyChangeListener(java.beans.PropertyChangeListener)
     * @see Component#removePropertyChangeListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list. The listener is
     * registered for all bound properties of this class, including the
     * following:
     * <ul>
     *    <li>this Window's font ("font")</li>
     *    <li>this Window's background color ("background")</li>
     *    <li>this Window's foreground color ("foreground")</li>
     *    <li>this Window's focusability ("focusable")</li>
     *    <li>this Window's focus traversal keys enabled state
     *        ("focusTraversalKeysEnabled")</li>
     *    <li>this Window's Set of FORWARD_TRAVERSAL_KEYS
     *        ("forwardFocusTraversalKeys")</li>
     *    <li>this Window's Set of BACKWARD_TRAVERSAL_KEYS
     *        ("backwardFocusTraversalKeys")</li>
     *    <li>this Window's Set of UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleFocusTraversalKeys")</li>
     *    <li>this Window's Set of DOWN_CYCLE_TRAVERSAL_KEYS
     *        ("downCycleFocusTraversalKeys")</li>
     *    <li>this Window's focus traversal policy ("focusTraversalPolicy")
     *        </li>
     *    <li>this Window's focusable Window state ("focusableWindowState")
     *        </li>
     *    <li>this Window's always-on-top state("alwaysOnTop")</li>
     * </ul>
     * Note that if this Window is inheriting a bound property, then no
     * event will be fired in response to a change in the inherited property.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param    listener  the PropertyChangeListener to be added
     *
     * @see Component#removePropertyChangeListener
     * @see #addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean isAutoRequestFocus() {

    /**
     * Returns whether this window should receive focus on subsequently being shown
     * (with a call to {@link #setVisible setVisible(true)}), or being moved to the front
     * (with a call to {@link #toFront}).
     * <p>
     * By default, the window has {@code autoRequestFocus} value of {@code true}.
     *
     * @return {@code autoRequestFocus} value
     * @see #setAutoRequestFocus
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setAutoRequestFocus(boolean autoRequestFocus) {

    /**
     * Sets whether this window should receive focus on
     * subsequently being shown (with a call to {@link #setVisible setVisible(true)}),
     * or being moved to the front (with a call to {@link #toFront}).
     * <p>
     * Note that {@link #setVisible setVisible(true)} may be called indirectly
     * (e.g. when showing an owner of the window makes the window to be shown).
     * {@link #toFront} may also be called indirectly (e.g. when
     * {@link #setVisible setVisible(true)} is called on already visible window).
     * In all such cases this property takes effect as well.
     * <p>
     * The value of the property is not inherited by owned windows.
     *
     * @param autoRequestFocus whether this window should be focused on
     *        subsequently being shown or being moved to the front
     * @see #isAutoRequestFocus
     * @see #isFocusableWindow
     * @see #setVisible
     * @see #toFront
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setFocusableWindowState(boolean focusableWindowState) {

    /**
     * Sets whether this Window can become the focused Window if it meets
     * the other requirements outlined in {@code isFocusableWindow}. If
     * this Window's focusable Window state is set to {@code false}, then
     * {@code isFocusableWindow} will return {@code false}. If this
     * Window's focusable Window state is set to {@code true}, then
     * {@code isFocusableWindow} may return {@code true} or
     * {@code false} depending upon the other requirements which must be
     * met in order for a Window to be focusable.
     * <p>
     * Setting a Window's focusability state to {@code false} is the
     * standard mechanism for an application to identify to the AWT a Window
     * which will be used as a floating palette or toolbar, and thus should be
     * a non-focusable Window.
     *
     * Setting the focusability state on a visible {@code Window}
     * can have a delayed effect on some platforms &#151; the actual
     * change may happen only when the {@code Window} becomes
     * hidden and then visible again.  To ensure consistent behavior
     * across platforms, set the {@code Window}'s focusable state
     * when the {@code Window} is invisible and then show it.
     *
     * @param focusableWindowState whether this Window can be the focused
     *        Window
     * @see #isFocusableWindow
     * @see #getFocusableWindowState
     * @see #isShowing
     * @see Component#setFocusable
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean getFocusableWindowState() {

    /**
     * Returns whether this Window can become the focused Window if it meets
     * the other requirements outlined in {@code isFocusableWindow}. If
     * this method returns {@code false}, then
     * {@code isFocusableWindow} will return {@code false} as well.
     * If this method returns {@code true}, then
     * {@code isFocusableWindow} may return {@code true} or
     * {@code false} depending upon the other requirements which must be
     * met in order for a Window to be focusable.
     * <p>
     * By default, all Windows have a focusable Window state of
     * {@code true}.
     *
     * @return whether this Window can be the focused Window
     * @see #isFocusableWindow
     * @see #setFocusableWindowState
     * @see #isShowing
     * @see Component#setFocusable
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final boolean isFocusableWindow() {

    /**
     * Returns whether this Window can become the focused Window, that is,
     * whether this Window or any of its subcomponents can become the focus
     * owner. For a Frame or Dialog to be focusable, its focusable Window state
     * must be set to {@code true}. For a Window which is not a Frame or
     * Dialog to be focusable, its focusable Window state must be set to
     * {@code true}, its nearest owning Frame or Dialog must be
     * showing on the screen, and it must contain at least one Component in
     * its focus traversal cycle. If any of these conditions is not met, then
     * neither this Window nor any of its subcomponents can become the focus
     * owner.
     *
     * @return {@code true} if this Window can be the focused Window;
     *         {@code false} otherwise
     * @see #getFocusableWindowState
     * @see #setFocusableWindowState
     * @see #isShowing
     * @see Component#isFocusable
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final Container getFocusCycleRootAncestor() {

    /**
     * Always returns {@code null} because Windows have no ancestors; they
     * represent the top of the Component hierarchy.
     *
     * @return {@code null}
     * @see Container#isFocusCycleRoot()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final boolean isFocusCycleRoot() {

    /**
     * Always returns {@code true} because all Windows must be roots of a
     * focus traversal cycle.
     *
     * @return {@code true}
     * @see #setFocusCycleRoot
     * @see Container#setFocusTraversalPolicy
     * @see Container#getFocusTraversalPolicy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final void setFocusCycleRoot(boolean focusCycleRoot) {

    /**
     * Does nothing because Windows must always be roots of a focus traversal
     * cycle. The passed-in value is ignored.
     *
     * @param focusCycleRoot this value is ignored
     * @see #isFocusCycleRoot
     * @see Container#setFocusTraversalPolicy
     * @see Container#getFocusTraversalPolicy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @SuppressWarnings("unchecked")

    /**
     * Gets a focus traversal key for this Window. (See {@code
     * setFocusTraversalKeys} for a full description of each key.)
     * <p>
     * If the traversal key has not been explicitly set for this Window,
     * then this Window's parent's traversal key is returned. If the
     * traversal key has not been explicitly set for any of this Window's
     * ancestors, then the current KeyboardFocusManager's default traversal key
     * is returned.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @return the AWTKeyStroke for the specified key
     * @see Container#setFocusTraversalKeys
     * @see KeyboardFocusManager#FORWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#BACKWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#UP_CYCLE_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#DOWN_CYCLE_TRAVERSAL_KEYS
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean isFocused() {

    /**
     * Returns whether this Window is focused. If there exists a focus owner,
     * the focused Window is the Window that is, or contains, that focus owner.
     * If there is no focus owner, then no Window is focused.
     * <p>
     * If the focused Window is a Frame or a Dialog it is also the active
     * Window. Otherwise, the active Window is the first Frame or Dialog that
     * is an owner of the focused Window.
     *
     * @return whether this is the focused Window.
     * @see #isActive
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean isActive() {

    /**
     * Returns whether this Window is active. Only a Frame or a Dialog may be
     * active. The native windowing system may denote the active Window or its
     * children with special decorations, such as a highlighted title bar. The
     * active Window is always either the focused Window, or the first Frame or
     * Dialog that is an owner of the focused Window.
     *
     * @return whether this is the active Window.
     * @see #isFocused
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Component getMostRecentFocusOwner() {

    /**
     * Returns the child Component of this Window that will receive the focus
     * when this Window is focused. If this Window is currently focused, this
     * method returns the same Component as {@code getFocusOwner()}. If
     * this Window is not focused, then the child Component that most recently
     * requested focus will be returned. If no child Component has ever
     * requested focus, and this is a focusable Window, then this Window's
     * initial focusable Component is returned. If no child Component has ever
     * requested focus, and this is a non-focusable Window, null is returned.
     *
     * @return the child Component that will receive focus when this Window is
     *         focused
     * @see #getFocusOwner
     * @see #isFocused
     * @see #isFocusableWindow
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Component getFocusOwner() {

    /**
     * Returns the child Component of this Window that has focus if this Window
     * is focused; returns null otherwise.
     *
     * @return the child Component with focus, or null if this Window is not
     *         focused
     * @see #getMostRecentFocusOwner
     * @see #isFocused
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final boolean isAlwaysOnTop() {

    /**
     * Returns whether this window is an always-on-top window.
     * @return {@code true}, if the window is in always-on-top state,
     *         {@code false} otherwise
     * @see #setAlwaysOnTop
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public boolean isAlwaysOnTopSupported() {

    /**
     * Returns whether the always-on-top mode is supported for this
     * window. Some platforms may not support always-on-top windows, some
     * may support only some kinds of top-level windows; for example,
     * a platform may not support always-on-top modal dialogs.
     *
     * @return {@code true}, if the always-on-top mode is supported for
     *         this window and this window's toolkit supports always-on-top windows,
     *         {@code false} otherwise
     *
     * @see #setAlwaysOnTop(boolean)
     * @see #getToolkit
     * @see Toolkit#isAlwaysOnTopSupported
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final void setAlwaysOnTop(boolean alwaysOnTop) throws SecurityException {

    /**
     * Sets whether this window should always be above other windows.  If
     * there are multiple always-on-top windows, their relative order is
     * unspecified and platform dependent.
     * <p>
     * If some other window is already always-on-top then the
     * relative order between these windows is unspecified (depends on
     * platform).  No window can be brought to be over the always-on-top
     * window except maybe another always-on-top window.
     * <p>
     * All windows owned by an always-on-top window inherit this state and
     * automatically become always-on-top.  If a window ceases to be
     * always-on-top, the windows that it owns will no longer be
     * always-on-top.  When an always-on-top window is sent {@link #toBack
     * toBack}, its always-on-top state is set to {@code false}.
     *
     * <p> When this method is called on a window with a value of
     * {@code true}, and the window is visible and the platform
     * supports always-on-top for this window, the window is immediately
     * brought forward, "sticking" it in the top-most position. If the
     * window isn`t currently visible, this method sets the always-on-top
     * state to {@code true} but does not bring the window forward.
     * When the window is later shown, it will be always-on-top.
     *
     * <p> When this method is called on a window with a value of
     * {@code false} the always-on-top state is set to normal. It may also
     * cause an unspecified, platform-dependent change in the z-order of
     * top-level windows, but other always-on-top windows will remain in
     * top-most position. Calling this method with a value of {@code false}
     * on a window that has a normal state has no effect.
     *
     * <p><b>Note</b>: some platforms might not support always-on-top
     * windows.  To detect if always-on-top windows are supported by the
     * current platform, use {@link Toolkit#isAlwaysOnTopSupported()} and
     * {@link Window#isAlwaysOnTopSupported()}.  If always-on-top mode
     * isn't supported for this window or this window's toolkit does not
     * support always-on-top windows, calling this method has no effect.
     * <p>
     * If a SecurityManager is installed, the calling thread must be
     * granted the AWTPermission "setWindowAlwaysOnTop" in
     * order to set the value of this property. If this
     * permission is not granted, this method will throw a
     * SecurityException, and the current value of the property will
     * be left unchanged.
     *
     * @param alwaysOnTop true if the window should always be above other
     *        windows
     * @throws SecurityException if the calling thread does not have
     *         permission to set the value of always-on-top property
     *
     * @see #isAlwaysOnTop
     * @see #toFront
     * @see #toBack
     * @see AWTPermission
     * @see #isAlwaysOnTopSupported
     * @see #getToolkit
     * @see Toolkit#isAlwaysOnTopSupported
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    void preProcessKeyEvent(KeyEvent e) {

    /**
     * Implements a debugging hook -- checks to see if
     * the user has typed <i>control-shift-F1</i>.  If so,
     * the list of child windows is dumped to {@code System.out}.
     * @param e  the keyboard event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    protected void processWindowStateEvent(WindowEvent e) {

    /**
     * Processes window state event occurring on this window by
     * dispatching them to any registered {@code WindowStateListener}
     * objects.
     * NOTE: this method will not be called unless window state events
     * are enabled for this window.  This happens when one of the
     * following occurs:
     * <ul>
     * <li>a {@code WindowStateListener} is registered via
     *    {@code addWindowStateListener}
     * <li>window state events are enabled via {@code enableEvents}
     * </ul>
     * <p>Note that if the event parameter is {@code null}
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the window state event
     * @see java.awt.Component#enableEvents
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    protected void processWindowFocusEvent(WindowEvent e) {

    /**
     * Processes window focus event occurring on this window by
     * dispatching them to any registered WindowFocusListener objects.
     * NOTE: this method will not be called unless window focus events
     * are enabled for this window. This happens when one of the
     * following occurs:
     * <ul>
     * <li>a WindowFocusListener is registered via
     *     {@code addWindowFocusListener}
     * <li>Window focus events are enabled via {@code enableEvents}
     * </ul>
     * <p>Note that if the event parameter is {@code null}
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the window focus event
     * @see Component#enableEvents
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    protected void processWindowEvent(WindowEvent e) {

    /**
     * Processes window events occurring on this window by
     * dispatching them to any registered WindowListener objects.
     * NOTE: This method will not be called unless window events
     * are enabled for this component; this happens when one of the
     * following occurs:
     * <ul>
     * <li>A WindowListener object is registered via
     *     {@code addWindowListener}
     * <li>Window events are enabled via {@code enableEvents}
     * </ul>
     * <p>Note that if the event parameter is {@code null}
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the window event
     * @see Component#enableEvents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this window. If the event is an
     * {@code WindowEvent}, it invokes the
     * {@code processWindowEvent} method, else it invokes its
     * superclass's {@code processEvent}.
     * <p>Note that if the event parameter is {@code null}
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this {@code Window}.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     *
     * You can specify the {@code listenerType} argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * {@code Window} {@code w}
     * for its window listeners with the following code:
     *
     * <pre>WindowListener[] wls = (WindowListener[])(w.getListeners(WindowListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          {@code java.util.EventListener}
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this window,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if {@code listenerType}
     *          doesn't specify a class or interface that implements
     *          {@code java.util.EventListener}
     * @exception NullPointerException if {@code listenerType} is {@code null}
     *
     * @see #getWindowListeners
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized WindowStateListener[] getWindowStateListeners() {

    /**
     * Returns an array of all the window state listeners
     * registered on this window.
     *
     * @return all of this window's {@code WindowStateListener}s
     *         or an empty array if no window state
     *         listeners are currently registered
     *
     * @see #addWindowStateListener
     * @see #removeWindowStateListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized WindowFocusListener[] getWindowFocusListeners() {

    /**
     * Returns an array of all the window focus listeners
     * registered on this window.
     *
     * @return all of this window's {@code WindowFocusListener}s
     *         or an empty array if no window focus
     *         listeners are currently registered
     *
     * @see #addWindowFocusListener
     * @see #removeWindowFocusListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized WindowListener[] getWindowListeners() {

    /**
     * Returns an array of all the window listeners
     * registered on this window.
     *
     * @return all of this window's {@code WindowListener}s
     *         or an empty array if no window
     *         listeners are currently registered
     *
     * @see #addWindowListener
     * @see #removeWindowListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void removeWindowFocusListener(WindowFocusListener l) {

    /**
     * Removes the specified window focus listener so that it no longer
     * receives window events from this window.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the window focus listener
     * @see #addWindowFocusListener
     * @see #getWindowFocusListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void removeWindowStateListener(WindowStateListener l) {

    /**
     * Removes the specified window state listener so that it no
     * longer receives window events from this window.  If
     * {@code l} is {@code null}, no exception is thrown and
     * no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the window state listener
     * @see #addWindowStateListener
     * @see #getWindowStateListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void removeWindowListener(WindowListener l) {

    /**
     * Removes the specified window listener so that it no longer
     * receives window events from this window.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the window listener
     * @see #addWindowListener
     * @see #getWindowListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void addWindowFocusListener(WindowFocusListener l) {

    /**
     * Adds the specified window focus listener to receive window events
     * from this window.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the window focus listener
     * @see #removeWindowFocusListener
     * @see #getWindowFocusListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void addWindowStateListener(WindowStateListener l) {

    /**
     * Adds the specified window state listener to receive window
     * events from this window.  If {@code l} is {@code null},
     * no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the window state listener
     * @see #removeWindowStateListener
     * @see #getWindowStateListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void addWindowListener(WindowListener l) {

    /**
     * Adds the specified window listener to receive window events from
     * this window.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the window listener
     * @see #removeWindowListener
     * @see #getWindowListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Dialog.ModalExclusionType getModalExclusionType() {

    /**
     * Returns the modal exclusion type of this window.
     *
     * @return the modal exclusion type of this window
     *
     * @see java.awt.Dialog.ModalExclusionType
     * @see java.awt.Window#setModalExclusionType
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setModalExclusionType(Dialog.ModalExclusionType exclusionType) {

    /**
     * Specifies the modal exclusion type for this window. If a window is modal
     * excluded, it is not blocked by some modal dialogs. See {@link
     * java.awt.Dialog.ModalExclusionType Dialog.ModalExclusionType} for
     * possible modal exclusion types.
     * <p>
     * If the given type is not supported, {@code NO_EXCLUDE} is used.
     * <p>
     * Note: changing the modal exclusion type for a visible window may have no
     * effect until it is hidden and then shown again.
     *
     * @param exclusionType the modal exclusion type for this window; a {@code null}
     *     value is equivalent to {@link Dialog.ModalExclusionType#NO_EXCLUDE
     *     NO_EXCLUDE}
     * @throws SecurityException if the calling thread does not have permission
     *     to set the modal exclusion property to the window with the given
     *     {@code exclusionType}
     * @see java.awt.Dialog.ModalExclusionType
     * @see java.awt.Window#getModalExclusionType
     * @see java.awt.Toolkit#isModalExclusionTypeSupported
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public static Window[] getOwnerlessWindows() {

    /**
     * Returns an array of all {@code Window}s created by this application
     * that have no owner. They include {@code Frame}s and ownerless
     * {@code Dialog}s and {@code Window}s.
     * If called from an applet, the array includes only the {@code Window}s
     * accessible by that applet.
     * <p>
     * <b>Warning:</b> this method may return system created windows, such
     * as a print dialog. Applications should not assume the existence of
     * these dialogs, nor should an application assume anything about these
     * dialogs such as component positions, {@code LayoutManager}s
     * or serialization.
     *
     * @see Frame#getFrames
     * @see Window#getWindows()
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public static Window[] getWindows() {

    /**
     * Returns an array of all {@code Window}s, both owned and ownerless,
     * created by this application.
     * If called from an applet, the array includes only the {@code Window}s
     * accessible by that applet.
     * <p>
     * <b>Warning:</b> this method may return system created windows, such
     * as a print dialog. Applications should not assume the existence of
     * these dialogs, nor should an application assume anything about these
     * dialogs such as component positions, {@code LayoutManager}s
     * or serialization.
     *
     * @see Frame#getFrames
     * @see Window#getOwnerlessWindows
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Window[] getOwnedWindows() {

    /**
     * Return an array containing all the windows this
     * window currently owns.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Window getOwner() {

    /**
     * Returns the owner of this window.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setCursor(Cursor cursor) {

    /**
     * Set the cursor image to a specified cursor.
     * <p>
     * The method may have no visual effect if the Java platform
     * implementation and/or the native system do not support
     * changing the mouse cursor shape.
     * @param     cursor One of the constants defined
     *            by the {@code Cursor} class. If this parameter is null
     *            then the cursor for this window will be set to the type
     *            Cursor.DEFAULT_CURSOR.
     * @see       Component#getCursor
     * @see       Cursor
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public InputContext getInputContext() {

    /**
     * Gets the input context for this window. A window always has an input context,
     * which is shared by subcomponents unless they create and set their own.
     * @see Component#getInputContext
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Locale getLocale() {

    /**
     * Gets the {@code Locale} object that is associated
     * with this window, if the locale has been set.
     * If no locale has been set, then the default locale
     * is returned.
     * @return    the locale that is set for this window.
     * @see       java.util.Locale
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public final String getWarningString() {

    /**
     * Gets the warning string that is displayed with this window.
     * If this window is insecure, the warning string is displayed
     * somewhere in the visible area of the window. A window is
     * insecure if there is a security manager and the security
     * manager denies
     * {@code AWTPermission("showWindowWithoutWarningBanner")}.
     * <p>
     * If the window is secure, then {@code getWarningString}
     * returns {@code null}. If the window is insecure, this
     * method checks for the system property
     * {@code awt.appletWarning}
     * and returns the string value of that property.
     * @return    the warning string for this window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Toolkit getToolkit() {

    /**
     * Returns the toolkit of this frame.
     * @return    the toolkit of this window.
     * @see       Toolkit
     * @see       Toolkit#getDefaultToolkit
     * @see       Component#getToolkit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void toBack() {

    /**
     * If this Window is visible, sends this Window to the back and may cause
     * it to lose focus or activation if it is the focused or active Window.
     * <p>
     * Places this Window at the bottom of the stacking order and shows it
     * behind any other Windows in this VM. No action will take place is this
     * Window is not visible. Some platforms do not allow Windows which are
     * owned by other Windows to appear below their owners. Every attempt will
     * be made to move this Window as low as possible in the stacking order;
     * however, developers should not assume that this method will move this
     * Window below all other windows in every situation.
     * <p>
     * Because of variations in native windowing systems, no guarantees about
     * changes to the focused and active Windows can be made. Developers must
     * never assume that this Window is no longer the focused or active Window
     * until this Window receives a WINDOW_LOST_FOCUS or WINDOW_DEACTIVATED
     * event. On platforms where the top-most window is the focused window,
     * this method will <b>probably</b> cause this Window to lose focus. In
     * that case, the next highest, focusable Window in this VM will receive
     * focus. On platforms where the stacking order does not typically affect
     * the focused window, this method will <b>probably</b> leave the focused
     * and active Windows unchanged.
     *
     * @see       #toFront
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void toFront() {

    /**
     * If this Window is visible, brings this Window to the front and may make
     * it the focused Window.
     * <p>
     * Places this Window at the top of the stacking order and shows it in
     * front of any other Windows in this VM. No action will take place if this
     * Window is not visible. Some platforms do not allow Windows which own
     * other Windows to appear on top of those owned Windows. Some platforms
     * may not permit this VM to place its Windows above windows of native
     * applications, or Windows of other VMs. This permission may depend on
     * whether a Window in this VM is already focused. Every attempt will be
     * made to move this Window as high as possible in the stacking order;
     * however, developers should not assume that this method will move this
     * Window above all other windows in every situation.
     * <p>
     * Developers must never assume that this Window is the focused or active
     * Window until this Window receives a WINDOW_GAINED_FOCUS or WINDOW_ACTIVATED
     * event. On platforms where the top-most window is the focused window, this
     * method will <b>probably</b> focus this Window (if it is not already focused)
     * under the following conditions:
     * <ul>
     * <li> The window meets the requirements outlined in the
     *      {@link #isFocusableWindow} method.
     * <li> The window's property {@code autoRequestFocus} is of the
     *      {@code true} value.
     * <li> Native windowing system allows the window to get focused.
     * </ul>
     * On platforms where the stacking order does not typically affect the focused
     * window, this method will <b>probably</b> leave the focused and active
     * Windows unchanged.
     * <p>
     * If this method causes this Window to be focused, and this Window is a
     * Frame or a Dialog, it will also become activated. If this Window is
     * focused, but it is not a Frame or a Dialog, then the first Frame or
     * Dialog that is an owner of this Window will be activated.
     * <p>
     * If this window is blocked by modal dialog, then the blocking dialog
     * is brought to the front and remains above the blocked window.
     *
     * @see       #toBack
     * @see       #setAutoRequestFocus
     * @see       #isFocusableWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void dispose() {

    /**
     * Releases all of the native screen resources used by this
     * {@code Window}, its subcomponents, and all of its owned
     * children. That is, the resources for these {@code Component}s
     * will be destroyed, any memory they consume will be returned to the
     * OS, and they will be marked as undisplayable.
     * <p>
     * The {@code Window} and its subcomponents can be made displayable
     * again by rebuilding the native resources with a subsequent call to
     * {@code pack} or {@code show}. The states of the recreated
     * {@code Window} and its subcomponents will be identical to the
     * states of these objects at the point where the {@code Window}
     * was disposed (not accounting for additional modifications between
     * those actions).
     * <p>
     * <b>Note</b>: When the last displayable window
     * within the Java virtual machine (VM) is disposed of, the VM may
     * terminate.  See <a href="doc-files/AWTThreadIssues.html#Autoshutdown">
     * AWT Threading Issues</a> for more information.
     * @see Component#isDisplayable
     * @see #pack
     * @see #show
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Deprecated

    /**
     * Hide this Window, its subcomponents, and all of its owned children.
     * The Window and its subcomponents can be made visible again
     * with a call to {@code show}.
     * @see #show
     * @see #dispose
     * @deprecated As of JDK version 1.5, replaced by
     * {@link #setVisible(boolean)}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Deprecated

    /**
     * Makes the Window visible. If the Window and/or its owner
     * are not yet displayable, both are made displayable.  The
     * Window will be validated prior to being made visible.
     * If the Window is already visible, this will bring the Window
     * to the front.
     * @see       Component#isDisplayable
     * @see       #toFront
     * @deprecated As of JDK version 1.5, replaced by
     * {@link #setVisible(boolean)}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setVisible(boolean b) {

    /**
     * Shows or hides this {@code Window} depending on the value of parameter
     * {@code b}.
     * <p>
     * If the method shows the window then the window is also made
     * focused under the following conditions:
     * <ul>
     * <li> The {@code Window} meets the requirements outlined in the
     *      {@link #isFocusableWindow} method.
     * <li> The {@code Window}'s {@code autoRequestFocus} property is of the {@code true} value.
     * <li> Native windowing system allows the {@code Window} to get focused.
     * </ul>
     * There is an exception for the second condition (the value of the
     * {@code autoRequestFocus} property). The property is not taken into account if the
     * window is a modal dialog, which blocks the currently focused window.
     * <p>
     * Developers must never assume that the window is the focused or active window
     * until it receives a WINDOW_GAINED_FOCUS or WINDOW_ACTIVATED event.
     * @param b  if {@code true}, makes the {@code Window} visible,
     * otherwise hides the {@code Window}.
     * If the {@code Window} and/or its owner
     * are not yet displayable, both are made displayable.  The
     * {@code Window} will be validated prior to being made visible.
     * If the {@code Window} is already visible, this will bring the
     * {@code Window} to the front.<p>
     * If {@code false}, hides this {@code Window}, its subcomponents, and all
     * of its owned children.
     * The {@code Window} and its subcomponents can be made visible again
     * with a call to {@code #setVisible(true)}.
     * @see java.awt.Component#isDisplayable
     * @see java.awt.Component#setVisible
     * @see java.awt.Window#toFront
     * @see java.awt.Window#dispose
     * @see java.awt.Window#setAutoRequestFocus
     * @see java.awt.Window#isFocusableWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by {@code setBounds(int, int, int, int)}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * {@inheritDoc}
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    @Override

    /**
     * {@inheritDoc}
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setSize(int width, int height) {

    /**
     * {@inheritDoc}
     * <p>
     * The {@code width} and {@code height} values
     * are automatically enlarged if either is less than
     * the minimum size as specified by previous call to
     * {@code setMinimumSize}.
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     *
     * @see #getSize
     * @see #setBounds
     * @see #setMinimumSize
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setSize(Dimension d) {

    /**
     * {@inheritDoc}
     * <p>
     * The {@code d.width} and {@code d.height} values
     * are automatically enlarged if either is less than
     * the minimum size as specified by previous call to
     * {@code setMinimumSize}.
     * <p>
     * The method changes the geometry-related data. Therefore,
     * the native windowing system may ignore such requests, or it may modify
     * the requested data, so that the {@code Window} object is placed and sized
     * in a way that corresponds closely to the desktop settings.
     *
     * @see #getSize
     * @see #setBounds
     * @see #setMinimumSize
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setMinimumSize(Dimension minimumSize) {

    /**
     * Sets the minimum size of this window to a constant
     * value.  Subsequent calls to {@code getMinimumSize}
     * will always return this value. If current window's
     * size is less than {@code minimumSize} the size of the
     * window is automatically enlarged to honor the minimum size.
     * <p>
     * If the {@code setSize} or {@code setBounds} methods
     * are called afterwards with a width or height less than
     * that was specified by the {@code setMinimumSize} method
     * the window is automatically enlarged to meet
     * the {@code minimumSize} value. The {@code minimumSize}
     * value also affects the behaviour of the {@code pack} method.
     * <p>
     * The default behavior is restored by setting the minimum size
     * parameter to the {@code null} value.
     * <p>
     * Resizing operation may be restricted if the user tries
     * to resize window below the {@code minimumSize} value.
     * This behaviour is platform-dependent.
     *
     * @param minimumSize the new minimum size of this window
     * @see Component#setMinimumSize
     * @see #getMinimumSize
     * @see #isMinimumSizeSet
     * @see #setSize(Dimension)
     * @see #pack
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void pack() {

    /**
     * Causes this Window to be sized to fit the preferred size
     * and layouts of its subcomponents. The resulting width and
     * height of the window are automatically enlarged if either
     * of dimensions is less than the minimum size as specified
     * by the previous call to the {@code setMinimumSize} method.
     * <p>
     * If the window and/or its owner are not displayable yet,
     * both of them are made displayable before calculating
     * the preferred size. The Window is validated after its
     * size is being calculated.
     *
     * @see Component#isDisplayable
     * @see #setMinimumSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void removeNotify() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void addNotify() {

    /**
     * Makes this Window displayable by creating the connection to its
     * native screen resource.
     * This method is called internally by the toolkit and should
     * not be called directly by programs.
     * @see Component#isDisplayable
     * @see Container#removeNotify
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public void setIconImage(Image image) {

    /**
     * Sets the image to be displayed as the icon for this window.
     * <p>
     * This method can be used instead of {@link #setIconImages setIconImages()}
     * to specify a single image as a window's icon.
     * <p>
     * The following statement:
     * <pre>
     *     setIconImage(image);
     * </pre>
     * is equivalent to:
     * <pre>
     *     ArrayList&lt;Image&gt; imageList = new ArrayList&lt;Image&gt;();
     *     imageList.add(image);
     *     setIconImages(imageList);
     * </pre>
     * <p>
     * Note : Native windowing systems may use different images of differing
     * dimensions to represent a window, depending on the context (e.g.
     * window decoration, window list, taskbar, etc.). They could also use
     * just a single image for all contexts or no image at all.
     *
     * @param     image the icon image to be displayed.
     * @see       #setIconImages
     * @see       #getIconImages()
     * @since     1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public synchronized void setIconImages(java.util.List<? extends Image> icons) {

    /**
     * Sets the sequence of images to be displayed as the icon
     * for this window. Subsequent calls to {@code getIconImages} will
     * always return a copy of the {@code icons} list.
     * <p>
     * Depending on the platform capabilities one or several images
     * of different dimensions will be used as the window's icon.
     * <p>
     * The {@code icons} list is scanned for the images of most
     * appropriate dimensions from the beginning. If the list contains
     * several images of the same size, the first will be used.
     * <p>
     * Ownerless windows with no icon specified use platfrom-default icon.
     * The icon of an owned window may be inherited from the owner
     * unless explicitly overridden.
     * Setting the icon to {@code null} or empty list restores
     * the default behavior.
     * <p>
     * Note : Native windowing systems may use different images of differing
     * dimensions to represent a window, depending on the context (e.g.
     * window decoration, window list, taskbar, etc.). They could also use
     * just a single image for all contexts or no image at all.
     *
     * @param     icons the list of icon images to be displayed.
     * @see       #getIconImages()
     * @see       #setIconImage(Image)
     * @since     1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public java.util.List<Image> getIconImages() {

    /**
     * Returns the sequence of images to be displayed as the icon for this window.
     * <p>
     * This method returns a copy of the internally stored list, so all operations
     * on the returned object will not affect the window's behavior.
     *
     * @return    the copy of icon images' list for this window, or
     *            empty list if this window doesn't have icon images.
     * @see       #setIconImages
     * @see       #setIconImage(Image)
     * @since     1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    String constructComponentName() {

    /**
     * Construct a name for this component.  Called by getName() when the
     * name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Window(Window owner, GraphicsConfiguration gc) {

    /**
     * Constructs a new, initially invisible window with the specified owner
     * {@code Window} and a {@code GraphicsConfiguration}
     * of a screen device. The Window will not be focusable unless
     * its nearest owning {@code Frame} or {@code Dialog}
     * is showing on the screen.
     * <p>
     * If there is a security manager set, it is invoked to check
     * {@code AWTPermission("showWindowWithoutWarningBanner")}. If that
     * check fails with a {@code SecurityException} then a warning banner
     * is created.
     *
     * @param owner the window to act as owner or {@code null}
     *     if this window has no owner
     * @param gc the {@code GraphicsConfiguration} of the target
     *     screen device; if {@code gc} is {@code null},
     *     the system default {@code GraphicsConfiguration} is assumed
     * @exception IllegalArgumentException if {@code gc}
     *     is not from a screen device
     * @exception HeadlessException when
     *     {@code GraphicsEnvironment.isHeadless()} returns
     *     {@code true}
     *
     * @see       java.awt.GraphicsEnvironment#isHeadless
     * @see       GraphicsConfiguration#getBounds
     * @see       #isShowing
     * @since     1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Window(Window owner) {

    /**
     * Constructs a new, initially invisible window with the specified
     * {@code Window} as its owner. This window will not be focusable
     * unless its nearest owning {@code Frame} or {@code Dialog}
     * is showing on the screen.
     * <p>
     * If there is a security manager set, it is invoked to check
     * {@code AWTPermission("showWindowWithoutWarningBanner")}.
     * If that check fails with a {@code SecurityException} then a
     * warning banner is created.
     *
     * @param owner the {@code Window} to act as owner or
     *     {@code null} if this window has no owner
     * @exception IllegalArgumentException if the {@code owner}'s
     *     {@code GraphicsConfiguration} is not from a screen device
     * @exception HeadlessException when
     *     {@code GraphicsEnvironment.isHeadless()} returns
     *     {@code true}
     *
     * @see       java.awt.GraphicsEnvironment#isHeadless
     * @see       #isShowing
     *
     * @since     1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public Window(Frame owner) {

    /**
     * Constructs a new, initially invisible window with the specified
     * {@code Frame} as its owner. The window will not be focusable
     * unless its owner is showing on the screen.
     * <p>
     * If there is a security manager set, it is invoked to check
     * {@code AWTPermission("showWindowWithoutWarningBanner")}.
     * If that check fails with a {@code SecurityException} then a warning
     * banner is created.
     *
     * @param owner the {@code Frame} to act as owner or {@code null}
     *    if this window has no owner
     * @exception IllegalArgumentException if the {@code owner}'s
     *    {@code GraphicsConfiguration} is not from a screen device
     * @exception HeadlessException when
     *    {@code GraphicsEnvironment.isHeadless} returns {@code true}
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #isShowing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    Window() throws HeadlessException {

    /**
     * Constructs a new, initially invisible window in the default size.
     * <p>
     * If there is a security manager set, it is invoked to check
     * {@code AWTPermission("showWindowWithoutWarningBanner")}.
     * If that check fails with a {@code SecurityException} then a warning
     * banner is created.
     *
     * @exception HeadlessException when
     *     {@code GraphicsEnvironment.isHeadless()} returns {@code true}
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    Window(GraphicsConfiguration gc) {

    /**
     * Constructs a new, initially invisible window in default size with the
     * specified {@code GraphicsConfiguration}.
     * <p>
     * If there is a security manager, then it is invoked to check
     * {@code AWTPermission("showWindowWithoutWarningBanner")}
     * to determine whether or not the window must be displayed with
     * a warning banner.
     *
     * @param gc the {@code GraphicsConfiguration} of the target screen
     *     device. If {@code gc} is {@code null}, the system default
     *     {@code GraphicsConfiguration} is assumed
     * @exception IllegalArgumentException if {@code gc}
     *    is not from a screen device
     * @exception HeadlessException when
     *     {@code GraphicsEnvironment.isHeadless()} returns {@code true}
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
       accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private transient double securityWarningPointX = 2.0;

    /**
     * These fields represent the desired location for the security
     * warning if this window is untrusted.
     * See com.sun.awt.SecurityWarning for more details.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private transient volatile int securityWarningWidth = 0;

    /**
     * These fields are initialized in the native peer code
     * or via AWTAccessor's WindowAccessor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private Shape shape = null;

    /**
     * The shape assigned to this window. This field is set to {@code null} if
     * no shape is set (rectangular window).
     *
     * @serial
     * @see #getShape()
     * @see #setShape(Shape)
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private float opacity = 1.0f;

    /**
     * The opacity level of the window
     *
     * @serial
     * @see #setOpacity(float)
     * @see #getOpacity()
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private volatile boolean autoRequestFocus = true;

    /**
     * Indicates whether this window should receive focus on
     * subsequently being shown (with a call to {@code setVisible(true)}), or
     * being moved to the front (with a call to {@code toFront()}).
     *
     * @serial
     * @see #setAutoRequestFocus
     * @see #isAutoRequestFocus
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private boolean focusableWindowState = true;

    /**
     * Indicates whether this Window can become the focused Window.
     *
     * @serial
     * @see #getFocusableWindowState
     * @see #setFocusableWindowState
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private FocusManager focusMgr;

    /**
     * Unused. Maintained for serialization backward-compatibility.
     *
     * @serial
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    Dialog.ModalExclusionType modalExclusionType;

    /**
     * @serial
     *
     * @see java.awt.Dialog.ModalExclusionType
     * @see #getModalExclusionType
     * @see #setModalExclusionType
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    transient Dialog modalBlocker;

    /**
     * Contains the modal dialog that blocks this window, or null
     * if the window is unblocked.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    transient Vector<WeakReference<Window>> ownedWindowList =

    /**
     * A vector containing all the windows this
     * window currently owns.
     * @since 1.2
     * @see #getOwnedWindows
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private static final IdentityArrayList<Window> allWindows = new IdentityArrayList<Window>();

    /**
     * Contains all the windows that have a peer object associated,
     * i. e. between addNotify() and removeNotify() calls. The list
     * of all Window instances can be obtained from AppContext object.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private boolean alwaysOnTop;

    /**
     * A boolean value representing Window always-on-top state
     * @since 1.5
     * @serial
     * @see #setAlwaysOnTop
     * @see #isAlwaysOnTop
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    int state;

    /**
     * An Integer value representing the Window State.
     *
     * @serial
     * @since 1.2
     * @see #show
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    private transient Component temporaryLostComponent;

    /**
     * Holds the reference to the component which last had focus in this window
     * before it lost focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    transient java.util.List<Image> icons;

    /**
     * {@code icons} is the graphical way we can
     * represent the frames and dialogs.
     * {@code Window} can't display icon but it's
     * being inherited by owned {@code Dialog}s.
     *
     * @serial
     * @see #getIconImages
     * @see #setIconImages
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    String      warningString;

    /**
     * This represents the warning message that is
     * to be displayed in a non secure window. ie :
     * a window that has a security manager installed that denies
     * {@code AWTPermission("showWindowWithoutWarningBanner")}.
     * This message can be displayed anywhere in the window.
     *
     * @serial
     * @see #getWarningString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
        POPUP

        /**
         * Represents a <i>popup</i> window.
         *
         * A popup window is a temporary window such as a drop-down menu or a
         * tooltip. On some platforms, windows of that type may be forcibly
         * made undecorated even if they are instances of the {@code Frame} or
         * {@code Dialog} class, and have decorations enabled.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
        UTILITY,

        /**
         * Represents a <i>utility</i> window.
         *
         * A utility window is usually a small window such as a toolbar or a
         * palette. The native system may render the window with smaller
         * title-bar if the window is either a {@code Frame} or a {@code
         * Dialog} object, and if it has its decorations enabled.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
    public static enum Type {

    /**
     * Enumeration of available <i>window types</i>.
     *
     * A window type defines the generic visual appearance and behavior of a
     * top-level window. For example, the type may affect the kind of
     * decorations of a decorated {@code Frame} or {@code Dialog} instance.
     * <p>
     * Some platforms may not fully support a certain window type. Depending on
     * the level of support, some properties of the window type may be
     * disobeyed.
     *
     * @see   #getType
     * @see   #setType
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Window.java
public class Window extends Container implements Accessible {

/**
 * A {@code Window} object is a top-level window with no borders and no
 * menubar.
 * The default layout for a window is {@code BorderLayout}.
 * <p>
 * A window must have either a frame, dialog, or another window defined as its
 * owner when it's constructed.
 * <p>
 * In a multi-screen environment, you can create a {@code Window}
 * on a different screen device by constructing the {@code Window}
 * with {@link #Window(Window, GraphicsConfiguration)}.  The
 * {@code GraphicsConfiguration} object is one of the
 * {@code GraphicsConfiguration} objects of the target screen device.
 * <p>
 * In a virtual device multi-screen environment in which the desktop
 * area could span multiple physical screen devices, the bounds of all
 * configurations are relative to the virtual device coordinate system.
 * The origin of the virtual-coordinate system is at the upper left-hand
 * corner of the primary physical screen.  Depending on the location of
 * the primary screen in the virtual device, negative coordinates are
 * possible, as shown in the following figure.
 * <p>
 * <img src="doc-files/MultiScreen.gif"
 * alt="Diagram shows virtual device containing 4 physical screens. Primary physical screen shows coords (0,0), other screen shows (-80,-100)."
 * style="float:center; margin: 7px 10px;">
 * <p>
 * In such an environment, when calling {@code setLocation},
 * you must pass a virtual coordinate to this method.  Similarly,
 * calling {@code getLocationOnScreen} on a {@code Window} returns
 * virtual device coordinates.  Call the {@code getBounds} method
 * of a {@code GraphicsConfiguration} to find its origin in the virtual
 * coordinate system.
 * <p>
 * The following code sets the location of a {@code Window}
 * at (10, 10) relative to the origin of the physical screen
 * of the corresponding {@code GraphicsConfiguration}.  If the
 * bounds of the {@code GraphicsConfiguration} is not taken
 * into account, the {@code Window} location would be set
 * at (10, 10) relative to the virtual-coordinate system and would appear
 * on the primary physical screen, which might be different from the
 * physical screen of the specified {@code GraphicsConfiguration}.
 *
 * <pre>
 *      Window w = new Window(Window owner, GraphicsConfiguration gc);
 *      Rectangle bounds = gc.getBounds();
 *      w.setLocation(10 + bounds.x, 10 + bounds.y);
 * </pre>
 *
 * <p>
 * Note: the location and size of top-level windows (including
 * {@code Window}s, {@code Frame}s, and {@code Dialog}s)
 * are under the control of the desktop's window management system.
 * Calls to {@code setLocation}, {@code setSize}, and
 * {@code setBounds} are requests (not directives) which are
 * forwarded to the window management system.  Every effort will be
 * made to honor such requests.  However, in some cases the window
 * management system may ignore such requests, or modify the requested
 * geometry in order to place and size the {@code Window} in a way
 * that more closely matches the desktop settings.
 * <p>
 * Due to the asynchronous nature of native event handling, the results
 * returned by {@code getBounds}, {@code getLocation},
 * {@code getLocationOnScreen}, and {@code getSize} might not
 * reflect the actual geometry of the Window on screen until the last
 * request has been processed.  During the processing of subsequent
 * requests these values might change accordingly while the window
 * management system fulfills the requests.
 * <p>
 * An application may set the size and location of an invisible
 * {@code Window} arbitrarily, but the window management system may
 * subsequently change its size and/or location when the
 * {@code Window} is made visible. One or more {@code ComponentEvent}s
 * will be generated to indicate the new geometry.
 * <p>
 * Windows are capable of generating the following WindowEvents:
 * WindowOpened, WindowClosed, WindowGainedFocus, WindowLostFocus.
 *
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 * @see WindowEvent
 * @see #addWindowListener
 * @see java.awt.BorderLayout
 * @since       JDK1.0
 */
