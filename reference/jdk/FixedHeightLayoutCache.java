_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected boolean updateNextIndex() {

        /**
         * Updates <code>nextIndex</code> returning false if it is beyond
         * the number of children of parent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected boolean findNextValidParent() {

        /**
         * Finds the next valid parent, this should be called when nextIndex
         * is beyond the number of children of the current parent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void updateNextObject() {

        /**
         * Determines the next object by invoking <code>updateNextIndex</code>
         * and if not succesful <code>findNextValidParent</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public TreePath nextElement() {

        /**
         * @return next visible TreePath.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public boolean hasMoreElements() {

        /**
         * @return true if more visible nodes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected int                 childCount;

        /** Number of children in parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected FHTreeStateNode     parent;

        /** Parent thats children are being enumerated. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    // This is very similar to

    /**
     * An enumerator to iterate through visible nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private class SearchInfo {

    /**
     * Used as a placeholder when getting the path in FHTreeStateNodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void didAdjustTree() {

        /**
         * Messaged when this node either expands or collapses.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected int getNumExpandedChildrenTo(int stopIndex) {

        /**
         * Returns the number of children that are expanded to
         * <code>stopIndex</code>. This does not include the number
         * of children that the child at <code>stopIndex</code> might
         * have.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected int getCountTo(int stopIndex) {

        /**
         * Asks all the children of the receiver for their totalChildCount
         * and returns this value (plus stopIndex).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected boolean getPathForRow(int row, int nextRow,
                                        SearchInfo info) {

        /**
         * Returns true if there is a row for <code>row</code>.
         * <code>nextRow</code> gives the bounds of the receiver.
         * Information about the found row is returned in <code>info</code>.
         * This should be invoked on root with <code>nextRow</code> set
         * to <code>getRowCount</code>().
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void childInsertedAtModelIndex(int index,
                                               boolean isExpandedAndVisible) {

        /**
         * Messaged when a child has been inserted at index. For all the
         * children that have a childIndex &ge; index their index is incremented
         * by one.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void adjustChildIndexs(int index, int amount) {

        /**
         * Adjusts the child indexs of the receivers children by
         * <code>amount</code>, starting at <code>index</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void removeChildAtModelIndex(int modelIndex,
                                               boolean isChildVisible) {

        /**
         * Removes the child at <code>modelIndex</code>.
         * <code>isChildVisible</code> should be true if the receiver
         * is visible and expanded.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void addNode(FHTreeStateNode newChild) {

        /**
         * Adds newChild to this nodes children at the appropriate location.
         * The location is determined from the childIndex of newChild.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public boolean isLeaf() {

        /**
         * Returns true if the receiver is a leaf.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void collapse(boolean adjustRows) {

        /**
         * Collapses the receiver. If <code>adjustRows</code> is true,
         * the rows of nodes after the receiver are adjusted.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void expand() {

        /**
         * Expands the receiver.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void expandParentAndReceiver() {

        /**
         * Invokes <code>expandParentAndReceiver</code> on the parent,
         * and expands the receiver.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void makeVisible() {

        /**
         * Makes the receiver visible, but invoking
         * <code>expandParentAndReceiver</code> on the superclass.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        // This can be rather expensive, but is needed for the collapse

        /**
         * Resets the receivers children's rows. Starting with the child
         * at <code>childIndex</code> (and <code>modelIndex</code>) to
         * <code>newRow</code>. This uses <code>setRowAndChildren</code>
         * to recursively descend children, and uses
         * <code>resetRowSelection</code> to ascend parents.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected int setRowAndChildren(int nextRow) {

        /**
         * Sets the receivers row to <code>nextRow</code> and recursively
         * updates all the children of the receivers rows. The index the
         * next row is to be placed as is returned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void didExpand() {

        /**
         * Messaged when the node has expanded. This updates all of
         * the receivers children rows, as well as the total row count.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void adjustRowBy(int amount, int startIndex) {

        /**
         * Adjusts this node, its child, and its parent starting at
         * an index of <code>index</code> index is the index of the child
         * to start adjusting from, which is not necessarily the model
         * index.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void adjustRowBy(int amount) {

        /**
         * Adjusts the receiver, and all its children rows by
         * <code>amount</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected FHTreeStateNode createChildFor(Object userObject) {

        /**
         * Creates a new node to represent <code>userObject</code>.
         * This does NOT check to ensure there isn't already a child node
         * to manage <code>userObject</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void removeFromMapping() {

        /**
         * Removes the receiver, and all its children, from the mapping
         * table.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected void resetChildrenPaths(TreePath parentPath) {

        /**
         * Recreates the receivers path, and all its children's paths.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public int getVisibleLevel() {

        /**
         * The highest visible nodes have a depth of 0.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public boolean isExpanded() {

        /**
         * Returns true if this node is expanded.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public int getTotalChildCount() {

        /**
         * Returns the number of children in the receiver by descending all
         * expanded nodes and messaging them with getTotalChildCount.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public int getRowToModelIndex(int index) {

        /**
         * Returns the row of the child with a model index of
         * <code>index</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public int getRow() {

        /**
         * Returns the row of the receiver.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public boolean isVisible() {

        /**
         * Returns true if this node is visible. This is determined by
         * asking all the parents if they are expanded.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public FHTreeStateNode getChildAtModelIndex(int index) {

        /**
         * Returns the child for the passed in model index, this will
         * return <code>null</code> if the child for <code>index</code>
         * has not yet been created (expanded).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public TreePath getTreePath() {

        /**
         * Returns the <code>TreePath</code> of the receiver.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public int getChildIndex() {

        /**
         * Returns the index of the receiver in the model.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public void setUserObject(Object o) {

        /**
         * Messaged to set the user object. This resets the path.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public void remove(int childIndex) {

        /**
         * Messaged when this node is removed from its parent, this messages
         * <code>removedFromMapping</code> to remove all the children.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        public void setParent(MutableTreeNode parent) {

        /**
         * Messaged when this node is added somewhere, resets the path
         * and adds a mapping from path to this node.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected TreePath        path;

        /** Path of this node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected int             row;

        /** Row of the receiver. This is only valid if the row is expanded.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected int             childCount;

        /** Child count of the receiver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
        protected int             childIndex;

        /** Index of this node from the model. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private class FHTreeStateNode extends DefaultMutableTreeNode {

    /**
     * FHTreeStateNode is used to track what has been expanded.
     * FHTreeStateNode differs from VariableHeightTreeState.TreeStateNode
     * in that it is highly model intensive. That is almost all queries to a
     * FHTreeStateNode result in the TreeModel being queried. And it
     * obviously does not support variable sized row heights.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private FHTreeStateNode getNodeForPath(TreePath path,
                                             boolean onlyIfVisible,
                                             boolean shouldCreate) {

    /**
     * Messages getTreeNodeForPage(path, onlyIfVisible, shouldCreate,
     * path.length) as long as path is non-null and the length is {@literal >} 0.
     * Otherwise returns null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private FHTreeStateNode createNodeForValue(Object value,int childIndex) {

    /**
     * Creates and returns an instance of FHTreeStateNode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private boolean ensurePathIsExpanded(TreePath aPath,
                                           boolean expandLast) {

    /**
     * Ensures that all the path components in path are expanded, accept
     * for the last component which will only be expanded if expandLast
     * is true.
     * Returns true if succesful in finding the path.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private int getRowContainingYLocation(int location) {

    /**
      * Returns the index of the row containing location.  If there
      * are no rows, -1 is returned.  If location is beyond the last
      * row index, the last row index is returned.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private void rebuild(boolean clearSelection) {

    /**
     * Sent to completely rebuild the visible tree. All nodes are collapsed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private FHTreeStateNode getMapping(TreePath path) {

    /**
     * Returns the node previously added for <code>path</code>. This may
     * return null, if you to create a node use getNodeForPath.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private void removeMapping(FHTreeStateNode node) {

    /**
     * Removes the mapping for a previously added node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private void addMapping(FHTreeStateNode node) {

    /**
     * Adds a mapping for node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private void adjustRowCountBy(int changeAmount) {

    /**
     * Adjust the large row count of the AbstractTreeUI the receiver was
     * created with.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private Rectangle getBounds(FHTreeStateNode parent, int childIndex,
                                  Rectangle placeIn) {

    /**
     * Returns the bounds for the given node. If <code>childIndex</code>
     * is -1, the bounds of <code>parent</code> are returned, otherwise
     * the bounds of the node at <code>childIndex</code> are returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public void treeStructureChanged(TreeModelEvent e) {

    /**
     * <p>Invoked after the tree has drastically changed structure from a
     * given node down.  If the path returned by e.getPath() is of length
     * one and the first element does not identify the current root node
     * the first element should become the new root of the tree.
     *
     * <p>e.path() holds the path to the node.</p>
     * <p>e.childIndices() returns null.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public void treeNodesRemoved(TreeModelEvent e) {

    /**
     * <p>Invoked after nodes have been removed from the tree.  Note that
     * if a subtree is removed from the tree, this method may only be
     * invoked once for the root of the removed subtree, not once for
     * each individual set of siblings removed.</p>
     *
     * <p>e.path() returns the former parent of the deleted nodes.</p>
     *
     * <p>e.childIndices() returns the indices the nodes had before they were deleted in ascending order.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public void treeNodesInserted(TreeModelEvent e) {

    /**
     * <p>Invoked after nodes have been inserted into the tree.</p>
     *
     * <p>e.path() returns the parent of the new nodes
     * <p>e.childIndices() returns the indices of the new nodes in
     * ascending order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public void treeNodesChanged(TreeModelEvent e) {

    /**
     * <p>Invoked after a node (or a set of siblings) has changed in some
     * way. The node(s) have not changed locations in the tree or
     * altered their children arrays, but other attributes have
     * changed and may affect presentation. Example: the name of a
     * file has changed, but it is in the same location in the file
     * system.</p>
     *
     * <p>e.path() returns the path the parent of the changed node(s).</p>
     *
     * <p>e.childIndices() returns the index(es) of the changed node(s).</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public boolean getExpandedState(TreePath path) {

    /**
     * Returns true if the path is expanded, and visible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public void setExpandedState(TreePath path, boolean isExpanded) {

    /**
     * Marks the path <code>path</code> expanded state to
     * <code>isExpanded</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public Enumeration<TreePath> getVisiblePathsFrom(TreePath path) {

    /**
     * Returns an Enumerator that increments over the visible paths
     * starting at the passed in location. The ordering of the enumeration
     * is based on how the paths are displayed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public int getVisibleChildCount(TreePath path) {

    /**
     * Returns the number of visible children for row.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public TreePath getPathClosestTo(int x, int y) {

    /**
      * Returns the path to the node that is closest to x,y.  If
      * there is nothing currently visible this will return null, otherwise
      * it'll always return a valid path.  If you need to test if the
      * returned object is exactly at x, y you should get the bounds for
      * the returned path and test x, y against that.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public int getRowForPath(TreePath path) {

    /**
      * Returns the row that the last item identified in path is visible
      * at.  Will return -1 if any of the elements in path are not
      * currently visible.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public TreePath getPathForRow(int row) {

    /**
      * Returns the path for passed in row.  If row is not visible
      * null is returned.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public Rectangle getBounds(TreePath path, Rectangle placeIn) {

    /**
     * Returns a rectangle giving the bounds needed to draw path.
     *
     * @param path     a TreePath specifying a node
     * @param placeIn  a Rectangle object giving the available space
     * @return a Rectangle object specifying the space to be used
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public boolean isExpanded(TreePath path) {

    /**
      * Returns true if the value identified by row is currently expanded.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public void invalidateSizes() {

    /**
     * Informs the TreeState that it needs to recalculate all the sizes
     * it is referencing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public void invalidatePathBounds(TreePath path) {

    /**
     * Does nothing, FixedHeightLayoutCache doesn't cache width, and that
     * is all that could change.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public int getRowCount() {

    /**
     * Returns the number of visible rows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public void setRowHeight(int rowHeight) {

    /**
     * Sets the height of each cell. If rowHeight is less than or equal to
     * 0 this will throw an IllegalArgumentException.
     *
     * @param rowHeight the height of each cell, in pixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public void setRootVisible(boolean rootVisible) {

    /**
     * Determines whether or not the root node from
     * the TreeModel is visible.
     *
     * @param rootVisible true if the root node of the tree is to be displayed
     * @see #rootVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    public void setModel(TreeModel newModel) {

    /**
     * Sets the TreeModel that will provide the data.
     *
     * @param newModel the TreeModel that is to provide the data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private SearchInfo         info;

    /**
     * Used for getting path/row information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private Hashtable<TreePath, FHTreeStateNode> treePathMapping;

    /**
     * Maps from TreePath to a FHTreeStateNode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private Rectangle          boundsBuffer;

    /**
     * Used in getting sizes for nodes to avoid creating a new Rectangle
     * every time a size is needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
    private int                rowCount;

    /** Number of rows currently visible. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/FixedHeightLayoutCache.java
public class FixedHeightLayoutCache extends AbstractLayoutCache {

/**
 * NOTE: This will become more open in a future release.
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
 * @author Scott Violet
 */
