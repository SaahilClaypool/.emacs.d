_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final void copyAttribute(int nodeID, int exptype,
        SerializationHandler handler)

    /**
     * Copy an Attribute node to a SerializationHandler
     *
     * @param nodeID The node identity
     * @param exptype The expanded type of the Element node
     * @param handler The SerializationHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final void copyAttributes(final int nodeID, SerializationHandler handler)

    /**
     * Copy  attribute nodes from an element .
     *
     * @param nodeID The Element node identity
     * @param handler The SerializationHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final int getNextNamespaceNode2(int baseID) {

    /**
     * Return the next namespace node following the given base node.
     *
     * @baseID The node identity of the base node, which can be an
     * element, attribute or namespace node.
     * @return The namespace node immediately following the base node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final void copyNS(final int nodeID, SerializationHandler handler, boolean inScope)

    /**
     * Copy  namespace nodes.
     *
     * @param nodeID The Element node identity
     * @param handler The SerializationHandler
     * @param inScope  true if all namespaces in scope should be copied,
     *  false if only the namespace declarations should be copied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final String copyElement(int nodeID, int exptype,
                               SerializationHandler handler)

    /**
     * Copy an Element node to a SerializationHandler.
     *
     * @param nodeID The node identity
     * @param exptype The expanded type of the Element node
     * @param handler The SerializationHandler
     * @return The qualified name of the Element node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final void copyTextNode(final int nodeID, SerializationHandler handler)

    /**
     * Copy the String value of a Text node to a SerializationHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final void dispatchCharactersEvents(int nodeHandle, ContentHandler ch,
                                             boolean normalize)

  /**
   * The optimized version of SAX2DTM.dispatchCharactersEvents(int, ContentHandler, boolean).
   * <p>
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value of the given node (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value). Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   * @param normalize true if the content should be normalized according to
   * the rules for the XPath
   * <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a>
   * function.
   *
   * @throws SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public String getStringValue()

  /**
   * Returns the string value of the entire tree
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final String getStringValueX(final int nodeHandle)

  /**
   * The optimized version of SAX2DTM.getStringValue(int).
   * <p>
   * %OPT% This is one of the most often used interfaces. Performance is
   * critical here. This one is different from SAX2DTM.getStringValue(int) in
   * that it returns a String instead of a XMLString.
   *
   * Get the string- value of a node as a String object (see http: //www. w3.
   * org/TR/xpath#data- model for the definition of a node's string- value).
   *
   * @param nodeHandle The node ID.
   *
   * @return A string object that represents the string-value of the given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public XMLString getStringValue(int nodeHandle)

  /**
   * Override SAX2DTM.getStringValue(int)
   * <p>
   * This method is only used by Xalan-J Interpretive. It is not used by XSLTC.
   * <p>
   * If the caller supplies an XMLStringFactory, the getStringValue() interface
   * in SAX2DTM will be called. Otherwise just calls getStringValueX() and
   * wraps the returned String in an XMLString.
   *
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public String getNodeName(int nodeHandle)

  /**
   * The optimized version of SAX2DTM.getNodeName().
   * <p>
   * Given a node handle, return its DOM-style node name. This will include
   * names such as #text or #document.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   * %REVIEW% Document when empty string is possible...
   * %REVIEW-COMMENT% It should never be empty, should it?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final String getNodeNameX(int nodeHandle)

  /**
   * The optimized version of SAX2DTM.getNodeNameX().
   * <p>
   * Given a node handle, return the XPath node name. This should be the name
   * as described by the XPath data model, NOT the DOM- style name.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public String getLocalName(int nodeHandle)

  /**
   * Override SAX2DTM.getLocalName() in SAX2DTM2.
   * <p>Processing for PIs is different.
   *
   * Given a node handle, return its XPath- style localname. (As defined in
   * Namespaces, this is the portion of the name after any colon character).
   *
   * @param nodeHandle the id of the node.
   * @return String Local name of this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  protected final int getTypedAttribute(int nodeHandle, int attType)

  /**
   * The optimized version of DTMDefaultBase.getTypedAttribute(int, int).
   * <p>
   * Given a node handle and an expanded type ID, get the index of the node's
   * attribute of that type, if any.
   *
   * @param nodeHandle int Handle of the node.
   * @param attType int expanded type ID of the required attribute.
   * @return Handle of attribute of the required type, or DTM.NULL to indicate
   * none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  protected int getNextAttributeIdentity(int identity) {

  /**
   * The optimized version of DTMDefaultBase.getNextAttributeIdentity(int).
   * <p>
   * Given a node identity for an attribute, advance to the next attribute.
   *
   * @param identity int identity of the attribute node.  This
   * <strong>must</strong> be an attribute node.
   *
   * @return int DTM node-identity of the resolved attr,
   * or DTM.NULL to indicate none exists.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  protected int getFirstAttributeIdentity(int identity) {

  /**
   * The optimized version of DTMDefaultBase.getFirstAttributeIdentity(int).
   * <p>
   * Given a node identity, get the index of the node's first attribute.
   *
   * @param identity int identity of the node.
   * @return Identity of first attribute, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int getFirstAttribute(int nodeHandle)

  /**
   * The optimized version of DTMDefaultBase.getFirstAttribute().
   * <p>
   * Given a node handle, get the index of the node's first attribute.
   *
   * @param nodeHandle int Handle of the node.
   * @return Handle of first attribute, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public void processingInstruction(String target, String data)

  /**
   * Override the processingInstruction() interface in SAX2DTM2.
   * <p>
   * %OPT% This one is different from SAX2DTM.processingInstruction()
   * in that we do not use extended types for PI nodes. The name of
   * the PI is saved in the DTMStringPool.
   *
   * Receive notification of a processing instruction.
   *
   * @param target The processing instruction target.
   * @param data The processing instruction data, or null if
   *             none is supplied.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#processingInstruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  protected final void charactersFlush()

  /**
   * Check whether accumulated text should be stripped; if not,
   * append the appropriate flavor of text/cdata node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  protected final int addNode(int type, int expandedTypeID,
                        int parentIndex, int previousSibling,
                        int dataOrPrefix, boolean canHaveFirstChild)

  /**
   * Construct the node map from the node.
   *
   * @param type raw type ID, one of DTM.XXX_NODE.
   * @param expandedTypeID The expended type ID.
   * @param parentIndex The current parent index.
   * @param previousSibling The previous sibling index.
   * @param dataOrPrefix index into m_data table, or string handle.
   * @param canHaveFirstChild true if the node can have a first child, false
   *                          if it is atomic.
   *
   * @return The index identity of the node that was added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public void endDocument() throws SAXException

  /**
   * Receive notification of the end of the document.
   *
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#endDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public void startDocument() throws SAXException

  /**
   * Receive notification of the beginning of the document.
   *
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#startDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public void comment(char ch[], int start, int length) throws SAXException

  /**
   * Report an XML comment anywhere in the document.
   *
   * <p>This callback will be used for comments inside or outside the
   * document element, including comments in the external DTD
   * subset (if read).</p>
   *
   * @param ch An array holding the characters in the comment.
   * @param start The starting position in the array.
   * @param length The number of characters to use from the array.
   * @throws SAXException The application may raise an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public void endElement(String uri, String localName, String qName)

  /**
   * Receive notification of the end of an element.
   *
   * <p>By default, do nothing.  Application writers may override this
   * method in a subclass to take specific actions at the end of
   * each element (such as finalising a tree node or writing
   * output to a file).</p>
   *
   * @param uri The Namespace URI, or the empty string if the
   *        element has no Namespace URI or if Namespace
   *        processing is not being performed.
   * @param localName The local name (without prefix), or the
   *        empty string if Namespace processing is not being
   *        performed.
   * @param qName The qualified XML 1.0 name (with prefix), or the
   *        empty string if qualified names are not available.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#endElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public void startElement(String uri, String localName, String qName, Attributes attributes)

  /**
   * Override SAX2DTM.startElement()
   *
   * <p>Receive notification of the start of an element.
   *
   * <p>By default, do nothing.  Application writers may override this
   * method in a subclass to take specific actions at the start of
   * each element (such as allocating a new tree node or writing
   * output to a file).</p>
   *
   * @param uri The Namespace URI, or the empty string if the
   *        element has no Namespace URI or if Namespace
   *        processing is not being performed.
   * @param localName The local name (without prefix), or the
   *        empty string if Namespace processing is not being
   *        performed.
   * @param qName The qualified name (with prefix), or the
   *        empty string if qualified names are not available.
   * @param attributes The specified or defaulted attributes.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#startElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public int getIdForNamespace(String uri)

  /**
   * Get a prefix either from the uri mapping, or just make
   * one up!
   *
   * @param uri The namespace URI, which may be null.
   *
   * @return The prefix if there is one, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  /**

  /*************************************************************************
   *                 END of DTM base accessor interfaces
   *************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int getExpandedTypeID2(int nodeHandle)

  /**
   * The optimized version of DTMDefaultBase.getExpandedTypeID(int).
   *
   * <p>This one is only used by DOMAdapter.getExpandedTypeID(int), which
   * is mostly called from the compiled translets.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int _type2(int identity)

  /**
   * The optimized version of DTMDefaultBase._type().
   *
   * @param identity A node identity, which <em>must not</em> be equal to
   *        <code>DTM.NULL</code>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int _parent2(int identity)

  /**
   * The optimized version of DTMDefaultBase._parent().
   *
   * @param identity A node identity, which <em>must not</em> be equal to
   *        <code>DTM.NULL</code>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int _firstch2(int identity)

  /**
   * The optimized version of DTMDefaultBase._firstch().
   *
   * @param identity A node identity, which <em>must not</em> be equal to
   *        <code>DTM.NULL</code>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int _nextsib2(int identity)

  /**
   * The optimized version of DTMDefaultBase._nextsib().
   *
   * @param identity A node identity, which <em>must not</em> be equal to
   *        <code>DTM.NULL</code>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  /**

  /************************************************************************
   *             DTM base accessor interfaces
   *
   * %OPT% The code in the following interfaces (e.g. _exptype2, etc.) are
   * very important to the DTM performance. To have the best performace,
   * these several interfaces have direct access to the internal arrays of
   * the SuballocatedIntVectors. The final modifier also has a noticeable
   * impact on performance.
   ***********************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int _exptype(int identity)

  /**
   * Override DTMDefaultBase._exptype() by dropping the incremental code.
   *
   * <p>This one is less efficient than _exptype2. It is only used during
   * DTM building. _exptype2 is used after the document is fully built.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public SAX2DTM2(DTMManager mgr, Source source, int dtmIdentity,
                 DTMWSFilter whiteSpaceFilter,
                 XMLStringFactory xstringfactory,
                 boolean doIndexing,
                 int blocksize,
                 boolean usePrevsib,
                 boolean buildIdIndex,
                 boolean newNameTable)

  /**
   * Construct a SAX2DTM2 object using the given block size.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public SAX2DTM2(DTMManager mgr, Source source, int dtmIdentity,
                 DTMWSFilter whiteSpaceFilter,
                 XMLStringFactory xstringfactory,
                 boolean doIndexing)

  /**
   * Construct a SAX2DTM2 object using the default block size.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  // The number of bits for the length of a Text node.

  /** %OPT% If the offset and length of a Text node are within certain limits,
   * we store a bitwise encoded value into an int, using 10 bits (max. 1024)
   * for length and 21 bits for offset. We can save two SuballocatedIntVector
   * calls for each getStringValueX() and dispatchCharacterEvents() call by
   * doing this.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  // %OPT% Array references which are used to cache the map0 arrays in

  /*******************************************************************
   *                End of nested iterators
   *******************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedSingletonIterator(int nodeType)

    /**
     * Constructor TypedSingletonIterator
     *
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedSingletonIterator extends SingletonIterator

  /**
   * Iterator that returns a given node only if it is of a given type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedDescendantIterator(int nodeType)

    /**
     * Constructor TypedDescendantIterator
     *
     *
     * @param nodeType Extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedDescendantIterator extends DescendantIterator

  /**
   * Typed iterator that returns the descendants of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public DTMAxisIterator reset()

    /**
     * Reset.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final boolean isDescendant(int identity)

    /**
     * Tell if this node identity is a descendant.  Assumes that
     * the node info for the element has already been obtained.
     *
     * This one-sided test works only if the parent has been
     * previously tested and is known to be a descendent. It fails if
     * the parent is the _startNode's next sibling, or indeed any node
     * that follows _startNode in document order.  That may suffice
     * for this iterator, but it's not really an isDescendent() test.
     * %REVIEW% rename?
     *
     * @param identity The index number of the node in question.
     * @return true if the index is a descendant of _startNode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class DescendantIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns the descendants of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int getLast() {

    /**
     * Returns the position of the last node within the iteration, as
     * defined by XPath.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int getNodeByPosition(int position)

    /**
     * Return the node at the given position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedAncestorIterator(int type)

    /**
     * Constructor TypedAncestorIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedAncestorIterator extends AncestorIterator

  /**
   * Typed iterator that returns the ancestors of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator reset()

    /**
     * Resets the iterator to the last start node.
     *
     * @return A DTMAxisIterator, which may or may not be the same as this
     *         iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator cloneIterator()

    /**
     * Returns a deep copy of this iterator.  The cloned iterator is not reset.
     *
     * @return a deep copy of this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public final boolean isReverse()

    /**
     * True if this iterator has a reversed axis.
     *
     * @return true since this iterator is a reversed axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int getStartNode()

    /**
     * Get start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @return The root node of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    int m_realStartNode;

    /** The real start node for this axes, since _startNode will be adjusted. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class AncestorIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns the ancestors of a given node in document
   * order.  (NOTE!  This was changed from the XSLTC code!)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedFollowingIterator(int type)

    /**
     * Constructor TypedFollowingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedFollowingIterator extends FollowingIterator

  /**
   * Iterator that returns following nodes of a given type for a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class FollowingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns following nodes of for a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedPrecedingIterator(int type)

    /**
     * Constructor TypedPrecedingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedPrecedingIterator extends PrecedingIterator

  /**
   * Iterator that returns preceding nodes of agiven type for a
   * given node. This includes the node set {root+1, start-1}, but
   * excludes all ancestors.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator reset()

    /**
     * Resets the iterator to the last start node.
     *
     * @return A DTMAxisIterator, which may or may not be the same as this
     *         iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator cloneIterator()

    /**
     * Returns a deep copy of this iterator.   The cloned iterator is not reset.
     *
     * @return a deep copy of this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public boolean isReverse()

    /**
     * True if this iterator has a reversed axis.
     *
     * @return true since this iterator is a reversed axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected int _sp, _oldsp;

    /** (not sure yet... -sb) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected int[] _stack = new int[_maxAncestors];

    /**
     * The stack of start node + ancestors up to the root of the tree,
     *  which we must avoid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _maxAncestors = 8;

    /** The max ancestors, but it can grow... */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class PrecedingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns preceding nodes of a given node.
   * This includes the node set {root+1, start-1}, but excludes
   * all ancestors, attributes, and namespace nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int getLast()

    /**
     * Return the index of the last node in this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedPrecedingSiblingIterator(int type)

    /**
     * Constructor TypedPrecedingSiblingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedPrecedingSiblingIterator

  /**
   * Iterator that returns preceding siblings of a given type for
   * a given node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public boolean isReverse()

    /**
     * True if this iterator has a reversed axis.
     *
     * @return true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected int _startNodeID;

    /**
     * The node identity of _startNode for this iterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class PrecedingSiblingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns preceding siblings of a given node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedAttributeIterator(int nodeType)

    /**
     * Constructor TypedAttributeIterator
     *
     *
     * @param nodeType The extended type ID that is requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedAttributeIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns attribute nodes of a given type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class AttributeIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns attribute nodes (of what nodes?)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedFollowingSiblingIterator(int type)

    /**
     * Constructor TypedFollowingSiblingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedFollowingSiblingIterator

  /**
   * Iterator that returns all following siblings of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class FollowingSiblingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns all siblings of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedRootIterator(int nodeType)

    /**
     * Constructor TypedRootIterator
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class TypedRootIterator extends RootIterator

  /**
   * Iterator that returns the namespace nodes as defined by the XPath data model
   * for a given node, filtered by extended type ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int getNodeByPosition(int position)

    /**
     * Return the node at the given position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedChildrenIterator(int nodeType)

    /**
     * Constructor TypedChildrenIterator
     *
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedChildrenIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns children of a given type for a given node.
   * The functionality chould be achieved by putting a filter on top
   * of a basic child iterator, but a specialised iterator is used
   * for efficiency (both speed and size of translet).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration. In this case, we return
     * only the immediate parent, _if_ it matches the requested nodeType.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setNodeType(final int type)

    /**
     * Set the node type of the parent that we're looking for.
     * Note that this does _not_ mean "find the nearest ancestor of
     * this type", but "yield the parent if it is of this type".
     *
     *
     * @param type extended type ID.
     *
     * @return ParentIterator configured with the type filter set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private int _nodeType = DTM.NULL;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class ParentIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns the parent of a given node. Note that
   * this delivers only a single node; if you want all the ancestors,
   * see AncestorIterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END if no more
     * are available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Setting start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     * <p>
     * If the iterator is not restartable, this has no effect.
     * %REVIEW% Should it return/throw something in that case,
     * or set current node to END, to indicate request-not-honored?
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  /**

  /****************************************************************
   *       Optimized version of the nested iterators
   ****************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
public class SAX2DTM2 extends SAX2DTM

/**
 * SAX2DTM2 is an optimized version of SAX2DTM which is used in non-incremental situation.
 * It is used as the super class of the XSLTC SAXImpl. Many of the interfaces in SAX2DTM
 * and DTMDefaultBase are overridden in SAX2DTM2 in order to allow fast, efficient
 * access to the DTM model. Some nested iterators in DTMDefaultBaseIterators
 * are also overridden in SAX2DTM2 for performance reasons.
 * <p>
 * Performance is the biggest consideration in the design of SAX2DTM2. To make the code most
 * efficient, the incremental support is dropped in SAX2DTM2, which means that you should not
 * use it in incremental situation. To reduce the overhead of pulling data from the DTM model,
 * a few core interfaces in SAX2DTM2 have direct access to the internal arrays of the
 * SuballocatedIntVectors.
 * <p>
 * The design of SAX2DTM2 may limit its extensibilty. If you have a reason to extend the
 * SAX2DTM model, please extend from SAX2DTM instead of this class.
 * <p>
 * TODO: This class is currently only used by XSLTC. We need to investigate the possibility
 * of also using it in Xalan-J Interpretive. Xalan's performance is likely to get an instant
 * boost if we use SAX2DTM2 instead of SAX2DTM in non-incremental case.
 * <p>
 * %MK% The code in this class is critical to the XSLTC_DTM performance. Be very careful
 * when making changes here!
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final void copyAttribute(int nodeID, int exptype,
        SerializationHandler handler)

    /**
     * Copy an Attribute node to a SerializationHandler
     *
     * @param nodeID The node identity
     * @param exptype The expanded type of the Element node
     * @param handler The SerializationHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final void copyAttributes(final int nodeID, SerializationHandler handler)

    /**
     * Copy  attribute nodes from an element .
     *
     * @param nodeID The Element node identity
     * @param handler The SerializationHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final int getNextNamespaceNode2(int baseID) {

    /**
     * Return the next namespace node following the given base node.
     *
     * @baseID The node identity of the base node, which can be an
     * element, attribute or namespace node.
     * @return The namespace node immediately following the base node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final void copyNS(final int nodeID, SerializationHandler handler, boolean inScope)

    /**
     * Copy  namespace nodes.
     *
     * @param nodeID The Element node identity
     * @param handler The SerializationHandler
     * @param inScope  true if all namespaces in scope should be copied,
     *  false if only the namespace declarations should be copied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final String copyElement(int nodeID, int exptype,
                               SerializationHandler handler)

    /**
     * Copy an Element node to a SerializationHandler.
     *
     * @param nodeID The node identity
     * @param exptype The expanded type of the Element node
     * @param handler The SerializationHandler
     * @return The qualified name of the Element node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final void copyTextNode(final int nodeID, SerializationHandler handler)

    /**
     * Copy the String value of a Text node to a SerializationHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final void dispatchCharactersEvents(int nodeHandle, ContentHandler ch,
                                             boolean normalize)

  /**
   * The optimized version of SAX2DTM.dispatchCharactersEvents(int, ContentHandler, boolean).
   * <p>
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value of the given node (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value). Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   * @param normalize true if the content should be normalized according to
   * the rules for the XPath
   * <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a>
   * function.
   *
   * @throws SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public String getStringValue()

  /**
   * Returns the string value of the entire tree
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final String getStringValueX(final int nodeHandle)

  /**
   * The optimized version of SAX2DTM.getStringValue(int).
   * <p>
   * %OPT% This is one of the most often used interfaces. Performance is
   * critical here. This one is different from SAX2DTM.getStringValue(int) in
   * that it returns a String instead of a XMLString.
   *
   * Get the string- value of a node as a String object (see http: //www. w3.
   * org/TR/xpath#data- model for the definition of a node's string- value).
   *
   * @param nodeHandle The node ID.
   *
   * @return A string object that represents the string-value of the given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public XMLString getStringValue(int nodeHandle)

  /**
   * Override SAX2DTM.getStringValue(int)
   * <p>
   * This method is only used by Xalan-J Interpretive. It is not used by XSLTC.
   * <p>
   * If the caller supplies an XMLStringFactory, the getStringValue() interface
   * in SAX2DTM will be called. Otherwise just calls getStringValueX() and
   * wraps the returned String in an XMLString.
   *
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public String getNodeName(int nodeHandle)

  /**
   * The optimized version of SAX2DTM.getNodeName().
   * <p>
   * Given a node handle, return its DOM-style node name. This will include
   * names such as #text or #document.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   * %REVIEW% Document when empty string is possible...
   * %REVIEW-COMMENT% It should never be empty, should it?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final String getNodeNameX(int nodeHandle)

  /**
   * The optimized version of SAX2DTM.getNodeNameX().
   * <p>
   * Given a node handle, return the XPath node name. This should be the name
   * as described by the XPath data model, NOT the DOM- style name.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public String getLocalName(int nodeHandle)

  /**
   * Override SAX2DTM.getLocalName() in SAX2DTM2.
   * <p>Processing for PIs is different.
   *
   * Given a node handle, return its XPath- style localname. (As defined in
   * Namespaces, this is the portion of the name after any colon character).
   *
   * @param nodeHandle the id of the node.
   * @return String Local name of this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  protected final int getTypedAttribute(int nodeHandle, int attType)

  /**
   * The optimized version of DTMDefaultBase.getTypedAttribute(int, int).
   * <p>
   * Given a node handle and an expanded type ID, get the index of the node's
   * attribute of that type, if any.
   *
   * @param nodeHandle int Handle of the node.
   * @param attType int expanded type ID of the required attribute.
   * @return Handle of attribute of the required type, or DTM.NULL to indicate
   * none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  protected int getNextAttributeIdentity(int identity) {

  /**
   * The optimized version of DTMDefaultBase.getNextAttributeIdentity(int).
   * <p>
   * Given a node identity for an attribute, advance to the next attribute.
   *
   * @param identity int identity of the attribute node.  This
   * <strong>must</strong> be an attribute node.
   *
   * @return int DTM node-identity of the resolved attr,
   * or DTM.NULL to indicate none exists.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  protected int getFirstAttributeIdentity(int identity) {

  /**
   * The optimized version of DTMDefaultBase.getFirstAttributeIdentity(int).
   * <p>
   * Given a node identity, get the index of the node's first attribute.
   *
   * @param identity int identity of the node.
   * @return Identity of first attribute, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int getFirstAttribute(int nodeHandle)

  /**
   * The optimized version of DTMDefaultBase.getFirstAttribute().
   * <p>
   * Given a node handle, get the index of the node's first attribute.
   *
   * @param nodeHandle int Handle of the node.
   * @return Handle of first attribute, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public void processingInstruction(String target, String data)

  /**
   * Override the processingInstruction() interface in SAX2DTM2.
   * <p>
   * %OPT% This one is different from SAX2DTM.processingInstruction()
   * in that we do not use extended types for PI nodes. The name of
   * the PI is saved in the DTMStringPool.
   *
   * Receive notification of a processing instruction.
   *
   * @param target The processing instruction target.
   * @param data The processing instruction data, or null if
   *             none is supplied.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#processingInstruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  protected final void charactersFlush()

  /**
   * Check whether accumulated text should be stripped; if not,
   * append the appropriate flavor of text/cdata node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  protected final int addNode(int type, int expandedTypeID,
                        int parentIndex, int previousSibling,
                        int dataOrPrefix, boolean canHaveFirstChild)

  /**
   * Construct the node map from the node.
   *
   * @param type raw type ID, one of DTM.XXX_NODE.
   * @param expandedTypeID The expended type ID.
   * @param parentIndex The current parent index.
   * @param previousSibling The previous sibling index.
   * @param dataOrPrefix index into m_data table, or string handle.
   * @param canHaveFirstChild true if the node can have a first child, false
   *                          if it is atomic.
   *
   * @return The index identity of the node that was added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public void endDocument() throws SAXException

  /**
   * Receive notification of the end of the document.
   *
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#endDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public void startDocument() throws SAXException

  /**
   * Receive notification of the beginning of the document.
   *
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#startDocument
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public void comment(char ch[], int start, int length) throws SAXException

  /**
   * Report an XML comment anywhere in the document.
   *
   * <p>This callback will be used for comments inside or outside the
   * document element, including comments in the external DTD
   * subset (if read).</p>
   *
   * @param ch An array holding the characters in the comment.
   * @param start The starting position in the array.
   * @param length The number of characters to use from the array.
   * @throws SAXException The application may raise an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public void endElement(String uri, String localName, String qName)

  /**
   * Receive notification of the end of an element.
   *
   * <p>By default, do nothing.  Application writers may override this
   * method in a subclass to take specific actions at the end of
   * each element (such as finalising a tree node or writing
   * output to a file).</p>
   *
   * @param uri The Namespace URI, or the empty string if the
   *        element has no Namespace URI or if Namespace
   *        processing is not being performed.
   * @param localName The local name (without prefix), or the
   *        empty string if Namespace processing is not being
   *        performed.
   * @param qName The qualified XML 1.0 name (with prefix), or the
   *        empty string if qualified names are not available.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#endElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public void startElement(String uri, String localName, String qName, Attributes attributes)

  /**
   * Override SAX2DTM.startElement()
   *
   * <p>Receive notification of the start of an element.
   *
   * <p>By default, do nothing.  Application writers may override this
   * method in a subclass to take specific actions at the start of
   * each element (such as allocating a new tree node or writing
   * output to a file).</p>
   *
   * @param uri The Namespace URI, or the empty string if the
   *        element has no Namespace URI or if Namespace
   *        processing is not being performed.
   * @param localName The local name (without prefix), or the
   *        empty string if Namespace processing is not being
   *        performed.
   * @param qName The qualified name (with prefix), or the
   *        empty string if qualified names are not available.
   * @param attributes The specified or defaulted attributes.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   * @see org.xml.sax.ContentHandler#startElement
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public int getIdForNamespace(String uri)

  /**
   * Get a prefix either from the uri mapping, or just make
   * one up!
   *
   * @param uri The namespace URI, which may be null.
   *
   * @return The prefix if there is one, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  /**

  /*************************************************************************
   *                 END of DTM base accessor interfaces
   *************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int getExpandedTypeID2(int nodeHandle)

  /**
   * The optimized version of DTMDefaultBase.getExpandedTypeID(int).
   *
   * <p>This one is only used by DOMAdapter.getExpandedTypeID(int), which
   * is mostly called from the compiled translets.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int _type2(int identity)

  /**
   * The optimized version of DTMDefaultBase._type().
   *
   * @param identity A node identity, which <em>must not</em> be equal to
   *        <code>DTM.NULL</code>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int _parent2(int identity)

  /**
   * The optimized version of DTMDefaultBase._parent().
   *
   * @param identity A node identity, which <em>must not</em> be equal to
   *        <code>DTM.NULL</code>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int _firstch2(int identity)

  /**
   * The optimized version of DTMDefaultBase._firstch().
   *
   * @param identity A node identity, which <em>must not</em> be equal to
   *        <code>DTM.NULL</code>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int _nextsib2(int identity)

  /**
   * The optimized version of DTMDefaultBase._nextsib().
   *
   * @param identity A node identity, which <em>must not</em> be equal to
   *        <code>DTM.NULL</code>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  /**

  /************************************************************************
   *             DTM base accessor interfaces
   *
   * %OPT% The code in the following interfaces (e.g. _exptype2, etc.) are
   * very important to the DTM performance. To have the best performace,
   * these several interfaces have direct access to the internal arrays of
   * the SuballocatedIntVectors. The final modifier also has a noticeable
   * impact on performance.
   ***********************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final int _exptype(int identity)

  /**
   * Override DTMDefaultBase._exptype() by dropping the incremental code.
   *
   * <p>This one is less efficient than _exptype2. It is only used during
   * DTM building. _exptype2 is used after the document is fully built.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public SAX2DTM2(DTMManager mgr, Source source, int dtmIdentity,
                 DTMWSFilter whiteSpaceFilter,
                 XMLStringFactory xstringfactory,
                 boolean doIndexing,
                 int blocksize,
                 boolean usePrevsib,
                 boolean buildIdIndex,
                 boolean newNameTable)

  /**
   * Construct a SAX2DTM2 object using the given block size.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public SAX2DTM2(DTMManager mgr, Source source, int dtmIdentity,
                 DTMWSFilter whiteSpaceFilter,
                 XMLStringFactory xstringfactory,
                 boolean doIndexing)

  /**
   * Construct a SAX2DTM2 object using the default block size.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  // The number of bits for the length of a Text node.

  /** %OPT% If the offset and length of a Text node are within certain limits,
   * we store a bitwise encoded value into an int, using 10 bits (max. 1024)
   * for length and 21 bits for offset. We can save two SuballocatedIntVector
   * calls for each getStringValueX() and dispatchCharacterEvents() call by
   * doing this.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  // %OPT% Array references which are used to cache the map0 arrays in

  /*******************************************************************
   *                End of nested iterators
   *******************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedSingletonIterator(int nodeType)

    /**
     * Constructor TypedSingletonIterator
     *
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedSingletonIterator extends SingletonIterator

  /**
   * Iterator that returns a given node only if it is of a given type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedDescendantIterator(int nodeType)

    /**
     * Constructor TypedDescendantIterator
     *
     *
     * @param nodeType Extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedDescendantIterator extends DescendantIterator

  /**
   * Typed iterator that returns the descendants of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public DTMAxisIterator reset()

    /**
     * Reset.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected final boolean isDescendant(int identity)

    /**
     * Tell if this node identity is a descendant.  Assumes that
     * the node info for the element has already been obtained.
     *
     * This one-sided test works only if the parent has been
     * previously tested and is known to be a descendent. It fails if
     * the parent is the _startNode's next sibling, or indeed any node
     * that follows _startNode in document order.  That may suffice
     * for this iterator, but it's not really an isDescendent() test.
     * %REVIEW% rename?
     *
     * @param identity The index number of the node in question.
     * @return true if the index is a descendant of _startNode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class DescendantIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns the descendants of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int getLast() {

    /**
     * Returns the position of the last node within the iteration, as
     * defined by XPath.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int getNodeByPosition(int position)

    /**
     * Return the node at the given position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedAncestorIterator(int type)

    /**
     * Constructor TypedAncestorIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedAncestorIterator extends AncestorIterator

  /**
   * Typed iterator that returns the ancestors of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator reset()

    /**
     * Resets the iterator to the last start node.
     *
     * @return A DTMAxisIterator, which may or may not be the same as this
     *         iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator cloneIterator()

    /**
     * Returns a deep copy of this iterator.  The cloned iterator is not reset.
     *
     * @return a deep copy of this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public final boolean isReverse()

    /**
     * True if this iterator has a reversed axis.
     *
     * @return true since this iterator is a reversed axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int getStartNode()

    /**
     * Get start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @return The root node of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    int m_realStartNode;

    /** The real start node for this axes, since _startNode will be adjusted. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class AncestorIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns the ancestors of a given node in document
   * order.  (NOTE!  This was changed from the XSLTC code!)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedFollowingIterator(int type)

    /**
     * Constructor TypedFollowingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedFollowingIterator extends FollowingIterator

  /**
   * Iterator that returns following nodes of a given type for a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class FollowingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns following nodes of for a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedPrecedingIterator(int type)

    /**
     * Constructor TypedPrecedingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedPrecedingIterator extends PrecedingIterator

  /**
   * Iterator that returns preceding nodes of agiven type for a
   * given node. This includes the node set {root+1, start-1}, but
   * excludes all ancestors.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator reset()

    /**
     * Resets the iterator to the last start node.
     *
     * @return A DTMAxisIterator, which may or may not be the same as this
     *         iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator cloneIterator()

    /**
     * Returns a deep copy of this iterator.   The cloned iterator is not reset.
     *
     * @return a deep copy of this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public boolean isReverse()

    /**
     * True if this iterator has a reversed axis.
     *
     * @return true since this iterator is a reversed axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected int _sp, _oldsp;

    /** (not sure yet... -sb) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected int[] _stack = new int[_maxAncestors];

    /**
     * The stack of start node + ancestors up to the root of the tree,
     *  which we must avoid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _maxAncestors = 8;

    /** The max ancestors, but it can grow... */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class PrecedingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns preceding nodes of a given node.
   * This includes the node set {root+1, start-1}, but excludes
   * all ancestors, attributes, and namespace nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int getLast()

    /**
     * Return the index of the last node in this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedPrecedingSiblingIterator(int type)

    /**
     * Constructor TypedPrecedingSiblingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedPrecedingSiblingIterator

  /**
   * Iterator that returns preceding siblings of a given type for
   * a given node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public boolean isReverse()

    /**
     * True if this iterator has a reversed axis.
     *
     * @return true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    protected int _startNodeID;

    /**
     * The node identity of _startNode for this iterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class PrecedingSiblingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns preceding siblings of a given node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedAttributeIterator(int nodeType)

    /**
     * Constructor TypedAttributeIterator
     *
     *
     * @param nodeType The extended type ID that is requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedAttributeIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns attribute nodes of a given type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class AttributeIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns attribute nodes (of what nodes?)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedFollowingSiblingIterator(int type)

    /**
     * Constructor TypedFollowingSiblingIterator
     *
     *
     * @param type The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedFollowingSiblingIterator

  /**
   * Iterator that returns all following siblings of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class FollowingSiblingIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns all siblings of a given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedRootIterator(int nodeType)

    /**
     * Constructor TypedRootIterator
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public class TypedRootIterator extends RootIterator

  /**
   * Iterator that returns the namespace nodes as defined by the XPath data model
   * for a given node, filtered by extended type ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int getNodeByPosition(int position)

    /**
     * Return the node at the given position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public TypedChildrenIterator(int nodeType)

    /**
     * Constructor TypedChildrenIterator
     *
     *
     * @param nodeType The extended type ID being requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private final int _nodeType;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class TypedChildrenIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns children of a given type for a given node.
   * The functionality chould be achieved by putting a filter on top
   * of a basic child iterator, but a specialised iterator is used
   * for efficiency (both speed and size of translet).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration. In this case, we return
     * only the immediate parent, _if_ it matches the requested nodeType.
     *
     * @return The next node handle in the iteration, or END.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setNodeType(final int type)

    /**
     * Set the node type of the parent that we're looking for.
     * Note that this does _not_ mean "find the nearest ancestor of
     * this type", but "yield the parent if it is of this type".
     *
     *
     * @param type extended type ID.
     *
     * @return ParentIterator configured with the type filter set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Set start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    private int _nodeType = DTM.NULL;

    /** The extended type ID that was requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  public final class ParentIterator extends InternalAxisIteratorBase

  /**
   * Iterator that returns the parent of a given node. Note that
   * this delivers only a single node; if you want all the ancestors,
   * see AncestorIterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public int next()

    /**
     * Get the next node in the iteration.
     *
     * @return The next node handle in the iteration, or END if no more
     * are available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
    public DTMAxisIterator setStartNode(int node)

    /**
     * Setting start to END should 'close' the iterator,
     * i.e. subsequent call to next() should return END.
     * <p>
     * If the iterator is not restartable, this has no effect.
     * %REVIEW% Should it return/throw something in that case,
     * or set current node to END, to indicate request-not-honored?
     *
     * @param node Sets the root of the iteration.
     *
     * @return A DTMAxisIterator set to the start of the iteration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
  /**

  /****************************************************************
   *       Optimized version of the nested iterators
   ****************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/sax2dtm/SAX2DTM2.java
public class SAX2DTM2 extends SAX2DTM

/**
 * SAX2DTM2 is an optimized version of SAX2DTM which is used in non-incremental situation.
 * It is used as the super class of the XSLTC SAXImpl. Many of the interfaces in SAX2DTM
 * and DTMDefaultBase are overridden in SAX2DTM2 in order to allow fast, efficient
 * access to the DTM model. Some nested iterators in DTMDefaultBaseIterators
 * are also overridden in SAX2DTM2 for performance reasons.
 * <p>
 * Performance is the biggest consideration in the design of SAX2DTM2. To make the code most
 * efficient, the incremental support is dropped in SAX2DTM2, which means that you should not
 * use it in incremental situation. To reduce the overhead of pulling data from the DTM model,
 * a few core interfaces in SAX2DTM2 have direct access to the internal arrays of the
 * SuballocatedIntVectors.
 * <p>
 * The design of SAX2DTM2 may limit its extensibilty. If you have a reason to extend the
 * SAX2DTM model, please extend from SAX2DTM instead of this class.
 * <p>
 * TODO: This class is currently only used by XSLTC. We need to investigate the possibility
 * of also using it in Xalan-J Interpretive. Xalan's performance is likely to get an instant
 * boost if we use SAX2DTM2 instead of SAX2DTM in non-incremental case.
 * <p>
 * %MK% The code in this class is critical to the XSLTC_DTM performance. Be very careful
 * when making changes here!
 */
