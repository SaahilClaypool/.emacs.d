_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/JAXPPrefixResolver.java
    public String getNamespaceForPrefix(String prefix,
                                      org.w3c.dom.Node namespaceContext) {

    /**
     * Given a prefix and a Context Node, get the corresponding namespace.
     * Warning: This will not work correctly if namespaceContext
     * is an attribute node.
     * @param prefix Prefix to resolve.
     * @param namespaceContext Node from which to start searching for a
     * xmlns attribute that binds a prefix to a namespace.
     * @return Namespace that prefix resolves to, or null if prefix
     * is not bound.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/JAXPPrefixResolver.java
    public static final String S_XMLNAMESPACEURI =

    /**
     * The URI for the XML namespace.
     * (Duplicate of that found in com.sun.org.apache.xpath.internal.XPathContext).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/JAXPPrefixResolver.java
    public boolean handlesNullPrefixes() {

    /**
     * @see PrefixResolver#handlesNullPrefixes()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/JAXPPrefixResolver.java
    public String getBaseIdentifier() {

    /**
     * Return the base identifier.
     *
     * @return null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/JAXPPrefixResolver.java
public class JAXPPrefixResolver implements PrefixResolver

/**
 * <meta name="usage" content="general"/>
 * This class implements a Default PrefixResolver which
 * can be used to perform prefix-to-namespace lookup
 * for the XPath object.
 * This class delegates the resolution to the passed NamespaceContext
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/JAXPPrefixResolver.java
    public String getNamespaceForPrefix(String prefix,
                                      org.w3c.dom.Node namespaceContext) {

    /**
     * Given a prefix and a Context Node, get the corresponding namespace.
     * Warning: This will not work correctly if namespaceContext
     * is an attribute node.
     * @param prefix Prefix to resolve.
     * @param namespaceContext Node from which to start searching for a
     * xmlns attribute that binds a prefix to a namespace.
     * @return Namespace that prefix resolves to, or null if prefix
     * is not bound.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/JAXPPrefixResolver.java
    public static final String S_XMLNAMESPACEURI =

    /**
     * The URI for the XML namespace.
     * (Duplicate of that found in com.sun.org.apache.xpath.internal.XPathContext).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/JAXPPrefixResolver.java
    public boolean handlesNullPrefixes() {

    /**
     * @see PrefixResolver#handlesNullPrefixes()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/JAXPPrefixResolver.java
    public String getBaseIdentifier() {

    /**
     * Return the base identifier.
     *
     * @return null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/JAXPPrefixResolver.java
public class JAXPPrefixResolver implements PrefixResolver

/**
 * <meta name="usage" content="general"/>
 * This class implements a Default PrefixResolver which
 * can be used to perform prefix-to-namespace lookup
 * for the XPath object.
 * This class delegates the resolution to the passed NamespaceContext
 */
