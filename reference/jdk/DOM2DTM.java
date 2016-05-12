_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public SourceLocator getSourceLocatorFor(int node)

  /**
   * No source information is available for DOM2DTM, so return
   * <code>null</code> here.
   *
   * @param node an <code>int</code> value
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public void setProperty(String property, Object value)

  /**
   * For the moment all the run time properties are ignored by this
   * class.
   *
   * @param property a <code>String</code> value
   * @param value an <code>Object</code> value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public void dispatchToEvents(int nodeHandle, org.xml.sax.ContentHandler ch)

  /**
   * Directly create SAX parser events from a subtree.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected static void dispatchNodeData(Node node,
                                         org.xml.sax.ContentHandler ch,
                                         int depth)

  /**
   * Retrieve the text content of a DOM subtree, appending it into a
   * user-supplied FastStringBuffer object. Note that attributes are
   * not considered part of the content of an element.
   * <p>
   * There are open questions regarding whitespace stripping.
   * Currently we make no special effort in that regard, since the standard
   * DOM doesn't yet provide DTD-based information to distinguish
   * whitespace-in-element-context from genuine #PCDATA. Note that we
   * should probably also consider xml:space if/when we address this.
   * DOM Level 3 may solve the problem for us.
   * <p>
   * %REVIEW% Note that as a DOM-level operation, it can be argued that this
   * routine _shouldn't_ perform any processing beyond what the DOM already
   * does, and that whitespace stripping and so on belong at the DTM level.
   * If you want a stripped DOM view, wrap DTM2DOM around DOM2DTM.
   *
   * @param node Node whose subtree is to be walked, gathering the
   * contents of all Text or CDATASection nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public void dispatchCharactersEvents(
          int nodeHandle, org.xml.sax.ContentHandler ch,
          boolean normalize)

  /**
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value of the given node (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value). Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  private static boolean isSpace(char ch)

  /**
   * Returns whether the specified <var>ch</var> conforms to the XML 1.0 definition
   * of whitespace.  Refer to <A href="http://www.w3.org/TR/1998/REC-xml-19980210#NT-S">
   * the definition of <CODE>S</CODE></A> for details.
   * @param   ch      Character to check as XML whitespace.
   * @return          =true if <var>ch</var> is XML whitespace; otherwise =false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public boolean needsTwoThreads()

  /** @return true iff we're building this model incrementally (eg
   * we're partnered with a IncrementalSAXSource) and thus require that the
   * transformation and the parse run simultaneously. Guidance to the
   * DTMManager.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public org.xml.sax.ext.DeclHandler getDeclHandler()

  /**
   * Return this DTM's DeclHandler.
   *
   * @return null if this model doesn't respond to SAX Decl events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public org.xml.sax.ErrorHandler getErrorHandler()

  /**
   * Return this DTM's ErrorHandler.
   *
   * @return null if this model doesn't respond to SAX error events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public org.xml.sax.DTDHandler getDTDHandler()

  /**
   * Return this DTM's DTDHandler.
   *
   * @return null if this model doesn't respond to SAX dtd events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public org.xml.sax.EntityResolver getEntityResolver()

  /**
   * Return this DTM's EntityResolver.
   *
   * @return null if this model doesn't respond to SAX entity ref events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public org.xml.sax.ext.LexicalHandler getLexicalHandler()

  /**
   * Return this DTM's lexical handler.
   *
   * %REVIEW% Should this return null if constrution already done/begun?
   *
   * @return null if this model doesn't respond to lexical SAX events,
   * "this" if the DTM object has a built-in SAX ContentHandler,
   * the IncrementalSAXSource if we're bound to one and should receive
   * the SAX stream via it for incremental build purposes...
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public org.xml.sax.ContentHandler getContentHandler()

  /** getContentHandler returns "our SAX builder" -- the thing that
   * someone else should send SAX events to in order to extend this
   * DTM model.
   *
   * @return null if this model doesn't respond to SAX events,
   * "this" if the DTM object has a built-in SAX ContentHandler,
   * the IncrmentalSAXSource if we're bound to one and should receive
   * the SAX stream via it for incremental build purposes...
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public void setIncrementalSAXSource(IncrementalSAXSource source)

  /** Bind an IncrementalSAXSource to this DTM. NOT RELEVANT for DOM2DTM, since
   * we're wrapped around an existing DOM.
   *
   * @param source The IncrementalSAXSource that we want to recieve events from
   * on demand.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public boolean isAttributeSpecified(int attributeHandle)

  /**
   *     5. [specified] A flag indicating whether this attribute was actually
   *        specified in the start-tag of its element, or was defaulted from the
   *        DTD.
   *
   * @param attributeHandle the attribute handle
   * @return <code>true</code> if the attribute was specified;
   *         <code>false</code> if it was defaulted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getUnparsedEntityURI(String name)

  /**
   * The getUnparsedEntityURI function returns the URI of the unparsed
   * entity with the specified name in the same document as the context
   * node (see [3.3 Unparsed Entities]). It returns the empty string if
   * there is no such entity.
   * <p>
   * XML processors may choose to use the System Identifier (if one
   * is provided) to resolve the entity, rather than the URI in the
   * Public Identifier. The details are dependent on the processor, and
   * we would have to support some form of plug-in resolver to handle
   * this properly. Currently, we simply return the System Identifier if
   * present, and hope that it a usable URI or that our caller can
   * map it to one.
   * TODO: Resolve Public Identifiers... or consider changing function name.
   * <p>
   * If we find a relative URI
   * reference, XML expects it to be resolved in terms of the base URI
   * of the document. The DOM doesn't do that for us, and it isn't
   * entirely clear whether that should be done here; currently that's
   * pushed up to a higher level of our application. (Note that DOM Level
   * 1 didn't store the document's base URI.)
   * TODO: Consider resolving Relative URIs.
   * <p>
   * (The DOM's statement that "An XML processor may choose to
   * completely expand entities before the structure model is passed
   * to the DOM" refers only to parsed entities, not unparsed, and hence
   * doesn't affect this function.)
   *
   * @param name A string containing the Entity Name of the unparsed
   * entity.
   *
   * @return String containing the URI of the Unparsed Entity, or an
   * empty string if no such entity exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public int getElementById(String elementId)

  /**
   * Returns the <code>Element</code> whose <code>ID</code> is given by
   * <code>elementId</code>. If no such element exists, returns
   * <code>DTM.NULL</code>. Behavior is not defined if more than one element
   * has this <code>ID</code>. Attributes (including those
   * with the name "ID") are not of type ID unless so defined by DTD/Schema
   * information available to the DTM implementation.
   * Implementations that do not know whether attributes are of type ID or
   * not are expected to return <code>DTM.NULL</code>.
   *
   * <p>%REVIEW% Presumably IDs are still scoped to a single document,
   * and this operation searches only within a single document, right?
   * Wouldn't want collisions between DTMs in the same process.</p>
   *
   * @param elementId The unique <code>id</code> value for an element.
   * @return The handle of the matching element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getDocumentTypeDeclarationPublicIdentifier()

  /**
   * Return the public identifier of the external subset,
   * normalized as described in 4.2.2 External Entities [XML]. If there is
   * no external subset or if it has no public identifier, this property
   * has no value.
   *
   * @return the public identifier String object, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getDocumentTypeDeclarationSystemIdentifier()

  /**
   *   A document type declaration information item has the following properties:
   *
   *     1. [system identifier] The system identifier of the external subset, if
   *        it exists. Otherwise this property has no value.
   *
   * @return the system identifier String object, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getNodeValue(int nodeHandle)

  /**
   * Given a node handle, return its node value. This is mostly
   * as defined by the DOM, but may ignore some conveniences.
   * <p>
   *
   * @param nodeHandle The node id.
   * @return String Value of this node, or null if not
   * meaningful for this node type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  private Node logicalNextDOMTextNode(Node n)

  /** Utility function: Given a DOM Text node, determine whether it is
   * logically followed by another Text or CDATASection node. This may
   * involve traversing into Entity References.
   *
   * %REVIEW% DOM Level 3 is expected to add functionality which may
   * allow us to retire this.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getNamespaceURI(int nodeHandle)

  /**
   * Given a node handle, return its DOM-style namespace URI
   * (As defined in Namespaces, this is the declared URI which this node's
   * prefix -- or default in lieu thereof -- was mapped to.)
   *
   * <p>%REVIEW% Null or ""? -sb</p>
   *
   * @param nodeHandle the id of the node.
   * @return String URI value of this node's namespace, or null if no
   * namespace was resolved.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getPrefix(int nodeHandle)

  /**
   * Given a namespace handle, return the prefix that the namespace decl is
   * mapping.
   * Given a node handle, return the prefix used to map to the namespace.
   *
   * <p> %REVIEW% Are you sure you want "" for no prefix?  </p>
   * <p> %REVIEW-COMMENT% I think so... not totally sure. -sb  </p>
   *
   * @param nodeHandle the id of the node.
   * @return String prefix of this node's name, or "" if no explicit
   * namespace prefix was given.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getLocalName(int nodeHandle)

  /**
   * Given a node handle, return its XPath-style localname.
   * (As defined in Namespaces, this is the portion of the name after any
   * colon character).
   *
   * @param nodeHandle the id of the node.
   * @return String Local name of this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getNodeNameX(int nodeHandle)

  /**
   * Given a node handle, return the XPath node name.  This should be
   * the name as described by the XPath data model, NOT the DOM-style
   * name.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getNodeName(int nodeHandle)

  /**
   * Given a node handle, return its DOM-style node name. This will
   * include names such as #text or #document.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   * %REVIEW% Document when empty string is possible...
   * %REVIEW-COMMENT% It should never be empty, should it?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected static void getNodeData(Node node, FastStringBuffer buf)

  /**
   * Retrieve the text content of a DOM subtree, appending it into a
   * user-supplied FastStringBuffer object. Note that attributes are
   * not considered part of the content of an element.
   * <p>
   * There are open questions regarding whitespace stripping.
   * Currently we make no special effort in that regard, since the standard
   * DOM doesn't yet provide DTD-based information to distinguish
   * whitespace-in-element-context from genuine #PCDATA. Note that we
   * should probably also consider xml:space if/when we address this.
   * DOM Level 3 may solve the problem for us.
   * <p>
   * %REVIEW% Actually, since this method operates on the DOM side of the
   * fence rather than the DTM side, it SHOULDN'T do
   * any special handling. The DOM does what the DOM does; if you want
   * DTM-level abstractions, use DTM-level methods.
   *
   * @param node Node whose subtree is to be walked, gathering the
   * contents of all Text or CDATASection nodes.
   * @param buf FastStringBuffer into which the contents of the text
   * nodes are to be concatenated.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public boolean isWhitespace(int nodeHandle)

  /**
   * Determine if the string-value of a node is whitespace
   *
   * @param nodeHandle The node Handle.
   *
   * @return Return true if the given node is whitespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public XMLString getStringValue(int nodeHandle)

  /**
   * Get the string-value of a node as a String object
   * (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value).
   *
   * @param nodeHandle The node ID.
   *
   * @return A string object that represents the string-value of the given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public int getAttributeNode(int nodeHandle, String namespaceURI,
                              String name)

  /**
   * Retrieves an attribute node by by qualified name and namespace URI.
   *
   * @param nodeHandle int Handle of the node upon which to look up this attribute..
   * @param namespaceURI The namespace URI of the attribute to
   *   retrieve, or null.
   * @param name The local name of the attribute to
   *   retrieve.
   * @return The attribute node handle with the specified name (
   *   <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such
   *   attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public int getHandleOfNode(Node node)

  /** Get the handle from a Node. This is a more robust version of
   * getHandleFromNode, intended to be usable by the public.
   *
   * <p>%OPT% This will be pretty slow.</p>
   *
   * %REVIEW% This relies on being able to test node-identity via
   * object-identity. DTM2DOM proxying is a great example of a case where
   * that doesn't work. DOM Level 3 will provide the isSameNode() method
   * to fix that, but until then this is going to be flaky.
   *
   * @param node A node, which may be null.
   *
   * @return The node handle or <code>DTM.NULL</code>.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  private int getHandleFromNode(Node node)

  /**
   * Get the handle from a Node.
   * <p>%OPT% This will be pretty slow.</p>
   *
   * <p>%OPT% An XPath-like search (walk up DOM to root, tracking path;
   * walk down DTM reconstructing path) might be considerably faster
   * on later nodes in large documents. That might also imply improving
   * this call to handle nodes which would be in this DTM but
   * have not yet been built, which might or might not be a Good Thing.</p>
   *
   * %REVIEW% This relies on being able to test node-identity via
   * object-identity. DTM2DOM proxying is a great example of a case where
   * that doesn't work. DOM Level 3 will provide the isSameNode() method
   * to fix that, but until then this is going to be flaky.
   *
   * @param node A node, which may be null.
   *
   * @return The node handle or <code>DTM.NULL</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected int getNextNodeIdentity(int identity)

  /**
   * Get the next node identity value in the list, and call the iterator
   * if it hasn't been added yet.
   *
   * @param identity The node identity (index).
   * @return identity+1, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected Node lookupNode(int nodeIdentity)

  /**
   * Get a Node from an identity index.
   *
   * NEEDSDOC @param nodeIdentity
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public Node getNode(int nodeHandle)

  /**
   * Return an DOM node for the given node.
   *
   * @param nodeHandle The node ID.
   *
   * @return A node representation of the DTM node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected boolean nextNode()

 /**
   * This method iterates to the next node that will be added to the table.
   * Each call to this method adds a new node to the table, unless the end
   * is reached, in which case it returns null.
   *
   * @return The true if a next node is found or false if
   *         there are no more nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public int getNumberOfNodes()

  /**
   * Get the number of nodes that have been added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected int addNode(Node node, int parentIndex,
                        int previousSibling, int forceNodeType)

  /**
   * Construct the node map from the node.
   *
   * @param node The node that is to be added to the DTM.
   * @param parentIndex The current parent index.
   * @param previousSibling The previous sibling index.
   * @param forceNodeType If not DTM.NULL, overrides the DOM node type.
   *    Used to force nodes to Text rather than CDATASection when their
   *    coalesced value includes ordinary Text nodes (current DTM behavior).
   *
   * @return The index identity of the node that was added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public DOM2DTM(DTMManager mgr, DOMSource domSource,
                 int dtmIdentity, DTMWSFilter whiteSpaceFilter,
                 XMLStringFactory xstringfactory,
                 boolean doIndexing)

  /**
   * Construct a DOM2DTM object from a DOM node.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param domSource the DOM source that this DTM will wrap.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory XMLString factory for creating character content.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected Vector m_nodes = new Vector();

  /** The node objects.  The instance part of the handle indexes
   * directly into this vector.  Each DTM node may actually be
   * composed of several DOM nodes (for example, if logically-adjacent
   * Text/CDATASection nodes in the DOM have been coalesced into a
   * single DTM Text node); this table points only to the first in
   * that sequence. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  transient private boolean m_nodesAreProcessed;

  /** true if ALL the nodes in the m_root subtree have been processed;
   * false if our incremental build has not yet finished scanning the
   * DOM tree.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  boolean m_processedFirstElement=false;

  /** True iff the first element has been processed. This is used to control
      synthesis of the implied xml: namespace declaration node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  transient private Node m_root;

  /** The top of the subtree.
   * %REVIEW%: 'may not be the same as m_context if "//foo" pattern.'
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  private int m_last_kid=NULL;

  /** The current position in the DTM tree. Who children reference as their
   * previous sib. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  transient private Node m_pos;

  /** The current position in the DOM tree. Last node examined for
   * possible copying to DTM. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  static final String NAMESPACE_DECL_NS="http://www.w3.org/XML/1998/namespace";

  /** Manefest constant
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
public class DOM2DTM extends DTMDefaultBaseIterators

/** The <code>DOM2DTM</code> class serves up a DOM's contents via the
 * DTM API.
 *
 * Note that it doesn't necessarily represent a full Document
 * tree. You can wrap a DOM2DTM around a specific node and its subtree
 * and the right things should happen. (I don't _think_ we currently
 * support DocumentFrgment nodes as roots, though that might be worth
 * considering.)
 *
 * Note too that we do not currently attempt to track document
 * mutation. If you alter the DOM after wrapping DOM2DTM around it,
 * all bets are off.
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public SourceLocator getSourceLocatorFor(int node)

  /**
   * No source information is available for DOM2DTM, so return
   * <code>null</code> here.
   *
   * @param node an <code>int</code> value
   * @return null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public void setProperty(String property, Object value)

  /**
   * For the moment all the run time properties are ignored by this
   * class.
   *
   * @param property a <code>String</code> value
   * @param value an <code>Object</code> value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public void dispatchToEvents(int nodeHandle, org.xml.sax.ContentHandler ch)

  /**
   * Directly create SAX parser events from a subtree.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected static void dispatchNodeData(Node node,
                                         org.xml.sax.ContentHandler ch,
                                         int depth)

  /**
   * Retrieve the text content of a DOM subtree, appending it into a
   * user-supplied FastStringBuffer object. Note that attributes are
   * not considered part of the content of an element.
   * <p>
   * There are open questions regarding whitespace stripping.
   * Currently we make no special effort in that regard, since the standard
   * DOM doesn't yet provide DTD-based information to distinguish
   * whitespace-in-element-context from genuine #PCDATA. Note that we
   * should probably also consider xml:space if/when we address this.
   * DOM Level 3 may solve the problem for us.
   * <p>
   * %REVIEW% Note that as a DOM-level operation, it can be argued that this
   * routine _shouldn't_ perform any processing beyond what the DOM already
   * does, and that whitespace stripping and so on belong at the DTM level.
   * If you want a stripped DOM view, wrap DTM2DOM around DOM2DTM.
   *
   * @param node Node whose subtree is to be walked, gathering the
   * contents of all Text or CDATASection nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public void dispatchCharactersEvents(
          int nodeHandle, org.xml.sax.ContentHandler ch,
          boolean normalize)

  /**
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value of the given node (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value). Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  private static boolean isSpace(char ch)

  /**
   * Returns whether the specified <var>ch</var> conforms to the XML 1.0 definition
   * of whitespace.  Refer to <A href="http://www.w3.org/TR/1998/REC-xml-19980210#NT-S">
   * the definition of <CODE>S</CODE></A> for details.
   * @param   ch      Character to check as XML whitespace.
   * @return          =true if <var>ch</var> is XML whitespace; otherwise =false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public boolean needsTwoThreads()

  /** @return true iff we're building this model incrementally (eg
   * we're partnered with a IncrementalSAXSource) and thus require that the
   * transformation and the parse run simultaneously. Guidance to the
   * DTMManager.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public org.xml.sax.ext.DeclHandler getDeclHandler()

  /**
   * Return this DTM's DeclHandler.
   *
   * @return null if this model doesn't respond to SAX Decl events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public org.xml.sax.ErrorHandler getErrorHandler()

  /**
   * Return this DTM's ErrorHandler.
   *
   * @return null if this model doesn't respond to SAX error events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public org.xml.sax.DTDHandler getDTDHandler()

  /**
   * Return this DTM's DTDHandler.
   *
   * @return null if this model doesn't respond to SAX dtd events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public org.xml.sax.EntityResolver getEntityResolver()

  /**
   * Return this DTM's EntityResolver.
   *
   * @return null if this model doesn't respond to SAX entity ref events.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public org.xml.sax.ext.LexicalHandler getLexicalHandler()

  /**
   * Return this DTM's lexical handler.
   *
   * %REVIEW% Should this return null if constrution already done/begun?
   *
   * @return null if this model doesn't respond to lexical SAX events,
   * "this" if the DTM object has a built-in SAX ContentHandler,
   * the IncrementalSAXSource if we're bound to one and should receive
   * the SAX stream via it for incremental build purposes...
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public org.xml.sax.ContentHandler getContentHandler()

  /** getContentHandler returns "our SAX builder" -- the thing that
   * someone else should send SAX events to in order to extend this
   * DTM model.
   *
   * @return null if this model doesn't respond to SAX events,
   * "this" if the DTM object has a built-in SAX ContentHandler,
   * the IncrmentalSAXSource if we're bound to one and should receive
   * the SAX stream via it for incremental build purposes...
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public void setIncrementalSAXSource(IncrementalSAXSource source)

  /** Bind an IncrementalSAXSource to this DTM. NOT RELEVANT for DOM2DTM, since
   * we're wrapped around an existing DOM.
   *
   * @param source The IncrementalSAXSource that we want to recieve events from
   * on demand.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public boolean isAttributeSpecified(int attributeHandle)

  /**
   *     5. [specified] A flag indicating whether this attribute was actually
   *        specified in the start-tag of its element, or was defaulted from the
   *        DTD.
   *
   * @param attributeHandle the attribute handle
   * @return <code>true</code> if the attribute was specified;
   *         <code>false</code> if it was defaulted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getUnparsedEntityURI(String name)

  /**
   * The getUnparsedEntityURI function returns the URI of the unparsed
   * entity with the specified name in the same document as the context
   * node (see [3.3 Unparsed Entities]). It returns the empty string if
   * there is no such entity.
   * <p>
   * XML processors may choose to use the System Identifier (if one
   * is provided) to resolve the entity, rather than the URI in the
   * Public Identifier. The details are dependent on the processor, and
   * we would have to support some form of plug-in resolver to handle
   * this properly. Currently, we simply return the System Identifier if
   * present, and hope that it a usable URI or that our caller can
   * map it to one.
   * TODO: Resolve Public Identifiers... or consider changing function name.
   * <p>
   * If we find a relative URI
   * reference, XML expects it to be resolved in terms of the base URI
   * of the document. The DOM doesn't do that for us, and it isn't
   * entirely clear whether that should be done here; currently that's
   * pushed up to a higher level of our application. (Note that DOM Level
   * 1 didn't store the document's base URI.)
   * TODO: Consider resolving Relative URIs.
   * <p>
   * (The DOM's statement that "An XML processor may choose to
   * completely expand entities before the structure model is passed
   * to the DOM" refers only to parsed entities, not unparsed, and hence
   * doesn't affect this function.)
   *
   * @param name A string containing the Entity Name of the unparsed
   * entity.
   *
   * @return String containing the URI of the Unparsed Entity, or an
   * empty string if no such entity exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public int getElementById(String elementId)

  /**
   * Returns the <code>Element</code> whose <code>ID</code> is given by
   * <code>elementId</code>. If no such element exists, returns
   * <code>DTM.NULL</code>. Behavior is not defined if more than one element
   * has this <code>ID</code>. Attributes (including those
   * with the name "ID") are not of type ID unless so defined by DTD/Schema
   * information available to the DTM implementation.
   * Implementations that do not know whether attributes are of type ID or
   * not are expected to return <code>DTM.NULL</code>.
   *
   * <p>%REVIEW% Presumably IDs are still scoped to a single document,
   * and this operation searches only within a single document, right?
   * Wouldn't want collisions between DTMs in the same process.</p>
   *
   * @param elementId The unique <code>id</code> value for an element.
   * @return The handle of the matching element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getDocumentTypeDeclarationPublicIdentifier()

  /**
   * Return the public identifier of the external subset,
   * normalized as described in 4.2.2 External Entities [XML]. If there is
   * no external subset or if it has no public identifier, this property
   * has no value.
   *
   * @return the public identifier String object, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getDocumentTypeDeclarationSystemIdentifier()

  /**
   *   A document type declaration information item has the following properties:
   *
   *     1. [system identifier] The system identifier of the external subset, if
   *        it exists. Otherwise this property has no value.
   *
   * @return the system identifier String object, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getNodeValue(int nodeHandle)

  /**
   * Given a node handle, return its node value. This is mostly
   * as defined by the DOM, but may ignore some conveniences.
   * <p>
   *
   * @param nodeHandle The node id.
   * @return String Value of this node, or null if not
   * meaningful for this node type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  private Node logicalNextDOMTextNode(Node n)

  /** Utility function: Given a DOM Text node, determine whether it is
   * logically followed by another Text or CDATASection node. This may
   * involve traversing into Entity References.
   *
   * %REVIEW% DOM Level 3 is expected to add functionality which may
   * allow us to retire this.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getNamespaceURI(int nodeHandle)

  /**
   * Given a node handle, return its DOM-style namespace URI
   * (As defined in Namespaces, this is the declared URI which this node's
   * prefix -- or default in lieu thereof -- was mapped to.)
   *
   * <p>%REVIEW% Null or ""? -sb</p>
   *
   * @param nodeHandle the id of the node.
   * @return String URI value of this node's namespace, or null if no
   * namespace was resolved.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getPrefix(int nodeHandle)

  /**
   * Given a namespace handle, return the prefix that the namespace decl is
   * mapping.
   * Given a node handle, return the prefix used to map to the namespace.
   *
   * <p> %REVIEW% Are you sure you want "" for no prefix?  </p>
   * <p> %REVIEW-COMMENT% I think so... not totally sure. -sb  </p>
   *
   * @param nodeHandle the id of the node.
   * @return String prefix of this node's name, or "" if no explicit
   * namespace prefix was given.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getLocalName(int nodeHandle)

  /**
   * Given a node handle, return its XPath-style localname.
   * (As defined in Namespaces, this is the portion of the name after any
   * colon character).
   *
   * @param nodeHandle the id of the node.
   * @return String Local name of this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getNodeNameX(int nodeHandle)

  /**
   * Given a node handle, return the XPath node name.  This should be
   * the name as described by the XPath data model, NOT the DOM-style
   * name.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public String getNodeName(int nodeHandle)

  /**
   * Given a node handle, return its DOM-style node name. This will
   * include names such as #text or #document.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   * %REVIEW% Document when empty string is possible...
   * %REVIEW-COMMENT% It should never be empty, should it?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected static void getNodeData(Node node, FastStringBuffer buf)

  /**
   * Retrieve the text content of a DOM subtree, appending it into a
   * user-supplied FastStringBuffer object. Note that attributes are
   * not considered part of the content of an element.
   * <p>
   * There are open questions regarding whitespace stripping.
   * Currently we make no special effort in that regard, since the standard
   * DOM doesn't yet provide DTD-based information to distinguish
   * whitespace-in-element-context from genuine #PCDATA. Note that we
   * should probably also consider xml:space if/when we address this.
   * DOM Level 3 may solve the problem for us.
   * <p>
   * %REVIEW% Actually, since this method operates on the DOM side of the
   * fence rather than the DTM side, it SHOULDN'T do
   * any special handling. The DOM does what the DOM does; if you want
   * DTM-level abstractions, use DTM-level methods.
   *
   * @param node Node whose subtree is to be walked, gathering the
   * contents of all Text or CDATASection nodes.
   * @param buf FastStringBuffer into which the contents of the text
   * nodes are to be concatenated.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public boolean isWhitespace(int nodeHandle)

  /**
   * Determine if the string-value of a node is whitespace
   *
   * @param nodeHandle The node Handle.
   *
   * @return Return true if the given node is whitespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public XMLString getStringValue(int nodeHandle)

  /**
   * Get the string-value of a node as a String object
   * (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value).
   *
   * @param nodeHandle The node ID.
   *
   * @return A string object that represents the string-value of the given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public int getAttributeNode(int nodeHandle, String namespaceURI,
                              String name)

  /**
   * Retrieves an attribute node by by qualified name and namespace URI.
   *
   * @param nodeHandle int Handle of the node upon which to look up this attribute..
   * @param namespaceURI The namespace URI of the attribute to
   *   retrieve, or null.
   * @param name The local name of the attribute to
   *   retrieve.
   * @return The attribute node handle with the specified name (
   *   <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such
   *   attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public int getHandleOfNode(Node node)

  /** Get the handle from a Node. This is a more robust version of
   * getHandleFromNode, intended to be usable by the public.
   *
   * <p>%OPT% This will be pretty slow.</p>
   *
   * %REVIEW% This relies on being able to test node-identity via
   * object-identity. DTM2DOM proxying is a great example of a case where
   * that doesn't work. DOM Level 3 will provide the isSameNode() method
   * to fix that, but until then this is going to be flaky.
   *
   * @param node A node, which may be null.
   *
   * @return The node handle or <code>DTM.NULL</code>.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  private int getHandleFromNode(Node node)

  /**
   * Get the handle from a Node.
   * <p>%OPT% This will be pretty slow.</p>
   *
   * <p>%OPT% An XPath-like search (walk up DOM to root, tracking path;
   * walk down DTM reconstructing path) might be considerably faster
   * on later nodes in large documents. That might also imply improving
   * this call to handle nodes which would be in this DTM but
   * have not yet been built, which might or might not be a Good Thing.</p>
   *
   * %REVIEW% This relies on being able to test node-identity via
   * object-identity. DTM2DOM proxying is a great example of a case where
   * that doesn't work. DOM Level 3 will provide the isSameNode() method
   * to fix that, but until then this is going to be flaky.
   *
   * @param node A node, which may be null.
   *
   * @return The node handle or <code>DTM.NULL</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected int getNextNodeIdentity(int identity)

  /**
   * Get the next node identity value in the list, and call the iterator
   * if it hasn't been added yet.
   *
   * @param identity The node identity (index).
   * @return identity+1, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected Node lookupNode(int nodeIdentity)

  /**
   * Get a Node from an identity index.
   *
   * NEEDSDOC @param nodeIdentity
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public Node getNode(int nodeHandle)

  /**
   * Return an DOM node for the given node.
   *
   * @param nodeHandle The node ID.
   *
   * @return A node representation of the DTM node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected boolean nextNode()

 /**
   * This method iterates to the next node that will be added to the table.
   * Each call to this method adds a new node to the table, unless the end
   * is reached, in which case it returns null.
   *
   * @return The true if a next node is found or false if
   *         there are no more nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public int getNumberOfNodes()

  /**
   * Get the number of nodes that have been added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected int addNode(Node node, int parentIndex,
                        int previousSibling, int forceNodeType)

  /**
   * Construct the node map from the node.
   *
   * @param node The node that is to be added to the DTM.
   * @param parentIndex The current parent index.
   * @param previousSibling The previous sibling index.
   * @param forceNodeType If not DTM.NULL, overrides the DOM node type.
   *    Used to force nodes to Text rather than CDATASection when their
   *    coalesced value includes ordinary Text nodes (current DTM behavior).
   *
   * @return The index identity of the node that was added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  public DOM2DTM(DTMManager mgr, DOMSource domSource,
                 int dtmIdentity, DTMWSFilter whiteSpaceFilter,
                 XMLStringFactory xstringfactory,
                 boolean doIndexing)

  /**
   * Construct a DOM2DTM object from a DOM node.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param domSource the DOM source that this DTM will wrap.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory XMLString factory for creating character content.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  protected Vector m_nodes = new Vector();

  /** The node objects.  The instance part of the handle indexes
   * directly into this vector.  Each DTM node may actually be
   * composed of several DOM nodes (for example, if logically-adjacent
   * Text/CDATASection nodes in the DOM have been coalesced into a
   * single DTM Text node); this table points only to the first in
   * that sequence. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  transient private boolean m_nodesAreProcessed;

  /** true if ALL the nodes in the m_root subtree have been processed;
   * false if our incremental build has not yet finished scanning the
   * DOM tree.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  boolean m_processedFirstElement=false;

  /** True iff the first element has been processed. This is used to control
      synthesis of the implied xml: namespace declaration node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  transient private Node m_root;

  /** The top of the subtree.
   * %REVIEW%: 'may not be the same as m_context if "//foo" pattern.'
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  private int m_last_kid=NULL;

  /** The current position in the DTM tree. Who children reference as their
   * previous sib. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  transient private Node m_pos;

  /** The current position in the DOM tree. Last node examined for
   * possible copying to DTM. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
  static final String NAMESPACE_DECL_NS="http://www.w3.org/XML/1998/namespace";

  /** Manefest constant
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/dom2dtm/DOM2DTM.java
public class DOM2DTM extends DTMDefaultBaseIterators

/** The <code>DOM2DTM</code> class serves up a DOM's contents via the
 * DTM API.
 *
 * Note that it doesn't necessarily represent a full Document
 * tree. You can wrap a DOM2DTM around a specific node and its subtree
 * and the right things should happen. (I don't _think_ we currently
 * support DocumentFrgment nodes as roots, though that might be worth
 * considering.)
 *
 * Note too that we do not currently attempt to track document
 * mutation. If you alter the DOM after wrapping DOM2DTM around it,
 * all bets are off.
 * */
