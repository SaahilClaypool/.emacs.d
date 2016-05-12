_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMStructure.java
    public boolean isFeatureSupported(String feature) {

    /**
     * @throws NullPointerException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMStructure.java
    public Node getNode() {

    /**
     * Returns the node contained in this <code>DOMStructure</code>.
     *
     * @return the node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMStructure.java
    public DOMStructure(Node node) {

    /**
     * Creates a <code>DOMStructure</code> containing the specified node.
     *
     * @param node the node
     * @throws NullPointerException if <code>node</code> is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMStructure.java
public class DOMStructure implements XMLStructure {

/**
 * A DOM-specific {@link XMLStructure}. The purpose of this class is to
 * allow a DOM node to be used to represent extensible content (any elements
 * or mixed content) in XML Signature structures.
 *
 * <p>If a sequence of nodes is needed, the node contained in the
 * <code>DOMStructure</code> is the first node of the sequence and successive
 * nodes can be accessed by invoking {@link Node#getNextSibling}.
 *
 * <p>If the owner document of the <code>DOMStructure</code> is different than
 * the target document of an <code>XMLSignature</code>, the
 * {@link XMLSignature#sign(XMLSignContext)} method imports the node into the
 * target document before generating the signature.
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 */
