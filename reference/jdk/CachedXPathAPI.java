_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  XObject eval(
          Node contextNode, String str, PrefixResolver prefixResolver)

  /**
   *   Evaluate XPath string to an XObject.
   *   XPath namespace prefixes are resolved from the namespaceNode.
   *   The implementation of this is a little slow, since it creates
   *   a number of objects each time it is called.  This could be optimized
   *   to keep the same objects around, but then thread-safety issues would arise.
   *
   *   @param contextNode The node to start searching from.
   *   @param str A valid XPath string.
   *   @param prefixResolver Will be called if the parser encounters namespace
   *                         prefixes, to resolve the prefixes to URLs.
   *   @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null.
   *   @see com.sun.org.apache.xpath.internal.objects.XObject
   *   @see com.sun.org.apache.xpath.internal.objects.XNull
   *   @see com.sun.org.apache.xpath.internal.objects.XBoolean
   *   @see com.sun.org.apache.xpath.internal.objects.XNumber
   *   @see com.sun.org.apache.xpath.internal.objects.XString
   *   @see com.sun.org.apache.xpath.internal.objects.XRTreeFrag
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  XObject eval(Node contextNode, String str, Node namespaceNode)

  /**
   *  Evaluate XPath string to an XObject.
   *  XPath namespace prefixes are resolved from the namespaceNode.
   *  The implementation of this is a little slow, since it creates
   *  a number of objects each time it is called.  This could be optimized
   *  to keep the same objects around, but then thread-safety issues would arise.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   *  @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null.
   *  @see com.sun.org.apache.xpath.internal.objects.XObject
   *  @see com.sun.org.apache.xpath.internal.objects.XNull
   *  @see com.sun.org.apache.xpath.internal.objects.XBoolean
   *  @see com.sun.org.apache.xpath.internal.objects.XNumber
   *  @see com.sun.org.apache.xpath.internal.objects.XString
   *  @see com.sun.org.apache.xpath.internal.objects.XRTreeFrag
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  XObject eval(Node contextNode, String str)

  /**
   *  Evaluate XPath string to an XObject.  Using this method,
   *  XPath namespace prefixes will be resolved from the namespaceNode.
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null.
   *  @see com.sun.org.apache.xpath.internal.objects.XObject
   *  @see com.sun.org.apache.xpath.internal.objects.XNull
   *  @see com.sun.org.apache.xpath.internal.objects.XBoolean
   *  @see com.sun.org.apache.xpath.internal.objects.XNumber
   *  @see com.sun.org.apache.xpath.internal.objects.XString
   *  @see com.sun.org.apache.xpath.internal.objects.XRTreeFrag
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  NodeList selectNodeList(
          Node contextNode, String str, Node namespaceNode)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the namespaceNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  NodeList selectNodeList(Node contextNode, String str)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the contextNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  NodeIterator selectNodeIterator(
          Node contextNode, String str, Node namespaceNode)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the namespaceNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  NodeIterator selectNodeIterator(Node contextNode, String str)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the contextNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  Node selectSingleNode(
          Node contextNode, String str, Node namespaceNode)

  /**
   * Use an XPath string to select a single node.
   * XPath namespace prefixes are resolved from the namespaceNode.
   *
   * @param contextNode The node to start searching from.
   * @param str A valid XPath string.
   * @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   * @return The first node found that matches the XPath, or null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  Node selectSingleNode(Node contextNode, String str)

  /**
   * Use an XPath string to select a single node. XPath namespace
   * prefixes are resolved from the context node, which may not
   * be what you want (see the next method).
   *
   * @param contextNode The node to start searching from.
   * @param str A valid XPath string.
   * @return The first node found that matches the XPath, or null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public XPathContext getXPathContext()

  /** Returns the XPathSupport object used in this CachedXPathAPI
   *
   * %REVIEW% I'm somewhat concerned about the loss of encapsulation
   * this causes, but the xml-security folks say they need it.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public CachedXPathAPI(CachedXPathAPI priorXPathAPI)

  /**
   * <p>This constructor shares its {@link XPathContext} with a pre-existing
   * {@link CachedXPathAPI}.  That allows sharing document models
   * ({@link com.sun.org.apache.xml.internal.dtm.DTM}) and previously established location
   * state.</p>
   * <p>Note that the original {@link CachedXPathAPI} and the new one should
   * not be operated upon concurrently; we do not support multithreaded access
   * to a single {@link com.sun.org.apache.xml.internal.dtm.DTM} at this time.  Similarly,
   * any particular instance of {@link CachedXPathAPI} must not be operated
   * upon by multiple threads without synchronization.</p>
   * <p>%REVIEW% Should this instead do a clone-and-reset on the XPathSupport object?</p>
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public CachedXPathAPI()

  /**
   * <p>Default constructor. Establishes its own {@link XPathContext}, and hence
   * its own {@link com.sun.org.apache.xml.internal.dtm.DTMManager}.
   * Good choice for simple uses.</p>
   * <p>Note that any particular instance of {@link CachedXPathAPI} must not be
   * operated upon by multiple threads without synchronization; we do
   * not currently support multithreaded access to a single
   * {@link com.sun.org.apache.xml.internal.dtm.DTM}.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  protected XPathContext xpathSupport;

  /** XPathContext, and thus the document model system (DTMs), persists through multiple
      calls to this object. This is set in the constructor.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
public class CachedXPathAPI

/**
 * The methods in this class are convenience methods into the
 * low-level XPath API.
 *
 * These functions tend to be a little slow, since a number of objects must be
 * created for each evaluation.  A faster way is to precompile the
 * XPaths using the low-level API, and then just use the XPaths
 * over and over.
 *
 * This is an alternative for the old XPathAPI class, which provided
 * static methods for the purpose but had the drawback of
 * instantiating a new XPathContext (and thus building a new DTMManager,
 * and new DTMs) each time it was called. XPathAPIObject instead retains
 * its context as long as the object persists, reusing the DTMs. This
 * does have a downside: if you've changed your source document, you should
 * obtain a new XPathAPIObject to continue searching it, since trying to use
 * the old DTMs will probably yield bad results or malfunction outright... and
 * the cached DTMs may consume memory until this object and its context are
 * returned to the heap. Essentially, it's the caller's responsibility to
 * decide when to discard the cache.
 *
 * @see <a href="http://www.w3.org/TR/xpath">XPath Specification</a>
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  XObject eval(
          Node contextNode, String str, PrefixResolver prefixResolver)

  /**
   *   Evaluate XPath string to an XObject.
   *   XPath namespace prefixes are resolved from the namespaceNode.
   *   The implementation of this is a little slow, since it creates
   *   a number of objects each time it is called.  This could be optimized
   *   to keep the same objects around, but then thread-safety issues would arise.
   *
   *   @param contextNode The node to start searching from.
   *   @param str A valid XPath string.
   *   @param prefixResolver Will be called if the parser encounters namespace
   *                         prefixes, to resolve the prefixes to URLs.
   *   @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null.
   *   @see com.sun.org.apache.xpath.internal.objects.XObject
   *   @see com.sun.org.apache.xpath.internal.objects.XNull
   *   @see com.sun.org.apache.xpath.internal.objects.XBoolean
   *   @see com.sun.org.apache.xpath.internal.objects.XNumber
   *   @see com.sun.org.apache.xpath.internal.objects.XString
   *   @see com.sun.org.apache.xpath.internal.objects.XRTreeFrag
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  XObject eval(Node contextNode, String str, Node namespaceNode)

  /**
   *  Evaluate XPath string to an XObject.
   *  XPath namespace prefixes are resolved from the namespaceNode.
   *  The implementation of this is a little slow, since it creates
   *  a number of objects each time it is called.  This could be optimized
   *  to keep the same objects around, but then thread-safety issues would arise.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   *  @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null.
   *  @see com.sun.org.apache.xpath.internal.objects.XObject
   *  @see com.sun.org.apache.xpath.internal.objects.XNull
   *  @see com.sun.org.apache.xpath.internal.objects.XBoolean
   *  @see com.sun.org.apache.xpath.internal.objects.XNumber
   *  @see com.sun.org.apache.xpath.internal.objects.XString
   *  @see com.sun.org.apache.xpath.internal.objects.XRTreeFrag
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  XObject eval(Node contextNode, String str)

  /**
   *  Evaluate XPath string to an XObject.  Using this method,
   *  XPath namespace prefixes will be resolved from the namespaceNode.
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null.
   *  @see com.sun.org.apache.xpath.internal.objects.XObject
   *  @see com.sun.org.apache.xpath.internal.objects.XNull
   *  @see com.sun.org.apache.xpath.internal.objects.XBoolean
   *  @see com.sun.org.apache.xpath.internal.objects.XNumber
   *  @see com.sun.org.apache.xpath.internal.objects.XString
   *  @see com.sun.org.apache.xpath.internal.objects.XRTreeFrag
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  NodeList selectNodeList(
          Node contextNode, String str, Node namespaceNode)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the namespaceNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  NodeList selectNodeList(Node contextNode, String str)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the contextNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  NodeIterator selectNodeIterator(
          Node contextNode, String str, Node namespaceNode)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the namespaceNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  NodeIterator selectNodeIterator(Node contextNode, String str)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the contextNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  Node selectSingleNode(
          Node contextNode, String str, Node namespaceNode)

  /**
   * Use an XPath string to select a single node.
   * XPath namespace prefixes are resolved from the namespaceNode.
   *
   * @param contextNode The node to start searching from.
   * @param str A valid XPath string.
   * @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   * @return The first node found that matches the XPath, or null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public  Node selectSingleNode(Node contextNode, String str)

  /**
   * Use an XPath string to select a single node. XPath namespace
   * prefixes are resolved from the context node, which may not
   * be what you want (see the next method).
   *
   * @param contextNode The node to start searching from.
   * @param str A valid XPath string.
   * @return The first node found that matches the XPath, or null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public XPathContext getXPathContext()

  /** Returns the XPathSupport object used in this CachedXPathAPI
   *
   * %REVIEW% I'm somewhat concerned about the loss of encapsulation
   * this causes, but the xml-security folks say they need it.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public CachedXPathAPI(CachedXPathAPI priorXPathAPI)

  /**
   * <p>This constructor shares its {@link XPathContext} with a pre-existing
   * {@link CachedXPathAPI}.  That allows sharing document models
   * ({@link com.sun.org.apache.xml.internal.dtm.DTM}) and previously established location
   * state.</p>
   * <p>Note that the original {@link CachedXPathAPI} and the new one should
   * not be operated upon concurrently; we do not support multithreaded access
   * to a single {@link com.sun.org.apache.xml.internal.dtm.DTM} at this time.  Similarly,
   * any particular instance of {@link CachedXPathAPI} must not be operated
   * upon by multiple threads without synchronization.</p>
   * <p>%REVIEW% Should this instead do a clone-and-reset on the XPathSupport object?</p>
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  public CachedXPathAPI()

  /**
   * <p>Default constructor. Establishes its own {@link XPathContext}, and hence
   * its own {@link com.sun.org.apache.xml.internal.dtm.DTMManager}.
   * Good choice for simple uses.</p>
   * <p>Note that any particular instance of {@link CachedXPathAPI} must not be
   * operated upon by multiple threads without synchronization; we do
   * not currently support multithreaded access to a single
   * {@link com.sun.org.apache.xml.internal.dtm.DTM}.</p>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
  protected XPathContext xpathSupport;

  /** XPathContext, and thus the document model system (DTMs), persists through multiple
      calls to this object. This is set in the constructor.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/CachedXPathAPI.java
public class CachedXPathAPI

/**
 * The methods in this class are convenience methods into the
 * low-level XPath API.
 *
 * These functions tend to be a little slow, since a number of objects must be
 * created for each evaluation.  A faster way is to precompile the
 * XPaths using the low-level API, and then just use the XPaths
 * over and over.
 *
 * This is an alternative for the old XPathAPI class, which provided
 * static methods for the purpose but had the drawback of
 * instantiating a new XPathContext (and thus building a new DTMManager,
 * and new DTMs) each time it was called. XPathAPIObject instead retains
 * its context as long as the object persists, reusing the DTMs. This
 * does have a downside: if you've changed your source document, you should
 * obtain a new XPathAPIObject to continue searching it, since trying to use
 * the old DTMs will probably yield bad results or malfunction outright... and
 * the cached DTMs may consume memory until this object and its context are
 * returned to the heap. Essentially, it's the caller's responsibility to
 * decide when to discard the cache.
 *
 * @see <a href="http://www.w3.org/TR/xpath">XPath Specification</a>
 * */
