_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
    public BitSet getInitialSelection() {

    /**
     * Fetches the BitSet that represents the initial
     * set of selected items in the list.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
    public void setInitialSelection(int i) {

    /**
     * This method is responsible for storing the state
     * of the initial selection.  If the selectionMode
     * is the default, i.e allowing only for SINGLE_SELECTION,
     * then the very last OPTION that has the selected
     * attribute set wins.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
    public void setLeadSelectionIndex(int leadIndex) {

    /**
     * Set the lead selection index, ensuring that values between the
     * anchor and the new lead are either all selected or all deselected.
     * If the value at the anchor index is selected, first clear all the
     * values in the range [anchor, oldLeadIndex], then select all the values
     * values in the range [anchor, newLeadIndex], where oldLeadIndex is the old
     * leadIndex and newLeadIndex is the new one.
     * <p>
     * If the value at the anchor index is not selected, do the same thing in reverse,
     * selecting values in the old range and deselecting values in the new one.
     * <p>
     * Generate a single event for this change and notify all listeners.
     * For the purposes of generating minimal bounds in this event, do the
     * operation in a single pass; that way the first and last index inside the
     * ListSelectionEvent that is broadcast will refer to cells that actually
     * changed value because of this method. If, instead, this operation were
     * done in two steps the effect on the selection state would be the same
     * but two events would be generated and the bounds around the changed values
     * would be wider, including cells that had been first cleared and only
     * to later be set.
     * <p>
     * This method can be used in the mouseDragged() method of a UI class
     * to extend a selection.
     *
     * @see #getLeadSelectionIndex
     * @see #setAnchorSelectionIndex
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
    public void setAnchorSelectionIndex(int anchorIndex) {

    /**
     * Set the anchor selection index, leaving all selection values unchanged.
     *
     * @see #getAnchorSelectionIndex
     * @see #setLeadSelectionIndex
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
    public Object clone() throws CloneNotSupportedException {

    /**
     * Returns a clone of the receiver with the same selection.
     * <code>listenerLists</code> are not duplicated.
     *
     * @return a clone of the receiver
     * @exception CloneNotSupportedException if the receiver does not
     *    both (a) implement the <code>Cloneable</code> interface
     *    and (b) define a <code>clone</code> method
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
    public void removeIndexInterval(int index0, int index1)

    /**
     * Remove the indices in the interval index0,index1 (inclusive) from
     * the selection model.  This is typically called to sync the selection
     * model width a corresponding change in the data model.  Note
     * that (as always) index0 can be greater than index1.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
    public void insertIndexInterval(int index, int length, boolean before)

    /**
     * Insert length indices beginning before/after index. If the value
     * at index is itself selected, set all of the newly inserted
     * items, otherwise leave them unselected. This method is typically
     * called to sync the selection model with a corresponding change
     * in the data model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
    public boolean isLeadAnchorNotificationEnabled() {

    /**
     * Returns the value of the leadAnchorNotificationEnabled flag.
     * When leadAnchorNotificationEnabled is true the model
     * generates notification events with bounds that cover all the changes to
     * the selection plus the changes to the lead and anchor indices.
     * Setting the flag to false causes a norrowing of the event's bounds to
     * include only the elements that have been selected or deselected since
     * the last change. Either way, the model continues to maintain the lead
     * and anchor variables internally. The default is true.
     * @return          the value of the leadAnchorNotificationEnabled flag
     * @see             #setLeadAnchorNotificationEnabled(boolean)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
    public void setLeadAnchorNotificationEnabled(boolean flag) {

    /**
     * Sets the value of the leadAnchorNotificationEnabled flag.
     * @see             #isLeadAnchorNotificationEnabled()
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
    protected void fireValueChanged(int firstIndex, int lastIndex, boolean isAdjusting)

    /**
     * @param firstIndex The first index in the interval.
     * @param lastIndex The last index in the interval.
     * @param isAdjusting True if this is the final change in a series of them.
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
    protected void fireValueChanged(int firstIndex, int lastIndex) {

    /**
     * Notify ListSelectionListeners that the value of the selection,
     * in the closed interval firstIndex,lastIndex, has changed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
    protected void fireValueChanged(boolean isAdjusting) {

    /**
     * Notify listeners that we are beginning or ending a
     * series of value changes
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
    public ListSelectionListener[] getListSelectionListeners() {

    /**
     * Returns an array of all the <code>ListSelectionListener</code>s added
     * to this OptionListModel with addListSelectionListener().
     *
     * @return all of the <code>ListSelectionListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/OptionListModel.java
class OptionListModel<E> extends DefaultListModel<E> implements ListSelectionModel, Serializable {

/**
 * This class extends DefaultListModel, and also implements
 * the ListSelectionModel interface, allowing for it to store state
 * relevant to a SELECT form element which is implemented as a List.
 * If SELECT has a size attribute whose value is greater than 1,
 * or if allows multiple selection then a JList is used to
 * represent it and the OptionListModel is used as its model.
 * It also stores the initial state of the JList, to ensure an
 * accurate reset, if the user requests a reset of the form.
 *
  @author Sunita Mani
 */
