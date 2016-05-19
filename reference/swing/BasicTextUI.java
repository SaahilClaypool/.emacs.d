_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
            protected Object getRicherData(DataFlavor flavor) throws UnsupportedFlavorException {

            /**
             * The only richer format supported is the file list flavor
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
            protected DataFlavor[] getRicherFlavors() {

            /**
             * If the EditorKit is not for text/plain or text/html, that format
             * is supported through the "richer flavors" part of BasicTransferable.
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        static class TextTransferable extends BasicTransferable {

        /**
         * A possible implementation of the Transferable interface
         * for text components.  For a JEditorPane with a rich set
         * of EditorKit implementations, conversions could be made
         * giving a wider set of formats.  This is implemented to
         * offer up only the active content type and text/plain
         * (if that is not the active format) since that can be
         * extracted from other formats.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public boolean canImport(JComponent comp, DataFlavor[] flavors) {

        /**
         * This method indicates if a component would accept an import of the given
         * set of data flavors prior to actually attempting to import it.
         *
         * @param comp  The component to receive the transfer.  This
         *  argument is provided to enable sharing of TransferHandlers by
         *  multiple components.
         * @param flavors  The data formats available
         * @return  true if the data can be inserted into the component, false otherwise.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public boolean importData(JComponent comp, Transferable t) {

        /**
         * This method causes a transfer to a component from a clipboard or a
         * DND drop operation.  The Transferable represents the data to be
         * imported into the component.
         *
         * @param comp  The component to receive the transfer.  This
         *  argument is provided to enable sharing of TransferHandlers by
         *  multiple components.
         * @param t     The data to import
         * @return  true if the data was inserted into the component, false otherwise.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        protected void exportDone(JComponent source, Transferable data, int action) {

        /**
         * This method is called after data has been exported.  This method should remove
         * the data that was transfered if the action was MOVE.
         *
         * @param source The component that was the source of the data.
         * @param data   The data that was transferred or possibly null
         *               if the action is <code>NONE</code>.
         * @param action The actual action that was performed.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        protected Transferable createTransferable(JComponent comp) {

        /**
         * Create a Transferable to use as the source for a data transfer.
         *
         * @param comp  The component holding the data to be transfered.  This
         *  argument is provided to enable sharing of TransferHandlers by
         *  multiple components.
         * @return  The representation of the data to be transfered.
         *
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public int getSourceActions(JComponent c) {

        /**
         * This is the type of transfer actions supported by the source.  Some models are
         * not mutable, so a transfer operation of COPY only should
         * be advertised in that case.
         *
         * @param c  The component holding the data to be transfered.  This
         *  argument is provided to enable sharing of TransferHandlers by
         *  multiple components.
         * @return  This is implemented to return NONE if the component is a JPasswordField
         *  since exporting data via user gestures is not allowed.  If the text component is
         *  editable, COPY_OR_MOVE is returned, otherwise just COPY is allowed.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        protected void handleReaderImport(Reader in, JTextComponent c, boolean useRead)

        /**
         * Import the given stream data into the text component.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        protected DataFlavor getImportFlavor(DataFlavor[] flavors, JTextComponent c) {

        /**
         * Try to find a flavor that can be used to import a Transferable.
         * The set of usable flavors are tried in the following order:
         * <ol>
         *     <li>First, an attempt is made to find a flavor matching the content type
         *         of the EditorKit for the component.
         *     <li>Second, an attempt to find a text/plain flavor is made.
         *     <li>Third, an attempt to find a flavor representing a String reference
         *         in the same VM is made.
         *     <li>Lastly, DataFlavor.stringFlavor is searched for.
         * </ol>
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        private Position.Bias dropBias;

        /**
         * The drop bias.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        private int dropAction = MOVE;

        /**
         * The drop action.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        private boolean isDrop = false;

        /**
         * Whether or not this is a drop.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        private boolean modeBetween = false;

        /**
         * Whether or not this is a drop using
         * <code>DropMode.INSERT</code>.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        protected boolean isDragPossible(MouseEvent e) {

        /**
         * Determines if the following are true:
         * <ul>
         * <li>the component is enabled
         * <li>the press event is located over a selection
         * </ul>
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    static class DragListener extends MouseInputAdapter

    /**
     * Listens for mouse events for the purposes of detecting drag gestures.
     * BasicTextUI will maintain one of these per AppContext.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    class FocusAction extends AbstractAction {

    /**
     * Registered in the ActionMap.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public void actionPerformed(ActionEvent e) {

        /**
         * The operation to perform when this action is triggered.
         *
         * @param e the action event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    class TextActionWrapper extends TextAction {

    /**
     * Wrapper for text actions to return isEnabled false in case editor is non editable
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        private Hashtable<Component, Object> constraints;

        /**
         * The "layout constraints" for the LayoutManager2 implementation.
         * These are View objects for those components that are represented
         * by a View in the View tree.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public void invalidateLayout(Container target) {

        /**
         * Invalidates the layout, indicating that if the layout manager
         * has cached information it should be discarded.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public float getLayoutAlignmentY(Container target) {

        /**
         * Returns the alignment along the y axis.  This specifies how
         * the component would like to be aligned relative to other
         * components.  The value should be a number between 0 and 1
         * where 0 represents alignment along the origin, 1 is aligned
         * the furthest away from the origin, 0.5 is centered, etc.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public float getLayoutAlignmentX(Container target) {

        /**
         * Returns the alignment along the x axis.  This specifies how
         * the component would like to be aligned relative to other
         * components.  The value should be a number between 0 and 1
         * where 0 represents alignment along the origin, 1 is aligned
         * the furthest away from the origin, 0.5 is centered, etc.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public Dimension maximumLayoutSize(Container target) {

        /**
         * Returns the maximum size of this component.
         * @see java.awt.Component#getMinimumSize()
         * @see java.awt.Component#getPreferredSize()
         * @see LayoutManager
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public void addLayoutComponent(Component comp, Object constraint) {

        /**
         * Adds the specified component to the layout, using the specified
         * constraint object.  We only store those components that were added
         * with a constraint that is of type View.
         *
         * @param comp the component to be added
         * @param constraint  where/how the component is added to the layout.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        Shape calculateViewPosition(Shape alloc, View v) {

        /**
         * Find the Shape representing the given view.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public void layoutContainer(Container parent) {

        /**
         * Lays out the container in the specified panel.  This is
         * implemented to position all components that were added
         * with a View object as a constraint.  The current allocation
         * of the associated View is used as the location of the
         * component.
         * <p>
         * A read-lock is acquired on the document to prevent the
         * view tree from being modified while the layout process
         * is active.
         *
         * @param parent the component which needs to be laid out
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public Dimension minimumLayoutSize(Container parent) {

        /**
         * Calculates the minimum size dimensions for the specified
         * panel given the components in the specified parent container.
         * @param parent the component to be laid out
         * @see #preferredLayoutSize
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public Dimension preferredLayoutSize(Container parent) {

        /**
         * Calculates the preferred size dimensions for the specified
         * panel given the components in the specified parent container.
         * @param parent the component to be laid out
         *
         * @see #minimumLayoutSize
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public void removeLayoutComponent(Component comp) {

        /**
         * Removes the specified component from the layout.
         * @param comp the component to be removed
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public void addLayoutComponent(String name, Component comp) {

        /**
         * Adds the specified component with the specified name to
         * the layout.
         * @param name the component name
         * @param comp the component to be added
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public final void changedUpdate(DocumentEvent e) {

        /**
         * The change notification.  Gets sent to the root of the view structure
         * that represents the portion of the model being represented by the
         * editor.  The factory is added as an argument to the update so that
         * the views can update themselves in a dynamic (not hardcoded) way.
         *
         * @param e  The change notification from the currently associated
         *  document.
         * @see DocumentListener#changedUpdate(DocumentEvent)
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public final void removeUpdate(DocumentEvent e) {

        /**
         * The remove notification.  Gets sent to the root of the view structure
         * that represents the portion of the model being represented by the
         * editor.  The factory is added as an argument to the update so that
         * the views can update themselves in a dynamic (not hardcoded) way.
         *
         * @param e  The change notification from the currently associated
         *  document.
         * @see DocumentListener#removeUpdate
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public final void insertUpdate(DocumentEvent e) {

        /**
         * The insert notification.  Gets sent to the root of the view structure
         * that represents the portion of the model being represented by the
         * editor.  The factory is added as an argument to the update so that
         * the views can update themselves in a dynamic (not hardcoded) way.
         *
         * @param e  The change notification from the currently associated
         *  document.
         * @see DocumentListener#insertUpdate
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public final void propertyChange(PropertyChangeEvent evt) {

        /**
         * This method gets called when a bound property is changed.
         * We are looking for document changes on the editor.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    class UpdateHandler implements PropertyChangeListener, DocumentListener, LayoutManager2, UIResource {

    /**
     * Handles updates from various places.  If the model is changed,
     * this class unregisters as a listener to the old model and
     * registers with the new model.  If the document model changes,
     * the change is forwarded to the root view.  If the focus
     * accelerator changes, a new keystroke is registered to request
     * focus.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public ViewFactory getViewFactory() {

        /**
         * Fetches the factory to be used for building the
         * various view fragments that make up the view that
         * represents the model.  This is what determines
         * how the model will be represented.  This is implemented
         * to fetch the factory provided by the associated
         * EditorKit unless that is null, in which case this
         * simply returns the BasicTextUI itself which allows
         * subclasses to implement a simple factory directly without
         * creating extra objects.
         *
         * @return the factory
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public Container getContainer() {

        /**
         * Fetches the container hosting the view.  This is useful for
         * things like scheduling a repaint, finding out the host
         * components font, etc.  The default implementation
         * of this is to forward the query to the parent view.
         *
         * @return the container
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public void setSize(float width, float height) {

        /**
         * Sets the view size.
         *
         * @param width the width
         * @param height the height
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public int getResizeWeight(int axis) {

        /**
         * Determines the resizability of the view along the
         * given axis.  A value of 0 or less is not resizable.
         *
         * @param axis may be either X_AXIS or Y_AXIS
         * @return the weight
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public View breakView(int axis, float len, Shape a) {

        /**
         * Breaks this view on the given axis at the given length.
         *
         * @param axis may be either X_AXIS or Y_AXIS
         * @param len specifies where a break is desired in the span
         * @param the current allocation of the view
         * @return the fragment of the view that represents the given span
         *   if the view can be broken, otherwise null
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public Element getElement() {

        /**
         * Gets the element that this view is mapped to.
         *
         * @return the view
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public int getEndOffset() {

        /**
         * Returns the ending offset into the model for this view.
         *
         * @return the ending offset
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public int getStartOffset() {

        /**
         * Returns the starting offset into the model for this view.
         *
         * @return the starting offset
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public Document getDocument() {

        /**
         * Returns the document model underlying the view.
         *
         * @return the model
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public void changedUpdate(DocumentEvent e, Shape a, ViewFactory f) {

        /**
         * Gives notification from the document that attributes were changed
         * in a location that this view is responsible for.
         *
         * @param e the change information from the associated document
         * @param a the current allocation of the view
         * @param f the factory to use to rebuild if the view has children
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public void removeUpdate(DocumentEvent e, Shape a, ViewFactory f) {

        /**
         * Gives notification that something was removed from the document
         * in a location that this view is responsible for.
         *
         * @param e the change information from the associated document
         * @param a the current allocation of the view
         * @param f the factory to use to rebuild if the view has children
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public void insertUpdate(DocumentEvent e, Shape a, ViewFactory f) {

        /**
         * Gives notification that something was inserted into the document
         * in a location that this view is responsible for.
         *
         * @param e the change information from the associated document
         * @param a the current allocation of the view
         * @param f the factory to use to rebuild if the view has children
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public int getNextVisualPositionFrom(int pos, Position.Bias b, Shape a,
                                             int direction,
                                             Position.Bias[] biasRet)

        /**
         * Provides a way to determine the next visually represented model
         * location that one might place a caret.  Some views may not be visible,
         * they might not be in the same order found in the model, or they just
         * might not allow access to some of the locations in the model.
         * This method enables specifying a position to convert
         * within the range of &gt;=0.  If the value is -1, a position
         * will be calculated automatically.  If the value &lt; -1,
         * the {@code BadLocationException} will be thrown.
         *
         * @param pos the position to convert &gt;= 0
         * @param a the allocated region to render into
         * @param direction the direction from the current position that can
         *  be thought of as the arrow keys typically found on a keyboard.
         *  This may be SwingConstants.WEST, SwingConstants.EAST,
         *  SwingConstants.NORTH, or SwingConstants.SOUTH.
         * @return the location within the model that best represents the next
         *  location visual position.
         * @exception BadLocationException the given position is not a valid
         *                                 position within the document
         * @exception IllegalArgumentException for an invalid direction
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public int viewToModel(float x, float y, Shape a, Position.Bias[] bias) {

        /**
         * Provides a mapping from the view coordinate space to the logical
         * coordinate space of the model.
         *
         * @param x x coordinate of the view location to convert
         * @param y y coordinate of the view location to convert
         * @param a the allocated region to render into
         * @return the location within the model that best represents the
         *    given point in the view
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public Shape modelToView(int p0, Position.Bias b0, int p1, Position.Bias b1, Shape a) throws BadLocationException {

        /**
         * Provides a mapping from the document model coordinate space
         * to the coordinate space of the view mapped to it.
         *
         * @param p0 the position to convert &gt;= 0
         * @param b0 the bias toward the previous character or the
         *  next character represented by p0, in case the
         *  position is a boundary of two views.
         * @param p1 the position to convert &gt;= 0
         * @param b1 the bias toward the previous character or the
         *  next character represented by p1, in case the
         *  position is a boundary of two views.
         * @param a the allocated region to render into
         * @return the bounding box of the given position is returned
         * @exception BadLocationException  if the given position does
         *   not represent a valid location in the associated document
         * @exception IllegalArgumentException for an invalid bias argument
         * @see View#viewToModel
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {

        /**
         * Provides a mapping from the document model coordinate space
         * to the coordinate space of the view mapped to it.
         *
         * @param pos the position to convert
         * @param a the allocated region to render into
         * @return the bounding box of the given position
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public Shape getChildAllocation(int index, Shape a) {

        /**
         * Fetches the allocation for the given child view.
         * This enables finding out where various views
         * are located, without assuming the views store
         * their location.  This returns the given allocation
         * since this view simply acts as a gateway between
         * the view hierarchy and the associated component.
         *
         * @param index the index of the child
         * @param a  the allocation to this view.
         * @return the allocation to the child
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public int getViewIndex(int pos, Position.Bias b) {

        /**
         * Returns the child view index representing the given position in
         * the model.  This is implemented to return the index of the only
         * child.
         *
         * @param pos the position &gt;= 0
         * @return  index of the view representing the given position, or
         *   -1 if no view represents that position
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public View getView(int n) {

        /**
         * Gets the n-th view in this container.
         *
         * @param n the number of the view to get
         * @return the view
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public int getViewCount() {

        /**
         * Returns the number of views in this view.  Since
         * this view simply wraps the root of the view hierarchy
         * it has exactly one child.
         *
         * @return the number of views
         * @see #getView
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public void setParent(View parent) {

        /**
         * Sets the view parent.
         *
         * @param parent the parent view
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public void paint(Graphics g, Shape allocation) {

        /**
         * Renders the view.
         *
         * @param g the graphics context
         * @param allocation the region to render into
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public float getAlignment(int axis) {

        /**
         * Determines the desired alignment for this view along an axis.
         *
         * @param axis may be either X_AXIS or Y_AXIS
         * @return the desired alignment, where 0.0 indicates the origin
         *     and 1.0 the full span away from the origin
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public void preferenceChanged(View child, boolean width, boolean height) {

        /**
         * Specifies that a preference has changed.
         * Child views can call this on the parent to indicate that
         * the preference has changed.  The root view routes this to
         * invalidate on the hosting component.
         * <p>
         * This can be called on a different thread from the
         * event dispatching thread and is basically unsafe to
         * propagate into the component.  To make this safe,
         * the operation is transferred over to the event dispatching
         * thread for completion.  It is a design goal that all view
         * methods be safe to call without concern for concurrency,
         * and this behavior helps make that true.
         *
         * @param child the child view
         * @param width true if the width preference has changed
         * @param height true if the height preference has changed
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public float getMaximumSpan(int axis) {

        /**
         * Determines the maximum span for this view along an axis.
         *
         * @param axis may be either X_AXIS or Y_AXIS
         * @return the span the view would like to be rendered into.
         *         Typically the view is told to render into the span
         *         that is returned, although there is no guarantee.
         *         The parent may choose to resize or break the view.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public float getMinimumSpan(int axis) {

        /**
         * Determines the minimum span for this view along an axis.
         *
         * @param axis may be either X_AXIS or Y_AXIS
         * @return the span the view would like to be rendered into.
         *         Typically the view is told to render into the span
         *         that is returned, although there is no guarantee.
         *         The parent may choose to resize or break the view.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public float getPreferredSpan(int axis) {

        /**
         * Determines the preferred span for this view along an axis.
         *
         * @param axis may be either X_AXIS or Y_AXIS
         * @return the span the view would like to be rendered into.
         *         Typically the view is told to render into the span
         *         that is returned, although there is no guarantee.
         *         The parent may choose to resize or break the view.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
        public AttributeSet getAttributes() {

        /**
         * Fetches the attributes to use when rendering.  At the root
         * level there are no attributes.  If an attribute is resolved
         * up the view hierarchy this is the end of the line.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    class RootView extends View {

    /**
     * Root view that acts as a gateway between the component
     * and the View hierarchy.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public View create(Element elem, int p0, int p1) {

    /**
     * Creates a view for an element.
     * If a subclass wishes to directly implement the factory
     * producing the view(s), it should reimplement this
     * method.  By default it simply returns null indicating
     * it is unable to represent the part of the element.
     *
     * @param elem the element
     * @param p0 the starting offset &gt;= 0
     * @param p1 the ending offset &gt;= p0
     * @return the view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public View create(Element elem) {

    /**
     * Creates a view for an element.
     * If a subclass wishes to directly implement the factory
     * producing the view(s), it should reimplement this
     * method.  By default it simply returns null indicating
     * it is unable to represent the element.
     *
     * @param elem the element
     * @return the view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public String getToolTipText(JTextComponent t, Point pt) {

    /**
     * Returns the string to be used as the tooltip at the passed in location.
     * This forwards the method onto the root View.
     *
     * @see javax.swing.text.JTextComponent#getToolTipText
     * @see javax.swing.text.View#getToolTipText
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public View getRootView(JTextComponent tc) {

    /**
     * Fetches a View with the allocation of the associated
     * text component (i.e. the root of the hierarchy) that
     * can be traversed to determine how the model is being
     * represented spatially.
     * <p>
     * <font color=red><b>NOTE:</b>The View hierarchy can
     * be traversed from the root view, and other things
     * can be done as well.  Things done in this way cannot
     * be protected like simple method calls through the TextUI.
     * Therefore, proper operation in the presence of concurrency
     * must be arranged by any logic that calls this method!
     * </font>
     *
     * @param tc the text component for which this UI is installed
     * @return the view
     * @see TextUI#getRootView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public EditorKit getEditorKit(JTextComponent tc) {

    /**
     * Fetches the EditorKit for the UI.
     *
     * @param tc the text component for which this UI is installed
     * @return the editor capabilities
     * @see TextUI#getEditorKit
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public void damageRange(JTextComponent t, int p0, int p1,
                            Position.Bias p0Bias, Position.Bias p1Bias) {

    /**
     * Causes the portion of the view responsible for the
     * given part of the model to be repainted.
     *
     * @param p0 the beginning of the range &gt;= 0
     * @param p1 the end of the range &gt;= p0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public void damageRange(JTextComponent tc, int p0, int p1) {

    /**
     * Causes the portion of the view responsible for the
     * given part of the model to be repainted.  Does nothing if
     * the view is not currently painted.
     *
     * @param tc the text component for which this UI is installed
     * @param p0 the beginning of the range &gt;= 0
     * @param p1 the end of the range &gt;= p0
     * @see TextUI#damageRange
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public int getNextVisualPositionFrom(JTextComponent t, int pos,
                    Position.Bias b, int direction, Position.Bias[] biasRet)

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public int viewToModel(JTextComponent tc, Point pt,
                           Position.Bias[] biasReturn) {

    /**
     * Converts the given place in the view coordinate system
     * to the nearest representative location in the model.
     * The component must have a non-zero positive size for
     * this translation to be computed.
     *
     * @param tc the text component for which this UI is installed
     * @param pt the location in the view to translate.  This
     *  should be in the same coordinate system as the mouse events.
     * @return the offset from the start of the document &gt;= 0,
     *   -1 if the component doesn't yet have a positive size.
     * @see TextUI#viewToModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public int viewToModel(JTextComponent tc, Point pt) {

    /**
     * Converts the given place in the view coordinate system
     * to the nearest representative location in the model.
     * The component must have a non-zero positive size for
     * this translation to be computed.
     *
     * @param tc the text component for which this UI is installed
     * @param pt the location in the view to translate.  This
     *  should be in the same coordinate system as the mouse events.
     * @return the offset from the start of the document &gt;= 0,
     *   -1 if not painted
     * @see TextUI#viewToModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public Rectangle modelToView(JTextComponent tc, int pos, Position.Bias bias) throws BadLocationException {

    /**
     * Converts the given location in the model to a place in
     * the view coordinate system.
     * The component must have a non-zero positive size for
     * this translation to be computed.
     *
     * @param tc the text component for which this UI is installed
     * @param pos the local location in the model to translate &gt;= 0
     * @return the coordinates as a rectangle, null if the model is not painted
     * @exception BadLocationException  if the given position does not
     *   represent a valid location in the associated document
     * @see TextUI#modelToView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public Rectangle modelToView(JTextComponent tc, int pos) throws BadLocationException {

    /**
     * Converts the given location in the model to a place in
     * the view coordinate system.
     * The component must have a non-zero positive size for
     * this translation to be computed.
     *
     * @param tc the text component for which this UI is installed
     * @param pos the local location in the model to translate &gt;= 0
     * @return the coordinates as a rectangle, null if the model is not painted
     * @exception BadLocationException  if the given position does not
     *   represent a valid location in the associated document
     * @see TextUI#modelToView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected Rectangle getVisibleEditorRect() {

    /**
     * Gets the allocation to give the root View.  Due
     * to an unfortunate set of historical events this
     * method is inappropriately named.  The Rectangle
     * returned has nothing to do with visibility.
     * The component must have a non-zero positive size for
     * this translation to be computed.
     *
     * @return the bounding box for the root view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public Dimension getMaximumSize(JComponent c) {

    /**
     * Gets the maximum size for the editor component.
     *
     * @param c the editor component
     * @return the size
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public Dimension getMinimumSize(JComponent c) {

    /**
     * Gets the minimum size for the editor component.
     *
     * @param c the editor component
     * @return the size
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public Dimension getPreferredSize(JComponent c) {

    /**
     * Gets the preferred size for the editor component.  If the component
     * has been given a size prior to receiving this request, it will
     * set the size of the view hierarchy to reflect the size of the component
     * before requesting the preferred size of the view hierarchy.  This
     * allows formatted views to format to the current component size before
     * answering the request.  Other views don't care about currently formatted
     * size and give the same answer either way.
     *
     * @param c the editor component
     * @return the size
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public final void paint(Graphics g, JComponent c) {

    /**
     * Paints the interface.  This is routed to the
     * paintSafely method under the guarantee that
     * the model won't change from the view of this thread
     * while it's rendering (if the associated model is
     * derived from AbstractDocument).  This enables the
     * model to potentially be updated asynchronously.
     *
     * @param g the graphics context
     * @param c the editor component
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public void update(Graphics g, JComponent c) {

    /**
     * Superclass paints background in an uncontrollable way
     * (i.e. one might want an image tiled into the background).
     * To prevent this from happening twice, this method is
     * reimplemented to simply paint.
     * <p>
     * <em>NOTE:</em> NOTE: Superclass is also not thread-safe in its
     * rendering of the background, although that is not an issue with the
     * default rendering.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public void uninstallUI(JComponent c) {

    /**
     * Deinstalls the UI for a component.  This removes the listeners,
     * uninstalls the highlighter, removes views, and nulls out the keymap.
     *
     * @param c the editor component
     * @see ComponentUI#uninstallUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public void installUI(JComponent c) {

    /**
     * Installs the UI for a component.  This does the following
     * things.
     * <ol>
     * <li>
     * Sets the associated component to opaque if the opaque property
     * has not already been set by the client program. This will cause the
     * component's background color to be painted.
     * <li>
     * Installs the default caret and highlighter into the
     * associated component. These properties are only set if their
     * current value is either {@code null} or an instance of
     * {@link UIResource}.
     * <li>
     * Attaches to the editor and model.  If there is no
     * model, a default one is created.
     * <li>
     * Creates the view factory and the view hierarchy used
     * to represent the model.
     * </ol>
     *
     * @param c the editor component
     * @see ComponentUI#installUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected void paintSafely(Graphics g) {

    /**
     * Paints the interface safely with a guarantee that
     * the model won't change from the view of this thread.
     * This does the following things, rendering from
     * back to front.
     * <ol>
     * <li>
     * If the component is marked as opaque, the background
     * is painted in the current background color of the
     * component.
     * <li>
     * The highlights (if any) are painted.
     * <li>
     * The view hierarchy is painted.
     * <li>
     * The caret is painted.
     * </ol>
     *
     * @param g the graphics context
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected final void setView(View v) {

    /**
     * Sets the current root of the view hierarchy and calls invalidate().
     * If there were any child components, they will be removed (i.e.
     * there are assumed to have come from components embedded in views).
     *
     * @param v the root view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected void modelChanged() {

    /**
     * Flags model changes.
     * This is called whenever the model has changed.
     * It is implemented to rebuild the view hierarchy
     * to represent the default root element of the
     * associated model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected final JTextComponent getComponent() {

    /**
     * Fetches the text component associated with this
     * UI implementation.  This will be null until
     * the ui has been installed.
     *
     * @return the editor component
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected void paintBackground(Graphics g) {

    /**
     * Paints a background for the view.  This will only be
     * called if isOpaque() on the associated component is
     * true.  The default is to paint the background color
     * of the component.
     *
     * @param g the graphics context
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    ActionMap createActionMap() {

    /**
     * Create a default action map.  This is basically the
     * set of actions found exported by the component.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    ActionMap getActionMap() {

    /**
     * Fetch an action map to use.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    TransferHandler getTransferHandler() {

    /**
     * Returns the <code>TransferHandler</code> that will be installed if
     * their isn't one installed on the <code>JTextComponent</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    private void updateCursor() {

    /**
     * As needed updates cursor for the target editor.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    void updateFocusTraversalKeys() {

    /**
     * Invoked when editable property is changed.
     *
     * removing 'TAB' and 'SHIFT-TAB' from traversalKeysSet in case
     * editor is editable
     * adding 'TAB' and 'SHIFT-TAB' to traversalKeysSet in case
     * editor is non editable
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    void updateFocusAcceleratorBinding(boolean changed) {

    /**
     * Invoked when the focus accelerator changes, this will update the
     * key bindings as necessary.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    InputMap getInputMap() {

    /**
     * Get the InputMap to use for the UI.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected void uninstallListeners() {

    /**
     * Uninstalls listeners for the UI.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected void installListeners() {

    /**
     * Installs listeners for the UI.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected void uninstallDefaults()

    /**
     * Sets the component properties that have not been explicitly overridden
     * to {@code null}.  A property is considered overridden if its current
     * value is not a {@code UIResource}.
     *
     * @see #installDefaults
     * @see #uninstallUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected void installDefaults()

    /**
     * Initializes component properties, such as font, foreground,
     * background, caret color, selection color, selected text color,
     * disabled text color, and border color.  The font, foreground, and
     * background properties are only set if their current value is either null
     * or a UIResource, other properties are set if the current
     * value is null.
     *
     * @see #uninstallDefaults
     * @see #installUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected abstract String getPropertyPrefix();

    /**
     * Gets the name used as a key to look up properties through the
     * UIManager.  This is used as a prefix to all the standard
     * text properties.
     *
     * @return the name
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    private void updateBackground(JTextComponent c) {

    /**
     * Updates the background of the text component based on whether the
     * text component is editable and/or enabled.
     *
     * @param c the JTextComponent that needs its background color updated
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected void propertyChange(PropertyChangeEvent evt) {

    /**
     * This method gets called when a bound property is changed
     * on the associated JTextComponent.  This is a hook
     * which UI implementations may change to reflect how the
     * UI displays bound properties of JTextComponent subclasses.
     * This is implemented to do nothing (i.e. the response to
     * properties in JTextComponent itself are handled prior
     * to calling this method).
     *
     * This implementation updates the background of the text
     * component if the editable and/or enabled state changes.
     *
     * @param evt the property change event
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected Keymap createKeymap() {

    /**
     * Creates the keymap to use for the text component, and installs
     * any necessary bindings into it.  By default, the keymap is
     * shared between all instances of this type of TextUI. The
     * keymap has the name defined by the getKeymapName method.  If the
     * keymap is not found, then DEFAULT_KEYMAP from JTextComponent is used.
     * <p>
     * The set of bindings used to create the keymap is fetched
     * from the UIManager using a key formed by combining the
     * {@link #getPropertyPrefix} method
     * and the string <code>.keyBindings</code>.  The type is expected
     * to be <code>JTextComponent.KeyBinding[]</code>.
     *
     * @return the keymap
     * @see #getKeymapName
     * @see javax.swing.text.JTextComponent
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected String getKeymapName() {

    /**
     * Fetches the name of the keymap that will be installed/used
     * by default for this UI. This is implemented to create a
     * name based upon the classname.  The name is the the name
     * of the class with the package prefix removed.
     *
     * @return the name
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected Highlighter createHighlighter() {

    /**
     * Creates the object to use for adding highlights.  By default
     * an instance of BasicHighlighter is created.  This method
     * can be redefined to provide something else that implements
     * the Highlighter interface or a subclass of DefaultHighlighter.
     *
     * @return the highlighter
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    protected Caret createCaret() {

    /**
     * Creates the object to use for a caret.  By default an
     * instance of BasicCaret is created.  This method
     * can be redefined to provide something else that implements
     * the InputPosition interface or a subclass of JCaret.
     *
     * @return the caret object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
    public BasicTextUI() {

    /**
     * Creates a new UI.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextUI.java
public abstract class BasicTextUI extends TextUI implements ViewFactory {

/**
 * <p>
 * Basis of a text components look-and-feel.  This provides the
 * basic editor view and controller services that may be useful
 * when creating a look-and-feel for an extension of
 * <code>JTextComponent</code>.
 * <p>
 * Most state is held in the associated <code>JTextComponent</code>
 * as bound properties, and the UI installs default values for the
 * various properties.  This default will install something for
 * all of the properties.  Typically, a LAF implementation will
 * do more however.  At a minimum, a LAF would generally install
 * key bindings.
 * <p>
 * This class also provides some concurrency support if the
 * <code>Document</code> associated with the JTextComponent is a subclass of
 * <code>AbstractDocument</code>.  Access to the View (or View hierarchy) is
 * serialized between any thread mutating the model and the Swing
 * event thread (which is expected to render, do model/view coordinate
 * translation, etc).  <em>Any access to the root view should first
 * acquire a read-lock on the AbstractDocument and release that lock
 * in a finally block.</em>
 * <p>
 * An important method to define is the {@link #getPropertyPrefix} method
 * which is used as the basis of the keys used to fetch defaults
 * from the UIManager.  The string should reflect the type of
 * TextUI (eg. TextField, TextArea, etc) without the particular
 * LAF part of the name (eg Metal, Motif, etc).
 * <p>
 * To build a view of the model, one of the following strategies
 * can be employed.
 * <ol>
 * <li>
 * One strategy is to simply redefine the
 * ViewFactory interface in the UI.  By default, this UI itself acts
 * as the factory for View implementations.  This is useful
 * for simple factories.  To do this reimplement the
 * {@link #create} method.
 * <li>
 * A common strategy for creating more complex types of documents
 * is to have the EditorKit implementation return a factory.  Since
 * the EditorKit ties all of the pieces necessary to maintain a type
 * of document, the factory is typically an important part of that
 * and should be produced by the EditorKit implementation.
 * </ol>
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author Timothy Prinzing
 * @author Shannon Hickey (drag and drop)
 */
