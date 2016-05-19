_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        private static Object SandboxClipboardKey = new Object();

        /**
         * Key used in app context to lookup Clipboard to use if access to
         * System clipboard is denied.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        private Clipboard getClipboard(JComponent c) {

        /**
         * Returns the clipboard to use for cut/copy/paste.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        protected void unregisterListeners() {

        /**
         * unregister this DragGestureRecognizer's Listeners with the Component
         *
         * subclasses must override this method
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        protected void registerListeners() {

        /**
         * register this DragGestureRecognizer's Listeners with the Component
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public void dragDropEnd(DragSourceDropEvent dsde) {

        /**
         * as the operation completes
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public void dragExit(DragSourceEvent dsde) {

        /**
         * as the hotspot exits a platform dependent drop site
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public void dragOver(DragSourceDragEvent dsde) {

        /**
         * as the hotspot moves over a platform dependent drop site
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public void dragEnter(DragSourceDragEvent dsde) {

        /**
         * as the hotspot enters a platform dependent drop site
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public void dragGestureRecognized(DragGestureEvent dge) {

        /**
         * a Drag gesture has been recognized
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    private static class DragHandler implements DragGestureListener, DragSourceListener {

    /**
     * This is the default drag handler for drag and drop operations that
     * use the <code>TransferHandler</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public void actionPerformed(ActionEvent e) {

        /**
         * The timer fired, perform autoscroll if the pointer is within the
         * autoscroll region.
         * <P>
         * @param e the <code>ActionEvent</code>
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        private void initPropertiesIfNecessary() {

        /**
         * Initializes the internal properties if they haven't been already
         * inited. This is done lazily to avoid loading of desktop properties.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        private void autoscroll(JComponent c, Point pos) {

        /**
         * Perform an autoscroll operation.  This is implemented to scroll by the
         * unit increment of the Scrollable using scrollRectToVisible.  If the
         * cursor is in a corner of the autoscroll region, more than one axis will
         * scroll.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        private void updateAutoscrollRegion(JComponent c) {

        /**
         * Update the geometry of the autoscroll region.  The geometry is
         * maintained as a pair of rectangles.  The region can cause
         * a scroll if the pointer sits inside it for the duration of the
         * timer.  The region that causes the timer countdown is the area
         * between the two rectangles.
         * <p>
         * This is implemented to use the visible area of the component
         * as the outer rectangle, and the insets are fixed at 10. Should
         * the component be smaller than a total of 20 in any direction,
         * autoscroll will not occur in that direction.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    static class SwingDropTarget extends DropTarget implements UIResource {

    /**
     * This is the default drop target for drag and drop operations if
     * one isn't provided by the developer.  <code>DropTarget</code>
     * only supports one <code>DropTargetListener</code> and doesn't
     * function properly if it isn't set.
     * This class sets the one listener as the linkage of drop handling
     * to the <code>TransferHandler</code>, and adds support for
     * additional listeners which some of the <code>ComponentUI</code>
     * implementations install to manipulate a drop insertion location.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {

        /**
         * Returns an object which represents the data to be transferred.  The class
         * of the object returned is defined by the representation class of the flavor.
         *
         * @param flavor the requested flavor for the data
         * @see DataFlavor#getRepresentationClass
         * @exception IOException                if the data is no longer available
         *              in the requested flavor.
         * @exception UnsupportedFlavorException if the requested data flavor is
         *              not supported.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public boolean isDataFlavorSupported(DataFlavor flavor) {

        /**
         * Returns whether the specified data flavor is supported for
         * this object.
         * @param flavor the requested flavor for the data
         * @return true if this <code>DataFlavor</code> is supported,
         *   otherwise false
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public DataFlavor[] getTransferDataFlavors() {

        /**
         * Returns an array of <code>DataFlavor</code> objects indicating the flavors the data
         * can be provided in.  The array should be ordered according to preference
         * for providing the data (from most richly descriptive to least descriptive).
         * @return an array of data flavors in which this data can be transferred
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    private DataFlavor getPropertyDataFlavor(Class<?> k, DataFlavor[] flavors) {

    /**
     * Fetches the data flavor from the array of possible flavors that
     * has data of the type represented by property type.  Null is
     * returned if there is no match.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    private PropertyDescriptor getPropertyDescriptor(JComponent comp) {

    /**
     * Fetches the property descriptor for the property assigned to this transfer
     * handler on the given component (transfer handler may be shared).  This
     * returns <code>null</code> if the property descriptor can't be found
     * or there is an error attempting to fetch the property descriptor.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    protected void exportDone(JComponent source, Transferable data, int action) {

    /**
     * Invoked after data has been exported.  This method should remove
     * the data that was transferred if the action was <code>MOVE</code>.
     * <p>
     * This method is implemented to do nothing since <code>MOVE</code>
     * is not a supported action of this implementation
     * (<code>getSourceActions</code> does not include <code>MOVE</code>).
     *
     * @param source the component that was the source of the data
     * @param data   The data that was transferred or possibly null
     *               if the action is <code>NONE</code>.
     * @param action the actual action that was performed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    protected Transferable createTransferable(JComponent c) {

    /**
     * Creates a <code>Transferable</code> to use as the source for
     * a data transfer. Returns the representation of the data to
     * be transferred, or <code>null</code> if the component's
     * property is <code>null</code>
     *
     * @param c  the component holding the data to be transferred;
     *              provided to enable sharing of <code>TransferHandler</code>s
     * @return  the representation of the data to be transferred, or
     *  <code>null</code> if the property associated with <code>c</code>
     *  is <code>null</code>
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public Icon getVisualRepresentation(Transferable t) {

    /**
     * Returns an object that establishes the look of a transfer.  This is
     * useful for both providing feedback while performing a drag operation and for
     * representing the transfer in a clipboard implementation that has a visual
     * appearance.  The implementation of the <code>Icon</code> interface should
     * not alter the graphics clip or alpha level.
     * The icon implementation need not be rectangular or paint all of the
     * bounding rectangle and logic that calls the icons paint method should
     * not assume the all bits are painted. <code>null</code> is a valid return value
     * for this method and indicates there is no visual representation provided.
     * In that case, the calling logic is free to represent the
     * transferable however it wants.
     * <p>
     * The default Swing logic will not do an alpha blended drag animation if
     * the return is <code>null</code>.
     *
     * @param t  the data to be transferred; this value is expected to have been
     *  created by the <code>createTransferable</code> method
     * @return  <code>null</code>, indicating
     *    there is no default visual representation
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public int getSourceActions(JComponent c) {

    /**
     * Returns the type of transfer actions supported by the source;
     * any bitwise-OR combination of {@code COPY}, {@code MOVE}
     * and {@code LINK}.
     * <p>
     * Some models are not mutable, so a transfer operation of {@code MOVE}
     * should not be advertised in that case. Returning {@code NONE}
     * disables transfers from the component.
     *
     * @param c  the component holding the data to be transferred;
     *           provided to enable sharing of <code>TransferHandler</code>s
     * @return {@code COPY} if the transfer property can be found,
     *          otherwise returns <code>NONE</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public boolean canImport(JComponent comp, DataFlavor[] transferFlavors) {

    /**
     * Indicates whether a component will accept an import of the given
     * set of data flavors prior to actually attempting to import it.
     * <p>
     * Note: Swing now calls the newer version of <code>canImport</code>
     * that takes a <code>TransferSupport</code>, which in turn calls this
     * method (only if the component in the {@code TransferSupport} is a
     * {@code JComponent}). Developers are encouraged to call and override the
     * newer version as it provides more information (and is the only
     * version that supports use with a {@code TransferHandler} set directly
     * on a {@code JFrame} or other non-{@code JComponent}).
     *
     * @param comp  the component to receive the transfer;
     *              provided to enable sharing of <code>TransferHandler</code>s
     * @param transferFlavors  the data formats available
     * @return  true if the data can be inserted into the component, false otherwise
     * @see #canImport(TransferHandler.TransferSupport)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public boolean canImport(TransferSupport support) {

    /**
     * This method is called repeatedly during a drag and drop operation
     * to allow the developer to configure properties of, and to return
     * the acceptability of transfers; with a return value of {@code true}
     * indicating that the transfer represented by the given
     * {@code TransferSupport} (which contains all of the details of the
     * transfer) is acceptable at the current time, and a value of {@code false}
     * rejecting the transfer.
     * <p>
     * For those components that automatically display a drop location during
     * drag and drop, accepting the transfer, by default, tells them to show
     * the drop location. This can be changed by calling
     * {@code setShowDropLocation} on the {@code TransferSupport}.
     * <p>
     * By default, when the transfer is accepted, the chosen drop action is that
     * picked by the user via their drag gesture. The developer can override
     * this and choose a different action, from the supported source
     * actions, by calling {@code setDropAction} on the {@code TransferSupport}.
     * <p>
     * On every call to {@code canImport}, the {@code TransferSupport} contains
     * fresh state. As such, any properties set on it must be set on every
     * call. Upon a drop, {@code canImport} is called one final time before
     * calling into {@code importData}. Any state set on the
     * {@code TransferSupport} during that last call will be available in
     * {@code importData}.
     * <p>
     * This method is not called internally in response to paste operations.
     * As such, it is recommended that implementations of {@code importData}
     * explicitly call this method for such cases and that this method
     * be prepared to return the suitability of paste operations as well.
     * <p>
     * Note: The <code>TransferSupport</code> object passed to this method
     * is only valid for the duration of the method call. It is undefined
     * what values it may contain after this method returns.
     *
     * @param support the object containing the details of
     *        the transfer, not <code>null</code>.
     * @return <code>true</code> if the import can happen,
     *         <code>false</code> otherwise
     * @throws NullPointerException if <code>support</code> is {@code null}
     * @see #importData(TransferHandler.TransferSupport)
     * @see javax.swing.TransferHandler.TransferSupport#setShowDropLocation
     * @see javax.swing.TransferHandler.TransferSupport#setDropAction
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public boolean importData(JComponent comp, Transferable t) {

    /**
     * Causes a transfer to a component from a clipboard or a
     * DND drop operation.  The <code>Transferable</code> represents
     * the data to be imported into the component.
     * <p>
     * Note: Swing now calls the newer version of <code>importData</code>
     * that takes a <code>TransferSupport</code>, which in turn calls this
     * method (if the component in the {@code TransferSupport} is a
     * {@code JComponent}). Developers are encouraged to call and override the
     * newer version as it provides more information (and is the only
     * version that supports use with a {@code TransferHandler} set directly
     * on a {@code JFrame} or other non-{@code JComponent}).
     *
     * @param comp  the component to receive the transfer;
     *              provided to enable sharing of <code>TransferHandler</code>s
     * @param t     the data to import
     * @return  true if the data was inserted into the component, false otherwise
     * @see #importData(TransferHandler.TransferSupport)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public boolean importData(TransferSupport support) {

    /**
     * Causes a transfer to occur from a clipboard or a drag and
     * drop operation. The <code>Transferable</code> to be
     * imported and the component to transfer to are contained
     * within the <code>TransferSupport</code>.
     * <p>
     * While the drag and drop implementation calls {@code canImport}
     * to determine the suitability of a transfer before calling this
     * method, the implementation of paste does not. As such, it cannot
     * be assumed that the transfer is acceptable upon a call to
     * this method for paste. It is recommended that {@code canImport} be
     * explicitly called to cover this case.
     * <p>
     * Note: The <code>TransferSupport</code> object passed to this method
     * is only valid for the duration of the method call. It is undefined
     * what values it may contain after this method returns.
     *
     * @param support the object containing the details of
     *        the transfer, not <code>null</code>.
     * @return true if the data was inserted into the component,
     *         false otherwise
     * @throws NullPointerException if <code>support</code> is {@code null}
     * @see #canImport(TransferHandler.TransferSupport)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public void exportToClipboard(JComponent comp, Clipboard clip, int action)

    /**
     * Causes a transfer from the given component to the
     * given clipboard.  This method is called by the default cut and
     * copy actions registered in a component's action map.
     * <p>
     * The transfer will take place using the <code>java.awt.datatransfer</code>
     * mechanism, requiring no further effort from the developer. Any data
     * transfer <em>will</em> be complete and the <code>exportDone</code>
     * method will be called with the action that occurred, before this method
     * returns. Should the clipboard be unavailable when attempting to place
     * data on it, the <code>IllegalStateException</code> thrown by
     * {@link Clipboard#setContents(Transferable, ClipboardOwner)} will
     * be propagated through this method. However,
     * <code>exportDone</code> will first be called with an action
     * of <code>NONE</code> for consistency.
     *
     * @param comp  the component holding the data to be transferred;
     *              provided to enable sharing of <code>TransferHandler</code>s
     * @param clip  the clipboard to transfer the data into
     * @param action the transfer action requested; this should
     *  be a value of either <code>COPY</code> or <code>MOVE</code>;
     *  the operation performed is the intersection  of the transfer
     *  capabilities given by getSourceActions and the requested action;
     *  the intersection may result in an action of <code>NONE</code>
     *  if the requested action isn't supported
     * @throws IllegalStateException if the clipboard is currently unavailable
     * @see Clipboard#setContents(Transferable, ClipboardOwner)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public void exportAsDrag(JComponent comp, InputEvent e, int action) {

    /**
     * Causes the Swing drag support to be initiated.  This is called by
     * the various UI implementations in the <code>javax.swing.plaf.basic</code>
     * package if the dragEnabled property is set on the component.
     * This can be called by custom UI
     * implementations to use the Swing drag support.  This method can also be called
     * by a Swing extension written as a subclass of <code>JComponent</code>
     * to take advantage of the Swing drag support.
     * <p>
     * The transfer <em>will not necessarily</em> have been completed at the
     * return of this call (i.e. the call does not block waiting for the drop).
     * The transfer will take place through the Swing implementation of the
     * <code>java.awt.dnd</code> mechanism, requiring no further effort
     * from the developer. The <code>exportDone</code> method will be called
     * when the transfer has completed.
     *
     * @param comp  the component holding the data to be transferred;
     *              provided to enable sharing of <code>TransferHandler</code>s
     * @param e     the event that triggered the transfer
     * @param action the transfer action initially requested;
     *               either {@code COPY}, {@code MOVE} or {@code LINK};
     *               the DnD system may change the action used during the
     *               course of the drag operation
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public Point getDragImageOffset() {

    /**
     * Returns an anchor offset for the image to drag.
     *
     * @return a {@code Point} object that corresponds
     * to coordinates of an anchor offset of the image
     * relative to the upper left corner of the image.
     * The point {@code (0,0)} returns by default.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public void setDragImageOffset(Point p) {

    /**
     * Sets an anchor offset for the image to drag.
     * It can not be {@code null}.
     *
     * @param p a {@code Point} object that corresponds
     * to coordinates of an anchor offset of the image
     * relative to the upper left corner of the image
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public Image getDragImage() {

    /**
     * Returns the drag image. If there is no image to drag,
     * the returned value is {@code null}.
     *
     * @return the reference to the drag image
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public void setDragImage(Image img) {

    /**
     * Sets the drag image parameter. The image has to be prepared
     * for rendering by the moment of the call. The image is stored
     * by reference because of some performance reasons.
     *
     * @param img an image to drag
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    private  Point dragImageOffset;

    /**
     * anchor offset for the {@code startDrag} method
     *
     * @see java.awt.dnd.DragGestureEvent#startDrag(Cursor dragCursor, Image dragImage, Point imageOffset, Transferable transferable, DragSourceListener dsl)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    private  Image dragImage;

    /**
     * image for the {@code startDrag} method
     *
     * @see java.awt.dnd.DragGestureEvent#startDrag(Cursor dragCursor, Image dragImage, Point imageOffset, Transferable transferable, DragSourceListener dsl)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    protected TransferHandler() {

    /**
     * Convenience constructor for subclasses.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public TransferHandler(String property) {

    /**
     * Constructs a transfer handler that can transfer a Java Bean property
     * from one component to another via the clipboard or a drag and drop
     * operation.
     *
     * @param property  the name of the property to transfer; this can
     *  be <code>null</code> if there is no property associated with the transfer
     *  handler (a subclass that performs some other kind of transfer, for example)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public static Action getPasteAction() {

    /**
     * Returns an {@code Action} that performs paste operations from the
     * clipboard. When performed, this action operates on the {@code JComponent}
     * source of the {@code ActionEvent} by invoking {@code importData},
     * with the clipboard contents, on the component's {@code TransferHandler}.
     *
     * @return an {@code Action} for performing pastes from the clipboard
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public static Action getCopyAction() {

    /**
     * Returns an {@code Action} that performs copy operations to the
     * clipboard. When performed, this action operates on the {@code JComponent}
     * source of the {@code ActionEvent} by invoking {@code exportToClipboard},
     * with a {@code COPY} action, on the component's {@code TransferHandler}.
     *
     * @return an {@code Action} for performing copies to the clipboard
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public static Action getCutAction() {

    /**
     * Returns an {@code Action} that performs cut operations to the
     * clipboard. When performed, this action operates on the {@code JComponent}
     * source of the {@code ActionEvent} by invoking {@code exportToClipboard},
     * with a {@code MOVE} action, on the component's {@code TransferHandler}.
     *
     * @return an {@code Action} for performing cuts to the clipboard
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public Transferable getTransferable() {

        /**
         * Returns the <code>Transferable</code> associated with this transfer.
         * <p>
         * Note: Unless it is necessary to fetch the <code>Transferable</code>
         * directly, use one of the other methods on this class to inquire about
         * the transfer. This may perform better than fetching the
         * <code>Transferable</code> and asking it directly.
         *
         * @return the <code>Transferable</code> associated with this transfer
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public boolean isDataFlavorSupported(DataFlavor df) {

        /**
         * Returns whether or not the given data flavor is supported.
         *
         * @param df the <code>DataFlavor</code> to test
         * @return whether or not the given flavor is supported.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public DataFlavor[] getDataFlavors() {

        /**
         * Returns the data flavors for this transfer.
         *
         * @return the data flavors for this transfer
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public int getSourceDropActions() {

        /**
         * Returns the drag source's supported drop actions, when this
         * {@code TransferSupport} represents a drop.
         * <p>
         * The source actions represent the set of actions supported by the
         * source of this transfer, and are represented as some bitwise-OR
         * combination of {@code COPY}, {@code MOVE} and {@code LINK}.
         * You may wish to query this in {@code TransferHandler}'s
         * {@code canImport} method when determining the suitability of a drop
         * or when deciding on a drop action to explicitly choose. To determine
         * if a particular action is supported by the source, bitwise-AND
         * the action with the source drop actions, and then compare the result
         * against the original action. For example:
         * <pre>
         * boolean copySupported = (COPY &amp; getSourceDropActions()) == COPY;
         * </pre>
         * <p>
         * This method is only for use with drag and drop transfers.
         * Calling it when {@code isDrop()} is {@code false} results
         * in an {@code IllegalStateException}.
         *
         * @return the drag source's supported drop actions
         * @throws IllegalStateException if this is not a drop
         * @see #isDrop()
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public int getUserDropAction() {

        /**
         * Returns the user drop action for the drop, when this
         * {@code TransferSupport} represents a drop.
         * <p>
         * The user drop action is chosen for a drop as described in the
         * documentation for {@link java.awt.dnd.DropTargetDragEvent} and
         * {@link java.awt.dnd.DropTargetDropEvent}. A different action
         * may be chosen as the drop action by way of the {@code setDropAction}
         * method.
         * <p>
         * You may wish to query this in {@code TransferHandler}'s
         * {@code canImport} method when determining the suitability of a
         * drop or when deciding on a drop action to explicitly choose.
         * <p>
         * This method is only for use with drag and drop transfers.
         * Calling it when {@code isDrop()} is {@code false} results
         * in an {@code IllegalStateException}.
         *
         * @return the user drop action
         * @throws IllegalStateException if this is not a drop
         * @see #setDropAction
         * @see #getDropAction
         * @see #isDrop()
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public int getDropAction() {

        /**
         * Returns the action chosen for the drop, when this
         * {@code TransferSupport} represents a drop.
         * <p>
         * Unless explicitly chosen by way of {@code setDropAction},
         * this returns the user drop action provided by
         * {@code getUserDropAction}.
         * <p>
         * You may wish to query this in {@code TransferHandler}'s
         * {@code importData} method to customize processing based
         * on the action.
         * <p>
         * This method is only for use with drag and drop transfers.
         * Calling it when {@code isDrop()} is {@code false} results
         * in an {@code IllegalStateException}.
         *
         * @return the action chosen for the drop
         * @throws IllegalStateException if this is not a drop
         * @see #setDropAction
         * @see #getUserDropAction
         * @see #isDrop()
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public void setDropAction(int dropAction) {

        /**
         * Sets the drop action for the transfer - which must represent a drop
         * - to the given action,
         * instead of the default user drop action. The action must be
         * supported by the source's drop actions, and must be one
         * of {@code COPY}, {@code MOVE} or {@code LINK}.
         * <p>
         * This method is only for use with drag and drop transfers.
         * Calling it when {@code isDrop()} is {@code false} results
         * in an {@code IllegalStateException}.
         *
         * @param dropAction the drop action
         * @throws IllegalStateException if this is not a drop
         * @throws IllegalArgumentException if an invalid action is specified
         * @see #getDropAction
         * @see #getUserDropAction
         * @see #getSourceDropActions
         * @see #isDrop()
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public void setShowDropLocation(boolean showDropLocation) {

        /**
         * Sets whether or not the drop location should be visually indicated
         * for the transfer - which must represent a drop. This is applicable to
         * those components that automatically
         * show the drop location when appropriate during a drag and drop
         * operation). By default, the drop location is shown only when the
         * {@code TransferHandler} has said it can accept the import represented
         * by this {@code TransferSupport}. With this method you can force the
         * drop location to always be shown, or always not be shown.
         * <p>
         * This method is only for use with drag and drop transfers.
         * Calling it when {@code isDrop()} is {@code false} results
         * in an {@code IllegalStateException}.
         *
         * @param showDropLocation whether or not to indicate the drop location
         * @throws IllegalStateException if this is not a drop
         * @see #isDrop()
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public DropLocation getDropLocation() {

        /**
         * Returns the current (non-{@code null}) drop location for the component,
         * when this {@code TransferSupport} represents a drop.
         * <p>
         * Note: For components with built-in drop support, this location
         * will be a subclass of {@code DropLocation} of the same type
         * returned by that component's {@code getDropLocation} method.
         * <p>
         * This method is only for use with drag and drop transfers.
         * Calling it when {@code isDrop()} is {@code false} results
         * in an {@code IllegalStateException}.
         *
         * @return the drop location
         * @throws IllegalStateException if this is not a drop
         * @see #isDrop()
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        private void assureIsDrop() {

        /**
         * Checks that this is a drop and throws an
         * {@code IllegalStateException} if it isn't.
         *
         * @throws IllegalStateException if {@code isDrop} is false.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public Component getComponent() {

        /**
         * Returns the target component of this transfer.
         *
         * @return the target component
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public boolean isDrop() {

        /**
         * Returns whether or not this <code>TransferSupport</code>
         * represents a drop operation.
         *
         * @return <code>true</code> if this is a drop operation,
         *         <code>false</code> otherwise.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        private void setDNDVariables(Component component,
                                     DropTargetEvent event) {

        /**
         * Allows for a single instance to be reused during DnD.
         *
         * @param component the target component
         * @param event a <code>DropTargetEvent</code>
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public TransferSupport(Component component, Transferable transferable) {

        /**
         * Create a <code>TransferSupport</code> with <code>isDrop()</code>
         * <code>false</code> for the given component and
         * <code>Transferable</code>.
         *
         * @param component the target component
         * @param transferable the transferable
         * @throws NullPointerException if either parameter
         *         is <code>null</code>
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        private TransferSupport(Component component,
                             DropTargetEvent event) {

        /**
         * Create a <code>TransferSupport</code> with <code>isDrop()</code>
         * <code>true</code> for the given component, event, and index.
         *
         * @param component the target component
         * @param event a <code>DropTargetEvent</code>
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        private Object source;

        /**
         * The source is a {@code DropTargetDragEvent} or
         * {@code DropTargetDropEvent} for drops,
         * and a {@code Transferable} otherwise
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public final static class TransferSupport {

    /**
     * This class encapsulates all relevant details of a clipboard
     * or drag and drop transfer, and also allows for customizing
     * aspects of the drag and drop experience.
     * <p>
     * The main purpose of this class is to provide the information
     * needed by a developer to determine the suitability of a
     * transfer or to import the data contained within. But it also
     * doubles as a controller for customizing properties during drag
     * and drop, such as whether or not to show the drop location,
     * and which drop action to use.
     * <p>
     * Developers typically need not create instances of this
     * class. Instead, they are something provided by the DnD
     * implementation to certain methods in <code>TransferHandler</code>.
     *
     * @see #canImport(TransferHandler.TransferSupport)
     * @see #importData(TransferHandler.TransferSupport)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public String toString() {

        /**
         * Returns a string representation of this drop location.
         * This method is intended to be used for debugging purposes,
         * and the content and format of the returned string may vary
         * between implementations.
         *
         * @return a string representation of this drop location
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public final Point getDropPoint() {

        /**
         * Returns the drop point, representing the mouse's
         * current location within the component.
         *
         * @return the drop point.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        protected DropLocation(Point dropPoint) {

        /**
         * Constructs a drop location for the given point.
         *
         * @param dropPoint the drop point, representing the mouse's
         *        current location within the component.
         * @throws IllegalArgumentException if the point
         *         is <code>null</code>
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public static class DropLocation {

    /**
     * Represents a location where dropped data should be inserted.
     * This is a base class that only encapsulates a point.
     * Components supporting drop may provide subclasses of this
     * containing more information.
     * <p>
     * Developers typically shouldn't create instances of, or extend, this
     * class. Instead, these are something provided by the DnD
     * implementation by <code>TransferSupport</code> instances and by
     * components with a <code>getDropLocation()</code> method.
     *
     * @see javax.swing.TransferHandler.TransferSupport#getDropLocation
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
        public TransferHandler getTransferHandler();

        /** Returns the {@code TransferHandler}.
         *
         * @return The {@code TransferHandler} or {@code null}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    interface HasGetTransferHandler {

    /**
     * An interface to tag things with a {@code getTransferHandler} method.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public static final int LINK = DnDConstants.ACTION_LINK;

    /**
     * An <code>int</code> representing a &quot;link&quot; transfer action.
     * This value is used to specify that data should be linked in a drag
     * and drop operation.
     *
     * @see java.awt.dnd.DnDConstants#ACTION_LINK
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public static final int COPY_OR_MOVE = DnDConstants.ACTION_COPY_OR_MOVE;

    /**
     * An <code>int</code> representing a source action capability of either
     * &quot;copy&quot; or &quot;move&quot;.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public static final int MOVE = DnDConstants.ACTION_MOVE;

    /**
     * An <code>int</code> representing a &quot;move&quot; transfer action.
     * This value is used when data is moved to a clipboard (i.e. a cut)
     * or moved elsewhere in a drag and drop operation.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public static final int COPY = DnDConstants.ACTION_COPY;

    /**
     * An <code>int</code> representing a &quot;copy&quot; transfer action.
     * This value is used when data is copied to a clipboard
     * or copied elsewhere in a drag and drop operation.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
    public static final int NONE = DnDConstants.ACTION_NONE;

    /**
     * An <code>int</code> representing no transfer action.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TransferHandler.java
@SuppressWarnings("serial")

/**
 * This class is used to handle the transfer of a <code>Transferable</code>
 * to and from Swing components.  The <code>Transferable</code> is used to
 * represent data that is exchanged via a cut, copy, or paste
 * to/from a clipboard.  It is also used in drag-and-drop operations
 * to represent a drag from a component, and a drop to a component.
 * Swing provides functionality that automatically supports cut, copy,
 * and paste keyboard bindings that use the functionality provided by
 * an implementation of this class.  Swing also provides functionality
 * that automatically supports drag and drop that uses the functionality
 * provided by an implementation of this class.  The Swing developer can
 * concentrate on specifying the semantics of a transfer primarily by setting
 * the <code>transferHandler</code> property on a Swing component.
 * <p>
 * This class is implemented to provide a default behavior of transferring
 * a component property simply by specifying the name of the property in
 * the constructor.  For example, to transfer the foreground color from
 * one component to another either via the clipboard or a drag and drop operation
 * a <code>TransferHandler</code> can be constructed with the string "foreground".  The
 * built in support will use the color returned by <code>getForeground</code> as the source
 * of the transfer, and <code>setForeground</code> for the target of a transfer.
 * <p>
 * Please see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/dnd/index.html">
 * How to Use Drag and Drop and Data Transfer</a>,
 * a section in <em>The Java Tutorial</em>, for more information.
 *
 *
 * @author Timothy Prinzing
 * @author Shannon Hickey
 * @since 1.4
 */
