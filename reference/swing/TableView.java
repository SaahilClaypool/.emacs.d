_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public int getRowCount();

        /**
         * Gets the number of rows this cell spans (that is, the
         * grid height).
         *
         * @return the number of rows
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public int getColumnCount();

        /**
         * Gets the number of columns this cell spans (e.g. the
         * grid width).
         *
         * @return the number of columns
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public int getGridColumn();

        /**
         * Gets the column of the grid location
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public int getGridRow();

        /**
         * Gets the row of the grid location
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public void setGridLocation(int row, int col);

        /**
         * Sets the grid location.
         *
         * @param row the row &gt;= 0
         * @param col the column &gt;= 0
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    interface GridCell {

    /**
     * <em>
     * THIS IS NO LONGER USED, AND WILL BE REMOVED IN THE
     * NEXT RELEASE.  THE JCK SIGNATURE TEST THINKS THIS INTERFACE
     * SHOULD EXIST
     * </em>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public int getGridColumn() {

        /**
         * Gets the column of the grid location
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public int getGridRow() {

        /**
         * Gets the row of the grid location
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public void setGridLocation(int row, int col) {

        /**
         * Sets the grid location.
         *
         * @param row the row &gt;= 0
         * @param col the column &gt;= 0
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public int getRowCount() {

        /**
         * Gets the number of rows this cell spans (that is, the
         * grid height).
         *
         * @return the number of rows
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public int getColumnCount() {

        /**
         * Gets the number of columns this cell spans (e.g. the
         * grid width).
         *
         * @return the number of columns
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public TableCell(Element elem) {

        /**
         * Constructs a TableCell for the given element.
         *
         * @param elem the element that this view is responsible for
         * @since 1.4
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    @Deprecated

    /**
     * @deprecated  A table cell can now be any View implementation.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        int row;

        /** the row within the overall grid */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        BitSet fillColumns;

        /** columns filled by multi-column or multi-row cells */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        protected View getViewAtPosition(int pos, Rectangle a) {

        /**
         * Fetches the child view that represents the given position in
         * the model.  This is implemented to walk through the children
         * looking for a range that contains the given position.  In this
         * view the children do not necessarily have a one to one mapping
         * with the child elements.
         *
         * @param pos  the search position &gt;= 0
         * @param a  the allocation to the table on entry, and the
         *   allocation of the view containing the position on exit
         * @return  the view representing the given position, or
         *   <code>null</code> if there isn't one
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public int getResizeWeight(int axis) {

        /**
         * Determines the resizability of the view along the
         * given axis.  A value of 0 or less is not resizable.
         *
         * @param axis may be either View.X_AXIS or View.Y_AXIS
         * @return the resize weight
         * @exception IllegalArgumentException for an invalid axis
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        protected void layoutMinorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {

        /**
         * Perform layout for the minor axis of the box (i.e. the
         * axis orthogonal to the axis that it represents).  The results
         * of the layout should be placed in the given arrays which represent
         * the allocations to the children along the minor axis.  This
         * is called by the superclass whenever the layout needs to be
         * updated along the minor axis.
         * <p>
         * This is implemented to delegate to the superclass, then adjust
         * the span for any cell that spans multiple rows.
         *
         * @param targetSpan the total span given to the view, which
         *  would be used to layout the children.
         * @param axis the axis being layed out.
         * @param offsets the offsets from the origin of the view for
         *  each of the child views.  This is a return value and is
         *  filled in by the implementation of this method.
         * @param spans the span of each child view.  This is a return
         *  value and is filled in by the implementation of this method.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        protected void layoutMajorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {

        /**
         * Perform layout for the major axis of the box (i.e. the
         * axis that it represents).  The results of the layout should
         * be placed in the given arrays which represent the allocations
         * to the children along the major axis.
         * <p>
         * This is re-implemented to give each child the span of the column
         * width for the table, and to give cells that span multiple columns
         * the multi-column span.
         *
         * @param targetSpan the total span given to the view, which
         *  would be used to layout the children.
         * @param axis the axis being layed out.
         * @param offsets the offsets from the origin of the view for
         *  each of the child views.  This is a return value and is
         *  filled in by the implementation of this method.
         * @param spans the span of each child view.  This is a return
         *  value and is filled in by the implementation of this method.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public void replace(int offset, int length, View[] views) {

        /**
         * Change the child views.  This is implemented to
         * provide the superclass behavior and invalidate the
         * grid so that rows and columns will be recalculated.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        int getColumnCount() {

        /**
         * The number of columns present in this row.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        void setRow(int row) {

        /**
         * set location in the overall set of rows, this is
         * set by the TableView.updateGrid() method.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        int getRow() {

        /** get location in the overall set of rows */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
        public TableRow(Element elem) {

        /**
         * Constructs a TableView for the given element.
         *
         * @param elem the element that this view is responsible for
         * @since 1.4
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    public class TableRow extends BoxView {

    /**
     * View of a row in a row-centric table.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    protected View getViewAtPosition(int pos, Rectangle a) {

    /**
     * Fetches the child view that represents the given position in
     * the model.  This is implemented to walk through the children
     * looking for a range that contains the given position.  In this
     * view the children do not necessarily have a one to one mapping
     * with the child elements.
     *
     * @param pos  the search position &gt;= 0
     * @param a  the allocation to the table on entry, and the
     *   allocation of the view containing the position on exit
     * @return  the view representing the given position, or
     *   <code>null</code> if there isn't one
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    void checkMultiColumnCell(int axis, int col, int ncols, View v) {

    /**
     * check the requirements of a table cell that spans multiple
     * columns.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    void checkSingleColumnCell(int axis, int col, View v) {

    /**
     * check the requirements of a table cell that spans a single column.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    void calculateColumnRequirements(int axis) {

    /**
     * Calculate the requirements for each column.  The calculation
     * is done as two passes over the table.  The table cells that
     * occupy a single column are scanned first to determine the
     * maximum of minimum, preferred, and maximum spans along the
     * give axis.  Table cells that span multiple columns are excluded
     * from the first pass.  A second pass is made to determine if
     * the cells that span multiple columns are satisfied.  If the
     * column requirements are not satisified, the needs of the
     * multi-column cell is mixed into the existing column requirements.
     * The calculation of the multi-column distribution is based upon
     * the proportions of the existing column requirements and taking
     * into consideration any constraining maximums.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    protected SizeRequirements calculateMinorAxisRequirements(int axis, SizeRequirements r) {

    /**
     * Calculate the requirements for the minor axis.  This is called by
     * the superclass whenever the requirements need to be updated (i.e.
     * a preferenceChanged was messaged through this view).
     * <p>
     * This is implemented to calculate the requirements as the sum of the
     * requirements of the columns.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    protected void layoutMinorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {

    /**
     * Perform layout for the minor axis of the box (i.e. the
     * axis orthogonal to the axis that it represents).  The results
     * of the layout should be placed in the given arrays which represent
     * the allocations to the children along the minor axis.  This
     * is called by the superclass whenever the layout needs to be
     * updated along the minor axis.
     * <p>
     * This is implemented to call the
     * {@link #layoutColumns layoutColumns} method, and then
     * forward to the superclass to actually carry out the layout
     * of the tables rows.
     *
     * @param targetSpan the total span given to the view, which
     *  would be used to layout the children.
     * @param axis the axis being layed out.
     * @param offsets the offsets from the origin of the view for
     *  each of the child views.  This is a return value and is
     *  filled in by the implementation of this method.
     * @param spans the span of each child view.  This is a return
     *  value and is filled in by the implementation of this method.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    protected void layoutColumns(int targetSpan, int[] offsets, int[] spans,
                                 SizeRequirements[] reqs) {

    /**
     * Lays out the columns to fit within the given target span.
     * Returns the results through {@code offsets} and {@code spans}.
     *
     * @param targetSpan the given span for total of all the table
     *  columns
     * @param reqs the requirements desired for each column.  This
     *  is the column maximum of the cells minimum, preferred, and
     *  maximum requested span
     * @param spans the return value of how much to allocated to
     *  each column
     * @param offsets the return value of the offset from the
     *  origin for each column
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    void addFill(int row, int col) {

    /**
     * Mark a grid location as filled in for a cells overflow.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    void updateGrid() {

    /**
     * Fill in the grid locations that are placeholders
     * for multi-column, multi-row, and missing grid
     * locations.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    public void replace(int offset, int length, View[] views) {

    /**
     * Change the child views.  This is implemented to
     * provide the superclass behavior and invalidate the
     * grid so that rows and columns will be recalculated.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    /*protected*/ int getRowsOccupied(View v) {

    /**
     * Determines the number of rows occupied by
     * the table cell represented by given element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    /*protected*/ int getColumnsOccupied(View v) {

    /**
     * Determines the number of columns occupied by
     * the table cell represented by given element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    int getRowSpan(int row) {

    /**
     * Fetches the span (height) of the given row.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    int getRowCount() {

    /**
     * The number of rows in the table.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    int getColumnSpan(int col) {

    /**
     * Fetches the span (width) of the given column.
     * This is used by the nested cells to query the
     * sizes of grid locations outside of themselves.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    int getColumnCount() {

    /**
     * The number of columns in the table.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    @Deprecated

    /**
     * @deprecated Table cells can now be any arbitrary
     * View implementation and should be produced by the
     * ViewFactory rather than the table.
     *
     * @param elem an element
     * @return the cell
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    protected TableRow createTableRow(Element elem) {

    /**
     * Creates a new table row.
     *
     * @param elem an element
     * @return the row
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
    public TableView(Element elem) {

    /**
     * Constructs a TableView for the given element.
     *
     * @param elem the element that this view is responsible for
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TableView.java
public abstract class TableView extends BoxView {

/**
 * <p>
 * Implements View interface for a table, that is composed of an
 * element structure where the child elements of the element
 * this view is responsible for represent rows and the child
 * elements of the row elements are cells.  The cell elements can
 * have an arbitrary element structure under them, which will
 * be built with the ViewFactory returned by the getViewFactory
 * method.
 * <pre>
 *
 * &nbsp;  TABLE
 * &nbsp;    ROW
 * &nbsp;      CELL
 * &nbsp;      CELL
 * &nbsp;    ROW
 * &nbsp;      CELL
 * &nbsp;      CELL
 *
 * </pre>
 * <p>
 * This is implemented as a hierarchy of boxes, the table itself
 * is a vertical box, the rows are horizontal boxes, and the cells
 * are vertical boxes.  The cells are allowed to span multiple
 * columns and rows.  By default, the table can be thought of as
 * being formed over a grid (i.e. somewhat like one would find in
 * gridbag layout), where table cells can request to span more
 * than one grid cell.  The default horizontal span of table cells
 * will be based upon this grid, but can be changed by reimplementing
 * the requested span of the cell (i.e. table cells can have independant
 * spans if desired).
 *
 * @author  Timothy Prinzing
 * @see     View
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        protected SizeRequirements calculateMajorAxisRequirements(int axis,
                                                                  SizeRequirements r) {

        /**
         * Calculate the requirements needed along the major axis.
         * This is called by the superclass whenever the requirements
         * need to be updated (i.e. a preferenceChanged was messaged
         * through this view).
         * <p>
         * This is implemented to delegate to the superclass, but
         * indicate the maximum size is very large (i.e. the cell
         * is willing to expend to occupy the full height of the row).
         *
         * @param axis the axis being layed out.
         * @param r the requirements to fill in.  If null, a new one
         *  should be allocated.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        protected void layoutMajorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {

        /**
         * Perform layout for the major axis of the box (i.e. the
         * axis that it represents).  The results of the layout should
         * be placed in the given arrays which represent the allocations
         * to the children along the major axis.  This is called by the
         * superclass to recalculate the positions of the child views
         * when the layout might have changed.
         * <p>
         * This is implemented to delegate to the superclass to
         * tile the children.  If the target span is greater than
         * was needed, the offsets are adjusted to align the children
         * (i.e. position according to the html valign attribute).
         *
         * @param targetSpan the total span given to the view, which
         *  would be used to layout the children
         * @param axis the axis being layed out
         * @param offsets the offsets from the origin of the view for
         *  each of the child views; this is a return value and is
         *  filled in by the implementation of this method
         * @param spans the span of each child view; this is a return
         *  value and is filled in by the implementation of this method
         * @return the offset and span for each child view in the
         *  offsets and spans parameters
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        public CellView(Element elem) {

        /**
         * Constructs a TableCell for the given element.
         *
         * @param elem the element that this view is responsible for
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    class CellView extends BlockView {

    /**
     * Default view of an html table cell.  This needs to be moved
     * somewhere else.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        boolean multiRowCells;

        /**
         * Does this table row have cells that span multiple rows?
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        int viewIndex;

        /**
         * The view index (for row index to view index conversion).
         * This is set by the updateGrid method.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        int rowIndex;

        /**
         * The row index within the overall grid
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        BitSet fillColumns;

        /** columns filled by multi-column or multi-row cells */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        void setPropertiesFromAttributes() {

        /**
         * Update any cached values that come from attributes.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        protected View getViewAtPosition(int pos, Rectangle a) {

        /**
         * Fetches the child view that represents the given position in
         * the model.  This is implemented to walk through the children
         * looking for a range that contains the given position.  In this
         * view the children do not necessarily have a one to one mapping
         * with the child elements.
         *
         * @param pos  the search position >= 0
         * @param a  the allocation to the table on entry, and the
         *   allocation of the view containing the position on exit
         * @return  the view representing the given position, or
         *   null if there isn't one
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        public int getResizeWeight(int axis) {

        /**
         * Determines the resizability of the view along the
         * given axis.  A value of 0 or less is not resizable.
         *
         * @param axis may be either View.X_AXIS or View.Y_AXIS
         * @return the resize weight
         * @exception IllegalArgumentException for an invalid axis
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        protected void layoutMinorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {

        /**
         * Perform layout for the minor axis of the box (i.e. the
         * axis orthogonal to the axis that it represents).  The results
         * of the layout should be placed in the given arrays which represent
         * the allocations to the children along the minor axis.  This
         * is called by the superclass whenever the layout needs to be
         * updated along the minor axis.
         * <p>
         * This is implemented to delegate to the superclass, then adjust
         * the span for any cell that spans multiple rows.
         *
         * @param targetSpan the total span given to the view, which
         *  would be used to layout the children
         * @param axis the axis being layed out
         * @param offsets the offsets from the origin of the view for
         *  each of the child views; this is a return value and is
         *  filled in by the implementation of this method
         * @param spans the span of each child view; this is a return
         *  value and is filled in by the implementation of this method
         * @return the offset and span for each child view in the
         *  offsets and spans parameters
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        protected void layoutMajorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {

        /**
         * Perform layout for the major axis of the box (i.e. the
         * axis that it represents).  The results of the layout should
         * be placed in the given arrays which represent the allocations
         * to the children along the major axis.
         * <p>
         * This is re-implemented to give each child the span of the column
         * width for the table, and to give cells that span multiple columns
         * the multi-column span.
         *
         * @param targetSpan the total span given to the view, which
         *  would be used to layout the children
         * @param axis the axis being layed out
         * @param offsets the offsets from the origin of the view for
         *  each of the child views; this is a return value and is
         *  filled in by the implementation of this method
         * @param spans the span of each child view; this is a return
         *  value and is filled in by the implementation of this method
         * @return the offset and span for each child view in the
         *  offsets and spans parameters
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        protected SizeRequirements calculateMinorAxisRequirements(int axis, SizeRequirements r) {

        /**
         * Calculate the height requirements of the table row.  The
         * requirements of multi-row cells are not considered for this
         * calculation.  The table itself will check and adjust the row
         * requirements for all the rows that have multi-row cells spanning
         * them.  This method updates the multi-row flag that indicates that
         * this row and rows below need additional consideration.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        public void replace(int offset, int length, View[] views) {

        /**
         * Change the child views.  This is implemented to
         * provide the superclass behavior and invalidate the
         * grid so that rows and columns will be recalculated.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        public void paint(Graphics g, Shape allocation) {

        /**
         * Renders using the given rendering surface and area on that
         * surface.  This is implemented to delegate to the css box
         * painter to paint the border and background prior to the
         * interior.
         *
         * @param g the rendering surface to use
         * @param allocation the allocated region to render into
         * @see View#paint
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        public void preferenceChanged(View child, boolean width, boolean height) {

        /**
         * This is called by a child to indicate its
         * preferred span has changed.  This is implemented to
         * execute the superclass behavior and well as try to
         * determine if a row with a multi-row cell hangs across
         * this row.  If a multi-row cell covers this row it also
         * needs to propagate a preferenceChanged so that it will
         * recalculate the multi-row cell.
         *
         * @param child the child view
         * @param width true if the width preference should change
         * @param height true if the height preference should change
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        public AttributeSet getAttributes() {

        /**
         * Fetches the attributes to use when rendering.  This is
         * implemented to multiplex the attributes specified in the
         * model with a StyleSheet.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        int getColumnCount() {

        /**
         * The number of columns present in this row.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        public RowView(Element elem) {

        /**
         * Constructs a TableView for the given element.
         *
         * @param elem the element that this view is responsible for
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public class RowView extends BoxView {

    /**
     * View of a row in a row-centric table.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        private int[] adjustments;

        /**
         * Adjustments to the row requirements to handle multi-row
         * table cells.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        private int row;

        /**
         * Current row index
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        void adjustMultiRowSpan(int spanNeeded, int nrows, int rowIndex) {

        /**
         * Fixup preferences to accommodate a multi-row table cell
         * if not already covered by existing preferences.  This is
         * a no-op if not all of the rows needed (to do this check/fixup)
         * have arrived yet.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        private int[] percentages;

        /**
         * percentage values (may be null since there
         * might not be any).
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        private int col;

        /**
         * Current column index
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        public void setLayoutArrays(int offsets[], int spans[], int targetSpan) {

        /**
         * Set the layout arrays to use for holding layout results
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        private void updatePercentagesAndAdjustmentWeights(int span) {

        /**
         * Update percentage adjustments if they are needed.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
        void disablePercentages() {

        /**
         * Disable percentage adjustments which should only apply
         * when calculating layout, not requirements.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    SizeRequirements totalColumnRequirements;

    /**
     * SizeRequirements for all the columns.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    private boolean multiRowCells;

    /**
     * Do any of the table cells span multiple rows?  If
     * true, the RowRequirementIterator will do additional
     * work to adjust the requirements of rows spanned by
     * a single table cell.  This is updated with each call to
     * updateGrid().
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    private boolean relativeCells;

    /**
     * Do any of the table cells contain a relative size
     * specification?  This is updated with each call to
     * updateGrid().  If this is true, the ColumnIterator
     * will do extra work to calculate relative cell
     * specifications.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    private int captionIndex;

    /**
     * The index of the caption view if there is a caption.
     * This has a value of -1 if there is no caption.  The
     * caption lives in the inset area of the table, and is
     * updated with each time the grid is recalculated.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public View create(Element elem) {

    /**
     * The table itself acts as a factory for the various
     * views that actually represent pieces of the table.
     * All other factory activity is delegated to the factory
     * returned by the parent of the table.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public void replace(int offset, int length, View[] views) {

    /**
     * Change the child views.  This is implemented to
     * provide the superclass behavior and invalidate the
     * grid so that rows and columns will be recalculated.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public void changedUpdate(DocumentEvent e, Shape a, ViewFactory f) {

    /**
     * Gives notification from the document that attributes were changed
     * in a location that this view is responsible for.
     * This replaces the ViewFactory with an implementation that
     * calls through to the createTableRow and createTableCell
     * methods.   If the element given to the factory isn't a
     * table row or cell, the request is delegated to the factory
     * passed as an argument.
     *
     * @param e the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#changedUpdate
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public void removeUpdate(DocumentEvent e, Shape a, ViewFactory f) {

    /**
     * Gives notification that something was removed from the document
     * in a location that this view is responsible for.
     * This replaces the ViewFactory with an implementation that
     * calls through to the createTableRow and createTableCell
     * methods.   If the element given to the factory isn't a
     * table row or cell, the request is delegated to the factory
     * passed as an argument.
     *
     * @param e the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#removeUpdate
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public void insertUpdate(DocumentEvent e, Shape a, ViewFactory f) {

    /**
     * Gives notification that something was inserted into
     * the document in a location that this view is responsible for.
     * This replaces the ViewFactory with an implementation that
     * calls through to the createTableRow and createTableCell
     * methods.   If the element given to the factory isn't a
     * table row or cell, the request is delegated to the factory
     * passed as an argument.
     *
     * @param e the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#insertUpdate
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public ViewFactory getViewFactory() {

    /**
     * Fetches the ViewFactory implementation that is feeding
     * the view hierarchy.
     * This replaces the ViewFactory with an implementation that
     * calls through to the createTableRow and createTableCell
     * methods.   If the element given to the factory isn't a
     * table row or cell, the request is delegated to the factory
     * produced by the superclass behavior.
     *
     * @return the factory, null if none
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public void setParent(View parent) {

    /**
     * Establishes the parent view for this view.  This is
     * guaranteed to be called before any other methods if the
     * parent view is functioning properly.
     * <p>
     * This is implemented
     * to forward to the superclass as well as call the
     * <a href="#setPropertiesFromAttributes">setPropertiesFromAttributes</a>
     * method to set the paragraph properties from the css
     * attributes.  The call is made at this time to ensure
     * the ability to resolve upward through the parents
     * view attributes.
     *
     * @param parent the new parent, or null if the view is
     *  being removed from a parent it was previously added
     *  to
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public void paint(Graphics g, Shape allocation) {

    /**
     * Renders using the given rendering surface and area on that
     * surface.  This is implemented to delegate to the css box
     * painter to paint the border and background prior to the
     * interior.  The superclass culls rendering the children
     * that don't directly intersect the clip and the row may
     * have cells hanging from a row above in it.  The table
     * does not use the superclass rendering behavior and instead
     * paints all of the rows and lets the rows cull those
     * cells not intersecting the clip region.
     *
     * @param g the rendering surface to use
     * @param allocation the allocated region to render into
     * @see View#paint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public AttributeSet getAttributes() {

    /**
     * Fetches the attributes to use when rendering.  This is
     * implemented to multiplex the attributes specified in the
     * model with a StyleSheet.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    protected View getViewAtPosition(int pos, Rectangle a) {

    /**
     * Fetches the child view that represents the given position in
     * the model.  This is implemented to walk through the children
     * looking for a range that contains the given position.  In this
     * view the children do not necessarily have a one to one mapping
     * with the child elements.
     *
     * @param pos  the search position >= 0
     * @param a  the allocation to the table on entry, and the
     *   allocation of the view containing the position on exit
     * @return  the view representing the given position, or
     *   null if there isn't one
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    protected void layoutMajorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {

    /**
     * Perform layout for the major axis of the box (i.e. the
     * axis that it represents).  The results
     * of the layout should be placed in the given arrays which represent
     * the allocations to the children along the minor axis.  This
     * is called by the superclass whenever the layout needs to be
     * updated along the minor axis.
     * <p>
     * This method is where the layout of the table rows within the
     * table takes place.  This method is implemented to call the use
     * the RowIterator and the CSS collapsing tile to layout
     * with border spacing and border collapsing capabilities.
     *
     * @param targetSpan the total span given to the view, which
     *  would be used to layout the children
     * @param axis the axis being layed out
     * @param offsets the offsets from the origin of the view for
     *  each of the child views; this is a return value and is
     *  filled in by the implementation of this method
     * @param spans the span of each child view; this is a return
     *  value and is filled in by the implementation of this method
     * @return the offset and span for each child view in the
     *  offsets and spans parameters
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    protected void layoutMinorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {

    /**
     * Perform layout for the minor axis of the box (i.e. the
     * axis orthogonal to the axis that it represents).  The results
     * of the layout should be placed in the given arrays which represent
     * the allocations to the children along the minor axis.  This
     * is called by the superclass whenever the layout needs to be
     * updated along the minor axis.
     * <p>
     * This is implemented to call the
     * <a href="#layoutColumns">layoutColumns</a> method, and then
     * forward to the superclass to actually carry out the layout
     * of the tables rows.
     *
     * @param targetSpan the total span given to the view, which
     *  would be used to layout the children
     * @param axis the axis being layed out
     * @param offsets the offsets from the origin of the view for
     *  each of the child views.  This is a return value and is
     *  filled in by the implementation of this method
     * @param spans the span of each child view;  this is a return
     *  value and is filled in by the implementation of this method
     * @return the offset and span for each child view in the
     *  offsets and spans parameters
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    protected SizeRequirements calculateMajorAxisRequirements(int axis, SizeRequirements r) {

    /**
     * Calculate the requirements for the major axis.  This is called by
     * the superclass whenever the requirements need to be updated (i.e.
     * a preferenceChanged was messaged through this view).
     * <p>
     * This is implemented to provide the superclass behavior adjusted for
     * multi-row table cells.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    protected SizeRequirements calculateMinorAxisRequirements(int axis, SizeRequirements r) {

    /**
     * Calculate the requirements for the minor axis.  This is called by
     * the superclass whenever the requirements need to be updated (i.e.
     * a preferenceChanged was messaged through this view).
     * <p>
     * This is implemented to calculate the requirements as the sum of the
     * requirements of the columns and then adjust it if the
     * CSS width or height attribute is specified and applicable to
     * the axis.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    void checkMultiColumnCell(int axis, int col, int ncols, View v) {

    /**
     * check the requirements of a table cell that spans multiple
     * columns.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    void checkSingleColumnCell(int axis, int col, View v) {

    /**
     * check the requirements of a table cell that spans a single column.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    void calculateColumnRequirements(int axis) {

    /**
     * Calculate the requirements for each column.  The calculation
     * is done as two passes over the table.  The table cells that
     * occupy a single column are scanned first to determine the
     * maximum of minimum, preferred, and maximum spans along the
     * give axis.  Table cells that span multiple columns are excluded
     * from the first pass.  A second pass is made to determine if
     * the cells that span multiple columns are satisfied.  If the
     * column requirements are not satisified, the needs of the
     * multi-column cell is mixed into the existing column requirements.
     * The calculation of the multi-column distribution is based upon
     * the proportions of the existing column requirements and taking
     * into consideration any constraining maximums.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    protected void layoutColumns(int targetSpan, int[] offsets, int[] spans,
                                 SizeRequirements[] reqs) {

    /**
     * Layout the columns to fit within the given target span.
     *
     * @param targetSpan the given span for total of all the table
     *  columns
     * @param reqs the requirements desired for each column.  This
     *  is the column maximum of the cells minimum, preferred, and
     *  maximum requested span
     * @param spans the return value of how much to allocated to
     *  each column
     * @param offsets the return value of the offset from the
     *  origin for each column
     * @return the offset from the origin and the span for each column
     *  in the offsets and spans parameters
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    void addFill(int row, int col) {

    /**
     * Mark a grid location as filled in for a cells overflow.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    void updateGrid() {

    /**
     * Fill in the grid locations that are placeholders
     * for multi-column, multi-row, and missing grid
     * locations.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    protected void setPropertiesFromAttributes() {

    /**
     * Update any cached values that come from attributes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    void updateInsets() {

    /**
     * Update the insets, which contain the caption if there
     * is a caption.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    protected int getRowsOccupied(View v) {

    /**
     * Determines the number of rows occupied by
     * the table cell represented by given element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    protected int getColumnsOccupied(View v) {

    /**
     * Determines the number of columns occupied by
     * the table cell represented by given element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public int getRowSpan(int row) {

    /**
     * Fetches the span (height) of the given row.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public int getMultiRowSpan(int row0, int row1) {

    /**
     * Fetch the span of multiple rows.  This includes
     * the border area.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public int getRowCount() {

    /**
     * The number of rows in the table.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public int getColumnSpan(int col) {

    /**
     * Fetches the span (width) of the given column.
     * This is used by the nested cells to query the
     * sizes of grid locations outside of themselves.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public int getColumnCount() {

    /**
     * The number of columns in the table.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    protected RowView createTableRow(Element elem) {

    /**
     * Creates a new table row.
     *
     * @param elem an element
     * @return the row
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
    public TableView(Element elem) {

    /**
     * Constructs a TableView for the given element.
     *
     * @param elem the element that this view is responsible for
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/TableView.java
/*public*/ class TableView extends BoxView implements ViewFactory {

/**
 * HTML table view.
 *
 * @author  Timothy Prinzing
 * @see     View
 */
