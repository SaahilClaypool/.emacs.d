_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/undo/StateEdit.java
    protected void removeRedundantState() {

    /**
     * Remove redundant key/values in state hashtables.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/undo/StateEdit.java
    public String getPresentationName() {

    /**
     * Gets the presentation name for this edit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/undo/StateEdit.java
    public void redo() {

    /**
     * Tells the edited object to apply the state after the edit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/undo/StateEdit.java
    public void undo() {

    /**
     * Tells the edited object to apply the state prior to the edit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/undo/StateEdit.java
    public void end() {

    /**
     * Gets the post-edit state of the StateEditable object and
     * ends the edit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/undo/StateEdit.java
    public StateEdit(StateEditable anObject, String name) {

    /**
     * Create and return a new StateEdit with a presentation name.
     *
     * @param anObject The object to watch for changing state
     * @param name The presentation name to be used for this edit
     *
     * @see StateEdit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/undo/StateEdit.java
    public StateEdit(StateEditable anObject) {

    /**
     * Create and return a new StateEdit.
     *
     * @param anObject The object to watch for changing state
     *
     * @see StateEdit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/undo/StateEdit.java
    protected String undoRedoName;

    /**
     * The undo/redo presentation name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/undo/StateEdit.java
    protected Hashtable<Object,Object> postState;

    /**
     * The state information after the edit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/undo/StateEdit.java
    protected Hashtable<Object,Object> preState;

    /**
     * The state information prior to the edit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/undo/StateEdit.java
    protected StateEditable object;

    /**
     * The object being edited
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/undo/StateEdit.java
public class StateEdit

/**
 * <P>StateEdit is a general edit for objects that change state.
 * Objects being edited must conform to the StateEditable interface.</P>
 *
 * <P>This edit class works by asking an object to store it's state in
 * Hashtables before and after editing occurs.  Upon undo or redo the
 * object is told to restore it's state from these Hashtables.</P>
 *
 * A state edit is used as follows:
 * <PRE>
 *      // Create the edit during the "before" state of the object
 *      StateEdit newEdit = new StateEdit(myObject);
 *      // Modify the object
 *      myObject.someStateModifyingMethod();
 *      // "end" the edit when you are done modifying the object
 *      newEdit.end();
 * </PRE>
 *
 * <P><EM>Note that when a StateEdit ends, it removes redundant state from
 * the Hashtables - A state Hashtable is not guaranteed to contain all
 * keys/values placed into it when the state is stored!</EM></P>
 *
 * @see StateEditable
 *
 * @author Ray Ryan
 */
