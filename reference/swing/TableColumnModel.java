_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public void removeColumnModelListener(TableColumnModelListener x);

    /**
     * Removes a listener for table column model events.
     *
     * @param x  a <code>TableColumnModelListener</code> object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public void addColumnModelListener(TableColumnModelListener x);

    /**
     * Adds a listener for table column model events.
     *
     * @param x  a <code>TableColumnModelListener</code> object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public ListSelectionModel getSelectionModel();

    /**
     * Returns the current selection model.
     *
     * @return a <code>ListSelectionModel</code> object
     * @see #setSelectionModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public void setSelectionModel(ListSelectionModel newModel);

    /**
     * Sets the selection model.
     *
     * @param newModel  a <code>ListSelectionModel</code> object
     * @see #getSelectionModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public int getSelectedColumnCount();

    /**
     * Returns the number of selected columns.
     *
     * @return the number of selected columns; or 0 if no columns are selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public int[] getSelectedColumns();

    /**
     * Returns an array of indicies of all selected columns.
     * @return an array of integers containing the indicies of all
     *          selected columns; or an empty array if nothing is selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public boolean getColumnSelectionAllowed();

    /**
     * Returns true if columns may be selected.
     * @return true if columns may be selected
     * @see #setColumnSelectionAllowed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public void setColumnSelectionAllowed(boolean flag);

    /**
     * Sets whether the columns in this model may be selected.
     * @param flag   true if columns may be selected; otherwise false
     * @see #getColumnSelectionAllowed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public int getTotalColumnWidth();

    /**
     * Returns the total width of all the columns.
     * @return the total computed width of all columns
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public int getColumnIndexAtX(int xPosition);

    /**
     * Returns the index of the column that lies on the
     * horizontal point, <code>xPosition</code>;
     * or -1 if it lies outside the any of the column's bounds.
     *
     * In keeping with Swing's separable model architecture, a
     * TableColumnModel does not know how the table columns actually appear on
     * screen.  The visual presentation of the columns is the responsibility
     * of the view/controller object using this model (typically JTable).  The
     * view/controller need not display the columns sequentially from left to
     * right.  For example, columns could be displayed from right to left to
     * accommodate a locale preference or some columns might be hidden at the
     * request of the user.  Because the model does not know how the columns
     * are laid out on screen, the given <code>xPosition</code> should not be
     * considered to be a coordinate in 2D graphics space.  Instead, it should
     * be considered to be a width from the start of the first column in the
     * model.  If the column index for a given X coordinate in 2D space is
     * required, <code>JTable.columnAtPoint</code> can be used instead.
     *
     * @return  the index of the column; or -1 if no column is found
     * @see javax.swing.JTable#columnAtPoint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public int getColumnMargin();

    /**
     * Returns the width between the cells in each column.
     * @return the margin, in pixels, between the cells
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public TableColumn getColumn(int columnIndex);

    /**
     * Returns the <code>TableColumn</code> object for the column at
     * <code>columnIndex</code>.
     *
     * @param   columnIndex     the index of the desired column
     * @return  the <code>TableColumn</code> object for
     *                          the column at <code>columnIndex</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public int getColumnIndex(Object columnIdentifier);

    /**
     * Returns the index of the first column in the table
     * whose identifier is equal to <code>identifier</code>,
     * when compared using <code>equals</code>.
     *
     * @param           columnIdentifier        the identifier object
     * @return          the index of the first table column
     *                  whose identifier is equal to <code>identifier</code>
     * @exception IllegalArgumentException      if <code>identifier</code>
     *                          is <code>null</code>, or no
     *                          <code>TableColumn</code> has this
     *                          <code>identifier</code>
     * @see             #getColumn
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public Enumeration<TableColumn> getColumns();

    /**
     * Returns an <code>Enumeration</code> of all the columns in the model.
     * @return an <code>Enumeration</code> of all the columns in the model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public int getColumnCount();

    /**
     * Returns the number of columns in the model.
     * @return the number of columns in the model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public void setColumnMargin(int newMargin);

    /**
     * Sets the <code>TableColumn</code>'s column margin to
     * <code>newMargin</code>.  This method posts
     * a <code>columnMarginChanged</code> event to its listeners.
     *
     * @param   newMargin       the width, in pixels, of the new column margins
     * @see     #getColumnMargin
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public void moveColumn(int columnIndex, int newIndex);

    /**
     * Moves the column and its header at <code>columnIndex</code> to
     * <code>newIndex</code>.  The old column at <code>columnIndex</code>
     * will now be found at <code>newIndex</code>.  The column that used
     * to be at <code>newIndex</code> is shifted left or right
     * to make room.  This will not move any columns if
     * <code>columnIndex</code> equals <code>newIndex</code>.  This method
     * posts a <code>columnMoved</code> event to its listeners.
     *
     * @param   columnIndex                     the index of column to be moved
     * @param   newIndex                        index of the column's new location
     * @exception IllegalArgumentException      if <code>columnIndex</code> or
     *                                          <code>newIndex</code>
     *                                          are not in the valid range
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public void removeColumn(TableColumn column);

    /**
     *  Deletes the <code>TableColumn</code> <code>column</code> from the
     *  <code>tableColumns</code> array.  This method will do nothing if
     *  <code>column</code> is not in the table's column list.
     *  This method posts a <code>columnRemoved</code>
     *  event to its listeners.
     *
     * @param   column          the <code>TableColumn</code> to be removed
     * @see     #addColumn
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
    public void addColumn(TableColumn aColumn);

    /**
     *  Appends <code>aColumn</code> to the end of the
     *  <code>tableColumns</code> array.
     *  This method posts a <code>columnAdded</code>
     *  event to its listeners.
     *
     * @param   aColumn         the <code>TableColumn</code> to be added
     * @see     #removeColumn
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/TableColumnModel.java
public interface TableColumnModel

/**
 * Defines the requirements for a table column model object suitable for
 * use with <code>JTable</code>.
 *
 * @author Alan Chung
 * @author Philip Milne
 * @see DefaultTableColumnModel
 */
