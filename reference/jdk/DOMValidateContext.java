_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/dom/DOMValidateContext.java
    public Node getNode() {

    /**
     * Returns the node.
     *
     * @return the node (never <code>null</code>)
     * @see #setNode(Node)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/dom/DOMValidateContext.java
    public void setNode(Node node) {

    /**
     * Sets the node.
     *
     * @param node the node
     * @throws NullPointerException if <code>node</code> is <code>null</code>
     * @see #getNode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/dom/DOMValidateContext.java
    public DOMValidateContext(Key validatingKey, Node node) {

    /**
     * Creates a <code>DOMValidateContext</code> containing the specified key
     * and node. The validating key will be stored in a
     * {@link KeySelector#singletonKeySelector singleton KeySelector} that
     * is returned when the {@link #getKeySelector getKeySelector}
     * method is called.
     *
     * @param validatingKey the validating key
     * @param node the node
     * @throws NullPointerException if <code>validatingKey</code> or
     *    <code>node</code> is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/dom/DOMValidateContext.java
    public DOMValidateContext(KeySelector ks, Node node) {

    /**
     * Creates a <code>DOMValidateContext</code> containing the specified key
     * selector and node.
     *
     * @param ks a key selector for finding a validation key
     * @param node the node
     * @throws NullPointerException if <code>ks</code> or <code>node</code> is
     *    <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/dom/DOMValidateContext.java
public class DOMValidateContext extends DOMCryptoContext

/**
 * A DOM-specific {@link XMLValidateContext}. This class contains additional
 * methods to specify the location in a DOM tree where an {@link XMLSignature}
 * is to be unmarshalled and validated from.
 *
 * <p>Note that the behavior of an unmarshalled <code>XMLSignature</code>
 * is undefined if the contents of the underlying DOM tree are modified by the
 * caller after the <code>XMLSignature</code> is created.
 *
 * <p>Also, note that <code>DOMValidateContext</code> instances can contain
 * information and state specific to the XML signature structure it is
 * used with. The results are unpredictable if a
 * <code>DOMValidateContext</code> is used with different signature structures
 * (for example, you should not use the same <code>DOMValidateContext</code>
 * instance to validate two different {@link XMLSignature} objects).
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see XMLSignatureFactory#unmarshalXMLSignature(XMLValidateContext)
 */
