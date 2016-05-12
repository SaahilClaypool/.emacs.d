_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private void readObject(ObjectInputStream s)

    /**
     * Sets new modifiers by the old ones.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private void setOldModifiers() {

    /**
     * Sets old modifiers by the new ones.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private void setNewModifiers() {

    /**
     * Sets new modifiers by the old ones.
     * Also sets button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public String paramString() {

    /**
     * Returns a parameter string identifying this event.
     * This method is useful for event-logging and for debugging.
     *
     * @return a string identifying the event and its attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static String getMouseModifiersText(int modifiers) {

    /**
     * Returns a <code>String</code> instance describing the modifier keys and
     * mouse buttons that were down during the event, such as "Shift",
     * or "Ctrl+Shift". These strings can be localized by changing
     * the <code>awt.properties</code> file.
     * <p>
     * Note that the <code>InputEvent.ALT_MASK</code> and
     * <code>InputEvent.BUTTON2_MASK</code> have equal values,
     * so the "Alt" string is returned for both modifiers.  Likewise,
     * the <code>InputEvent.META_MASK</code> and
     * <code>InputEvent.BUTTON3_MASK</code> have equal values,
     * so the "Meta" string is returned for both modifiers.
     * <p>
     * Note that passing negative parameter is incorrect,
     * and will cause the returning an unspecified string.
     * Zero parameter means that no modifiers were passed and will
     * cause the returning an empty string.
     * <p>
     * @param modifiers A modifier mask describing the modifier keys and
     *                  mouse buttons that were down during the event
     * @return string   string text description of the combination of modifier
     *                  keys and mouse buttons that were down during the event
     * @see InputEvent#getModifiersExText(int)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public boolean isPopupTrigger() {

    /**
     * Returns whether or not this mouse event is the popup menu
     * trigger event for the platform.
     * <p><b>Note</b>: Popup menus are triggered differently
     * on different systems. Therefore, <code>isPopupTrigger</code>
     * should be checked in both <code>mousePressed</code>
     * and <code>mouseReleased</code>
     * for proper cross-platform functionality.
     *
     * @return boolean, true if this event is the popup menu trigger
     *         for this platform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getButton() {

    /**
     * Returns which, if any, of the mouse buttons has changed state.
     * The returned value is ranged
     * from 0 to the {@link java.awt.MouseInfo#getNumberOfButtons() MouseInfo.getNumberOfButtons()}
     * value.
     * The returned value includes at least the following constants:
     * <ul>
     * <li> {@code NOBUTTON}
     * <li> {@code BUTTON1}
     * <li> {@code BUTTON2}
     * <li> {@code BUTTON3}
     * </ul>
     * It is allowed to use those constants to compare with the returned button number in the application.
     * For example,
     * <pre>
     * if (anEvent.getButton() == MouseEvent.BUTTON1) {
     * </pre>
     * In particular, for a mouse with one, two, or three buttons this method may return the following values:
     * <ul>
     * <li> 0 ({@code NOBUTTON})
     * <li> 1 ({@code BUTTON1})
     * <li> 2 ({@code BUTTON2})
     * <li> 3 ({@code BUTTON3})
     * </ul>
     * Button numbers greater then {@code BUTTON3} have no constant identifier. So if a mouse with five buttons is
     * installed, this method may return the following values:
     * <ul>
     * <li> 0 ({@code NOBUTTON})
     * <li> 1 ({@code BUTTON1})
     * <li> 2 ({@code BUTTON2})
     * <li> 3 ({@code BUTTON3})
     * <li> 4
     * <li> 5
     * </ul>
     * <p>
     * Note: If support for extended mouse buttons is {@link Toolkit#areExtraMouseButtonsEnabled() disabled} by Java
     * then the AWT event subsystem does not produce mouse events for the extended mouse
     * buttons. So it is not expected that this method returns anything except {@code NOBUTTON}, {@code BUTTON1},
     * {@code BUTTON2}, {@code BUTTON3}.
     *
     * @return one of the values from 0 to {@link java.awt.MouseInfo#getNumberOfButtons() MouseInfo.getNumberOfButtons()}
     *         if support for the extended mouse buttons is {@link Toolkit#areExtraMouseButtonsEnabled() enabled} by Java.
     *         That range includes {@code NOBUTTON}, {@code BUTTON1}, {@code BUTTON2}, {@code BUTTON3};
     *         <br>
     *         {@code NOBUTTON}, {@code BUTTON1}, {@code BUTTON2} or {@code BUTTON3}
     *         if support for the extended mouse buttons is {@link Toolkit#areExtraMouseButtonsEnabled() disabled} by Java
     * @since 1.4
     * @see Toolkit#areExtraMouseButtonsEnabled()
     * @see java.awt.MouseInfo#getNumberOfButtons()
     * @see #MouseEvent(Component, int, long, int, int, int, int, int, int, boolean, int)
     * @see InputEvent#getMaskForButton(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getClickCount() {

    /**
     * Returns the number of mouse clicks associated with this event.
     *
     * @return integer value for the number of clicks
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public synchronized void translatePoint(int x, int y) {

    /**
     * Translates the event's coordinates to a new position
     * by adding specified <code>x</code> (horizontal) and <code>y</code>
     * (vertical) offsets.
     *
     * @param x the horizontal x value to add to the current x
     *          coordinate position
     * @param y the vertical y value to add to the current y
                coordinate position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public Point getPoint() {

    /**
     * Returns the x,y position of the event relative to the source component.
     *
     * @return a <code>Point</code> object containing the x and y coordinates
     *         relative to the source component
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getY() {

    /**
     * Returns the vertical y position of the event relative to the
     * source component.
     *
     * @return y  an integer indicating vertical position relative to
     *            the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getX() {

    /**
     * Returns the horizontal x position of the event relative to the
     * source component.
     *
     * @return x  an integer indicating horizontal position relative to
     *            the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public MouseEvent(Component source, int id, long when, int modifiers,
                      int x, int y, int xAbs, int yAbs,
                      int clickCount, boolean popupTrigger, int button)

    /**
     * Constructs a <code>MouseEvent</code> object with the
     * specified source component,
     * type, time, modifiers, coordinates, absolute coordinates, click count, popupTrigger flag,
     * and button number.
     * <p>
     * Creating an invalid event (such
     * as by using more than one of the old _MASKs, or modifier/button
     * values which don't match) results in unspecified behavior.
     * Even if inconsistent values for relative and absolute coordinates are
     * passed to the constructor, the mouse event instance is still
     * created and no exception is thrown.
     * This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source       The <code>Component</code> that originated the event
     * @param id              An integer indicating the type of event.
     *                     For information on allowable values, see
     *                     the class description for {@link MouseEvent}
     * @param when         A long integer that gives the time the event occurred.
     *                     Passing negative or zero value
     *                     is not recommended
     * @param modifiers    a modifier mask describing the modifier keys and mouse
     *                     buttons (for example, shift, ctrl, alt, and meta) that
     *                     are down during the event.
     *                     Only extended modifiers are allowed to be used as a
     *                     value for this parameter (see the {@link InputEvent#getModifiersEx}
     *                     class for the description of extended modifiers).
     *                     Passing negative parameter
     *                     is not recommended.
     *                     Zero value means that no modifiers were passed
     * @param x            The horizontal x coordinate for the mouse location.
     *                       It is allowed to pass negative values
     * @param y            The vertical y coordinate for the mouse location.
     *                       It is allowed to pass negative values
     * @param xAbs           The absolute horizontal x coordinate for the mouse location
     *                       It is allowed to pass negative values
     * @param yAbs           The absolute vertical y coordinate for the mouse location
     *                       It is allowed to pass negative values
     * @param clickCount   The number of mouse clicks associated with event.
     *                       Passing negative value
     *                       is not recommended
     * @param popupTrigger A boolean that equals {@code true} if this event
     *                     is a trigger for a popup menu
     * @param button       An integer that indicates, which of the mouse buttons has
     *                     changed its state.
     * The following rules are applied to this parameter:
     * <ul>
     * <li>If support for the extended mouse buttons is
     * {@link Toolkit#areExtraMouseButtonsEnabled() disabled} by Java
     * then it is allowed to create {@code MouseEvent} objects only with the standard buttons:
     * {@code NOBUTTON}, {@code BUTTON1}, {@code BUTTON2}, and
     * {@code BUTTON3}.
     * <li> If support for the extended mouse buttons is
     * {@link Toolkit#areExtraMouseButtonsEnabled() enabled} by Java
     * then it is allowed to create {@code MouseEvent} objects with
     * the standard buttons.
     * In case the support for extended mouse buttons is
     * {@link Toolkit#areExtraMouseButtonsEnabled() enabled} by Java, then
     * in addition to the standard buttons, {@code MouseEvent} objects can be created
     * using buttons from the range starting from 4 to
     * {@link java.awt.MouseInfo#getNumberOfButtons() MouseInfo.getNumberOfButtons()}
     * if the mouse has more than three buttons.
     * </ul>
     * @throws IllegalArgumentException if {@code button} is less then zero
     * @throws IllegalArgumentException if <code>source</code> is null
     * @throws IllegalArgumentException if {@code button} is greater then BUTTON3 and the support for extended mouse buttons is
     *                                  {@link Toolkit#areExtraMouseButtonsEnabled() disabled} by Java
     * @throws IllegalArgumentException if {@code button} is greater then the
     *                                  {@link java.awt.MouseInfo#getNumberOfButtons() current number of buttons} and the support
     *                                  for extended mouse buttons is {@link Toolkit#areExtraMouseButtonsEnabled() enabled}
     *                                  by Java
     * @throws IllegalArgumentException if an invalid <code>button</code>
     *            value is passed in
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getWhen()
     * @see #getModifiers()
     * @see #getX()
     * @see #getY()
     * @see #getXOnScreen()
     * @see #getYOnScreen()
     * @see #getClickCount()
     * @see #isPopupTrigger()
     * @see #getButton()
     * @see #button
     * @see Toolkit#areExtraMouseButtonsEnabled()
     * @see java.awt.MouseInfo#getNumberOfButtons()
     * @see InputEvent#getMaskForButton(int)
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getModifiersEx() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
     public MouseEvent(Component source, int id, long when, int modifiers,
                      int x, int y, int clickCount, boolean popupTrigger) {

    /**
     * Constructs a <code>MouseEvent</code> object with the
     * specified source component,
     * type, modifiers, coordinates, click count, and popupTrigger flag.
     * An invocation of the form
     * <tt>MouseEvent(source, id, when, modifiers, x, y, clickCount, popupTrigger)</tt>
     * behaves in exactly the same way as the invocation
     * <tt> {@link #MouseEvent(Component, int, long, int, int, int,
     * int, int, int, boolean, int) MouseEvent}(source, id, when, modifiers,
     * x, y, xAbs, yAbs, clickCount, popupTrigger, MouseEvent.NOBUTTON)</tt>
     * where xAbs and yAbs defines as source's location on screen plus
     * relative coordinates x and y.
     * xAbs and yAbs are set to zero if the source is not showing.
     * This method throws an <code>IllegalArgumentException</code>
     * if <code>source</code> is <code>null</code>.
     *
     * @param source       The <code>Component</code> that originated the event
     * @param id              An integer indicating the type of event.
     *                     For information on allowable values, see
     *                     the class description for {@link MouseEvent}
     * @param when         A long integer that gives the time the event occurred.
     *                     Passing negative or zero value
     *                     is not recommended
     * @param modifiers    a modifier mask describing the modifier keys and mouse
     *                     buttons (for example, shift, ctrl, alt, and meta) that
     *                     are down during the event.
     *                     Only extended modifiers are allowed to be used as a
     *                     value for this parameter (see the {@link InputEvent#getModifiersEx}
     *                     class for the description of extended modifiers).
     *                     Passing negative parameter
     *                     is not recommended.
     *                     Zero value means that no modifiers were passed
     * @param x            The horizontal x coordinate for the mouse location.
     *                       It is allowed to pass negative values
     * @param y            The vertical y coordinate for the mouse location.
     *                       It is allowed to pass negative values
     * @param clickCount   The number of mouse clicks associated with event.
     *                       Passing negative value
     *                       is not recommended
     * @param popupTrigger A boolean that equals {@code true} if this event
     *                     is a trigger for a popup menu
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getWhen()
     * @see #getModifiers()
     * @see #getX()
     * @see #getY()
     * @see #getClickCount()
     * @see #isPopupTrigger()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public MouseEvent(Component source, int id, long when, int modifiers,
                      int x, int y, int clickCount, boolean popupTrigger,
                      int button)

    /**
     * Constructs a <code>MouseEvent</code> object with the
     * specified source component,
     * type, time, modifiers, coordinates, click count, popupTrigger flag,
     * and button number.
     * <p>
     * Creating an invalid event (such
     * as by using more than one of the old _MASKs, or modifier/button
     * values which don't match) results in unspecified behavior.
     * An invocation of the form
     * <tt>MouseEvent(source, id, when, modifiers, x, y, clickCount, popupTrigger, button)</tt>
     * behaves in exactly the same way as the invocation
     * <tt> {@link #MouseEvent(Component, int, long, int, int, int,
     * int, int, int, boolean, int) MouseEvent}(source, id, when, modifiers,
     * x, y, xAbs, yAbs, clickCount, popupTrigger, button)</tt>
     * where xAbs and yAbs defines as source's location on screen plus
     * relative coordinates x and y.
     * xAbs and yAbs are set to zero if the source is not showing.
     * This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source       The <code>Component</code> that originated the event
     * @param id              An integer indicating the type of event.
     *                     For information on allowable values, see
     *                     the class description for {@link MouseEvent}
     * @param when         A long integer that gives the time the event occurred.
     *                     Passing negative or zero value
     *                     is not recommended
     * @param modifiers    a modifier mask describing the modifier keys and mouse
     *                     buttons (for example, shift, ctrl, alt, and meta) that
     *                     are down during the event.
     *                     Only extended modifiers are allowed to be used as a
     *                     value for this parameter (see the {@link InputEvent#getModifiersEx}
     *                     class for the description of extended modifiers).
     *                     Passing negative parameter
     *                     is not recommended.
     *                     Zero value means that no modifiers were passed
     * @param x            The horizontal x coordinate for the mouse location.
     *                       It is allowed to pass negative values
     * @param y            The vertical y coordinate for the mouse location.
     *                       It is allowed to pass negative values
     * @param clickCount   The number of mouse clicks associated with event.
     *                       Passing negative value
     *                       is not recommended
     * @param popupTrigger A boolean that equals {@code true} if this event
     *                     is a trigger for a popup menu
     * @param button       An integer that indicates, which of the mouse buttons has
     *                     changed its state.
     * The following rules are applied to this parameter:
     * <ul>
     * <li>If support for the extended mouse buttons is
     * {@link Toolkit#areExtraMouseButtonsEnabled() disabled} by Java
     * then it is allowed to create {@code MouseEvent} objects only with the standard buttons:
     * {@code NOBUTTON}, {@code BUTTON1}, {@code BUTTON2}, and
     * {@code BUTTON3}.
     * <li> If support for the extended mouse buttons is
     * {@link Toolkit#areExtraMouseButtonsEnabled() enabled} by Java
     * then it is allowed to create {@code MouseEvent} objects with
     * the standard buttons.
     * In case the support for extended mouse buttons is
     * {@link Toolkit#areExtraMouseButtonsEnabled() enabled} by Java, then
     * in addition to the standard buttons, {@code MouseEvent} objects can be created
     * using buttons from the range starting from 4 to
     * {@link java.awt.MouseInfo#getNumberOfButtons() MouseInfo.getNumberOfButtons()}
     * if the mouse has more than three buttons.
     * </ul>
     * @throws IllegalArgumentException if {@code button} is less then zero
     * @throws IllegalArgumentException if <code>source</code> is null
     * @throws IllegalArgumentException if {@code button} is greater then BUTTON3 and the support for extended mouse buttons is
     *                                  {@link Toolkit#areExtraMouseButtonsEnabled() disabled} by Java
     * @throws IllegalArgumentException if {@code button} is greater then the
     *                                  {@link java.awt.MouseInfo#getNumberOfButtons() current number of buttons} and the support
     *                                  for extended mouse buttons is {@link Toolkit#areExtraMouseButtonsEnabled() enabled}
     *                                  by Java
     * @throws IllegalArgumentException if an invalid <code>button</code>
     *            value is passed in
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getWhen()
     * @see #getModifiers()
     * @see #getX()
     * @see #getY()
     * @see #getClickCount()
     * @see #isPopupTrigger()
     * @see #getButton()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getYOnScreen() {

    /**
     * Returns the absolute vertical y position of the event.
     * In a virtual device multi-screen environment in which the
     * desktop area could span multiple physical screen devices,
     * this coordinate is relative to the virtual coordinate system.
     * Otherwise, this coordinate is relative to the coordinate system
     * associated with the Component's GraphicsConfiguration.
     *
     * @return y  an integer indicating absolute vertical position.
     *
     * @see java.awt.GraphicsConfiguration
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getXOnScreen() {

    /**
     * Returns the absolute horizontal x position of the event.
     * In a virtual device multi-screen environment in which the
     * desktop area could span multiple physical screen devices,
     * this coordinate is relative to the virtual coordinate system.
     * Otherwise, this coordinate is relative to the coordinate system
     * associated with the Component's GraphicsConfiguration.
     *
     * @return x  an integer indicating absolute horizontal position.
     *
     * @see java.awt.GraphicsConfiguration
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public Point getLocationOnScreen(){

    /**
     * Returns the absolute x, y position of the event.
     * In a virtual device multi-screen environment in which the
     * desktop area could span multiple physical screen devices,
     * these coordinates are relative to the virtual coordinate system.
     * Otherwise, these coordinates are relative to the coordinate system
     * associated with the Component's GraphicsConfiguration.
     *
     * @return a <code>Point</code> object containing the absolute  x
     *  and y coordinates.
     *
     * @see java.awt.GraphicsConfiguration
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
     *  accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private static int cachedNumberOfButtons;

    /**
     * A number of buttons available on the mouse at the {@code Toolkit} machinery startup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    boolean popupTrigger = false;

    /**
     * A property used to indicate whether a Popup Menu
     * should appear  with a certain gestures.
     * If <code>popupTrigger</code> = <code>false</code>,
     * no popup menu should appear.  If it is <code>true</code>
     * then a popup menu should appear.
     *
     * @serial
     * @see java.awt.PopupMenu
     * @see #isPopupTrigger()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    int button;

    /**
     * Indicates which, if any, of the mouse buttons has changed state.
     *
     * The valid values are ranged from 0 to the value returned by the
     * {@link java.awt.MouseInfo#getNumberOfButtons() MouseInfo.getNumberOfButtons()} method.
     * This range already includes constants {@code NOBUTTON}, {@code BUTTON1},
     * {@code BUTTON2}, and {@code BUTTON3}
     * if these buttons are present. So it is allowed to use these constants too.
     * For example, for a mouse with two buttons this field may contain the following values:
     * <ul>
     * <li> 0 ({@code NOBUTTON})
     * <li> 1 ({@code BUTTON1})
     * <li> 2 ({@code BUTTON2})
     * </ul>
     * If a mouse has 5 buttons, this field may contain the following values:
     * <ul>
     * <li> 0 ({@code NOBUTTON})
     * <li> 1 ({@code BUTTON1})
     * <li> 2 ({@code BUTTON2})
     * <li> 3 ({@code BUTTON3})
     * <li> 4
     * <li> 5
     * </ul>
     * If support for extended mouse buttons is {@link Toolkit#areExtraMouseButtonsEnabled()} disabled by Java
     * then the field may not contain the value larger than {@code BUTTON3}.
     * @serial
     * @see #getButton()
     * @see java.awt.Toolkit#areExtraMouseButtonsEnabled()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    int clickCount;

    /**
     * Indicates the number of quick consecutive clicks of
     * a mouse button.
     * clickCount will be valid for only three mouse events :<BR>
     * <code>MOUSE_CLICKED</code>,
     * <code>MOUSE_PRESSED</code> and
     * <code>MOUSE_RELEASED</code>.
     * For the above, the <code>clickCount</code> will be at least 1.
     * For all other events the count will be 0.
     *
     * @serial
     * @see #getClickCount()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private int yAbs;

    /**
     * The mouse event's y absolute coordinate.
     * In a virtual device multi-screen environment in which the
     * desktop area could span multiple physical screen devices,
     * this coordinate is relative to the virtual coordinate system.
     * Otherwise, this coordinate is relative to the coordinate system
     * associated with the Component's GraphicsConfiguration.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private int xAbs;

    /**
     * The mouse event's x absolute coordinate.
     * In a virtual device multi-screen environment in which the
     * desktop area could span multiple physical screen devices,
     * this coordinate is relative to the virtual coordinate system.
     * Otherwise, this coordinate is relative to the coordinate system
     * associated with the Component's GraphicsConfiguration.
     *
     * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    int y;

    /**
     * The mouse event's y coordinate.
     * The y value is relative to the component that fired the event.
     *
     * @serial
     * @see #getY()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    int x;

    /**
     * The mouse event's x coordinate.
     * The x value is relative to the component that fired the event.
     *
     * @serial
     * @see #getX()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int BUTTON3 = 3;

    /**
     * Indicates mouse button #3; used by {@link #getButton}.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int BUTTON2 = 2;

    /**
     * Indicates mouse button #2; used by {@link #getButton}.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int BUTTON1 = 1;

    /**
     * Indicates mouse button #1; used by {@link #getButton}.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int NOBUTTON = 0;

    /**
     * Indicates no mouse buttons; used by {@link #getButton}.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_WHEEL = 7 + MOUSE_FIRST;

    /**
     * The "mouse wheel" event.  This is the only <code>MouseWheelEvent</code>.
     * It occurs when a mouse equipped with a wheel has its wheel rotated.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_DRAGGED = 6 + MOUSE_FIRST; //Event.MOUSE_DRAG

    /**
     * The "mouse dragged" event. This <code>MouseEvent</code>
     * occurs when the mouse position changes while a mouse button is pressed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_EXITED = 5 + MOUSE_FIRST; //Event.MOUSE_EXIT

    /**
     * The "mouse exited" event. This <code>MouseEvent</code>
     * occurs when the mouse cursor exits the unobscured part of component's
     * geometry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_ENTERED = 4 + MOUSE_FIRST; //Event.MOUSE_ENTER

    /**
     * The "mouse entered" event. This <code>MouseEvent</code>
     * occurs when the mouse cursor enters the unobscured part of component's
     * geometry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_MOVED = 3 + MOUSE_FIRST; //Event.MOUSE_MOVE

    /**
     * The "mouse moved" event. This <code>MouseEvent</code>
     * occurs when the mouse position changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_RELEASED = 2 + MOUSE_FIRST; //Event.MOUSE_UP

    /**
     * The "mouse released" event. This <code>MouseEvent</code>
     * occurs when a mouse button is let up.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_PRESSED = 1 + MOUSE_FIRST; //Event.MOUSE_DOWN

    /**
     * The "mouse pressed" event. This <code>MouseEvent</code>
     * occurs when a mouse button is pushed down.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_CLICKED = MOUSE_FIRST;

    /**
     * The "mouse clicked" event. This <code>MouseEvent</code>
     * occurs when a mouse button is pressed and released.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_LAST          = 507;

    /**
     * The last number in the range of ids used for mouse events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_FIRST         = 500;

    /**
     * The first number in the range of ids used for mouse events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
public class MouseEvent extends InputEvent {

/**
 * An event which indicates that a mouse action occurred in a component.
 * A mouse action is considered to occur in a particular component if and only
 * if the mouse cursor is over the unobscured part of the component's bounds
 * when the action happens.
 * For lightweight components, such as Swing's components, mouse events
 * are only dispatched to the component if the mouse event type has been
 * enabled on the component. A mouse event type is enabled by adding the
 * appropriate mouse-based {@code EventListener} to the component
 * ({@link MouseListener} or {@link MouseMotionListener}), or by invoking
 * {@link Component#enableEvents(long)} with the appropriate mask parameter
 * ({@code AWTEvent.MOUSE_EVENT_MASK} or {@code AWTEvent.MOUSE_MOTION_EVENT_MASK}).
 * If the mouse event type has not been enabled on the component, the
 * corresponding mouse events are dispatched to the first ancestor that
 * has enabled the mouse event type.
 *<p>
 * For example, if a {@code MouseListener} has been added to a component, or
 * {@code enableEvents(AWTEvent.MOUSE_EVENT_MASK)} has been invoked, then all
 * the events defined by {@code MouseListener} are dispatched to the component.
 * On the other hand, if a {@code MouseMotionListener} has not been added and
 * {@code enableEvents} has not been invoked with
 * {@code AWTEvent.MOUSE_MOTION_EVENT_MASK}, then mouse motion events are not
 * dispatched to the component. Instead the mouse motion events are
 * dispatched to the first ancestors that has enabled mouse motion
 * events.
 * <P>
 * This low-level event is generated by a component object for:
 * <ul>
 * <li>Mouse Events
 *     <ul>
 *     <li>a mouse button is pressed
 *     <li>a mouse button is released
 *     <li>a mouse button is clicked (pressed and released)
 *     <li>the mouse cursor enters the unobscured part of component's geometry
 *     <li>the mouse cursor exits the unobscured part of component's geometry
 *     </ul>
 * <li> Mouse Motion Events
 *     <ul>
 *     <li>the mouse is moved
 *     <li>the mouse is dragged
 *     </ul>
 * </ul>
 * <P>
 * A <code>MouseEvent</code> object is passed to every
 * <code>MouseListener</code>
 * or <code>MouseAdapter</code> object which is registered to receive
 * the "interesting" mouse events using the component's
 * <code>addMouseListener</code> method.
 * (<code>MouseAdapter</code> objects implement the
 * <code>MouseListener</code> interface.) Each such listener object
 * gets a <code>MouseEvent</code> containing the mouse event.
 * <P>
 * A <code>MouseEvent</code> object is also passed to every
 * <code>MouseMotionListener</code> or
 * <code>MouseMotionAdapter</code> object which is registered to receive
 * mouse motion events using the component's
 * <code>addMouseMotionListener</code>
 * method. (<code>MouseMotionAdapter</code> objects implement the
 * <code>MouseMotionListener</code> interface.) Each such listener object
 * gets a <code>MouseEvent</code> containing the mouse motion event.
 * <P>
 * When a mouse button is clicked, events are generated and sent to the
 * registered <code>MouseListener</code>s.
 * The state of modal keys can be retrieved using {@link InputEvent#getModifiers}
 * and {@link InputEvent#getModifiersEx}.
 * The button mask returned by {@link InputEvent#getModifiers} reflects
 * only the button that changed state, not the current state of all buttons.
 * (Note: Due to overlap in the values of ALT_MASK/BUTTON2_MASK and
 * META_MASK/BUTTON3_MASK, this is not always true for mouse events involving
 * modifier keys).
 * To get the state of all buttons and modifier keys, use
 * {@link InputEvent#getModifiersEx}.
 * The button which has changed state is returned by {@link MouseEvent#getButton}
 * <P>
 * For example, if the first mouse button is pressed, events are sent in the
 * following order:
 * <PRE>
 *    <b   >id           </b   >   <b   >modifiers   </b   > <b   >button </b   >
 *    <code>MOUSE_PRESSED</code>:  <code>BUTTON1_MASK</code> <code>BUTTON1</code>
 *    <code>MOUSE_RELEASED</code>: <code>BUTTON1_MASK</code> <code>BUTTON1</code>
 *    <code>MOUSE_CLICKED</code>:  <code>BUTTON1_MASK</code> <code>BUTTON1</code>
 * </PRE>
 * When multiple mouse buttons are pressed, each press, release, and click
 * results in a separate event.
 * <P>
 * For example, if the user presses <b>button 1</b> followed by
 * <b>button 2</b>, and then releases them in the same order,
 * the following sequence of events is generated:
 * <PRE>
 *    <b   >id           </b   >   <b   >modifiers   </b   > <b   >button </b   >
 *    <code>MOUSE_PRESSED</code>:  <code>BUTTON1_MASK</code> <code>BUTTON1</code>
 *    <code>MOUSE_PRESSED</code>:  <code>BUTTON2_MASK</code> <code>BUTTON2</code>
 *    <code>MOUSE_RELEASED</code>: <code>BUTTON1_MASK</code> <code>BUTTON1</code>
 *    <code>MOUSE_CLICKED</code>:  <code>BUTTON1_MASK</code> <code>BUTTON1</code>
 *    <code>MOUSE_RELEASED</code>: <code>BUTTON2_MASK</code> <code>BUTTON2</code>
 *    <code>MOUSE_CLICKED</code>:  <code>BUTTON2_MASK</code> <code>BUTTON2</code>
 * </PRE>
 * If <b>button 2</b> is released first, the
 * <code>MOUSE_RELEASED</code>/<code>MOUSE_CLICKED</code> pair
 * for <code>BUTTON2_MASK</code> arrives first,
 * followed by the pair for <code>BUTTON1_MASK</code>.
 * <p>
 * Some extra mouse buttons are added to extend the standard set of buttons
 * represented by the following constants:{@code BUTTON1}, {@code BUTTON2}, and {@code BUTTON3}.
 * Extra buttons have no assigned {@code BUTTONx}
 * constants as well as their button masks have no assigned {@code BUTTONx_DOWN_MASK}
 * constants. Nevertheless, ordinal numbers starting from 4 may be
 * used as button numbers (button ids). Values obtained by the
 * {@link InputEvent#getMaskForButton(int) getMaskForButton(button)} method may be used
 * as button masks.
 * <p>
 * {@code MOUSE_DRAGGED} events are delivered to the {@code Component}
 * in which the mouse button was pressed until the mouse button is released
 * (regardless of whether the mouse position is within the bounds of the
 * {@code Component}).  Due to platform-dependent Drag&amp;Drop implementations,
 * {@code MOUSE_DRAGGED} events may not be delivered during a native
 * Drag&amp;Drop operation.
 *
 * In a multi-screen environment mouse drag events are delivered to the
 * <code>Component</code> even if the mouse position is outside the bounds of the
 * <code>GraphicsConfiguration</code> associated with that
 * <code>Component</code>. However, the reported position for mouse drag events
 * in this case may differ from the actual mouse position:
 * <ul>
 * <li>In a multi-screen environment without a virtual device:
 * <br>
 * The reported coordinates for mouse drag events are clipped to fit within the
 * bounds of the <code>GraphicsConfiguration</code> associated with
 * the <code>Component</code>.
 * <li>In a multi-screen environment with a virtual device:
 * <br>
 * The reported coordinates for mouse drag events are clipped to fit within the
 * bounds of the virtual device associated with the <code>Component</code>.
 * </ul>
 * <p>
 * An unspecified behavior will be caused if the {@code id} parameter
 * of any particular {@code MouseEvent} instance is not
 * in the range from {@code MOUSE_FIRST} to {@code MOUSE_LAST}-1
 * ({@code MOUSE_WHEEL} is not acceptable).
 *
 * @author Carl Quinn
 *
 * @see MouseAdapter
 * @see MouseListener
 * @see MouseMotionAdapter
 * @see MouseMotionListener
 * @see MouseWheelListener
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/mouselistener.html">Tutorial: Writing a Mouse Listener</a>
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/mousemotionlistener.html">Tutorial: Writing a Mouse Motion Listener</a>
 *
 * @since 1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private void readObject(ObjectInputStream s)

    /**
     * Sets new modifiers by the old ones.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private void setOldModifiers() {

    /**
     * Sets old modifiers by the new ones.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private void setNewModifiers() {

    /**
     * Sets new modifiers by the old ones.
     * Also sets button.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public String paramString() {

    /**
     * Returns a parameter string identifying this event.
     * This method is useful for event-logging and for debugging.
     *
     * @return a string identifying the event and its attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static String getMouseModifiersText(int modifiers) {

    /**
     * Returns a <code>String</code> instance describing the modifier keys and
     * mouse buttons that were down during the event, such as "Shift",
     * or "Ctrl+Shift". These strings can be localized by changing
     * the <code>awt.properties</code> file.
     * <p>
     * Note that the <code>InputEvent.ALT_MASK</code> and
     * <code>InputEvent.BUTTON2_MASK</code> have equal values,
     * so the "Alt" string is returned for both modifiers.  Likewise,
     * the <code>InputEvent.META_MASK</code> and
     * <code>InputEvent.BUTTON3_MASK</code> have equal values,
     * so the "Meta" string is returned for both modifiers.
     * <p>
     * Note that passing negative parameter is incorrect,
     * and will cause the returning an unspecified string.
     * Zero parameter means that no modifiers were passed and will
     * cause the returning an empty string.
     * <p>
     * @param modifiers A modifier mask describing the modifier keys and
     *                  mouse buttons that were down during the event
     * @return string   string text description of the combination of modifier
     *                  keys and mouse buttons that were down during the event
     * @see InputEvent#getModifiersExText(int)
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public boolean isPopupTrigger() {

    /**
     * Returns whether or not this mouse event is the popup menu
     * trigger event for the platform.
     * <p><b>Note</b>: Popup menus are triggered differently
     * on different systems. Therefore, <code>isPopupTrigger</code>
     * should be checked in both <code>mousePressed</code>
     * and <code>mouseReleased</code>
     * for proper cross-platform functionality.
     *
     * @return boolean, true if this event is the popup menu trigger
     *         for this platform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getButton() {

    /**
     * Returns which, if any, of the mouse buttons has changed state.
     * The returned value is ranged
     * from 0 to the {@link java.awt.MouseInfo#getNumberOfButtons() MouseInfo.getNumberOfButtons()}
     * value.
     * The returned value includes at least the following constants:
     * <ul>
     * <li> {@code NOBUTTON}
     * <li> {@code BUTTON1}
     * <li> {@code BUTTON2}
     * <li> {@code BUTTON3}
     * </ul>
     * It is allowed to use those constants to compare with the returned button number in the application.
     * For example,
     * <pre>
     * if (anEvent.getButton() == MouseEvent.BUTTON1) {
     * </pre>
     * In particular, for a mouse with one, two, or three buttons this method may return the following values:
     * <ul>
     * <li> 0 ({@code NOBUTTON})
     * <li> 1 ({@code BUTTON1})
     * <li> 2 ({@code BUTTON2})
     * <li> 3 ({@code BUTTON3})
     * </ul>
     * Button numbers greater then {@code BUTTON3} have no constant identifier. So if a mouse with five buttons is
     * installed, this method may return the following values:
     * <ul>
     * <li> 0 ({@code NOBUTTON})
     * <li> 1 ({@code BUTTON1})
     * <li> 2 ({@code BUTTON2})
     * <li> 3 ({@code BUTTON3})
     * <li> 4
     * <li> 5
     * </ul>
     * <p>
     * Note: If support for extended mouse buttons is {@link Toolkit#areExtraMouseButtonsEnabled() disabled} by Java
     * then the AWT event subsystem does not produce mouse events for the extended mouse
     * buttons. So it is not expected that this method returns anything except {@code NOBUTTON}, {@code BUTTON1},
     * {@code BUTTON2}, {@code BUTTON3}.
     *
     * @return one of the values from 0 to {@link java.awt.MouseInfo#getNumberOfButtons() MouseInfo.getNumberOfButtons()}
     *         if support for the extended mouse buttons is {@link Toolkit#areExtraMouseButtonsEnabled() enabled} by Java.
     *         That range includes {@code NOBUTTON}, {@code BUTTON1}, {@code BUTTON2}, {@code BUTTON3};
     *         <br>
     *         {@code NOBUTTON}, {@code BUTTON1}, {@code BUTTON2} or {@code BUTTON3}
     *         if support for the extended mouse buttons is {@link Toolkit#areExtraMouseButtonsEnabled() disabled} by Java
     * @since 1.4
     * @see Toolkit#areExtraMouseButtonsEnabled()
     * @see java.awt.MouseInfo#getNumberOfButtons()
     * @see #MouseEvent(Component, int, long, int, int, int, int, int, int, boolean, int)
     * @see InputEvent#getMaskForButton(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getClickCount() {

    /**
     * Returns the number of mouse clicks associated with this event.
     *
     * @return integer value for the number of clicks
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public synchronized void translatePoint(int x, int y) {

    /**
     * Translates the event's coordinates to a new position
     * by adding specified <code>x</code> (horizontal) and <code>y</code>
     * (vertical) offsets.
     *
     * @param x the horizontal x value to add to the current x
     *          coordinate position
     * @param y the vertical y value to add to the current y
                coordinate position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public Point getPoint() {

    /**
     * Returns the x,y position of the event relative to the source component.
     *
     * @return a <code>Point</code> object containing the x and y coordinates
     *         relative to the source component
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getY() {

    /**
     * Returns the vertical y position of the event relative to the
     * source component.
     *
     * @return y  an integer indicating vertical position relative to
     *            the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getX() {

    /**
     * Returns the horizontal x position of the event relative to the
     * source component.
     *
     * @return x  an integer indicating horizontal position relative to
     *            the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public MouseEvent(Component source, int id, long when, int modifiers,
                      int x, int y, int xAbs, int yAbs,
                      int clickCount, boolean popupTrigger, int button)

    /**
     * Constructs a <code>MouseEvent</code> object with the
     * specified source component,
     * type, time, modifiers, coordinates, absolute coordinates, click count, popupTrigger flag,
     * and button number.
     * <p>
     * Creating an invalid event (such
     * as by using more than one of the old _MASKs, or modifier/button
     * values which don't match) results in unspecified behavior.
     * Even if inconsistent values for relative and absolute coordinates are
     * passed to the constructor, the mouse event instance is still
     * created and no exception is thrown.
     * This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source       The <code>Component</code> that originated the event
     * @param id              An integer indicating the type of event.
     *                     For information on allowable values, see
     *                     the class description for {@link MouseEvent}
     * @param when         A long integer that gives the time the event occurred.
     *                     Passing negative or zero value
     *                     is not recommended
     * @param modifiers    a modifier mask describing the modifier keys and mouse
     *                     buttons (for example, shift, ctrl, alt, and meta) that
     *                     are down during the event.
     *                     Only extended modifiers are allowed to be used as a
     *                     value for this parameter (see the {@link InputEvent#getModifiersEx}
     *                     class for the description of extended modifiers).
     *                     Passing negative parameter
     *                     is not recommended.
     *                     Zero value means that no modifiers were passed
     * @param x            The horizontal x coordinate for the mouse location.
     *                       It is allowed to pass negative values
     * @param y            The vertical y coordinate for the mouse location.
     *                       It is allowed to pass negative values
     * @param xAbs           The absolute horizontal x coordinate for the mouse location
     *                       It is allowed to pass negative values
     * @param yAbs           The absolute vertical y coordinate for the mouse location
     *                       It is allowed to pass negative values
     * @param clickCount   The number of mouse clicks associated with event.
     *                       Passing negative value
     *                       is not recommended
     * @param popupTrigger A boolean that equals {@code true} if this event
     *                     is a trigger for a popup menu
     * @param button       An integer that indicates, which of the mouse buttons has
     *                     changed its state.
     * The following rules are applied to this parameter:
     * <ul>
     * <li>If support for the extended mouse buttons is
     * {@link Toolkit#areExtraMouseButtonsEnabled() disabled} by Java
     * then it is allowed to create {@code MouseEvent} objects only with the standard buttons:
     * {@code NOBUTTON}, {@code BUTTON1}, {@code BUTTON2}, and
     * {@code BUTTON3}.
     * <li> If support for the extended mouse buttons is
     * {@link Toolkit#areExtraMouseButtonsEnabled() enabled} by Java
     * then it is allowed to create {@code MouseEvent} objects with
     * the standard buttons.
     * In case the support for extended mouse buttons is
     * {@link Toolkit#areExtraMouseButtonsEnabled() enabled} by Java, then
     * in addition to the standard buttons, {@code MouseEvent} objects can be created
     * using buttons from the range starting from 4 to
     * {@link java.awt.MouseInfo#getNumberOfButtons() MouseInfo.getNumberOfButtons()}
     * if the mouse has more than three buttons.
     * </ul>
     * @throws IllegalArgumentException if {@code button} is less then zero
     * @throws IllegalArgumentException if <code>source</code> is null
     * @throws IllegalArgumentException if {@code button} is greater then BUTTON3 and the support for extended mouse buttons is
     *                                  {@link Toolkit#areExtraMouseButtonsEnabled() disabled} by Java
     * @throws IllegalArgumentException if {@code button} is greater then the
     *                                  {@link java.awt.MouseInfo#getNumberOfButtons() current number of buttons} and the support
     *                                  for extended mouse buttons is {@link Toolkit#areExtraMouseButtonsEnabled() enabled}
     *                                  by Java
     * @throws IllegalArgumentException if an invalid <code>button</code>
     *            value is passed in
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getWhen()
     * @see #getModifiers()
     * @see #getX()
     * @see #getY()
     * @see #getXOnScreen()
     * @see #getYOnScreen()
     * @see #getClickCount()
     * @see #isPopupTrigger()
     * @see #getButton()
     * @see #button
     * @see Toolkit#areExtraMouseButtonsEnabled()
     * @see java.awt.MouseInfo#getNumberOfButtons()
     * @see InputEvent#getMaskForButton(int)
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getModifiersEx() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
     public MouseEvent(Component source, int id, long when, int modifiers,
                      int x, int y, int clickCount, boolean popupTrigger) {

    /**
     * Constructs a <code>MouseEvent</code> object with the
     * specified source component,
     * type, modifiers, coordinates, click count, and popupTrigger flag.
     * An invocation of the form
     * <tt>MouseEvent(source, id, when, modifiers, x, y, clickCount, popupTrigger)</tt>
     * behaves in exactly the same way as the invocation
     * <tt> {@link #MouseEvent(Component, int, long, int, int, int,
     * int, int, int, boolean, int) MouseEvent}(source, id, when, modifiers,
     * x, y, xAbs, yAbs, clickCount, popupTrigger, MouseEvent.NOBUTTON)</tt>
     * where xAbs and yAbs defines as source's location on screen plus
     * relative coordinates x and y.
     * xAbs and yAbs are set to zero if the source is not showing.
     * This method throws an <code>IllegalArgumentException</code>
     * if <code>source</code> is <code>null</code>.
     *
     * @param source       The <code>Component</code> that originated the event
     * @param id              An integer indicating the type of event.
     *                     For information on allowable values, see
     *                     the class description for {@link MouseEvent}
     * @param when         A long integer that gives the time the event occurred.
     *                     Passing negative or zero value
     *                     is not recommended
     * @param modifiers    a modifier mask describing the modifier keys and mouse
     *                     buttons (for example, shift, ctrl, alt, and meta) that
     *                     are down during the event.
     *                     Only extended modifiers are allowed to be used as a
     *                     value for this parameter (see the {@link InputEvent#getModifiersEx}
     *                     class for the description of extended modifiers).
     *                     Passing negative parameter
     *                     is not recommended.
     *                     Zero value means that no modifiers were passed
     * @param x            The horizontal x coordinate for the mouse location.
     *                       It is allowed to pass negative values
     * @param y            The vertical y coordinate for the mouse location.
     *                       It is allowed to pass negative values
     * @param clickCount   The number of mouse clicks associated with event.
     *                       Passing negative value
     *                       is not recommended
     * @param popupTrigger A boolean that equals {@code true} if this event
     *                     is a trigger for a popup menu
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getWhen()
     * @see #getModifiers()
     * @see #getX()
     * @see #getY()
     * @see #getClickCount()
     * @see #isPopupTrigger()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public MouseEvent(Component source, int id, long when, int modifiers,
                      int x, int y, int clickCount, boolean popupTrigger,
                      int button)

    /**
     * Constructs a <code>MouseEvent</code> object with the
     * specified source component,
     * type, time, modifiers, coordinates, click count, popupTrigger flag,
     * and button number.
     * <p>
     * Creating an invalid event (such
     * as by using more than one of the old _MASKs, or modifier/button
     * values which don't match) results in unspecified behavior.
     * An invocation of the form
     * <tt>MouseEvent(source, id, when, modifiers, x, y, clickCount, popupTrigger, button)</tt>
     * behaves in exactly the same way as the invocation
     * <tt> {@link #MouseEvent(Component, int, long, int, int, int,
     * int, int, int, boolean, int) MouseEvent}(source, id, when, modifiers,
     * x, y, xAbs, yAbs, clickCount, popupTrigger, button)</tt>
     * where xAbs and yAbs defines as source's location on screen plus
     * relative coordinates x and y.
     * xAbs and yAbs are set to zero if the source is not showing.
     * This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source       The <code>Component</code> that originated the event
     * @param id              An integer indicating the type of event.
     *                     For information on allowable values, see
     *                     the class description for {@link MouseEvent}
     * @param when         A long integer that gives the time the event occurred.
     *                     Passing negative or zero value
     *                     is not recommended
     * @param modifiers    a modifier mask describing the modifier keys and mouse
     *                     buttons (for example, shift, ctrl, alt, and meta) that
     *                     are down during the event.
     *                     Only extended modifiers are allowed to be used as a
     *                     value for this parameter (see the {@link InputEvent#getModifiersEx}
     *                     class for the description of extended modifiers).
     *                     Passing negative parameter
     *                     is not recommended.
     *                     Zero value means that no modifiers were passed
     * @param x            The horizontal x coordinate for the mouse location.
     *                       It is allowed to pass negative values
     * @param y            The vertical y coordinate for the mouse location.
     *                       It is allowed to pass negative values
     * @param clickCount   The number of mouse clicks associated with event.
     *                       Passing negative value
     *                       is not recommended
     * @param popupTrigger A boolean that equals {@code true} if this event
     *                     is a trigger for a popup menu
     * @param button       An integer that indicates, which of the mouse buttons has
     *                     changed its state.
     * The following rules are applied to this parameter:
     * <ul>
     * <li>If support for the extended mouse buttons is
     * {@link Toolkit#areExtraMouseButtonsEnabled() disabled} by Java
     * then it is allowed to create {@code MouseEvent} objects only with the standard buttons:
     * {@code NOBUTTON}, {@code BUTTON1}, {@code BUTTON2}, and
     * {@code BUTTON3}.
     * <li> If support for the extended mouse buttons is
     * {@link Toolkit#areExtraMouseButtonsEnabled() enabled} by Java
     * then it is allowed to create {@code MouseEvent} objects with
     * the standard buttons.
     * In case the support for extended mouse buttons is
     * {@link Toolkit#areExtraMouseButtonsEnabled() enabled} by Java, then
     * in addition to the standard buttons, {@code MouseEvent} objects can be created
     * using buttons from the range starting from 4 to
     * {@link java.awt.MouseInfo#getNumberOfButtons() MouseInfo.getNumberOfButtons()}
     * if the mouse has more than three buttons.
     * </ul>
     * @throws IllegalArgumentException if {@code button} is less then zero
     * @throws IllegalArgumentException if <code>source</code> is null
     * @throws IllegalArgumentException if {@code button} is greater then BUTTON3 and the support for extended mouse buttons is
     *                                  {@link Toolkit#areExtraMouseButtonsEnabled() disabled} by Java
     * @throws IllegalArgumentException if {@code button} is greater then the
     *                                  {@link java.awt.MouseInfo#getNumberOfButtons() current number of buttons} and the support
     *                                  for extended mouse buttons is {@link Toolkit#areExtraMouseButtonsEnabled() enabled}
     *                                  by Java
     * @throws IllegalArgumentException if an invalid <code>button</code>
     *            value is passed in
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getWhen()
     * @see #getModifiers()
     * @see #getX()
     * @see #getY()
     * @see #getClickCount()
     * @see #isPopupTrigger()
     * @see #getButton()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getYOnScreen() {

    /**
     * Returns the absolute vertical y position of the event.
     * In a virtual device multi-screen environment in which the
     * desktop area could span multiple physical screen devices,
     * this coordinate is relative to the virtual coordinate system.
     * Otherwise, this coordinate is relative to the coordinate system
     * associated with the Component's GraphicsConfiguration.
     *
     * @return y  an integer indicating absolute vertical position.
     *
     * @see java.awt.GraphicsConfiguration
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public int getXOnScreen() {

    /**
     * Returns the absolute horizontal x position of the event.
     * In a virtual device multi-screen environment in which the
     * desktop area could span multiple physical screen devices,
     * this coordinate is relative to the virtual coordinate system.
     * Otherwise, this coordinate is relative to the coordinate system
     * associated with the Component's GraphicsConfiguration.
     *
     * @return x  an integer indicating absolute horizontal position.
     *
     * @see java.awt.GraphicsConfiguration
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public Point getLocationOnScreen(){

    /**
     * Returns the absolute x, y position of the event.
     * In a virtual device multi-screen environment in which the
     * desktop area could span multiple physical screen devices,
     * these coordinates are relative to the virtual coordinate system.
     * Otherwise, these coordinates are relative to the coordinate system
     * associated with the Component's GraphicsConfiguration.
     *
     * @return a <code>Point</code> object containing the absolute  x
     *  and y coordinates.
     *
     * @see java.awt.GraphicsConfiguration
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
     *  accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private static int cachedNumberOfButtons;

    /**
     * A number of buttons available on the mouse at the {@code Toolkit} machinery startup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    boolean popupTrigger = false;

    /**
     * A property used to indicate whether a Popup Menu
     * should appear  with a certain gestures.
     * If <code>popupTrigger</code> = <code>false</code>,
     * no popup menu should appear.  If it is <code>true</code>
     * then a popup menu should appear.
     *
     * @serial
     * @see java.awt.PopupMenu
     * @see #isPopupTrigger()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    int button;

    /**
     * Indicates which, if any, of the mouse buttons has changed state.
     *
     * The valid values are ranged from 0 to the value returned by the
     * {@link java.awt.MouseInfo#getNumberOfButtons() MouseInfo.getNumberOfButtons()} method.
     * This range already includes constants {@code NOBUTTON}, {@code BUTTON1},
     * {@code BUTTON2}, and {@code BUTTON3}
     * if these buttons are present. So it is allowed to use these constants too.
     * For example, for a mouse with two buttons this field may contain the following values:
     * <ul>
     * <li> 0 ({@code NOBUTTON})
     * <li> 1 ({@code BUTTON1})
     * <li> 2 ({@code BUTTON2})
     * </ul>
     * If a mouse has 5 buttons, this field may contain the following values:
     * <ul>
     * <li> 0 ({@code NOBUTTON})
     * <li> 1 ({@code BUTTON1})
     * <li> 2 ({@code BUTTON2})
     * <li> 3 ({@code BUTTON3})
     * <li> 4
     * <li> 5
     * </ul>
     * If support for extended mouse buttons is {@link Toolkit#areExtraMouseButtonsEnabled()} disabled by Java
     * then the field may not contain the value larger than {@code BUTTON3}.
     * @serial
     * @see #getButton()
     * @see java.awt.Toolkit#areExtraMouseButtonsEnabled()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    int clickCount;

    /**
     * Indicates the number of quick consecutive clicks of
     * a mouse button.
     * clickCount will be valid for only three mouse events :<BR>
     * <code>MOUSE_CLICKED</code>,
     * <code>MOUSE_PRESSED</code> and
     * <code>MOUSE_RELEASED</code>.
     * For the above, the <code>clickCount</code> will be at least 1.
     * For all other events the count will be 0.
     *
     * @serial
     * @see #getClickCount()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private int yAbs;

    /**
     * The mouse event's y absolute coordinate.
     * In a virtual device multi-screen environment in which the
     * desktop area could span multiple physical screen devices,
     * this coordinate is relative to the virtual coordinate system.
     * Otherwise, this coordinate is relative to the coordinate system
     * associated with the Component's GraphicsConfiguration.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    private int xAbs;

    /**
     * The mouse event's x absolute coordinate.
     * In a virtual device multi-screen environment in which the
     * desktop area could span multiple physical screen devices,
     * this coordinate is relative to the virtual coordinate system.
     * Otherwise, this coordinate is relative to the coordinate system
     * associated with the Component's GraphicsConfiguration.
     *
     * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    int y;

    /**
     * The mouse event's y coordinate.
     * The y value is relative to the component that fired the event.
     *
     * @serial
     * @see #getY()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    int x;

    /**
     * The mouse event's x coordinate.
     * The x value is relative to the component that fired the event.
     *
     * @serial
     * @see #getX()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int BUTTON3 = 3;

    /**
     * Indicates mouse button #3; used by {@link #getButton}.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int BUTTON2 = 2;

    /**
     * Indicates mouse button #2; used by {@link #getButton}.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int BUTTON1 = 1;

    /**
     * Indicates mouse button #1; used by {@link #getButton}.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int NOBUTTON = 0;

    /**
     * Indicates no mouse buttons; used by {@link #getButton}.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_WHEEL = 7 + MOUSE_FIRST;

    /**
     * The "mouse wheel" event.  This is the only <code>MouseWheelEvent</code>.
     * It occurs when a mouse equipped with a wheel has its wheel rotated.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_DRAGGED = 6 + MOUSE_FIRST; //Event.MOUSE_DRAG

    /**
     * The "mouse dragged" event. This <code>MouseEvent</code>
     * occurs when the mouse position changes while a mouse button is pressed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_EXITED = 5 + MOUSE_FIRST; //Event.MOUSE_EXIT

    /**
     * The "mouse exited" event. This <code>MouseEvent</code>
     * occurs when the mouse cursor exits the unobscured part of component's
     * geometry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_ENTERED = 4 + MOUSE_FIRST; //Event.MOUSE_ENTER

    /**
     * The "mouse entered" event. This <code>MouseEvent</code>
     * occurs when the mouse cursor enters the unobscured part of component's
     * geometry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_MOVED = 3 + MOUSE_FIRST; //Event.MOUSE_MOVE

    /**
     * The "mouse moved" event. This <code>MouseEvent</code>
     * occurs when the mouse position changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_RELEASED = 2 + MOUSE_FIRST; //Event.MOUSE_UP

    /**
     * The "mouse released" event. This <code>MouseEvent</code>
     * occurs when a mouse button is let up.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_PRESSED = 1 + MOUSE_FIRST; //Event.MOUSE_DOWN

    /**
     * The "mouse pressed" event. This <code>MouseEvent</code>
     * occurs when a mouse button is pushed down.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_CLICKED = MOUSE_FIRST;

    /**
     * The "mouse clicked" event. This <code>MouseEvent</code>
     * occurs when a mouse button is pressed and released.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_LAST          = 507;

    /**
     * The last number in the range of ids used for mouse events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
    public static final int MOUSE_FIRST         = 500;

    /**
     * The first number in the range of ids used for mouse events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/MouseEvent.java
public class MouseEvent extends InputEvent {

/**
 * An event which indicates that a mouse action occurred in a component.
 * A mouse action is considered to occur in a particular component if and only
 * if the mouse cursor is over the unobscured part of the component's bounds
 * when the action happens.
 * For lightweight components, such as Swing's components, mouse events
 * are only dispatched to the component if the mouse event type has been
 * enabled on the component. A mouse event type is enabled by adding the
 * appropriate mouse-based {@code EventListener} to the component
 * ({@link MouseListener} or {@link MouseMotionListener}), or by invoking
 * {@link Component#enableEvents(long)} with the appropriate mask parameter
 * ({@code AWTEvent.MOUSE_EVENT_MASK} or {@code AWTEvent.MOUSE_MOTION_EVENT_MASK}).
 * If the mouse event type has not been enabled on the component, the
 * corresponding mouse events are dispatched to the first ancestor that
 * has enabled the mouse event type.
 *<p>
 * For example, if a {@code MouseListener} has been added to a component, or
 * {@code enableEvents(AWTEvent.MOUSE_EVENT_MASK)} has been invoked, then all
 * the events defined by {@code MouseListener} are dispatched to the component.
 * On the other hand, if a {@code MouseMotionListener} has not been added and
 * {@code enableEvents} has not been invoked with
 * {@code AWTEvent.MOUSE_MOTION_EVENT_MASK}, then mouse motion events are not
 * dispatched to the component. Instead the mouse motion events are
 * dispatched to the first ancestors that has enabled mouse motion
 * events.
 * <P>
 * This low-level event is generated by a component object for:
 * <ul>
 * <li>Mouse Events
 *     <ul>
 *     <li>a mouse button is pressed
 *     <li>a mouse button is released
 *     <li>a mouse button is clicked (pressed and released)
 *     <li>the mouse cursor enters the unobscured part of component's geometry
 *     <li>the mouse cursor exits the unobscured part of component's geometry
 *     </ul>
 * <li> Mouse Motion Events
 *     <ul>
 *     <li>the mouse is moved
 *     <li>the mouse is dragged
 *     </ul>
 * </ul>
 * <P>
 * A <code>MouseEvent</code> object is passed to every
 * <code>MouseListener</code>
 * or <code>MouseAdapter</code> object which is registered to receive
 * the "interesting" mouse events using the component's
 * <code>addMouseListener</code> method.
 * (<code>MouseAdapter</code> objects implement the
 * <code>MouseListener</code> interface.) Each such listener object
 * gets a <code>MouseEvent</code> containing the mouse event.
 * <P>
 * A <code>MouseEvent</code> object is also passed to every
 * <code>MouseMotionListener</code> or
 * <code>MouseMotionAdapter</code> object which is registered to receive
 * mouse motion events using the component's
 * <code>addMouseMotionListener</code>
 * method. (<code>MouseMotionAdapter</code> objects implement the
 * <code>MouseMotionListener</code> interface.) Each such listener object
 * gets a <code>MouseEvent</code> containing the mouse motion event.
 * <P>
 * When a mouse button is clicked, events are generated and sent to the
 * registered <code>MouseListener</code>s.
 * The state of modal keys can be retrieved using {@link InputEvent#getModifiers}
 * and {@link InputEvent#getModifiersEx}.
 * The button mask returned by {@link InputEvent#getModifiers} reflects
 * only the button that changed state, not the current state of all buttons.
 * (Note: Due to overlap in the values of ALT_MASK/BUTTON2_MASK and
 * META_MASK/BUTTON3_MASK, this is not always true for mouse events involving
 * modifier keys).
 * To get the state of all buttons and modifier keys, use
 * {@link InputEvent#getModifiersEx}.
 * The button which has changed state is returned by {@link MouseEvent#getButton}
 * <P>
 * For example, if the first mouse button is pressed, events are sent in the
 * following order:
 * <PRE>
 *    <b   >id           </b   >   <b   >modifiers   </b   > <b   >button </b   >
 *    <code>MOUSE_PRESSED</code>:  <code>BUTTON1_MASK</code> <code>BUTTON1</code>
 *    <code>MOUSE_RELEASED</code>: <code>BUTTON1_MASK</code> <code>BUTTON1</code>
 *    <code>MOUSE_CLICKED</code>:  <code>BUTTON1_MASK</code> <code>BUTTON1</code>
 * </PRE>
 * When multiple mouse buttons are pressed, each press, release, and click
 * results in a separate event.
 * <P>
 * For example, if the user presses <b>button 1</b> followed by
 * <b>button 2</b>, and then releases them in the same order,
 * the following sequence of events is generated:
 * <PRE>
 *    <b   >id           </b   >   <b   >modifiers   </b   > <b   >button </b   >
 *    <code>MOUSE_PRESSED</code>:  <code>BUTTON1_MASK</code> <code>BUTTON1</code>
 *    <code>MOUSE_PRESSED</code>:  <code>BUTTON2_MASK</code> <code>BUTTON2</code>
 *    <code>MOUSE_RELEASED</code>: <code>BUTTON1_MASK</code> <code>BUTTON1</code>
 *    <code>MOUSE_CLICKED</code>:  <code>BUTTON1_MASK</code> <code>BUTTON1</code>
 *    <code>MOUSE_RELEASED</code>: <code>BUTTON2_MASK</code> <code>BUTTON2</code>
 *    <code>MOUSE_CLICKED</code>:  <code>BUTTON2_MASK</code> <code>BUTTON2</code>
 * </PRE>
 * If <b>button 2</b> is released first, the
 * <code>MOUSE_RELEASED</code>/<code>MOUSE_CLICKED</code> pair
 * for <code>BUTTON2_MASK</code> arrives first,
 * followed by the pair for <code>BUTTON1_MASK</code>.
 * <p>
 * Some extra mouse buttons are added to extend the standard set of buttons
 * represented by the following constants:{@code BUTTON1}, {@code BUTTON2}, and {@code BUTTON3}.
 * Extra buttons have no assigned {@code BUTTONx}
 * constants as well as their button masks have no assigned {@code BUTTONx_DOWN_MASK}
 * constants. Nevertheless, ordinal numbers starting from 4 may be
 * used as button numbers (button ids). Values obtained by the
 * {@link InputEvent#getMaskForButton(int) getMaskForButton(button)} method may be used
 * as button masks.
 * <p>
 * {@code MOUSE_DRAGGED} events are delivered to the {@code Component}
 * in which the mouse button was pressed until the mouse button is released
 * (regardless of whether the mouse position is within the bounds of the
 * {@code Component}).  Due to platform-dependent Drag&amp;Drop implementations,
 * {@code MOUSE_DRAGGED} events may not be delivered during a native
 * Drag&amp;Drop operation.
 *
 * In a multi-screen environment mouse drag events are delivered to the
 * <code>Component</code> even if the mouse position is outside the bounds of the
 * <code>GraphicsConfiguration</code> associated with that
 * <code>Component</code>. However, the reported position for mouse drag events
 * in this case may differ from the actual mouse position:
 * <ul>
 * <li>In a multi-screen environment without a virtual device:
 * <br>
 * The reported coordinates for mouse drag events are clipped to fit within the
 * bounds of the <code>GraphicsConfiguration</code> associated with
 * the <code>Component</code>.
 * <li>In a multi-screen environment with a virtual device:
 * <br>
 * The reported coordinates for mouse drag events are clipped to fit within the
 * bounds of the virtual device associated with the <code>Component</code>.
 * </ul>
 * <p>
 * An unspecified behavior will be caused if the {@code id} parameter
 * of any particular {@code MouseEvent} instance is not
 * in the range from {@code MOUSE_FIRST} to {@code MOUSE_LAST}-1
 * ({@code MOUSE_WHEEL} is not acceptable).
 *
 * @author Carl Quinn
 *
 * @see MouseAdapter
 * @see MouseListener
 * @see MouseMotionAdapter
 * @see MouseMotionListener
 * @see MouseWheelListener
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/mouselistener.html">Tutorial: Writing a Mouse Listener</a>
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/mousemotionlistener.html">Tutorial: Writing a Mouse Motion Listener</a>
 *
 * @since 1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/MouseEvent.java
    public void initMouseEvent(String typeArg,
                               boolean canBubbleArg,
                               boolean cancelableArg,
                               AbstractView viewArg,
                               int detailArg,
                               int screenXArg,
                               int screenYArg,
                               int clientXArg,
                               int clientYArg,
                               boolean ctrlKeyArg,
                               boolean altKeyArg,
                               boolean shiftKeyArg,
                               boolean metaKeyArg,
                               short buttonArg,
                               EventTarget relatedTargetArg);

    /**
     * The <code>initMouseEvent</code> method is used to initialize the value
     * of a <code>MouseEvent</code> created through the
     * <code>DocumentEvent</code> interface. This method may only be called
     * before the <code>MouseEvent</code> has been dispatched via the
     * <code>dispatchEvent</code> method, though it may be called multiple
     * times during that phase if necessary. If called multiple times, the
     * final invocation takes precedence.
     * @param typeArg Specifies the event type.
     * @param canBubbleArg Specifies whether or not the event can bubble.
     * @param cancelableArg Specifies whether or not the event's default
     *   action can be prevented.
     * @param viewArg Specifies the <code>Event</code>'s
     *   <code>AbstractView</code>.
     * @param detailArg Specifies the <code>Event</code>'s mouse click count.
     * @param screenXArg Specifies the <code>Event</code>'s screen x
     *   coordinate
     * @param screenYArg Specifies the <code>Event</code>'s screen y
     *   coordinate
     * @param clientXArg Specifies the <code>Event</code>'s client x
     *   coordinate
     * @param clientYArg Specifies the <code>Event</code>'s client y
     *   coordinate
     * @param ctrlKeyArg Specifies whether or not control key was depressed
     *   during the <code>Event</code>.
     * @param altKeyArg Specifies whether or not alt key was depressed during
     *   the <code>Event</code>.
     * @param shiftKeyArg Specifies whether or not shift key was depressed
     *   during the <code>Event</code>.
     * @param metaKeyArg Specifies whether or not meta key was depressed
     *   during the <code>Event</code>.
     * @param buttonArg Specifies the <code>Event</code>'s mouse button.
     * @param relatedTargetArg Specifies the <code>Event</code>'s related
     *   <code>EventTarget</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/MouseEvent.java
    public EventTarget getRelatedTarget();

    /**
     * Used to identify a secondary <code>EventTarget</code> related to a UI
     * event. Currently this attribute is used with the mouseover event to
     * indicate the <code>EventTarget</code> which the pointing device
     * exited and with the mouseout event to indicate the
     * <code>EventTarget</code> which the pointing device entered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/MouseEvent.java
    public short getButton();

    /**
     * During mouse events caused by the depression or release of a mouse
     * button, <code>button</code> is used to indicate which mouse button
     * changed state. The values for <code>button</code> range from zero to
     * indicate the left button of the mouse, one to indicate the middle
     * button if present, and two to indicate the right button. For mice
     * configured for left handed use in which the button actions are
     * reversed the values are instead read from right to left.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/MouseEvent.java
    public boolean getMetaKey();

    /**
     * Used to indicate whether the 'meta' key was depressed during the firing
     * of the event. On some platforms this key may map to an alternative
     * key name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/MouseEvent.java
    public boolean getAltKey();

    /**
     * Used to indicate whether the 'alt' key was depressed during the firing
     * of the event. On some platforms this key may map to an alternative
     * key name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/MouseEvent.java
    public boolean getShiftKey();

    /**
     * Used to indicate whether the 'shift' key was depressed during the
     * firing of the event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/MouseEvent.java
    public boolean getCtrlKey();

    /**
     * Used to indicate whether the 'ctrl' key was depressed during the firing
     * of the event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/MouseEvent.java
    public int getClientY();

    /**
     * The vertical coordinate at which the event occurred relative to the DOM
     * implementation's client area.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/MouseEvent.java
    public int getClientX();

    /**
     * The horizontal coordinate at which the event occurred relative to the
     * DOM implementation's client area.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/MouseEvent.java
    public int getScreenY();

    /**
     * The vertical coordinate at which the event occurred relative to the
     * origin of the screen coordinate system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/MouseEvent.java
public interface MouseEvent extends UIEvent {

/**
 * The <code>MouseEvent</code> interface provides specific contextual
 * information associated with Mouse events.
 * <p>The <code>detail</code> attribute inherited from <code>UIEvent</code>
 * indicates the number of times a mouse button has been pressed and
 * released over the same screen location during a user action. The
 * attribute value is 1 when the user begins this action and increments by 1
 * for each full sequence of pressing and releasing. If the user moves the
 * mouse between the mousedown and mouseup the value will be set to 0,
 * indicating that no click is occurring.
 * <p>In the case of nested elements mouse events are always targeted at the
 * most deeply nested element. Ancestors of the targeted element may use
 * bubbling to obtain notification of mouse events which occur within its
 * descendent elements.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Events-20001113'>Document Object Model (DOM) Level 2 Events Specification</a>.
 * @since DOM Level 2
 */
