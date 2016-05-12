_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    void copyPrivateDataInto(AWTEvent that) {

    /**
     * Copies all private data from this event into that.
     * Space is allocated for the copied data that will be
     * freed when the that is finalized. Upon completion,
     * this event is not changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    Event convertToOld() {

    /**
     * Converts a new event to an old one (used for compatibility).
     * If the new event cannot be converted (because no old equivalent
     * exists) then this returns null.
     *
     * Note: this method is here instead of in each individual new
     * event class in java.awt.event because we don't want to make
     * it public and it needs to be called from java.awt.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    protected boolean isConsumed() {

    /**
     * Returns whether this event has been consumed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    protected void consume() {

    /**
     * Consumes this event, if this event can be consumed. Only low-level,
     * system events can be consumed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public String paramString() {

    /**
     * Returns a string representing the state of this <code>Event</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return  a string representation of this event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public String toString() {

    /**
     * Returns a String representation of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public int getID() {

    /**
     * Returns the event type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public void setSource(Object newSource) {

    /**
     * Retargets an event to a new source. This method is typically used to
     * retarget an event to a lightweight child Component of the original
     * heavyweight source.
     * <p>
     * This method is intended to be used only by event targeting subsystems,
     * such as client-defined KeyboardFocusManagers. It is not for general
     * client use.
     *
     * @param newSource the new Object to which the event should be dispatched
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public AWTEvent(Object source, int id) {

    /**
     * Constructs an AWTEvent object with the specified source object and type.
     *
     * @param source the object where the event originated
     * @param id the event type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public AWTEvent(Event event) {

    /**
     * Constructs an AWTEvent object from the parameters of a 1.0-style event.
     * @param event the old-style event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
     * accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    /**

    /**
     * WARNING: there are more mask defined privately.  See
     * SunToolkit.GRAB_EVENT_MASK.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long WINDOW_FOCUS_EVENT_MASK = 0x80000;

    /**
     * The event mask for selecting window focus events.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long WINDOW_STATE_EVENT_MASK = 0x40000;

    /**
     * The event mask for selecting window state events.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long MOUSE_WHEEL_EVENT_MASK = 0x20000;

    /**
     * The event mask for selecting mouse wheel events.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long HIERARCHY_BOUNDS_EVENT_MASK = 0x10000;

    /**
     * The event mask for selecting hierarchy bounds events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long HIERARCHY_EVENT_MASK = 0x8000;

    /**
     * The event mask for selecting hierarchy events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long INVOCATION_EVENT_MASK = 0x4000;

    /**
     * The event mask for selecting invocation events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long PAINT_EVENT_MASK = 0x2000;

    /**
     * The event mask for selecting paint events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    final static long INPUT_METHODS_ENABLED_MASK = 0x1000;

    /**
     * The pseudo event mask for enabling input methods.
     * We're using one bit in the eventMask so we don't need
     * a separate field inputMethodsEnabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long INPUT_METHOD_EVENT_MASK = 0x800;

    /**
     * The event mask for selecting input method events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long TEXT_EVENT_MASK = 0x400;

    /**
     * The event mask for selecting text events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long ITEM_EVENT_MASK = 0x200;

    /**
     * The event mask for selecting item events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long ADJUSTMENT_EVENT_MASK = 0x100;

    /**
     * The event mask for selecting adjustment events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long ACTION_EVENT_MASK = 0x80;

    /**
     * The event mask for selecting action events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long WINDOW_EVENT_MASK = 0x40;

    /**
     * The event mask for selecting window events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long MOUSE_MOTION_EVENT_MASK = 0x20;

    /**
     * The event mask for selecting mouse motion events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long MOUSE_EVENT_MASK = 0x10;

    /**
     * The event mask for selecting mouse events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long KEY_EVENT_MASK = 0x08;

    /**
     * The event mask for selecting key events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long FOCUS_EVENT_MASK = 0x04;

    /**
     * The event mask for selecting focus events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long CONTAINER_EVENT_MASK = 0x02;

    /**
     * The event mask for selecting container events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long COMPONENT_EVENT_MASK = 0x01;

    /**
     * The event mask for selecting component events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    private transient boolean isSystemGenerated;

    /**
     * Indicates whether this AWTEvent was generated by the system as
     * opposed to by user code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    protected boolean consumed = false;

    /**
     * Controls whether or not the event is sent back down to the peer once the
     * source has processed it - false means it's sent to the peer; true means
     * it's not. Semantic events always have a 'true' value since they were
     * generated by the peer in response to a low-level event.
     * @serial
     * @see #consume
     * @see #isConsumed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    protected int id;

    /**
     * The event's id.
     * @serial
     * @see #getID()
     * @see #AWTEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
public abstract class AWTEvent extends EventObject {

/**
 * The root event class for all AWT events.
 * This class and its subclasses supercede the original
 * java.awt.Event class.
 * Subclasses of this root AWTEvent class defined outside of the
 * java.awt.event package should define event ID values greater than
 * the value defined by RESERVED_ID_MAX.
 * <p>
 * The event masks defined in this class are needed by Component subclasses
 * which are using Component.enableEvents() to select for event types not
 * selected by registered listeners. If a listener is registered on a
 * component, the appropriate event mask is already set internally by the
 * component.
 * <p>
 * The masks are also used to specify to which types of events an
 * AWTEventListener should listen. The masks are bitwise-ORed together
 * and passed to Toolkit.addAWTEventListener.
 *
 * @see Component#enableEvents
 * @see Toolkit#addAWTEventListener
 *
 * @see java.awt.event.ActionEvent
 * @see java.awt.event.AdjustmentEvent
 * @see java.awt.event.ComponentEvent
 * @see java.awt.event.ContainerEvent
 * @see java.awt.event.FocusEvent
 * @see java.awt.event.InputMethodEvent
 * @see java.awt.event.InvocationEvent
 * @see java.awt.event.ItemEvent
 * @see java.awt.event.HierarchyEvent
 * @see java.awt.event.KeyEvent
 * @see java.awt.event.MouseEvent
 * @see java.awt.event.MouseWheelEvent
 * @see java.awt.event.PaintEvent
 * @see java.awt.event.TextEvent
 * @see java.awt.event.WindowEvent
 *
 * @author Carl Quinn
 * @author Amy Fowler
 * @since 1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    void copyPrivateDataInto(AWTEvent that) {

    /**
     * Copies all private data from this event into that.
     * Space is allocated for the copied data that will be
     * freed when the that is finalized. Upon completion,
     * this event is not changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    Event convertToOld() {

    /**
     * Converts a new event to an old one (used for compatibility).
     * If the new event cannot be converted (because no old equivalent
     * exists) then this returns null.
     *
     * Note: this method is here instead of in each individual new
     * event class in java.awt.event because we don't want to make
     * it public and it needs to be called from java.awt.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    protected boolean isConsumed() {

    /**
     * Returns whether this event has been consumed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    protected void consume() {

    /**
     * Consumes this event, if this event can be consumed. Only low-level,
     * system events can be consumed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public String paramString() {

    /**
     * Returns a string representing the state of this <code>Event</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return  a string representation of this event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public String toString() {

    /**
     * Returns a String representation of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public int getID() {

    /**
     * Returns the event type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public void setSource(Object newSource) {

    /**
     * Retargets an event to a new source. This method is typically used to
     * retarget an event to a lightweight child Component of the original
     * heavyweight source.
     * <p>
     * This method is intended to be used only by event targeting subsystems,
     * such as client-defined KeyboardFocusManagers. It is not for general
     * client use.
     *
     * @param newSource the new Object to which the event should be dispatched
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public AWTEvent(Object source, int id) {

    /**
     * Constructs an AWTEvent object with the specified source object and type.
     *
     * @param source the object where the event originated
     * @param id the event type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public AWTEvent(Event event) {

    /**
     * Constructs an AWTEvent object from the parameters of a 1.0-style event.
     * @param event the old-style event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
     * accessed from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    /**

    /**
     * WARNING: there are more mask defined privately.  See
     * SunToolkit.GRAB_EVENT_MASK.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long WINDOW_FOCUS_EVENT_MASK = 0x80000;

    /**
     * The event mask for selecting window focus events.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long WINDOW_STATE_EVENT_MASK = 0x40000;

    /**
     * The event mask for selecting window state events.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long MOUSE_WHEEL_EVENT_MASK = 0x20000;

    /**
     * The event mask for selecting mouse wheel events.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long HIERARCHY_BOUNDS_EVENT_MASK = 0x10000;

    /**
     * The event mask for selecting hierarchy bounds events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long HIERARCHY_EVENT_MASK = 0x8000;

    /**
     * The event mask for selecting hierarchy events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long INVOCATION_EVENT_MASK = 0x4000;

    /**
     * The event mask for selecting invocation events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long PAINT_EVENT_MASK = 0x2000;

    /**
     * The event mask for selecting paint events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    final static long INPUT_METHODS_ENABLED_MASK = 0x1000;

    /**
     * The pseudo event mask for enabling input methods.
     * We're using one bit in the eventMask so we don't need
     * a separate field inputMethodsEnabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long INPUT_METHOD_EVENT_MASK = 0x800;

    /**
     * The event mask for selecting input method events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long TEXT_EVENT_MASK = 0x400;

    /**
     * The event mask for selecting text events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long ITEM_EVENT_MASK = 0x200;

    /**
     * The event mask for selecting item events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long ADJUSTMENT_EVENT_MASK = 0x100;

    /**
     * The event mask for selecting adjustment events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long ACTION_EVENT_MASK = 0x80;

    /**
     * The event mask for selecting action events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long WINDOW_EVENT_MASK = 0x40;

    /**
     * The event mask for selecting window events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long MOUSE_MOTION_EVENT_MASK = 0x20;

    /**
     * The event mask for selecting mouse motion events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long MOUSE_EVENT_MASK = 0x10;

    /**
     * The event mask for selecting mouse events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long KEY_EVENT_MASK = 0x08;

    /**
     * The event mask for selecting key events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long FOCUS_EVENT_MASK = 0x04;

    /**
     * The event mask for selecting focus events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long CONTAINER_EVENT_MASK = 0x02;

    /**
     * The event mask for selecting container events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    public final static long COMPONENT_EVENT_MASK = 0x01;

    /**
     * The event mask for selecting component events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    private transient boolean isSystemGenerated;

    /**
     * Indicates whether this AWTEvent was generated by the system as
     * opposed to by user code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    protected boolean consumed = false;

    /**
     * Controls whether or not the event is sent back down to the peer once the
     * source has processed it - false means it's sent to the peer; true means
     * it's not. Semantic events always have a 'true' value since they were
     * generated by the peer in response to a low-level event.
     * @serial
     * @see #consume
     * @see #isConsumed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
    protected int id;

    /**
     * The event's id.
     * @serial
     * @see #getID()
     * @see #AWTEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEvent.java
public abstract class AWTEvent extends EventObject {

/**
 * The root event class for all AWT events.
 * This class and its subclasses supercede the original
 * java.awt.Event class.
 * Subclasses of this root AWTEvent class defined outside of the
 * java.awt.event package should define event ID values greater than
 * the value defined by RESERVED_ID_MAX.
 * <p>
 * The event masks defined in this class are needed by Component subclasses
 * which are using Component.enableEvents() to select for event types not
 * selected by registered listeners. If a listener is registered on a
 * component, the appropriate event mask is already set internally by the
 * component.
 * <p>
 * The masks are also used to specify to which types of events an
 * AWTEventListener should listen. The masks are bitwise-ORed together
 * and passed to Toolkit.addAWTEventListener.
 *
 * @see Component#enableEvents
 * @see Toolkit#addAWTEventListener
 *
 * @see java.awt.event.ActionEvent
 * @see java.awt.event.AdjustmentEvent
 * @see java.awt.event.ComponentEvent
 * @see java.awt.event.ContainerEvent
 * @see java.awt.event.FocusEvent
 * @see java.awt.event.InputMethodEvent
 * @see java.awt.event.InvocationEvent
 * @see java.awt.event.ItemEvent
 * @see java.awt.event.HierarchyEvent
 * @see java.awt.event.KeyEvent
 * @see java.awt.event.MouseEvent
 * @see java.awt.event.MouseWheelEvent
 * @see java.awt.event.PaintEvent
 * @see java.awt.event.TextEvent
 * @see java.awt.event.WindowEvent
 *
 * @author Carl Quinn
 * @author Amy Fowler
 * @since 1.1
 */
