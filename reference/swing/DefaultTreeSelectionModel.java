_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
class PathPlaceHolder {

/**
 * Holds a path and whether or not it is new.
 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public Object clone() throws CloneNotSupportedException {

    /**
     * Returns a clone of this object with the same selection.
     * This method does not duplicate
     * selection listeners and property listeners.
     *
     * @exception CloneNotSupportedException never thrown by instances of
     *                                       this class
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public String toString() {

    /**
     * Returns a string that displays and identifies this
     * object's properties.
     *
     * @return a String representation of this object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected void insureUniqueness() {

    /**
     * This method is obsolete and its implementation is now a noop.  It's
     * still called by setSelectionPaths and addSelectionPaths, but only
     * for backwards compatibility.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected void updateLeadIndex() {

    /**
     * Updates the leadIndex instance variable.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    @Deprecated

    /**
     * Notifies listeners of a change in path. changePaths should contain
     * instances of PathPlaceHolder.
     *
     * @deprecated As of JDK version 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected boolean canPathsBeRemoved(TreePath[] paths) {

    /**
     * Returns true if the paths can be removed without breaking the
     * continuity of the model.
     * This is rather expensive.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected boolean canPathsBeAdded(TreePath[] paths) {

    /**
     * Used to test if a particular set of <code>TreePath</code>s can
     * be added. This will return true if <code>paths</code> is null (or
     * empty), or this object has no RowMapper, or nothing is currently selected,
     * or the selection mode is <code>DISCONTIGUOUS_TREE_SELECTION</code>, or
     * adding the paths to the current selection still results in a
     * contiguous set of <code>TreePath</code>s.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected boolean arePathsContiguous(TreePath[] paths) {

    /**
     * Returns true if the paths are contiguous,
     * or this object has no RowMapper.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected void insureRowContinuity() {

    /**
     * Makes sure the currently selected <code>TreePath</code>s are valid
     * for the current selection mode.
     * If the selection mode is <code>CONTIGUOUS_TREE_SELECTION</code>
     * and a <code>RowMapper</code> exists, this will make sure all
     * the rows are contiguous, that is, when sorted all the rows are
     * in order with no gaps.
     * If the selection isn't contiguous, the selection is
     * reset to contain the first set, when sorted, of contiguous rows.
     * <p>
     * If the selection mode is <code>SINGLE_TREE_SELECTION</code> and
     * more than one TreePath is selected, the selection is reset to
     * contain the first path currently selected.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public PropertyChangeListener[] getPropertyChangeListeners() {

    /**
     * Returns an array of all the property change listeners
     * registered on this <code>DefaultTreeSelectionModel</code>.
     *
     * @return all of this model's <code>PropertyChangeListener</code>s
     *         or an empty
     *         array if no property change listeners are currently registered
     *
     * @see #addPropertyChangeListener
     * @see #removePropertyChangeListener
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public synchronized void removePropertyChangeListener(
                                PropertyChangeListener listener) {

    /**
     * Removes a PropertyChangeListener from the listener list.
     * This removes a PropertyChangeListener that was registered
     * for all properties.
     *
     * @param listener  the PropertyChangeListener to be removed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public synchronized void addPropertyChangeListener(
                                PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list.
     * The listener is registered for all properties.
     * <p>
     * A PropertyChangeEvent will get fired when the selection mode
     * changes.
     *
     * @param listener  the PropertyChangeListener to be added
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public TreePath getLeadSelectionPath() {

    /**
     * Returns the last path that was added. This may differ from the
     * leadSelectionPath property maintained by the JTree.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public int getLeadSelectionRow() {

    /**
     * Returns the lead selection index. That is the last index that was
     * added.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public void resetRowSelection() {

    /**
     * Updates this object's mapping from TreePath to rows. This should
     * be invoked when the mapping from TreePaths to integers has changed
     * (for example, a node has been expanded).
     * <p>You do not normally have to call this, JTree and its associated
     * Listeners will invoke this for you. If you are implementing your own
     * View class, then you will have to invoke this.
     * <p>This will invoke <code>insureRowContinuity</code> to make sure
     * the currently selected TreePaths are still valid based on the
     * selection mode.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public boolean isRowSelected(int row) {

    /**
      * Returns true if the row identified by <code>row</code> is selected.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public int getMaxSelectionRow() {

    /**
     * Returns the largest value obtained from the RowMapper for the
     * current set of selected TreePaths. If nothing is selected,
     * or there is no RowMapper, this will return -1.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public int getMinSelectionRow() {

    /**
     * Returns the smallest value obtained from the RowMapper for the
     * current set of selected TreePaths. If nothing is selected,
     * or there is no RowMapper, this will return -1.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public int[] getSelectionRows() {

    /**
     * Returns the selection in terms of rows. There is not
     * necessarily a one-to-one mapping between the {@code TreePath}s
     * returned from {@code getSelectionPaths} and this method. In
     * particular, if a {@code TreePath} is not viewable (the {@code
     * RowMapper} returns {@code -1} for the row corresponding to the
     * {@code TreePath}), then the corresponding row is not included
     * in the returned array. For example, if the selection consists
     * of two paths, {@code A} and {@code B}, with {@code A} at row
     * {@code 10}, and {@code B} not currently viewable, then this method
     * returns an array with the single entry {@code 10}.
     *
     * @return the selection in terms of rows
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this model.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     *
     * You can specify the <code>listenerType</code> argument
     * with a class literal,
     * such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>DefaultTreeSelectionModel</code> <code>m</code>
     * for its tree selection listeners with the following code:
     *
     * <pre>TreeSelectionListener[] tsls = (TreeSelectionListener[])(m.getListeners(TreeSelectionListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this component,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getTreeSelectionListeners
     * @see #getPropertyChangeListeners
     *
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected void fireValueChanged(TreeSelectionEvent e) {

    /**
     * Notifies all listeners that are registered for
     * tree selection events on this object.
     * @see #addTreeSelectionListener
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public TreeSelectionListener[] getTreeSelectionListeners() {

    /**
     * Returns an array of all the tree selection listeners
     * registered on this model.
     *
     * @return all of this model's <code>TreeSelectionListener</code>s
     *         or an empty
     *         array if no tree selection listeners are currently registered
     *
     * @see #addTreeSelectionListener
     * @see #removeTreeSelectionListener
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public void removeTreeSelectionListener(TreeSelectionListener x) {

    /**
      * Removes x from the list of listeners that are notified each time
      * the set of selected TreePaths changes.
      *
      * @param x the listener to remove
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public void addTreeSelectionListener(TreeSelectionListener x) {

    /**
      * Adds x to the list of listeners that are notified each time the
      * set of selected TreePaths changes.
      *
      * @param x the new listener to be added
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public void clearSelection() {

    /**
      * Empties the current selection.  If this represents a change in the
      * current selection, the selection listeners are notified.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public boolean isSelectionEmpty() {

    /**
      * Returns true if the selection is currently empty.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public boolean isPathSelected(TreePath path) {

    /**
      * Returns true if the path, <code>path</code>,
      * is in the current selection.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public int getSelectionCount() {

    /**
     * Returns the number of paths that are selected.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public TreePath[] getSelectionPaths() {

    /**
      * Returns the selection.
      *
      * @return the selection
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public TreePath getSelectionPath() {

    /**
      * Returns the first path in the selection. This is useful if there
      * if only one item currently selected.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public void removeSelectionPaths(TreePath[] paths) {

    /**
      * Removes paths from the selection.  If any of the paths in paths
      * are in the selection the TreeSelectionListeners are notified.
      * This has no effect if <code>paths</code> is null.
      *
      * @param paths the paths to remove from the selection
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public void removeSelectionPath(TreePath path) {

    /**
      * Removes path from the selection. If path is in the selection
      * The TreeSelectionListeners are notified. This has no effect if
      * <code>path</code> is null.
      *
      * @param path the path to remove from the selection
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public void addSelectionPaths(TreePath[] paths) {

    /**
      * Adds paths to the current selection. If any of the paths in
      * paths are not currently in the selection the TreeSelectionListeners
      * are notified. This has
      * no effect if <code>paths</code> is null.
      * <p>The lead path is set to the last element in <code>paths</code>.
      * <p>If the selection mode is <code>CONTIGUOUS_TREE_SELECTION</code>,
      * and adding the new paths would make the selection discontiguous.
      * Then two things can result: if the TreePaths in <code>paths</code>
      * are contiguous, then the selection becomes these TreePaths,
      * otherwise the TreePaths aren't contiguous and the selection becomes
      * the first TreePath in <code>paths</code>.
      *
      * @param paths the new path to add to the current selection
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public void addSelectionPath(TreePath path) {

    /**
      * Adds path to the current selection. If path is not currently
      * in the selection the TreeSelectionListeners are notified. This has
      * no effect if <code>path</code> is null.
      *
      * @param path the new path to add to the current selection
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public void setSelectionPaths(TreePath[] pPaths) {

    /**
     * Sets the selection. Whether the supplied paths are taken as the
     * new selection depends upon the selection mode. If the supplied
     * array is {@code null}, or empty, the selection is cleared. If
     * the selection mode is {@code SINGLE_TREE_SELECTION}, only the
     * first path in {@code pPaths} is used. If the selection
     * mode is {@code CONTIGUOUS_TREE_SELECTION} and the supplied paths
     * are not contiguous, then only the first path in {@code pPaths} is
     * used. If the selection mode is
     * {@code DISCONTIGUOUS_TREE_SELECTION}, then all paths are used.
     * <p>
     * All {@code null} paths in {@code pPaths} are ignored.
     * <p>
     * If this represents a change, all registered {@code
     * TreeSelectionListener}s are notified.
     * <p>
     * The lead path is set to the last unique path.
     * <p>
     * The paths returned from {@code getSelectionPaths} are in the same
     * order as those supplied to this method.
     *
     * @param pPaths the new selection
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public void setSelectionPath(TreePath path) {

    /**
      * Sets the selection to path. If this represents a change, then
      * the TreeSelectionListeners are notified. If <code>path</code> is
      * null, this has the same effect as invoking <code>clearSelection</code>.
      *
      * @param path new path to select
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public int getSelectionMode() {

    /**
     * Returns the selection mode, one of <code>SINGLE_TREE_SELECTION</code>,
     * <code>DISCONTIGUOUS_TREE_SELECTION</code> or
     * <code>CONTIGUOUS_TREE_SELECTION</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public void setSelectionMode(int mode) {

    /**
     * Sets the selection model, which must be one of SINGLE_TREE_SELECTION,
     * CONTIGUOUS_TREE_SELECTION or DISCONTIGUOUS_TREE_SELECTION. If mode
     * is not one of the defined value,
     * <code>DISCONTIGUOUS_TREE_SELECTION</code> is assumed.
     * <p>This may change the selection if the current selection is not valid
     * for the new mode. For example, if three TreePaths are
     * selected when the mode is changed to <code>SINGLE_TREE_SELECTION</code>,
     * only one TreePath will remain selected. It is up to the particular
     * implementation to decide what TreePath remains selected.
     * <p>
     * Setting the mode to something other than the defined types will
     * result in the mode becoming <code>DISCONTIGUOUS_TREE_SELECTION</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public RowMapper getRowMapper() {

    /**
     * Returns the RowMapper instance that is able to map a TreePath to a
     * row.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public void setRowMapper(RowMapper newMapper) {

    /**
     * Sets the RowMapper instance. This instance is used to determine
     * the row for a particular TreePath.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public DefaultTreeSelectionModel() {

    /**
     * Creates a new instance of DefaultTreeSelectionModel that is
     * empty, with a selection mode of DISCONTIGUOUS_TREE_SELECTION.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    private Hashtable<TreePath, Boolean>    uniquePaths;

    /** Used to make sure the paths are unique, will contain all the paths
     * in <code>selection</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected int                           leadRow;

    /** Lead row. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected int                           leadIndex;

    /** Index of the lead path in selection. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected TreePath                      leadPath;

    /** Last path that was added. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected int                           selectionMode;

    /** Mode for the selection, will be either SINGLE_TREE_SELECTION,
     * CONTIGUOUS_TREE_SELECTION or DISCONTIGUOUS_TREE_SELECTION.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected DefaultListSelectionModel     listSelectionModel;

    /** Handles maintaining the list selection model. The RowMapper is used
     * to map from a TreePath to a row, and the value is then placed here. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    transient protected RowMapper               rowMapper;

    /** Provides a row for a given path. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected EventListenerList   listenerList = new EventListenerList();

    /** Event listener list. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected TreePath[]                selection;

    /** Paths that are currently selected.  Will be null if nothing is
      * currently selected. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    protected SwingPropertyChangeSupport     changeSupport;

    /** Used to messaged registered listeners. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
    public static final String          SELECTION_MODE_PROPERTY = "selectionMode";

    /** Property name for selectionMode. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/DefaultTreeSelectionModel.java
@SuppressWarnings("serial")

/**
 * Default implementation of TreeSelectionModel.  Listeners are notified
 * whenever
 * the paths in the selection change, not the rows. In order
 * to be able to track row changes you may wish to become a listener
 * for expansion events on the tree and test for changes from there.
 * <p>resetRowSelection is called from any of the methods that update
 * the selected paths. If you subclass any of these methods to
 * filter what is allowed to be selected, be sure and message
 * <code>resetRowSelection</code> if you do not message super.
 *
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @see javax.swing.JTree
 *
 * @author Scott Violet
 */
