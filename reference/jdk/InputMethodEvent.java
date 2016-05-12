_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    private static long getMostRecentEventTimeForSource(Object source) {

    /**
     * Get the most recent event time in the {@code EventQueue} which the {@code source}
     * belongs to.
     *
     * @param source the source of the event
     * @exception  IllegalArgumentException  if source is null.
     * @return most recent event time in the {@code EventQueue}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {

    /**
     * Initializes the <code>when</code> field if it is not present in the
     * object input stream. In that case, the field will be initialized by
     * invoking {@link java.awt.EventQueue#getMostRecentEventTime()}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public String paramString() {

    /**
     * Returns a parameter string identifying this event.
     * This method is useful for event-logging and for debugging.
     * It contains the event ID in text form, the characters of the
     * committed and composed text
     * separated by "+", the number of committed characters,
     * the caret, and the visible position.
     *
     * @return a string identifying the event and its attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public long getWhen() {

    /**
     * Returns the time stamp of when this event occurred.
     *
     * @return this event's timestamp
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public boolean isConsumed() {

    /**
     * Returns whether or not this event has been consumed.
     * @see #consume
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public void consume() {

    /**
     * Consumes this event so that it will not be processed
     * in the default manner by the source which originated it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public TextHitInfo getVisiblePosition() {

    /**
     * Gets the position that's most important to be visible.
     * <p>
     * The offset of the visible position is relative to the current
     * composed text; that is, the composed text within getText()
     * if this is an <code>INPUT_METHOD_TEXT_CHANGED</code> event,
     * the composed text within getText() of the
     * preceding <code>INPUT_METHOD_TEXT_CHANGED</code> event otherwise.
     *
     * @return the position that's most important to be visible.
     * Null if there's no recommendation for a visible position within current composed text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public TextHitInfo getCaret() {

    /**
     * Gets the caret.
     * <p>
     * The offset of the caret is relative to the current
     * composed text; that is, the composed text within getText()
     * if this is an <code>INPUT_METHOD_TEXT_CHANGED</code> event,
     * the composed text within getText() of the
     * preceding <code>INPUT_METHOD_TEXT_CHANGED</code> event otherwise.
     *
     * @return the caret (a.k.a. insertion point).
     * Null if there's no caret within current composed text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public int getCommittedCharacterCount() {

    /**
     * Gets the number of committed characters in the text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public AttributedCharacterIterator getText() {

    /**
     * Gets the combined committed and composed text.
     * Characters from index 0 to index <code>getCommittedCharacterCount() - 1</code> are committed
     * text, the remaining characters are composed text.
     *
     * @return the text.
     * Always null for CARET_POSITION_CHANGED;
     * may be null for INPUT_METHOD_TEXT_CHANGED if there's no composed or committed text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public InputMethodEvent(Component source, int id, TextHitInfo caret,
            TextHitInfo visiblePosition) {

    /**
     * Constructs an <code>InputMethodEvent</code> with the
     * specified source component, type, caret, and visiblePosition.
     * The text is set to <code>null</code>,
     * <code>committedCharacterCount</code> to 0.
     * <p>
     * The offsets of <code>caret</code> and <code>visiblePosition</code>
     * are relative to the current composed text; that is,
     * the composed text within the <code>text</code> of the
     * preceding <code>INPUT_METHOD_TEXT_CHANGED</code> event if the
     * event being constructed as a <code>CARET_POSITION_CHANGED</code> event.
     * For an <code>INPUT_METHOD_TEXT_CHANGED</code> event without text,
     * <code>caret</code> and <code>visiblePosition</code> must be
     * <code>null</code>.
     * The time stamp for this event is initialized by invoking
     * {@link java.awt.EventQueue#getMostRecentEventTime()}.
     * <p>Note that passing in an invalid <code>id</code> results in
     * unspecified behavior. This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source the object where the event originated
     * @param id the event type
     * @param caret the caret (a.k.a. insertion point);
     *      <code>null</code> if there's no caret within current
     *      composed text
     * @param visiblePosition the position that's most important
     *      to be visible; <code>null</code> if there's no
     *      recommendation for a visible position within current
     *      composed text
     * @throws IllegalArgumentException if <code>id</code> is not
     *      in the range
     *      <code>INPUT_METHOD_FIRST</code>..<code>INPUT_METHOD_LAST</code>
     * @throws IllegalArgumentException if <code>source</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public InputMethodEvent(Component source, int id,
            AttributedCharacterIterator text, int committedCharacterCount,
            TextHitInfo caret, TextHitInfo visiblePosition) {

    /**
     * Constructs an <code>InputMethodEvent</code> with the specified
     * source component, type, text, caret, and visiblePosition.
     * <p>
     * The offsets of caret and visiblePosition are relative to the current
     * composed text; that is, the composed text within <code>text</code>
     * if this is an <code>INPUT_METHOD_TEXT_CHANGED</code> event,
     * the composed text within the <code>text</code> of the
     * preceding <code>INPUT_METHOD_TEXT_CHANGED</code> event otherwise.
     * The time stamp for this event is initialized by invoking
     * {@link java.awt.EventQueue#getMostRecentEventTime()}.
     * <p>Note that passing in an invalid <code>id</code> results in
     * unspecified behavior. This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source the object where the event originated
     * @param id the event type
     * @param text the combined committed and composed text,
     *      committed text first; must be <code>null</code>
     *      when the event type is <code>CARET_POSITION_CHANGED</code>;
     *      may be <code>null</code> for
     *      <code>INPUT_METHOD_TEXT_CHANGED</code> if there's no
     *      committed or composed text
     * @param committedCharacterCount the number of committed
     *      characters in the text
     * @param caret the caret (a.k.a. insertion point);
     *      <code>null</code> if there's no caret within current
     *      composed text
     * @param visiblePosition the position that's most important
     *      to be visible; <code>null</code> if there's no
     *      recommendation for a visible position within current
     *      composed text
     * @throws IllegalArgumentException if <code>id</code> is not
     *      in the range
     *      <code>INPUT_METHOD_FIRST</code>..<code>INPUT_METHOD_LAST</code>;
     *      or if id is <code>CARET_POSITION_CHANGED</code> and
     *      <code>text</code> is not <code>null</code>;
     *      or if <code>committedCharacterCount</code> is not in the range
     *      <code>0</code>..<code>(text.getEndIndex() - text.getBeginIndex())</code>
     * @throws IllegalArgumentException if <code>source</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public InputMethodEvent(Component source, int id, long when,
            AttributedCharacterIterator text, int committedCharacterCount,
            TextHitInfo caret, TextHitInfo visiblePosition) {

    /**
     * Constructs an <code>InputMethodEvent</code> with the specified
     * source component, type, time, text, caret, and visiblePosition.
     * <p>
     * The offsets of caret and visiblePosition are relative to the current
     * composed text; that is, the composed text within <code>text</code>
     * if this is an <code>INPUT_METHOD_TEXT_CHANGED</code> event,
     * the composed text within the <code>text</code> of the
     * preceding <code>INPUT_METHOD_TEXT_CHANGED</code> event otherwise.
     * <p>Note that passing in an invalid <code>id</code> results in
     * unspecified behavior. This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source the object where the event originated
     * @param id the event type
     * @param when a long integer that specifies the time the event occurred
     * @param text the combined committed and composed text,
     *      committed text first; must be <code>null</code>
     *      when the event type is <code>CARET_POSITION_CHANGED</code>;
     *      may be <code>null</code> for
     *      <code>INPUT_METHOD_TEXT_CHANGED</code> if there's no
     *      committed or composed text
     * @param committedCharacterCount the number of committed
     *      characters in the text
     * @param caret the caret (a.k.a. insertion point);
     *      <code>null</code> if there's no caret within current
     *      composed text
     * @param visiblePosition the position that's most important
     *      to be visible; <code>null</code> if there's no
     *      recommendation for a visible position within current
     *      composed text
     * @throws IllegalArgumentException if <code>id</code> is not
     *      in the range
     *      <code>INPUT_METHOD_FIRST</code>..<code>INPUT_METHOD_LAST</code>;
     *      or if id is <code>CARET_POSITION_CHANGED</code> and
     *      <code>text</code> is not <code>null</code>;
     *      or if <code>committedCharacterCount</code> is not in the range
     *      <code>0</code>..<code>(text.getEndIndex() - text.getBeginIndex())</code>
     * @throws IllegalArgumentException if <code>source</code> is null
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    long when;

    /**
     * The time stamp that indicates when the event was created.
     *
     * @serial
     * @see #getWhen
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    @Native public static final int INPUT_METHOD_LAST = INPUT_METHOD_FIRST + 1;

    /**
     * Marks the last integer id for the range of input method event ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    @Native public static final int CARET_POSITION_CHANGED = INPUT_METHOD_FIRST + 1;

    /**
     * The event type indicating a changed insertion point in input method text.
     * This event is
     * generated by input methods while processing input if only the caret changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    @Native public static final int INPUT_METHOD_TEXT_CHANGED = INPUT_METHOD_FIRST;

    /**
     * The event type indicating changed input method text. This event is
     * generated by input methods while processing input.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    @Native public static final int INPUT_METHOD_FIRST = 1100;

    /**
     * Marks the first integer id for the range of input method event ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    private static final long serialVersionUID = 4727190874778922661L;

    /**
     * Serial Version ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
public class InputMethodEvent extends AWTEvent {

/**
 * Input method events contain information about text that is being
 * composed using an input method. Whenever the text changes, the
 * input method sends an event. If the text component that's currently
 * using the input method is an active client, the event is dispatched
 * to that component. Otherwise, it is dispatched to a separate
 * composition window.
 *
 * <p>
 * The text included with the input method event consists of two parts:
 * committed text and composed text. Either part may be empty. The two
 * parts together replace any uncommitted composed text sent in previous events,
 * or the currently selected committed text.
 * Committed text should be integrated into the text component's persistent
 * data, it will not be sent again. Composed text may be sent repeatedly,
 * with changes to reflect the user's editing operations. Committed text
 * always precedes composed text.
 *
 * @author JavaSoft Asia/Pacific
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    private static long getMostRecentEventTimeForSource(Object source) {

    /**
     * Get the most recent event time in the {@code EventQueue} which the {@code source}
     * belongs to.
     *
     * @param source the source of the event
     * @exception  IllegalArgumentException  if source is null.
     * @return most recent event time in the {@code EventQueue}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {

    /**
     * Initializes the <code>when</code> field if it is not present in the
     * object input stream. In that case, the field will be initialized by
     * invoking {@link java.awt.EventQueue#getMostRecentEventTime()}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public String paramString() {

    /**
     * Returns a parameter string identifying this event.
     * This method is useful for event-logging and for debugging.
     * It contains the event ID in text form, the characters of the
     * committed and composed text
     * separated by "+", the number of committed characters,
     * the caret, and the visible position.
     *
     * @return a string identifying the event and its attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public long getWhen() {

    /**
     * Returns the time stamp of when this event occurred.
     *
     * @return this event's timestamp
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public boolean isConsumed() {

    /**
     * Returns whether or not this event has been consumed.
     * @see #consume
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public void consume() {

    /**
     * Consumes this event so that it will not be processed
     * in the default manner by the source which originated it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public TextHitInfo getVisiblePosition() {

    /**
     * Gets the position that's most important to be visible.
     * <p>
     * The offset of the visible position is relative to the current
     * composed text; that is, the composed text within getText()
     * if this is an <code>INPUT_METHOD_TEXT_CHANGED</code> event,
     * the composed text within getText() of the
     * preceding <code>INPUT_METHOD_TEXT_CHANGED</code> event otherwise.
     *
     * @return the position that's most important to be visible.
     * Null if there's no recommendation for a visible position within current composed text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public TextHitInfo getCaret() {

    /**
     * Gets the caret.
     * <p>
     * The offset of the caret is relative to the current
     * composed text; that is, the composed text within getText()
     * if this is an <code>INPUT_METHOD_TEXT_CHANGED</code> event,
     * the composed text within getText() of the
     * preceding <code>INPUT_METHOD_TEXT_CHANGED</code> event otherwise.
     *
     * @return the caret (a.k.a. insertion point).
     * Null if there's no caret within current composed text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public int getCommittedCharacterCount() {

    /**
     * Gets the number of committed characters in the text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public AttributedCharacterIterator getText() {

    /**
     * Gets the combined committed and composed text.
     * Characters from index 0 to index <code>getCommittedCharacterCount() - 1</code> are committed
     * text, the remaining characters are composed text.
     *
     * @return the text.
     * Always null for CARET_POSITION_CHANGED;
     * may be null for INPUT_METHOD_TEXT_CHANGED if there's no composed or committed text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public InputMethodEvent(Component source, int id, TextHitInfo caret,
            TextHitInfo visiblePosition) {

    /**
     * Constructs an <code>InputMethodEvent</code> with the
     * specified source component, type, caret, and visiblePosition.
     * The text is set to <code>null</code>,
     * <code>committedCharacterCount</code> to 0.
     * <p>
     * The offsets of <code>caret</code> and <code>visiblePosition</code>
     * are relative to the current composed text; that is,
     * the composed text within the <code>text</code> of the
     * preceding <code>INPUT_METHOD_TEXT_CHANGED</code> event if the
     * event being constructed as a <code>CARET_POSITION_CHANGED</code> event.
     * For an <code>INPUT_METHOD_TEXT_CHANGED</code> event without text,
     * <code>caret</code> and <code>visiblePosition</code> must be
     * <code>null</code>.
     * The time stamp for this event is initialized by invoking
     * {@link java.awt.EventQueue#getMostRecentEventTime()}.
     * <p>Note that passing in an invalid <code>id</code> results in
     * unspecified behavior. This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source the object where the event originated
     * @param id the event type
     * @param caret the caret (a.k.a. insertion point);
     *      <code>null</code> if there's no caret within current
     *      composed text
     * @param visiblePosition the position that's most important
     *      to be visible; <code>null</code> if there's no
     *      recommendation for a visible position within current
     *      composed text
     * @throws IllegalArgumentException if <code>id</code> is not
     *      in the range
     *      <code>INPUT_METHOD_FIRST</code>..<code>INPUT_METHOD_LAST</code>
     * @throws IllegalArgumentException if <code>source</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public InputMethodEvent(Component source, int id,
            AttributedCharacterIterator text, int committedCharacterCount,
            TextHitInfo caret, TextHitInfo visiblePosition) {

    /**
     * Constructs an <code>InputMethodEvent</code> with the specified
     * source component, type, text, caret, and visiblePosition.
     * <p>
     * The offsets of caret and visiblePosition are relative to the current
     * composed text; that is, the composed text within <code>text</code>
     * if this is an <code>INPUT_METHOD_TEXT_CHANGED</code> event,
     * the composed text within the <code>text</code> of the
     * preceding <code>INPUT_METHOD_TEXT_CHANGED</code> event otherwise.
     * The time stamp for this event is initialized by invoking
     * {@link java.awt.EventQueue#getMostRecentEventTime()}.
     * <p>Note that passing in an invalid <code>id</code> results in
     * unspecified behavior. This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source the object where the event originated
     * @param id the event type
     * @param text the combined committed and composed text,
     *      committed text first; must be <code>null</code>
     *      when the event type is <code>CARET_POSITION_CHANGED</code>;
     *      may be <code>null</code> for
     *      <code>INPUT_METHOD_TEXT_CHANGED</code> if there's no
     *      committed or composed text
     * @param committedCharacterCount the number of committed
     *      characters in the text
     * @param caret the caret (a.k.a. insertion point);
     *      <code>null</code> if there's no caret within current
     *      composed text
     * @param visiblePosition the position that's most important
     *      to be visible; <code>null</code> if there's no
     *      recommendation for a visible position within current
     *      composed text
     * @throws IllegalArgumentException if <code>id</code> is not
     *      in the range
     *      <code>INPUT_METHOD_FIRST</code>..<code>INPUT_METHOD_LAST</code>;
     *      or if id is <code>CARET_POSITION_CHANGED</code> and
     *      <code>text</code> is not <code>null</code>;
     *      or if <code>committedCharacterCount</code> is not in the range
     *      <code>0</code>..<code>(text.getEndIndex() - text.getBeginIndex())</code>
     * @throws IllegalArgumentException if <code>source</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    public InputMethodEvent(Component source, int id, long when,
            AttributedCharacterIterator text, int committedCharacterCount,
            TextHitInfo caret, TextHitInfo visiblePosition) {

    /**
     * Constructs an <code>InputMethodEvent</code> with the specified
     * source component, type, time, text, caret, and visiblePosition.
     * <p>
     * The offsets of caret and visiblePosition are relative to the current
     * composed text; that is, the composed text within <code>text</code>
     * if this is an <code>INPUT_METHOD_TEXT_CHANGED</code> event,
     * the composed text within the <code>text</code> of the
     * preceding <code>INPUT_METHOD_TEXT_CHANGED</code> event otherwise.
     * <p>Note that passing in an invalid <code>id</code> results in
     * unspecified behavior. This method throws an
     * <code>IllegalArgumentException</code> if <code>source</code>
     * is <code>null</code>.
     *
     * @param source the object where the event originated
     * @param id the event type
     * @param when a long integer that specifies the time the event occurred
     * @param text the combined committed and composed text,
     *      committed text first; must be <code>null</code>
     *      when the event type is <code>CARET_POSITION_CHANGED</code>;
     *      may be <code>null</code> for
     *      <code>INPUT_METHOD_TEXT_CHANGED</code> if there's no
     *      committed or composed text
     * @param committedCharacterCount the number of committed
     *      characters in the text
     * @param caret the caret (a.k.a. insertion point);
     *      <code>null</code> if there's no caret within current
     *      composed text
     * @param visiblePosition the position that's most important
     *      to be visible; <code>null</code> if there's no
     *      recommendation for a visible position within current
     *      composed text
     * @throws IllegalArgumentException if <code>id</code> is not
     *      in the range
     *      <code>INPUT_METHOD_FIRST</code>..<code>INPUT_METHOD_LAST</code>;
     *      or if id is <code>CARET_POSITION_CHANGED</code> and
     *      <code>text</code> is not <code>null</code>;
     *      or if <code>committedCharacterCount</code> is not in the range
     *      <code>0</code>..<code>(text.getEndIndex() - text.getBeginIndex())</code>
     * @throws IllegalArgumentException if <code>source</code> is null
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    long when;

    /**
     * The time stamp that indicates when the event was created.
     *
     * @serial
     * @see #getWhen
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    @Native public static final int INPUT_METHOD_LAST = INPUT_METHOD_FIRST + 1;

    /**
     * Marks the last integer id for the range of input method event ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    @Native public static final int CARET_POSITION_CHANGED = INPUT_METHOD_FIRST + 1;

    /**
     * The event type indicating a changed insertion point in input method text.
     * This event is
     * generated by input methods while processing input if only the caret changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    @Native public static final int INPUT_METHOD_TEXT_CHANGED = INPUT_METHOD_FIRST;

    /**
     * The event type indicating changed input method text. This event is
     * generated by input methods while processing input.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    @Native public static final int INPUT_METHOD_FIRST = 1100;

    /**
     * Marks the first integer id for the range of input method event ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
    private static final long serialVersionUID = 4727190874778922661L;

    /**
     * Serial Version ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/InputMethodEvent.java
public class InputMethodEvent extends AWTEvent {

/**
 * Input method events contain information about text that is being
 * composed using an input method. Whenever the text changes, the
 * input method sends an event. If the text component that's currently
 * using the input method is an active client, the event is dispatched
 * to that component. Otherwise, it is dispatched to a separate
 * composition window.
 *
 * <p>
 * The text included with the input method event consists of two parts:
 * committed text and composed text. Either part may be empty. The two
 * parts together replace any uncommitted composed text sent in previous events,
 * or the currently selected committed text.
 * Committed text should be integrated into the text component's persistent
 * data, it will not be sent again. Composed text may be sent repeatedly,
 * with changes to reflect the user's editing operations. Committed text
 * always precedes composed text.
 *
 * @author JavaSoft Asia/Pacific
 * @since 1.2
 */
