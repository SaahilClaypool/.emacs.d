_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMCryptoContext.java
    public Object put(Object key, Object value) {

    /**
     * This implementation uses an internal {@link HashMap} to map the key
     * to the specified object.
     *
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMCryptoContext.java
    public Object get(Object key) {

    /**
     * This implementation uses an internal {@link HashMap} to get the object
     * that the specified key maps to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMCryptoContext.java
    @SuppressWarnings("rawtypes")

    /**
     * Returns a read-only iterator over the set of Id/Element mappings of
     * this <code>DOMCryptoContext</code>. Attempts to modify the set via the
     * {@link Iterator#remove} method throw an
     * <code>UnsupportedOperationException</code>. The mappings are returned
     * in no particular order. Each element in the iteration is represented as a
     * {@link java.util.Map.Entry}. If the <code>DOMCryptoContext</code> is
     * modified while an iteration is in progress, the results of the
     * iteration are undefined.
     *
     * @return a read-only iterator over the set of mappings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMCryptoContext.java
    public void setIdAttributeNS(Element element, String namespaceURI,
        String localName) {

    /**
     * Registers the element's attribute specified by the namespace URI and
     * local name to be of type ID. The attribute must have a non-empty value.
     *
     * <p>This implementation uses an internal {@link HashMap} to map the
     * attribute's value to the specified element.
     *
     * @param element the element
     * @param namespaceURI the namespace URI of the attribute (specify
     *    <code>null</code> if not applicable)
     * @param localName the local name of the attribute
     * @throws IllegalArgumentException if <code>localName</code> is not an
     *    attribute of the specified element or it does not contain a specific
     *    value
     * @throws NullPointerException if <code>element</code> or
     *    <code>localName</code> is <code>null</code>
     * @see #getElementById
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMCryptoContext.java
    public Element getElementById(String idValue) {

    /**
     * Returns the <code>Element</code> with the specified ID attribute value.
     *
     * <p>This implementation uses an internal {@link HashMap} to get the
     * element that the specified attribute value maps to.
     *
     * @param idValue the value of the ID
     * @return the <code>Element</code> with the specified ID attribute value,
     *    or <code>null</code> if none.
     * @throws NullPointerException if <code>idValue</code> is <code>null</code>
     * @see #setIdAttributeNS
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMCryptoContext.java
    public Object setProperty(String name, Object value) {

    /**
     * This implementation uses an internal {@link HashMap} to map the name
     * to the specified object.
     *
     * @throws NullPointerException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMCryptoContext.java
    public Object getProperty(String name) {

    /**
     * This implementation uses an internal {@link HashMap} to get the object
     * that the specified name maps to.
     *
     * @throws NullPointerException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMCryptoContext.java
    public void setBaseURI(String baseURI) {

    /**
     * @throws IllegalArgumentException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMCryptoContext.java
    public String putNamespacePrefix(String namespaceURI, String prefix) {

    /**
     * This implementation uses an internal {@link HashMap} to map the URI
     * to the specified prefix.
     *
     * @throws NullPointerException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMCryptoContext.java
    public String getNamespacePrefix(String namespaceURI,
        String defaultPrefix) {

    /**
     * This implementation uses an internal {@link HashMap} to get the prefix
     * that the specified URI maps to. It returns the <code>defaultPrefix</code>
     * if it maps to <code>null</code>.
     *
     * @throws NullPointerException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMCryptoContext.java
    protected DOMCryptoContext() {}

    /**
     * Default constructor. (For invocation by subclass constructors).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dom/DOMCryptoContext.java
public class DOMCryptoContext implements XMLCryptoContext {

/**
 * This class provides a DOM-specific implementation of the
 * {@link XMLCryptoContext} interface. It also includes additional
 * methods that are specific to a DOM-based implementation for registering
 * and retrieving elements that contain attributes of type ID.
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 */
