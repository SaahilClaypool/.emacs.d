_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    private String systemId = null;

    /**
     * <p>The System ID that may be used in association with the node.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    private Node nextSibling = null;

    /**
     * <p>The child node before which the result nodes will be inserted.</p>
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    private Node node = null;

    /**
     * <p>The node to which the transformation will be appended.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    // Internal state.

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    public String getSystemId() {

    /**
     * <p>Get the System Identifier.</p>
     *
     * <p>If no System ID was set via
     * {@link #DOMResult(Node node, String systemId)},
     * {@link #DOMResult(Node node, Node nextSibling, String systemId)} or
     * {@link #setSystemId(String systemId)},
     * then <code>null</code> will be returned.</p>
     *
     * @return The system identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    public void setSystemId(String systemId) {

    /**
     * <p>Set the systemId that may be used in association with the node.</p>
     *
     * @param systemId The system identifier as a URI string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    public Node getNextSibling() {

    /**
     * <p>Get the child node before which the result nodes will be inserted.</p>
     *
     * <p>If no node was set via
     * {@link #DOMResult(Node node, Node nextSibling)},
     * {@link #DOMResult(Node node, Node nextSibling, String systemId)} or
     * {@link #setNextSibling(Node nextSibling)},
     * then <code>null</code> will be returned.</p>
     *
     * @return The child node before which the result nodes will be inserted.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    public void setNextSibling(Node nextSibling) {

    /**
     * <p>Set the child node before which the result nodes will be inserted.</p>
     *
     * <p>Use <code>nextSibling</code> to specify the child node
     * before which the result nodes should be inserted.
     * If <code>nextSibling</code> is not a descendant of <code>node</code>,
     * then an <code>IllegalArgumentException</code> is thrown.
     * If <code>node</code> is <code>null</code> and <code>nextSibling</code> is not <code>null</code>,
     * then an <code>IllegalStateException</code> is thrown.
     * If <code>nextSibling</code> is <code>null</code>,
     * then the behavior is the same as calling {@link #DOMResult(Node node)},
     * i.e. append the result nodes as the last child of the specified <code>node</code>.</p>
     *
     * @param nextSibling The child node before which the result nodes will be inserted.
     *
     * @throws IllegalArgumentException If <code>nextSibling</code> is not a
     *   descendant of <code>node</code>.
     * @throws IllegalStateException If <code>node</code> is <code>null</code>
     *   and <code>nextSibling</code> is not <code>null</code>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    public Node getNode() {

    /**
     * <p>Get the node that will contain the result DOM tree.</p>
     *
     * <p>If no node was set via
     * {@link #DOMResult(Node node)},
     * {@link #DOMResult(Node node, String systeId)},
     * {@link #DOMResult(Node node, Node nextSibling)},
     * {@link #DOMResult(Node node, Node nextSibling, String systemId)} or
     * {@link #setNode(Node node)},
     * then the node will be set by the transformation, and may be obtained from this method once the transformation is complete.
     * Calling this method before the transformation will return <code>null</code>.</p>
     *
     * @return The node to which the transformation will be appended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    public void setNode(Node node) {

    /**
     * <p>Set the node that will contain the result DOM tree.<p>
     *
     * <p>In practice, the node should be
     * a {@link org.w3c.dom.Document} node,
     * a {@link org.w3c.dom.DocumentFragment} node, or
     * a {@link org.w3c.dom.Element} node.
     * In other words, a node that accepts children.</p>
     *
     * <p>An <code>IllegalStateException</code> is thrown if
     * <code>nextSibling</code> is not <code>null</code> and
     * <code>node</code> is not a parent of <code>nextSibling</code>.
     * An <code>IllegalStateException</code> is thrown if <code>node</code> is <code>null</code> and
     * <code>nextSibling</code> is not <code>null</code>.</p>
     *
     * @param node The node to which the transformation will be appended.
     *
     * @throws IllegalStateException If <code>nextSibling</code> is not
     *   <code>null</code> and
     *   <code>nextSibling</code> is not a child of <code>node</code> or
     *   <code>node</code> is <code>null</code> and
     *   <code>nextSibling</code> is not <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    public DOMResult(Node node, Node nextSibling, String systemId) {

    /**
     * <p>Use a DOM node to create a new output target specifying the child node where the result nodes should be inserted before and
     * the specified System ID.</p>
     *
     * <p>In practice, <code>node</code> and <code>nextSibling</code> should be
     * a {@link org.w3c.dom.Document} node,
     * a {@link org.w3c.dom.DocumentFragment} node, or a
     * {@link org.w3c.dom.Element} node.
     * In other words, a node that accepts children.</p>
     *
     * <p>Use <code>nextSibling</code> to specify the child node
     * where the result nodes should be inserted before.
     * If <code>nextSibling</code> is not a sibling of <code>node</code>,
     * then an <code>IllegalArgumentException</code> is thrown.
     * If <code>node</code> is <code>null</code> and <code>nextSibling</code> is not <code>null</code>,
     * then an <code>IllegalArgumentException</code> is thrown.
     * If <code>nextSibling</code> is <code>null</code>,
     * then the behavior is the same as calling {@link #DOMResult(Node node, String systemId)},
     * i.e. append the result nodes as the last child of the specified node and use the specified System ID.</p>
     *
     * @param node The DOM node that will contain the result tree.
     * @param nextSibling The child node where the result nodes should be inserted before.
     * @param systemId The system identifier which may be used in association with this node.
     *
     * @throws IllegalArgumentException If <code>nextSibling</code> is not a
     *   sibling of <code>node</code> or
     *   <code>node</code> is <code>null</code> and <code>nextSibling</code>
     *   is not <code>null</code>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    public DOMResult(Node node, Node nextSibling) {

    /**
     * <p>Use a DOM node to create a new output target specifying the child node where the result nodes should be inserted before.</p>
     *
     * <p>In practice, <code>node</code> and <code>nextSibling</code> should be
     * a {@link org.w3c.dom.Document} node,
     * a {@link org.w3c.dom.DocumentFragment} node, or
     * a {@link org.w3c.dom.Element} node.
     * In other words, a node that accepts children.</p>
     *
     * <p>Use <code>nextSibling</code> to specify the child node
     * where the result nodes should be inserted before.
     * If <code>nextSibling</code> is not a sibling of <code>node</code>,
     * then an <code>IllegalArgumentException</code> is thrown.
     * If <code>node</code> is <code>null</code> and <code>nextSibling</code> is not <code>null</code>,
     * then an <code>IllegalArgumentException</code> is thrown.
     * If <code>nextSibling</code> is <code>null</code>,
     * then the behavior is the same as calling {@link #DOMResult(Node node)},
     * i.e. append the result nodes as the last child of the specified <code>node</code>.</p>
     *
     * <p><code>systemId</code> will be set to <code>null</code>.</p>
     *
     * @param node The DOM node that will contain the result tree.
     * @param nextSibling The child node where the result nodes should be inserted before.
     *
     * @throws IllegalArgumentException If <code>nextSibling</code> is not a sibling of <code>node</code> or
     *   <code>node</code> is <code>null</code> and <code>nextSibling</code>
     *   is not <code>null</code>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    public DOMResult(Node node, String systemId) {

    /**
     * <p>Use a DOM node to create a new output target with the specified System ID.<p>
     *
     * <p>In practice, the node should be
     * a {@link org.w3c.dom.Document} node,
     * a {@link org.w3c.dom.DocumentFragment} node, or
     * a {@link org.w3c.dom.Element} node.
     * In other words, a node that accepts children.</p>
     *
     * <p><code>siblingNode</code> will be set to <code>null</code>.</p>
     *
     * @param node The DOM node that will contain the result tree.
     * @param systemId The system identifier which may be used in association with this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    public DOMResult(Node node) {

    /**
     * <p>Use a DOM node to create a new output target.</p>
     *
     * <p>In practice, the node should be
     * a {@link org.w3c.dom.Document} node,
     * a {@link org.w3c.dom.DocumentFragment} node, or
     * a {@link org.w3c.dom.Element} node.
     * In other words, a node that accepts children.</p>
     *
     * <p><code>siblingNode</code> and
     * <code>systemId</code>
     * will be set to <code>null</code>.</p>
     *
     * @param node The DOM node that will contain the result tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    public DOMResult() {

    /**
     * <p>Zero-argument default constructor.</p>
     *
     * <p><code>node</code>,
     * <code>siblingNode</code> and
     * <code>systemId</code>
     * will be set to <code>null</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
    public static final String FEATURE = "http://javax.xml.transform.dom.DOMResult/feature";

    /** <p>If {@link javax.xml.transform.TransformerFactory#getFeature}
     * returns <code>true</code> when passed this value as an argument,
     * the <code>Transformer</code> supports <code>Result</code> output of this type.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMResult.java
public class DOMResult implements Result {

/**
 * <p>Acts as a holder for a transformation result tree in the form of a Document Object Model (DOM) tree.</p>
 *
 * <p>If no output DOM source is set, the transformation will create a Document node as the holder for the result of the transformation,
 * which may be retrieved with {@link #getNode()}.</p>
 *
 * @author <a href="Jeff.Suttor@Sun.com">Jeff Suttor</a>
 */
