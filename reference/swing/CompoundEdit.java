_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    public String toString()

    /**
     * Returns a string that displays and identifies this
     * object's properties.
     *
     * @return a String representation of this object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    public String getRedoPresentationName() {

    /**
     * Returns <code>getRedoPresentationName</code>
     * from the last <code>UndoableEdit</code>
     * added to <code>edits</code>.
     * If <code>edits</code> is empty, calls super.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    public String getUndoPresentationName() {

    /**
     * Returns <code>getUndoPresentationName</code>
     * from the last <code>UndoableEdit</code>
     * added to <code>edits</code>.
     * If <code>edits</code> is empty, calls super.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    public String getPresentationName() {

    /**
     * Returns <code>getPresentationName</code> from the
     * last <code>UndoableEdit</code> added to
     * <code>edits</code>. If <code>edits</code> is empty,
     * calls super.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    public boolean  isSignificant() {

    /**
     * Returns true if any of the <code>UndoableEdit</code>s
     * in <code>edits</code> do.
     * Returns false if they all return false.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    public boolean isInProgress() {

    /**
     * Returns true if this edit is in progress--that is, it has not
     * received end. This generally means that edits are still being
     * added to it.
     *
     * @see     #end
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    public boolean canRedo() {

    /**
     * Returns false if <code>isInProgress</code> or if super
     * returns false.
     *
     * @see     #isInProgress
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    public boolean canUndo() {

    /**
     * Returns false if <code>isInProgress</code> or if super
     * returns false.
     *
     * @see     #isInProgress
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    public void end() {

    /**
     * Sets <code>inProgress</code> to false.
     *
     * @see #canUndo
     * @see #canRedo
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    public boolean addEdit(UndoableEdit anEdit) {

    /**
     * If this edit is <code>inProgress</code>,
     * accepts <code>anEdit</code> and returns true.
     *
     * <p>The last edit added to this <code>CompoundEdit</code>
     * is given a chance to <code>addEdit(anEdit)</code>.
     * If it refuses (returns false), <code>anEdit</code> is
     * given a chance to <code>replaceEdit</code> the last edit.
     * If <code>anEdit</code> returns false here,
     * it is added to <code>edits</code>.
     *
     * @param anEdit the edit to be added
     * @return true if the edit is <code>inProgress</code>;
     *  otherwise returns false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    public void die() {

    /**
     * Sends <code>die</code> to each subedit,
     * in the reverse of the order that they were added.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    protected UndoableEdit lastEdit() {

    /**
     * Returns the last <code>UndoableEdit</code> in
     * <code>edits</code>, or <code>null</code>
     * if <code>edits</code> is empty.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    public void redo() throws CannotRedoException {

    /**
     * Sends <code>redo</code> to all contained
     * <code>UndoableEdit</code>s in the order in
     * which they were added.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    public void undo() throws CannotUndoException {

    /**
     * Sends <code>undo</code> to all contained
     * <code>UndoableEdits</code> in the reverse of
     * the order in which they were added.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    protected Vector<UndoableEdit> edits;

    /**
     * The collection of <code>UndoableEdit</code>s
     * undone/redone en masse by this <code>CompoundEdit</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
    boolean inProgress;

    /**
     * True if this edit has never received <code>end</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/CompoundEdit.java
public class CompoundEdit extends AbstractUndoableEdit {

/**
 * A concrete subclass of AbstractUndoableEdit, used to assemble little
 * UndoableEdits into great big ones.
 *
 * @author Ray Ryan
 */
