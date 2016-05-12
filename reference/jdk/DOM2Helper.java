_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/DOM2Helper.java
  //private boolean m_useDOM2getNamespaceURI = false;

  /** Field m_useDOM2getNamespaceURI is a compile-time flag which
   *  gates some of the parser options used to build a DOM -- but
   * that code is commented out at this time and nobody else
   * references it, so I've commented this out as well. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/DOM2Helper.java
  public String getNamespaceOfNode(Node n)

  /**
   * Returns the Namespace Name (Namespace URI) for the given node.
   * In a Level 2 DOM, you can ask the node itself. Note, however, that
   * doing so conflicts with our decision in getLocalNameOfNode not
   * to trust the that the DOM was indeed created using the Level 2
   * methods. If Level 1 methods were used, these two functions will
   * disagree with each other.
   * <p>
   * TODO: Reconcile with getLocalNameOfNode.
   *
   * @param n Node to be examined
   *
   * @return String containing the Namespace URI bound to this DOM node
   * at the time the Node was created.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/DOM2Helper.java
  private String getLocalNameOfNodeFallback(Node n)

  /**
   * Returns the local name of the given node. If the node's name begins
   * with a namespace prefix, this is the part after the colon; otherwise
   * it's the full node name.
   *
   * This method is copied from com.sun.org.apache.xml.internal.utils.DOMHelper
   *
   * @param n the node to be examined.
   *
   * @return String containing the Local Name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/DOM2Helper.java
  public String getLocalNameOfNode(Node n)

  /**
   * Returns the local name of the given node, as defined by the
   * XML Namespaces specification. This is prepared to handle documents
   * built using DOM Level 1 methods by falling back upon explicitly
   * parsing the node name.
   *
   * @param n Node to be examined
   *
   * @return String containing the local name, or null if the node
   * was not assigned a Namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/DOM2Helper.java
  public DOM2Helper(){}

  /**
   * Construct an instance.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/DOM2Helper.java
public final class DOM2Helper

/**
 * This class provides a DOM level 2 "helper", which provides services currently
 * not provided be the DOM standard.
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 *
 * The differences from the original class are:
 * it doesn't extend DOMHelper, not depricated,
 * dropped method isNodeAfter(Node node1, Node node2)
 * dropped method parse(InputSource)
 * dropped method supportSAX()
 * dropped method setDocument(doc)
 * dropped method checkNode(Node)
 * dropped method getDocument()
 * dropped method getElementByID(String id, Document doc)
 * dropped method getParentOfNode(Node node)
 * dropped field Document m_doc;
 * made class non-public
 *
 * This class is not a public API, it is only public because it is
 * used in com.sun.org.apache.xml.internal.serializer.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  //private boolean m_useDOM2getNamespaceURI = false;

  /** Field m_useDOM2getNamespaceURI is a compile-time flag which
   *  gates some of the parser options used to build a DOM -- but
   * that code is commented out at this time and nobody else
   * references it, so I've commented this out as well. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public String getNamespaceOfNode(Node n)

  /**
   * Returns the Namespace Name (Namespace URI) for the given node.
   * In a Level 2 DOM, you can ask the node itself. Note, however, that
   * doing so conflicts with our decision in getLocalNameOfNode not
   * to trust the that the DOM was indeed created using the Level 2
   * methods. If Level 1 methods were used, these two functions will
   * disagree with each other.
   * <p>
   * TODO: Reconcile with getLocalNameOfNode.
   *
   * @param n Node to be examined
   *
   * @return String containing the Namespace URI bound to this DOM node
   * at the time the Node was created.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public String getLocalNameOfNode(Node n)

  /**
   * Returns the local name of the given node, as defined by the
   * XML Namespaces specification. This is prepared to handle documents
   * built using DOM Level 1 methods by falling back upon explicitly
   * parsing the node name.
   *
   * @param n Node to be examined
   *
   * @return String containing the local name, or null if the node
   * was not assigned a Namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public static Node getParentOfNode(Node node)

  /**
   * Get the XPath-model parent of a node.  This version takes advantage
   * of the DOM Level 2 Attr.ownerElement() method; the base version we
   * would otherwise inherit is prepared to fall back on exhaustively
   * walking the document to find an Attr's parent.
   *
   * @param node Node to be examined
   *
   * @return the DOM parent of the input node, if there is one, or the
   * ownerElement if the input node is an Attr, or null if the node is
   * a Document, a DocumentFragment, or an orphan.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public static boolean isNodeAfter(Node node1, Node node2)

  /**
   * Figure out whether node2 should be considered as being later
   * in the document than node1, in Document Order as defined
   * by the XPath model. This may not agree with the ordering defined
   * by other XML applications.
   * <p>
   * There are some cases where ordering isn't defined, and neither are
   * the results of this function -- though we'll generally return true.
   * <p>
   * TODO: Make sure this does the right thing with attribute nodes!!!
   *
   * @param node1 DOM Node to perform position comparison on.
   * @param node2 DOM Node to perform position comparison on .
   *
   * @return false if node2 comes before node1, otherwise return true.
   * You can think of this as
   * <code>(node1.documentOrderPosition &lt;= node2.documentOrderPosition)</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public Element getElementByID(String id, Document doc)

  /**
   * Given an XML ID, return the element. This requires assistance from the
   * DOM and parser, and is meaningful only in the context of a DTD
   * or schema which declares attributes as being of type ID. This
   * information may or may not be available in all parsers, may or
   * may not be available for specific documents, and may or may not
   * be available when validation is not turned on.
   *
   * @param id The ID to search for, as a String.
   * @param doc The document to search within, as a DOM Document node.
   * @return DOM Element node with an attribute of type ID whose value
   * uniquely matches the requested id string, or null if there isn't
   * such an element or if the DOM can't answer the question for other
   * reasons.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public void parse(InputSource source) throws TransformerException

  /**
   * Parse an XML document.
   *
   * <p>Right now the Xerces DOMParser class is used.  This needs
   * fixing, either via jaxp, or via some other, standard method.</p>
   *
   * <p>The application can use this method to instruct the SAX parser
   * to begin parsing an XML document from any valid input
   * source (a character stream, a byte stream, or a URI).</p>
   *
   * <p>Applications may not invoke this method while a parse is in
   * progress (they should create a new Parser instead for each
   * additional XML document).  Once a parse is complete, an
   * application may reuse the same Parser object, possibly with a
   * different input source.</p>
   *
   * @param source The input source for the top-level of the
   *        XML document.
   *
   * @throws TransformerException if any checked exception is thrown.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public Document getDocument()

  /**
   * Query which document this helper is currently operating on.
   *
   * @return The DOM Document node for this document.
   * @see #setDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public void setDocument(Document doc)

  /**
   * Specify which document this helper is currently operating on.
   *
   * @param doc The DOM Document node for this document.
   * @see #getDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  private Document m_doc;

  /** Field m_doc: Document Node for the document this helper is currently
   * accessing or building
   * @see #setDocument
   * @see #getDocument
   *  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public boolean supportsSAX()

  /**
   * Returns true if the DOM implementation handled by this helper
   * supports the SAX ContentHandler interface.
   *
   * @return true (since Xerces does).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public void checkNode(Node node) throws TransformerException

  /**
   * Check node to see if it was created by a DOM implementation
   * that this helper is intended to support. This is currently
   * disabled, and assumes all nodes are acceptable rather than checking
   * that they implement com.sun.org.apache.xerces.internal.dom.NodeImpl.
   *
   * @param node The node to be tested.
   *
   * @throws TransformerException if the node is not one which this
   * DOM2Helper can support. If we return without throwing the exception,
   * the node is compatable.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public DOM2Helper(){}

  /**
   * Construct an instance.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
public class DOM2Helper extends DOMHelper

/**
 * @deprecated Since the introduction of the DTM, this class will be removed.
 * This class provides a DOM level 2 "helper", which provides services currently
 * not provided be the DOM standard.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/DOM2Helper.java
  //private boolean m_useDOM2getNamespaceURI = false;

  /** Field m_useDOM2getNamespaceURI is a compile-time flag which
   *  gates some of the parser options used to build a DOM -- but
   * that code is commented out at this time and nobody else
   * references it, so I've commented this out as well. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/DOM2Helper.java
  public String getNamespaceOfNode(Node n)

  /**
   * Returns the Namespace Name (Namespace URI) for the given node.
   * In a Level 2 DOM, you can ask the node itself. Note, however, that
   * doing so conflicts with our decision in getLocalNameOfNode not
   * to trust the that the DOM was indeed created using the Level 2
   * methods. If Level 1 methods were used, these two functions will
   * disagree with each other.
   * <p>
   * TODO: Reconcile with getLocalNameOfNode.
   *
   * @param n Node to be examined
   *
   * @return String containing the Namespace URI bound to this DOM node
   * at the time the Node was created.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/DOM2Helper.java
  private String getLocalNameOfNodeFallback(Node n)

  /**
   * Returns the local name of the given node. If the node's name begins
   * with a namespace prefix, this is the part after the colon; otherwise
   * it's the full node name.
   *
   * This method is copied from com.sun.org.apache.xml.internal.utils.DOMHelper
   *
   * @param n the node to be examined.
   *
   * @return String containing the Local Name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/DOM2Helper.java
  public String getLocalNameOfNode(Node n)

  /**
   * Returns the local name of the given node, as defined by the
   * XML Namespaces specification. This is prepared to handle documents
   * built using DOM Level 1 methods by falling back upon explicitly
   * parsing the node name.
   *
   * @param n Node to be examined
   *
   * @return String containing the local name, or null if the node
   * was not assigned a Namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/DOM2Helper.java
  public DOM2Helper(){}

  /**
   * Construct an instance.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/DOM2Helper.java
public final class DOM2Helper

/**
 * This class provides a DOM level 2 "helper", which provides services currently
 * not provided be the DOM standard.
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 *
 * The differences from the original class are:
 * it doesn't extend DOMHelper, not depricated,
 * dropped method isNodeAfter(Node node1, Node node2)
 * dropped method parse(InputSource)
 * dropped method supportSAX()
 * dropped method setDocument(doc)
 * dropped method checkNode(Node)
 * dropped method getDocument()
 * dropped method getElementByID(String id, Document doc)
 * dropped method getParentOfNode(Node node)
 * dropped field Document m_doc;
 * made class non-public
 *
 * This class is not a public API, it is only public because it is
 * used in com.sun.org.apache.xml.internal.serializer.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  //private boolean m_useDOM2getNamespaceURI = false;

  /** Field m_useDOM2getNamespaceURI is a compile-time flag which
   *  gates some of the parser options used to build a DOM -- but
   * that code is commented out at this time and nobody else
   * references it, so I've commented this out as well. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public String getNamespaceOfNode(Node n)

  /**
   * Returns the Namespace Name (Namespace URI) for the given node.
   * In a Level 2 DOM, you can ask the node itself. Note, however, that
   * doing so conflicts with our decision in getLocalNameOfNode not
   * to trust the that the DOM was indeed created using the Level 2
   * methods. If Level 1 methods were used, these two functions will
   * disagree with each other.
   * <p>
   * TODO: Reconcile with getLocalNameOfNode.
   *
   * @param n Node to be examined
   *
   * @return String containing the Namespace URI bound to this DOM node
   * at the time the Node was created.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public String getLocalNameOfNode(Node n)

  /**
   * Returns the local name of the given node, as defined by the
   * XML Namespaces specification. This is prepared to handle documents
   * built using DOM Level 1 methods by falling back upon explicitly
   * parsing the node name.
   *
   * @param n Node to be examined
   *
   * @return String containing the local name, or null if the node
   * was not assigned a Namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public static Node getParentOfNode(Node node)

  /**
   * Get the XPath-model parent of a node.  This version takes advantage
   * of the DOM Level 2 Attr.ownerElement() method; the base version we
   * would otherwise inherit is prepared to fall back on exhaustively
   * walking the document to find an Attr's parent.
   *
   * @param node Node to be examined
   *
   * @return the DOM parent of the input node, if there is one, or the
   * ownerElement if the input node is an Attr, or null if the node is
   * a Document, a DocumentFragment, or an orphan.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public static boolean isNodeAfter(Node node1, Node node2)

  /**
   * Figure out whether node2 should be considered as being later
   * in the document than node1, in Document Order as defined
   * by the XPath model. This may not agree with the ordering defined
   * by other XML applications.
   * <p>
   * There are some cases where ordering isn't defined, and neither are
   * the results of this function -- though we'll generally return true.
   * <p>
   * TODO: Make sure this does the right thing with attribute nodes!!!
   *
   * @param node1 DOM Node to perform position comparison on.
   * @param node2 DOM Node to perform position comparison on .
   *
   * @return false if node2 comes before node1, otherwise return true.
   * You can think of this as
   * <code>(node1.documentOrderPosition &lt;= node2.documentOrderPosition)</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public Element getElementByID(String id, Document doc)

  /**
   * Given an XML ID, return the element. This requires assistance from the
   * DOM and parser, and is meaningful only in the context of a DTD
   * or schema which declares attributes as being of type ID. This
   * information may or may not be available in all parsers, may or
   * may not be available for specific documents, and may or may not
   * be available when validation is not turned on.
   *
   * @param id The ID to search for, as a String.
   * @param doc The document to search within, as a DOM Document node.
   * @return DOM Element node with an attribute of type ID whose value
   * uniquely matches the requested id string, or null if there isn't
   * such an element or if the DOM can't answer the question for other
   * reasons.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public void parse(InputSource source) throws TransformerException

  /**
   * Parse an XML document.
   *
   * <p>Right now the Xerces DOMParser class is used.  This needs
   * fixing, either via jaxp, or via some other, standard method.</p>
   *
   * <p>The application can use this method to instruct the SAX parser
   * to begin parsing an XML document from any valid input
   * source (a character stream, a byte stream, or a URI).</p>
   *
   * <p>Applications may not invoke this method while a parse is in
   * progress (they should create a new Parser instead for each
   * additional XML document).  Once a parse is complete, an
   * application may reuse the same Parser object, possibly with a
   * different input source.</p>
   *
   * @param source The input source for the top-level of the
   *        XML document.
   *
   * @throws TransformerException if any checked exception is thrown.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public Document getDocument()

  /**
   * Query which document this helper is currently operating on.
   *
   * @return The DOM Document node for this document.
   * @see #setDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public void setDocument(Document doc)

  /**
   * Specify which document this helper is currently operating on.
   *
   * @param doc The DOM Document node for this document.
   * @see #getDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  private Document m_doc;

  /** Field m_doc: Document Node for the document this helper is currently
   * accessing or building
   * @see #setDocument
   * @see #getDocument
   *  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public boolean supportsSAX()

  /**
   * Returns true if the DOM implementation handled by this helper
   * supports the SAX ContentHandler interface.
   *
   * @return true (since Xerces does).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public void checkNode(Node node) throws TransformerException

  /**
   * Check node to see if it was created by a DOM implementation
   * that this helper is intended to support. This is currently
   * disabled, and assumes all nodes are acceptable rather than checking
   * that they implement com.sun.org.apache.xerces.internal.dom.NodeImpl.
   *
   * @param node The node to be tested.
   *
   * @throws TransformerException if the node is not one which this
   * DOM2Helper can support. If we return without throwing the exception,
   * the node is compatable.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
  public DOM2Helper(){}

  /**
   * Construct an instance.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DOM2Helper.java
public class DOM2Helper extends DOMHelper

/**
 * @deprecated Since the introduction of the DTM, this class will be removed.
 * This class provides a DOM level 2 "helper", which provides services currently
 * not provided be the DOM standard.
 */
