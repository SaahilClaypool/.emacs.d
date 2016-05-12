_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    @Override

    /**
     *  Iterates from leaves to root.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public TreePath getParentPath() {

    /**
     * Get the path for the enclosing node, or null if there is no enclosing node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public Tree getLeaf() {

    /**
     * Get the leaf node for this path.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public CompilationUnitTree getCompilationUnit() {

    /**
     * Get the compilation unit associated with this path.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public TreePath(TreePath p, Tree t) {

    /**
     * Creates a TreePath for a child node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public TreePath(CompilationUnitTree t) {

    /**
     * Creates a TreePath for a root node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public static TreePath getPath(TreePath path, Tree target) {

    /**
     * Gets a tree path for a tree node within a subtree identified by a TreePath object.
     * @return null if the node is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public static TreePath getPath(CompilationUnitTree unit, Tree target) {

    /**
     * Gets a tree path for a tree node within a compilation unit.
     * @return null if the node is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
@jdk.Exported

/**
 * A path of tree nodes, typically used to represent the sequence of ancestor
 * nodes of a tree node up to the top level CompilationUnitTree node.
 *
 * @author Jonathan Gibbons
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    @Override

    /**
     *  Iterates from leaves to root.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public TreePath getParentPath() {

    /**
     * Get the path for the enclosing node, or null if there is no enclosing node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public Tree getLeaf() {

    /**
     * Get the leaf node for this path.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public CompilationUnitTree getCompilationUnit() {

    /**
     * Get the compilation unit associated with this path.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public TreePath(TreePath p, Tree t) {

    /**
     * Creates a TreePath for a child node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public TreePath(CompilationUnitTree t) {

    /**
     * Creates a TreePath for a root node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public static TreePath getPath(TreePath path, Tree target) {

    /**
     * Gets a tree path for a tree node within a subtree identified by a TreePath object.
     * @return null if the node is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
    public static TreePath getPath(CompilationUnitTree unit, Tree target) {

    /**
     * Gets a tree path for a tree node within a compilation unit.
     * @return null if the node is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePath.java
@jdk.Exported

/**
 * A path of tree nodes, typically used to represent the sequence of ancestor
 * nodes of a tree node up to the top level CompilationUnitTree node.
 *
 * @author Jonathan Gibbons
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    public String toString() {

    /**
     * Returns a string that displays and identifies this
     * object's properties.
     *
     * @return a String representation of this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    public TreePath getParentPath() {

    /**
     * Returns the {@code TreePath} of the parent. A return value of
     * {@code null} indicates this is the root node.
     *
     * @return the parent path
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    public TreePath pathByAddingChild(Object child) {

    /**
     * Returns a new path containing all the elements of this path
     * plus <code>child</code>. <code>child</code> is the last element
     * of the newly created {@code TreePath}.
     *
     * @param child the path element to add
     * @throws NullPointerException if {@code child} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    public boolean isDescendant(TreePath aTreePath) {

    /**
     * Returns true if <code>aTreePath</code> is a
     * descendant of this
     * {@code TreePath}. A {@code TreePath} {@code P1} is a descendant of a
     * {@code TreePath} {@code P2}
     * if {@code P1} contains all of the elements that make up
     * {@code P2's} path.
     * For example, if this object has the path {@code [a, b]},
     * and <code>aTreePath</code> has the path {@code [a, b, c]},
     * then <code>aTreePath</code> is a descendant of this object.
     * However, if <code>aTreePath</code> has the path {@code [a]},
     * then it is not a descendant of this object.  By this definition
     * a {@code TreePath} is always considered a descendant of itself.
     * That is, <code>aTreePath.isDescendant(aTreePath)</code> returns
     * {@code true}.
     *
     * @param aTreePath the {@code TreePath} to check
     * @return true if <code>aTreePath</code> is a descendant of this path
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    public int hashCode() {

    /**
     * Returns the hash code of this {@code TreePath}. The hash code of a
     * {@code TreePath} is the hash code of the last element in the path.
     *
     * @return the hashCode for the object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    public boolean equals(Object o) {

    /**
     * Compares this {@code TreePath} to the specified object. This returns
     * {@code true} if {@code o} is a {@code TreePath} with the exact
     * same elements (as determined by using {@code equals} on each
     * element of the path).
     *
     * @param o the object to compare
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    public Object getPathComponent(int index) {

    /**
     * Returns the path element at the specified index.
     *
     * @param index the index of the element requested
     * @return the element at the specified index
     * @throws IllegalArgumentException if the index is outside the
     *         range of this path
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    public int getPathCount() {

    /**
     * Returns the number of elements in the path.
     *
     * @return the number of elements in the path
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    public Object getLastPathComponent() {

    /**
     * Returns the last element of this path.
     *
     * @return the last element in the path
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    public Object[] getPath() {

    /**
     * Returns an ordered array of the elements of this {@code TreePath}.
     * The first element is the root.
     *
     * @return an array of the elements in this {@code TreePath}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    protected TreePath() {

    /**
     * Creates an empty {@code TreePath}.  This is provided for
     * subclasses that represent paths in a different
     * manner. Subclasses that use this constructor must override
     * {@code getLastPathComponent}, and {@code getParentPath}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    protected TreePath(Object[] path, int length) {

    /**
     * Creates a {@code TreePath} from an array. The returned
     * {@code TreePath} represents the elements of the array from
     * {@code 0} to {@code length - 1}.
     * <p>
     * This constructor is used internally, and generally not useful outside
     * of subclasses.
     *
     * @param path the array to create the {@code TreePath} from
     * @param length identifies the number of elements in {@code path} to
     *        create the {@code TreePath} from
     * @throws NullPointerException if {@code path} is {@code null}
     * @throws ArrayIndexOutOfBoundsException if {@code length - 1} is
     *         outside the range of the array
     * @throws IllegalArgumentException if any of the elements from
     *         {@code 0} to {@code length - 1} are {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    protected TreePath(TreePath parent, Object lastPathComponent) {

    /**
     * Creates a {@code TreePath} with the specified parent and element.
     *
     * @param parent the path to the parent, or {@code null} to indicate
     *        the root
     * @param lastPathComponent the last path element
     * @throws IllegalArgumentException if {@code lastPathComponent} is
     *         {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    public TreePath(Object lastPathComponent) {

    /**
     * Creates a {@code TreePath} containing a single element. This is
     * used to construct a {@code TreePath} identifying the root.
     *
     * @param lastPathComponent the root
     * @see #TreePath(Object[])
     * @throws IllegalArgumentException if {@code lastPathComponent} is
     *         {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    @ConstructorProperties({"path"})

    /**
     * Creates a {@code TreePath} from an array. The array uniquely
     * identifies the path to a node.
     *
     * @param path an array of objects representing the path to a node
     * @throws IllegalArgumentException if {@code path} is {@code null},
     *         empty, or contains a {@code null} value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
    private Object lastPathComponent;

    /** Last path component. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/TreePath.java
public class TreePath extends Object implements Serializable {

/**
 * {@code TreePath} represents an array of objects that uniquely
 * identify the path to a node in a tree. The elements of the array
 * are ordered with the root as the first element of the array. For
 * example, a file on the file system is uniquely identified based on
 * the array of parent directories and the name of the file. The path
 * {@code /tmp/foo/bar} could be represented by a {@code TreePath} as
 * {@code new TreePath(new Object[] {"tmp", "foo", "bar"})}.
 * <p>
 * {@code TreePath} is used extensively by {@code JTree} and related classes.
 * For example, {@code JTree} represents the selection as an array of
 * {@code TreePath}s. When used with {@code JTree}, the elements of the
 * path are the objects returned from the {@code TreeModel}. When {@code JTree}
 * is paired with {@code DefaultTreeModel}, the elements of the
 * path are {@code TreeNode}s. The following example illustrates extracting
 * the user object from the selection of a {@code JTree}:
 * <pre>
 *   DefaultMutableTreeNode root = ...;
 *   DefaultTreeModel model = new DefaultTreeModel(root);
 *   JTree tree = new JTree(model);
 *   ...
 *   TreePath selectedPath = tree.getSelectionPath();
 *   DefaultMutableTreeNode selectedNode =
 *       ((DefaultMutableTreeNode)selectedPath.getLastPathComponent()).
 *       getUserObject();
 * </pre>
 * Subclasses typically need override only {@code
 * getLastPathComponent}, and {@code getParentPath}. As {@code JTree}
 * internally creates {@code TreePath}s at various points, it's
 * generally not useful to subclass {@code TreePath} and use with
 * {@code JTree}.
 * <p>
 * While {@code TreePath} is serializable, a {@code
 * NotSerializableException} is thrown if any elements of the path are
 * not serializable.
 * <p>
 * For further information and examples of using tree paths,
 * see <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/tree.html">How to Use Trees</a>
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
 * @author Scott Violet
 * @author Philip Milne
 */
