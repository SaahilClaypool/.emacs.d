_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static int getDragThreshold() {

    /**
     * Returns the drag gesture motion threshold. The drag gesture motion threshold
     * defines the recommended behavior for {@link MouseDragGestureRecognizer}s.
     * <p>
     * If the system property <code>awt.dnd.drag.threshold</code> is set to
     * a positive integer, this method returns the value of the system property;
     * otherwise if a pertinent desktop property is available and supported by
     * the implementation of the Java platform, this method returns the value of
     * that property; otherwise this method returns some default value.
     * The pertinent desktop property can be queried using
     * <code>java.awt.Toolkit.getDesktopProperty("DnD.gestureMotionThreshold")</code>.
     *
     * @return the drag gesture motion threshold
     * @see MouseDragGestureRecognizer
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    private void readObject(ObjectInputStream s)

    /**
     * Deserializes this <code>DragSource</code>. This method first performs
     * default deserialization. Next, this object's <code>FlavorMap</code> is
     * deserialized by using the next object in the stream.
     * If the resulting <code>FlavorMap</code> is <code>null</code>, this
     * object's <code>FlavorMap</code> is set to the default FlavorMap for
     * this thread's <code>ClassLoader</code>.
     * Next, this object's listeners are deserialized by reading a
     * <code>null</code>-terminated sequence of 0 or more key/value pairs
     * from the stream:
     * <ul>
     * <li>If a key object is a <code>String</code> equal to
     * <code>dragSourceListenerK</code>, a <code>DragSourceListener</code> is
     * deserialized using the corresponding value object and added to this
     * <code>DragSource</code>.
     * <li>If a key object is a <code>String</code> equal to
     * <code>dragSourceMotionListenerK</code>, a
     * <code>DragSourceMotionListener</code> is deserialized using the
     * corresponding value object and added to this <code>DragSource</code>.
     * <li>Otherwise, the key/value pair is skipped.
     * </ul>
     *
     * @see java.awt.datatransfer.SystemFlavorMap#getDefaultFlavorMap
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * Serializes this <code>DragSource</code>. This method first performs
     * default serialization. Next, it writes out this object's
     * <code>FlavorMap</code> if and only if it can be serialized. If not,
     * <code>null</code> is written instead. Next, it writes out
     * <code>Serializable</code> listeners registered with this
     * object. Listeners are written in a <code>null</code>-terminated sequence
     * of 0 or more pairs. The pair consists of a <code>String</code> and an
     * <code>Object</code>; the <code>String</code> indicates the type of the
     * <code>Object</code> and is one of the following:
     * <ul>
     * <li><code>dragSourceListenerK</code> indicating a
     *     <code>DragSourceListener</code> object;
     * <li><code>dragSourceMotionListenerK</code> indicating a
     *     <code>DragSourceMotionListener</code> object.
     * </ul>
     *
     * @serialData Either a <code>FlavorMap</code> instance, or
     *      <code>null</code>, followed by a <code>null</code>-terminated
     *      sequence of 0 or more pairs; the pair consists of a
     *      <code>String</code> and an <code>Object</code>; the
     *      <code>String</code> indicates the type of the <code>Object</code>
     *      and is one of the following:
     *      <ul>
     *      <li><code>dragSourceListenerK</code> indicating a
     *          <code>DragSourceListener</code> object;
     *      <li><code>dragSourceMotionListenerK</code> indicating a
     *          <code>DragSourceMotionListener</code> object.
     *      </ul>.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    void processDragMouseMoved(DragSourceDragEvent dsde) {

    /**
     * This method calls <code>dragMouseMoved</code> on the
     * <code>DragSourceMotionListener</code>s registered with this
     * <code>DragSource</code>, and passes them the specified
     * <code>DragSourceDragEvent</code>.
     *
     * @param dsde the <code>DragSourceEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    void processDragDropEnd(DragSourceDropEvent dsde) {

    /**
     * This method calls <code>dragDropEnd</code> on the
     * <code>DragSourceListener</code>s registered with this
     * <code>DragSource</code>, and passes them the specified
     * <code>DragSourceDropEvent</code>.
     *
     * @param dsde the <code>DragSourceEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    void processDragExit(DragSourceEvent dse) {

    /**
     * This method calls <code>dragExit</code> on the
     * <code>DragSourceListener</code>s registered with this
     * <code>DragSource</code>, and passes them the specified
     * <code>DragSourceEvent</code>.
     *
     * @param dse the <code>DragSourceEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    void processDropActionChanged(DragSourceDragEvent dsde) {

    /**
     * This method calls <code>dropActionChanged</code> on the
     * <code>DragSourceListener</code>s registered with this
     * <code>DragSource</code>, and passes them the specified
     * <code>DragSourceDragEvent</code>.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    void processDragOver(DragSourceDragEvent dsde) {

    /**
     * This method calls <code>dragOver</code> on the
     * <code>DragSourceListener</code>s registered with this
     * <code>DragSource</code>, and passes them the specified
     * <code>DragSourceDragEvent</code>.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    void processDragEnter(DragSourceDragEvent dsde) {

    /**
     * This method calls <code>dragEnter</code> on the
     * <code>DragSourceListener</code>s registered with this
     * <code>DragSource</code>, and passes them the specified
     * <code>DragSourceDragEvent</code>.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Gets all the objects currently registered as
     * <code><em>Foo</em>Listener</code>s upon this <code>DragSource</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this
     *          <code>DragSource</code>, or an empty array if no such listeners
     *          have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getDragSourceListeners
     * @see #getDragSourceMotionListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public DragSourceMotionListener[] getDragSourceMotionListeners() {

    /**
     * Gets all of the  <code>DragSourceMotionListener</code>s
     * registered with this <code>DragSource</code>.
     *
     * @return all of this <code>DragSource</code>'s
     *         <code>DragSourceMotionListener</code>s or an empty array if no
     *         such listeners are currently registered
     *
     * @see      #addDragSourceMotionListener
     * @see      #removeDragSourceMotionListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void removeDragSourceMotionListener(DragSourceMotionListener dsml) {

    /**
     * Removes the specified <code>DragSourceMotionListener</code> from this
     * <code>DragSource</code>.
     * If a <code>null</code> listener is specified, no action is taken and no
     * exception is thrown.
     * If the listener specified by the argument was not previously added to
     * this <code>DragSource</code>, no action is taken and no exception
     * is thrown.
     *
     * @param dsml the <code>DragSourceMotionListener</code> to remove
     *
     * @see      #addDragSourceMotionListener
     * @see      #getDragSourceMotionListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void addDragSourceMotionListener(DragSourceMotionListener dsml) {

    /**
     * Adds the specified <code>DragSourceMotionListener</code> to this
     * <code>DragSource</code> to receive drag motion events during drag
     * operations intiated with this <code>DragSource</code>.
     * If a <code>null</code> listener is specified, no action is taken and no
     * exception is thrown.
     *
     * @param dsml the <code>DragSourceMotionListener</code> to add
     *
     * @see      #removeDragSourceMotionListener
     * @see      #getDragSourceMotionListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public DragSourceListener[] getDragSourceListeners() {

    /**
     * Gets all the <code>DragSourceListener</code>s
     * registered with this <code>DragSource</code>.
     *
     * @return all of this <code>DragSource</code>'s
     *         <code>DragSourceListener</code>s or an empty array if no
     *         such listeners are currently registered
     *
     * @see      #addDragSourceListener
     * @see      #removeDragSourceListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void removeDragSourceListener(DragSourceListener dsl) {

    /**
     * Removes the specified <code>DragSourceListener</code> from this
     * <code>DragSource</code>.
     * If a <code>null</code> listener is specified, no action is taken and no
     * exception is thrown.
     * If the listener specified by the argument was not previously added to
     * this <code>DragSource</code>, no action is taken and no exception
     * is thrown.
     *
     * @param dsl the <code>DragSourceListener</code> to remove
     *
     * @see      #addDragSourceListener
     * @see      #getDragSourceListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void addDragSourceListener(DragSourceListener dsl) {

    /**
     * Adds the specified <code>DragSourceListener</code> to this
     * <code>DragSource</code> to receive drag source events during drag
     * operations intiated with this <code>DragSource</code>.
     * If a <code>null</code> listener is specified, no action is taken and no
     * exception is thrown.
     *
     * @param dsl the <code>DragSourceListener</code> to add
     *
     * @see      #removeDragSourceListener
     * @see      #getDragSourceListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public DragGestureRecognizer createDefaultDragGestureRecognizer(Component c, int actions, DragGestureListener dgl) {

    /**
     * Creates a new <code>DragGestureRecognizer</code>
     * that implements the default
     * abstract subclass of <code>DragGestureRecognizer</code>
     * for this <code>DragSource</code>,
     * and sets the specified <code>Component</code>
     * and <code>DragGestureListener</code> on the
     * newly created object.
     *
     * For this <code>DragSource</code>
     * the default is <code>MouseDragGestureRecognizer</code>.
     * <P>
     * @param c       the <code>Component</code> target for the recognizer
     * @param actions the permitted source actions
     * @param dgl     the <code>DragGestureListener</code> to notify
     * <P>
     * @return the new <code>DragGestureRecognizer</code> or <code>null</code>
     *    if the <code>Toolkit.createDragGestureRecognizer</code> method
     *    has no implementation available for
     *    the requested <code>DragGestureRecognizer</code>
     *    subclass and returns <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public <T extends DragGestureRecognizer> T

    /**
     * Creates a new <code>DragGestureRecognizer</code>
     * that implements the specified
     * abstract subclass of
     * <code>DragGestureRecognizer</code>, and
     * sets the specified <code>Component</code>
     * and <code>DragGestureListener</code> on
     * the newly created object.
     * <P>
     * @param recognizerAbstractClass the requested abstract type
     * @param actions                 the permitted source drag actions
     * @param c                       the <code>Component</code> target
     * @param dgl        the <code>DragGestureListener</code> to notify
     * <P>
     * @return the new <code>DragGestureRecognizer</code> or <code>null</code>
     *    if the <code>Toolkit.createDragGestureRecognizer</code> method
     *    has no implementation available for
     *    the requested <code>DragGestureRecognizer</code>
     *    subclass and returns <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public FlavorMap getFlavorMap() { return flavorMap; }

    /**
     * This method returns the
     * <code>FlavorMap</code> for this <code>DragSource</code>.
     * <P>
     * @return the <code>FlavorMap</code> for this <code>DragSource</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    protected DragSourceContext createDragSourceContext(DragSourceContextPeer dscp, DragGestureEvent dgl, Cursor dragCursor, Image dragImage, Point imageOffset, Transferable t, DragSourceListener dsl) {

    /**
     * Creates the {@code DragSourceContext} to handle the current drag
     * operation.
     * <p>
     * To incorporate a new <code>DragSourceContext</code>
     * subclass, subclass <code>DragSource</code> and
     * override this method.
     * <p>
     * If <code>dragImage</code> is <code>null</code>, no image is used
     * to represent the drag over feedback for this drag operation, but
     * <code>NullPointerException</code> is not thrown.
     * <p>
     * If <code>dsl</code> is <code>null</code>, no drag source listener
     * is registered with the created <code>DragSourceContext</code>,
     * but <code>NullPointerException</code> is not thrown.
     *
     * @param dscp          The <code>DragSourceContextPeer</code> for this drag
     * @param dgl           The <code>DragGestureEvent</code> that triggered the
     *                      drag
     * @param dragCursor     The initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a> class
     *                       for more details on the cursor handling mechanism during drag and drop
     * @param dragImage     The <code>Image</code> to drag or <code>null</code>
     * @param imageOffset   The offset of the <code>Image</code> origin from the
     *                      hotspot of the cursor at the instant of the trigger
     * @param t             The subject data of the drag
     * @param dsl           The <code>DragSourceListener</code>
     *
     * @return the <code>DragSourceContext</code>
     *
     * @throws NullPointerException if <code>dscp</code> is <code>null</code>
     * @throws NullPointerException if <code>dgl</code> is <code>null</code>
     * @throws NullPointerException if <code>dragImage</code> is not
     *    <code>null</code> and <code>imageOffset</code> is <code>null</code>
     * @throws NullPointerException if <code>t</code> is <code>null</code>
     * @throws IllegalArgumentException if the <code>Component</code>
     *         associated with the trigger event is <code>null</code>.
     * @throws IllegalArgumentException if the <code>DragSource</code> for the
     *         trigger event is <code>null</code>.
     * @throws IllegalArgumentException if the drag action for the
     *         trigger event is <code>DnDConstants.ACTION_NONE</code>.
     * @throws IllegalArgumentException if the source actions for the
     *         <code>DragGestureRecognizer</code> associated with the trigger
     *         event are equal to <code>DnDConstants.ACTION_NONE</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void startDrag(DragGestureEvent   trigger,
                          Cursor             dragCursor,
                          Transferable       transferable,
                          DragSourceListener dsl) throws InvalidDnDOperationException {

    /**
     * Start a drag, given the <code>DragGestureEvent</code>
     * that initiated the drag, the initial
     * <code>Cursor</code> to
     * use,
     * the <code>Transferable</code> subject data
     * of the drag, and the <code>DragSourceListener</code>.
     * <P>
     * @param trigger           the <code>DragGestureEvent</code> that initiated the drag
     * @param dragCursor     the initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a> class
     *                       for more details on the cursor handling mechanism during drag and drop
     * @param transferable      the subject data of the drag
     * @param dsl               the <code>DragSourceListener</code>
     * <P>
     * @throws java.awt.dnd.InvalidDnDOperationException
     *    if the Drag and Drop
     *    system is unable to initiate a drag operation, or if the user
     *    attempts to start a drag while an existing drag operation
     *    is still executing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void startDrag(DragGestureEvent   trigger,
                          Cursor             dragCursor,
                          Image              dragImage,
                          Point              dragOffset,
                          Transferable       transferable,
                          DragSourceListener dsl) throws InvalidDnDOperationException {

    /**
     * Start a drag, given the <code>DragGestureEvent</code>
     * that initiated the drag, the initial <code>Cursor</code>
     * to use,
     * the <code>Image</code> to drag,
     * the offset of the <code>Image</code> origin
     * from the hotspot of the <code>Cursor</code>
     * at the instant of the trigger,
     * the subject data of the drag, and
     * the <code>DragSourceListener</code>.
     * <P>
     * @param trigger           the <code>DragGestureEvent</code> that initiated the drag
     * @param dragCursor     the initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a>
     *                       for more details on the cursor handling mechanism during drag and drop
     * @param dragImage         the <code>Image</code> to drag or <code>null</code>
     * @param dragOffset        the offset of the <code>Image</code> origin from the hotspot
     *                          of the <code>Cursor</code> at the instant of the trigger
     * @param transferable      the subject data of the drag
     * @param dsl               the <code>DragSourceListener</code>
     * <P>
     * @throws java.awt.dnd.InvalidDnDOperationException
     *    if the Drag and Drop
     *    system is unable to initiate a drag operation, or if the user
     *    attempts to start a drag while an existing drag operation
     *    is still executing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void startDrag(DragGestureEvent   trigger,
                          Cursor             dragCursor,
                          Transferable       transferable,
                          DragSourceListener dsl,
                          FlavorMap          flavorMap) throws InvalidDnDOperationException {

    /**
     * Start a drag, given the <code>DragGestureEvent</code>
     * that initiated the drag, the initial
     * <code>Cursor</code> to use,
     * the <code>Transferable</code> subject data
     * of the drag, the <code>DragSourceListener</code>,
     * and the <code>FlavorMap</code>.
     * <P>
     * @param trigger        the <code>DragGestureEvent</code> that
     * initiated the drag
     * @param dragCursor     the initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a>
     *                       for more details on the cursor handling mechanism during drag and drop
     * @param transferable   the subject data of the drag
     * @param dsl            the <code>DragSourceListener</code>
     * @param flavorMap      the <code>FlavorMap</code> to use or <code>null</code>
     * <P>
     * @throws java.awt.dnd.InvalidDnDOperationException
     *    if the Drag and Drop
     *    system is unable to initiate a drag operation, or if the user
     *    attempts to start a drag while an existing drag operation
     *    is still executing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void startDrag(DragGestureEvent   trigger,
                          Cursor             dragCursor,
                          Image              dragImage,
                          Point              imageOffset,
                          Transferable       transferable,
                          DragSourceListener dsl,
                          FlavorMap          flavorMap) throws InvalidDnDOperationException {

    /**
     * Start a drag, given the <code>DragGestureEvent</code>
     * that initiated the drag, the initial
     * <code>Cursor</code> to use,
     * the <code>Image</code> to drag,
     * the offset of the <code>Image</code> origin
     * from the hotspot of the <code>Cursor</code> at
     * the instant of the trigger,
     * the <code>Transferable</code> subject data
     * of the drag, the <code>DragSourceListener</code>,
     * and the <code>FlavorMap</code>.
     * <P>
     * @param trigger        the <code>DragGestureEvent</code> that initiated the drag
     * @param dragCursor     the initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a>
     *                       for more details on the cursor handling mechanism during drag and drop
     * @param dragImage      the image to drag or {@code null}
     * @param imageOffset    the offset of the <code>Image</code> origin from the hotspot
     *                       of the <code>Cursor</code> at the instant of the trigger
     * @param transferable   the subject data of the drag
     * @param dsl            the <code>DragSourceListener</code>
     * @param flavorMap      the <code>FlavorMap</code> to use, or <code>null</code>
     * <P>
     * @throws java.awt.dnd.InvalidDnDOperationException
     *    if the Drag and Drop
     *    system is unable to initiate a drag operation, or if the user
     *    attempts to start a drag while an existing drag operation
     *    is still executing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public DragSource() throws HeadlessException {

    /**
     * Creates a new <code>DragSource</code>.
     *
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static boolean isDragImageSupported() {

    /**
     * Reports
     * whether or not drag
     * <code>Image</code> support
     * is available on the underlying platform.
     * <P>
     * @return if the Drag Image support is available on this platform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static DragSource getDefaultDragSource() {

    /**
     * Gets the <code>DragSource</code> object associated with
     * the underlying platform.
     *
     * @return the platform DragSource
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    static final String dragSourceListenerK = "dragSourceL";

    /**
     * Internal constants for serialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static final Cursor DefaultLinkNoDrop =

    /**
     * The default <code>Cursor</code> to use with a link operation indicating
     * that a drop is currently not allowed. <code>null</code> if
     * <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static final Cursor DefaultMoveNoDrop =

    /**
     * The default <code>Cursor</code> to use with a move operation indicating
     * that a drop is currently not allowed. <code>null</code> if
     * <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static final Cursor DefaultCopyNoDrop =

    /**
     * The default <code>Cursor</code> to use with a copy operation indicating
     * that a drop is currently not allowed. <code>null</code> if
     * <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static final Cursor DefaultLinkDrop =

    /**
     * The default <code>Cursor</code> to use with a link operation indicating
     * that a drop is currently allowed. <code>null</code> if
     * <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static final Cursor DefaultMoveDrop =

    /**
     * The default <code>Cursor</code> to use with a move operation indicating
     * that a drop is currently allowed. <code>null</code> if
     * <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static final Cursor DefaultCopyDrop =

    /**
     * The default <code>Cursor</code> to use with a copy operation indicating
     * that a drop is currently allowed. <code>null</code> if
     * <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
public class DragSource implements Serializable {

/**
 * The <code>DragSource</code> is the entity responsible
 * for the initiation of the Drag
 * and Drop operation, and may be used in a number of scenarios:
 * <UL>
 * <LI>1 default instance per JVM for the lifetime of that JVM.
 * <LI>1 instance per class of potential Drag Initiator object (e.g
 * TextField). [implementation dependent]
 * <LI>1 per instance of a particular
 * <code>Component</code>, or application specific
 * object associated with a <code>Component</code>
 * instance in the GUI. [implementation dependent]
 * <LI>Some other arbitrary association. [implementation dependent]
 *</UL>
 *
 * Once the <code>DragSource</code> is
 * obtained, a <code>DragGestureRecognizer</code> should
 * also be obtained to associate the <code>DragSource</code>
 * with a particular
 * <code>Component</code>.
 * <P>
 * The initial interpretation of the user's gesture,
 * and the subsequent starting of the drag operation
 * are the responsibility of the implementing
 * <code>Component</code>, which is usually
 * implemented by a <code>DragGestureRecognizer</code>.
 *<P>
 * When a drag gesture occurs, the
 * <code>DragSource</code>'s
 * startDrag() method shall be
 * invoked in order to cause processing
 * of the user's navigational
 * gestures and delivery of Drag and Drop
 * protocol notifications. A
 * <code>DragSource</code> shall only
 * permit a single Drag and Drop operation to be
 * current at any one time, and shall
 * reject any further startDrag() requests
 * by throwing an <code>IllegalDnDOperationException</code>
 * until such time as the extant operation is complete.
 * <P>
 * The startDrag() method invokes the
 * createDragSourceContext() method to
 * instantiate an appropriate
 * <code>DragSourceContext</code>
 * and associate the <code>DragSourceContextPeer</code>
 * with that.
 * <P>
 * If the Drag and Drop System is
 * unable to initiate a drag operation for
 * some reason, the startDrag() method throws
 * a <code>java.awt.dnd.InvalidDnDOperationException</code>
 * to signal such a condition. Typically this
 * exception is thrown when the underlying platform
 * system is either not in a state to
 * initiate a drag, or the parameters specified are invalid.
 * <P>
 * Note that during the drag, the
 * set of operations exposed by the source
 * at the start of the drag operation may not change
 * until the operation is complete.
 * The operation(s) are constant for the
 * duration of the operation with respect to the
 * <code>DragSource</code>.
 *
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static int getDragThreshold() {

    /**
     * Returns the drag gesture motion threshold. The drag gesture motion threshold
     * defines the recommended behavior for {@link MouseDragGestureRecognizer}s.
     * <p>
     * If the system property <code>awt.dnd.drag.threshold</code> is set to
     * a positive integer, this method returns the value of the system property;
     * otherwise if a pertinent desktop property is available and supported by
     * the implementation of the Java platform, this method returns the value of
     * that property; otherwise this method returns some default value.
     * The pertinent desktop property can be queried using
     * <code>java.awt.Toolkit.getDesktopProperty("DnD.gestureMotionThreshold")</code>.
     *
     * @return the drag gesture motion threshold
     * @see MouseDragGestureRecognizer
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    private void readObject(ObjectInputStream s)

    /**
     * Deserializes this <code>DragSource</code>. This method first performs
     * default deserialization. Next, this object's <code>FlavorMap</code> is
     * deserialized by using the next object in the stream.
     * If the resulting <code>FlavorMap</code> is <code>null</code>, this
     * object's <code>FlavorMap</code> is set to the default FlavorMap for
     * this thread's <code>ClassLoader</code>.
     * Next, this object's listeners are deserialized by reading a
     * <code>null</code>-terminated sequence of 0 or more key/value pairs
     * from the stream:
     * <ul>
     * <li>If a key object is a <code>String</code> equal to
     * <code>dragSourceListenerK</code>, a <code>DragSourceListener</code> is
     * deserialized using the corresponding value object and added to this
     * <code>DragSource</code>.
     * <li>If a key object is a <code>String</code> equal to
     * <code>dragSourceMotionListenerK</code>, a
     * <code>DragSourceMotionListener</code> is deserialized using the
     * corresponding value object and added to this <code>DragSource</code>.
     * <li>Otherwise, the key/value pair is skipped.
     * </ul>
     *
     * @see java.awt.datatransfer.SystemFlavorMap#getDefaultFlavorMap
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * Serializes this <code>DragSource</code>. This method first performs
     * default serialization. Next, it writes out this object's
     * <code>FlavorMap</code> if and only if it can be serialized. If not,
     * <code>null</code> is written instead. Next, it writes out
     * <code>Serializable</code> listeners registered with this
     * object. Listeners are written in a <code>null</code>-terminated sequence
     * of 0 or more pairs. The pair consists of a <code>String</code> and an
     * <code>Object</code>; the <code>String</code> indicates the type of the
     * <code>Object</code> and is one of the following:
     * <ul>
     * <li><code>dragSourceListenerK</code> indicating a
     *     <code>DragSourceListener</code> object;
     * <li><code>dragSourceMotionListenerK</code> indicating a
     *     <code>DragSourceMotionListener</code> object.
     * </ul>
     *
     * @serialData Either a <code>FlavorMap</code> instance, or
     *      <code>null</code>, followed by a <code>null</code>-terminated
     *      sequence of 0 or more pairs; the pair consists of a
     *      <code>String</code> and an <code>Object</code>; the
     *      <code>String</code> indicates the type of the <code>Object</code>
     *      and is one of the following:
     *      <ul>
     *      <li><code>dragSourceListenerK</code> indicating a
     *          <code>DragSourceListener</code> object;
     *      <li><code>dragSourceMotionListenerK</code> indicating a
     *          <code>DragSourceMotionListener</code> object.
     *      </ul>.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    void processDragMouseMoved(DragSourceDragEvent dsde) {

    /**
     * This method calls <code>dragMouseMoved</code> on the
     * <code>DragSourceMotionListener</code>s registered with this
     * <code>DragSource</code>, and passes them the specified
     * <code>DragSourceDragEvent</code>.
     *
     * @param dsde the <code>DragSourceEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    void processDragDropEnd(DragSourceDropEvent dsde) {

    /**
     * This method calls <code>dragDropEnd</code> on the
     * <code>DragSourceListener</code>s registered with this
     * <code>DragSource</code>, and passes them the specified
     * <code>DragSourceDropEvent</code>.
     *
     * @param dsde the <code>DragSourceEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    void processDragExit(DragSourceEvent dse) {

    /**
     * This method calls <code>dragExit</code> on the
     * <code>DragSourceListener</code>s registered with this
     * <code>DragSource</code>, and passes them the specified
     * <code>DragSourceEvent</code>.
     *
     * @param dse the <code>DragSourceEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    void processDropActionChanged(DragSourceDragEvent dsde) {

    /**
     * This method calls <code>dropActionChanged</code> on the
     * <code>DragSourceListener</code>s registered with this
     * <code>DragSource</code>, and passes them the specified
     * <code>DragSourceDragEvent</code>.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    void processDragOver(DragSourceDragEvent dsde) {

    /**
     * This method calls <code>dragOver</code> on the
     * <code>DragSourceListener</code>s registered with this
     * <code>DragSource</code>, and passes them the specified
     * <code>DragSourceDragEvent</code>.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    void processDragEnter(DragSourceDragEvent dsde) {

    /**
     * This method calls <code>dragEnter</code> on the
     * <code>DragSourceListener</code>s registered with this
     * <code>DragSource</code>, and passes them the specified
     * <code>DragSourceDragEvent</code>.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Gets all the objects currently registered as
     * <code><em>Foo</em>Listener</code>s upon this <code>DragSource</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this
     *          <code>DragSource</code>, or an empty array if no such listeners
     *          have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getDragSourceListeners
     * @see #getDragSourceMotionListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public DragSourceMotionListener[] getDragSourceMotionListeners() {

    /**
     * Gets all of the  <code>DragSourceMotionListener</code>s
     * registered with this <code>DragSource</code>.
     *
     * @return all of this <code>DragSource</code>'s
     *         <code>DragSourceMotionListener</code>s or an empty array if no
     *         such listeners are currently registered
     *
     * @see      #addDragSourceMotionListener
     * @see      #removeDragSourceMotionListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void removeDragSourceMotionListener(DragSourceMotionListener dsml) {

    /**
     * Removes the specified <code>DragSourceMotionListener</code> from this
     * <code>DragSource</code>.
     * If a <code>null</code> listener is specified, no action is taken and no
     * exception is thrown.
     * If the listener specified by the argument was not previously added to
     * this <code>DragSource</code>, no action is taken and no exception
     * is thrown.
     *
     * @param dsml the <code>DragSourceMotionListener</code> to remove
     *
     * @see      #addDragSourceMotionListener
     * @see      #getDragSourceMotionListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void addDragSourceMotionListener(DragSourceMotionListener dsml) {

    /**
     * Adds the specified <code>DragSourceMotionListener</code> to this
     * <code>DragSource</code> to receive drag motion events during drag
     * operations intiated with this <code>DragSource</code>.
     * If a <code>null</code> listener is specified, no action is taken and no
     * exception is thrown.
     *
     * @param dsml the <code>DragSourceMotionListener</code> to add
     *
     * @see      #removeDragSourceMotionListener
     * @see      #getDragSourceMotionListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public DragSourceListener[] getDragSourceListeners() {

    /**
     * Gets all the <code>DragSourceListener</code>s
     * registered with this <code>DragSource</code>.
     *
     * @return all of this <code>DragSource</code>'s
     *         <code>DragSourceListener</code>s or an empty array if no
     *         such listeners are currently registered
     *
     * @see      #addDragSourceListener
     * @see      #removeDragSourceListener
     * @since    1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void removeDragSourceListener(DragSourceListener dsl) {

    /**
     * Removes the specified <code>DragSourceListener</code> from this
     * <code>DragSource</code>.
     * If a <code>null</code> listener is specified, no action is taken and no
     * exception is thrown.
     * If the listener specified by the argument was not previously added to
     * this <code>DragSource</code>, no action is taken and no exception
     * is thrown.
     *
     * @param dsl the <code>DragSourceListener</code> to remove
     *
     * @see      #addDragSourceListener
     * @see      #getDragSourceListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void addDragSourceListener(DragSourceListener dsl) {

    /**
     * Adds the specified <code>DragSourceListener</code> to this
     * <code>DragSource</code> to receive drag source events during drag
     * operations intiated with this <code>DragSource</code>.
     * If a <code>null</code> listener is specified, no action is taken and no
     * exception is thrown.
     *
     * @param dsl the <code>DragSourceListener</code> to add
     *
     * @see      #removeDragSourceListener
     * @see      #getDragSourceListeners
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public DragGestureRecognizer createDefaultDragGestureRecognizer(Component c, int actions, DragGestureListener dgl) {

    /**
     * Creates a new <code>DragGestureRecognizer</code>
     * that implements the default
     * abstract subclass of <code>DragGestureRecognizer</code>
     * for this <code>DragSource</code>,
     * and sets the specified <code>Component</code>
     * and <code>DragGestureListener</code> on the
     * newly created object.
     *
     * For this <code>DragSource</code>
     * the default is <code>MouseDragGestureRecognizer</code>.
     * <P>
     * @param c       the <code>Component</code> target for the recognizer
     * @param actions the permitted source actions
     * @param dgl     the <code>DragGestureListener</code> to notify
     * <P>
     * @return the new <code>DragGestureRecognizer</code> or <code>null</code>
     *    if the <code>Toolkit.createDragGestureRecognizer</code> method
     *    has no implementation available for
     *    the requested <code>DragGestureRecognizer</code>
     *    subclass and returns <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public <T extends DragGestureRecognizer> T

    /**
     * Creates a new <code>DragGestureRecognizer</code>
     * that implements the specified
     * abstract subclass of
     * <code>DragGestureRecognizer</code>, and
     * sets the specified <code>Component</code>
     * and <code>DragGestureListener</code> on
     * the newly created object.
     * <P>
     * @param recognizerAbstractClass the requested abstract type
     * @param actions                 the permitted source drag actions
     * @param c                       the <code>Component</code> target
     * @param dgl        the <code>DragGestureListener</code> to notify
     * <P>
     * @return the new <code>DragGestureRecognizer</code> or <code>null</code>
     *    if the <code>Toolkit.createDragGestureRecognizer</code> method
     *    has no implementation available for
     *    the requested <code>DragGestureRecognizer</code>
     *    subclass and returns <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public FlavorMap getFlavorMap() { return flavorMap; }

    /**
     * This method returns the
     * <code>FlavorMap</code> for this <code>DragSource</code>.
     * <P>
     * @return the <code>FlavorMap</code> for this <code>DragSource</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    protected DragSourceContext createDragSourceContext(DragSourceContextPeer dscp, DragGestureEvent dgl, Cursor dragCursor, Image dragImage, Point imageOffset, Transferable t, DragSourceListener dsl) {

    /**
     * Creates the {@code DragSourceContext} to handle the current drag
     * operation.
     * <p>
     * To incorporate a new <code>DragSourceContext</code>
     * subclass, subclass <code>DragSource</code> and
     * override this method.
     * <p>
     * If <code>dragImage</code> is <code>null</code>, no image is used
     * to represent the drag over feedback for this drag operation, but
     * <code>NullPointerException</code> is not thrown.
     * <p>
     * If <code>dsl</code> is <code>null</code>, no drag source listener
     * is registered with the created <code>DragSourceContext</code>,
     * but <code>NullPointerException</code> is not thrown.
     *
     * @param dscp          The <code>DragSourceContextPeer</code> for this drag
     * @param dgl           The <code>DragGestureEvent</code> that triggered the
     *                      drag
     * @param dragCursor     The initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a> class
     *                       for more details on the cursor handling mechanism during drag and drop
     * @param dragImage     The <code>Image</code> to drag or <code>null</code>
     * @param imageOffset   The offset of the <code>Image</code> origin from the
     *                      hotspot of the cursor at the instant of the trigger
     * @param t             The subject data of the drag
     * @param dsl           The <code>DragSourceListener</code>
     *
     * @return the <code>DragSourceContext</code>
     *
     * @throws NullPointerException if <code>dscp</code> is <code>null</code>
     * @throws NullPointerException if <code>dgl</code> is <code>null</code>
     * @throws NullPointerException if <code>dragImage</code> is not
     *    <code>null</code> and <code>imageOffset</code> is <code>null</code>
     * @throws NullPointerException if <code>t</code> is <code>null</code>
     * @throws IllegalArgumentException if the <code>Component</code>
     *         associated with the trigger event is <code>null</code>.
     * @throws IllegalArgumentException if the <code>DragSource</code> for the
     *         trigger event is <code>null</code>.
     * @throws IllegalArgumentException if the drag action for the
     *         trigger event is <code>DnDConstants.ACTION_NONE</code>.
     * @throws IllegalArgumentException if the source actions for the
     *         <code>DragGestureRecognizer</code> associated with the trigger
     *         event are equal to <code>DnDConstants.ACTION_NONE</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void startDrag(DragGestureEvent   trigger,
                          Cursor             dragCursor,
                          Transferable       transferable,
                          DragSourceListener dsl) throws InvalidDnDOperationException {

    /**
     * Start a drag, given the <code>DragGestureEvent</code>
     * that initiated the drag, the initial
     * <code>Cursor</code> to
     * use,
     * the <code>Transferable</code> subject data
     * of the drag, and the <code>DragSourceListener</code>.
     * <P>
     * @param trigger           the <code>DragGestureEvent</code> that initiated the drag
     * @param dragCursor     the initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a> class
     *                       for more details on the cursor handling mechanism during drag and drop
     * @param transferable      the subject data of the drag
     * @param dsl               the <code>DragSourceListener</code>
     * <P>
     * @throws java.awt.dnd.InvalidDnDOperationException
     *    if the Drag and Drop
     *    system is unable to initiate a drag operation, or if the user
     *    attempts to start a drag while an existing drag operation
     *    is still executing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void startDrag(DragGestureEvent   trigger,
                          Cursor             dragCursor,
                          Image              dragImage,
                          Point              dragOffset,
                          Transferable       transferable,
                          DragSourceListener dsl) throws InvalidDnDOperationException {

    /**
     * Start a drag, given the <code>DragGestureEvent</code>
     * that initiated the drag, the initial <code>Cursor</code>
     * to use,
     * the <code>Image</code> to drag,
     * the offset of the <code>Image</code> origin
     * from the hotspot of the <code>Cursor</code>
     * at the instant of the trigger,
     * the subject data of the drag, and
     * the <code>DragSourceListener</code>.
     * <P>
     * @param trigger           the <code>DragGestureEvent</code> that initiated the drag
     * @param dragCursor     the initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a>
     *                       for more details on the cursor handling mechanism during drag and drop
     * @param dragImage         the <code>Image</code> to drag or <code>null</code>
     * @param dragOffset        the offset of the <code>Image</code> origin from the hotspot
     *                          of the <code>Cursor</code> at the instant of the trigger
     * @param transferable      the subject data of the drag
     * @param dsl               the <code>DragSourceListener</code>
     * <P>
     * @throws java.awt.dnd.InvalidDnDOperationException
     *    if the Drag and Drop
     *    system is unable to initiate a drag operation, or if the user
     *    attempts to start a drag while an existing drag operation
     *    is still executing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void startDrag(DragGestureEvent   trigger,
                          Cursor             dragCursor,
                          Transferable       transferable,
                          DragSourceListener dsl,
                          FlavorMap          flavorMap) throws InvalidDnDOperationException {

    /**
     * Start a drag, given the <code>DragGestureEvent</code>
     * that initiated the drag, the initial
     * <code>Cursor</code> to use,
     * the <code>Transferable</code> subject data
     * of the drag, the <code>DragSourceListener</code>,
     * and the <code>FlavorMap</code>.
     * <P>
     * @param trigger        the <code>DragGestureEvent</code> that
     * initiated the drag
     * @param dragCursor     the initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a>
     *                       for more details on the cursor handling mechanism during drag and drop
     * @param transferable   the subject data of the drag
     * @param dsl            the <code>DragSourceListener</code>
     * @param flavorMap      the <code>FlavorMap</code> to use or <code>null</code>
     * <P>
     * @throws java.awt.dnd.InvalidDnDOperationException
     *    if the Drag and Drop
     *    system is unable to initiate a drag operation, or if the user
     *    attempts to start a drag while an existing drag operation
     *    is still executing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public void startDrag(DragGestureEvent   trigger,
                          Cursor             dragCursor,
                          Image              dragImage,
                          Point              imageOffset,
                          Transferable       transferable,
                          DragSourceListener dsl,
                          FlavorMap          flavorMap) throws InvalidDnDOperationException {

    /**
     * Start a drag, given the <code>DragGestureEvent</code>
     * that initiated the drag, the initial
     * <code>Cursor</code> to use,
     * the <code>Image</code> to drag,
     * the offset of the <code>Image</code> origin
     * from the hotspot of the <code>Cursor</code> at
     * the instant of the trigger,
     * the <code>Transferable</code> subject data
     * of the drag, the <code>DragSourceListener</code>,
     * and the <code>FlavorMap</code>.
     * <P>
     * @param trigger        the <code>DragGestureEvent</code> that initiated the drag
     * @param dragCursor     the initial {@code Cursor} for this drag operation
     *                       or {@code null} for the default cursor handling;
     *                       see <a href="DragSourceContext.html#defaultCursor">DragSourceContext</a>
     *                       for more details on the cursor handling mechanism during drag and drop
     * @param dragImage      the image to drag or {@code null}
     * @param imageOffset    the offset of the <code>Image</code> origin from the hotspot
     *                       of the <code>Cursor</code> at the instant of the trigger
     * @param transferable   the subject data of the drag
     * @param dsl            the <code>DragSourceListener</code>
     * @param flavorMap      the <code>FlavorMap</code> to use, or <code>null</code>
     * <P>
     * @throws java.awt.dnd.InvalidDnDOperationException
     *    if the Drag and Drop
     *    system is unable to initiate a drag operation, or if the user
     *    attempts to start a drag while an existing drag operation
     *    is still executing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public DragSource() throws HeadlessException {

    /**
     * Creates a new <code>DragSource</code>.
     *
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static boolean isDragImageSupported() {

    /**
     * Reports
     * whether or not drag
     * <code>Image</code> support
     * is available on the underlying platform.
     * <P>
     * @return if the Drag Image support is available on this platform
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static DragSource getDefaultDragSource() {

    /**
     * Gets the <code>DragSource</code> object associated with
     * the underlying platform.
     *
     * @return the platform DragSource
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     *            returns true
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    static final String dragSourceListenerK = "dragSourceL";

    /**
     * Internal constants for serialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static final Cursor DefaultLinkNoDrop =

    /**
     * The default <code>Cursor</code> to use with a link operation indicating
     * that a drop is currently not allowed. <code>null</code> if
     * <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static final Cursor DefaultMoveNoDrop =

    /**
     * The default <code>Cursor</code> to use with a move operation indicating
     * that a drop is currently not allowed. <code>null</code> if
     * <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static final Cursor DefaultCopyNoDrop =

    /**
     * The default <code>Cursor</code> to use with a copy operation indicating
     * that a drop is currently not allowed. <code>null</code> if
     * <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static final Cursor DefaultLinkDrop =

    /**
     * The default <code>Cursor</code> to use with a link operation indicating
     * that a drop is currently allowed. <code>null</code> if
     * <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static final Cursor DefaultMoveDrop =

    /**
     * The default <code>Cursor</code> to use with a move operation indicating
     * that a drop is currently allowed. <code>null</code> if
     * <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
    public static final Cursor DefaultCopyDrop =

    /**
     * The default <code>Cursor</code> to use with a copy operation indicating
     * that a drop is currently allowed. <code>null</code> if
     * <code>GraphicsEnvironment.isHeadless()</code> returns <code>true</code>.
     *
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DragSource.java
public class DragSource implements Serializable {

/**
 * The <code>DragSource</code> is the entity responsible
 * for the initiation of the Drag
 * and Drop operation, and may be used in a number of scenarios:
 * <UL>
 * <LI>1 default instance per JVM for the lifetime of that JVM.
 * <LI>1 instance per class of potential Drag Initiator object (e.g
 * TextField). [implementation dependent]
 * <LI>1 per instance of a particular
 * <code>Component</code>, or application specific
 * object associated with a <code>Component</code>
 * instance in the GUI. [implementation dependent]
 * <LI>Some other arbitrary association. [implementation dependent]
 *</UL>
 *
 * Once the <code>DragSource</code> is
 * obtained, a <code>DragGestureRecognizer</code> should
 * also be obtained to associate the <code>DragSource</code>
 * with a particular
 * <code>Component</code>.
 * <P>
 * The initial interpretation of the user's gesture,
 * and the subsequent starting of the drag operation
 * are the responsibility of the implementing
 * <code>Component</code>, which is usually
 * implemented by a <code>DragGestureRecognizer</code>.
 *<P>
 * When a drag gesture occurs, the
 * <code>DragSource</code>'s
 * startDrag() method shall be
 * invoked in order to cause processing
 * of the user's navigational
 * gestures and delivery of Drag and Drop
 * protocol notifications. A
 * <code>DragSource</code> shall only
 * permit a single Drag and Drop operation to be
 * current at any one time, and shall
 * reject any further startDrag() requests
 * by throwing an <code>IllegalDnDOperationException</code>
 * until such time as the extant operation is complete.
 * <P>
 * The startDrag() method invokes the
 * createDragSourceContext() method to
 * instantiate an appropriate
 * <code>DragSourceContext</code>
 * and associate the <code>DragSourceContextPeer</code>
 * with that.
 * <P>
 * If the Drag and Drop System is
 * unable to initiate a drag operation for
 * some reason, the startDrag() method throws
 * a <code>java.awt.dnd.InvalidDnDOperationException</code>
 * to signal such a condition. Typically this
 * exception is thrown when the underlying platform
 * system is either not in a state to
 * initiate a drag, or the parameters specified are invalid.
 * <P>
 * Note that during the drag, the
 * set of operations exposed by the source
 * at the start of the drag operation may not change
 * until the operation is complete.
 * The operation(s) are constant for the
 * duration of the operation with respect to the
 * <code>DragSource</code>.
 *
 * @since 1.2
 */
