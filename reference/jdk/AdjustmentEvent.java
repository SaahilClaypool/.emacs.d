_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public boolean getValueIsAdjusting() {

    /**
     * Returns <code>true</code> if this is one of multiple
     * adjustment events.
     *
     * @return <code>true</code> if this is one of multiple
     *         adjustment events, otherwise returns <code>false</code>
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public int getAdjustmentType() {

    /**
     * Returns the type of adjustment which caused the value changed
     * event.  It will have one of the following values:
     * <ul>
     * <li>{@link #UNIT_INCREMENT}
     * <li>{@link #UNIT_DECREMENT}
     * <li>{@link #BLOCK_INCREMENT}
     * <li>{@link #BLOCK_DECREMENT}
     * <li>{@link #TRACK}
     * </ul>
     * @return one of the adjustment values listed above
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public int getValue() {

    /**
     * Returns the current value in the adjustment event.
     *
     * @return the current value in the adjustment event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public Adjustable getAdjustable() {

    /**
     * Returns the <code>Adjustable</code> object where this event originated.
     *
     * @return the <code>Adjustable</code> object where this event originated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public AdjustmentEvent(Adjustable source, int id, int type, int value, boolean isAdjusting) {

    /**
     * Constructs an <code>AdjustmentEvent</code> object with the
     * specified Adjustable source, event type, adjustment type, and value.
     * <p> This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source The <code>Adjustable</code> object where the
     *               event originated
     * @param id     An integer indicating the type of event.
     *                     For information on allowable values, see
     *                     the class description for {@link AdjustmentEvent}
     * @param type   An integer indicating the adjustment type.
     *                     For information on allowable values, see
     *                     the class description for {@link AdjustmentEvent}
     * @param value  The current value of the adjustment
     * @param isAdjusting A boolean that equals <code>true</code> if the event is one
     *               of a series of multiple adjusting events,
     *               otherwise <code>false</code>
     * @throws IllegalArgumentException if <code>source</code> is null
     * @since 1.4
     * @see #getSource()
     * @see #getID()
     * @see #getAdjustmentType()
     * @see #getValue()
     * @see #getValueIsAdjusting()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public AdjustmentEvent(Adjustable source, int id, int type, int value) {

    /**
     * Constructs an <code>AdjustmentEvent</code> object with the
     * specified <code>Adjustable</code> source, event type,
     * adjustment type, and value.
     * <p> This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source The <code>Adjustable</code> object where the
     *               event originated
     * @param id     An integer indicating the type of event.
     *                     For information on allowable values, see
     *                     the class description for {@link AdjustmentEvent}
     * @param type   An integer indicating the adjustment type.
     *                     For information on allowable values, see
     *                     the class description for {@link AdjustmentEvent}
     * @param value  The current value of the adjustment
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getAdjustmentType()
     * @see #getValue()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    boolean isAdjusting;

    /**
     * The <code>isAdjusting</code> is true if the event is one
     * of the series of multiple adjustment events.
     *
     * @since 1.4
     * @serial
     * @see #getValueIsAdjusting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    int adjustmentType;

    /**
     * The <code>adjustmentType</code> describes how the adjustable
     * object value has changed.
     * This value can be increased/decreased by a block or unit amount
     * where the block is associated with page increments/decrements,
     * and a unit is associated with line increments/decrements.
     *
     * @serial
     * @see #getAdjustmentType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    int value;

    /**
     * <code>value</code> will contain the new value of the
     * adjustable object.  This value will always be  in a
     * range associated adjustable object.
     *
     * @serial
     * @see #getValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    Adjustable adjustable;

    /**
     * The adjustable object that fired the event.
     *
     * @serial
     * @see #getAdjustable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    @Native public static final int TRACK               = 5;

    /**
     * The absolute tracking adjustment type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    @Native public static final int BLOCK_INCREMENT     = 4;

    /**
     * The block increment adjustment type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    @Native public static final int BLOCK_DECREMENT     = 3;

    /**
     * The block decrement adjustment type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    @Native public static final int UNIT_DECREMENT      = 2;

    /**
     * The unit decrement adjustment type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    @Native public static final int UNIT_INCREMENT      = 1;

    /**
     * The unit increment adjustment type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public static final int ADJUSTMENT_VALUE_CHANGED = ADJUSTMENT_FIRST; //Event.SCROLL_LINE_UP

    /**
     * The adjustment value changed event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public static final int ADJUSTMENT_LAST     = 601;

    /**
     * Marks the last integer id for the range of adjustment event ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public static final int ADJUSTMENT_FIRST    = 601;

    /**
     * Marks the first integer id for the range of adjustment event ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
public class AdjustmentEvent extends AWTEvent {

/**
 * The adjustment event emitted by Adjustable objects like
 * {@link java.awt.Scrollbar} and {@link java.awt.ScrollPane}.
 * When the user changes the value of the scrolling component,
 * it receives an instance of {@code AdjustmentEvent}.
 * <p>
 * An unspecified behavior will be caused if the {@code id} parameter
 * of any particular {@code AdjustmentEvent} instance is not
 * in the range from {@code ADJUSTMENT_FIRST} to {@code ADJUSTMENT_LAST}.
 * <p>
 * The {@code type} of any {@code AdjustmentEvent} instance takes one of the following
 * values:
 *                     <ul>
 *                     <li> {@code UNIT_INCREMENT}
 *                     <li> {@code UNIT_DECREMENT}
 *                     <li> {@code BLOCK_INCREMENT}
 *                     <li> {@code BLOCK_DECREMENT}
 *                     <li> {@code TRACK}
 *                     </ul>
 * Assigning the value different from listed above will cause an unspecified behavior.
 * @see java.awt.Adjustable
 * @see AdjustmentListener
 *
 * @author Amy Fowler
 * @since 1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public boolean getValueIsAdjusting() {

    /**
     * Returns <code>true</code> if this is one of multiple
     * adjustment events.
     *
     * @return <code>true</code> if this is one of multiple
     *         adjustment events, otherwise returns <code>false</code>
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public int getAdjustmentType() {

    /**
     * Returns the type of adjustment which caused the value changed
     * event.  It will have one of the following values:
     * <ul>
     * <li>{@link #UNIT_INCREMENT}
     * <li>{@link #UNIT_DECREMENT}
     * <li>{@link #BLOCK_INCREMENT}
     * <li>{@link #BLOCK_DECREMENT}
     * <li>{@link #TRACK}
     * </ul>
     * @return one of the adjustment values listed above
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public int getValue() {

    /**
     * Returns the current value in the adjustment event.
     *
     * @return the current value in the adjustment event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public Adjustable getAdjustable() {

    /**
     * Returns the <code>Adjustable</code> object where this event originated.
     *
     * @return the <code>Adjustable</code> object where this event originated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public AdjustmentEvent(Adjustable source, int id, int type, int value, boolean isAdjusting) {

    /**
     * Constructs an <code>AdjustmentEvent</code> object with the
     * specified Adjustable source, event type, adjustment type, and value.
     * <p> This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source The <code>Adjustable</code> object where the
     *               event originated
     * @param id     An integer indicating the type of event.
     *                     For information on allowable values, see
     *                     the class description for {@link AdjustmentEvent}
     * @param type   An integer indicating the adjustment type.
     *                     For information on allowable values, see
     *                     the class description for {@link AdjustmentEvent}
     * @param value  The current value of the adjustment
     * @param isAdjusting A boolean that equals <code>true</code> if the event is one
     *               of a series of multiple adjusting events,
     *               otherwise <code>false</code>
     * @throws IllegalArgumentException if <code>source</code> is null
     * @since 1.4
     * @see #getSource()
     * @see #getID()
     * @see #getAdjustmentType()
     * @see #getValue()
     * @see #getValueIsAdjusting()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public AdjustmentEvent(Adjustable source, int id, int type, int value) {

    /**
     * Constructs an <code>AdjustmentEvent</code> object with the
     * specified <code>Adjustable</code> source, event type,
     * adjustment type, and value.
     * <p> This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source The <code>Adjustable</code> object where the
     *               event originated
     * @param id     An integer indicating the type of event.
     *                     For information on allowable values, see
     *                     the class description for {@link AdjustmentEvent}
     * @param type   An integer indicating the adjustment type.
     *                     For information on allowable values, see
     *                     the class description for {@link AdjustmentEvent}
     * @param value  The current value of the adjustment
     * @throws IllegalArgumentException if <code>source</code> is null
     * @see #getSource()
     * @see #getID()
     * @see #getAdjustmentType()
     * @see #getValue()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    boolean isAdjusting;

    /**
     * The <code>isAdjusting</code> is true if the event is one
     * of the series of multiple adjustment events.
     *
     * @since 1.4
     * @serial
     * @see #getValueIsAdjusting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    int adjustmentType;

    /**
     * The <code>adjustmentType</code> describes how the adjustable
     * object value has changed.
     * This value can be increased/decreased by a block or unit amount
     * where the block is associated with page increments/decrements,
     * and a unit is associated with line increments/decrements.
     *
     * @serial
     * @see #getAdjustmentType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    int value;

    /**
     * <code>value</code> will contain the new value of the
     * adjustable object.  This value will always be  in a
     * range associated adjustable object.
     *
     * @serial
     * @see #getValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    Adjustable adjustable;

    /**
     * The adjustable object that fired the event.
     *
     * @serial
     * @see #getAdjustable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    @Native public static final int TRACK               = 5;

    /**
     * The absolute tracking adjustment type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    @Native public static final int BLOCK_INCREMENT     = 4;

    /**
     * The block increment adjustment type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    @Native public static final int BLOCK_DECREMENT     = 3;

    /**
     * The block decrement adjustment type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    @Native public static final int UNIT_DECREMENT      = 2;

    /**
     * The unit decrement adjustment type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    @Native public static final int UNIT_INCREMENT      = 1;

    /**
     * The unit increment adjustment type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public static final int ADJUSTMENT_VALUE_CHANGED = ADJUSTMENT_FIRST; //Event.SCROLL_LINE_UP

    /**
     * The adjustment value changed event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public static final int ADJUSTMENT_LAST     = 601;

    /**
     * Marks the last integer id for the range of adjustment event ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
    public static final int ADJUSTMENT_FIRST    = 601;

    /**
     * Marks the first integer id for the range of adjustment event ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AdjustmentEvent.java
public class AdjustmentEvent extends AWTEvent {

/**
 * The adjustment event emitted by Adjustable objects like
 * {@link java.awt.Scrollbar} and {@link java.awt.ScrollPane}.
 * When the user changes the value of the scrolling component,
 * it receives an instance of {@code AdjustmentEvent}.
 * <p>
 * An unspecified behavior will be caused if the {@code id} parameter
 * of any particular {@code AdjustmentEvent} instance is not
 * in the range from {@code ADJUSTMENT_FIRST} to {@code ADJUSTMENT_LAST}.
 * <p>
 * The {@code type} of any {@code AdjustmentEvent} instance takes one of the following
 * values:
 *                     <ul>
 *                     <li> {@code UNIT_INCREMENT}
 *                     <li> {@code UNIT_DECREMENT}
 *                     <li> {@code BLOCK_INCREMENT}
 *                     <li> {@code BLOCK_DECREMENT}
 *                     <li> {@code TRACK}
 *                     </ul>
 * Assigning the value different from listed above will cause an unspecified behavior.
 * @see java.awt.Adjustable
 * @see AdjustmentListener
 *
 * @author Amy Fowler
 * @since 1.1
 */
