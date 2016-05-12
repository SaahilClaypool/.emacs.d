_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathFilter2ParameterSpec.java
    @SuppressWarnings("rawtypes")

    /**
     * Returns a list of one or more {@link XPathType} objects.
     * <p>
     * This implementation returns an {@link Collections#unmodifiableList
     * unmodifiable list}.
     *
     * @return a <code>List</code> of <code>XPathType</code> objects
     *    (never <code>null</code> or empty)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathFilter2ParameterSpec.java
    @SuppressWarnings("rawtypes")

    /**
     * Creates an <code>XPathFilter2ParameterSpec</code>.
     *
     * @param xPathList a list of one or more {@link XPathType} objects. The
     *    list is defensively copied to protect against subsequent modification.
     * @throws ClassCastException if <code>xPathList</code> contains any
     *    entries that are not of type {@link XPathType}
     * @throws IllegalArgumentException if <code>xPathList</code> is empty
     * @throws NullPointerException if <code>xPathList</code> is
     *    <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/spec/XPathFilter2ParameterSpec.java
public final class XPathFilter2ParameterSpec implements TransformParameterSpec {

/**
 * Parameters for the W3C Recommendation
 * <a href="http://www.w3.org/TR/xmldsig-filter2/">
 * XPath Filter 2.0 Transform Algorithm</a>.
 * The parameters include a list of one or more {@link XPathType} objects.
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see Transform
 * @see XPathFilterParameterSpec
 */
