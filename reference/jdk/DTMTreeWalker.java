_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  protected void endNode(int node) throws org.xml.sax.SAXException

  /**
   * End processing of given node
   *
   *
   * @param node Node we just finished processing
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  protected void startNode(int node) throws org.xml.sax.SAXException

  /**
   * Start processing given node
   *
   *
   * @param node Node to process
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  private final void dispatachChars(int node)

  /**
   * Optimized dispatch of characters.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  boolean nextIsRaw = false;

  /** Flag indicating whether following text to be processed is raw text          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public void traverse(int pos, int top) throws org.xml.sax.SAXException

  /** Perform a non-recursive pre-order/post-order traversal,
   * operating as a Visitor. startNode (preorder) and endNode
   * (postorder) are invoked for each node as we traverse over them,
   * with the result that the node is written out to m_contentHandler.
   *
   * @param pos Node in the tree where to start traversal
   * @param top Node in the tree where to end traversal.
   * If top==DTM.NULL, run through end of document.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public void traverse(int pos) throws org.xml.sax.SAXException

  /** Perform a non-recursive pre-order/post-order traversal,
   * operating as a Visitor. startNode (preorder) and endNode
   * (postorder) are invoked for each node as we traverse over them,
   * with the result that the node is written out to m_contentHandler.
   *
   * @param pos Node in the tree at which to start (and end) traversal --
   * in other words, the root of the subtree to traverse over.
   *
   * @throws TransformerException */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public DTMTreeWalker(ContentHandler contentHandler, DTM dtm)

  /**
   * Constructor.
   * @param   contentHandler The implemention of the
   * contentHandler operation (toXMLString, digest, ...)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public DTMTreeWalker()

  /**
   * Constructor.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public void setcontentHandler(ContentHandler ch)

  /**
   * Set the ContentHandler used for the tree walk.
   *
   * @param ch the ContentHandler to be the result of the tree walk.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public ContentHandler getcontentHandler()

  /**
   * Get the ContentHandler used for the tree walk.
   *
   * @return the ContentHandler used for the tree walk
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public void setDTM(DTM dtm)

  /**
   * Set the DTM to be traversed.
   *
   * @param dtm The Document Table Model to be used.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  protected DTM m_dtm;

  /** DomHelper for this TreeWalker          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  private ContentHandler m_contentHandler = null;

  /** Local reference to a ContentHandler          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
public class DTMTreeWalker

/**
 * This class does a pre-order walk of the DTM tree, calling a ContentHandler
 * interface as it goes. As such, it's more like the Visitor design pattern
 * than like the DOM's TreeWalker.
 *
 * I think normally this class should not be needed, because
 * of DTM#dispatchToEvents.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  protected void endNode(int node) throws org.xml.sax.SAXException

  /**
   * End processing of given node
   *
   *
   * @param node Node we just finished processing
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  protected void startNode(int node) throws org.xml.sax.SAXException

  /**
   * Start processing given node
   *
   *
   * @param node Node to process
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  private final void dispatachChars(int node)

  /**
   * Optimized dispatch of characters.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  boolean nextIsRaw = false;

  /** Flag indicating whether following text to be processed is raw text          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public void traverse(int pos, int top) throws org.xml.sax.SAXException

  /** Perform a non-recursive pre-order/post-order traversal,
   * operating as a Visitor. startNode (preorder) and endNode
   * (postorder) are invoked for each node as we traverse over them,
   * with the result that the node is written out to m_contentHandler.
   *
   * @param pos Node in the tree where to start traversal
   * @param top Node in the tree where to end traversal.
   * If top==DTM.NULL, run through end of document.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public void traverse(int pos) throws org.xml.sax.SAXException

  /** Perform a non-recursive pre-order/post-order traversal,
   * operating as a Visitor. startNode (preorder) and endNode
   * (postorder) are invoked for each node as we traverse over them,
   * with the result that the node is written out to m_contentHandler.
   *
   * @param pos Node in the tree at which to start (and end) traversal --
   * in other words, the root of the subtree to traverse over.
   *
   * @throws TransformerException */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public DTMTreeWalker(ContentHandler contentHandler, DTM dtm)

  /**
   * Constructor.
   * @param   contentHandler The implemention of the
   * contentHandler operation (toXMLString, digest, ...)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public DTMTreeWalker()

  /**
   * Constructor.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public void setcontentHandler(ContentHandler ch)

  /**
   * Set the ContentHandler used for the tree walk.
   *
   * @param ch the ContentHandler to be the result of the tree walk.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public ContentHandler getcontentHandler()

  /**
   * Get the ContentHandler used for the tree walk.
   *
   * @return the ContentHandler used for the tree walk
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  public void setDTM(DTM dtm)

  /**
   * Set the DTM to be traversed.
   *
   * @param dtm The Document Table Model to be used.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  protected DTM m_dtm;

  /** DomHelper for this TreeWalker          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
  private ContentHandler m_contentHandler = null;

  /** Local reference to a ContentHandler          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMTreeWalker.java
public class DTMTreeWalker

/**
 * This class does a pre-order walk of the DTM tree, calling a ContentHandler
 * interface as it goes. As such, it's more like the Visitor design pattern
 * than like the DOM's TreeWalker.
 *
 * I think normally this class should not be needed, because
 * of DTM#dispatchToEvents.
 * @xsl.usage advanced
 */
