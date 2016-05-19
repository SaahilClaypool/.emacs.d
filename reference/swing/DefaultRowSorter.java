_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    // NOTE: this class is static so that it can be placed in an array

    /**
     * Row is used to handle the actual sorting by way of Comparable.  It
     * will use the sortKeys to do the actual comparison.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
        int modelIndex;

        /**
         * The index into the model, set in getFilterEntry
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private class FilterEntry extends RowFilter.Entry<M,I> {

    /**
     * RowFilter.Entry implementation that delegates to the ModelWrapper.
     * getFilterEntry(int) creates the single instance of this that is
     * passed to the Filter.  Only call getFilterEntry(int) to get
     * the instance.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
        public abstract I getIdentifier(int row);

        /**
         * Returns the identifier for the specified row.  The return value
         * of this is used as the identifier for the
         * <code>RowFilter.Entry</code> that is passed to the
         * <code>RowFilter</code>.
         *
         * @param row the row to return the identifier for, in terms of
         *            the underlying model
         * @return the identifier
         * @see RowFilter.Entry#getIdentifier
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
        public String getStringValueAt(int row, int column) {

        /**
         * Returns the value as a <code>String</code> at the specified
         * index.  This implementation uses <code>toString</code> on
         * the result from <code>getValueAt</code> (making sure
         * to return an empty string for null values).  Subclasses that
         * override this method should never return null.
         *
         * @param row the row index
         * @param column the column index
         * @return the value at the specified index as a <code>String</code>
         * @throws IndexOutOfBoundsException if the indices are outside
         *         the range of the model
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
        public abstract Object getValueAt(int row, int column);

        /**
         * Returns the value at the specified index.
         *
         * @param row the row index
         * @param column the column index
         * @return the value at the specified index
         * @throws IndexOutOfBoundsException if the indices are outside
         *         the range of the model
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
        public abstract int getRowCount();

        /**
         * Returns the number of rows in the model.
         *
         * @return the number of rows in the model
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
        public abstract int getColumnCount();

        /**
         * Returns the number of columns in the model.
         *
         * @return the number of columns in the model
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
        public abstract M getModel();

        /**
         * Returns the underlying model that this <code>Model</code> is
         * wrapping.
         *
         * @return the underlying model
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
        protected ModelWrapper() {

        /**
         * Creates a new <code>ModelWrapper</code>.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    protected abstract static class ModelWrapper<M,I> {

    /**
     * <code>DefaultRowSorter.ModelWrapper</code> is responsible for providing
     * the data that gets sorted by <code>DefaultRowSorter</code>.  You
     * normally do not interact directly with <code>ModelWrapper</code>.
     * Subclasses of <code>DefaultRowSorter</code> provide an
     * implementation of <code>ModelWrapper</code> wrapping another model.
     * For example,
     * <code>TableRowSorter</code> provides a <code>ModelWrapper</code> that
     * wraps a <code>TableModel</code>.
     * <p>
     * <code>ModelWrapper</code> makes a distinction between values as
     * <code>Object</code>s and <code>String</code>s.  This allows
     * implementations to provide a custom string
     * converter to be used instead of invoking <code>toString</code> on the
     * object.
     *
     * @param <M> the type of the underlying model
     * @param <I> the identifier supplied to the filter
     * @since 1.6
     * @see RowFilter
     * @see RowFilter.Entry
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private boolean shouldOptimizeChange(int firstRow, int lastRow) {

    /**
     * Returns true if we should try and optimize the processing of the
     * <code>TableModelEvent</code>.  If this returns false, assume the
     * event was dealt with and no further processing needs to happen.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private void insertInOrder(List<Row> toAdd, Row[] current) {

    /**
     * Insets new set of entries.
     *
     * @param toAdd the Rows to add, sorted
     * @param current the array to insert the items into
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private boolean isTransformed() {

    /**
     * Whether not we are filtering/sorting.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private boolean include(int row) {

    /**
     * Returns true if the specified row should be included.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void rowsUpdated(int firstRow, int endRow, int column) {

    /**
     * {@inheritDoc}
     *
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void rowsUpdated(int firstRow, int endRow) {

    /**
     * {@inheritDoc}
     *
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void rowsDeleted(int firstRow, int endRow) {

    /**
     * {@inheritDoc}
     *
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void rowsInserted(int firstRow, int endRow) {

    /**
     * {@inheritDoc}
     *
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void allRowsChanged() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void modelStructureChanged() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public int getModelRowCount() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public int getViewRowCount() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public Comparator<?> getComparator(int column) {

    /**
     * Returns the <code>Comparator</code> for the specified
     * column.  This will return <code>null</code> if a <code>Comparator</code>
     * has not been specified for the column.
     *
     * @param column the column to fetch the <code>Comparator</code> for, in
     *        terms of the underlying model
     * @return the <code>Comparator</code> for the specified column
     * @throws IndexOutOfBoundsException if column is outside
     *         the range of the underlying model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void setComparator(int column, Comparator<?> comparator) {

    /**
     * Sets the <code>Comparator</code> to use when sorting the specified
     * column.  This does not trigger a sort.  If you want to sort after
     * setting the comparator you need to explicitly invoke <code>sort</code>.
     *
     * @param column the index of the column the <code>Comparator</code> is
     *        to be used for, in terms of the underlying model
     * @param comparator the <code>Comparator</code> to use
     * @throws IndexOutOfBoundsException if <code>column</code> is outside
     *         the range of the underlying model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private void setModelToViewFromViewToModel(boolean unsetFirst) {

    /**
     * Refreshes the modelToView mapping from that of viewToModel.
     * If <code>unsetFirst</code> is true, all indices in modelToView are
     * first set to -1.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    protected boolean useToString(int column) {

    /**
     * Returns whether or not to convert the value to a string before
     * doing comparisons when sorting.  If true
     * <code>ModelWrapper.getStringValueAt</code> will be used, otherwise
     * <code>ModelWrapper.getValueAt</code> will be used.  It is up to
     * subclasses, such as <code>TableRowSorter</code>, to honor this value
     * in their <code>ModelWrapper</code> implementation.
     *
     * @param column the index of the column to test, in terms of the
     *        underlying model
     * @throws IndexOutOfBoundsException if <code>column</code> is not valid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private void cacheSortKeys(List<? extends SortKey> keys) {

    /**
     * Caches the sort keys before a sort.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private void createViewToModel(int rowCount) {

    /**
     * Resets the viewToModel array to be of size rowCount.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private void createModelToView(int rowCount) {

    /**
     * Makes sure the modelToView array is of size rowCount.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private void initializeFilteredMapping() {

    /**
     * Resets the viewToModel and modelToView mappings based on
     * the current Filter.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private void updateUseToString() {

    /**
     * Updates the useToString mapping before a sort.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void sort() {

    /**
     * Sorts and filters the rows in the view based on the sort keys
     * of the columns currently being sorted and the filter, if any,
     * associated with this sorter.  An empty <code>sortKeys</code> list
     * indicates that the view should unsorted, the same as the model.
     *
     * @see #setRowFilter
     * @see #setSortKeys
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private void sortExistingData() {

    /**
     * Sorts the existing filtered data.  This should only be used if
     * the filter hasn't changed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public int convertRowIndexToModel(int index) {

    /**
     * {@inheritDoc}
     *
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public int convertRowIndexToView(int index) {

    /**
     * {@inheritDoc}
     *
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void toggleSortOrder(int column) {

    /**
     * Reverses the sort order from ascending to descending (or
     * descending to ascending) if the specified column is already the
     * primary sorted column; otherwise, makes the specified column
     * the primary sorted column, with an ascending sort order.  If
     * the specified column is not sortable, this method has no
     * effect.
     *
     * @param column index of the column to make the primary sorted column,
     *        in terms of the underlying model
     * @throws IndexOutOfBoundsException {@inheritDoc}
     * @see #setSortable(int,boolean)
     * @see #setMaxSortKeys(int)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public RowFilter<? super M,? super I> getRowFilter() {

    /**
     * Returns the filter that determines which rows, if any, should
     * be hidden from view.
     *
     * @return the filter
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void setRowFilter(RowFilter<? super M,? super I> filter) {

    /**
     * Sets the filter that determines which rows, if any, should be
     * hidden from the view.  The filter is applied before sorting.  A value
     * of <code>null</code> indicates all values from the model should be
     * included.
     * <p>
     * <code>RowFilter</code>'s <code>include</code> method is passed an
     * <code>Entry</code> that wraps the underlying model.  The number
     * of columns in the <code>Entry</code> corresponds to the
     * number of columns in the <code>ModelWrapper</code>.  The identifier
     * comes from the <code>ModelWrapper</code> as well.
     * <p>
     * This method triggers a sort.
     *
     * @param filter the filter used to determine what entries should be
     *        included
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public boolean getSortsOnUpdates() {

    /**
     * Returns true if  a sort should happen when the underlying
     * model is updated; otherwise, returns false.
     *
     * @return whether or not to sort when the model is updated
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void setSortsOnUpdates(boolean sortsOnUpdates) {

    /**
     * If true, specifies that a sort should happen when the underlying
     * model is updated (<code>rowsUpdated</code> is invoked).  For
     * example, if this is true and the user edits an entry the
     * location of that item in the view may change.  The default is
     * false.
     *
     * @param sortsOnUpdates whether or not to sort on update events
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public int getMaxSortKeys() {

    /**
     * Returns the maximum number of sort keys.
     *
     * @return the maximum number of sort keys
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void setMaxSortKeys(int max) {

    /**
     * Sets the maximum number of sort keys.  The number of sort keys
     * determines how equal values are resolved when sorting.  For
     * example, assume a table row sorter is created and
     * <code>setMaxSortKeys(2)</code> is invoked on it. The user
     * clicks the header for column 1, causing the table rows to be
     * sorted based on the items in column 1.  Next, the user clicks
     * the header for column 2, causing the table to be sorted based
     * on the items in column 2; if any items in column 2 are equal,
     * then those particular rows are ordered based on the items in
     * column 1. In this case, we say that the rows are primarily
     * sorted on column 2, and secondarily on column 1.  If the user
     * then clicks the header for column 3, then the items are
     * primarily sorted on column 3 and secondarily sorted on column
     * 2.  Because the maximum number of sort keys has been set to 2
     * with <code>setMaxSortKeys</code>, column 1 no longer has an
     * effect on the order.
     * <p>
     * The maximum number of sort keys is enforced by
     * <code>toggleSortOrder</code>.  You can specify more sort
     * keys by invoking <code>setSortKeys</code> directly and they will
     * all be honored.  However if <code>toggleSortOrder</code> is subsequently
     * invoked the maximum number of sort keys will be enforced.
     * The default value is 3.
     *
     * @param max the maximum number of sort keys
     * @throws IllegalArgumentException if <code>max</code> &lt; 1
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public List<? extends SortKey> getSortKeys() {

    /**
     * Returns the current sort keys.  This returns an unmodifiable
     * {@code non-null List}. If you need to change the sort keys,
     * make a copy of the returned {@code List}, mutate the copy
     * and invoke {@code setSortKeys} with the new list.
     *
     * @return the current sort order
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void setSortKeys(List<? extends SortKey> sortKeys) {

    /**
     * Sets the sort keys. This creates a copy of the supplied
     * {@code List}; subsequent changes to the supplied
     * {@code List} do not effect this {@code DefaultRowSorter}.
     * If the sort keys have changed this triggers a sort.
     *
     * @param sortKeys the new <code>SortKeys</code>; <code>null</code>
     *        is a shorthand for specifying an empty list,
     *        indicating that the view should be unsorted
     * @throws IllegalArgumentException if any of the values in
     *         <code>sortKeys</code> are null or have a column index outside
     *         the range of the model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public boolean isSortable(int column) {

    /**
     * Returns true if the specified column is sortable; otherwise, false.
     *
     * @param column the column to check sorting for, in terms of the
     *        underlying model
     * @return true if the column is sortable
     * @throws IndexOutOfBoundsException if column is outside
     *         the range of the underlying model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public void setSortable(int column, boolean sortable) {

    /**
     * Sets whether or not the specified column is sortable.  The specified
     * value is only checked when <code>toggleSortOrder</code> is invoked.
     * It is still possible to sort on a column that has been marked as
     * unsortable by directly setting the sort keys.  The default is
     * true.
     *
     * @param column the column to enable or disable sorting on, in terms
     *        of the underlying model
     * @param sortable whether or not the specified column is sortable
     * @throws IndexOutOfBoundsException if <code>column</code> is outside
     *         the range of the model
     * @see #toggleSortOrder
     * @see #setSortKeys
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public final M getModel() {

    /**
     * Returns the underlying model.
     *
     * @return the underlying model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    protected final ModelWrapper<M,I> getModelWrapper() {

    /**
     * Returns the model wrapper providing the data that is being sorted and
     * filtered.
     *
     * @return the model wrapper responsible for providing the data that
     *         gets sorted and filtered
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    protected final void setModelWrapper(ModelWrapper<M,I> modelWrapper) {

    /**
     * Sets the model wrapper providing the data that is being sorted and
     * filtered.
     *
     * @param modelWrapper the model wrapper responsible for providing the
     *         data that gets sorted and filtered
     * @throws IllegalArgumentException if {@code modelWrapper} is
     *         {@code null}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    public DefaultRowSorter() {

    /**
     * Creates an empty <code>DefaultRowSorter</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private int modelRowCount;

    /**
     * Size of the model. This is used to enforce error checking within
     * the table changed notification methods (such as rowsInserted).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private ModelWrapper<M,I> modelWrapper;

    /**
     * Provides access to the data we're sorting/filtering.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private int maxSortKeys;

    /**
     * Maximum number of sort keys.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private boolean sorted;

    /**
     * Indicates the contents are sorted.  This is used if
     * getSortsOnUpdates is false and an update event is received.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private boolean[] useToString;

    /**
     * Whether or not to use getStringValueAt.  This is indexed by column.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private List<SortKey> sortKeys;

    /**
     * The sort keys.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private FilterEntry filterEntry;

    /**
     * Value passed to the filter.  The same instance is passed to the
     * filter for different rows.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private RowFilter<? super M,? super I> filter;

    /**
     * Developer supplied Filter.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private Comparator[] sortComparators;

    /**
     * Cached comparators for the current sort
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private SortKey[] cachedSortKeys;

    /**
     * Cached SortKeys for the current sort.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private boolean[] isSortable;

    /**
     * Whether or not the specified column is sortable, by column.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private Comparator[] comparators;

    /**
     * Comparators specified by column.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private int[] modelToView;

    /**
     * model -> view (JTable)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private Row[] viewToModel;

    /**
     * View (JTable) -> model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
    private boolean sortsOnUpdates;

    /**
     * Whether or not we resort on TableModelEvent.UPDATEs.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//DefaultRowSorter.java
public abstract class DefaultRowSorter<M, I> extends RowSorter<M> {

/**
 * An implementation of <code>RowSorter</code> that provides sorting and
 * filtering around a grid-based data model.
 * Beyond creating and installing a <code>RowSorter</code>, you very rarely
 * need to interact with one directly.  Refer to
 * {@link javax.swing.table.TableRowSorter TableRowSorter} for a concrete
 * implementation of <code>RowSorter</code> for <code>JTable</code>.
 * <p>
 * Sorting is done based on the current <code>SortKey</code>s, in order.
 * If two objects are equal (the <code>Comparator</code> for the
 * column returns 0) the next <code>SortKey</code> is used.  If no
 * <code>SortKey</code>s remain or the order is <code>UNSORTED</code>, then
 * the order of the rows in the model is used.
 * <p>
 * Sorting of each column is done by way of a <code>Comparator</code>
 * that you can specify using the <code>setComparator</code> method.
 * If a <code>Comparator</code> has not been specified, the
 * <code>Comparator</code> returned by
 * <code>Collator.getInstance()</code> is used on the results of
 * calling <code>toString</code> on the underlying objects.  The
 * <code>Comparator</code> is never passed <code>null</code>.  A
 * <code>null</code> value is treated as occurring before a
 * non-<code>null</code> value, and two <code>null</code> values are
 * considered equal.
 * <p>
 * If you specify a <code>Comparator</code> that casts its argument to
 * a type other than that provided by the model, a
 * <code>ClassCastException</code> will be thrown when the data is sorted.
 * <p>
 * In addition to sorting, <code>DefaultRowSorter</code> provides the
 * ability to filter rows.  Filtering is done by way of a
 * <code>RowFilter</code> that is specified using the
 * <code>setRowFilter</code> method.  If no filter has been specified all
 * rows are included.
 * <p>
 * By default, rows are in unsorted order (the same as the model) and
 * every column is sortable. The default <code>Comparator</code>s are
 * documented in the subclasses (for example, {@link
 * javax.swing.table.TableRowSorter TableRowSorter}).
 * <p>
 * If the underlying model structure changes (the
 * <code>modelStructureChanged</code> method is invoked) the following
 * are reset to their default values: <code>Comparator</code>s by
 * column, current sort order, and whether each column is sortable. To
 * find the default <code>Comparator</code>s, see the concrete
 * implementation (for example, {@link
 * javax.swing.table.TableRowSorter TableRowSorter}).  The default
 * sort order is unsorted (the same as the model), and columns are
 * sortable by default.
 * <p>
 * If the underlying model structure changes (the
 * <code>modelStructureChanged</code> method is invoked) the following
 * are reset to their default values: <code>Comparator</code>s by column,
 * current sort order and whether a column is sortable.
 * <p>
 * <code>DefaultRowSorter</code> is an abstract class.  Concrete
 * subclasses must provide access to the underlying data by invoking
 * {@code setModelWrapper}. The {@code setModelWrapper} method
 * <b>must</b> be invoked soon after the constructor is
 * called, ideally from within the subclass's constructor.
 * Undefined behavior will result if you use a {@code
 * DefaultRowSorter} without specifying a {@code ModelWrapper}.
 * <p>
 * <code>DefaultRowSorter</code> has two formal type parameters.  The
 * first type parameter corresponds to the class of the model, for example
 * <code>DefaultTableModel</code>.  The second type parameter
 * corresponds to the class of the identifier passed to the
 * <code>RowFilter</code>.  Refer to <code>TableRowSorter</code> and
 * <code>RowFilter</code> for more details on the type parameters.
 *
 * @param <M> the type of the model
 * @param <I> the type of the identifier passed to the <code>RowFilter</code>
 * @see javax.swing.table.TableRowSorter
 * @see javax.swing.table.DefaultTableModel
 * @see java.text.Collator
 * @since 1.6
 */
