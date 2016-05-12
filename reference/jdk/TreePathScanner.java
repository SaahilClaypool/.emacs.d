_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePathScanner.java
    public TreePath getCurrentPath() {

    /**
     * Get the current path for the node, as built up by the currently
     * active set of scan calls.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePathScanner.java
    @Override

    /**
     * Scan a single node.
     * The current path is updated for the duration of the scan.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePathScanner.java
    public R scan(TreePath path, P p) {

    /**
     * Scan a tree from a position identified by a TreePath.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePathScanner.java
@jdk.Exported

/**
 * A TreeVisitor that visits all the child tree nodes, and provides
 * support for maintaining a path for the parent nodes.
 * To visit nodes of a particular type, just override the
 * corresponding visitorXYZ method.
 * Inside your method, call super.visitXYZ to visit descendant
 * nodes.
 *
 * @author Jonathan Gibbons
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePathScanner.java
    public TreePath getCurrentPath() {

    /**
     * Get the current path for the node, as built up by the currently
     * active set of scan calls.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePathScanner.java
    @Override

    /**
     * Scan a single node.
     * The current path is updated for the duration of the scan.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePathScanner.java
    public R scan(TreePath path, P p) {

    /**
     * Scan a tree from a position identified by a TreePath.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/TreePathScanner.java
@jdk.Exported

/**
 * A TreeVisitor that visits all the child tree nodes, and provides
 * support for maintaining a path for the parent nodes.
 * To visit nodes of a particular type, just override the
 * corresponding visitorXYZ method.
 * Inside your method, call super.visitXYZ to visit descendant
 * nodes.
 *
 * @author Jonathan Gibbons
 * @since 1.6
 */
