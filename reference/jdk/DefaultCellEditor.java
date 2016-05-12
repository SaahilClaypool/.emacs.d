_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
        public void itemStateChanged(ItemEvent e) {

       /**
        * When an item's state changes, editing is ended.
        * @param e the action event
        * @see #stopCellEditing
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
        public void actionPerformed(ActionEvent e) {

       /**
        * When an action is performed, editing is ended.
        * @param e the action event
        * @see #stopCellEditing
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
       public void cancelCellEditing() {

       /**
        * Cancels editing.  This method calls <code>fireEditingCanceled</code>.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
        public boolean stopCellEditing() {

       /**
        * Stops editing and
        * returns true to indicate that editing has stopped.
        * This method calls <code>fireEditingStopped</code>.
        *
        * @return  true
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
        public boolean startCellEditing(EventObject anEvent) {

       /**
        * Returns true to indicate that editing has begun.
        *
        * @param anEvent          the event
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
        public boolean shouldSelectCell(EventObject anEvent) {

       /**
        * Returns true to indicate that the editing cell may
        * be selected.
        *
        * @param   anEvent         the event
        * @return  true
        * @see #isCellEditable
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
        public boolean isCellEditable(EventObject anEvent) {

       /**
        * Returns true if <code>anEvent</code> is <b>not</b> a
        * <code>MouseEvent</code>.  Otherwise, it returns true
        * if the necessary number of clicks have occurred, and
        * returns false otherwise.
        *
        * @param   anEvent         the event
        * @return  true  if cell is ready for editing, false otherwise
        * @see #setClickCountToStart
        * @see #shouldSelectCell
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
        public void setValue(Object value) {

       /**
        * Sets the value of this cell.
        * @param value the new value of this cell
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
        public Object getCellEditorValue() {

       /**
        * Returns the value of this cell.
        * @return the value of this cell
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
        protected Object value;

        /**  The value of this cell. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    protected class EditorDelegate implements ActionListener, ItemListener, Serializable {

    /**
     * The protected <code>EditorDelegate</code> class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    public Component getTableCellEditorComponent(JTable table, Object value,
                                                 boolean isSelected,
                                                 int row, int column) {

    /** Implements the <code>TableCellEditor</code> interface. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    public Component getTreeCellEditorComponent(JTree tree, Object value,
                                                boolean isSelected,
                                                boolean expanded,
                                                boolean leaf, int row) {

    /** Implements the <code>TreeCellEditor</code> interface. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    public void cancelCellEditing() {

    /**
     * Forwards the message from the <code>CellEditor</code> to
     * the <code>delegate</code>.
     * @see EditorDelegate#cancelCellEditing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    public boolean stopCellEditing() {

    /**
     * Forwards the message from the <code>CellEditor</code> to
     * the <code>delegate</code>.
     * @see EditorDelegate#stopCellEditing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    public boolean shouldSelectCell(EventObject anEvent) {

    /**
     * Forwards the message from the <code>CellEditor</code> to
     * the <code>delegate</code>.
     * @see EditorDelegate#shouldSelectCell(EventObject)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    public boolean isCellEditable(EventObject anEvent) {

    /**
     * Forwards the message from the <code>CellEditor</code> to
     * the <code>delegate</code>.
     * @see EditorDelegate#isCellEditable(EventObject)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    public Object getCellEditorValue() {

    /**
     * Forwards the message from the <code>CellEditor</code> to
     * the <code>delegate</code>.
     * @see EditorDelegate#getCellEditorValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    public int getClickCountToStart() {

    /**
     * Returns the number of clicks needed to start editing.
     * @return the number of clicks needed to start editing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    public void setClickCountToStart(int count) {

    /**
     * Specifies the number of clicks needed to start editing.
     *
     * @param count  an int specifying the number of clicks needed to start editing
     * @see #getClickCountToStart
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    public Component getComponent() {

    /**
     * Returns a reference to the editor component.
     *
     * @return the editor <code>Component</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    public DefaultCellEditor(final JComboBox comboBox) {

    /**
     * Constructs a <code>DefaultCellEditor</code> object that uses a
     * combo box.
     *
     * @param comboBox  a <code>JComboBox</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    public DefaultCellEditor(final JCheckBox checkBox) {

    /**
     * Constructs a <code>DefaultCellEditor</code> object that uses a check box.
     *
     * @param checkBox  a <code>JCheckBox</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    @ConstructorProperties({"component"})

    /**
     * Constructs a <code>DefaultCellEditor</code> that uses a text field.
     *
     * @param textField  a <code>JTextField</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    protected int clickCountToStart = 1;

    /**
     * An integer specifying the number of clicks needed to start editing.
     * Even if <code>clickCountToStart</code> is defined as zero, it
     * will not initiate until a click occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
    protected JComponent editorComponent;

    /** The Swing component being edited. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultCellEditor.java
public class DefaultCellEditor extends AbstractCellEditor

/**
 * The default editor for table and tree cells.
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
