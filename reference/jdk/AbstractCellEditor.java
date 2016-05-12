_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractCellEditor.java
    protected void fireEditingCanceled() {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is created lazily.
     *
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractCellEditor.java
    protected void fireEditingStopped() {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is created lazily.
     *
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractCellEditor.java
    public CellEditorListener[] getCellEditorListeners() {

    /**
     * Returns an array of all the <code>CellEditorListener</code>s added
     * to this AbstractCellEditor with addCellEditorListener().
     *
     * @return all of the <code>CellEditorListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractCellEditor.java
    public void removeCellEditorListener(CellEditorListener l) {

    /**
     * Removes a <code>CellEditorListener</code> from the listener list.
     * @param l  the listener to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractCellEditor.java
    public void addCellEditorListener(CellEditorListener l) {

    /**
     * Adds a <code>CellEditorListener</code> to the listener list.
     * @param l  the new listener to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractCellEditor.java
    public void  cancelCellEditing() {

    /**
     * Calls <code>fireEditingCanceled</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractCellEditor.java
    public boolean stopCellEditing() {

    /**
     * Calls <code>fireEditingStopped</code> and returns true.
     * @return true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractCellEditor.java
    public boolean shouldSelectCell(EventObject anEvent) {

    /**
     * Returns true.
     * @param anEvent  an event object
     * @return true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractCellEditor.java
    public boolean isCellEditable(EventObject e) {

    /**
     * Returns true.
     * @param e  an event object
     * @return true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/AbstractCellEditor.java
public abstract class AbstractCellEditor implements CellEditor, Serializable {

/**
 *
 * A base class for <code>CellEditors</code>, providing default
 * implementations for the methods in the <code>CellEditor</code>
 * interface except <code>getCellEditorValue()</code>.
 * Like the other abstract implementations in Swing, also manages a list
 * of listeners.
 *
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
 * @author Philip Milne
 * @since 1.3
 */
