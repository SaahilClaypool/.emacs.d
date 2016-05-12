_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    private int        action;

    /**
     * The user's preferred action.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    private Point      origin;

    /**
     * The origin of the drag.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    private Component  component;

    /**
     * The Component associated with this DragGestureEvent.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    private DragSource dragSource;

    /**
     * The DragSource associated with this DragGestureEvent.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    private void readObject(ObjectInputStream s)

    /**
     * Deserializes this <code>DragGestureEvent</code>. This method first
     * performs default deserialization for all non-<code>transient</code>
     * fields. An attempt is then made to deserialize this object's
     * <code>List</code> of gesture events as well. This is first attempted
     * by deserializing the field <code>events</code>, because, in releases
     * prior to 1.4, a non-<code>transient</code> field of this name stored the
     * <code>List</code> of gesture events. If this fails, the next object in
     * the stream is used instead. If the resulting <code>List</code> is
     * <code>null</code>, this object's <code>List</code> of gesture events
     * is set to an empty <code>List</code>.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * Serializes this <code>DragGestureEvent</code>. Performs default
     * serialization and then writes out this object's <code>List</code> of
     * gesture events if and only if the <code>List</code> can be serialized.
     * If not, <code>null</code> is written instead. In this case, a
     * <code>DragGestureEvent</code> created from the resulting deserialized
     * stream will contain an empty <code>List</code> of gesture events.
     *
     * @serialData The default serializable fields, in alphabetical order,
     *             followed by either a <code>List</code> instance, or
     *             <code>null</code>.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public void startDrag(Cursor dragCursor, Image dragImage, Point imageOffset, Transferable transferable, DragSourceListener dsl) throws InvalidDnDOperationException {

    /**
     * Start the drag given the initial <code>Cursor</code> to display,
     * a drag <code>Image</code>, the offset of
     * the <code>Image</code>,
     * the <code>Transferable</code> object, and
     * the <code>DragSourceListener</code> to use.
     * <P>
     * @param dragCursor     The initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see
     *                       <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a>
     *                       for more details on the cursor handling mechanism
     *                       during drag and drop
     * @param dragImage    The source's dragImage
     * @param imageOffset  The dragImage's offset
     * @param transferable The source's Transferable
     * @param dsl          The source's DragSourceListener
     * <P>
     * @throws InvalidDnDOperationException if
     * the Drag and Drop system is unable to
     * initiate a drag operation, or if the user
     * attempts to start a drag while an existing
     * drag operation is still executing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public void startDrag(Cursor dragCursor, Transferable transferable, DragSourceListener dsl) throws InvalidDnDOperationException {

    /**
     * Starts the drag given the initial <code>Cursor</code> to display,
     * the <code>Transferable</code> object,
     * and the <code>DragSourceListener</code> to use.
     * <P>
     * @param dragCursor     The initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see
     *                       <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a>
     *                       for more details on the cursor handling mechanism
     *                       during drag and drop
     * @param transferable The source's Transferable
     * @param dsl          The source's DragSourceListener
     * <P>
     * @throws InvalidDnDOperationException if
     * the Drag and Drop system is unable to
     * initiate a drag operation, or if the user
     * attempts to start a drag while an existing
     * drag operation is still executing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public void startDrag(Cursor dragCursor, Transferable transferable)

    /**
     * Starts the drag operation given the <code>Cursor</code> for this drag
     * operation and the <code>Transferable</code> representing the source data
     * for this drag operation.
     * <br>
     * If a <code>null</code> <code>Cursor</code> is specified no exception will
     * be thrown and default drag cursors will be used instead.
     * <br>
     * If a <code>null</code> <code>Transferable</code> is specified
     * <code>NullPointerException</code> will be thrown.
     * @param dragCursor     The initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see
     *                       <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a>
     *                       for more details on the cursor handling mechanism
     *                       during drag and drop
     * @param transferable The <code>Transferable</code> representing the source
     *                     data for this drag operation.
     *
     * @throws InvalidDnDOperationException if the Drag and Drop
     *         system is unable to initiate a drag operation, or if the user
     *         attempts to start a drag while an existing drag operation is
     *         still executing.
     * @throws NullPointerException if the {@code Transferable} is {@code null}
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public InputEvent getTriggerEvent() {

    /**
     * Returns the initial event that triggered the gesture.
     * <P>
     * @return the first "triggering" event in the sequence of the gesture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public int getDragAction() { return action; }

    /**
     * Returns an <code>int</code> representing the
     * action selected by the user.
     * <P>
     * @return the action selected by the user
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an array of the events comprising the drag gesture.
     * <P>
     * @param array the array of <code>EventObject</code> sub(types)
     * <P>
     * @return an array of the events comprising the gesture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public Object[] toArray() { return events.toArray(); }

    /**
     * Returns an <code>Object</code> array of the
     * events comprising the drag gesture.
     * <P>
     * @return an array of the events comprising the gesture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an <code>Iterator</code> for the events
     * comprising the gesture.
     * <P>
     * @return an Iterator for the events comprising the gesture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public Point getDragOrigin() {

    /**
     * Returns a <code>Point</code> in the coordinates
     * of the <code>Component</code> over which the drag originated.
     * <P>
     * @return the Point where the drag originated in Component coords.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public DragSource getDragSource() { return dragSource; }

    /**
     * Returns the <code>DragSource</code>.
     * <P>
     * @return the <code>DragSource</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public Component getComponent() { return component; }

    /**
     * Returns the <code>Component</code> associated
     * with this <code>DragGestureEvent</code>.
     * <P>
     * @return the Component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public DragGestureRecognizer getSourceAsDragGestureRecognizer() {

    /**
     * Returns the source as a <code>DragGestureRecognizer</code>.
     * <P>
     * @return the source as a <code>DragGestureRecognizer</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public DragGestureEvent(DragGestureRecognizer dgr, int act, Point ori,
                            List<? extends InputEvent> evs)

    /**
     * Constructs a <code>DragGestureEvent</code> object given by the
     * <code>DragGestureRecognizer</code> instance firing this event,
     * an {@code act} parameter representing
     * the user's preferred action, an {@code ori} parameter
     * indicating the origin of the drag, and a {@code List} of
     * events that comprise the gesture({@code evs} parameter).
     * <P>
     * @param dgr The <code>DragGestureRecognizer</code> firing this event
     * @param act The user's preferred action.
     *            For information on allowable values, see
     *            the class description for {@link DragGestureEvent}
     * @param ori The origin of the drag
     * @param evs The <code>List</code> of events that comprise the gesture
     * <P>
     * @throws IllegalArgumentException if any parameter equals {@code null}
     * @throws IllegalArgumentException if the act parameter does not comply with
     *                                  the values given in the class
     *                                  description for {@link DragGestureEvent}
     * @see java.awt.dnd.DnDConstants
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
public class DragGestureEvent extends EventObject {

/**
 * A <code>DragGestureEvent</code> is passed
 * to <code>DragGestureListener</code>'s
 * dragGestureRecognized() method
 * when a particular <code>DragGestureRecognizer</code> detects that a
 * platform dependent drag initiating gesture has occurred
 * on the <code>Component</code> that it is tracking.
 *
 * The {@code action} field of any {@code DragGestureEvent} instance should take one of the following
 * values:
 * <ul>
 * <li> {@code DnDConstants.ACTION_COPY}
 * <li> {@code DnDConstants.ACTION_MOVE}
 * <li> {@code DnDConstants.ACTION_LINK}
 * </ul>
 * Assigning the value different from listed above will cause an unspecified behavior.
 *
 * @see java.awt.dnd.DragGestureRecognizer
 * @see java.awt.dnd.DragGestureListener
 * @see java.awt.dnd.DragSource
 * @see java.awt.dnd.DnDConstants
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    private int        action;

    /**
     * The user's preferred action.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    private Point      origin;

    /**
     * The origin of the drag.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    private Component  component;

    /**
     * The Component associated with this DragGestureEvent.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    private DragSource dragSource;

    /**
     * The DragSource associated with this DragGestureEvent.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    private void readObject(ObjectInputStream s)

    /**
     * Deserializes this <code>DragGestureEvent</code>. This method first
     * performs default deserialization for all non-<code>transient</code>
     * fields. An attempt is then made to deserialize this object's
     * <code>List</code> of gesture events as well. This is first attempted
     * by deserializing the field <code>events</code>, because, in releases
     * prior to 1.4, a non-<code>transient</code> field of this name stored the
     * <code>List</code> of gesture events. If this fails, the next object in
     * the stream is used instead. If the resulting <code>List</code> is
     * <code>null</code>, this object's <code>List</code> of gesture events
     * is set to an empty <code>List</code>.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * Serializes this <code>DragGestureEvent</code>. Performs default
     * serialization and then writes out this object's <code>List</code> of
     * gesture events if and only if the <code>List</code> can be serialized.
     * If not, <code>null</code> is written instead. In this case, a
     * <code>DragGestureEvent</code> created from the resulting deserialized
     * stream will contain an empty <code>List</code> of gesture events.
     *
     * @serialData The default serializable fields, in alphabetical order,
     *             followed by either a <code>List</code> instance, or
     *             <code>null</code>.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public void startDrag(Cursor dragCursor, Image dragImage, Point imageOffset, Transferable transferable, DragSourceListener dsl) throws InvalidDnDOperationException {

    /**
     * Start the drag given the initial <code>Cursor</code> to display,
     * a drag <code>Image</code>, the offset of
     * the <code>Image</code>,
     * the <code>Transferable</code> object, and
     * the <code>DragSourceListener</code> to use.
     * <P>
     * @param dragCursor     The initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see
     *                       <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a>
     *                       for more details on the cursor handling mechanism
     *                       during drag and drop
     * @param dragImage    The source's dragImage
     * @param imageOffset  The dragImage's offset
     * @param transferable The source's Transferable
     * @param dsl          The source's DragSourceListener
     * <P>
     * @throws InvalidDnDOperationException if
     * the Drag and Drop system is unable to
     * initiate a drag operation, or if the user
     * attempts to start a drag while an existing
     * drag operation is still executing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public void startDrag(Cursor dragCursor, Transferable transferable, DragSourceListener dsl) throws InvalidDnDOperationException {

    /**
     * Starts the drag given the initial <code>Cursor</code> to display,
     * the <code>Transferable</code> object,
     * and the <code>DragSourceListener</code> to use.
     * <P>
     * @param dragCursor     The initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see
     *                       <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a>
     *                       for more details on the cursor handling mechanism
     *                       during drag and drop
     * @param transferable The source's Transferable
     * @param dsl          The source's DragSourceListener
     * <P>
     * @throws InvalidDnDOperationException if
     * the Drag and Drop system is unable to
     * initiate a drag operation, or if the user
     * attempts to start a drag while an existing
     * drag operation is still executing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public void startDrag(Cursor dragCursor, Transferable transferable)

    /**
     * Starts the drag operation given the <code>Cursor</code> for this drag
     * operation and the <code>Transferable</code> representing the source data
     * for this drag operation.
     * <br>
     * If a <code>null</code> <code>Cursor</code> is specified no exception will
     * be thrown and default drag cursors will be used instead.
     * <br>
     * If a <code>null</code> <code>Transferable</code> is specified
     * <code>NullPointerException</code> will be thrown.
     * @param dragCursor     The initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see
     *                       <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a>
     *                       for more details on the cursor handling mechanism
     *                       during drag and drop
     * @param transferable The <code>Transferable</code> representing the source
     *                     data for this drag operation.
     *
     * @throws InvalidDnDOperationException if the Drag and Drop
     *         system is unable to initiate a drag operation, or if the user
     *         attempts to start a drag while an existing drag operation is
     *         still executing.
     * @throws NullPointerException if the {@code Transferable} is {@code null}
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public InputEvent getTriggerEvent() {

    /**
     * Returns the initial event that triggered the gesture.
     * <P>
     * @return the first "triggering" event in the sequence of the gesture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public int getDragAction() { return action; }

    /**
     * Returns an <code>int</code> representing the
     * action selected by the user.
     * <P>
     * @return the action selected by the user
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an array of the events comprising the drag gesture.
     * <P>
     * @param array the array of <code>EventObject</code> sub(types)
     * <P>
     * @return an array of the events comprising the gesture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public Object[] toArray() { return events.toArray(); }

    /**
     * Returns an <code>Object</code> array of the
     * events comprising the drag gesture.
     * <P>
     * @return an array of the events comprising the gesture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an <code>Iterator</code> for the events
     * comprising the gesture.
     * <P>
     * @return an Iterator for the events comprising the gesture
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public Point getDragOrigin() {

    /**
     * Returns a <code>Point</code> in the coordinates
     * of the <code>Component</code> over which the drag originated.
     * <P>
     * @return the Point where the drag originated in Component coords.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public DragSource getDragSource() { return dragSource; }

    /**
     * Returns the <code>DragSource</code>.
     * <P>
     * @return the <code>DragSource</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public Component getComponent() { return component; }

    /**
     * Returns the <code>Component</code> associated
     * with this <code>DragGestureEvent</code>.
     * <P>
     * @return the Component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public DragGestureRecognizer getSourceAsDragGestureRecognizer() {

    /**
     * Returns the source as a <code>DragGestureRecognizer</code>.
     * <P>
     * @return the source as a <code>DragGestureRecognizer</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
    public DragGestureEvent(DragGestureRecognizer dgr, int act, Point ori,
                            List<? extends InputEvent> evs)

    /**
     * Constructs a <code>DragGestureEvent</code> object given by the
     * <code>DragGestureRecognizer</code> instance firing this event,
     * an {@code act} parameter representing
     * the user's preferred action, an {@code ori} parameter
     * indicating the origin of the drag, and a {@code List} of
     * events that comprise the gesture({@code evs} parameter).
     * <P>
     * @param dgr The <code>DragGestureRecognizer</code> firing this event
     * @param act The user's preferred action.
     *            For information on allowable values, see
     *            the class description for {@link DragGestureEvent}
     * @param ori The origin of the drag
     * @param evs The <code>List</code> of events that comprise the gesture
     * <P>
     * @throws IllegalArgumentException if any parameter equals {@code null}
     * @throws IllegalArgumentException if the act parameter does not comply with
     *                                  the values given in the class
     *                                  description for {@link DragGestureEvent}
     * @see java.awt.dnd.DnDConstants
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragGestureEvent.java
public class DragGestureEvent extends EventObject {

/**
 * A <code>DragGestureEvent</code> is passed
 * to <code>DragGestureListener</code>'s
 * dragGestureRecognized() method
 * when a particular <code>DragGestureRecognizer</code> detects that a
 * platform dependent drag initiating gesture has occurred
 * on the <code>Component</code> that it is tracking.
 *
 * The {@code action} field of any {@code DragGestureEvent} instance should take one of the following
 * values:
 * <ul>
 * <li> {@code DnDConstants.ACTION_COPY}
 * <li> {@code DnDConstants.ACTION_MOVE}
 * <li> {@code DnDConstants.ACTION_LINK}
 * </ul>
 * Assigning the value different from listed above will cause an unspecified behavior.
 *
 * @see java.awt.dnd.DragGestureRecognizer
 * @see java.awt.dnd.DragGestureListener
 * @see java.awt.dnd.DragSource
 * @see java.awt.dnd.DnDConstants
 */
