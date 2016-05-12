_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  protected void endNode(Node node) throws org.xml.sax.SAXException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  protected void startNode(Node node) throws org.xml.sax.SAXException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  private final void dispatachChars(Node node)

  /**
   * Optimized dispatch of characters.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  boolean nextIsRaw = false;

  /** Flag indicating whether following text to be processed is raw text          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  public void traverse(Node pos, Node top) throws org.xml.sax.SAXException

  /**
   * Perform a pre-order traversal non-recursive style.

   * Note that TreeWalker assumes that the subtree is intended to represent
   * a complete (though not necessarily well-formed) document and, during a
   * traversal, startDocument and endDocument will always be issued to the
   * SAX listener.
   *
   * @param pos Node in the tree where to start traversal
   * @param top Node in the tree where to end traversal
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  public void traverse(Node pos) throws org.xml.sax.SAXException

  /**
   * Perform a pre-order traversal non-recursive style.
   *
   * Note that TreeWalker assumes that the subtree is intended to represent
   * a complete (though not necessarily well-formed) document and, during a
   * traversal, startDocument and endDocument will always be issued to the
   * SAX listener.
   *
   * @param pos Node in the tree where to start traversal
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  public TreeWalker(ContentHandler contentHandler, String systemId)

  /**
   * Constructor.
   * @param   contentHandler The implemention of the
   * contentHandler operation (toXMLString, digest, ...)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  public ContentHandler getContentHandler()

  /**
   * Get the ContentHandler used for the tree walk.
   *
   * @return the ContentHandler used for the tree walk
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  final private LocatorImpl m_locator = new LocatorImpl();

  /** Locator object for this TreeWalker          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  final protected DOM2Helper m_dh;

  /** DomHelper for this TreeWalker          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  final private ContentHandler m_contentHandler;

  /** Local reference to a ContentHandler          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
public final class TreeWalker

/**
 * This class does a pre-order walk of the DOM tree, calling a ContentHandler
 * interface as it goes.
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  protected void endNode(Node node) throws org.xml.sax.SAXException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  protected void startNode(Node node) throws org.xml.sax.SAXException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  private final void dispatachChars(Node node)

  /**
   * Optimized dispatch of characters.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  boolean nextIsRaw = false;

  /** Flag indicating whether following text to be processed is raw text          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public void traverse(Node pos, Node top) throws org.xml.sax.SAXException

  /**
   * Perform a pre-order traversal non-recursive style.

   * Note that TreeWalker assumes that the subtree is intended to represent
   * a complete (though not necessarily well-formed) document and, during a
   * traversal, startDocument and endDocument will always be issued to the
   * SAX listener.
   *
   * @param pos Node in the tree where to start traversal
   * @param top Node in the tree where to end traversal
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public void traverseFragment(Node pos) throws org.xml.sax.SAXException

  /**
   * Perform a pre-order traversal non-recursive style.
   *
   * In contrast to the traverse() method this method will not issue
   * startDocument() and endDocument() events to the SAX listener.
   *
   * @param pos Node in the tree where to start traversal
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public void traverse(Node pos) throws org.xml.sax.SAXException

  /**
   * Perform a pre-order traversal non-recursive style.
   *
   * Note that TreeWalker assumes that the subtree is intended to represent
   * a complete (though not necessarily well-formed) document and, during a
   * traversal, startDocument and endDocument will always be issued to the
   * SAX listener.
   *
   * @param pos Node in the tree where to start traversal
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public TreeWalker(ContentHandler contentHandler)

  /**
   * Constructor.
   * @param   contentHandler The implementation of the
   * contentHandler operation (toXMLString, digest, ...)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public TreeWalker(ContentHandler contentHandler, DOMHelper dh)

  /**
   * Constructor.
   * @param   contentHandler The implemention of the
   * contentHandler operation (toXMLString, digest, ...)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public TreeWalker(ContentHandler contentHandler, DOMHelper dh, String systemId)

        /**
   * Constructor.
   * @param   contentHandler The implementation of the
   * @param   systemId System identifier for the document.
   * contentHandler operation (toXMLString, digest, ...)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public void setContentHandler(ContentHandler ch)

  /**
   * Get the ContentHandler used for the tree walk.
   *
   * @return the ContentHandler used for the tree walk
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public ContentHandler getContentHandler()

  /**
   * Get the ContentHandler used for the tree walk.
   *
   * @return the ContentHandler used for the tree walk
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
        private LocatorImpl m_locator = new LocatorImpl();

        /** Locator object for this TreeWalker          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  protected DOMHelper m_dh;

  /** DomHelper for this TreeWalker          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  private ContentHandler m_contentHandler = null;

  /** Local reference to a ContentHandler          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
public class TreeWalker

/**
 * This class does a pre-order walk of the DOM tree, calling a ContentHandler
 * interface as it goes.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  protected void endNode(Node node) throws org.xml.sax.SAXException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  protected void startNode(Node node) throws org.xml.sax.SAXException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  private final void dispatachChars(Node node)

  /**
   * Optimized dispatch of characters.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  boolean nextIsRaw = false;

  /** Flag indicating whether following text to be processed is raw text          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  public void traverse(Node pos, Node top) throws org.xml.sax.SAXException

  /**
   * Perform a pre-order traversal non-recursive style.

   * Note that TreeWalker assumes that the subtree is intended to represent
   * a complete (though not necessarily well-formed) document and, during a
   * traversal, startDocument and endDocument will always be issued to the
   * SAX listener.
   *
   * @param pos Node in the tree where to start traversal
   * @param top Node in the tree where to end traversal
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  public void traverse(Node pos) throws org.xml.sax.SAXException

  /**
   * Perform a pre-order traversal non-recursive style.
   *
   * Note that TreeWalker assumes that the subtree is intended to represent
   * a complete (though not necessarily well-formed) document and, during a
   * traversal, startDocument and endDocument will always be issued to the
   * SAX listener.
   *
   * @param pos Node in the tree where to start traversal
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  public TreeWalker(ContentHandler contentHandler, String systemId)

  /**
   * Constructor.
   * @param   contentHandler The implemention of the
   * contentHandler operation (toXMLString, digest, ...)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  public ContentHandler getContentHandler()

  /**
   * Get the ContentHandler used for the tree walk.
   *
   * @return the ContentHandler used for the tree walk
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  final private LocatorImpl m_locator = new LocatorImpl();

  /** Locator object for this TreeWalker          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  final protected DOM2Helper m_dh;

  /** DomHelper for this TreeWalker          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
  final private ContentHandler m_contentHandler;

  /** Local reference to a ContentHandler          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/TreeWalker.java
public final class TreeWalker

/**
 * This class does a pre-order walk of the DOM tree, calling a ContentHandler
 * interface as it goes.
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  protected void endNode(Node node) throws org.xml.sax.SAXException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  protected void startNode(Node node) throws org.xml.sax.SAXException

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  private final void dispatachChars(Node node)

  /**
   * Optimized dispatch of characters.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  boolean nextIsRaw = false;

  /** Flag indicating whether following text to be processed is raw text          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public void traverse(Node pos, Node top) throws org.xml.sax.SAXException

  /**
   * Perform a pre-order traversal non-recursive style.

   * Note that TreeWalker assumes that the subtree is intended to represent
   * a complete (though not necessarily well-formed) document and, during a
   * traversal, startDocument and endDocument will always be issued to the
   * SAX listener.
   *
   * @param pos Node in the tree where to start traversal
   * @param top Node in the tree where to end traversal
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public void traverseFragment(Node pos) throws org.xml.sax.SAXException

  /**
   * Perform a pre-order traversal non-recursive style.
   *
   * In contrast to the traverse() method this method will not issue
   * startDocument() and endDocument() events to the SAX listener.
   *
   * @param pos Node in the tree where to start traversal
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public void traverse(Node pos) throws org.xml.sax.SAXException

  /**
   * Perform a pre-order traversal non-recursive style.
   *
   * Note that TreeWalker assumes that the subtree is intended to represent
   * a complete (though not necessarily well-formed) document and, during a
   * traversal, startDocument and endDocument will always be issued to the
   * SAX listener.
   *
   * @param pos Node in the tree where to start traversal
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public TreeWalker(ContentHandler contentHandler)

  /**
   * Constructor.
   * @param   contentHandler The implementation of the
   * contentHandler operation (toXMLString, digest, ...)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public TreeWalker(ContentHandler contentHandler, DOMHelper dh)

  /**
   * Constructor.
   * @param   contentHandler The implemention of the
   * contentHandler operation (toXMLString, digest, ...)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public TreeWalker(ContentHandler contentHandler, DOMHelper dh, String systemId)

        /**
   * Constructor.
   * @param   contentHandler The implementation of the
   * @param   systemId System identifier for the document.
   * contentHandler operation (toXMLString, digest, ...)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public void setContentHandler(ContentHandler ch)

  /**
   * Get the ContentHandler used for the tree walk.
   *
   * @return the ContentHandler used for the tree walk
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  public ContentHandler getContentHandler()

  /**
   * Get the ContentHandler used for the tree walk.
   *
   * @return the ContentHandler used for the tree walk
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
        private LocatorImpl m_locator = new LocatorImpl();

        /** Locator object for this TreeWalker          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  protected DOMHelper m_dh;

  /** DomHelper for this TreeWalker          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
  private ContentHandler m_contentHandler = null;

  /** Local reference to a ContentHandler          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/TreeWalker.java
public class TreeWalker

/**
 * This class does a pre-order walk of the DOM tree, calling a ContentHandler
 * interface as it goes.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/TreeWalker.java
    public Node nextNode();

    /**
     * Moves the <code>TreeWalker</code> to the next visible node in document
     * order relative to the current node, and returns the new node. If the
     * current node has no next node, or if the search for nextNode attempts
     * to step upward from the <code>TreeWalker</code>'s <code>root</code>
     * node, returns <code>null</code>, and retains the current node.
     * @return The new node, or <code>null</code> if the current node has no
     *   next node  in the <code>TreeWalker</code>'s logical view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/TreeWalker.java
    public Node previousNode();

    /**
     * Moves the <code>TreeWalker</code> to the previous visible node in
     * document order relative to the current node, and returns the new
     * node. If the current node has no previous node,  or if the search for
     * <code>previousNode</code> attempts to step upward from the
     * <code>TreeWalker</code>'s <code>root</code> node,  returns
     * <code>null</code>, and retains the current node.
     * @return The new node, or <code>null</code> if the current node has no
     *   previous node  in the <code>TreeWalker</code>'s logical view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/TreeWalker.java
    public Node nextSibling();

    /**
     * Moves the <code>TreeWalker</code> to the next sibling of the current
     * node, and returns the new node. If the current node has no visible
     * next sibling, returns <code>null</code>, and retains the current node.
     * @return The new node, or <code>null</code> if the current node has no
     *   next sibling.  in the <code>TreeWalker</code>'s logical view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/TreeWalker.java
    public Node previousSibling();

    /**
     * Moves the <code>TreeWalker</code> to the previous sibling of the
     * current node, and returns the new node. If the current node has no
     * visible previous sibling, returns <code>null</code>, and retains the
     * current node.
     * @return The new node, or <code>null</code> if the current node has no
     *   previous sibling.  in the <code>TreeWalker</code>'s logical view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/TreeWalker.java
    public Node lastChild();

    /**
     * Moves the <code>TreeWalker</code> to the last visible child of the
     * current node, and returns the new node. If the current node has no
     * visible children, returns <code>null</code>, and retains the current
     * node.
     * @return The new node, or <code>null</code> if the current node has no
     *   children  in the <code>TreeWalker</code>'s logical view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/TreeWalker.java
    public Node firstChild();

    /**
     * Moves the <code>TreeWalker</code> to the first visible child of the
     * current node, and returns the new node. If the current node has no
     * visible children, returns <code>null</code>, and retains the current
     * node.
     * @return The new node, or <code>null</code> if the current node has no
     *   visible children  in the <code>TreeWalker</code>'s logical view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/TreeWalker.java
    public Node parentNode();

    /**
     * Moves to and returns the closest visible ancestor node of the current
     * node. If the search for <code>parentNode</code> attempts to step
     * upward from the <code>TreeWalker</code>'s <code>root</code> node, or
     * if it fails to find a visible ancestor node, this method retains the
     * current position and returns <code>null</code>.
     * @return The new parent node, or <code>null</code> if the current node
     *   has no parent  in the <code>TreeWalker</code>'s logical view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/TreeWalker.java
    public Node getCurrentNode();

    /**
     * The node at which the <code>TreeWalker</code> is currently positioned.
     * <br>Alterations to the DOM tree may cause the current node to no longer
     * be accepted by the <code>TreeWalker</code>'s associated filter.
     * <code>currentNode</code> may also be explicitly set to any node,
     * whether or not it is within the subtree specified by the
     * <code>root</code> node or would be accepted by the filter and
     * <code>whatToShow</code> flags. Further traversal occurs relative to
     * <code>currentNode</code> even if it is not part of the current view,
     * by applying the filters in the requested direction; if no traversal
     * is possible, <code>currentNode</code> is not changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/TreeWalker.java
    public boolean getExpandEntityReferences();

    /**
     * The value of this flag determines whether the children of entity
     * reference nodes are visible to the <code>TreeWalker</code>. If false,
     * these children  and their descendants will be rejected. Note that
     * this rejection takes precedence over <code>whatToShow</code> and the
     * filter, if any.
     * <br> To produce a view of the document that has entity references
     * expanded and does not expose the entity reference node itself, use
     * the <code>whatToShow</code> flags to hide the entity reference node
     * and set <code>expandEntityReferences</code> to true when creating the
     * <code>TreeWalker</code>. To produce a view of the document that has
     * entity reference nodes but no entity expansion, use the
     * <code>whatToShow</code> flags to show the entity reference node and
     * set <code>expandEntityReferences</code> to false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/TreeWalker.java
    public NodeFilter getFilter();

    /**
     * The filter used to screen nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/TreeWalker.java
    public int getWhatToShow();

    /**
     * This attribute determines which node types are presented via the
     * <code>TreeWalker</code>. The available set of constants is defined in
     * the <code>NodeFilter</code> interface.  Nodes not accepted by
     * <code>whatToShow</code> will be skipped, but their children may still
     * be considered. Note that this skip takes precedence over the filter,
     * if any.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/TreeWalker.java
public interface TreeWalker {

/**
 * <code>TreeWalker</code> objects are used to navigate a document tree or
 * subtree using the view of the document defined by their
 * <code>whatToShow</code> flags and filter (if any). Any function which
 * performs navigation using a <code>TreeWalker</code> will automatically
 * support any view defined by a <code>TreeWalker</code>.
 * <p>Omitting nodes from the logical view of a subtree can result in a
 * structure that is substantially different from the same subtree in the
 * complete, unfiltered document. Nodes that are siblings in the
 * <code>TreeWalker</code> view may be children of different, widely
 * separated nodes in the original view. For instance, consider a
 * <code>NodeFilter</code> that skips all nodes except for Text nodes and
 * the root node of a document. In the logical view that results, all text
 * nodes will be siblings and appear as direct children of the root node, no
 * matter how deeply nested the structure of the original document.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113'>Document Object Model (DOM) Level 2 Traversal and Range Specification</a>.
 * @since DOM Level 2
 */
