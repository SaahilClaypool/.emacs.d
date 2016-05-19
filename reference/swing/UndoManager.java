_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public String toString() {

    /**
     * Returns a string that displays and identifies this
     * object's properties.
     *
     * @return a String representation of this object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public void undoableEditHappened(UndoableEditEvent e) {

    /**
     * An <code>UndoableEditListener</code> method. This invokes
     * <code>addEdit</code> with <code>e.getEdit()</code>.
     *
     * @param e the <code>UndoableEditEvent</code> the
     *        <code>UndoableEditEvent</code> will be added from
     * @see #addEdit
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized String getRedoPresentationName() {

    /**
     * Returns a description of the redoable form of this edit.
     * If <code>end</code> has been invoked this calls into super.
     * Otherwise if there are edits to be redone, this returns
     * the value from the next significant edit that will be redone.
     * If there are no edits to be redone and <code>end</code> has not
     * been invoked this returns the value from the <code>UIManager</code>
     * property "AbstractUndoableEdit.redoText".
     *
     * @return a description of the redoable form of this edit
     * @see     #redo
     * @see     CompoundEdit#getRedoPresentationName
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized String getUndoPresentationName() {

    /**
     * Returns a description of the undoable form of this edit.
     * If <code>end</code> has been invoked this calls into super.
     * Otherwise if there are edits to be undone, this returns
     * the value from the next significant edit that will be undone.
     * If there are no edits to be undone and <code>end</code> has not
     * been invoked this returns the value from the <code>UIManager</code>
     * property "AbstractUndoableEdit.undoText".
     *
     * @return a description of the undoable form of this edit
     * @see     #undo
     * @see     CompoundEdit#getUndoPresentationName
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized String getUndoOrRedoPresentationName() {

    /**
     * Convenience method that returns either
     * <code>getUndoPresentationName</code> or
     * <code>getRedoPresentationName</code>.  If the index of the next
     * edit equals the size of the edits list,
     * <code>getUndoPresentationName</code> is returned, otherwise
     * <code>getRedoPresentationName</code> is returned.
     *
     * @return undo or redo name
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized void end() {

    /**
     * Turns this <code>UndoManager</code> into a normal
     * <code>CompoundEdit</code>.  This removes all edits that have
     * been undone.
     *
     * @see CompoundEdit#end
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized boolean addEdit(UndoableEdit anEdit) {

    /**
     * Adds an <code>UndoableEdit</code> to this
     * <code>UndoManager</code>, if it's possible.  This removes all
     * edits from the index of the next edit to the end of the edits
     * list.  If <code>end</code> has been invoked the edit is not added
     * and <code>false</code> is returned.  If <code>end</code> hasn't
     * been invoked this returns <code>true</code>.
     *
     * @param anEdit the edit to be added
     * @return true if <code>anEdit</code> can be incorporated into this
     *              edit
     * @see CompoundEdit#end
     * @see CompoundEdit#addEdit
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized boolean canRedo() {

    /**
     * Returns true if edits may be redone.  If <code>end</code> has
     * been invoked, this returns the value from super.  Otherwise,
     * this returns true if there are any edits to be redone
     * (<code>editToBeRedone</code> returns non-<code>null</code>).
     *
     * @return true if there are edits to be redone
     * @see CompoundEdit#canRedo
     * @see #editToBeRedone
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized void redo() throws CannotRedoException {

    /**
     * Redoes the appropriate edits.  If <code>end</code> has been
     * invoked this calls through to the superclass.  Otherwise
     * this invokes <code>redo</code> on all edits between the
     * index of the next edit and the next significant edit, updating
     * the index of the next edit appropriately.
     *
     * @throws CannotRedoException if one of the edits throws
     *         <code>CannotRedoException</code> or there are no edits
     *         to be redone
     * @see CompoundEdit#end
     * @see #canRedo
     * @see #editToBeRedone
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized boolean canUndo() {

    /**
     * Returns true if edits may be undone.  If <code>end</code> has
     * been invoked, this returns the value from super.  Otherwise
     * this returns true if there are any edits to be undone
     * (<code>editToBeUndone</code> returns non-<code>null</code>).
     *
     * @return true if there are edits to be undone
     * @see CompoundEdit#canUndo
     * @see #editToBeUndone
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized void undo() throws CannotUndoException {

    /**
     * Undoes the appropriate edits.  If <code>end</code> has been
     * invoked this calls through to the superclass, otherwise
     * this invokes <code>undo</code> on all edits between the
     * index of the next edit and the last significant edit, updating
     * the index of the next edit appropriately.
     *
     * @throws CannotUndoException if one of the edits throws
     *         <code>CannotUndoException</code> or there are no edits
     *         to be undone
     * @see CompoundEdit#end
     * @see #canUndo
     * @see #editToBeUndone
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized boolean canUndoOrRedo() {

    /**
     * Returns true if it is possible to invoke <code>undo</code> or
     * <code>redo</code>.
     *
     * @return true if invoking <code>canUndoOrRedo</code> is valid
     * @see #undoOrRedo
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized void undoOrRedo() throws CannotRedoException,

    /**
     * Convenience method that invokes one of <code>undo</code> or
     * <code>redo</code>. If any edits have been undone (the index of
     * the next edit is less than the length of the edits list) this
     * invokes <code>redo</code>, otherwise it invokes <code>undo</code>.
     *
     * @see #canUndoOrRedo
     * @see #getUndoOrRedoPresentationName
     * @throws CannotUndoException if one of the edits throws
     *         <code>CannotUndoException</code>
     * @throws CannotRedoException if one of the edits throws
     *         <code>CannotRedoException</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    protected void redoTo(UndoableEdit edit) throws CannotRedoException {

    /**
     * Redoes all changes from the index of the next edit to
     * <code>edit</code>, updating the index of the next edit appropriately.
     *
     * @throws CannotRedoException if one of the edits throws
     *         <code>CannotRedoException</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    protected void undoTo(UndoableEdit edit) throws CannotUndoException {

    /**
     * Undoes all changes from the index of the next edit to
     * <code>edit</code>, updating the index of the next edit appropriately.
     *
     * @throws CannotUndoException if one of the edits throws
     *         <code>CannotUndoException</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    protected UndoableEdit editToBeRedone() {

    /**
     * Returns the the next significant edit to be redone if <code>redo</code>
     * is invoked. This returns <code>null</code> if there are no edits
     * to be redone.
     *
     * @return the next significant edit to be redone
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    protected UndoableEdit editToBeUndone() {

    /**
     * Returns the the next significant edit to be undone if <code>undo</code>
     * is invoked. This returns <code>null</code> if there are no edits
     * to be undone.
     *
     * @return the next significant edit to be undone
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized void setLimit(int l) {

    /**
     * Sets the maximum number of edits this <code>UndoManager</code>
     * holds. A value less than 0 indicates the number of edits is not
     * limited. If edits need to be discarded to shrink the limit,
     * <code>die</code> will be invoked on them in the reverse
     * order they were added.  The default is 100.
     *
     * @param l the new limit
     * @throws RuntimeException if this {@code UndoManager} is not in progress
     *                          ({@code end} has been invoked)
     * @see #isInProgress
     * @see #end
     * @see #addEdit
     * @see #getLimit
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    protected void trimEdits(int from, int to) {

    /**
     * Removes edits in the specified range.
     * All edits in the given range (inclusive, and in reverse order)
     * will have <code>die</code> invoked on them and are removed from
     * the list of edits. This has no effect if
     * <code>from</code> &gt; <code>to</code>.
     *
     * @param from the minimum index to remove
     * @param to the maximum index to remove
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    protected void trimForLimit() {

    /**
     * Reduces the number of queued edits to a range of size limit,
     * centered on the index of the next edit.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized void discardAllEdits() {

    /**
     * Empties the undo manager sending each edit a <code>die</code> message
     * in the process.
     *
     * @see AbstractUndoableEdit#die
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public synchronized int getLimit() {

    /**
     * Returns the maximum number of edits this {@code UndoManager}
     * holds. A value less than 0 indicates the number of edits is not
     * limited.
     *
     * @return the maximum number of edits this {@code UndoManager} holds
     * @see #addEdit
     * @see #setLimit
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
    public UndoManager() {

    /**
     * Creates a new <code>UndoManager</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//undo/UndoManager.java
public class UndoManager extends CompoundEdit implements UndoableEditListener {

/**
 * {@code UndoManager} manages a list of {@code UndoableEdits},
 * providing a way to undo or redo the appropriate edits.  There are
 * two ways to add edits to an <code>UndoManager</code>.  Add the edit
 * directly using the <code>addEdit</code> method, or add the
 * <code>UndoManager</code> to a bean that supports
 * <code>UndoableEditListener</code>.  The following examples creates
 * an <code>UndoManager</code> and adds it as an
 * <code>UndoableEditListener</code> to a <code>JTextField</code>:
 * <pre>
 *   UndoManager undoManager = new UndoManager();
 *   JTextField tf = ...;
 *   tf.getDocument().addUndoableEditListener(undoManager);
 * </pre>
 * <p>
 * <code>UndoManager</code> maintains an ordered list of edits and the
 * index of the next edit in that list. The index of the next edit is
 * either the size of the current list of edits, or if
 * <code>undo</code> has been invoked it corresponds to the index
 * of the last significant edit that was undone. When
 * <code>undo</code> is invoked all edits from the index of the next
 * edit to the last significant edit are undone, in reverse order.
 * For example, consider an <code>UndoManager</code> consisting of the
 * following edits: <b>A</b> <i>b</i> <i>c</i> <b>D</b>.  Edits with a
 * upper-case letter in bold are significant, those in lower-case
 * and italicized are insignificant.
 * <p>
 * <a name="figure1"></a>
 * <table border=0 summary="">
 * <tr><td>
 *     <img src="doc-files/UndoManager-1.gif" alt="">
 * <tr><td align=center>Figure 1
 * </table>
 * <p>
 * As shown in <a href="#figure1">figure 1</a>, if <b>D</b> was just added, the
 * index of the next edit will be 4. Invoking <code>undo</code>
 * results in invoking <code>undo</code> on <b>D</b> and setting the
 * index of the next edit to 3 (edit <i>c</i>), as shown in the following
 * figure.
 * <p>
 * <a name="figure2"></a>
 * <table border=0 summary="">
 * <tr><td>
 *     <img src="doc-files/UndoManager-2.gif" alt="">
 * <tr><td align=center>Figure 2
 * </table>
 * <p>
 * The last significant edit is <b>A</b>, so that invoking
 * <code>undo</code> again invokes <code>undo</code> on <i>c</i>,
 * <i>b</i>, and <b>A</b>, in that order, setting the index of the
 * next edit to 0, as shown in the following figure.
 * <p>
 * <a name="figure3"></a>
 * <table border=0 summary="">
 * <tr><td>
 *     <img src="doc-files/UndoManager-3.gif" alt="">
 * <tr><td align=center>Figure 3
 * </table>
 * <p>
 * Invoking <code>redo</code> results in invoking <code>redo</code> on
 * all edits between the index of the next edit and the next
 * significant edit (or the end of the list).  Continuing with the previous
 * example if <code>redo</code> were invoked, <code>redo</code> would in
 * turn be invoked on <b>A</b>, <i>b</i> and <i>c</i>.  In addition
 * the index of the next edit is set to 3 (as shown in <a
 * href="#figure2">figure 2</a>).
 * <p>
 * Adding an edit to an <code>UndoManager</code> results in
 * removing all edits from the index of the next edit to the end of
 * the list.  Continuing with the previous example, if a new edit,
 * <i>e</i>, is added the edit <b>D</b> is removed from the list
 * (after having <code>die</code> invoked on it).  If <i>c</i> is not
 * incorporated by the next edit
 * (<code><i>c</i>.addEdit(<i>e</i>)</code> returns true), or replaced
 * by it (<code><i>e</i>.replaceEdit(<i>c</i>)</code> returns true),
 * the new edit is added after <i>c</i>, as shown in the following
 * figure.
 * <p>
 * <a name="figure4"></a>
 * <table border=0 summary="">
 * <tr><td>
 *     <img src="doc-files/UndoManager-4.gif" alt="">
 * <tr><td align=center>Figure 4
 * </table>
 * <p>
 * Once <code>end</code> has been invoked on an <code>UndoManager</code>
 * the superclass behavior is used for all <code>UndoableEdit</code>
 * methods.  Refer to <code>CompoundEdit</code> for more details on its
 * behavior.
 * <p>
 * Unlike the rest of Swing, this class is thread safe.
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
 * @author Ray Ryan
 */
