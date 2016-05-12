_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>AbstractTableModel</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     *
     * You can specify the <code>listenerType</code> argument
     * with a class literal,
     * such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * model <code>m</code>
     * for its table model listeners with the following code:
     *
     * <pre>TableModelListener[] tmls = (TableModelListener[])(m.getListeners(TableModelListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this component,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getTableModelListeners
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public void fireTableChanged(TableModelEvent e) {

    /**
     * Forwards the given notification event to all
     * <code>TableModelListeners</code> that registered
     * themselves as listeners for this table model.
     *
     * @param e  the event to be forwarded
     *
     * @see #addTableModelListener
     * @see TableModelEvent
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public void fireTableCellUpdated(int row, int column) {

    /**
     * Notifies all listeners that the value of the cell at
     * <code>[row, column]</code> has been updated.
     *
     * @param row  row of cell which has been updated
     * @param column  column of cell which has been updated
     * @see TableModelEvent
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public void fireTableRowsDeleted(int firstRow, int lastRow) {

    /**
     * Notifies all listeners that rows in the range
     * <code>[firstRow, lastRow]</code>, inclusive, have been deleted.
     *
     * @param firstRow  the first row
     * @param lastRow   the last row
     *
     * @see TableModelEvent
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public void fireTableRowsUpdated(int firstRow, int lastRow) {

    /**
     * Notifies all listeners that rows in the range
     * <code>[firstRow, lastRow]</code>, inclusive, have been updated.
     *
     * @param firstRow  the first row
     * @param lastRow   the last row
     *
     * @see TableModelEvent
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public void fireTableRowsInserted(int firstRow, int lastRow) {

    /**
     * Notifies all listeners that rows in the range
     * <code>[firstRow, lastRow]</code>, inclusive, have been inserted.
     *
     * @param  firstRow  the first row
     * @param  lastRow   the last row
     *
     * @see TableModelEvent
     * @see EventListenerList
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public void fireTableStructureChanged() {

    /**
     * Notifies all listeners that the table's structure has changed.
     * The number of columns in the table, and the names and types of
     * the new columns may be different from the previous state.
     * If the <code>JTable</code> receives this event and its
     * <code>autoCreateColumnsFromModel</code>
     * flag is set it discards any table columns that it had and reallocates
     * default columns in the order they appear in the model. This is the
     * same as calling <code>setModel(TableModel)</code> on the
     * <code>JTable</code>.
     *
     * @see TableModelEvent
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public void fireTableDataChanged() {

    /**
     * Notifies all listeners that all cell values in the table's
     * rows may have changed. The number of rows may also have changed
     * and the <code>JTable</code> should redraw the
     * table from scratch. The structure of the table (as in the order of the
     * columns) is assumed to be the same.
     *
     * @see TableModelEvent
     * @see EventListenerList
     * @see javax.swing.JTable#tableChanged(TableModelEvent)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public TableModelListener[] getTableModelListeners() {

    /**
     * Returns an array of all the table model listeners
     * registered on this model.
     *
     * @return all of this model's <code>TableModelListener</code>s
     *         or an empty
     *         array if no table model listeners are currently registered
     *
     * @see #addTableModelListener
     * @see #removeTableModelListener
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public void removeTableModelListener(TableModelListener l) {

    /**
     * Removes a listener from the list that's notified each time a
     * change to the data model occurs.
     *
     * @param   l               the TableModelListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public void addTableModelListener(TableModelListener l) {

    /**
     * Adds a listener to the list that's notified each time a change
     * to the data model occurs.
     *
     * @param   l               the TableModelListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    /**
     *  This empty implementation is provided so users don't have to implement
     *  this method if their data model is not editable.
     *
     *  @param  aValue   value to assign to cell
     *  @param  rowIndex   row of cell
     *  @param  columnIndex  column of cell
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public boolean isCellEditable(int rowIndex, int columnIndex) {

    /**
     *  Returns false.  This is the default implementation for all cells.
     *
     *  @param  rowIndex  the row being queried
     *  @param  columnIndex the column being queried
     *  @return false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public Class<?> getColumnClass(int columnIndex) {

    /**
     *  Returns <code>Object.class</code> regardless of <code>columnIndex</code>.
     *
     *  @param columnIndex  the column being queried
     *  @return the Object.class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public int findColumn(String columnName) {

    /**
     * Returns a column given its name.
     * Implementation is naive so this should be overridden if
     * this method is to be called often. This method is not
     * in the <code>TableModel</code> interface and is not used by the
     * <code>JTable</code>.
     *
     * @param columnName string containing name of column to be located
     * @return the column with <code>columnName</code>, or -1 if not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    public String getColumnName(int column) {

    /**
     *  Returns a default name for the column using spreadsheet conventions:
     *  A, B, C, ... Z, AA, AB, etc.  If <code>column</code> cannot be found,
     *  returns an empty string.
     *
     * @param column  the column being queried
     * @return a string containing the default name of <code>column</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
    protected EventListenerList listenerList = new EventListenerList();

    /** List of listeners */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/AbstractTableModel.java
public abstract class AbstractTableModel implements TableModel, Serializable

/**
 *  This abstract class provides default implementations for most of
 *  the methods in the <code>TableModel</code> interface. It takes care of
 *  the management of listeners and provides some conveniences for generating
 *  <code>TableModelEvents</code> and dispatching them to the listeners.
 *  To create a concrete <code>TableModel</code> as a subclass of
 *  <code>AbstractTableModel</code> you need only provide implementations
 *  for the following three methods:
 *
 *  <pre>
 *  public int getRowCount();
 *  public int getColumnCount();
 *  public Object getValueAt(int row, int column);
 *  </pre>
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
 * @author Alan Chung
 * @author Philip Milne
 */
