_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public String toString() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Returns a representation of this event's values as a string.
     * @return    a string that represents the event and the values
     *                 of its member fields.
     * @see       java.awt.Event#paramString
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    protected String paramString() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Returns a string representing the state of this <code>Event</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return    the parameter string of this event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    boolean isConsumed() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    void consume() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public boolean metaDown() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Checks if the Meta key is down.
     *
     * @return    <code>true</code> if the key is down;
     *            <code>false</code> otherwise.
     * @see       java.awt.Event#modifiers
     * @see       java.awt.Event#shiftDown
     * @see       java.awt.Event#controlDown
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public boolean controlDown() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Checks if the Control key is down.
     * @return    <code>true</code> if the key is down;
     *            <code>false</code> otherwise.
     * @see       java.awt.Event#modifiers
     * @see       java.awt.Event#shiftDown
     * @see       java.awt.Event#metaDown
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public boolean shiftDown() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Checks if the Shift key is down.
     * @return    <code>true</code> if the key is down;
     *            <code>false</code> otherwise.
     * @see       java.awt.Event#modifiers
     * @see       java.awt.Event#controlDown
     * @see       java.awt.Event#metaDown
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public void translate(int dx, int dy) {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Translates this event so that its <i>x</i> and <i>y</i>
     * coordinates are increased by <i>dx</i> and <i>dy</i>,
     * respectively.
     * <p>
     * This method translates an event relative to the given component.
     * This involves, at a minimum, translating the coordinates into the
     * local coordinate system of the given component. It may also involve
     * translating a region in the case of an expose event.
     * @param     dx     the distance to translate the <i>x</i> coordinate.
     * @param     dy     the distance to translate the <i>y</i> coordinate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public Event(Object target, int id, Object arg) {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Creates an instance of <code>Event</code> with the specified
     * target component, event type, and argument.
     * @param     target     the target component.
     * @param     id         the event type.
     * @param     arg        the specified argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public Event(Object target, long when, int id, int x, int y, int key, int modifiers) {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Creates an instance of <code>Event</code>, with the specified target
     * component, time stamp, event type, <i>x</i> and <i>y</i>
     * coordinates, keyboard key, state of the modifier keys, and an
     * argument set to <code>null</code>.
     * @param     target     the target component.
     * @param     when       the time stamp.
     * @param     id         the event type.
     * @param     x          the <i>x</i> coordinate.
     * @param     y          the <i>y</i> coordinate.
     * @param     key        the key pressed in a keyboard event.
     * @param     modifiers  the state of the modifier keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public Event(Object target, long when, int id, int x, int y, int key,
                 int modifiers, Object arg) {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Creates an instance of <code>Event</code> with the specified target
     * component, time stamp, event type, <i>x</i> and <i>y</i>
     * coordinates, keyboard key, state of the modifier keys, and
     * argument.
     * @param     target     the target component.
     * @param     when       the time stamp.
     * @param     id         the event type.
     * @param     x          the <i>x</i> coordinate.
     * @param     y          the <i>y</i> coordinate.
     * @param     key        the key pressed in a keyboard event.
     * @param     modifiers  the state of the modifier keys.
     * @param     arg        the specified argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
       accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    private boolean consumed = false;

    /**
     * This field controls whether or not the event is sent back
     * down to the peer once the target has processed it -
     * false means it's sent to the peer, true means it's not.
     *
     * @serial
     * @see #isConsumed()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public Event evt;

    /**
     * The next event. This field is set when putting events into a
     * linked list.
     * This has been replaced by EventQueue.
     *
     * @serial
     * @see java.awt.EventQueue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public Object arg;

    /**
     * An arbitrary argument of the event. The value of this field
     * depends on the type of event.
     * <code>arg</code> has been replaced by event specific property.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public int clickCount;

    /**
     * For <code>MOUSE_DOWN</code> events, this field indicates the
     * number of consecutive clicks. For other events, its value is
     * <code>0</code>.
     * This field has been replaced by MouseEvent.getClickCount().
     *
     * @serial
     * @see java.awt.event.MouseEvent#getClickCount()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public int modifiers;

    /**
     * The state of the modifier keys.
     * This is replaced with InputEvent.getModifiers()
     * In java 1.1 MouseEvent and KeyEvent are subclasses
     * of InputEvent.
     *
     * @serial
     * @see java.awt.event.InputEvent#getModifiers()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
//    public char keyChar;

    /**
     * The key character that was pressed in a keyboard event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public int key;

    /**
     * The key code of the key that was pressed in a keyboard event.
     * This has been replaced by KeyEvent.getKeyCode()
     *
     * @serial
     * @see java.awt.event.KeyEvent#getKeyCode()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public int y;

    /**
     * The <i>y</i> coordinate of the event.
     * Replaced by MouseEvent.getY()
     *
     * @serial
     * @see java.awt.event.MouseEvent#getY()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public int x;

    /**
     * The <i>x</i> coordinate of the event.
     * Replaced by MouseEvent.getX()
     *
     * @serial
     * @see java.awt.event.MouseEvent#getX()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public int id;

    /**
     * Indicates which type of event the event is, and which
     * other <code>Event</code> variables are relevant for the event.
     * This has been replaced by AWTEvent.getID()
     *
     * @serial
     * @see java.awt.AWTEvent#getID()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public long when;

    /**
     * The time stamp.
     * Replaced by InputEvent.getWhen().
     *
     * @serial
     * @see java.awt.event.InputEvent#getWhen()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public Object target;

    /**
     * The target component. This indicates the component over which the
     * event occurred or with which the event is associated.
     * This object has been replaced by AWTEvent.getSource()
     *
     * @serial
     * @see java.awt.AWTEvent#getSource()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int LOST_FOCUS          = 5 + MISC_EVENT;

    /**
     * A component lost the focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int GOT_FOCUS           = 4 + MISC_EVENT;

    /**
     * A component gained the focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SAVE_FILE           = 3 + MISC_EVENT;

    /**
     * A file saving event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int LOAD_FILE           = 2 + MISC_EVENT;

    /**
     * A file loading event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int ACTION_EVENT        = 1 + MISC_EVENT;

    /**
     * This event indicates that the user wants some action to occur.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int LIST_DESELECT       = 2 + LIST_EVENT;

    /**
     * An item in a list has been deselected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int LIST_SELECT         = 1 + LIST_EVENT;

    /**
     * An item in a list has been selected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_END          = 7 + SCROLL_EVENT;

    /**
     * The scroll end event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_BEGIN        = 6 + SCROLL_EVENT;

    /**
     * The scroll begin event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_ABSOLUTE     = 5 + SCROLL_EVENT;

    /**
     * The user has moved the bubble (thumb) in a scroll bar,
     * moving to an "absolute" position, rather than to
     * an offset from the last position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_PAGE_DOWN    = 4 + SCROLL_EVENT;

    /**
     * The user has activated the <em>page down</em>
     * area of a scroll bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_PAGE_UP      = 3 + SCROLL_EVENT;

    /**
     * The user has activated the <em>page up</em>
     * area of a scroll bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_LINE_DOWN    = 2 + SCROLL_EVENT;

    /**
     * The user has activated the <em>line down</em>
     * area of a scroll bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_LINE_UP      = 1 + SCROLL_EVENT;

    /**
     * The user has activated the <em>line up</em>
     * area of a scroll bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int MOUSE_DRAG          = 6 + MOUSE_EVENT;

    /**
     * The user has moved the mouse with a button pressed. The
     * <code>ALT_MASK</code> flag indicates that the middle
     * button is being pressed. The <code>META_MASK</code> flag indicates
     * that the right button is being pressed.
     * @see     java.awt.Event#ALT_MASK
     * @see     java.awt.Event#META_MASK
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int MOUSE_EXIT          = 5 + MOUSE_EVENT;

    /**
     * The mouse has exited a component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int MOUSE_ENTER         = 4 + MOUSE_EVENT;

    /**
     * The mouse has entered a component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int MOUSE_MOVE          = 3 + MOUSE_EVENT;

    /**
     * The mouse has moved with no button pressed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int MOUSE_UP            = 2 + MOUSE_EVENT;

    /**
     * The user has released the mouse button. The <code>ALT_MASK</code>
     * flag indicates that the middle button has been released.
     * The <code>META_MASK</code>flag indicates that the
     * right button has been released.
     * @see     java.awt.Event#ALT_MASK
     * @see     java.awt.Event#META_MASK
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int MOUSE_DOWN          = 1 + MOUSE_EVENT;

    /**
     * The user has pressed the mouse button. The <code>ALT_MASK</code>
     * flag indicates that the middle button has been pressed.
     * The <code>META_MASK</code>flag indicates that the
     * right button has been pressed.
     * @see     java.awt.Event#ALT_MASK
     * @see     java.awt.Event#META_MASK
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int KEY_ACTION_RELEASE  = 4 + KEY_EVENT;

    /**
     * The user has released a non-ASCII <em>action</em> key.
     * The <code>key</code> field contains a value that indicates
     * that the event occurred on one of the action keys, which
     * comprise the 12 function keys, the arrow (cursor) keys,
     * Page Up, Page Down, Home, End, Print Screen, Scroll Lock,
     * Caps Lock, Num Lock, Pause, and Insert.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int KEY_ACTION          = 3 + KEY_EVENT;

    /**
     * The user has pressed a non-ASCII <em>action</em> key.
     * The <code>key</code> field contains a value that indicates
     * that the event occurred on one of the action keys, which
     * comprise the 12 function keys, the arrow (cursor) keys,
     * Page Up, Page Down, Home, End, Print Screen, Scroll Lock,
     * Caps Lock, Num Lock, Pause, and Insert.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int KEY_RELEASE         = 2 + KEY_EVENT;

    /**
     * The user has released a normal key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int KEY_PRESS           = 1 + KEY_EVENT;

    /**
     * The user has pressed a normal key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int WINDOW_MOVED        = 5 + WINDOW_EVENT;

    /**
     * The user has asked the window manager to move the window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int WINDOW_DEICONIFY    = 4 + WINDOW_EVENT;

    /**
     * The user has asked the window manager to de-iconify the window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int WINDOW_ICONIFY      = 3 + WINDOW_EVENT;

    /**
     * The user has asked the window manager to iconify the window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int WINDOW_EXPOSE       = 2 + WINDOW_EVENT;

    /**
     * The user has asked the window manager to expose the window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int WINDOW_DESTROY      = 1 + WINDOW_EVENT;

    /**
     * The user has asked the window manager to kill the window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int DELETE              = 127;

    /**
     * The Delete key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int ESCAPE              = 27;

    /**
     * The Escape key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int TAB                 = '\t';

    /**
     * The Tab key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int BACK_SPACE          = '\b';

    /**
     * The BackSpace key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int ENTER               = '\n';

    /**
     * The Enter key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int INSERT              = 1025;

    /**
     * The Insert key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int PAUSE               = 1024;

    /**
     * The Pause key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int NUM_LOCK            = 1023;

    /**
     * The Num Lock key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int CAPS_LOCK           = 1022;

    /**
     * The Caps Lock key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_LOCK         = 1021;

    /**
     * The Scroll Lock key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int PRINT_SCREEN        = 1020;

    /**
     * The Print Screen key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F12                 = 1019;

    /**
     * The F12 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F11                 = 1018;

    /**
     * The F11 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F10                 = 1017;

    /**
     * The F10 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F9                  = 1016;

    /**
     * The F9 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F8                  = 1015;

    /**
     * The F8 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F7                  = 1014;

    /**
     * The F7 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F6                  = 1013;

    /**
     * The F6 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F5                  = 1012;

    /**
     * The F5 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F4                  = 1011;

    /**
     * The F4 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F3                  = 1010;

    /**
     * The F3 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F2                  = 1009;

    /**
     * The F2 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F1                  = 1008;

    /**
     * The F1 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int RIGHT               = 1007;

    /**
     * The Right Arrow key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int LEFT                = 1006;

    /**
     * The Left Arrow key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int DOWN                = 1005;

    /**
     * The Down Arrow key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int UP                  = 1004;

    /**
     * The Up Arrow key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int PGDN                = 1003;

    /**
     * The Page Down key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int PGUP                = 1002;

    /**
     * The Page Up key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int END                 = 1001;

    /**
     * The End key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int HOME                = 1000;

    /**
     * The Home key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int ALT_MASK            = 1 << 3;

    /**
     * This flag indicates that the Alt key was down when
     * the event occurred. For mouse events, this flag indicates that the
     * middle mouse button was pressed or released.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int META_MASK           = 1 << 2;

    /**
     * This flag indicates that the Meta key was down when the event
     * occurred. For mouse events, this flag indicates that the right
     * button was pressed or released.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int CTRL_MASK           = 1 << 1;

    /**
     * This flag indicates that the Control key was down when the event
     * occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SHIFT_MASK          = 1 << 0;

    /**
     * This flag indicates that the Shift key was down when the event
     * occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
public class Event implements java.io.Serializable {

/**
 * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
 * available only for backwards compatibility.  It has been replaced
 * by the <code>AWTEvent</code> class and its subclasses.
 * <p>
 * <code>Event</code> is a platform-independent class that
 * encapsulates events from the platform's Graphical User
 * Interface in the Java&nbsp;1.0 event model. In Java&nbsp;1.1
 * and later versions, the <code>Event</code> class is maintained
 * only for backwards compatibility. The information in this
 * class description is provided to assist programmers in
 * converting Java&nbsp;1.0 programs to the new event model.
 * <p>
 * In the Java&nbsp;1.0 event model, an event contains an
 * {@link Event#id} field
 * that indicates what type of event it is and which other
 * <code>Event</code> variables are relevant for the event.
 * <p>
 * For keyboard events, {@link Event#key}
 * contains a value indicating which key was activated, and
 * {@link Event#modifiers} contains the
 * modifiers for that event.  For the KEY_PRESS and KEY_RELEASE
 * event ids, the value of <code>key</code> is the unicode
 * character code for the key. For KEY_ACTION and
 * KEY_ACTION_RELEASE, the value of <code>key</code> is
 * one of the defined action-key identifiers in the
 * <code>Event</code> class (<code>PGUP</code>,
 * <code>PGDN</code>, <code>F1</code>, <code>F2</code>, etc).
 *
 * @author     Sami Shaio
 * @since      JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public String toString() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Returns a representation of this event's values as a string.
     * @return    a string that represents the event and the values
     *                 of its member fields.
     * @see       java.awt.Event#paramString
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    protected String paramString() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Returns a string representing the state of this <code>Event</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return    the parameter string of this event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    boolean isConsumed() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    void consume() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public boolean metaDown() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Checks if the Meta key is down.
     *
     * @return    <code>true</code> if the key is down;
     *            <code>false</code> otherwise.
     * @see       java.awt.Event#modifiers
     * @see       java.awt.Event#shiftDown
     * @see       java.awt.Event#controlDown
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public boolean controlDown() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Checks if the Control key is down.
     * @return    <code>true</code> if the key is down;
     *            <code>false</code> otherwise.
     * @see       java.awt.Event#modifiers
     * @see       java.awt.Event#shiftDown
     * @see       java.awt.Event#metaDown
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public boolean shiftDown() {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Checks if the Shift key is down.
     * @return    <code>true</code> if the key is down;
     *            <code>false</code> otherwise.
     * @see       java.awt.Event#modifiers
     * @see       java.awt.Event#controlDown
     * @see       java.awt.Event#metaDown
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public void translate(int dx, int dy) {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Translates this event so that its <i>x</i> and <i>y</i>
     * coordinates are increased by <i>dx</i> and <i>dy</i>,
     * respectively.
     * <p>
     * This method translates an event relative to the given component.
     * This involves, at a minimum, translating the coordinates into the
     * local coordinate system of the given component. It may also involve
     * translating a region in the case of an expose event.
     * @param     dx     the distance to translate the <i>x</i> coordinate.
     * @param     dy     the distance to translate the <i>y</i> coordinate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public Event(Object target, int id, Object arg) {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Creates an instance of <code>Event</code> with the specified
     * target component, event type, and argument.
     * @param     target     the target component.
     * @param     id         the event type.
     * @param     arg        the specified argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public Event(Object target, long when, int id, int x, int y, int key, int modifiers) {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Creates an instance of <code>Event</code>, with the specified target
     * component, time stamp, event type, <i>x</i> and <i>y</i>
     * coordinates, keyboard key, state of the modifier keys, and an
     * argument set to <code>null</code>.
     * @param     target     the target component.
     * @param     when       the time stamp.
     * @param     id         the event type.
     * @param     x          the <i>x</i> coordinate.
     * @param     y          the <i>y</i> coordinate.
     * @param     key        the key pressed in a keyboard event.
     * @param     modifiers  the state of the modifier keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public Event(Object target, long when, int id, int x, int y, int key,
                 int modifiers, Object arg) {

    /**
     * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
     * available only for backwards compatibility.  It has been replaced
     * by the <code>AWTEvent</code> class and its subclasses.
     * <p>
     * Creates an instance of <code>Event</code> with the specified target
     * component, time stamp, event type, <i>x</i> and <i>y</i>
     * coordinates, keyboard key, state of the modifier keys, and
     * argument.
     * @param     target     the target component.
     * @param     when       the time stamp.
     * @param     id         the event type.
     * @param     x          the <i>x</i> coordinate.
     * @param     y          the <i>y</i> coordinate.
     * @param     key        the key pressed in a keyboard event.
     * @param     modifiers  the state of the modifier keys.
     * @param     arg        the specified argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
       accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    private boolean consumed = false;

    /**
     * This field controls whether or not the event is sent back
     * down to the peer once the target has processed it -
     * false means it's sent to the peer, true means it's not.
     *
     * @serial
     * @see #isConsumed()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public Event evt;

    /**
     * The next event. This field is set when putting events into a
     * linked list.
     * This has been replaced by EventQueue.
     *
     * @serial
     * @see java.awt.EventQueue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public Object arg;

    /**
     * An arbitrary argument of the event. The value of this field
     * depends on the type of event.
     * <code>arg</code> has been replaced by event specific property.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public int clickCount;

    /**
     * For <code>MOUSE_DOWN</code> events, this field indicates the
     * number of consecutive clicks. For other events, its value is
     * <code>0</code>.
     * This field has been replaced by MouseEvent.getClickCount().
     *
     * @serial
     * @see java.awt.event.MouseEvent#getClickCount()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public int modifiers;

    /**
     * The state of the modifier keys.
     * This is replaced with InputEvent.getModifiers()
     * In java 1.1 MouseEvent and KeyEvent are subclasses
     * of InputEvent.
     *
     * @serial
     * @see java.awt.event.InputEvent#getModifiers()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
//    public char keyChar;

    /**
     * The key character that was pressed in a keyboard event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public int key;

    /**
     * The key code of the key that was pressed in a keyboard event.
     * This has been replaced by KeyEvent.getKeyCode()
     *
     * @serial
     * @see java.awt.event.KeyEvent#getKeyCode()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public int y;

    /**
     * The <i>y</i> coordinate of the event.
     * Replaced by MouseEvent.getY()
     *
     * @serial
     * @see java.awt.event.MouseEvent#getY()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public int x;

    /**
     * The <i>x</i> coordinate of the event.
     * Replaced by MouseEvent.getX()
     *
     * @serial
     * @see java.awt.event.MouseEvent#getX()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public int id;

    /**
     * Indicates which type of event the event is, and which
     * other <code>Event</code> variables are relevant for the event.
     * This has been replaced by AWTEvent.getID()
     *
     * @serial
     * @see java.awt.AWTEvent#getID()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public long when;

    /**
     * The time stamp.
     * Replaced by InputEvent.getWhen().
     *
     * @serial
     * @see java.awt.event.InputEvent#getWhen()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public Object target;

    /**
     * The target component. This indicates the component over which the
     * event occurred or with which the event is associated.
     * This object has been replaced by AWTEvent.getSource()
     *
     * @serial
     * @see java.awt.AWTEvent#getSource()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int LOST_FOCUS          = 5 + MISC_EVENT;

    /**
     * A component lost the focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int GOT_FOCUS           = 4 + MISC_EVENT;

    /**
     * A component gained the focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SAVE_FILE           = 3 + MISC_EVENT;

    /**
     * A file saving event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int LOAD_FILE           = 2 + MISC_EVENT;

    /**
     * A file loading event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int ACTION_EVENT        = 1 + MISC_EVENT;

    /**
     * This event indicates that the user wants some action to occur.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int LIST_DESELECT       = 2 + LIST_EVENT;

    /**
     * An item in a list has been deselected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int LIST_SELECT         = 1 + LIST_EVENT;

    /**
     * An item in a list has been selected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_END          = 7 + SCROLL_EVENT;

    /**
     * The scroll end event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_BEGIN        = 6 + SCROLL_EVENT;

    /**
     * The scroll begin event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_ABSOLUTE     = 5 + SCROLL_EVENT;

    /**
     * The user has moved the bubble (thumb) in a scroll bar,
     * moving to an "absolute" position, rather than to
     * an offset from the last position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_PAGE_DOWN    = 4 + SCROLL_EVENT;

    /**
     * The user has activated the <em>page down</em>
     * area of a scroll bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_PAGE_UP      = 3 + SCROLL_EVENT;

    /**
     * The user has activated the <em>page up</em>
     * area of a scroll bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_LINE_DOWN    = 2 + SCROLL_EVENT;

    /**
     * The user has activated the <em>line down</em>
     * area of a scroll bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_LINE_UP      = 1 + SCROLL_EVENT;

    /**
     * The user has activated the <em>line up</em>
     * area of a scroll bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int MOUSE_DRAG          = 6 + MOUSE_EVENT;

    /**
     * The user has moved the mouse with a button pressed. The
     * <code>ALT_MASK</code> flag indicates that the middle
     * button is being pressed. The <code>META_MASK</code> flag indicates
     * that the right button is being pressed.
     * @see     java.awt.Event#ALT_MASK
     * @see     java.awt.Event#META_MASK
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int MOUSE_EXIT          = 5 + MOUSE_EVENT;

    /**
     * The mouse has exited a component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int MOUSE_ENTER         = 4 + MOUSE_EVENT;

    /**
     * The mouse has entered a component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int MOUSE_MOVE          = 3 + MOUSE_EVENT;

    /**
     * The mouse has moved with no button pressed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int MOUSE_UP            = 2 + MOUSE_EVENT;

    /**
     * The user has released the mouse button. The <code>ALT_MASK</code>
     * flag indicates that the middle button has been released.
     * The <code>META_MASK</code>flag indicates that the
     * right button has been released.
     * @see     java.awt.Event#ALT_MASK
     * @see     java.awt.Event#META_MASK
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int MOUSE_DOWN          = 1 + MOUSE_EVENT;

    /**
     * The user has pressed the mouse button. The <code>ALT_MASK</code>
     * flag indicates that the middle button has been pressed.
     * The <code>META_MASK</code>flag indicates that the
     * right button has been pressed.
     * @see     java.awt.Event#ALT_MASK
     * @see     java.awt.Event#META_MASK
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int KEY_ACTION_RELEASE  = 4 + KEY_EVENT;

    /**
     * The user has released a non-ASCII <em>action</em> key.
     * The <code>key</code> field contains a value that indicates
     * that the event occurred on one of the action keys, which
     * comprise the 12 function keys, the arrow (cursor) keys,
     * Page Up, Page Down, Home, End, Print Screen, Scroll Lock,
     * Caps Lock, Num Lock, Pause, and Insert.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int KEY_ACTION          = 3 + KEY_EVENT;

    /**
     * The user has pressed a non-ASCII <em>action</em> key.
     * The <code>key</code> field contains a value that indicates
     * that the event occurred on one of the action keys, which
     * comprise the 12 function keys, the arrow (cursor) keys,
     * Page Up, Page Down, Home, End, Print Screen, Scroll Lock,
     * Caps Lock, Num Lock, Pause, and Insert.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int KEY_RELEASE         = 2 + KEY_EVENT;

    /**
     * The user has released a normal key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int KEY_PRESS           = 1 + KEY_EVENT;

    /**
     * The user has pressed a normal key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int WINDOW_MOVED        = 5 + WINDOW_EVENT;

    /**
     * The user has asked the window manager to move the window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int WINDOW_DEICONIFY    = 4 + WINDOW_EVENT;

    /**
     * The user has asked the window manager to de-iconify the window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int WINDOW_ICONIFY      = 3 + WINDOW_EVENT;

    /**
     * The user has asked the window manager to iconify the window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int WINDOW_EXPOSE       = 2 + WINDOW_EVENT;

    /**
     * The user has asked the window manager to expose the window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int WINDOW_DESTROY      = 1 + WINDOW_EVENT;

    /**
     * The user has asked the window manager to kill the window.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int DELETE              = 127;

    /**
     * The Delete key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int ESCAPE              = 27;

    /**
     * The Escape key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int TAB                 = '\t';

    /**
     * The Tab key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int BACK_SPACE          = '\b';

    /**
     * The BackSpace key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int ENTER               = '\n';

    /**
     * The Enter key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int INSERT              = 1025;

    /**
     * The Insert key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int PAUSE               = 1024;

    /**
     * The Pause key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int NUM_LOCK            = 1023;

    /**
     * The Num Lock key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int CAPS_LOCK           = 1022;

    /**
     * The Caps Lock key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SCROLL_LOCK         = 1021;

    /**
     * The Scroll Lock key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int PRINT_SCREEN        = 1020;

    /**
     * The Print Screen key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F12                 = 1019;

    /**
     * The F12 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F11                 = 1018;

    /**
     * The F11 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F10                 = 1017;

    /**
     * The F10 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F9                  = 1016;

    /**
     * The F9 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F8                  = 1015;

    /**
     * The F8 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F7                  = 1014;

    /**
     * The F7 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F6                  = 1013;

    /**
     * The F6 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F5                  = 1012;

    /**
     * The F5 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F4                  = 1011;

    /**
     * The F4 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F3                  = 1010;

    /**
     * The F3 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F2                  = 1009;

    /**
     * The F2 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int F1                  = 1008;

    /**
     * The F1 function key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int RIGHT               = 1007;

    /**
     * The Right Arrow key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int LEFT                = 1006;

    /**
     * The Left Arrow key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int DOWN                = 1005;

    /**
     * The Down Arrow key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int UP                  = 1004;

    /**
     * The Up Arrow key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int PGDN                = 1003;

    /**
     * The Page Down key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int PGUP                = 1002;

    /**
     * The Page Up key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int END                 = 1001;

    /**
     * The End key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int HOME                = 1000;

    /**
     * The Home key, a non-ASCII action key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int ALT_MASK            = 1 << 3;

    /**
     * This flag indicates that the Alt key was down when
     * the event occurred. For mouse events, this flag indicates that the
     * middle mouse button was pressed or released.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int META_MASK           = 1 << 2;

    /**
     * This flag indicates that the Meta key was down when the event
     * occurred. For mouse events, this flag indicates that the right
     * button was pressed or released.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int CTRL_MASK           = 1 << 1;

    /**
     * This flag indicates that the Control key was down when the event
     * occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
    public static final int SHIFT_MASK          = 1 << 0;

    /**
     * This flag indicates that the Shift key was down when the event
     * occurred.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Event.java
public class Event implements java.io.Serializable {

/**
 * <b>NOTE:</b> The <code>Event</code> class is obsolete and is
 * available only for backwards compatibility.  It has been replaced
 * by the <code>AWTEvent</code> class and its subclasses.
 * <p>
 * <code>Event</code> is a platform-independent class that
 * encapsulates events from the platform's Graphical User
 * Interface in the Java&nbsp;1.0 event model. In Java&nbsp;1.1
 * and later versions, the <code>Event</code> class is maintained
 * only for backwards compatibility. The information in this
 * class description is provided to assist programmers in
 * converting Java&nbsp;1.0 programs to the new event model.
 * <p>
 * In the Java&nbsp;1.0 event model, an event contains an
 * {@link Event#id} field
 * that indicates what type of event it is and which other
 * <code>Event</code> variables are relevant for the event.
 * <p>
 * For keyboard events, {@link Event#key}
 * contains a value indicating which key was activated, and
 * {@link Event#modifiers} contains the
 * modifiers for that event.  For the KEY_PRESS and KEY_RELEASE
 * event ids, the value of <code>key</code> is the unicode
 * character code for the key. For KEY_ACTION and
 * KEY_ACTION_RELEASE, the value of <code>key</code> is
 * one of the defined action-key identifiers in the
 * <code>Event</code> class (<code>PGUP</code>,
 * <code>PGDN</code>, <code>F1</code>, <code>F2</code>, etc).
 *
 * @author     Sami Shaio
 * @since      JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/Event.java
    public void initEvent(String eventTypeArg,
                          boolean canBubbleArg,
                          boolean cancelableArg);

    /**
     * The <code>initEvent</code> method is used to initialize the value of an
     * <code>Event</code> created through the <code>DocumentEvent</code>
     * interface. This method may only be called before the
     * <code>Event</code> has been dispatched via the
     * <code>dispatchEvent</code> method, though it may be called multiple
     * times during that phase if necessary. If called multiple times the
     * final invocation takes precedence. If called from a subclass of
     * <code>Event</code> interface only the values specified in the
     * <code>initEvent</code> method are modified, all other attributes are
     * left unchanged.
     * @param eventTypeArg Specifies the event type. This type may be any
     *   event type currently defined in this specification or a new event
     *   type.. The string must be an XML name. Any new event type must not
     *   begin with any upper, lower, or mixed case version of the string
     *   "DOM". This prefix is reserved for future DOM event sets. It is
     *   also strongly recommended that third parties adding their own
     *   events use their own prefix to avoid confusion and lessen the
     *   probability of conflicts with other new events.
     * @param canBubbleArg Specifies whether or not the event can bubble.
     * @param cancelableArg Specifies whether or not the event's default
     *   action can be prevented.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/Event.java
    public void preventDefault();

    /**
     * If an event is cancelable, the <code>preventDefault</code> method is
     * used to signify that the event is to be canceled, meaning any default
     * action normally taken by the implementation as a result of the event
     * will not occur. If, during any stage of event flow, the
     * <code>preventDefault</code> method is called the event is canceled.
     * Any default action associated with the event will not occur. Calling
     * this method for a non-cancelable event has no effect. Once
     * <code>preventDefault</code> has been called it will remain in effect
     * throughout the remainder of the event's propagation. This method may
     * be used during any stage of event flow.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/Event.java
    public void stopPropagation();

    /**
     * The <code>stopPropagation</code> method is used prevent further
     * propagation of an event during event flow. If this method is called
     * by any <code>EventListener</code> the event will cease propagating
     * through the tree. The event will complete dispatch to all listeners
     * on the current <code>EventTarget</code> before event flow stops. This
     * method may be used during any stage of event flow.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/Event.java
    public long getTimeStamp();

    /**
     *  Used to specify the time (in milliseconds relative to the epoch) at
     * which the event was created. Due to the fact that some systems may
     * not provide this information the value of <code>timeStamp</code> may
     * be not available for all events. When not available, a value of 0
     * will be returned. Examples of epoch time are the time of the system
     * start or 0:0:0 UTC 1st January 1970.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/Event.java
    public boolean getCancelable();

    /**
     * Used to indicate whether or not an event can have its default action
     * prevented. If the default action can be prevented the value is true,
     * else the value is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/Event.java
    public boolean getBubbles();

    /**
     * Used to indicate whether or not an event is a bubbling event. If the
     * event can bubble the value is true, else the value is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/Event.java
    public short getEventPhase();

    /**
     * Used to indicate which phase of event flow is currently being
     * evaluated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/Event.java
    public EventTarget getCurrentTarget();

    /**
     * Used to indicate the <code>EventTarget</code> whose
     * <code>EventListeners</code> are currently being processed. This is
     * particularly useful during capturing and bubbling.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/Event.java
    public EventTarget getTarget();

    /**
     * Used to indicate the <code>EventTarget</code> to which the event was
     * originally dispatched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/Event.java
    public String getType();

    /**
     * The name of the event (case-insensitive). The name must be an XML name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/Event.java
    public static final short BUBBLING_PHASE            = 3;

    /**
     * The current event phase is the bubbling phase.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/Event.java
    public static final short CAPTURING_PHASE           = 1;

    /**
     * The current event phase is the capturing phase.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/Event.java
public interface Event {

/**
 * The <code>Event</code> interface is used to provide contextual information
 * about an event to the handler processing the event. An object which
 * implements the <code>Event</code> interface is generally passed as the
 * first parameter to an event handler. More specific context information is
 * passed to event handlers by deriving additional interfaces from
 * <code>Event</code> which contain information directly relating to the
 * type of event they accompany. These derived interfaces are also
 * implemented by the object passed to the event listener.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Events-20001113'>Document Object Model (DOM) Level 2 Events Specification</a>.
 * @since DOM Level 2
 */
