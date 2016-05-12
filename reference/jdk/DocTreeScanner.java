_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreeScanner.java
    public R reduce(R r1, R r2) {

    /**
     * Reduces two results into a combined result.
     * The default implementation is to return the first parameter.
     * The general contract of the method is that it may take any action whatsoever.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreeScanner.java
    public R scan(Iterable<? extends DocTree> nodes, P p) {

    /**
     * Scan a list of nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreeScanner.java
    public R scan(DocTree node, P p) {

    /**
     * Scan a single node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreeScanner.java
@jdk.Exported

/**
 * A TreeVisitor that visits all the child tree nodes.
 * To visit nodes of a particular type, just override the
 * corresponding visitXYZ method.
 * Inside your method, call super.visitXYZ to visit descendant
 * nodes.
 *
 * <p>The default implementation of the visitXYZ methods will determine
 * a result as follows:
 * <ul>
 * <li>If the node being visited has no children, the result will be null.
 * <li>If the node being visited has one child, the result will be the
 * result of calling {@code scan} on that child. The child may be a simple node
 * or itself a list of nodes.
 * <li> If the node being visited has more than one child, the result will
 * be determined by calling {@code scan} each child in turn, and then combining the
 * result of each scan after the first with the cumulative result
 * so far, as determined by the {@link #reduce} method. Each child may be either
 * a simple node of a list of nodes. The default behavior of the {@code reduce}
 * method is such that the result of the visitXYZ method will be the result of
 * the last child scanned.
 * </ul>
 *
 * <p>Here is an example to count the number of erroneous nodes in a tree:
 * <pre>
 *   class CountErrors extends DocTreeScanner&lt;Integer,Void&gt; {
 *      {@literal @}Override
 *      public Integer visitErroneous(ErroneousTree node, Void p) {
 *          return 1;
 *      }
 *      {@literal @}Override
 *      public Integer reduce(Integer r1, Integer r2) {
 *          return (r1 == null ? 0 : r1) + (r2 == null ? 0 : r2);
 *      }
 *   }
 * </pre>
 *
 * @since 1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreeScanner.java
    public R reduce(R r1, R r2) {

    /**
     * Reduces two results into a combined result.
     * The default implementation is to return the first parameter.
     * The general contract of the method is that it may take any action whatsoever.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreeScanner.java
    public R scan(Iterable<? extends DocTree> nodes, P p) {

    /**
     * Scan a list of nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreeScanner.java
    public R scan(DocTree node, P p) {

    /**
     * Scan a single node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/util/DocTreeScanner.java
@jdk.Exported

/**
 * A TreeVisitor that visits all the child tree nodes.
 * To visit nodes of a particular type, just override the
 * corresponding visitXYZ method.
 * Inside your method, call super.visitXYZ to visit descendant
 * nodes.
 *
 * <p>The default implementation of the visitXYZ methods will determine
 * a result as follows:
 * <ul>
 * <li>If the node being visited has no children, the result will be null.
 * <li>If the node being visited has one child, the result will be the
 * result of calling {@code scan} on that child. The child may be a simple node
 * or itself a list of nodes.
 * <li> If the node being visited has more than one child, the result will
 * be determined by calling {@code scan} each child in turn, and then combining the
 * result of each scan after the first with the cumulative result
 * so far, as determined by the {@link #reduce} method. Each child may be either
 * a simple node of a list of nodes. The default behavior of the {@code reduce}
 * method is such that the result of the visitXYZ method will be the result of
 * the last child scanned.
 * </ul>
 *
 * <p>Here is an example to count the number of erroneous nodes in a tree:
 * <pre>
 *   class CountErrors extends DocTreeScanner&lt;Integer,Void&gt; {
 *      {@literal @}Override
 *      public Integer visitErroneous(ErroneousTree node, Void p) {
 *          return 1;
 *      }
 *      {@literal @}Override
 *      public Integer reduce(Integer r1, Integer r2) {
 *          return (r1 == null ? 0 : r1) + (r2 == null ? 0 : r2);
 *      }
 *   }
 * </pre>
 *
 * @since 1.8
 */
