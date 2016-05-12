_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public void setUpdateRect(Rectangle updateRect) {

    /**
     * Sets the rectangle representing the area which needs to be
     * repainted in response to this event.
     * @param updateRect the rectangle area which needs to be repainted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public Rectangle getUpdateRect() {

    /**
     * Returns the rectangle representing the area which needs to be
     * repainted in response to this event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public PaintEvent(Component source, int id, Rectangle updateRect) {

    /**
     * Constructs a <code>PaintEvent</code> object with the specified
     * source component and type.
     * <p> This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source     The object where the event originated
     * @param id           The integer that identifies the event type.
     *                     For information on allowable values, see
     *                     the class description for {@link PaintEvent}
     * @param updateRect The rectangle area which needs to be repainted
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getUpdateRect()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    Rectangle updateRect;

    /**
     * This is the rectangle that represents the area on the source
     * component that requires a repaint.
     * This rectangle should be non null.
     *
     * @serial
     * @see java.awt.Rectangle
     * @see #setUpdateRect(Rectangle)
     * @see #getUpdateRect()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public static final int UPDATE = PAINT_FIRST + 1; //801

    /**
     * The update event type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public static final int PAINT = PAINT_FIRST;

    /**
     * The paint event type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public static final int PAINT_LAST          = 801;

    /**
     * Marks the last integer id for the range of paint event ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public static final int PAINT_FIRST         = 800;

    /**
     * Marks the first integer id for the range of paint event ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
public class PaintEvent extends ComponentEvent {

/**
 * The component-level paint event.
 * This event is a special type which is used to ensure that
 * paint/update method calls are serialized along with the other
 * events delivered from the event queue.  This event is not
 * designed to be used with the Event Listener model; programs
 * should continue to override paint/update methods in order
 * render themselves properly.
 * <p>
 * An unspecified behavior will be caused if the {@code id} parameter
 * of any particular {@code PaintEvent} instance is not
 * in the range from {@code PAINT_FIRST} to {@code PAINT_LAST}.
 *
 * @author Amy Fowler
 * @since 1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public void setUpdateRect(Rectangle updateRect) {

    /**
     * Sets the rectangle representing the area which needs to be
     * repainted in response to this event.
     * @param updateRect the rectangle area which needs to be repainted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public Rectangle getUpdateRect() {

    /**
     * Returns the rectangle representing the area which needs to be
     * repainted in response to this event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public PaintEvent(Component source, int id, Rectangle updateRect) {

    /**
     * Constructs a <code>PaintEvent</code> object with the specified
     * source component and type.
     * <p> This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source     The object where the event originated
     * @param id           The integer that identifies the event type.
     *                     For information on allowable values, see
     *                     the class description for {@link PaintEvent}
     * @param updateRect The rectangle area which needs to be repainted
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getUpdateRect()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    Rectangle updateRect;

    /**
     * This is the rectangle that represents the area on the source
     * component that requires a repaint.
     * This rectangle should be non null.
     *
     * @serial
     * @see java.awt.Rectangle
     * @see #setUpdateRect(Rectangle)
     * @see #getUpdateRect()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public static final int UPDATE = PAINT_FIRST + 1; //801

    /**
     * The update event type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public static final int PAINT = PAINT_FIRST;

    /**
     * The paint event type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public static final int PAINT_LAST          = 801;

    /**
     * Marks the last integer id for the range of paint event ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
    public static final int PAINT_FIRST         = 800;

    /**
     * Marks the first integer id for the range of paint event ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/PaintEvent.java
public class PaintEvent extends ComponentEvent {

/**
 * The component-level paint event.
 * This event is a special type which is used to ensure that
 * paint/update method calls are serialized along with the other
 * events delivered from the event queue.  This event is not
 * designed to be used with the Event Listener model; programs
 * should continue to override paint/update methods in order
 * render themselves properly.
 * <p>
 * An unspecified behavior will be caused if the {@code id} parameter
 * of any particular {@code PaintEvent} instance is not
 * in the range from {@code PAINT_FIRST} to {@code PAINT_LAST}.
 *
 * @author Amy Fowler
 * @since 1.1
 */
