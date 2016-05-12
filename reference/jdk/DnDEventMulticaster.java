_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    protected static EventListener removeInternal(EventListener l, EventListener oldl) {

    /**
     * Returns the resulting multicast listener after removing the
     * old listener from listener-l.
     * If listener-l equals the old listener OR listener-l is null,
     * returns null.
     * Else if listener-l is an instance of AWTEventMulticaster,
     * then it removes the old listener from it.
     * Else, returns listener l.
     * @param l the listener being removed from
     * @param oldl the listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    protected EventListener remove(EventListener oldl) {

    /**
     * Removes a listener from this multicaster and returns the
     * resulting multicast listener.
     * @param oldl the listener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    protected static EventListener addInternal(EventListener a, EventListener b) {

    /**
     * Returns the resulting multicast listener from adding listener-a
     * and listener-b together.
     * If listener-a is null, it returns listener-b;
     * If listener-b is null, it returns listener-a
     * If neither are null, then it creates and returns
     * a new AWTEventMulticaster instance which chains a with b.
     * @param a event listener-a
     * @param b event listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public static DragSourceMotionListener remove(DragSourceMotionListener l,
                                                  DragSourceMotionListener ol) {

    /**
     * Removes the old drag-source-motion-listener from
     * drag-source-motion-listener-l and returns the resulting multicast
     * listener.
     *
     * @param l drag-source-motion-listener-l
     * @param ol the drag-source-motion-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public static DragSourceListener remove(DragSourceListener l,
                                            DragSourceListener oldl) {

    /**
     * Removes the old drag-source-listener from drag-source-listener-l
     * and returns the resulting multicast listener.
     *
     * @param l drag-source-listener-l
     * @param oldl the drag-source-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public static DragSourceMotionListener add(DragSourceMotionListener a,
                                               DragSourceMotionListener b) {

    /**
     * Adds drag-source-motion-listener-a with drag-source-motion-listener-b and
     * returns the resulting multicast listener.
     *
     * @param a drag-source-motion-listener-a
     * @param b drag-source-motion-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public static DragSourceListener add(DragSourceListener a,
                                         DragSourceListener b) {

    /**
     * Adds drag-source-listener-a with drag-source-listener-b and
     * returns the resulting multicast listener.
     *
     * @param a drag-source-listener-a
     * @param b drag-source-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public void dragMouseMoved(DragSourceDragEvent dsde) {

    /**
     * Handles the <code>DragSourceDragEvent</code> by invoking
     * <code>dragMouseMoved</code> on listener-a and listener-b.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public void dragDropEnd(DragSourceDropEvent dsde) {

    /**
     * Handles the <code>DragSourceDropEvent</code> by invoking
     * <code>dragDropEnd</code> on listener-a and listener-b.
     *
     * @param dsde the <code>DragSourceDropEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public void dragExit(DragSourceEvent dse) {

    /**
     * Handles the <code>DragSourceEvent</code> by invoking
     * <code>dragExit</code> on listener-a and listener-b.
     *
     * @param dse the <code>DragSourceEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public void dropActionChanged(DragSourceDragEvent dsde) {

    /**
     * Handles the <code>DragSourceDragEvent</code> by invoking
     * <code>dropActionChanged</code> on listener-a and listener-b.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public void dragOver(DragSourceDragEvent dsde) {

    /**
     * Handles the <code>DragSourceDragEvent</code> by invoking
     * <code>dragOver</code> on listener-a and listener-b.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public void dragEnter(DragSourceDragEvent dsde) {

    /**
     * Handles the <code>DragSourceDragEvent</code> by invoking
     * <code>dragEnter</code> on listener-a and listener-b.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    protected DnDEventMulticaster(EventListener a, EventListener b) {

    /**
     * Creates an event multicaster instance which chains listener-a
     * with listener-b. Input parameters <code>a</code> and <code>b</code>
     * should not be <code>null</code>, though implementations may vary in
     * choosing whether or not to throw <code>NullPointerException</code>
     * in that case.
     *
     * @param a listener-a
     * @param b listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
class DnDEventMulticaster extends AWTEventMulticaster

/**
 * A class extends <code>AWTEventMulticaster</code> to implement efficient and
 * thread-safe multi-cast event dispatching for the drag-and-drop events defined
 * in the java.awt.dnd package.
 *
 * @since       1.4
 * @see AWTEventMulticaster
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    protected static EventListener removeInternal(EventListener l, EventListener oldl) {

    /**
     * Returns the resulting multicast listener after removing the
     * old listener from listener-l.
     * If listener-l equals the old listener OR listener-l is null,
     * returns null.
     * Else if listener-l is an instance of AWTEventMulticaster,
     * then it removes the old listener from it.
     * Else, returns listener l.
     * @param l the listener being removed from
     * @param oldl the listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    protected EventListener remove(EventListener oldl) {

    /**
     * Removes a listener from this multicaster and returns the
     * resulting multicast listener.
     * @param oldl the listener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    protected static EventListener addInternal(EventListener a, EventListener b) {

    /**
     * Returns the resulting multicast listener from adding listener-a
     * and listener-b together.
     * If listener-a is null, it returns listener-b;
     * If listener-b is null, it returns listener-a
     * If neither are null, then it creates and returns
     * a new AWTEventMulticaster instance which chains a with b.
     * @param a event listener-a
     * @param b event listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public static DragSourceMotionListener remove(DragSourceMotionListener l,
                                                  DragSourceMotionListener ol) {

    /**
     * Removes the old drag-source-motion-listener from
     * drag-source-motion-listener-l and returns the resulting multicast
     * listener.
     *
     * @param l drag-source-motion-listener-l
     * @param ol the drag-source-motion-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public static DragSourceListener remove(DragSourceListener l,
                                            DragSourceListener oldl) {

    /**
     * Removes the old drag-source-listener from drag-source-listener-l
     * and returns the resulting multicast listener.
     *
     * @param l drag-source-listener-l
     * @param oldl the drag-source-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public static DragSourceMotionListener add(DragSourceMotionListener a,
                                               DragSourceMotionListener b) {

    /**
     * Adds drag-source-motion-listener-a with drag-source-motion-listener-b and
     * returns the resulting multicast listener.
     *
     * @param a drag-source-motion-listener-a
     * @param b drag-source-motion-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public static DragSourceListener add(DragSourceListener a,
                                         DragSourceListener b) {

    /**
     * Adds drag-source-listener-a with drag-source-listener-b and
     * returns the resulting multicast listener.
     *
     * @param a drag-source-listener-a
     * @param b drag-source-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public void dragMouseMoved(DragSourceDragEvent dsde) {

    /**
     * Handles the <code>DragSourceDragEvent</code> by invoking
     * <code>dragMouseMoved</code> on listener-a and listener-b.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public void dragDropEnd(DragSourceDropEvent dsde) {

    /**
     * Handles the <code>DragSourceDropEvent</code> by invoking
     * <code>dragDropEnd</code> on listener-a and listener-b.
     *
     * @param dsde the <code>DragSourceDropEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public void dragExit(DragSourceEvent dse) {

    /**
     * Handles the <code>DragSourceEvent</code> by invoking
     * <code>dragExit</code> on listener-a and listener-b.
     *
     * @param dse the <code>DragSourceEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public void dropActionChanged(DragSourceDragEvent dsde) {

    /**
     * Handles the <code>DragSourceDragEvent</code> by invoking
     * <code>dropActionChanged</code> on listener-a and listener-b.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public void dragOver(DragSourceDragEvent dsde) {

    /**
     * Handles the <code>DragSourceDragEvent</code> by invoking
     * <code>dragOver</code> on listener-a and listener-b.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    public void dragEnter(DragSourceDragEvent dsde) {

    /**
     * Handles the <code>DragSourceDragEvent</code> by invoking
     * <code>dragEnter</code> on listener-a and listener-b.
     *
     * @param dsde the <code>DragSourceDragEvent</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
    protected DnDEventMulticaster(EventListener a, EventListener b) {

    /**
     * Creates an event multicaster instance which chains listener-a
     * with listener-b. Input parameters <code>a</code> and <code>b</code>
     * should not be <code>null</code>, though implementations may vary in
     * choosing whether or not to throw <code>NullPointerException</code>
     * in that case.
     *
     * @param a listener-a
     * @param b listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DnDEventMulticaster.java
class DnDEventMulticaster extends AWTEventMulticaster

/**
 * A class extends <code>AWTEventMulticaster</code> to implement efficient and
 * thread-safe multi-cast event dispatching for the drag-and-drop events defined
 * in the java.awt.dnd package.
 *
 * @since       1.4
 * @see AWTEventMulticaster
 */
