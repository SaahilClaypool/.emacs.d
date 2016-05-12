_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public DocTreePath getParentPath() {

    /**
     * Get the path for the enclosing node, or null if there is no enclosing node.
     * @return DocTreePath of parent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public DocTree getLeaf() {

    /**
     * Get the leaf node for this path.
     * @return DocTree for this DocTreePath
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public DocCommentTree getDocComment() {

    /**
     * Get the DocCommentTree associated with this path.
     * @return DocCommentTree for this DocTreePath
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public TreePath getTreePath() {

    /**
     * Get the TreePath associated with this path.
     * @return TreePath for this DocTreePath
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public DocTreePath(DocTreePath p, DocTree t) {

    /**
     * Creates a DocTreePath for a child node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public DocTreePath(TreePath treePath, DocCommentTree t) {

    /**
     * Creates a DocTreePath for a root node.
     *
     * @param treePath the TreePath from which the root node was created.
     * @param t the DocCommentTree to create the path for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public static DocTreePath getPath(DocTreePath path, DocTree target) {

    /**
     * Gets a documentation tree path for a tree node within a subtree identified by a DocTreePath object.
     * @return null if the node is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public static DocTreePath getPath(TreePath treePath, DocCommentTree doc, DocTree target) {

    /**
     * Gets a documentation tree path for a tree node within a compilation unit.
     * @return null if the node is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
@jdk.Exported

/**
 * A path of tree nodes, typically used to represent the sequence of ancestor
 * nodes of a tree node up to the top level DocCommentTree node.
 *
 * @since 1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public DocTreePath getParentPath() {

    /**
     * Get the path for the enclosing node, or null if there is no enclosing node.
     * @return DocTreePath of parent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public DocTree getLeaf() {

    /**
     * Get the leaf node for this path.
     * @return DocTree for this DocTreePath
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public DocCommentTree getDocComment() {

    /**
     * Get the DocCommentTree associated with this path.
     * @return DocCommentTree for this DocTreePath
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public TreePath getTreePath() {

    /**
     * Get the TreePath associated with this path.
     * @return TreePath for this DocTreePath
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public DocTreePath(DocTreePath p, DocTree t) {

    /**
     * Creates a DocTreePath for a child node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public DocTreePath(TreePath treePath, DocCommentTree t) {

    /**
     * Creates a DocTreePath for a root node.
     *
     * @param treePath the TreePath from which the root node was created.
     * @param t the DocCommentTree to create the path for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public static DocTreePath getPath(DocTreePath path, DocTree target) {

    /**
     * Gets a documentation tree path for a tree node within a subtree identified by a DocTreePath object.
     * @return null if the node is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
    public static DocTreePath getPath(TreePath treePath, DocCommentTree doc, DocTree target) {

    /**
     * Gets a documentation tree path for a tree node within a compilation unit.
     * @return null if the node is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreePath.java
@jdk.Exported

/**
 * A path of tree nodes, typically used to represent the sequence of ancestor
 * nodes of a tree node up to the top level DocCommentTree node.
 *
 * @since 1.8
 */
