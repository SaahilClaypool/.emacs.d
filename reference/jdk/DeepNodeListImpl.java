_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeepNodeListImpl.java
    protected Node nextMatchingElementAfter(Node current) {

    /**
     * Iterative tree-walker. When you have a Parent link, there's often no
     * need to resort to recursion. NOTE THAT only Element nodes are matched
     * since we're specifically supporting getElementsByTagName().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeepNodeListImpl.java
    public Node item(int index) {

    /** Returns the node at the specified index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeepNodeListImpl.java
    public int getLength() {

    /** Returns the length of the node list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeepNodeListImpl.java
    public DeepNodeListImpl(NodeImpl rootNode,
                            String nsName, String tagName) {

    /** Constructor for Namespace support. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeepNodeListImpl.java
    public DeepNodeListImpl(NodeImpl rootNode, String tagName) {

    /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeepNodeListImpl.java
public class DeepNodeListImpl

/**
 * This class implements the DOM's NodeList behavior for
 * Element.getElementsByTagName()
 * <P>
 * The DOM describes NodeList as follows:
 * <P>
 * 1) It may represent EITHER nodes scattered through a subtree (when
 * returned by Element.getElementsByTagName), or just the immediate
 * children (when returned by Node.getChildNodes). The latter is easy,
 * but the former (which this class addresses) is more challenging.
 * <P>
 * 2) Its behavior is "live" -- that is, it always reflects the
 * current state of the document tree. To put it another way, the
 * NodeLists obtained before and after a series of insertions and
 * deletions are effectively identical (as far as the user is
 * concerned, the former has been dynamically updated as the changes
 * have been made).
 * <P>
 * 3) Its API accesses individual nodes via an integer index, with the
 * listed nodes numbered sequentially in the order that they were
 * found during a preorder depth-first left-to-right search of the tree.
 * (Of course in the case of getChildNodes, depth is not involved.) As
 * nodes are inserted or deleted in the tree, and hence the NodeList,
 * the numbering of nodes that follow them in the NodeList will
 * change.
 * <P>
 * It is rather painful to support the latter two in the
 * getElementsByTagName case. The current solution is for Nodes to
 * maintain a change count (eventually that may be a Digest instead),
 * which the NodeList tracks and uses to invalidate itself.
 * <P>
 * Unfortunately, this does _not_ respond efficiently in the case that
 * the dynamic behavior was supposed to address: scanning a tree while
 * it is being extended. That requires knowing which subtrees have
 * changed, which can become an arbitrarily complex problem.
 * <P>
 * We save some work by filling the vector only as we access the
 * item()s... but I suspect the same users who demanded index-based
 * access will also start by doing a getLength() to control their loop,
 * blowing this optimization out of the water.
 * <P>
 * NOTE: Level 2 of the DOM will probably _not_ use NodeList for its
 * extended search mechanisms, partly for the reasons just discussed.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeepNodeListImpl.java
    protected Node nextMatchingElementAfter(Node current) {

    /**
     * Iterative tree-walker. When you have a Parent link, there's often no
     * need to resort to recursion. NOTE THAT only Element nodes are matched
     * since we're specifically supporting getElementsByTagName().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeepNodeListImpl.java
    public Node item(int index) {

    /** Returns the node at the specified index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeepNodeListImpl.java
    public int getLength() {

    /** Returns the length of the node list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeepNodeListImpl.java
    public DeepNodeListImpl(NodeImpl rootNode,
                            String nsName, String tagName) {

    /** Constructor for Namespace support. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeepNodeListImpl.java
    public DeepNodeListImpl(NodeImpl rootNode, String tagName) {

    /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeepNodeListImpl.java
public class DeepNodeListImpl

/**
 * This class implements the DOM's NodeList behavior for
 * Element.getElementsByTagName()
 * <P>
 * The DOM describes NodeList as follows:
 * <P>
 * 1) It may represent EITHER nodes scattered through a subtree (when
 * returned by Element.getElementsByTagName), or just the immediate
 * children (when returned by Node.getChildNodes). The latter is easy,
 * but the former (which this class addresses) is more challenging.
 * <P>
 * 2) Its behavior is "live" -- that is, it always reflects the
 * current state of the document tree. To put it another way, the
 * NodeLists obtained before and after a series of insertions and
 * deletions are effectively identical (as far as the user is
 * concerned, the former has been dynamically updated as the changes
 * have been made).
 * <P>
 * 3) Its API accesses individual nodes via an integer index, with the
 * listed nodes numbered sequentially in the order that they were
 * found during a preorder depth-first left-to-right search of the tree.
 * (Of course in the case of getChildNodes, depth is not involved.) As
 * nodes are inserted or deleted in the tree, and hence the NodeList,
 * the numbering of nodes that follow them in the NodeList will
 * change.
 * <P>
 * It is rather painful to support the latter two in the
 * getElementsByTagName case. The current solution is for Nodes to
 * maintain a change count (eventually that may be a Digest instead),
 * which the NodeList tracks and uses to invalidate itself.
 * <P>
 * Unfortunately, this does _not_ respond efficiently in the case that
 * the dynamic behavior was supposed to address: scanning a tree while
 * it is being extended. That requires knowing which subtrees have
 * changed, which can become an arbitrarily complex problem.
 * <P>
 * We save some work by filling the vector only as we access the
 * item()s... but I suspect the same users who demanded index-based
 * access will also start by doing a getLength() to control their loop,
 * blowing this optimization out of the water.
 * <P>
 * NOTE: Level 2 of the DOM will probably _not_ use NodeList for its
 * extended search mechanisms, partly for the reasons just discussed.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
