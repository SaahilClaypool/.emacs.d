_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    private DropTarget dropTarget;

    /**
     * The DropTarget associated with this DropTargetContext.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    /*

/****************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
        protected boolean       isLocal;

        /**
         * A <code>boolean</code> indicating if the encapsulated
         * <code>Transferable</code> object represents the result
         * of local drag-n-drop operation (within the same JVM).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
        protected Transferable  transferable;

        /**
         * The encapsulated <code>Transferable</code> object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
        public Object getTransferData(DataFlavor df)

        /**
         * Returns an object which represents the data provided by
         * the encapsulated transferable for the requested data flavor.
         * <p>
         * In case of local transfer a serialized copy of the object
         * returned by the encapsulated transferable is provided when
         * the data is requested in application/x-java-serialized-object
         * data flavor.
         *
         * @param df the requested flavor for the data
         * @throws IOException if the data is no longer available
         *              in the requested flavor.
         * @throws UnsupportedFlavorException if the requested data flavor is
         *              not supported.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
        public boolean isDataFlavorSupported(DataFlavor flavor) {

        /**
         * Returns whether or not the specified data flavor is supported by
         * the encapsulated transferable.
         * @param flavor the requested flavor for the data
         * @return <code>true</code> if the data flavor is supported,
         *         <code>false</code> otherwise
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
        public DataFlavor[] getTransferDataFlavors() {

        /**
         * Returns an array of DataFlavor objects indicating the flavors
         * the data can be provided in by the encapsulated transferable.
         * <p>
         * @return an array of data flavors in which the data can be
         *         provided by the encapsulated transferable
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
        TransferableProxy(Transferable t, boolean local) {

        /**
         * Constructs a <code>TransferableProxy</code> given
         * a specified <code>Transferable</code> object representing
         * data transfer for a particular drag-n-drop operation and
         * a <code>boolean</code> which indicates whether the
         * drag-n-drop operation is local (within the same JVM).
         * <p>
         * @param t the <code>Transferable</code> object
         * @param local <code>true</code>, if <code>t</code> represents
         *        the result of local drag-n-drop operation
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    /**

/****************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected Transferable createTransferableProxy(Transferable t, boolean local) {

    /**
     * Creates a TransferableProxy to proxy for the specified
     * Transferable.
     *
     * @param t the <tt>Transferable</tt> to be proxied
     * @param local <tt>true</tt> if <tt>t</tt> represents
     *        the result of a local drag-n-drop operation.
     * @return the new <tt>TransferableProxy</tt> instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    DropTargetContextPeer getDropTargetContextPeer() {

    /**
     * Get the <code>DropTargetContextPeer</code>
     * <P>
     * @return the platform peer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected Transferable getTransferable() throws InvalidDnDOperationException {

    /**
     * get the Transferable (proxy) operand of this operation
     * <P>
     * @throws InvalidDnDOperationException if a drag is not outstanding/extant
     * <P>
     * @return the <code>Transferable</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected boolean isDataFlavorSupported(DataFlavor df) {

    /**
     * This method returns a <code>boolean</code>
     * indicating if the given <code>DataFlavor</code> is
     * supported by this <code>DropTargetContext</code>.
     * <P>
     * @param df the <code>DataFlavor</code>
     * <P>
     * @return if the <code>DataFlavor</code> specified is supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected List<DataFlavor> getCurrentDataFlavorsAsList() {

    /**
     * This method returns a the currently available DataFlavors
     * of the <code>Transferable</code> operand
     * as a <code>java.util.List</code>.
     * <P>
     * @return the currently available
     * DataFlavors as a <code>java.util.List</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected DataFlavor[] getCurrentDataFlavors() {

    /**
     * get the available DataFlavors of the
     * <code>Transferable</code> operand of this operation.
     * <P>
     * @return a <code>DataFlavor[]</code> containing the
     * supported <code>DataFlavor</code>s of the
     * <code>Transferable</code> operand.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected void rejectDrop() {

    /**
     * called to signal that the drop is unacceptable.
     * must be called during DropTargetListener.drop method invocation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected void acceptDrop(int dropOperation) {

    /**
     * called to signal that the drop is acceptable
     * using the specified operation.
     * must be called during DropTargetListener.drop method invocation.
     * <P>
     * @param dropOperation the supported action(s)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected void rejectDrag() {

    /**
     * reject the Drag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected void acceptDrag(int dragOperation) {

    /**
     * accept the Drag.
     * <P>
     * @param dragOperation the supported action(s)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    public void dropComplete(boolean success) throws InvalidDnDOperationException{

    /**
     * This method signals that the drop is completed and
     * if it was successful or not.
     * <P>
     * @param success true for success, false if not
     * <P>
     * @throws InvalidDnDOperationException if a drop is not outstanding/extant
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected int getTargetActions() {

    /**
     * This method returns an <code>int</code> representing the
     * current actions this <code>DropTarget</code> will accept.
     * <P>
     * @return the current actions acceptable to this <code>DropTarget</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected void setTargetActions(int actions) {

    /**
     * This method sets the current actions acceptable to
     * this <code>DropTarget</code>.
     * <P>
     * @param actions an <code>int</code> representing the supported action(s)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    public void removeNotify() {

    /**
     * Called when disassociated with the <code>DropTargetContextPeer</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    public void addNotify(DropTargetContextPeer dtcp) {

    /**
     * Called when associated with the <code>DropTargetContextPeer</code>.
     * <P>
     * @param dtcp the <code>DropTargetContextPeer</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    public Component getComponent() { return dropTarget.getComponent(); }

    /**
     * This method returns the <code>Component</code> associated with
     * this <code>DropTargetContext</code>.
     * <P>
     * @return the Component associated with this Context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    public DropTarget getDropTarget() { return dropTarget; }

    /**
     * This method returns the <code>DropTarget</code> associated with this
     * <code>DropTargetContext</code>.
     * <P>
     * @return the <code>DropTarget</code> associated with this <code>DropTargetContext</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    DropTargetContext(DropTarget dt) {

    /**
     * Construct a <code>DropTargetContext</code>
     * given a specified <code>DropTarget</code>.
     * <P>
     * @param dt the DropTarget to associate with
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
public class DropTargetContext implements Serializable {

/**
 * A <code>DropTargetContext</code> is created
 * whenever the logical cursor associated
 * with a Drag and Drop operation coincides with the visible geometry of
 * a <code>Component</code> associated with a <code>DropTarget</code>.
 * The <code>DropTargetContext</code> provides
 * the mechanism for a potential receiver
 * of a drop operation to both provide the end user with the appropriate
 * drag under feedback, but also to effect the subsequent data transfer
 * if appropriate.
 *
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    private DropTarget dropTarget;

    /**
     * The DropTarget associated with this DropTargetContext.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    /*

/****************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
        protected boolean       isLocal;

        /**
         * A <code>boolean</code> indicating if the encapsulated
         * <code>Transferable</code> object represents the result
         * of local drag-n-drop operation (within the same JVM).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
        protected Transferable  transferable;

        /**
         * The encapsulated <code>Transferable</code> object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
        public Object getTransferData(DataFlavor df)

        /**
         * Returns an object which represents the data provided by
         * the encapsulated transferable for the requested data flavor.
         * <p>
         * In case of local transfer a serialized copy of the object
         * returned by the encapsulated transferable is provided when
         * the data is requested in application/x-java-serialized-object
         * data flavor.
         *
         * @param df the requested flavor for the data
         * @throws IOException if the data is no longer available
         *              in the requested flavor.
         * @throws UnsupportedFlavorException if the requested data flavor is
         *              not supported.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
        public boolean isDataFlavorSupported(DataFlavor flavor) {

        /**
         * Returns whether or not the specified data flavor is supported by
         * the encapsulated transferable.
         * @param flavor the requested flavor for the data
         * @return <code>true</code> if the data flavor is supported,
         *         <code>false</code> otherwise
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
        public DataFlavor[] getTransferDataFlavors() {

        /**
         * Returns an array of DataFlavor objects indicating the flavors
         * the data can be provided in by the encapsulated transferable.
         * <p>
         * @return an array of data flavors in which the data can be
         *         provided by the encapsulated transferable
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
        TransferableProxy(Transferable t, boolean local) {

        /**
         * Constructs a <code>TransferableProxy</code> given
         * a specified <code>Transferable</code> object representing
         * data transfer for a particular drag-n-drop operation and
         * a <code>boolean</code> which indicates whether the
         * drag-n-drop operation is local (within the same JVM).
         * <p>
         * @param t the <code>Transferable</code> object
         * @param local <code>true</code>, if <code>t</code> represents
         *        the result of local drag-n-drop operation
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    /**

/****************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected Transferable createTransferableProxy(Transferable t, boolean local) {

    /**
     * Creates a TransferableProxy to proxy for the specified
     * Transferable.
     *
     * @param t the <tt>Transferable</tt> to be proxied
     * @param local <tt>true</tt> if <tt>t</tt> represents
     *        the result of a local drag-n-drop operation.
     * @return the new <tt>TransferableProxy</tt> instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    DropTargetContextPeer getDropTargetContextPeer() {

    /**
     * Get the <code>DropTargetContextPeer</code>
     * <P>
     * @return the platform peer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected Transferable getTransferable() throws InvalidDnDOperationException {

    /**
     * get the Transferable (proxy) operand of this operation
     * <P>
     * @throws InvalidDnDOperationException if a drag is not outstanding/extant
     * <P>
     * @return the <code>Transferable</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected boolean isDataFlavorSupported(DataFlavor df) {

    /**
     * This method returns a <code>boolean</code>
     * indicating if the given <code>DataFlavor</code> is
     * supported by this <code>DropTargetContext</code>.
     * <P>
     * @param df the <code>DataFlavor</code>
     * <P>
     * @return if the <code>DataFlavor</code> specified is supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected List<DataFlavor> getCurrentDataFlavorsAsList() {

    /**
     * This method returns a the currently available DataFlavors
     * of the <code>Transferable</code> operand
     * as a <code>java.util.List</code>.
     * <P>
     * @return the currently available
     * DataFlavors as a <code>java.util.List</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected DataFlavor[] getCurrentDataFlavors() {

    /**
     * get the available DataFlavors of the
     * <code>Transferable</code> operand of this operation.
     * <P>
     * @return a <code>DataFlavor[]</code> containing the
     * supported <code>DataFlavor</code>s of the
     * <code>Transferable</code> operand.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected void rejectDrop() {

    /**
     * called to signal that the drop is unacceptable.
     * must be called during DropTargetListener.drop method invocation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected void acceptDrop(int dropOperation) {

    /**
     * called to signal that the drop is acceptable
     * using the specified operation.
     * must be called during DropTargetListener.drop method invocation.
     * <P>
     * @param dropOperation the supported action(s)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected void rejectDrag() {

    /**
     * reject the Drag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected void acceptDrag(int dragOperation) {

    /**
     * accept the Drag.
     * <P>
     * @param dragOperation the supported action(s)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    public void dropComplete(boolean success) throws InvalidDnDOperationException{

    /**
     * This method signals that the drop is completed and
     * if it was successful or not.
     * <P>
     * @param success true for success, false if not
     * <P>
     * @throws InvalidDnDOperationException if a drop is not outstanding/extant
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected int getTargetActions() {

    /**
     * This method returns an <code>int</code> representing the
     * current actions this <code>DropTarget</code> will accept.
     * <P>
     * @return the current actions acceptable to this <code>DropTarget</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    protected void setTargetActions(int actions) {

    /**
     * This method sets the current actions acceptable to
     * this <code>DropTarget</code>.
     * <P>
     * @param actions an <code>int</code> representing the supported action(s)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    public void removeNotify() {

    /**
     * Called when disassociated with the <code>DropTargetContextPeer</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    public void addNotify(DropTargetContextPeer dtcp) {

    /**
     * Called when associated with the <code>DropTargetContextPeer</code>.
     * <P>
     * @param dtcp the <code>DropTargetContextPeer</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    public Component getComponent() { return dropTarget.getComponent(); }

    /**
     * This method returns the <code>Component</code> associated with
     * this <code>DropTargetContext</code>.
     * <P>
     * @return the Component associated with this Context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    public DropTarget getDropTarget() { return dropTarget; }

    /**
     * This method returns the <code>DropTarget</code> associated with this
     * <code>DropTargetContext</code>.
     * <P>
     * @return the <code>DropTarget</code> associated with this <code>DropTargetContext</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
    DropTargetContext(DropTarget dt) {

    /**
     * Construct a <code>DropTargetContext</code>
     * given a specified <code>DropTarget</code>.
     * <P>
     * @param dt the DropTarget to associate with
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/dnd/DropTargetContext.java
public class DropTargetContext implements Serializable {

/**
 * A <code>DropTargetContext</code> is created
 * whenever the logical cursor associated
 * with a Drag and Drop operation coincides with the visible geometry of
 * a <code>Component</code> associated with a <code>DropTarget</code>.
 * The <code>DropTargetContext</code> provides
 * the mechanism for a potential receiver
 * of a drop operation to both provide the end user with the appropriate
 * drag under feedback, but also to effect the subsequent data transfer
 * if appropriate.
 *
 * @since 1.2
 */
