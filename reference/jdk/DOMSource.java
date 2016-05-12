_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMSource.java
    public String getSystemId() {

    /**
     * Get the base ID (URL or system ID) from where URLs
     * will be resolved.
     *
     * @return Base URL for this DOM tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMSource.java
    public void setSystemId(String systemID) {

    /**
     * Set the base ID (URL or system ID) from where URLs
     * will be resolved.
     *
     * @param systemID Base URL for this DOM tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMSource.java
    public Node getNode() {

    /**
     * Get the node that represents a Source DOM tree.
     *
     * @return The node that is to be transformed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMSource.java
    public void setNode(Node node) {

    /**
     * Set the node that will represents a Source DOM tree.
     *
     * @param node The node that is to be transformed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMSource.java
    public DOMSource(Node node, String systemID) {

    /**
     * Create a new input source with a DOM node, and with the
     * system ID also passed in as the base URI.
     *
     * @param node The DOM node that will contain the Source tree.
     * @param systemID Specifies the base URI associated with node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMSource.java
    public DOMSource(Node n) {

    /**
     * Create a new input source with a DOM node.  The operation
     * will be applied to the subtree rooted at this node.  In XSLT,
     * a "/" pattern still means the root of the tree (not the subtree),
     * and the evaluation of global variables and parameters is done
     * from the root node also.
     *
     * @param n The DOM node that will contain the Source tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMSource.java
    public DOMSource() { }

    /**
     * <p>Zero-argument default constructor.  If this constructor is used, and
     * no DOM source is set using {@link #setNode(Node node)} , then the
     * <code>Transformer</code> will
     * create an empty source {@link org.w3c.dom.Document} using
     * {@link javax.xml.parsers.DocumentBuilder#newDocument()}.</p>
     *
     * @see javax.xml.transform.Transformer#transform(Source xmlSource, Result outputTarget)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMSource.java
    public static final String FEATURE =

    /** If {@link javax.xml.transform.TransformerFactory#getFeature}
     * returns true when passed this value as an argument,
     * the Transformer supports Source input of this type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMSource.java
    private String systemID;

    /**
     * <p>The base ID (URL or system ID) from where URLs
     * will be resolved.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMSource.java
    private Node node;

    /**
     * <p><code>Node</code> to serve as DOM source.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMSource.java
public class DOMSource implements Source {

/**
 * <p>Acts as a holder for a transformation Source tree in the
 * form of a Document Object Model (DOM) tree.</p>
 *
 * <p>Note that XSLT requires namespace support. Attempting to transform a DOM
 * that was not contructed with a namespace-aware parser may result in errors.
 * Parsers can be made namespace aware by calling
 * {@link javax.xml.parsers.DocumentBuilderFactory#setNamespaceAware(boolean awareness)}.</p>
 *
 * @author <a href="Jeff.Suttor@Sun.com">Jeff Suttor</a>
 * @see <a href="http://www.w3.org/TR/DOM-Level-2">Document Object Model (DOM) Level 2 Specification</a>
 */
