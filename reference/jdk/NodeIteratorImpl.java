_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public void removeNode(Node node) {

    /** Fix-up the iterator on a remove. Called by DOM or otherwise,
     *  before an actual DOM remove.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    Node previousNode(Node node) {

    /** The method previousNode(Node) returns the previous node
     *  from the actual DOM tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    Node nextNode(Node node, boolean visitChildren) {

    /** The method nextNode(Node, boolean) returns the next node
     *  from the actual DOM tree.
     *
     *  The boolean visitChildren determines whether to visit the children.
     *  The result is the nextNode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    Node matchNodeOrParent(Node node) {

    /** Return node, if matches or any parent if matches. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    boolean acceptNode(Node node) {

    /** The node is accepted if it passes the whatToShow and the filter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public Node               previousNode() {

    /** Return the previous Node in the Iterator. The node is the next node in
     *  _backwards_ depth-first order which also passes the filter, and whatToShow.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public Node               nextNode() {

    /** Return the next Node in the Iterator. The node is the next node in
     *  depth-first order which also passes the filter, and whatToShow.
     *  If there is no next node which passes these criteria, then return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public boolean            getExpandEntityReferences() {

    /** Return whether children entity references are included in the iterator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public NodeFilter         getFilter() {

    /** Return the filter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public int                getWhatToShow() {

    /** Return the whatToShow value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public NodeIteratorImpl( DocumentImpl document,
                             Node root,
                             int whatToShow,
                             NodeFilter nodeFilter,
                             boolean entityReferenceExpansion) {

    /** Public constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    private boolean fEntityReferenceExpansion;

    /** When TRUE, the children of entites references are returned in the iterator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    private boolean fForward = true;

    /** The direction of the iterator on the fCurrentNode.
     *  <pre>
     *  nextNode()  ==      fForward = true;
     *  previousNode() ==   fForward = false;
     *  </pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    private Node fCurrentNode;

    /** The last Node returned. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    private boolean fDetach = false;

    /** If detach is called, the fDetach flag is true, otherwise flase. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    private int fWhatToShow = NodeFilter.SHOW_ALL;

    /** The whatToShow mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    private DocumentImpl fDocument;

    /** The DocumentImpl which created this iterator, so it can be detached. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
public class NodeIteratorImpl implements NodeIterator {

/** DefaultNodeIterator implements a NodeIterator, which iterates a
 *  DOM tree in the expected depth first way.
 *
 *  <p>The whatToShow and filter functionality is implemented as expected.
 *
 *  <p>This class also has method removeNode to enable iterator "fix-up"
 *  on DOM remove. It is expected that the DOM implementation call removeNode
 *  right before the actual DOM transformation. If not called by the DOM,
 *  the client could call it before doing the removal.
 *
 * @xerces.internal
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public void removeNode(Node node) {

    /** Fix-up the iterator on a remove. Called by DOM or otherwise,
     *  before an actual DOM remove.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    Node previousNode(Node node) {

    /** The method previousNode(Node) returns the previous node
     *  from the actual DOM tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    Node nextNode(Node node, boolean visitChildren) {

    /** The method nextNode(Node, boolean) returns the next node
     *  from the actual DOM tree.
     *
     *  The boolean visitChildren determines whether to visit the children.
     *  The result is the nextNode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    Node matchNodeOrParent(Node node) {

    /** Return node, if matches or any parent if matches. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    boolean acceptNode(Node node) {

    /** The node is accepted if it passes the whatToShow and the filter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public Node               previousNode() {

    /** Return the previous Node in the Iterator. The node is the next node in
     *  _backwards_ depth-first order which also passes the filter, and whatToShow.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public Node               nextNode() {

    /** Return the next Node in the Iterator. The node is the next node in
     *  depth-first order which also passes the filter, and whatToShow.
     *  If there is no next node which passes these criteria, then return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public boolean            getExpandEntityReferences() {

    /** Return whether children entity references are included in the iterator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public NodeFilter         getFilter() {

    /** Return the filter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public int                getWhatToShow() {

    /** Return the whatToShow value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    public NodeIteratorImpl( DocumentImpl document,
                             Node root,
                             int whatToShow,
                             NodeFilter nodeFilter,
                             boolean entityReferenceExpansion) {

    /** Public constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    private boolean fEntityReferenceExpansion;

    /** When TRUE, the children of entites references are returned in the iterator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    private boolean fForward = true;

    /** The direction of the iterator on the fCurrentNode.
     *  <pre>
     *  nextNode()  ==      fForward = true;
     *  previousNode() ==   fForward = false;
     *  </pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    private Node fCurrentNode;

    /** The last Node returned. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    private boolean fDetach = false;

    /** If detach is called, the fDetach flag is true, otherwise flase. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    private int fWhatToShow = NodeFilter.SHOW_ALL;

    /** The whatToShow mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
    private DocumentImpl fDocument;

    /** The DocumentImpl which created this iterator, so it can be detached. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeIteratorImpl.java
public class NodeIteratorImpl implements NodeIterator {

/** DefaultNodeIterator implements a NodeIterator, which iterates a
 *  DOM tree in the expected depth first way.
 *
 *  <p>The whatToShow and filter functionality is implemented as expected.
 *
 *  <p>This class also has method removeNode to enable iterator "fix-up"
 *  on DOM remove. It is expected that the DOM implementation call removeNode
 *  right before the actual DOM transformation. If not called by the DOM,
 *  the client could call it before doing the removal.
 *
 * @xerces.internal
 *
 */
