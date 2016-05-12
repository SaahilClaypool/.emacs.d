_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/TreeSelectionEvent.java
    public Object cloneWithSource(Object newSource) {

    /**
     * Returns a copy of the receiver, but with the source being newSource.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/TreeSelectionEvent.java
    public TreePath getNewLeadSelectionPath() {

    /**
     * Returns the current lead path.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/TreeSelectionEvent.java
    public TreePath getOldLeadSelectionPath() {

    /**
     * Returns the path that was previously the lead path.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/TreeSelectionEvent.java
    public boolean isAddedPath(int index) {

    /**
     * Returns whether the path at {@code getPaths()[index]} was added
     * to the selection.  A return value of {@code true} indicates the
     * path was added to the selection. A return value of {@code false}
     * indicates the path is no longer selected.
     *
     * @param index the index of the path to test
     * @return {@code true} if the path was added to the selection,
     *         {@code false} otherwise
     * @throws IllegalArgumentException if index is outside the range of
     *         {@code getPaths}
     * @see #getPaths
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/TreeSelectionEvent.java
    public boolean isAddedPath(TreePath path) {

    /**
     * Returns whether the specified path was added to the selection.
     * A return value of {@code true} indicates the path identified by
     * {@code path} was added to the selection. A return value of
     * {@code false} indicates {@code path} is no longer selected. This method
     * is only valid for the paths returned from {@code getPaths()}; invoking
     * with a path not included in {@code getPaths()} throws an
     * {@code IllegalArgumentException}.
     *
     * @param path the path to test
     * @return {@code true} if {@code path} was added to the selection,
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code path} is not contained
     *         in {@code getPaths}
     * @see #getPaths
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/TreeSelectionEvent.java
    public boolean isAddedPath() {

    /**
     * Returns whether the path identified by {@code getPath} was
     * added to the selection.  A return value of {@code true}
     * indicates the path identified by {@code getPath} was added to
     * the selection. A return value of {@code false} indicates {@code
     * getPath} was selected, but is no longer selected.
     *
     * @return {@code true} if {@code getPath} was added to the selection,
     *         {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/TreeSelectionEvent.java
    public TreePath getPath()

    /**
      * Returns the first path element.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/TreeSelectionEvent.java
    public TreePath[] getPaths()

    /**
      * Returns the paths that have been added or removed from the
      * selection.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/TreeSelectionEvent.java
    public TreeSelectionEvent(Object source, TreePath path, boolean isNew,
                              TreePath oldLeadSelectionPath,
                              TreePath newLeadSelectionPath)

    /**
      * Represents a change in the selection of a TreeSelectionModel.
      * path identifies the path that have been either added or
      * removed from the selection.
      *
      * @param source source of event
      * @param path the path that has changed in the selection
      * @param isNew whether or not the path is new to the selection, false
      * means path was removed from the selection.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/TreeSelectionEvent.java
    public TreeSelectionEvent(Object source, TreePath[] paths,
                              boolean[] areNew, TreePath oldLeadSelectionPath,
                              TreePath newLeadSelectionPath)

    /**
      * Represents a change in the selection of a TreeSelectionModel.
      * paths identifies the paths that have been either added or
      * removed from the selection.
      *
      * @param source source of event
      * @param paths the paths that have changed in the selection
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/TreeSelectionEvent.java
    protected TreePath        oldLeadSelectionPath;

    /** leadSelectionPath before the paths changed, may be null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/TreeSelectionEvent.java
    protected TreePath[]     paths;

    /** Paths this event represents. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/TreeSelectionEvent.java
public class TreeSelectionEvent extends EventObject

/**
 * An event that characterizes a change in the current
 * selection.  The change is based on any number of paths.
 * TreeSelectionListeners will generally query the source of
 * the event for the new selected status of each potentially
 * changed row.
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
 * @see TreeSelectionListener
 * @see javax.swing.tree.TreeSelectionModel
 *
 * @author Scott Violet
 */
