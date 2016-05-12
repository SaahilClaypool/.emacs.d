_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    private int                 dropAction;

    /**
     * The user drop action.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    private int                 actions;

    /**
     * The source drop actions.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    private Point               location;

    /**
     * The location of the drag cursor's hotspot in Component coordinates.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public void rejectDrag() {

    /**
     * Rejects the drag as a result of examining either the
     * <code>dropAction</code> or the available <code>DataFlavor</code>
     * types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public void acceptDrag(int dragOperation) {

    /**
     * Accepts the drag.
     *
     * This method should be called from a
     * <code>DropTargetListeners</code> <code>dragEnter</code>,
     * <code>dragOver</code>, and <code>dropActionChanged</code>
     * methods if the implementation wishes to accept an operation
     * from the srcActions other than the one selected by
     * the user as represented by the <code>dropAction</code>.
     *
     * @param dragOperation the operation accepted by the target
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public Transferable getTransferable() {

    /**
     * This method returns the Transferable object that represents
     * the data associated with the current drag operation.
     *
     * @return the Transferable associated with the drag operation
     * @throws InvalidDnDOperationException if the data associated with the drag
     *         operation is not available
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public int getDropAction() { return dropAction; }

    /**
     * This method returns the user drop action.
     *
     * @return the user drop action
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public int getSourceActions() { return actions; }

    /**
     * This method returns the source drop actions.
     *
     * @return the source drop actions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public boolean isDataFlavorSupported(DataFlavor df) {

    /**
     * This method returns a <code>boolean</code> indicating
     * if the specified <code>DataFlavor</code> is supported.
     * <P>
     * @param df the <code>DataFlavor</code> to test
     * <P>
     * @return if a particular DataFlavor is supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public List<DataFlavor> getCurrentDataFlavorsAsList() {

    /**
     * This method returns the current <code>DataFlavor</code>s
     * as a <code>java.util.List</code>
     * <P>
     * @return a <code>java.util.List</code> of the Current <code>DataFlavor</code>s
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public DataFlavor[] getCurrentDataFlavors() {

    /**
     * This method returns the current <code>DataFlavor</code>s from the
     * <code>DropTargetContext</code>.
     * <P>
     * @return current DataFlavors from the DropTargetContext
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public Point getLocation() {

    /**
     * This method returns a <code>Point</code>
     * indicating the <code>Cursor</code>'s current
     * location within the <code>Component'</code>s
     * coordinates.
     * <P>
     * @return the current cursor location in
     * <code>Component</code>'s coords.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public DropTargetDragEvent(DropTargetContext dtc, Point cursorLocn, int dropAction, int srcActions)  {

    /**
     * Construct a <code>DropTargetDragEvent</code> given the
     * <code>DropTargetContext</code> for this operation,
     * the location of the "Drag" <code>Cursor</code>'s hotspot
     * in the <code>Component</code>'s coordinates, the
     * user drop action, and the source drop actions.
     * <P>
     * @param dtc        The DropTargetContext for this operation
     * @param cursorLocn The location of the "Drag" Cursor's
     * hotspot in Component coordinates
     * @param dropAction The user drop action
     * @param srcActions The source drop actions
     *
     * @throws NullPointerException if cursorLocn is null
     * @throws IllegalArgumentException if dropAction is not one of
     *         <code>DnDConstants</code>.
     * @throws IllegalArgumentException if srcActions is not
     *         a bitwise mask of <code>DnDConstants</code>.
     * @throws IllegalArgumentException if dtc is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
public class DropTargetDragEvent extends DropTargetEvent {

/**
 * The <code>DropTargetDragEvent</code> is delivered to a
 * <code>DropTargetListener</code> via its
 * dragEnter() and dragOver() methods.
 * <p>
 * The <code>DropTargetDragEvent</code> reports the <i>source drop actions</i>
 * and the <i>user drop action</i> that reflect the current state of
 * the drag operation.
 * <p>
 * <i>Source drop actions</i> is a bitwise mask of <code>DnDConstants</code>
 * that represents the set of drop actions supported by the drag source for
 * this drag operation.
 * <p>
 * <i>User drop action</i> depends on the drop actions supported by the drag
 * source and the drop action selected by the user. The user can select a drop
 * action by pressing modifier keys during the drag operation:
 * <pre>
 *   Ctrl + Shift -&gt; ACTION_LINK
 *   Ctrl         -&gt; ACTION_COPY
 *   Shift        -&gt; ACTION_MOVE
 * </pre>
 * If the user selects a drop action, the <i>user drop action</i> is one of
 * <code>DnDConstants</code> that represents the selected drop action if this
 * drop action is supported by the drag source or
 * <code>DnDConstants.ACTION_NONE</code> if this drop action is not supported
 * by the drag source.
 * <p>
 * If the user doesn't select a drop action, the set of
 * <code>DnDConstants</code> that represents the set of drop actions supported
 * by the drag source is searched for <code>DnDConstants.ACTION_MOVE</code>,
 * then for <code>DnDConstants.ACTION_COPY</code>, then for
 * <code>DnDConstants.ACTION_LINK</code> and the <i>user drop action</i> is the
 * first constant found. If no constant is found the <i>user drop action</i>
 * is <code>DnDConstants.ACTION_NONE</code>.
 *
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    private int                 dropAction;

    /**
     * The user drop action.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    private int                 actions;

    /**
     * The source drop actions.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    private Point               location;

    /**
     * The location of the drag cursor's hotspot in Component coordinates.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public void rejectDrag() {

    /**
     * Rejects the drag as a result of examining either the
     * <code>dropAction</code> or the available <code>DataFlavor</code>
     * types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public void acceptDrag(int dragOperation) {

    /**
     * Accepts the drag.
     *
     * This method should be called from a
     * <code>DropTargetListeners</code> <code>dragEnter</code>,
     * <code>dragOver</code>, and <code>dropActionChanged</code>
     * methods if the implementation wishes to accept an operation
     * from the srcActions other than the one selected by
     * the user as represented by the <code>dropAction</code>.
     *
     * @param dragOperation the operation accepted by the target
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public Transferable getTransferable() {

    /**
     * This method returns the Transferable object that represents
     * the data associated with the current drag operation.
     *
     * @return the Transferable associated with the drag operation
     * @throws InvalidDnDOperationException if the data associated with the drag
     *         operation is not available
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public int getDropAction() { return dropAction; }

    /**
     * This method returns the user drop action.
     *
     * @return the user drop action
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public int getSourceActions() { return actions; }

    /**
     * This method returns the source drop actions.
     *
     * @return the source drop actions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public boolean isDataFlavorSupported(DataFlavor df) {

    /**
     * This method returns a <code>boolean</code> indicating
     * if the specified <code>DataFlavor</code> is supported.
     * <P>
     * @param df the <code>DataFlavor</code> to test
     * <P>
     * @return if a particular DataFlavor is supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public List<DataFlavor> getCurrentDataFlavorsAsList() {

    /**
     * This method returns the current <code>DataFlavor</code>s
     * as a <code>java.util.List</code>
     * <P>
     * @return a <code>java.util.List</code> of the Current <code>DataFlavor</code>s
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public DataFlavor[] getCurrentDataFlavors() {

    /**
     * This method returns the current <code>DataFlavor</code>s from the
     * <code>DropTargetContext</code>.
     * <P>
     * @return current DataFlavors from the DropTargetContext
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public Point getLocation() {

    /**
     * This method returns a <code>Point</code>
     * indicating the <code>Cursor</code>'s current
     * location within the <code>Component'</code>s
     * coordinates.
     * <P>
     * @return the current cursor location in
     * <code>Component</code>'s coords.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
    public DropTargetDragEvent(DropTargetContext dtc, Point cursorLocn, int dropAction, int srcActions)  {

    /**
     * Construct a <code>DropTargetDragEvent</code> given the
     * <code>DropTargetContext</code> for this operation,
     * the location of the "Drag" <code>Cursor</code>'s hotspot
     * in the <code>Component</code>'s coordinates, the
     * user drop action, and the source drop actions.
     * <P>
     * @param dtc        The DropTargetContext for this operation
     * @param cursorLocn The location of the "Drag" Cursor's
     * hotspot in Component coordinates
     * @param dropAction The user drop action
     * @param srcActions The source drop actions
     *
     * @throws NullPointerException if cursorLocn is null
     * @throws IllegalArgumentException if dropAction is not one of
     *         <code>DnDConstants</code>.
     * @throws IllegalArgumentException if srcActions is not
     *         a bitwise mask of <code>DnDConstants</code>.
     * @throws IllegalArgumentException if dtc is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetDragEvent.java
public class DropTargetDragEvent extends DropTargetEvent {

/**
 * The <code>DropTargetDragEvent</code> is delivered to a
 * <code>DropTargetListener</code> via its
 * dragEnter() and dragOver() methods.
 * <p>
 * The <code>DropTargetDragEvent</code> reports the <i>source drop actions</i>
 * and the <i>user drop action</i> that reflect the current state of
 * the drag operation.
 * <p>
 * <i>Source drop actions</i> is a bitwise mask of <code>DnDConstants</code>
 * that represents the set of drop actions supported by the drag source for
 * this drag operation.
 * <p>
 * <i>User drop action</i> depends on the drop actions supported by the drag
 * source and the drop action selected by the user. The user can select a drop
 * action by pressing modifier keys during the drag operation:
 * <pre>
 *   Ctrl + Shift -&gt; ACTION_LINK
 *   Ctrl         -&gt; ACTION_COPY
 *   Shift        -&gt; ACTION_MOVE
 * </pre>
 * If the user selects a drop action, the <i>user drop action</i> is one of
 * <code>DnDConstants</code> that represents the selected drop action if this
 * drop action is supported by the drag source or
 * <code>DnDConstants.ACTION_NONE</code> if this drop action is not supported
 * by the drag source.
 * <p>
 * If the user doesn't select a drop action, the set of
 * <code>DnDConstants</code> that represents the set of drop actions supported
 * by the drag source is searched for <code>DnDConstants.ACTION_MOVE</code>,
 * then for <code>DnDConstants.ACTION_COPY</code>, then for
 * <code>DnDConstants.ACTION_LINK</code> and the <i>user drop action</i> is the
 * first constant found. If no constant is found the <i>user drop action</i>
 * is <code>DnDConstants.ACTION_NONE</code>.
 *
 * @since 1.2
 */
