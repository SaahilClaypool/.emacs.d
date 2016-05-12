_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
    private void decrementInDegree() {

    /** Decrements the in-degree of this node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
    private void incrementInDegree() {

    /** Increments the in-degree of this node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
    public int getInDegree() {

    /** Returns the in-degree of this node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
    public void dispose() {

    /**
     * Removes this node from the graph, updating neighboring nodes
     * appropriately.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
    public boolean removeEdge(DigraphNode node) {

    /**
     * Removes a directed edge from the graph.  The outNodes list of this
     * node is updated and the in-degree of the other node is decremented.
     *
     * @return <code>true</code> if the node was previously the target
     * of an edge.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
    public boolean hasEdge(DigraphNode node) {

    /**
     * Returns <code>true</code> if an edge exists between this node
     * and the given node.
     *
     * @param node a <code>DigraphNode</code>.
     *
     * @return <code>true</code> if the node is the target of an edge.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
    public boolean addEdge(DigraphNode node) {

    /**
     * Adds a directed edge to the graph.  The outNodes list of this
     * node is updated and the in-degree of the other node is incremented.
     *
     * @param node a <code>DigraphNode</code>.
     *
     * @return <code>true</code> if the node was not previously the
     * target of an edge.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
    public Iterator getOutNodes() {

    /**
     * Returns an <code>Iterator</code> containing the nodes pointed
     * to by this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
    public Object getData() {

    /** Returns the <code>Object</code> referenced by this node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
    private Set inNodes = new HashSet();

    /**
     * A <code>Set</code> of neighboring nodes that point to this
     * node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
    protected int inDegree = 0;

    /** The in-degree of the node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
    protected Set outNodes = new HashSet();

    /**
     * A <code>Set</code> of neighboring nodes pointed to by this
     * node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
    protected Object data;

    /** The data associated with this node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/DigraphNode.java
class DigraphNode implements Cloneable, Serializable {

/**
 * A node in a directed graph.  In addition to an arbitrary
 * <code>Object</code> containing user data associated with the node,
 * each node maintains a <code>Set</code>s of nodes which are pointed
 * to by the current node (available from <code>getOutNodes</code>).
 * The in-degree of the node (that is, number of nodes that point to
 * the current node) may be queried.
 *
 */
