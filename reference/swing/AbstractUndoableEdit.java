_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    public String toString()

    /**
     * Returns a string that displays and identifies this
     * object's properties.
     *
     * @return a String representation of this object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    public String getRedoPresentationName() {

    /**
     * Retreives the value from the defaults table with key
     * <code>AbstractUndoableEdit.redoText</code> and returns
     * that value followed by a space, followed by
     * <code>getPresentationName</code>.
     * If <code>getPresentationName</code> returns "",
     * then the defaults value is returned alone.
     *
     * @return the value from the defaults table with key
     *    <code>AbstractUndoableEdit.redoText</code>, followed
     *    by a space, followed by <code>getPresentationName</code>
     *    unless <code>getPresentationName</code> is "" in which
     *    case, the defaults value is returned alone.
     * @see #getPresentationName
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    public String getUndoPresentationName() {

    /**
     * Retreives the value from the defaults table with key
     * <code>AbstractUndoableEdit.undoText</code> and returns
     * that value followed by a space, followed by
     * <code>getPresentationName</code>.
     * If <code>getPresentationName</code> returns "",
     * then the defaults value is returned alone.
     *
     * @return the value from the defaults table with key
     *    <code>AbstractUndoableEdit.undoText</code>, followed
     *    by a space, followed by <code>getPresentationName</code>
     *    unless <code>getPresentationName</code> is "" in which
     *    case, the defaults value is returned alone.
     * @see #getPresentationName
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    public String getPresentationName() {

    /**
     * This default implementation returns "". Used by
     * <code>getUndoPresentationName</code> and
     * <code>getRedoPresentationName</code> to
     * construct the strings they return. Subclasses should override to
     * return an appropriate description of the operation this edit
     * represents.
     *
     * @return the empty string ""
     *
     * @see     #getUndoPresentationName
     * @see     #getRedoPresentationName
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    public boolean isSignificant() {

    /**
     * This default implementation returns true.
     *
     * @return true
     * @see UndoableEdit#isSignificant
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    public boolean replaceEdit(UndoableEdit anEdit) {

    /**
     * This default implementation returns false.
     *
     * @param anEdit the edit to replace
     * @return false
     *
     * @see UndoableEdit#replaceEdit
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    public boolean addEdit(UndoableEdit anEdit) {

    /**
     * This default implementation returns false.
     *
     * @param anEdit the edit to be added
     * @return false
     *
     * @see UndoableEdit#addEdit
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    public boolean canRedo() {

    /**
     * Returns <code>true</code> if this edit is <code>alive</code>
     * and <code>hasBeenDone</code> is <code>false</code>.
     *
     * @return <code>true</code> if this edit is <code>alive</code>
     *   and <code>hasBeenDone</code> is <code>false</code>
     * @see     #die
     * @see     #undo
     * @see     #redo
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    public void redo() throws CannotRedoException {

    /**
     * Throws <code>CannotRedoException</code> if <code>canRedo</code>
     * returns false. Sets <code>hasBeenDone</code> to <code>true</code>.
     * Subclasses should override to redo the operation represented by
     * this edit. Override should begin with a call to super.
     *
     * @exception CannotRedoException if <code>canRedo</code>
     *     returns <code>false</code>
     * @see     #canRedo
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    public boolean canUndo() {

    /**
     * Returns true if this edit is <code>alive</code>
     * and <code>hasBeenDone</code> is <code>true</code>.
     *
     * @return true if this edit is <code>alive</code>
     *    and <code>hasBeenDone</code> is <code>true</code>
     *
     * @see     #die
     * @see     #undo
     * @see     #redo
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    public void undo() throws CannotUndoException {

    /**
     * Throws <code>CannotUndoException</code> if <code>canUndo</code>
     * returns <code>false</code>. Sets <code>hasBeenDone</code>
     * to <code>false</code>. Subclasses should override to undo the
     * operation represented by this edit. Override should begin with
     * a call to super.
     *
     * @exception CannotUndoException if <code>canUndo</code>
     *    returns <code>false</code>
     * @see     #canUndo
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    public void die() {

    /**
     * Sets <code>alive</code> to false. Note that this
     * is a one way operation; dead edits cannot be resurrected.
     * Sending <code>undo</code> or <code>redo</code> to
     * a dead edit results in an exception being thrown.
     *
     * <p>Typically an edit is killed when it is consolidated by
     * another edit's <code>addEdit</code> or <code>replaceEdit</code>
     * method, or when it is dequeued from an <code>UndoManager</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    public AbstractUndoableEdit() {

    /**
     * Creates an <code>AbstractUndoableEdit</code> which defaults
     * <code>hasBeenDone</code> and <code>alive</code> to <code>true</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    boolean alive;

    /**
     * True if this edit has not received <code>die</code>; defaults
     * to <code>true</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    boolean hasBeenDone;

    /**
     * Defaults to true; becomes false if this edit is undone, true
     * again if it is redone.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    protected static final String RedoName = "Redo";

    /**
     * String returned by <code>getRedoPresentationName</code>;
     * as of Java 2 platform v1.3.1 this field is no longer used. This value
     * is now localized and comes from the defaults table with key
     * <code>AbstractUndoableEdit.redoText</code>.
     *
     * @see javax.swing.UIDefaults
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
    protected static final String UndoName = "Undo";

    /**
     * String returned by <code>getUndoPresentationName</code>;
     * as of Java 2 platform v1.3.1 this field is no longer used. This value
     * is now localized and comes from the defaults table with key
     * <code>AbstractUndoableEdit.undoText</code>.
     *
     * @see javax.swing.UIDefaults
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/AbstractUndoableEdit.java
public class AbstractUndoableEdit implements UndoableEdit, Serializable {

/**
 * An abstract implementation of <code>UndoableEdit</code>,
 * implementing simple responses to all boolean methods in
 * that interface.
 *
 * @author Ray Ryan
 */
