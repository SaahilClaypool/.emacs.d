_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
        public boolean handlesNullPrefixes() {

        /**
         * @see PrefixResolver#handlesNullPrefixes()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
  public String getBaseIdentifier()

  /**
   * Return the base identifier.
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
  public String getNamespaceForPrefix(String prefix,
                                      org.w3c.dom.Node namespaceContext)

  /**
   * Given a namespace, get the corrisponding prefix.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
  public String getNamespaceForPrefix(String prefix)

  /**
   * Given a namespace, get the corrisponding prefix.  This assumes that
   * the PrevixResolver hold's it's own namespace context, or is a namespace
   * context itself.
   * @param prefix Prefix to resolve.
   * @return Namespace that prefix resolves to, or null if prefix
   * is not bound.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
  public PrefixResolverDefault(Node xpathExpressionContext)

  /**
   * Construct a PrefixResolverDefault object.
   * @param xpathExpressionContext The context from
   * which XPath expression prefixes will be resolved.
   * Warning: This will not work correctly if xpathExpressionContext
   * is an attribute node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
  Node m_context;

  /**
   * The context to resolve the prefix from, if the context
   * is not given.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
public class PrefixResolverDefault implements PrefixResolver

/**
 * This class implements a generic PrefixResolver that
 * can be used to perform prefix-to-namespace lookup
 * for the XPath object.
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
        public boolean handlesNullPrefixes() {

        /**
         * @see PrefixResolver#handlesNullPrefixes()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
  public String getBaseIdentifier()

  /**
   * Return the base identifier.
   *
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
  public String getNamespaceForPrefix(String prefix,
                                      org.w3c.dom.Node namespaceContext)

  /**
   * Given a namespace, get the corrisponding prefix.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
  public String getNamespaceForPrefix(String prefix)

  /**
   * Given a namespace, get the corrisponding prefix.  This assumes that
   * the PrevixResolver hold's it's own namespace context, or is a namespace
   * context itself.
   * @param prefix Prefix to resolve.
   * @return Namespace that prefix resolves to, or null if prefix
   * is not bound.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
  public PrefixResolverDefault(Node xpathExpressionContext)

  /**
   * Construct a PrefixResolverDefault object.
   * @param xpathExpressionContext The context from
   * which XPath expression prefixes will be resolved.
   * Warning: This will not work correctly if xpathExpressionContext
   * is an attribute node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
  Node m_context;

  /**
   * The context to resolve the prefix from, if the context
   * is not given.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/PrefixResolverDefault.java
public class PrefixResolverDefault implements PrefixResolver

/**
 * This class implements a generic PrefixResolver that
 * can be used to perform prefix-to-namespace lookup
 * for the XPath object.
 * @xsl.usage general
 */
