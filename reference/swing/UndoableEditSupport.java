_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoableEditSupport.java
    public String toString() {

    /**
     * Returns a string that displays and identifies this
     * object's properties.
     *
     * @return a <code>String</code> representation of this object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoableEditSupport.java
    public synchronized void endUpdate() {

    /**
     * DEADLOCK WARNING: Calling this method may call
     * <code>undoableEditHappened</code> in all listeners.
     * It is unwise to call this method from one of its listeners.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoableEditSupport.java
    protected CompoundEdit createCompoundEdit() {

    /**
     * Called only from <code>beginUpdate</code>.
     * Exposed here for subclasses' use.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoableEditSupport.java
    public synchronized void beginUpdate() {

    /**
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoableEditSupport.java
    public int getUpdateLevel() {

    /**
     * Returns the update level value.
     *
     * @return an integer representing the update level
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoableEditSupport.java
    public synchronized void postEdit(UndoableEdit e) {

    /**
     * DEADLOCK WARNING: Calling this method may call
     * <code>undoableEditHappened</code> in all listeners.
     * It is unwise to call this method from one of its listeners.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoableEditSupport.java
    protected void _postEdit(UndoableEdit e) {

    /**
     * Called only from <code>postEdit</code> and <code>endUpdate</code>. Calls
     * <code>undoableEditHappened</code> in all listeners. No synchronization
     * is performed here, since the two calling methods are synchronized.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoableEditSupport.java
    public synchronized UndoableEditListener[] getUndoableEditListeners() {

    /**
     * Returns an array of all the <code>UndoableEditListener</code>s added
     * to this UndoableEditSupport with addUndoableEditListener().
     *
     * @return all of the <code>UndoableEditListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoableEditSupport.java
    public synchronized void removeUndoableEditListener(UndoableEditListener l)

    /**
     * Removes an <code>UndoableEditListener</code>.
     *
     * @param l  the <code>UndoableEditListener</code> object to be removed
     * @see #addUndoableEditListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoableEditSupport.java
    public synchronized void addUndoableEditListener(UndoableEditListener l) {

    /**
     * Registers an <code>UndoableEditListener</code>.
     * The listener is notified whenever an edit occurs which can be undone.
     *
     * @param l  an <code>UndoableEditListener</code> object
     * @see #removeUndoableEditListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoableEditSupport.java
    public UndoableEditSupport(Object r) {

    /**
     * Constructs an <code>UndoableEditSupport</code> object.
     *
     * @param r  an <code>Object</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoableEditSupport.java
    public UndoableEditSupport() {

    /**
     * Constructs an <code>UndoableEditSupport</code> object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoableEditSupport.java
public class UndoableEditSupport {

/**
 * A support class used for managing <code>UndoableEdit</code> listeners.
 *
 * @author Ray Ryan
 */
