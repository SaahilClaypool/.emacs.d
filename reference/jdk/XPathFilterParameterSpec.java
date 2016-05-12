_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathFilterParameterSpec.java
    @SuppressWarnings("rawtypes")

    /**
     * Returns a map of namespace prefixes. Each key is a namespace prefix
     * <code>String</code> that maps to a corresponding namespace URI
     * <code>String</code>.
     * <p>
     * This implementation returns an {@link Collections#unmodifiableMap
     * unmodifiable map}.
     *
     * @return a <code>Map</code> of namespace prefixes to namespace URIs (may
     *    be empty, but never <code>null</code>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathFilterParameterSpec.java
    public String getXPath() {

    /**
     * Returns the XPath expression to be evaluated.
     *
     * @return the XPath expression to be evaluated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathFilterParameterSpec.java
    @SuppressWarnings("rawtypes")

    /**
     * Creates an <code>XPathFilterParameterSpec</code> with the specified
     * XPath expression and namespace map. The map is copied to protect against
     * subsequent modification.
     *
     * @param xPath the XPath expression to be evaluated
     * @param namespaceMap the map of namespace prefixes. Each key is a
     *    namespace prefix <code>String</code> that maps to a corresponding
     *    namespace URI <code>String</code>.
     * @throws NullPointerException if <code>xPath</code> or
     *    <code>namespaceMap</code> are <code>null</code>
     * @throws ClassCastException if any of the map's keys or entries are not
     *    of type <code>String</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathFilterParameterSpec.java
    public XPathFilterParameterSpec(String xPath) {

    /**
     * Creates an <code>XPathFilterParameterSpec</code> with the specified
     * XPath expression.
     *
     * @param xPath the XPath expression to be evaluated
     * @throws NullPointerException if <code>xPath</code> is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathFilterParameterSpec.java
public final class XPathFilterParameterSpec implements TransformParameterSpec {

/**
 * Parameters for the <a href="http://www.w3.org/TR/xmldsig-core/#sec-XPath">
 * XPath Filtering Transform Algorithm</a>.
 * The parameters include the XPath expression and an optional <code>Map</code>
 * of additional namespace prefix mappings. The XML Schema Definition of
 * the XPath Filtering transform parameters is defined as:
 * <pre><code>
 * &lt;element name="XPath" type="string"/&gt;
 * </code></pre>
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see Transform
 */
