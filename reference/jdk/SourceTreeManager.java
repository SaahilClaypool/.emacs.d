_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public static XMLReader getXMLReader(Source inputSource, SourceLocator locator)

  /**
   * This method returns the SAX2 parser to use with the InputSource
   * obtained from this URI.
   * It may return null if any SAX2-conformant XML parser can be used,
   * or if getInputSource() will also return null. The parser must
   * be free for use (i.e.
   * not currently in use for another parse().
   *
   * @param inputSource The value returned from the URIResolver.
   * @return a SAX2 XMLReader to use to resolve the inputSource argument.
   * @param locator The location of the original caller, for diagnostic purposes.
   *
   * @throws TransformerException if the reader can not be created.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public int parseToNode(Source source, SourceLocator locator, XPathContext xctxt)

  /**
   * Try to create a DOM source tree from the input source.
   *
   * @param source The Source object that identifies the source node.
   * @param locator The location of the caller, for diagnostic purposes.
   *
   * @return non-null reference to node identified by the source argument.
   *
   * @throws TransformerException if the source argument can not be resolved
   *         to a source node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public int getSourceTree(Source source, SourceLocator locator, XPathContext xctxt)

  /**
   * Get the source tree from the input source.
   *
   * @param source The Source object that should identify the desired node.
   * @param locator The location of the caller, for diagnostic purposes.
   *
   * @return non-null reference to a node.
   *
   * @throws TransformerException if the Source argument can't be resolved to
   *         a node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public int getSourceTree(
          String base, String urlString, SourceLocator locator, XPathContext xctxt)

  /**
   * Get the source tree from the a base URL and a URL string.
   *
   * @param base The base URI to use if the urlString is relative.
   * @param urlString An absolute or relative URL string.
   * @param locator The location of the caller, for diagnostic purposes.
   *
   * @return should be a non-null reference to the node identified by the
   * base and urlString.
   *
   * @throws TransformerException If the URL can not resolve to a node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public int getNode(Source source)

  /**
   * Given a Source object, find the node associated with it.
   *
   * @param source The Source object to act as the key.
   *
   * @return The node that is associated with the Source, or null if not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public void putDocumentInCache(int n, Source source)

  /**
   * Put the source tree root node in the document cache.
   * TODO: This function needs to be a LOT more sophisticated.
   *
   * @param n The node to cache.
   * @param source The Source object to cache.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public void removeDocumentFromCache(int n)

  /** JJK: Support  <?xalan:doc_cache_off?> kluge in ElemForEach.
   * TODO: This function is highly dangerous. Cache management must be improved.
   *
   * @param n The node to remove.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public Source resolveURI(
          String base, String urlString, SourceLocator locator)

  /**
   * This will be called by the processor when it encounters
   * an xsl:include, xsl:import, or document() function.
   *
   * @param base The base URI that should be used.
   * @param urlString Value from an xsl:import or xsl:include's href attribute,
   * or a URI specified in the document() function.
   *
   * @return a Source that can be used to process the resource.
   *
   * @throws IOException
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public String findURIFromDoc(int owner)

  /**
   * Given a document, find the URL associated with that document.
   * @param owner Document that was previously processed by this liaison.
   *
   * @return The base URI of the owner argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public URIResolver getURIResolver()

  /**
   * Get the object that will be used to resolve URIs used in
   * document(), etc.
   * @return An object that implements the URIResolver interface,
   * or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public void setURIResolver(URIResolver resolver)

  /**
   * Set an object that will be used to resolve URIs used in
   * document(), etc.
   * @param resolver An object that implements the URIResolver interface,
   * or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  URIResolver m_uriResolver;

  /** The TrAX URI resolver used to obtain source trees. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public void reset()

  /**
   * Reset the list of SourceTree objects that this manager manages.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  private Vector m_sourceTree = new Vector();

  /** Vector of SourceTree objects that this manager manages. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
public class SourceTreeManager

/**
 * This class bottlenecks all management of source trees.  The methods
 * in this class should allow easy garbage collection of source
 * trees (not yet!), and should centralize parsing for those source trees.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public static XMLReader getXMLReader(Source inputSource, SourceLocator locator)

  /**
   * This method returns the SAX2 parser to use with the InputSource
   * obtained from this URI.
   * It may return null if any SAX2-conformant XML parser can be used,
   * or if getInputSource() will also return null. The parser must
   * be free for use (i.e.
   * not currently in use for another parse().
   *
   * @param inputSource The value returned from the URIResolver.
   * @return a SAX2 XMLReader to use to resolve the inputSource argument.
   * @param locator The location of the original caller, for diagnostic purposes.
   *
   * @throws TransformerException if the reader can not be created.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public int parseToNode(Source source, SourceLocator locator, XPathContext xctxt)

  /**
   * Try to create a DOM source tree from the input source.
   *
   * @param source The Source object that identifies the source node.
   * @param locator The location of the caller, for diagnostic purposes.
   *
   * @return non-null reference to node identified by the source argument.
   *
   * @throws TransformerException if the source argument can not be resolved
   *         to a source node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public int getSourceTree(Source source, SourceLocator locator, XPathContext xctxt)

  /**
   * Get the source tree from the input source.
   *
   * @param source The Source object that should identify the desired node.
   * @param locator The location of the caller, for diagnostic purposes.
   *
   * @return non-null reference to a node.
   *
   * @throws TransformerException if the Source argument can't be resolved to
   *         a node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public int getSourceTree(
          String base, String urlString, SourceLocator locator, XPathContext xctxt)

  /**
   * Get the source tree from the a base URL and a URL string.
   *
   * @param base The base URI to use if the urlString is relative.
   * @param urlString An absolute or relative URL string.
   * @param locator The location of the caller, for diagnostic purposes.
   *
   * @return should be a non-null reference to the node identified by the
   * base and urlString.
   *
   * @throws TransformerException If the URL can not resolve to a node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public int getNode(Source source)

  /**
   * Given a Source object, find the node associated with it.
   *
   * @param source The Source object to act as the key.
   *
   * @return The node that is associated with the Source, or null if not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public void putDocumentInCache(int n, Source source)

  /**
   * Put the source tree root node in the document cache.
   * TODO: This function needs to be a LOT more sophisticated.
   *
   * @param n The node to cache.
   * @param source The Source object to cache.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public void removeDocumentFromCache(int n)

  /** JJK: Support  <?xalan:doc_cache_off?> kluge in ElemForEach.
   * TODO: This function is highly dangerous. Cache management must be improved.
   *
   * @param n The node to remove.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public Source resolveURI(
          String base, String urlString, SourceLocator locator)

  /**
   * This will be called by the processor when it encounters
   * an xsl:include, xsl:import, or document() function.
   *
   * @param base The base URI that should be used.
   * @param urlString Value from an xsl:import or xsl:include's href attribute,
   * or a URI specified in the document() function.
   *
   * @return a Source that can be used to process the resource.
   *
   * @throws IOException
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public String findURIFromDoc(int owner)

  /**
   * Given a document, find the URL associated with that document.
   * @param owner Document that was previously processed by this liaison.
   *
   * @return The base URI of the owner argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public URIResolver getURIResolver()

  /**
   * Get the object that will be used to resolve URIs used in
   * document(), etc.
   * @return An object that implements the URIResolver interface,
   * or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public void setURIResolver(URIResolver resolver)

  /**
   * Set an object that will be used to resolve URIs used in
   * document(), etc.
   * @param resolver An object that implements the URIResolver interface,
   * or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  URIResolver m_uriResolver;

  /** The TrAX URI resolver used to obtain source trees. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  public void reset()

  /**
   * Reset the list of SourceTree objects that this manager manages.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
  private Vector m_sourceTree = new Vector();

  /** Vector of SourceTree objects that this manager manages. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/SourceTreeManager.java
public class SourceTreeManager

/**
 * This class bottlenecks all management of source trees.  The methods
 * in this class should allow easy garbage collection of source
 * trees (not yet!), and should centralize parsing for those source trees.
 */
