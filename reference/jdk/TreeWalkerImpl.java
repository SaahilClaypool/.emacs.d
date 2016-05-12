_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    short acceptNode(Node node) {

    /** Internal function.
     *  The node whatToShow and the filter are combined into one result. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getLastChild(Node node) {

    /** Internal function.
     *  Return the last child Node, from the input node
     *  after applying filter, whatToshow.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getFirstChild(Node node) {

    /** Internal function.
     *  Return the first child Node, from the input node
     *  after applying filter, whatToshow.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getPreviousSibling(Node node, Node root) {

    /** Internal function.
     *  Return the previousSibling Node, from the input node
     *  after applying filter, whatToshow.
         *  NEVER TRAVERSES ABOVE THE SPECIFIED ROOT NODE.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getPreviousSibling(Node node) {

    /** Internal function.
     *  Return the previous sibling Node, from the input node
     *  after applying filter, whatToshow.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getNextSibling(Node node, Node root) {

    /** Internal function.
     *  Return the nextSibling Node, from the input node
     *  after applying filter, whatToshow.
     *  NEVER TRAVERSES ABOVE THE SPECIFIED ROOT NODE.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getNextSibling(Node node) {

    /** Internal function.
     *  Return the nextSibling Node, from the input node
     *  after applying filter, whatToshow.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getParentNode(Node node) {

    /** Internal function.
     *  Return the parent Node, from the input node
     *  after applying filter, whatToshow.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               nextNode() {

    /** Return the next Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               previousNode() {

    /** Return the previous Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               nextSibling(){

    /** Return the next sibling Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               previousSibling() {

    /** Return the previous sibling Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               lastChild() {

    /** Return the last child Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               firstChild() {

    /** Return the first child Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               parentNode() {

    /** Return the parent Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public void               setCurrentNode(Node node) {

    /** Return the current Node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               getCurrentNode() {

    /** Return the current Node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public boolean            getExpandEntityReferences() {

    /** Return whether children entity references are included in the iterator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public NodeFilter         getFilter() {

    /** Return the NodeFilter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public int                getWhatToShow() {

    /** Return the whatToShow value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public TreeWalkerImpl(Node root,
                          int whatToShow,
                          NodeFilter nodeFilter,
                          boolean entityReferenceExpansion) {

    /** Public constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node fRoot;

    /** The root Node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    NodeFilter fNodeFilter;

    /** The NodeFilter reference. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    private boolean fEntityReferenceExpansion = false;

    /** When TRUE, the children of entites references are returned in the iterator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
public class TreeWalkerImpl implements TreeWalker {

/** This class implements the TreeWalker interface.
 *
 * @xerces.internal
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    short acceptNode(Node node) {

    /** Internal function.
     *  The node whatToShow and the filter are combined into one result. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getLastChild(Node node) {

    /** Internal function.
     *  Return the last child Node, from the input node
     *  after applying filter, whatToshow.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getFirstChild(Node node) {

    /** Internal function.
     *  Return the first child Node, from the input node
     *  after applying filter, whatToshow.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getPreviousSibling(Node node, Node root) {

    /** Internal function.
     *  Return the previousSibling Node, from the input node
     *  after applying filter, whatToshow.
         *  NEVER TRAVERSES ABOVE THE SPECIFIED ROOT NODE.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getPreviousSibling(Node node) {

    /** Internal function.
     *  Return the previous sibling Node, from the input node
     *  after applying filter, whatToshow.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getNextSibling(Node node, Node root) {

    /** Internal function.
     *  Return the nextSibling Node, from the input node
     *  after applying filter, whatToshow.
     *  NEVER TRAVERSES ABOVE THE SPECIFIED ROOT NODE.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getNextSibling(Node node) {

    /** Internal function.
     *  Return the nextSibling Node, from the input node
     *  after applying filter, whatToshow.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node getParentNode(Node node) {

    /** Internal function.
     *  Return the parent Node, from the input node
     *  after applying filter, whatToshow.
     *  The current node is not consulted or set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               nextNode() {

    /** Return the next Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               previousNode() {

    /** Return the previous Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               nextSibling(){

    /** Return the next sibling Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               previousSibling() {

    /** Return the previous sibling Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               lastChild() {

    /** Return the last child Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               firstChild() {

    /** Return the first child Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               parentNode() {

    /** Return the parent Node from the current node,
     *  after applying filter, whatToshow.
     *  If result is not null, set the current Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public void               setCurrentNode(Node node) {

    /** Return the current Node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public Node               getCurrentNode() {

    /** Return the current Node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public boolean            getExpandEntityReferences() {

    /** Return whether children entity references are included in the iterator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public NodeFilter         getFilter() {

    /** Return the NodeFilter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public int                getWhatToShow() {

    /** Return the whatToShow value */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    public TreeWalkerImpl(Node root,
                          int whatToShow,
                          NodeFilter nodeFilter,
                          boolean entityReferenceExpansion) {

    /** Public constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    Node fRoot;

    /** The root Node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    NodeFilter fNodeFilter;

    /** The NodeFilter reference. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
    private boolean fEntityReferenceExpansion = false;

    /** When TRUE, the children of entites references are returned in the iterator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TreeWalkerImpl.java
public class TreeWalkerImpl implements TreeWalker {

/** This class implements the TreeWalker interface.
 *
 * @xerces.internal
 *
 */
