_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
            public AccessibleComponent getAccessibleComponent() {

           /**
            * Get the AccessibleComponent associated with this object.  In the
            * implementation of the Java Accessibility API for this class,
            * return this object, which is responsible for implementing the
            * AccessibleComponent interface on behalf of itself.
            *
            * @return this object
            */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
            public AccessibleContext getAccessibleContext() {

            /**
             * Get the AccessibleContext associated with this object.
             * In the implementation of the Java Accessibility API
             * for this class, returns this object, which serves as
             * its own AccessibleContext.
             *
             * @return this object
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
            public AccessibleJTableHeaderEntry(int c, JTableHeader p, JTable t) {

            /**
             *  Constructs an AccessiblJTableHeaaderEntry
             * @since 1.4
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
        protected class AccessibleJTableHeaderEntry extends AccessibleContext

      /**
       * This class provides an implementation of the Java Accessibility
       * API appropriate for JTableHeader entries.
       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Return the nth Accessible child of the object.
         *
         * @param i zero-based index of child
         * @return the nth Accessible child of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children in the object.  If all
         * of the children of this object implement Accessible, than this
         * method should return the number of children of this object.
         *
         * @return the number of accessible children in the object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
        public Accessible getAccessibleAt(Point p) {

        /**
         * Returns the Accessible child, if one exists, contained at the local
         * coordinate Point.
         *
         * @param p The point defining the top-left corner of the Accessible,
         * given in the coordinate space of the object's parent.
         * @return the Accessible, if it exists, at the specified location;
         * else null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    protected class AccessibleJTableHeader extends AccessibleJComponent {

    /**
     * This class implements accessibility support for the
     * <code>JTableHeader</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to table header user-interface
     * elements.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this JTableHeader.
     * For JTableHeaders, the AccessibleContext takes the form of an
     * AccessibleJTableHeader.
     * A new AccessibleJTableHeader instance is created if necessary.
     *
     * @return an AccessibleJTableHeader that serves as the
     *         AccessibleContext of this JTableHeader
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JTableHeader</code>. This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     * <P>
     * Overriding <code>paramString</code> to provide information about the
     * specific new aspects of the JFC components.
     *
     * @return  a string representation of this <code>JTableHeader</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See <code>readObject</code> and <code>writeObject</code> in
     * <code>JComponent</code> for more
     * information about serialization in Swing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void setResizingColumn(TableColumn aColumn) {

    /**
      *  Sets the header's <code>resizingColumn</code> to <code>aColumn</code>.
      *  <p>
      *  Application code will not use this method explicitly, it
      *  is used internally by the column sizing mechanism.
      *
      *  @param  aColumn  the column being resized, or <code>null</code> if
      *                 no column is being resized
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void setDraggedDistance(int distance) {

    /**
      *  Sets the header's <code>draggedDistance</code> to <code>distance</code>.
      *  @param distance  the distance dragged
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void setDraggedColumn(TableColumn aColumn) {

    /**
      *  Sets the header's <code>draggedColumn</code> to <code>aColumn</code>.
      *  <p>
      *  Application code will not use this method explicitly, it is used
      *  internally by the column dragging mechanism.
      *
      *  @param  aColumn  the column being dragged, or <code>null</code> if
      *                 no column is being dragged
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void resizeAndRepaint() {

    /**
     * Sizes the header and marks it as needing display.  Equivalent
     * to <code>revalidate</code> followed by <code>repaint</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    protected void initializeLocalVars() {

    /**
     * Initializes the local variables and properties with default values.
     * Used by the constructor methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    protected TableCellRenderer createDefaultRenderer() {

    /**
     *  Returns a default renderer to be used when no header renderer
     *  is defined by a <code>TableColumn</code>.
     *
     *  @return the default table column renderer
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    protected TableColumnModel createDefaultColumnModel() {

    /**
     *  Returns the default column model object which is
     *  a <code>DefaultTableColumnModel</code>.  A subclass can override this
     *  method to return a different column model object
     *
     * @return the default column model object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void columnSelectionChanged(ListSelectionEvent e) { } // repaint(); }

    /**
     * Invoked when the selection model of the <code>TableColumnModel</code>
     * is changed.  This method currently has no effect (the header is not
     * redrawn).
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by <code>JTable</code>.
     *
     * @param e the event received
     * @see TableColumnModelListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void columnMarginChanged(ChangeEvent e) { resizeAndRepaint(); }

    /**
     * Invoked when a column is moved due to a margin change.
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by <code>JTable</code>.
     *
     * @param e the event received
     * @see TableColumnModelListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void columnMoved(TableColumnModelEvent e) { repaint(); }

    /**
     * Invoked when a column is repositioned.
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by <code>JTable</code>.
     *
     * @param e the event received
     * @see TableColumnModelListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void columnRemoved(TableColumnModelEvent e) { resizeAndRepaint(); }

    /**
     * Invoked when a column is removed from the table column model.
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by <code>JTable</code>.
     *
     * @param e  the event received
     * @see TableColumnModelListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void columnAdded(TableColumnModelEvent e) { resizeAndRepaint(); }

    /**
     * Invoked when a column is added to the table column model.
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by <code>JTable</code>.
     *
     * @param e  the event received
     * @see TableColumnModelListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public TableColumnModel getColumnModel() {

    /**
     * Returns the <code>TableColumnModel</code> that contains all column information
     * of this table header.
     *
     * @return  the <code>columnModel</code> property
     * @see     #setColumnModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void setColumnModel(TableColumnModel columnModel) {

    /**
     *  Sets the column model for this table to <code>newModel</code> and registers
     *  for listener notifications from the new column model.
     *
     * @param   columnModel     the new data source for this table
     * @exception IllegalArgumentException
     *                          if <code>newModel</code> is <code>null</code>
     * @see     #getColumnModel
     * @beaninfo
     *  bound: true
     *  description: The object governing the way columns appear in the view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public String getUIClassID() {

    /**
     * Returns the suffix used to construct the name of the look and feel
     * (L&amp;F) class used to render this component.
     * @return the string "TableHeaderUI"
     *
     * @return "TableHeaderUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void updateUI(){

    /**
     * Notification from the <code>UIManager</code> that the look and feel
     * (L&amp;F) has changed.
     * Replaces the current UI object with the latest version from the
     * <code>UIManager</code>.
     *
     * @see JComponent#updateUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void setUI(TableHeaderUI ui){

    /**
     * Sets the look and feel (L&amp;F) object that renders this component.
     *
     * @param ui  the <code>TableHeaderUI</code> L&amp;F object
     * @see UIDefaults#getUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public TableHeaderUI getUI() {

    /**
     * Returns the look and feel (L&amp;F) object that renders this component.
     *
     * @return the <code>TableHeaderUI</code> object that renders this component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public String getToolTipText(MouseEvent event) {

    /**
     * Allows the renderer's tips to be used if there is text set.
     * @param  event  the location of the event identifies the proper
     *                          renderer and, therefore, the proper tip
     * @return the tool tip for this component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public Rectangle getHeaderRect(int column) {

    /**
     * Returns the rectangle containing the header tile at <code>column</code>.
     * When the <code>column</code> parameter is out of bounds this method uses the
     * same conventions as the <code>JTable</code> method <code>getCellRect</code>.
     *
     * @return  the rectangle containing the header tile at <code>column</code>
     * @see JTable#getCellRect
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public int columnAtPoint(Point point) {

    /**
     * Returns the index of the column that <code>point</code> lies in, or -1 if it
     * lies out of bounds.
     *
     * @return  the index of the column that <code>point</code> lies in, or -1 if it
     *          lies out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    @Transient

    /**
     * Returns the default renderer used when no <code>headerRenderer</code>
     * is defined by a <code>TableColumn</code>.
     * @return the default renderer
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void setDefaultRenderer(TableCellRenderer defaultRenderer) {

    /**
     * Sets the default renderer to be used when no <code>headerRenderer</code>
     * is defined by a <code>TableColumn</code>.
     * @param  defaultRenderer  the default renderer
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    /*

    /**
     * Obsolete as of Java 2 platform v1.3.  Real time repaints, in response to
     * column dragging or resizing, are now unconditional.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    /*

    /**
     * Obsolete as of Java 2 platform v1.3.  Real time repaints, in response to
     * column dragging or resizing, are now unconditional.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public TableColumn getResizingColumn() {

    /**
     * Returns the resizing column.  If no column is being
     * resized this method returns <code>null</code>.
     *
     * @return  the resizing column, if a resize is in process, otherwise
     *          returns <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public int getDraggedDistance() {

    /**
     * Returns the column's horizontal distance from its original
     * position, if and only if, a drag is in process. Otherwise, the
     * the return value is meaningless.
     *
     * @return  the column's horizontal distance from its original
     *          position, if a drag is in process, otherwise the return
     *          value is meaningless
     * @see     #getDraggedColumn
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public TableColumn getDraggedColumn() {

    /**
     * Returns the the dragged column, if and only if, a drag is in
     * process, otherwise returns <code>null</code>.
     *
     * @return  the dragged column, if a drag is in
     *          process, otherwise returns <code>null</code>
     * @see     #getDraggedDistance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public boolean getResizingAllowed() {

    /**
     * Returns true if the user is allowed to resize columns by dragging
     * between their headers, false otherwise. The default is true. You can
     * resize columns programmatically regardless of this setting.
     *
     * @return  the <code>resizingAllowed</code> property
     * @see     #setResizingAllowed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void setResizingAllowed(boolean resizingAllowed) {

    /**
     *  Sets whether the user can resize columns by dragging between headers.
     *
     * @param   resizingAllowed         true if table view should allow
     *                                  resizing
     * @see     #getResizingAllowed
     * @beaninfo
     *  bound: true
     *  description: Whether the user can resize columns by dragging between headers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public boolean getReorderingAllowed() {

    /**
     * Returns true if the user is allowed to rearrange columns by
     * dragging their headers, false otherwise. The default is true. You can
     * rearrange columns programmatically regardless of this setting.
     *
     * @return  the <code>reorderingAllowed</code> property
     * @see     #setReorderingAllowed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void setReorderingAllowed(boolean reorderingAllowed) {

    /**
     *  Sets whether the user can drag column headers to reorder columns.
     *
     * @param   reorderingAllowed       true if the table view should allow
     *                                  reordering; otherwise false
     * @see     #getReorderingAllowed
     * @beaninfo
     *  bound: true
     *  description: Whether the user can drag column headers to reorder columns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public JTable getTable() {

    /**
      *  Returns the table associated with this header.
      *  @return  the <code>table</code> property
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public void setTable(JTable table) {

    /**
     *  Sets the table associated with this header.
     *  @param  table   the new table
     *  @beaninfo
     *   bound: true
     *   description: The table associated with this header.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public JTableHeader(TableColumnModel cm) {

    /**
     *  Constructs a <code>JTableHeader</code> which is initialized with
     *  <code>cm</code> as the column model.  If <code>cm</code> is
     *  <code>null</code> this method will initialize the table header
     *  with a default <code>TableColumnModel</code>.
     *
     * @param cm        the column model for the table
     * @see #createDefaultColumnModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    public JTableHeader() {

    /**
     *  Constructs a <code>JTableHeader</code> with a default
     *  <code>TableColumnModel</code>.
     *
     * @see #createDefaultColumnModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    private TableCellRenderer defaultRenderer;

    /**
      *  The default renderer to be used when a <code>TableColumn</code>
      *  does not define a <code>headerRenderer</code>.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    transient protected int     draggedDistance;

    /** The distance from its original position the column has been dragged. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    transient protected TableColumn     draggedColumn;

    /** The index of the column being dragged. <code>null</code> if not dragging. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    transient protected TableColumn     resizingColumn;

    /** The index of the column being resized. <code>null</code> if not resizing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    /*

    /**
     * Obsolete as of Java 2 platform v1.3.  Real time repaints, in response
     * to column dragging or resizing, are now unconditional.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    protected boolean   resizingAllowed;

    /**
     * If true, resizing of columns are allowed by the user;
     * the default is true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    protected boolean   reorderingAllowed;

    /**
     * If true, reordering of columns are allowed by the user;
     * the default is true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    protected TableColumnModel  columnModel;

    /**
     * The <code>TableColumnModel</code> of the table header.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    protected JTable table;

    /**
     * The table for which this object is the header;
     * the default is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
    private static final String uiClassID = "TableHeaderUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/table/JTableHeader.java
public class JTableHeader extends JComponent implements TableColumnModelListener, Accessible

/**
 * This is the object which manages the header of the <code>JTable</code>.
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
 * @see javax.swing.JTable
 */
