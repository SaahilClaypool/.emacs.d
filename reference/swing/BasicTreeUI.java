_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void editingCanceled(ChangeEvent e) {

        /** Messaged when editing has been canceled in the tree. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void mouseMoved(MouseEvent e) {

        /**
         * Invoked when the mouse button has been moved on a component
         * (with no buttons no down).
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void mousePressed(MouseEvent e) {

        /**
         * Invoked when a mouse button has been pressed on a component.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        private boolean isNavigationKey(KeyEvent event) {

        /**
         * Returns whether or not the supplied key event maps to a key that is used for
         * navigation.  This is used for optimizing key input by only passing non-
         * navigation keys to the first letter navigation mechanism.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void keyPressed(KeyEvent e) {

        /**
         * Invoked when a key has been pressed.
         *
         * Checks to see if the key event is a navigation key to prevent
         * dispatching these keys for the first letter navigation.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void keyTyped(KeyEvent e) {

        /**
         * Invoked when a key has been typed.
         *
         * Moves the keyboard focus to the first element whose prefix matches the
         * sequence of alphanumeric keys pressed by the user with delay less
         * than value of <code>timeFactor</code> property (or 1000 milliseconds
         * if it is not defined). Subsequent same key presses move the keyboard
         * focus to the next object that starts with the same letter until another
         * key is pressed, then it is treated as the prefix with appropriate number
         * of the same letters followed by first typed another letter.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        TreePath[] getDisplayOrderPaths(TreePath[] paths) {

        /**
         * Selection paths are in selection order.  The conversion to
         * HTML requires display order.  This method resorts the paths
         * to be in the display order.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        protected Transferable createTransferable(JComponent c) {

        /**
         * Create a Transferable to use as the source for a data transfer.
         *
         * @param c  The component holding the data to be transfered.  This
         *  argument is provided to enable sharing of TransferHandlers by
         *  multiple components.
         * @return  The representation of the data to be transfered.
         *
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        protected Component        destination;

        /** Destination that receives all events. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        protected Component        source;

        /** Source that events are coming from. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class MouseInputHandler extends Object implements

    /**
      * MouseInputHandler handles passing all mouse events,
      * including mouse motion events, until the mouse is released to
      * the destination it is constructed with. It is assumed all the
      * events are currently target at source.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class TreeCancelEditingAction extends AbstractAction {

    /**
     * ActionListener that invokes cancelEditing when action performed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class TreeToggleAction extends AbstractAction {

    /**
      * For the first selected row expandedness will be toggled.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        private boolean          addToSelection;

        /** Set to true if append to selection. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class TreeHomeAction extends AbstractAction {

    /**
      * TreeHomeAction is used to handle end/home actions.
      * Scrolls either the first or last cell to be visible based on
      * direction.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        private boolean       addToSelection;

        /** If true the new item is added to the selection, if false the
         * selection is reset. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        protected int         direction;

        /** Specifies the direction to adjust the selection by. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class TreeIncrementAction extends AbstractAction  {

    /** TreeIncrementAction is used to handle up/down actions.  Selection
      * is moved up or down based on direction.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        private boolean       addToSelection;

        /** True indicates should set selection from anchor path. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        protected int         direction;

        /** Specifies the direction to adjust the selection by. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class TreePageAction extends AbstractAction {

    /** TreePageAction handles page up and page down events.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        private boolean changeSelection;

        /** True if the selection is reset, false means only the lead path
         * changes. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        protected int direction;

        /** Determines direction to traverse, 1 means expand, -1 means
          * collapse. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class TreeTraverseAction extends AbstractAction {

    /**
     * <code>TreeTraverseAction</code> is the action used for left/right keys.
     * Will toggle the expandedness of a node, as well as potentially
     * incrementing the selection.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class SelectionModelPropertyChangeHandler implements

    /**
     * Listener on the TreeSelectionModel, resets the row selection if
     * any of the properties of the model change.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class PropertyChangeHandler implements

    /**
     * PropertyChangeListener for the tree. Updates the appropriate
     * variable, or TreeState, based on what changes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void mouseMoved(MouseEvent e) {

        /**
         * Invoked when the mouse button has been moved on a component
         * (with no buttons no down).
         * @since 1.4
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void mousePressed(MouseEvent e) {

        /**
         * Invoked when a mouse button has been pressed on a component.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class MouseHandler extends MouseAdapter implements MouseMotionListener

    /**
     * TreeMouseListener is responsible for updating the selection
     * based on mouse events.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        protected int getRowX(int row, int depth) {

        /**
         * @return amount to indent the given row.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public Rectangle getNodeDimensions(Object value, int row,
                                           int depth, boolean expanded,
                                           Rectangle size) {

        /**
         * Responsible for getting the size of a particular node.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    // This returns locations that don't include any Insets.

    /**
     * Class responsible for getting size of node, method is forwarded
     * to BasicTreeUI method. X location does not include insets, that is
     * handled in getPathBounds.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void focusLost(FocusEvent e) {

        /**
         * Invoked when focus is activated on the tree we're in, redraws the
         * lead row.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void focusGained(FocusEvent e) {

        /**
         * Invoked when focus is activated on the tree we're in, redraws the
         * lead row.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class FocusHandler implements FocusListener {

    /**
     * Repaints the lead selection row when focus is lost/gained.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void keyTyped(KeyEvent e) {

        /**
         * Invoked when a key has been typed.
         *
         * Moves the keyboard focus to the first element
         * whose first letter matches the alphanumeric key
         * pressed by the user. Subsequent same key presses
         * move the keyboard focus to the next object that
         * starts with the same letter.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        protected boolean            isKeyDown;

        /** Set to true while keyPressed is active. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        protected Action              repeatKeyAction;

        /** Key code that is being generated for. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class KeyHandler extends KeyAdapter {

    /**
     * This is used to get multiple key down events to appropriately generate
     * events.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void editingCanceled(ChangeEvent e) {

        /** Messaged when editing has been canceled in the tree. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void editingStopped(ChangeEvent e) {

        /** Messaged when editing has stopped in the tree. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class CellEditorHandler implements CellEditorListener {

    /**
     * Listener responsible for getting cell editing events and updating
     * the tree accordingly.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void valueChanged(TreeSelectionEvent event) {

        /**
         * Messaged when the selection changes in the tree we're displaying
         * for.  Stops editing, messages super and displays the changed paths.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class TreeSelectionHandler implements TreeSelectionListener {

    /**
     * Listens for changes in the selection model and updates the display
     * accordingly.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class TreeModelHandler implements TreeModelListener {

    /**
     * Forwards all TreeModel events to the TreeState.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void actionPerformed(ActionEvent ae) {

        /**
         * Public as a result of Timer. If the scrollBar is null, or
         * not adjusting, this stops the timer and updates the sizing.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        protected JScrollPane getScrollPane() {

        /**
         * Returns the JScrollPane housing the JTree, or null if one isn't
         * found.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        protected void startTimer() {

        /**
         * Creates, if necessary, and starts a Timer to check if need to
         * resize the bounds.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        protected JScrollBar           scrollBar;

        /** ScrollBar that is being adjusted. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        protected Timer                timer;

        /** Timer used when inside a scrollpane and the scrollbar is
         * adjusting. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class ComponentHandler extends ComponentAdapter implements

    /**
     * Updates the preferred size when scrolling (if necessary).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void treeCollapsed(TreeExpansionEvent event) {

        /**
         * Called whenever an item in the tree has been collapsed.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
        public void treeExpanded(TreeExpansionEvent event) {

        /**
         * Called whenever an item in the tree has been expanded.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public class TreeExpansionHandler implements TreeExpansionListener {

    /**
     * Updates the TreeState in response to nodes expanding/collapsing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private void repaintPath(TreePath path) {

    /**
     * Invokes <code>repaint</code> on the JTree for the passed in TreePath,
     * <code>path</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private void extendSelection(TreePath newLead) {

    /**
     * Extends the selection from the anchor to make <code>newLead</code>
     * the lead of the selection. This does not scroll.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected int getLeadSelectionRow() {

    /**
     * Returns the lead row of the selection.
     *
     * @return selection lead row
     * @since 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void updateLeadSelectionRow() {

    /**
     * Updates the lead row of the selection.
     * @since 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean isLeaf(int row) {

    /**
     * @return true if the node at <code>row</code> is a leaf.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void selectPathForEvent(TreePath path, MouseEvent event) {

    /**
     * Messaged to update the selection based on a MouseEvent over a
     * particular row. If the event is a toggle selection event, the
     * row is either selected, or deselected. If the event identifies
     * a multi selection event, the selection is updated from the
     * anchor point. Otherwise the row is selected, and if the event
     * specified a toggle event the row is expanded/collapsed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean isToggleEvent(MouseEvent event) {

    /**
     * Returning true indicates the row under the mouse should be toggled
     * based on the event. This is invoked after checkForClickInExpandControl,
     * implying the location is not in the expand (toggle) control
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean isMultiSelectEvent(MouseEvent event) {

    /**
     * Returning true signifies a mouse event on the node should select
     * from the anchor point.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean isToggleSelectionEvent(MouseEvent event) {

    /**
     * Returning true signifies a mouse event on the node should toggle
     * the selection of only the row under mouse.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void toggleExpandState(TreePath path) {

    /**
     * Expands path if it is not expanded, or collapses row if it is expanded.
     * If expanding a path and JTree scrolls on expand, ensureRowsAreVisible
     * is invoked to scroll as many of the children to visible as possible
     * (tries to scroll to last visible descendant of path).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void handleExpandControlClick(TreePath path, int mouseX,
                                            int mouseY) {

    /**
     * Messaged when the user clicks the particular row, this invokes
     * toggleExpandState.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean isLocationInExpandControl(TreePath path,
                                                int mouseX, int mouseY) {

    /**
     * Returns true if <code>mouseX</code> and <code>mouseY</code> fall
     * in the area of row that is used to expand/collapse the node and
     * the node at <code>row</code> does not represent a leaf.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void checkForClickInExpandControl(TreePath path,
                                                int mouseX, int mouseY) {

    /**
     * If the <code>mouseX</code> and <code>mouseY</code> are in the
     * expand/collapse region of the <code>row</code>, this will toggle
     * the row.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean startEditing(TreePath path, MouseEvent event) {

    /**
      * Will start editing for node if there is a cellEditor and
      * shouldSelectCell returns true.<p>
      * This assumes that path is valid and visible.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void completeEditing(boolean messageStop,
                                   boolean messageCancel,
                                   boolean messageTree) {

    /**
      * Stops the editing session.  If messageStop is true the editor
      * is messaged with stopEditing, if messageCancel is true the
      * editor is messaged with cancelEditing. If messageTree is true
      * the treeModel is messaged with valueForPathChanged.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void completeEditing() {

    /**
     * Messages to stop the editing session. If the UI the receiver
     * is providing the look and feel for returns true from
     * <code>getInvokesStopCellEditing</code>, stopCellEditing will
     * invoked on the current editor. Then completeEditing will
     * be messaged with false, true, false to cancel any lingering
     * editing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public Dimension getMaximumSize(JComponent c) {

    /**
      * Returns the maximum size for this component, which will be the
      * preferred size if the instance is currently in a JTree, or 0, 0.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public Dimension getMinimumSize(JComponent c) {

    /**
      * Returns the minimum size for this component.  Which will be
      * the min preferred size or 0, 0.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public Dimension getPreferredSize(JComponent c,
                                      boolean checkConsistency) {

    /** Returns the preferred size to represent the tree in
      * <I>c</I>.  If <I>checkConsistency</I> is true
      * <b>checkConsistency</b> is messaged first.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public Dimension getPreferredSize(JComponent c) {

    /** Returns the preferred size to properly display the tree,
      * this is a cover method for getPreferredSize(c, true).
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public Dimension getPreferredMinSize() {

    /** Returns the minimum preferred size.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public void setPreferredMinSize(Dimension newSize) {

    /** Sets the preferred minimum size.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void ensureRowsAreVisible(int beginRow, int endRow) {

    /**
      * Ensures that the rows identified by beginRow through endRow are
      * visible.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void pathWasCollapsed(TreePath path) {

    /**
      * Messaged from the VisibleTreeNode after it has collapsed.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void pathWasExpanded(TreePath path) {

    /**
      * Messaged from the VisibleTreeNode after it has been expanded.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void updateCachedPreferredSize() {

    /**
     * Updates the <code>preferredSize</code> instance variable,
     * which is returned from <code>getPreferredSize()</code>.<p>
     * For left to right orientations, the size is determined from the
     * current AbstractLayoutCache. For RTL orientations, the preferred size
     * becomes the width minus the minimum x position.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void updateSize() {

    /**
     * Marks the cached size as being invalid, and messages the
     * tree with <code>treeDidChange</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void configureLayoutCache() {

    /**
     * Resets the TreeState instance based on the tree we're providing the
     * look and feel for.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void updateRenderer() {

    /**
      * Messaged from the tree we're in when the renderer has changed.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void updateCellEditor() {

    /**
      * Updates the cellEditor based on the editability of the JTree that
      * we're contained in.  If the tree is editable but doesn't have a
      * cellEditor, a basic one will be used.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void updateDepthOffset() {

    /**
     * Updates how much each depth should be offset by.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected TreePath getLastChildPath(TreePath parent) {

    /**
     * Returns a path to the last child of <code>parent</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void updateExpandedDescendants(TreePath path) {

    /**
     * Updates the expanded state of all the descendants of <code>path</code>
     * by getting the expanded descendants from the tree and forwarding
     * to the tree state.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void updateLayoutCacheExpandedNodes() {

    /**
     * Makes all the nodes that are expanded in JTree expanded in LayoutCache.
     * This invokes updateExpandedDescendants with the root path.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected int getRowX(int row, int depth) {

    /**
     * Returns the location, along the x-axis, to render a particular row
     * at. The return value does not include any Insets specified on the JTree.
     * This does not check for the validity of the row or depth, it is assumed
     * to be correct and will not throw an Exception if the row or depth
     * doesn't match that of the tree.
     *
     * @param row Row to return x location for
     * @param depth Depth of the row
     * @return amount to indent the given row.
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected int getHorizontalLegBuffer() {

    /**
     * The horizontal element of legs between nodes starts at the
     * right of the left-hand side of the child node by default.  This
     * method makes the leg end before that.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected int getVerticalLegBuffer() {

    /**
     * The vertical element of legs between nodes starts at the bottom of the
     * parent node by default.  This method makes the leg start below that.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void paintHorizontalLine(Graphics g, JComponent c, int y,
                                      int left, int right) {

    /**
     * Paints a horizontal line.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void paintVerticalLine(Graphics g, JComponent c, int x, int top,
                                    int bottom) {

    /**
     * Paints a vertical line.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean shouldPaintExpandControl(TreePath path, int row,
                                               boolean isExpanded,
                                               boolean hasBeenExpanded,
                                               boolean isLeaf) {

    /**
     * Returns true if the expand (toggle) control should be drawn for
     * the specified row.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void paintRow(Graphics g, Rectangle clipBounds,
                            Insets insets, Rectangle bounds, TreePath path,
                            int row, boolean isExpanded,
                            boolean hasBeenExpanded, boolean isLeaf) {

    /**
     * Paints the renderer part of a row. The receiver should
     * NOT modify <code>clipBounds</code>, or <code>insets</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void paintExpandControl(Graphics g,
                                      Rectangle clipBounds, Insets insets,
                                      Rectangle bounds, TreePath path,
                                      int row, boolean isExpanded,
                                      boolean hasBeenExpanded,
                                      boolean isLeaf) {

    /**
     * Paints the expand (toggle) part of a row. The receiver should
     * NOT modify <code>clipBounds</code>, or <code>insets</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void paintVerticalPartOfLeg(Graphics g, Rectangle clipBounds,
                                          Insets insets, TreePath path) {

    /**
     * Paints the vertical part of the leg. The receiver should
     * NOT modify <code>clipBounds</code>, <code>insets</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void paintHorizontalPartOfLeg(Graphics g, Rectangle clipBounds,
                                            Insets insets, Rectangle bounds,
                                            TreePath path, int row,
                                            boolean isExpanded,
                                            boolean hasBeenExpanded, boolean
                                            isLeaf) {

    /**
     * Paints the horizontal part of the leg. The receiver should
     * NOT modify <code>clipBounds</code>, or <code>insets</code>.<p>
     * NOTE: <code>parentRow</code> can be -1 if the root is not visible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected Rectangle getDropLineRect(JTree.DropLocation loc) {

    /**
     * Returns a unbounding box for the drop line.
     *
     * @param loc a {@code DropLocation}
     * @return bounding box for the drop line
     * @since 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void paintDropLine(Graphics g) {

    /**
     * Paints the drop line.
     *
     * @param g {@code Graphics} object to draw on
     * @since 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean isDropLine(JTree.DropLocation loc) {

    /**
     * Tells if a {@code DropLocation} should be indicated by a line between
     * nodes. This is meant for {@code javax.swing.DropMode.INSERT} and
     * {@code javax.swing.DropMode.ON_OR_INSERT} drop modes.
     *
     * @param loc a {@code DropLocation}
     * @return {@code true} if the drop location should be shown as a line
     * @since 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public Component.BaselineResizeBehavior getBaselineResizeBehavior(
            JComponent c) {

    /**
     * Returns an enum indicating how the baseline of the component
     * changes as the size changes.
     *
     * @throws NullPointerException {@inheritDoc}
     * @see javax.swing.JComponent#getBaseline(int, int)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public int getBaseline(JComponent c, int width, int height) {

    /**
     * Returns the baseline.
     *
     * @throws NullPointerException {@inheritDoc}
     * @throws IllegalArgumentException {@inheritDoc}
     * @see javax.swing.JComponent#getBaseline(int, int)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private void redoTheLayout() {

    /**
     * Recomputes the right margin, and invalidates any tree states
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void uninstallComponents() {

    /**
     * Uninstalls the renderer pane.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected TreeModelListener createTreeModelListener() {

    /**
     * Returns a listener that can update the tree when the model changes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected TreeCellRenderer createDefaultCellRenderer() {

    /**
      * Returns the default cell renderer that is used to do the
      * stamping of each node.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected TreeCellEditor createDefaultCellEditor() {

    /**
      * Creates a default cell editor.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected CellRendererPane createCellRendererPane() {

    /**
     * Returns the renderer pane that renderer components are placed in.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected AbstractLayoutCache createLayoutCache() {

    /**
     * Creates the object responsible for managing what is expanded, as
     * well as the size of nodes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected TreeExpansionListener createTreeExpansionListener() {

    /**
     * Creates and returns the object responsible for updating the treestate
     * when nodes expanded state changes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected ComponentListener createComponentListener() {

    /**
     * Creates and returns a new ComponentHandler. This is used for
     * the large model to mark the validCachedPreferredSize as invalid
     * when the component moves.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected CellEditorListener createCellEditorListener() {

    /**
     * Creates a listener to handle events from the current editor.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected TreeSelectionListener createTreeSelectionListener() {

    /**
     * Creates the listener that updates the display based on selection change
     * methods.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected PropertyChangeListener createSelectionModelPropertyChangeListener() {

    /**
     * Creates the listener responsible for getting property change
     * events from the selection model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected KeyListener createKeyListener() {

    /**
     * Creates the listener reponsible for getting key events from
     * the tree.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected FocusListener createFocusListener() {

    /**
     * Creates a listener that is responsible for updating the display
     * when focus is lost/gained.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected MouseListener createMouseListener() {

    /**
     * Creates the listener responsible for updating the selection based on
     * mouse events.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected PropertyChangeListener createPropertyChangeListener() {

    /**
     * Creates a listener that is responsible that updates the UI based on
     * how the tree changes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected AbstractLayoutCache.NodeDimensions createNodeDimensions() {

    /**
     * Creates an instance of NodeDimensions that is able to determine
     * the size of a given node in the tree.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void installComponents() {

    /**
     * Intalls the subcomponents of the tree, which is the renderer pane.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void completeUIInstall() {

    /**
     * Invoked from installUI after all the defaults/listeners have been
     * installed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void prepareForUIInstall() {

    /**
     * Invoked after the <code>tree</code> instance variable has been
     * set, but before any defaults/listeners have been installed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public TreePath getEditingPath(JTree tree) {

    /**
     * Returns the path to the element that is being edited.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public void startEditingAtPath(JTree tree, TreePath path) {

    /**
      * Selects the last item in path and tries to edit it.  Editing will
      * fail if the CellEditor won't allow it for the selected item.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public void cancelEditing(JTree tree) {

    /**
      * Cancels the current editing session.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public boolean stopEditing(JTree tree) {

    /**
      * Stops the current editing session.  This has no effect if the
      * tree isn't being edited.  Returns true if the editor allows the
      * editing session to stop.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public boolean isEditing(JTree tree) {

    /**
      * Returns true if the tree is being edited.  The item that is being
      * edited can be returned by getEditingPath().
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public TreePath getClosestPathForLocation(JTree tree, int x, int y) {

    /**
      * Returns the path to the node that is closest to x,y.  If
      * there is nothing currently visible this will return null, otherwise
      * it'll always return a valid path.  If you need to test if the
      * returned object is exactly at x, y you should get the bounds for
      * the returned path and test x, y against that.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public int getRowCount(JTree tree) {

    /**
      * Returns the number of rows that are being displayed.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public int getRowForPath(JTree tree, TreePath path) {

    /**
      * Returns the row that the last item identified in path is visible
      * at.  Will return -1 if any of the elements in path are not
      * currently visible.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public TreePath getPathForRow(JTree tree, int row) {

    /**
      * Returns the path for passed in row.  If row is not visible
      * null is returned.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    public Rectangle getPathBounds(JTree tree, TreePath path) {

    /**
      * Returns the Rectangle enclosing the label portion that the
      * last item in path will be drawn into.  Will return null if
      * any component in path is currently valid.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void setSelectionModel(TreeSelectionModel newLSM) {

    /**
     * Resets the selection model. The appropriate listener are installed
     * on the model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void setEditable(boolean newValue) {

    /**
     * Configures the receiver to allow, or not allow, editing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void setCellEditor(TreeCellEditor editor) {

    /**
     * Sets the cell editor.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void setShowsRootHandles(boolean newValue) {

    /**
     * Determines whether the node handles are to be displayed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void setRootVisible(boolean newValue) {

    /**
     * Sets the root to being visible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void setModel(TreeModel model) {

    /**
     * Sets the TreeModel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected TreeCellRenderer getCellRenderer() {

    /**
     * Return currentCellRenderer, which will either be the trees
     * renderer, or defaultCellRenderer, which ever wasn't null.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void setCellRenderer(TreeCellRenderer tcr) {

    /**
     * Sets the TreeCellRenderer to <code>tcr</code>. This invokes
     * <code>updateRenderer</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void setRowHeight(int rowHeight) {

    /**
     * Sets the row height, this is forwarded to the treeState.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected void setLargeModel(boolean largeModel) {

    /**
     * Updates the componentListener, if necessary.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private MouseEvent releaseEvent;

    /**
     * A temporary variable for communication between startEditingOnRelease
     * and startEditing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private long timeFactor = 1000L;

    /**
     * The time factor to treate the series of typed alphanumeric key
     * as prefix for first letter navigation.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private boolean lineTypeDashed;

    /** UI property for painting dashed lines */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private boolean paintLines = true;

    /** UI property indicating whether to paint lines */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private TreeExpansionListener treeExpansionListener;

    /** Updates the treestate as the nodes expand. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private TreeModelListener treeModelListener;

    /** Is responsible for updating the display based on model events. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private TreeSelectionListener treeSelectionListener;

    /** Updates the display when the selection changes. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private CellEditorListener  cellEditorListener;

    /** Listens for CellEditor events. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private ComponentListener   componentListener;

    /** Used for large models, listens for moved/resized events and
     * updates the validCachedPreferredSize bit accordingly. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private boolean             leftToRight;

    /** Indicates the orientation. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private boolean             ignoreLAChange;

    /** If true, the property change event for LEAD_SELECTION_PATH_PROPERTY,
     * or ANCHOR_SELECTION_PATH_PROPERTY will not generate a repaint. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private int                 leadRow;

    /** Row correspondin to lead path. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean           editorHasDifferentSize;

    /** Set to true if the editor has a different size than the renderer. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected int               editingRow;

    /** Row that is being edited. Should only be referenced if
     * editingComponent is not null. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected TreePath          editingPath;

    /** Path that is being edited. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected Component         editingComponent;

    /** When editing, this will be the Component that is doing the actual
      * editing. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected int               depthOffset;

    /** How much the depth should be offset to properly calculate
     * x locations. This is based on whether or not the root is visible,
     * and if the root handles are visible. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected TreeSelectionModel treeSelectionModel;

    /** Model maintaining the selection. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected TreeModel         treeModel;

    /** Used to determine what to display. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected AbstractLayoutCache.NodeDimensions     nodeDimensions;

    /** Reponsible for telling the TreeState the size needed for a node. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean           largeModel;

    /** True if doing optimizations for a largeModel. Subclasses that
     * don't support this may wish to override createLayoutCache to not
     * return a FixedHeightLayoutCache instance. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected Hashtable<TreePath,Boolean> drawingCache;

    /** Used for minimizing the drawing of vertical lines. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    // WARNING: Be careful with the bounds held by treeState. They are

    /** Object responsible for handling sizing and expanded issues. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean           validCachedPreferredSize;

    /** Is the preferredSize valid? */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected Dimension         preferredSize;

    /** Size needed to completely display all the nodes. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected CellRendererPane  rendererPane;

    /** Used to paint the TreeCellRenderer. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean           stopEditingInCompleteEditing;

    /** Set to false when editing and shouldSelectCell() returns true meaning
      * the node should be selected before editing, used in completeEditing. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean           createdCellEditor;

    /** Set to true if editor that is currently in the tree was
     * created by this instance. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    transient protected TreeCellEditor     cellEditor;

    /** Editor for the tree. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected boolean           createdRenderer;

    /** Set to true if the renderer that is currently in the tree was
     * created by this instance. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    transient protected TreeCellRenderer   currentCellRenderer;

    /** Renderer that is being used to do the actual cell drawing. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected JTree             tree;

    /** Component that we're going to be drawing into. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected int               lastSelectedRow;

    /** Index of the row that was last selected. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected Dimension         preferredMinSize;

    /** Minimum preferred size. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected int               totalChildIndent;

    /** Total distance that will be indented.  The sum of leftChildIndent
      * and rightChildIndent. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected int               rightChildIndent;

    /** Distance to add to leftChildIndent to determine where cell
      * contents will be drawn. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    protected int               leftChildIndent;

    /** Distance between left margin and where vertical dashes will be
      * drawn. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
    private Color hashColor;

    /**
      * Color used to draw hash marks.  If <code>null</code> no hash marks
      * will be drawn.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTreeUI.java
public class BasicTreeUI extends TreeUI

/**
 * The basic L&amp;F for a hierarchical data structure.
 * <p>
 *
 * @author Scott Violet
 * @author Shannon Hickey (drag and drop)
 */
