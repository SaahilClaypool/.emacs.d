_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
        private boolean isNavigationKey(KeyEvent event) {

        /**
         * Returns whether or not the supplied key event maps to a key that is used for
         * navigation.  This is used for optimizing key input by only passing non-
         * navigation keys to the first letter navigation mechanism.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
        public void keyReleased(KeyEvent e) {

        /**
         * Invoked when a key has been released.
         * See the class description for {@link KeyEvent} for a definition of
         * a key released event.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
        public void keyPressed(KeyEvent e) {

        /**
         * Invoked when a key has been pressed.
         *
         * Checks to see if the key event is a navigation key to prevent
         * dispatching these keys for the first letter navigation.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
        private void adjustScrollPositionIfNecessary(JList list, int index,
                                                     int direction) {

        /**
         * When scroll down makes selected index the last completely visible
         * index. When scroll up makes selected index the first visible index.
         * Adjust visible rectangle respect to list's component orientation.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private static final int EXTEND_SELECTION = 2;

    /** Used by IncrementLeadSelectionAction. Indicates the action should
     * extend the selection from the anchor to the next index. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private static final int CHANGE_SELECTION = 1;

    /** Used by IncrementLeadSelectionAction. Indicates the action should
     * change the selection and lead. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private static final int CHANGE_LEAD = 0;

    /** Used by IncrementLeadSelectionAction. Indicates the action should
     * change the lead, and not select it. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected PropertyChangeListener createPropertyChangeListener() {

    /**
     * Creates an instance of PropertyChangeHandler that's added to
     * the JList by installUI().  Subclasses can override this method
     * to return a custom PropertyChangeListener, e.g.
     * <pre>
     * class MyListUI extends BasicListUI {
     *    protected PropertyChangeListener <b>createPropertyChangeListener</b>() {
     *        return new MyPropertyChangeListener();
     *    }
     *    public class MyPropertyChangeListener extends PropertyChangeHandler {
     *        public void propertyChange(PropertyChangeEvent e) {
     *            if (e.getPropertyName().equals("model")) {
     *                // do some extra work when the model changes
     *            }
     *            super.propertyChange(e);
     *        }
     *    }
     * }
     * </pre>
     *
     * @see PropertyChangeListener
     * @see #installUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    public class PropertyChangeHandler implements PropertyChangeListener

    /**
     * The PropertyChangeListener that's added to the JList at
     * installUI time.  When the value of a JList property that
     * affects layout changes, we set a bit in updateLayoutStateNeeded.
     * If the JLists model changes we additionally remove our listeners
     * from the old model.  Likewise for the JList selectionModel.
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
     * @see #maybeUpdateLayoutState
     * @see #createPropertyChangeListener
     * @see #installUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected ListDataListener createListDataListener() {

    /**
     * Creates an instance of ListDataListener that's added to
     * the JLists by model as needed.  Subclasses can override
     * this method to return a custom ListDataListener, e.g.
     * <pre>
     * class MyListUI extends BasicListUI {
     *    protected ListDataListener <b>createListDataListener</b>() {
     *        return new MyListDataListener();
     *    }
     *    public class MyListDataListener extends ListDataHandler {
     *        public void contentsChanged(ListDataEvent e) {
     *            // do some extra work when the models contents change
     *            super.contentsChange(e);
     *        }
     *    }
     * }
     * </pre>
     *
     * @see ListDataListener
     * @see JList#getModel
     * @see #installUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    public class ListDataHandler implements ListDataListener

    /**
     * The ListDataListener that's added to the JLists model at
     * installUI time, and whenever the JList.model property changes.
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
     * @see JList#getModel
     * @see #maybeUpdateLayoutState
     * @see #createListDataListener
     * @see #installUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected ListSelectionListener createListSelectionListener() {

    /**
     * Creates an instance of ListSelectionHandler that's added to
     * the JLists by selectionModel as needed.  Subclasses can override
     * this method to return a custom ListSelectionListener, e.g.
     * <pre>
     * class MyListUI extends BasicListUI {
     *    protected ListSelectionListener <b>createListSelectionListener</b>() {
     *        return new MySelectionListener();
     *    }
     *    public class MySelectionListener extends ListSelectionHandler {
     *        public void valueChanged(ListSelectionEvent e) {
     *            // do some extra work when the selection changes
     *            super.valueChange(e);
     *        }
     *    }
     * }
     * </pre>
     *
     * @see ListSelectionHandler
     * @see #installUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    public class ListSelectionHandler implements ListSelectionListener

    /**
     * The ListSelectionListener that's added to the JLists selection
     * model at installUI time, and whenever the JList.selectionModel property
     * changes.  When the selection changes we repaint the affected rows.
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
     * @see #createListSelectionListener
     * @see #getCellBounds
     * @see #installUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    public class FocusHandler implements FocusListener

    /**
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of {@code BasicListUI}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected MouseInputListener createMouseInputListener() {

    /**
     * Creates a delegate that implements MouseInputListener.
     * The delegate is added to the corresponding java.awt.Component listener
     * lists at installUI() time. Subclasses can override this method to return
     * a custom MouseInputListener, e.g.
     * <pre>
     * class MyListUI extends BasicListUI {
     *    protected MouseInputListener <b>createMouseInputListener</b>() {
     *        return new MyMouseInputHandler();
     *    }
     *    public class MyMouseInputHandler extends MouseInputHandler {
     *        public void mouseMoved(MouseEvent e) {
     *            // do some extra work when the mouse moves
     *            super.mouseMoved(e);
     *        }
     *    }
     * }
     * </pre>
     *
     * @see MouseInputHandler
     * @see #installUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    public class MouseInputHandler implements MouseInputListener

    /**
     * Mouse input, and focus handling for JList.  An instance of this
     * class is added to the appropriate java.awt.Component lists
     * at installUI() time.  Note keyboard input is handled with JComponent
     * KeyboardActions, see installKeyboardActions().
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
     * @see #createMouseInputListener
     * @see #installKeyboardActions
     * @see #installUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private void updateHorizontalLayoutState(int fixedCellWidth,
                                             int fixedCellHeight) {

    /**
     * Invoked when the list is layed out horizontally to determine how
     * many columns to create.
     * <p>
     * This updates the <code>rowsPerColumn, </code><code>columnCount</code>,
     * <code>preferredHeight</code> and potentially <code>cellHeight</code>
     * instance variables.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected void updateLayoutState()

    /**
     * Recompute the value of cellHeight or cellHeights based
     * and cellWidth, based on the current font and the current
     * values of fixedCellWidth, fixedCellHeight, and prototypeCellValue.
     *
     * @see #maybeUpdateLayoutState
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected void maybeUpdateLayoutState()

    /**
     * If updateLayoutStateNeeded is non zero, call updateLayoutState() and reset
     * updateLayoutStateNeeded.  This method should be called by methods
     * before doing any computation based on the geometry of the list.
     * For example it's the first call in paint() and getPreferredSize().
     *
     * @see #updateLayoutState
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int convertModelToColumn(int index) {

    /**
     * Returns the column that the model index <code>index</code> will be
     * displayed in.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int convertModelToRow(int index) {

    /**
     * Returns the row that the model index <code>index</code> will be
     * displayed in..
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int convertLocationToColumn(int x, int y) {

    /**
     * Returns the closest column to the passed in location.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int getModelIndex(int column, int row) {

    /**
     * Returns the model index for the specified display location.
     * If <code>column</code>x<code>row</code> is beyond the length of the
     * model, this will return the model size - 1.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int getRowCount(int column) {

    /**
     * Returns the number of rows in the given column.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int convertLocationToModel(int x, int y) {

    /**
     * Returns the closest location to the model index of the passed in
     * location.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int convertLocationToRowInColumn(int y, int column) {

    /**
     * Returns the closest row that starts at the specified y-location
     * in the passed in column.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int convertLocationToRow(int x, int y0, boolean closest) {

    /**
     * Returns the row at location x/y.
     *
     * @param closest If true and the location doesn't exactly match a
     *                particular location, this will return the closest row.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int getHeight(int column, int row) {

    /**
     * Returns the height of the cell at the passed in location.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected int convertRowToY(int row)

    /**
     * Return the JList relative Y coordinate of the origin of the specified
     * row or -1 if row isn't valid.
     *
     * @return The Y coordinate of the origin of row, or -1.
     * @see #getRowHeight
     * @see #updateLayoutState
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected int convertYToRow(int y0)

    /**
     * Convert the JList relative coordinate to the row that contains it,
     * based on the current layout.  If y0 doesn't fall within any row,
     * return -1.
     *
     * @return The row that contains y0, or -1.
     * @see #getRowHeight
     * @see #updateLayoutState
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected int getRowHeight(int row)

    /**
     * Returns the height of the specified row based on the current layout.
     *
     * @return The specified row height or -1 if row isn't valid.
     * @see #convertYToRow
     * @see #convertRowToY
     * @see #updateLayoutState
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private Rectangle getCellBounds(JList list, int index) {

    /**
     * Gets the bounds of the specified model index, returning the resulting
     * bounds, or null if <code>index</code> is not valid.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    public Rectangle getCellBounds(JList list, int index1, int index2) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    public Point indexToLocation(JList list, int index) {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    public int locationToIndex(JList list, Point location) {

    /**
     * {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    public static ComponentUI createUI(JComponent list) {

    /**
     * Returns a new instance of BasicListUI.  BasicListUI delegates are
     * allocated one per JList.
     *
     * @return A new ListUI implementation for the Windows look and feel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    public void uninstallUI(JComponent c)

    /**
     * Uninitializes <code>this.list</code> by calling <code>uninstallListeners()</code>,
     * <code>uninstallKeyboardActions()</code>, and <code>uninstallDefaults()</code>
     * in order.  Sets this.list to null.
     *
     * @see #uninstallListeners
     * @see #uninstallKeyboardActions
     * @see #uninstallDefaults
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    public void installUI(JComponent c)

    /**
     * Initializes <code>this.list</code> by calling <code>installDefaults()</code>,
     * <code>installListeners()</code>, and <code>installKeyboardActions()</code>
     * in order.
     *
     * @see #installDefaults
     * @see #installListeners
     * @see #installKeyboardActions
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected void uninstallDefaults()

    /**
     * Sets the list properties that have not been explicitly overridden to
     * {@code null}. A property is considered overridden if its current value
     * is not a {@code UIResource}.
     *
     * @see #installDefaults
     * @see #uninstallUI
     * @see CellRendererPane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected void installDefaults()

    /**
     * Initializes list properties such as font, foreground, and background,
     * and adds the CellRendererPane. The font, foreground, and background
     * properties are only set if their current value is either null
     * or a UIResource, other properties are set if the current
     * value is null.
     *
     * @see #uninstallDefaults
     * @see #installUI
     * @see CellRendererPane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected void uninstallListeners()

    /**
     * Removes the listeners from the JList, its model, and its
     * selectionModel.  All of the listener fields, are reset to
     * null here.  This method is called at uninstallUI() time,
     * it should be kept in sync with installListeners.
     *
     * @see #uninstallUI
     * @see #installListeners
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected void installListeners()

    /**
     * Creates and installs the listeners for the JList, its model, and its
     * selectionModel.  This method is called at installUI() time.
     *
     * @see #installUI
     * @see #uninstallListeners
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected void uninstallKeyboardActions() {

    /**
     * Unregisters keyboard actions installed from
     * <code>installKeyboardActions</code>.
     * This method is called at uninstallUI() time - subclassess should
     * ensure that all of the keyboard actions registered at installUI
     * time are removed here.
     *
     * @see #installUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected void installKeyboardActions() {

    /**
     * Registers the keyboard bindings on the <code>JList</code> that the
     * <code>BasicListUI</code> is associated with. This method is called at
     * installUI() time.
     *
     * @see #installUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected void selectNextIndex()

    /**
     * Selected the previous row and force it to be visible.
     *
     * @see JList#ensureIndexIsVisible
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected void selectPreviousIndex() {

    /**
     * Selected the previous row and force it to be visible.
     *
     * @see JList#ensureIndexIsVisible
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    public Dimension getPreferredSize(JComponent c) {

    /**
     * The preferredSize of the list depends upon the layout orientation.
     * <table summary="Describes the preferred size for each layout orientation">
     * <tr><th>Layout Orientation</th><th>Preferred Size</th></tr>
     * <tr>
     *   <td>JList.VERTICAL
     *   <td>The preferredSize of the list is total height of the rows
     *       and the maximum width of the cells.  If JList.fixedCellHeight
     *       is specified then the total height of the rows is just
     *       (cellVerticalMargins + fixedCellHeight) * model.getSize() where
     *       rowVerticalMargins is the space we allocate for drawing
     *       the yellow focus outline.  Similarly if fixedCellWidth is
     *       specified then we just use that.
     *   </td>
     * <tr>
     *   <td>JList.VERTICAL_WRAP
     *   <td>If the visible row count is greater than zero, the preferredHeight
     *       is the maximum cell height * visibleRowCount. If the visible row
     *       count is &lt;= 0, the preferred height is either the current height
     *       of the list, or the maximum cell height, whichever is
     *       bigger. The preferred width is than the maximum cell width *
     *       number of columns needed. Where the number of columns needs is
     *       list.height / max cell height. Max cell height is either the fixed
     *       cell height, or is determined by iterating through all the cells
     *       to find the maximum height from the ListCellRenderer.
     * <tr>
     *   <td>JList.HORIZONTAL_WRAP
     *   <td>If the visible row count is greater than zero, the preferredHeight
     *       is the maximum cell height * adjustedRowCount.  Where
     *       visibleRowCount is used to determine the number of columns.
     *       Because this lays out horizontally the number of rows is
     *       then determined from the column count.  For example, lets say
     *       you have a model with 10 items and the visible row count is 8.
     *       The number of columns needed to display this is 2, but you no
     *       longer need 8 rows to display this, you only need 5, thus
     *       the adjustedRowCount is 5.
     *       <p>If the visible row
     *       count is &lt;= 0, the preferred height is dictated by the
     *       number of columns, which will be as many as can fit in the width
     *       of the <code>JList</code> (width / max cell width), with at
     *       least one column.  The preferred height then becomes the
     *       model size / number of columns * maximum cell height.
     *       Max cell height is either the fixed
     *       cell height, or is determined by iterating through all the cells
     *       to find the maximum height from the ListCellRenderer.
     * </table>
     * The above specifies the raw preferred width and height. The resulting
     * preferred width is the above width + insets.left + insets.right and
     * the resulting preferred height is the above height + insets.top +
     * insets.bottom. Where the <code>Insets</code> are determined from
     * <code>list.getInsets()</code>.
     *
     * @param c The JList component.
     * @return The total size of the list.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    public void paint(Graphics g, JComponent c) {

    /**
     * Paint the rows that intersect the Graphics objects clipRect.  This
     * method calls paintCell as necessary.  Subclasses
     * may want to override these methods.
     *
     * @see #paintCell
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    protected void paintCell(
        Graphics g,
        int row,
        Rectangle rowBounds,
        ListCellRenderer cellRenderer,
        ListModel dataModel,
        ListSelectionModel selModel,
        int leadIndex)

    /**
     * Paint one List cell: compute the relevant state, get the "rubber stamp"
     * cell renderer component, and then use the CellRendererPane to paint it.
     * Subclasses may want to override this method rather than paint().
     *
     * @see #paint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private boolean isLeftToRight = true;

    /**
     * Local cache of JList's component orientation property
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private boolean isFileList = false;

    /**
     * Local cache of JList's client property "List.isFileList"
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private long timeFactor = 1000L;

    /**
     * The time factor to treate the series of typed alphanumeric key
     * as prefix for first letter navigation.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int rowsPerColumn;

    /**
     * Number of rows per column. This is only used if the row height is
     * fixed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int preferredHeight;

    /**
     * Preferred height to make the list, this is only used if the
     * the list is layed out horizontally.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int columnCount;

    /**
     * Number of columns to create.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int layoutOrientation;

    /**
     * The layout orientation of the list.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int listWidth;

    /**
     * Width of the list. When asked to paint, if the current size of
     * the list differs, this will update the layout state.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
    private int listHeight;

    /**
     * Height of the list. When asked to paint, if the current size of
     * the list differs, this will update the layout state.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicListUI.java
public class BasicListUI extends ListUI

/**
 * An extensible implementation of {@code ListUI}.
 * <p>
 * {@code BasicListUI} instances cannot be shared between multiple
 * lists.
 *
 * @author Hans Muller
 * @author Philip Milne
 * @author Shannon Hickey (drag and drop)
 */
