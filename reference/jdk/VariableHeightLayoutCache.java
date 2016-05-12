_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected boolean updateNextIndex() {

        /**
         * Updates <code>nextIndex</code> returning false if it is beyond
         * the number of children of parent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected boolean findNextValidParent() {

        /**
         * Finds the next valid parent, this should be called when nextIndex
         * is beyond the number of children of the current parent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected void updateNextObject() {

        /**
         * Determines the next object by invoking <code>updateNextIndex</code>
         * and if not succesful <code>findNextValidParent</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public TreePath nextElement() {

        /**
         * @return next visible TreePath.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public boolean hasMoreElements() {

        /**
         * @return true if more visible nodes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected int                 childCount;

        /** Number of children in parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected TreeStateNode       parent;

        /** Parent thats children are being enumerated. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private class VisibleTreeStateNodeEnumeration implements

    /**
     * An enumerator to iterate through visible nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected void removeFromMapping() {

        /**
         * Removes the receiver, and all its children, from the mapping
         * table.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected void collapse(boolean adjustTree) {

        /**
         * Collapses this node in the tree.  If <I>adjustTree</I> is
         * true the tree and selection are updated accordingly.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected void expand(boolean adjustTree) {

        /**
         * Expands this node in the tree.  This will load the children
         * from the treeModel if this node has not previously been
         * expanded.  If <I>adjustTree</I> is true the tree and selection
         * are updated accordingly.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected void expandParentAndReceiver() {

        /**
         * Invokes <code>expandParentAndReceiver</code> on the parent,
         * and expands the receiver.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected void didAdjustTree() {

        /**
         * Messaged from expand and collapse. This is meant for subclassers
         * that may wish to do something interesting with this.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected Enumeration getLoadedChildren(boolean createIfNeeded) {

        /**
         * Returns the children of the receiver. If the children haven't
         * been loaded from the model and
         * <code>createIfNeeded</code> is true, the children are first
         * loaded.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected void deepMarkSizeInvalid() {

        /**
         * Marks the receivers size, and all its descendants sizes, as invalid.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected void markSizeInvalid() {

        /**
         * Marks the receivers size as invalid. Next time the size, location
         * is asked for it will be obtained.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected void updatePreferredSize(int index) {

        /**
         * Updates the preferred size by asking the current renderer
         * for the Dimension needed to draw the user object this
         * instance represents.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected void updatePreferredSize() {

        /**
         * Updates the receivers preferredSize by invoking
         * <code>updatePreferredSize</code> with an argument of -1.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected void shiftYOriginBy(int offset) {

        /**
         * Shifts the y origin by <code>offset</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected void setYOrigin(int newYOrigin) {

        /**
         * Sets y origin the user object will be drawn at to
         * <I>newYOrigin</I>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected void resetChildrenPaths(TreePath parentPath) {

        /**
         * Recreates the receivers path, and all its children's paths.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public TreePath getTreePath() {

        /**
         * Returns a TreePath instance for this node.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public Object getValue() {

        /**
         * Returns the value the receiver is representing. This is a cover
         * for getUserObject.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public void collapse() {

        /**
         * Collapses the receiver.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public void expand() {

        /**
         * Expands the receiver.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public void makeVisible() {

        /**
         * Makes the receiver visible, but invoking
         * <code>expandParentAndReceiver</code> on the superclass.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public void toggleExpanded() {

        /**
         * Toggles the receiver between expanded and collapsed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public int getVisibleChildCount() {

        /**
         * Returns the number of visible children, that is the number of
         * children that are expanded, or leafs.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public int getModelChildCount() {

        /**
         * Returns the number of children this will have. If the children
         * have not yet been loaded, this messages the model.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public boolean isVisible() {

        /**
         * Returns true if the receiver is currently visible.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public TreeStateNode getLastVisibleNode() {

        /**
         * Returns the last visible node that is a child of this
         * instance.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public boolean isExpanded() {

        /**
         * Returns true if the receiver has been expanded.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public boolean hasBeenExpanded() {

        /**
         * Returns true if this node has been expanded at least once.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public int getRow() {

        /**
         * Returns the row of the receiver.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public boolean hasValidSize() {

        /**
         * Returns true if this node has a valid size.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public int getPreferredWidth() {

        /**
         * Returns the preferred width of the receiver.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public int getPreferredHeight() {

        /**
         * Returns the preferred height of the receiver.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public int getYOrigin() {

        /**
         * Returns the y origin the user object will be drawn at.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public int getXOrigin() {

        /**
         * @return x location to draw node at.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public Rectangle getNodeBounds(Rectangle placeIn) {

        /**
         * Returns the location and size of this node.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public boolean isLeaf() {

        /**
         * Returns true if the receiver is a leaf.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public Enumeration children() {

        /**
         * Returns the children of the receiver.
         * If the receiver is not currently expanded, this will return an
         * empty enumeration.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public void setUserObject(Object o) {

        /**
         * Messaged to set the user object. This resets the path.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public void remove(int childIndex) {

        /**
         * Messaged when this node is removed from its parent, this messages
         * <code>removedFromMapping</code> to remove all the children.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        public void setParent(MutableTreeNode parent) {

        /**
         * Messaged when this node is added somewhere, resets the path
         * and adds a mapping from path to this node.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected TreePath        path;

        /** Path of this node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected boolean         hasBeenExpanded;

        /** Has this node been expanded at least once? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected boolean         expanded;

        /** Is this node currently expanded? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected int             yOrigin;

        /** Y location that the user object will be drawn at. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
        protected int             xOrigin;

        /** X location that the user object will be drawn at. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private class TreeStateNode extends DefaultMutableTreeNode {

    /**
     * TreeStateNode is used to keep track of each of
     * the nodes that have been expanded. This will also cache the preferred
     * size of the value it represents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private TreeStateNode createNodeForValue(Object value) {

    /**
      * Responsible for creating a TreeStateNode that will be used
      * to track display information about value.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private int getMaxNodeWidth() {

    /**
      * Returns the maximum node width.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private TreeStateNode getNode(int row) {

    /**
     * Returns the AbstractTreeUI.VisibleNode displayed at the given row
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private void ensurePathIsExpanded(TreePath aPath, boolean expandLast) {

    /**
     * Ensures that all the path components in path are expanded, accept
     * for the last component which will only be expanded if expandLast
     * is true.
     * Returns true if succesful in finding the path.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private int getRowContainingYLocation(int location) {

    /**
      * Returns the index of the row containing location.  If there
      * are no rows, -1 is returned.  If location is beyond the last
      * row index, the last row index is returned.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private void updateNodeSizes(boolean updateAll) {

    /**
      * Resets the y origin of all the visible nodes as well as messaging
      * all the visible nodes to updatePreferredSize().  You should not
      * normally have to call this.  Expanding and contracting the nodes
      * automaticly adjusts the locations.
      * updateAll determines if updatePreferredSize() is call on all nodes
      * or just those that don't have a valid size.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private void updateYLocationsFrom(int location) {

    /**
      * Updates the y locations of all of the visible nodes after
      * location.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private TreeStateNode getNodeForPath(TreePath path,
                                           boolean onlyIfVisible,
                                           boolean shouldCreate) {

    /**
      * Returns the TreeStateNode identified by path.  This mirrors
      * the behavior of getNodeForPath, but tries to take advantage of
      * path if it is an instance of AbstractTreePath.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private TreeStateNode createNodeAt(TreeStateNode parent,
                                         int childIndex) {

    /**
      * Creates a new node to represent the node at <I>childIndex</I> in
      * <I>parent</I>s children.  This should be called if the node doesn't
      * already exist and <I>parent</I> has been expanded at least once.
      * The newly created node will be made visible if <I>parent</I> is
      * currently expanded.  This does not update the position of any
      * cells, nor update the selection if it needs to be.  If succesful
      * in creating the new TreeStateNode, it is returned, otherwise
      * null is returned.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private void rebuild(boolean clearSelection) {

    /**
     * Completely rebuild the tree, all expanded state, and node caches are
     * removed. All nodes are collapsed, except the root.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private Rectangle getBounds(int row, Rectangle placeIn) {

    /**
     * Retursn the bounds for row, <code>row</code> by reference in
     * <code>placeIn</code>. If <code>placeIn</code> is null a new
     * Rectangle will be created and returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private TreeStateNode getMapping(TreePath path) {

    /**
     * Returns the node previously added for <code>path</code>. This may
     * return null, if you to create a node use getNodeForPath.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private void removeMapping(TreeStateNode node) {

    /**
     * Removes the mapping for a previously added node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private void addMapping(TreeStateNode node) {

    /**
     * Adds a mapping for node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public void treeStructureChanged(TreeModelEvent e) {

    /**
     * Invoked after the tree has drastically changed structure from a
     * given node down.  If the path returned by <code>e.getPath</code>
     * is of length one and the first element does not identify the
     * current root node the first element should become the new root
     * of the tree.
     *
     * <p><code>e.path</code> holds the path to the node.
     * <p><code>e.childIndices</code> returns <code>null</code>.
     *
     * @param e the <code>TreeModelEvent</code> of interest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public void treeNodesRemoved(TreeModelEvent e) {

    /**
     * Invoked after nodes have been removed from the tree.  Note that
     * if a subtree is removed from the tree, this method may only be
     * invoked once for the root of the removed subtree, not once for
     * each individual set of siblings removed.
     *
     * <p><code>e.path</code> returns the former parent of the deleted nodes.
     *
     * <p><code>e.childIndices</code> returns the indices the nodes had
     * before they were deleted in ascending order.
     *
     * @param e the <code>TreeModelEvent</code> of interest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public void treeNodesInserted(TreeModelEvent e) {

    /**
     * Invoked after nodes have been inserted into the tree.
     *
     * <p><code>e.path</code> returns the parent of the new nodes.
     * <p><code>e.childIndices</code> returns the indices of the new nodes in
     * ascending order.
     *
     * @param e the <code>TreeModelEvent</code> of interest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public void treeNodesChanged(TreeModelEvent e) {

    /**
     * Invoked after a node (or a set of siblings) has changed in some
     * way. The node(s) have not changed locations in the tree or
     * altered their children arrays, but other attributes have
     * changed and may affect presentation. Example: the name of a
     * file has changed, but it is in the same location in the file
     * system.
     *
     * <p><code>e.path</code> returns the path the parent of the
     * changed node(s).
     *
     * <p><code>e.childIndices</code> returns the index(es) of the
     * changed node(s).
     *
     * @param e the <code>TreeModelEvent</code> of interest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public boolean isExpanded(TreePath path) {

    /**
      * Returns true if the value identified by <code>path</code> is
      * currently expanded.
      * @return true if the value identified by <code>path</code> is
      *    currently expanded
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public void invalidateSizes() {

    /**
     * Informs the <code>TreeState</code> that it needs to recalculate
     * all the sizes it is referencing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public int getVisibleChildCount(TreePath path) {

    /**
     * Returns the number of visible children for <code>path</code>.
     * @return the number of visible children for <code>path</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public Enumeration<TreePath> getVisiblePathsFrom(TreePath path) {

    /**
     * Returns an <code>Enumerator</code> that increments over the visible paths
     * starting at the passed in location. The ordering of the enumeration
     * is based on how the paths are displayed.
     *
     * @param path the location in the <code>TreePath</code> to start
     * @return an <code>Enumerator</code> that increments over the visible
     *     paths
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public TreePath getPathClosestTo(int x, int y) {

    /**
      * Returns the path to the node that is closest to x,y.  If
      * there is nothing currently visible this will return <code>null</code>,
      * otherwise it will always return a valid path.
      * If you need to test if the
      * returned object is exactly at x, y you should get the bounds for
      * the returned path and test x, y against that.
      *
      * @param x  the x-coordinate
      * @param y  the y-coordinate
      * @return the path to the node that is closest to x, y
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public int getPreferredWidth(Rectangle bounds) {

    /**
     * Returns the preferred width and height for the region in
     * <code>visibleRegion</code>.
     *
     * @param bounds  the region being queried
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public int getPreferredHeight() {

    /**
     * Returns the preferred height.
     * @return the preferred height
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public void invalidatePathBounds(TreePath path) {

    /**
     * Instructs the <code>LayoutCache</code> that the bounds for
     * <code>path</code> are invalid, and need to be updated.
     *
     * @param path the <code>TreePath</code> which is now invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public int getRowCount() {

    /**
     * Returns the number of visible rows.
     * @return the number of visible rows
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public int getRowForPath(TreePath path) {

    /**
      * Returns the row where the last item identified in path is visible.
      * Will return -1 if any of the elements in path are not
      * currently visible.
      *
      * @param path the <code>TreePath</code> of interest
      * @return the row where the last item in path is visible
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public TreePath getPathForRow(int row) {

    /**
      * Returns the path for <code>row</code>.  If <code>row</code>
      * is not visible, <code>null</code> is returned.
      *
      * @param row the location of interest
      * @return the path for <code>row</code>, or <code>null</code>
      * if <code>row</code> is not visible
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public Rectangle getBounds(TreePath path, Rectangle placeIn) {

    /**
      * Returns the <code>Rectangle</code> enclosing the label portion
      * into which the item identified by <code>path</code> will be drawn.
      *
      * @param path  the path to be drawn
      * @param placeIn the bounds of the enclosing rectangle
      * @return the bounds of the enclosing rectangle or <code>null</code>
      *    if the node could not be ascertained
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public boolean getExpandedState(TreePath path) {

    /**
     * Returns true if the path is expanded, and visible.
     * @return true if the path is expanded and visible, otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public void setExpandedState(TreePath path, boolean isExpanded) {

    /**
     * Marks the path <code>path</code> expanded state to
     * <code>isExpanded</code>.
     * @param path the <code>TreePath</code> of interest
     * @param isExpanded true if the path should be expanded, otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public void setNodeDimensions(NodeDimensions nd) {

    /**
     * Sets the renderer that is responsible for drawing nodes in the tree.
     * @param nd the renderer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public void setRowHeight(int rowHeight) {

    /**
     * Sets the height of each cell.  If the specified value
     * is less than or equal to zero the current cell renderer is
     * queried for each row's height.
     *
     * @param rowHeight the height of each cell, in pixels
     * @beaninfo
     *        bound: true
     *  description: The height of each cell.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public void setRootVisible(boolean rootVisible) {

    /**
     * Determines whether or not the root node from
     * the <code>TreeModel</code> is visible.
     *
     * @param rootVisible true if the root node of the tree is to be displayed
     * @see #rootVisible
     * @beaninfo
     *        bound: true
     *  description: Whether or not the root node
     *               from the TreeModel is visible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    public void setModel(TreeModel newModel) {

    /**
     * Sets the <code>TreeModel</code> that will provide the data.
     *
     * @param newModel the <code>TreeModel</code> that is to provide the data
     * @beaninfo
     *        bound: true
     *  description: The TreeModel that will provide the data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private Stack<Stack<TreePath>> tempStacks;

    /**
     * A stack of stacks.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private Hashtable<TreePath, TreeStateNode> treePathMapping;

    /**
     * Maps from <code>TreePath</code> to a <code>TreeStateNode</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private Rectangle         boundsBuffer;

    /**
     * Used in getting sizes for nodes to avoid creating a new Rectangle
     * every time a size is needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private TreeStateNode     root;

    /**
     * The root node of the internal cache of nodes that have been shown.
     * If the treeModel is vending a network rather than a true tree,
     * there may be one cached node for each path to a modeled node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
    private boolean           updateNodeSizes;

    /**
     * This is set to true if one of the entries has an invalid size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/VariableHeightLayoutCache.java
public class VariableHeightLayoutCache extends AbstractLayoutCache {

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
 * @author Rob Davis
 * @author Ray Ryan
 * @author Scott Violet
 */
