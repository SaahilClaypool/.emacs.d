_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
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
     * <code>DefaultTreeModel</code> <code>m</code>
     * for its tree model listeners with the following code:
     *
     * <pre>TreeModelListener[] tmls = (TreeModelListener[])(m.getListeners(TreeModelListener.class));</pre>
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
     * @see #getTreeModelListeners
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    private void fireTreeStructureChanged(Object source, TreePath path) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     *
     * @param source the source of the {@code TreeModelEvent};
     *               typically {@code this}
     * @param path the path to the parent of the structure that has changed;
     *             use {@code null} to identify the root has changed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    protected void fireTreeStructureChanged(Object source, Object[] path,
                                        int[] childIndices,
                                        Object[] children) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     *
     * @param source the source of the {@code TreeModelEvent};
     *               typically {@code this}
     * @param path the path to the parent of the structure that has changed;
     *             use {@code null} to identify the root has changed
     * @param childIndices the indices of the affected elements
     * @param children the affected elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    protected void fireTreeNodesRemoved(Object source, Object[] path,
                                        int[] childIndices,
                                        Object[] children) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     *
     * @param source the source of the {@code TreeModelEvent};
     *               typically {@code this}
     * @param path the path to the parent the nodes were removed from
     * @param childIndices the indices of the removed elements
     * @param children the removed elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    protected void fireTreeNodesInserted(Object source, Object[] path,
                                        int[] childIndices,
                                        Object[] children) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     *
     * @param source the source of the {@code TreeModelEvent};
     *               typically {@code this}
     * @param path the path to the parent the nodes were added to
     * @param childIndices the indices of the new elements
     * @param children the new elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    protected void fireTreeNodesChanged(Object source, Object[] path,
                                        int[] childIndices,
                                        Object[] children) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     *
     * @param source the source of the {@code TreeModelEvent};
     *               typically {@code this}
     * @param path the path to the parent of the nodes that changed; use
     *             {@code null} to identify the root has changed
     * @param childIndices the indices of the changed elements
     * @param children the changed elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public TreeModelListener[] getTreeModelListeners() {

    /**
     * Returns an array of all the tree model listeners
     * registered on this model.
     *
     * @return all of this model's <code>TreeModelListener</code>s
     *         or an empty
     *         array if no tree model listeners are currently registered
     *
     * @see #addTreeModelListener
     * @see #removeTreeModelListener
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void removeTreeModelListener(TreeModelListener l) {

    /**
     * Removes a listener previously added with <B>addTreeModelListener()</B>.
     *
     * @see     #addTreeModelListener
     * @param   l       the listener to remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void addTreeModelListener(TreeModelListener l) {

    /**
     * Adds a listener for the TreeModelEvent posted after the tree changes.
     *
     * @see     #removeTreeModelListener
     * @param   l       the listener to add
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    protected TreeNode[] getPathToRoot(TreeNode aNode, int depth) {

    /**
     * Builds the parents of node up to and including the root node,
     * where the original node is the last element in the returned array.
     * The length of the returned array gives the node's depth in the
     * tree.
     *
     * @param aNode  the TreeNode to get the path for
     * @param depth  an int giving the number of steps already taken towards
     *        the root (on recursive calls), used to size the returned array
     * @return an array of TreeNodes giving the path from the root to the
     *         specified node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public TreeNode[] getPathToRoot(TreeNode aNode) {

    /**
     * Builds the parents of node up to and including the root node,
     * where the original node is the last element in the returned array.
     * The length of the returned array gives the node's depth in the
     * tree.
     *
     * @param aNode the TreeNode to get the path for
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void nodeStructureChanged(TreeNode node) {

    /**
      * Invoke this method if you've totally changed the children of
      * node and its children's children...  This will post a
      * treeStructureChanged event.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void nodesChanged(TreeNode node, int[] childIndices) {

    /**
      * Invoke this method after you've changed how the children identified by
      * childIndicies are to be represented in the tree.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void nodesWereRemoved(TreeNode node, int[] childIndices,
                                 Object[] removedChildren) {

    /**
      * Invoke this method after you've removed some TreeNodes from
      * node.  childIndices should be the index of the removed elements and
      * must be sorted in ascending order. And removedChildren should be
      * the array of the children objects that were removed.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void nodesWereInserted(TreeNode node, int[] childIndices) {

    /**
      * Invoke this method after you've inserted some TreeNodes into
      * node.  childIndices should be the index of the new elements and
      * must be sorted in ascending order.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void reload(TreeNode node) {

    /**
     * Invoke this method if you've modified the {@code TreeNode}s upon which
     * this model depends. The model will notify all of its listeners that the
     * model has changed below the given node.
     *
     * @param node the node below which the model has changed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void nodeChanged(TreeNode node) {

    /**
      * Invoke this method after you've changed how node is to be
      * represented in the tree.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void removeNodeFromParent(MutableTreeNode node) {

    /**
     * Message this to remove node from its parent. This will message
     * nodesWereRemoved to create the appropriate event. This is the
     * preferred way to remove a node as it handles the event creation
     * for you.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void insertNodeInto(MutableTreeNode newChild,
                               MutableTreeNode parent, int index){

    /**
     * Invoked this to insert newChild at location index in parents children.
     * This will then message nodesWereInserted to create the appropriate
     * event. This is the preferred way to add children as it will create
     * the appropriate event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void valueForPathChanged(TreePath path, Object newValue) {

    /**
      * This sets the user object of the TreeNode identified by path
      * and posts a node changed.  If you use custom user objects in
      * the TreeModel you're going to need to subclass this and
      * set the user object of the changed node to something meaningful.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void reload() {

    /**
     * Invoke this method if you've modified the {@code TreeNode}s upon which
     * this model depends. The model will notify all of its listeners that the
     * model has changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public boolean isLeaf(Object node) {

    /**
     * Returns whether the specified node is a leaf node.
     * The way the test is performed depends on the
     * <code>askAllowsChildren</code> setting.
     *
     * @param node the node to check
     * @return true if the node is a leaf node
     *
     * @see #asksAllowsChildren
     * @see TreeModel#isLeaf
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public int getChildCount(Object parent) {

    /**
     * Returns the number of children of <I>parent</I>.  Returns 0 if the node
     * is a leaf or if it has no children.  <I>parent</I> must be a node
     * previously obtained from this data source.
     *
     * @param   parent  a node in the tree, obtained from this data source
     * @return  the number of children of the node <I>parent</I>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public Object getChild(Object parent, int index) {

    /**
     * Returns the child of <I>parent</I> at index <I>index</I> in the parent's
     * child array.  <I>parent</I> must be a node previously obtained from
     * this data source. This should not return null if <i>index</i>
     * is a valid index for <i>parent</i> (that is <i>index</i> &gt;= 0 &amp;&amp;
     * <i>index</i> &lt; getChildCount(<i>parent</i>)).
     *
     * @param   parent  a node in the tree, obtained from this data source
     * @return  the child of <I>parent</I> at index <I>index</I>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public int getIndexOfChild(Object parent, Object child) {

    /**
     * Returns the index of child in parent.
     * If either the parent or child is <code>null</code>, returns -1.
     * @param parent a note in the tree, obtained from this data source
     * @param child the node we are interested in
     * @return the index of the child in the parent, or -1
     *    if either the parent or the child is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public Object getRoot() {

    /**
     * Returns the root of the tree.  Returns null only if the tree has
     * no nodes.
     *
     * @return  the root of the tree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void setRoot(TreeNode root) {

    /**
     * Sets the root to <code>root</code>. A null <code>root</code> implies
     * the tree is to display nothing, and is legal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public boolean asksAllowsChildren() {

    /**
      * Tells how leaf nodes are determined.
      *
      * @return true if only nodes which do not allow children are
      *         leaf nodes, false if nodes which have no children
      *         (even if allowed) are leaf nodes
      * @see #asksAllowsChildren
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public void setAsksAllowsChildren(boolean newValue) {

    /**
      * Sets whether or not to test leafness by asking getAllowsChildren()
      * or isLeaf() to the TreeNodes.  If newvalue is true, getAllowsChildren()
      * is messaged, otherwise isLeaf() is messaged.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    public DefaultTreeModel(TreeNode root, boolean asksAllowsChildren) {

    /**
      * Creates a tree specifying whether any node can have children,
      * or whether only certain nodes can have children.
      *
      * @param root a TreeNode object that is the root of the tree
      * @param asksAllowsChildren a boolean, false if any node can
      *        have children, true if each node is asked to see if
      *        it can have children
      * @see #asksAllowsChildren
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
     @ConstructorProperties({"root"})

    /**
      * Creates a tree in which any node can have children.
      *
      * @param root a TreeNode object that is the root of the tree
      * @see #DefaultTreeModel(TreeNode, boolean)
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
    protected EventListenerList listenerList = new EventListenerList();

    /** Listeners. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeModel.java
public class DefaultTreeModel implements Serializable, TreeModel {

/**
 * A simple tree data model that uses TreeNodes.
 * For further information and examples that use DefaultTreeModel,
 * see <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/tree.html">How to Use Trees</a>
 * in <em>The Java Tutorial.</em>
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
