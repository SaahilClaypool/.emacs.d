_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    protected void recalcWidthCache() {

    /**
     * Recalculates the total combined width of all columns.  Updates the
     * <code>totalColumnWidth</code> property.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    protected ListSelectionModel createSelectionModel() {

    /**
     * Creates a new default list selection model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public void valueChanged(ListSelectionEvent e) {

    /**
     * A <code>ListSelectionListener</code> that forwards
     * <code>ListSelectionEvents</code> when there is a column
     * selection change.
     *
     * @param e  the change event
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public void propertyChange(PropertyChangeEvent evt) {

    /**
     * Property Change Listener change method.  Used to track changes
     * to the column width or preferred column width.
     *
     * @param  evt  <code>PropertyChangeEvent</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this model.
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
     * <code>DefaultTableColumnModel</code> <code>m</code>
     * for its column model listeners with the following code:
     *
     * <pre>ColumnModelListener[] cmls = (ColumnModelListener[])(m.getListeners(ColumnModelListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this model,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getColumnModelListeners
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    protected void fireColumnMarginChanged() {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    protected void fireColumnSelectionChanged(ListSelectionEvent e) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     * @param e the event received
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    protected void fireColumnMoved(TableColumnModelEvent e) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     * @param  e the event received
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    protected void fireColumnRemoved(TableColumnModelEvent e) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     * @param  e  the event received
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    protected void fireColumnAdded(TableColumnModelEvent e) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     * @param e  the event received
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public TableColumnModelListener[] getColumnModelListeners() {

    /**
     * Returns an array of all the column model listeners
     * registered on this model.
     *
     * @return all of this default table column model's <code>ColumnModelListener</code>s
     *         or an empty
     *         array if no column model listeners are currently registered
     *
     * @see #addColumnModelListener
     * @see #removeColumnModelListener
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public void removeColumnModelListener(TableColumnModelListener x) {

    /**
     * Removes a listener for table column model events.
     * @param x  a <code>TableColumnModelListener</code> object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public void addColumnModelListener(TableColumnModelListener x) {

    /**
     * Adds a listener for table column model events.
     * @param x  a <code>TableColumnModelListener</code> object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public int getSelectedColumnCount() {

    /**
     * Returns the number of columns selected.
     * @return the number of columns selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public int[] getSelectedColumns() {

    /**
     * Returns an array of selected columns.  If <code>selectionModel</code>
     * is <code>null</code>, returns an empty array.
     * @return an array of selected columns or an empty array if nothing
     *                  is selected or the <code>selectionModel</code> is
     *                  <code>null</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public boolean getColumnSelectionAllowed() {

    /**
     * Returns true if column selection is allowed, otherwise false.
     * The default is false.
     * @return the <code>columnSelectionAllowed</code> property
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public void setColumnSelectionAllowed(boolean flag) {

    /**
     * Sets whether column selection is allowed.  The default is false.
     * @param  flag true if column selection will be allowed, false otherwise
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public ListSelectionModel getSelectionModel() {

    /**
     * Returns the <code>ListSelectionModel</code> that is used to
     * maintain column selection state.
     *
     * @return  the object that provides column selection state.  Or
     *          <code>null</code> if row selection is not allowed.
     * @see     #setSelectionModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public void setSelectionModel(ListSelectionModel newModel) {

    /**
     *  Sets the selection model for this <code>TableColumnModel</code>
     *  to <code>newModel</code>
     *  and registers for listener notifications from the new selection
     *  model.  If <code>newModel</code> is <code>null</code>,
     *  an exception is thrown.
     *
     * @param   newModel        the new selection model
     * @exception IllegalArgumentException      if <code>newModel</code>
     *                                          is <code>null</code>
     * @see     #getSelectionModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public int getTotalColumnWidth() {

    /**
     * Returns the total combined width of all columns.
     * @return the <code>totalColumnWidth</code> property
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public int getColumnIndexAtX(int x) {

    /**
     * Returns the index of the column that lies at position <code>x</code>,
     * or -1 if no column covers this point.
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
     * @param  x  the horizontal location of interest
     * @return  the index of the column or -1 if no column is found
     * @see javax.swing.JTable#columnAtPoint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public int getColumnMargin() {

    /**
     * Returns the width margin for <code>TableColumn</code>.
     * The default <code>columnMargin</code> is 1.
     *
     * @return  the maximum width for the <code>TableColumn</code>
     * @see     #setColumnMargin
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public TableColumn getColumn(int columnIndex) {

    /**
     * Returns the <code>TableColumn</code> object for the column
     * at <code>columnIndex</code>.
     *
     * @param   columnIndex     the index of the column desired
     * @return  the <code>TableColumn</code> object for the column
     *                          at <code>columnIndex</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public int getColumnIndex(Object identifier) {

    /**
     * Returns the index of the first column in the <code>tableColumns</code>
     * array whose identifier is equal to <code>identifier</code>,
     * when compared using <code>equals</code>.
     *
     * @param           identifier              the identifier object
     * @return          the index of the first column in the
     *                  <code>tableColumns</code> array whose identifier
     *                  is equal to <code>identifier</code>
     * @exception       IllegalArgumentException  if <code>identifier</code>
     *                          is <code>null</code>, or if no
     *                          <code>TableColumn</code> has this
     *                          <code>identifier</code>
     * @see             #getColumn
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public Enumeration<TableColumn> getColumns() {

    /**
     * Returns an <code>Enumeration</code> of all the columns in the model.
     * @return an <code>Enumeration</code> of the columns in the model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public int getColumnCount() {

    /**
     * Returns the number of columns in the <code>tableColumns</code> array.
     *
     * @return  the number of columns in the <code>tableColumns</code> array
     * @see     #getColumns
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public void setColumnMargin(int newMargin) {

    /**
     * Sets the column margin to <code>newMargin</code>.  This method
     * also posts a <code>columnMarginChanged</code> event to its
     * listeners.
     *
     * @param   newMargin               the new margin width, in pixels
     * @see     #getColumnMargin
     * @see     #getTotalColumnWidth
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public void moveColumn(int columnIndex, int newIndex) {

    /**
     * Moves the column and heading at <code>columnIndex</code> to
     * <code>newIndex</code>.  The old column at <code>columnIndex</code>
     * will now be found at <code>newIndex</code>.  The column
     * that used to be at <code>newIndex</code> is shifted
     * left or right to make room.  This will not move any columns if
     * <code>columnIndex</code> equals <code>newIndex</code>.  This method
     * also posts a <code>columnMoved</code> event to its listeners.
     *
     * @param   columnIndex                     the index of column to be moved
     * @param   newIndex                        new index to move the column
     * @exception IllegalArgumentException      if <code>column</code> or
     *                                          <code>newIndex</code>
     *                                          are not in the valid range
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public void removeColumn(TableColumn column) {

    /**
     *  Deletes the <code>column</code> from the
     *  <code>tableColumns</code> array.  This method will do nothing if
     *  <code>column</code> is not in the table's columns list.
     *  <code>tile</code> is called
     *  to resize both the header and table views.
     *  This method also posts a <code>columnRemoved</code>
     *  event to its listeners.
     *
     * @param   column          the <code>TableColumn</code> to be removed
     * @see     #addColumn
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public void addColumn(TableColumn aColumn) {

    /**
     *  Appends <code>aColumn</code> to the end of the
     *  <code>tableColumns</code> array.
     *  This method also posts the <code>columnAdded</code>
     *  event to its listeners.
     *
     * @param   aColumn         the <code>TableColumn</code> to be added
     * @exception IllegalArgumentException      if <code>aColumn</code> is
     *                          <code>null</code>
     * @see     #removeColumn
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    public DefaultTableColumnModel() {

    /**
     * Creates a default table column model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    protected int totalColumnWidth;

    /** A local cache of the combined width of all columns */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    protected boolean columnSelectionAllowed;

    /** Column selection allowed in this column model */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    transient protected ChangeEvent changeEvent = null;

    /** Change event (only one needed) */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    protected EventListenerList listenerList = new EventListenerList();

    /** List of TableColumnModelListener */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    protected int columnMargin;

    /** Width margin between each column */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    protected ListSelectionModel selectionModel;

    /** Model for keeping track of column selections */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
    protected Vector<TableColumn> tableColumns;

    /** Array of TableColumn objects in this model */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//table/DefaultTableColumnModel.java
public class DefaultTableColumnModel implements TableColumnModel,

/**
 * The standard column-handler for a <code>JTable</code>.
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
 * @see JTable
 */
