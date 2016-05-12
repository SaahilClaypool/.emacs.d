_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathType.java
    @SuppressWarnings("rawtypes")

    /**
     * Returns a map of namespace prefixes. Each key is a namespace prefix
     * <code>String</code> that maps to a corresponding namespace URI
     * <code>String</code>.
     * <p>
     * This implementation returns an {@link Collections#unmodifiableMap
     * unmodifiable map}.
     *
     * @return a <code>Map</code> of namespace prefixes to namespace URIs
     *    (may be empty, but never <code>null</code>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathType.java
    public Filter getFilter() {

    /**
     * Returns the filter operation.
     *
     * @return the filter operation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathType.java
    public String getExpression() {

    /**
     * Returns the XPath expression to be evaluated.
     *
     * @return the XPath expression to be evaluated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathType.java
    @SuppressWarnings("rawtypes")

    /**
     * Creates an <code>XPathType</code> instance with the specified XPath
     * expression, filter, and namespace map. The map is copied to protect
     * against subsequent modification.
     *
     * @param expression the XPath expression to be evaluated
     * @param filter the filter operation ({@link Filter#INTERSECT},
     *    {@link Filter#SUBTRACT}, or {@link Filter#UNION})
     * @param namespaceMap the map of namespace prefixes. Each key is a
     *    namespace prefix <code>String</code> that maps to a corresponding
     *    namespace URI <code>String</code>.
     * @throws NullPointerException if <code>expression</code>,
     *    <code>filter</code> or <code>namespaceMap</code> are
     *    <code>null</code>
     * @throws ClassCastException if any of the map's keys or entries are
     *    not of type <code>String</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathType.java
    public XPathType(String expression, Filter filter) {

    /**
     * Creates an <code>XPathType</code> instance with the specified XPath
     * expression and filter.
     *
     * @param expression the XPath expression to be evaluated
     * @param filter the filter operation ({@link Filter#INTERSECT},
     *    {@link Filter#SUBTRACT}, or {@link Filter#UNION})
     * @throws NullPointerException if <code>expression</code> or
     *    <code>filter</code> is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathType.java
        public static final Filter UNION = new Filter("union");

        /**
         * The union filter operation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathType.java
        public static final Filter SUBTRACT = new Filter("subtract");

        /**
         * The subtract filter operation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathType.java
        public static final Filter INTERSECT = new Filter("intersect");

        /**
         * The intersect filter operation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathType.java
        public String toString() {

        /**
         * Returns the string form of the operation.
         *
         * @return the string form of the operation
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathType.java
    public static class Filter {

    /**
     * Represents the filter set operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathType.java
public class XPathType {

/**
 * The XML Schema Definition of the <code>XPath</code> element as defined in the
 * <a href="http://www.w3.org/TR/xmldsig-filter2">
 * W3C Recommendation for XML-Signature XPath Filter 2.0</a>:
 * <pre><code>
 * &lt;schema xmlns="http://www.w3.org/2001/XMLSchema"
 *         xmlns:xf="http://www.w3.org/2002/06/xmldsig-filter2"
 *         targetNamespace="http://www.w3.org/2002/06/xmldsig-filter2"
 *         version="0.1" elementFormDefault="qualified"&gt;
 *
 * &lt;element name="XPath"
 *          type="xf:XPathType"/&gt;
 *
 * &lt;complexType name="XPathType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="string"&gt;
 *       &lt;attribute name="Filter"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="string"&gt;
 *             &lt;enumeration value="intersect"/&gt;
 *             &lt;enumeration value="subtract"/&gt;
 *             &lt;enumeration value="union"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </code></pre>
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see XPathFilter2ParameterSpec
 */
