_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

         /**
         * Method getSchemaTypeInfo.
         * @return TypeInfo
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

     /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    public void setIdAttribute(boolean id){

     /**
     * NON-DOM: set the type of this attribute to be ID type.
     *
     * @param id
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

      /**
    * DOM Level 3
     * Returns whether this text node contains whitespace in element content,
     * often abusively called "ignorable whitespace".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

     /**
     * DOM Level 3
     * Returns all text of <code>Text</code> nodes logically-adjacent text
     * nodes to this node, concatenated in document order.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

   /**
    * DOM Level 3
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    public void setActualEncoding(String value) {

    /**
     * DOM Level 3
     * An attribute specifying the actual encoding of this document. This is
     * <code>null</code> otherwise.
     * <br> This attribute represents the property [character encoding scheme]
     * defined in .
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    public String getActualEncoding() {

     /**
     * DOM Level 3
     * An attribute specifying the actual encoding of this document. This is
     * <code>null</code> otherwise.
     * <br> This attribute represents the property [character encoding scheme]
     * defined in .
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    protected String actualEncoding;

        /**DOM Level 3 feature: Document actualEncoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

        /**
     * DOM Level 3
     * The location of the document or <code>null</code> if undefined.
     * <br>Beware that when the <code>Document</code> supports the feature
     * "HTML" , the href attribute of the HTML BASE element takes precedence
     * over this attribute.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    protected String fDocumentURI;

    /** DOM Level 3 feature: documentURI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * The configuration used when <code>Document.normalizeDocument</code> is
     * invoked.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     *  DOM Level 3
     *  Normalize document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * DOM Level 3
     * Renaming node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

     /**
     * The absolute base URI of this node or <code>null</code> if undefined.
     * This value is computed according to . However, when the
     * <code>Document</code> supports the feature "HTML" , the base URI is
     * computed using first the value of the href attribute of the HTML BASE
     * element if any, and the value of the <code>documentURI</code>
     * attribute from the <code>Document</code> interface otherwise.
     * <br> When the node is an <code>Element</code>, a <code>Document</code>
     * or a a <code>ProcessingInstruction</code>, this attribute represents
     * the properties [base URI] defined in . When the node is a
     * <code>Notation</code>, an <code>Entity</code>, or an
     * <code>EntityReference</code>, this attribute represents the
     * properties [declaration base URI] in the . How will this be affected
     * by resolution of relative namespace URIs issue?It's not.Should this
     * only be on Document, Element, ProcessingInstruction, Entity, and
     * Notation nodes, according to the infoset? If not, what is it equal to
     * on other nodes? Null? An empty string? I think it should be the
     * parent's.No.Should this be read-only and computed or and actual
     * read-write attribute?Read-only and computed (F2F 19 Jun 2000 and
     * teleconference 30 May 2001).If the base HTML element is not yet
     * attached to a document, does the insert change the Document.baseURI?
     * Yes. (F2F 26 Sep 2001)
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

     /**
     * Compares a node with this node with regard to their position in the
     * document.
     * @param other The node to compare against this node.
     * @return Returns how the given node is positioned relatively to this
     *   node.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * This attribute returns the text content of this node and its
     * descendants. When it is defined to be null, setting it has no effect.
     * When set, any possible children this node may have are removed and
     * replaced by a single <code>Text</code> node containing the string
     * this attribute is set to. On getting, no serialization is performed,
     * the returned string does not contain any markup. No whitespace
     * normalization is performed, the returned string does not contain the
     * element content whitespaces . Similarly, on setting, no parsing is
     * performed either, the input string is taken as pure textual content.
     * <br>The string returned is made of the text content of this node
     * depending on its type, as defined below:
     * <table border='1'>
     * <tr>
     * <th>Node type</th>
     * <th>Content</th>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>
     * ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE,
     * DOCUMENT_FRAGMENT_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code>
     * attribute value of every child node, excluding COMMENT_NODE and
     * PROCESSING_INSTRUCTION_NODE nodes</td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE,
     * CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * <code>nodeValue</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * null</td>
     * </tr>
     * </table>
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.
     * @exception DOMException
     *   DOMSTRING_SIZE_ERR: Raised when it would return more characters than
     *   fit in a <code>DOMString</code> variable on the implementation
     *   platform.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

      /**
     * This attribute returns the text content of this node and its
     * descendants. When it is defined to be null, setting it has no effect.
     * When set, any possible children this node may have are removed and
     * replaced by a single <code>Text</code> node containing the string
     * this attribute is set to. On getting, no serialization is performed,
     * the returned string does not contain any markup. No whitespace
     * normalization is performed, the returned string does not contain the
     * element content whitespaces . Similarly, on setting, no parsing is
     * performed either, the input string is taken as pure textual content.
     * <br>The string returned is made of the text content of this node
     * depending on its type, as defined below:
     * <table border='1'>
     * <tr>
     * <th>Node type</th>
     * <th>Content</th>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>
     * ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE,
     * DOCUMENT_FRAGMENT_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code>
     * attribute value of every child node, excluding COMMENT_NODE and
     * PROCESSING_INSTRUCTION_NODE nodes</td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE,
     * CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * <code>nodeValue</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * null</td>
     * </tr>
     * </table>
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.
     * @exception DOMException
     *   DOMSTRING_SIZE_ERR: Raised when it would return more characters than
     *   fit in a <code>DOMString</code> variable on the implementation
     *   platform.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

     /**
     * Returns whether this node is the same node as the given one.
     * <br>This method provides a way to determine whether two
     * <code>Node</code> references returned by the implementation reference
     * the same object. When two <code>Node</code> references are references
     * to the same object, even if through a proxy, the references may be
     * used completely interchangably, such that all attributes have the
     * same values and calling the same DOM method on either reference
     * always has exactly the same effect.
     * @param other The node to test against.
     * @return Returns <code>true</code> if the nodes are the same,
     *   <code>false</code> otherwise.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

      /**
     *
     * DOM Level 3
     * Look up the prefix associated to the given namespace URI, starting from this node.
     *
     * @param namespaceURI
     * @return the prefix for the namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     *  DOM Level 3
     *  This method checks if the specified <code>namespaceURI</code> is the
     *  default namespace or not.
     *  @param namespaceURI The namespace URI to look for.
     *  @return  <code>true</code> if the specified <code>namespaceURI</code>
     *   is the default namespace, <code>false</code> otherwise.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

      /**
     * DOM Level 3
     * Look up the namespace URI associated to the given prefix, starting from this node.
     * Use lookupNamespaceURI(null) to lookup the default namespace
     *
     * @param namespaceURI
     * @return th URI for the namespace
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * Tests whether two nodes are equal.
     * <br>This method tests for equality of nodes, not sameness (i.e.,
     * whether the two nodes are references to the same object) which can be
     * tested with <code>Node.isSameNode</code>. All nodes that are the same
     * will also be equal, though the reverse may not be true.
     * <br>Two nodes are equal if and only if the following conditions are
     * satisfied: The two nodes are of the same type.The following string
     * attributes are equal: <code>nodeName</code>, <code>localName</code>,
     * <code>namespaceURI</code>, <code>prefix</code>, <code>nodeValue</code>
     * , <code>baseURI</code>. This is: they are both <code>null</code>, or
     * they have the same length and are character for character identical.
     * The <code>attributes</code> <code>NamedNodeMaps</code> are equal.
     * This is: they are both <code>null</code>, or they have the same
     * length and for each node that exists in one map there is a node that
     * exists in the other map and is equal, although not necessarily at the
     * same index.The <code>childNodes</code> <code>NodeLists</code> are
     * equal. This is: they are both <code>null</code>, or they have the
     * same length and contain equal nodes at the same index. This is true
     * for <code>Attr</code> nodes as for any other type of node. Note that
     * normalization can affect equality; to avoid this, nodes should be
     * normalized before being compared.
     * <br>For two <code>DocumentType</code> nodes to be equal, the following
     * conditions must also be satisfied: The following string attributes
     * are equal: <code>publicId</code>, <code>systemId</code>,
     * <code>internalSubset</code>.The <code>entities</code>
     * <code>NamedNodeMaps</code> are equal.The <code>notations</code>
     * <code>NamedNodeMaps</code> are equal.
     * <br>On the other hand, the following do not affect equality: the
     * <code>ownerDocument</code> attribute, the <code>specified</code>
     * attribute for <code>Attr</code> nodes, the
     * <code>isWhitespaceInElementContent</code> attribute for
     * <code>Text</code> nodes, as well as any user data or event listeners
     * registered on the nodes.
     * @param arg The node to compare equality with.
     * @param deep If <code>true</code>, recursively compare the subtrees; if
     *   <code>false</code>, compare only the nodes themselves (and its
     *   attributes, if it is an <code>Element</code>).
     * @return If the nodes, and possibly subtrees are equal,
     *   <code>true</code> otherwise <code>false</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

      /**
     *  This method returns a specialized object which implements the
     * specialized APIs of the specified feature and version. The
     * specialized object may also be obtained by using binding-specific
     * casting methods but is not necessarily expected to, as discussed in Mixed DOM implementations.
     * @param feature The name of the feature requested (case-insensitive).
     * @param version  This is the version number of the feature to test. If
     *   the version is <code>null</code> or the empty string, supporting
     *   any version of the feature will cause the method to return an
     *   object that supports at least one version of the feature.
     * @return  Returns an object which implements the specialized APIs of
     *   the specified feature and version, if any, or <code>null</code> if
     *   there is no object which implements interfaces associated with that
     *   feature. If the <code>DOMObject</code> returned by this method
     *   implements the <code>Node</code> interface, it must delegate to the
     *   primary core <code>Node</code> and not return results inconsistent
     *   with the primary core <code>Node</code> such as attributes,
     *   childNodes, etc.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * Retrieves the object associated to a key on a this node. The object
     * must first have been set to this node by calling
     * <code>setUserData</code> with the same key.
     * @param key The key the object is associated to.
     * @return Returns the <code>DOMObject</code> associated to the given key
     *   on this node, or <code>null</code> if there was none.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     *  This method returns a specialized object which implements the
     * specialized APIs of the specified feature and version. The
     * specialized object may also be obtained by using binding-specific
     * casting methods but is not necessarily expected to, as discussed in Mixed DOM implementations
.
     * @param feature The name of the feature requested (case-insensitive).
     * @param version  This is the version number of the feature to test. If
     *   the version is <code>null</code> or the empty string, supporting
     *   any version of the feature will cause the method to return an
     *   object that supports at least one version of the feature.
     * @return  Returns an object which implements the specialized APIs of
     *   the specified feature and version, if any, or <code>null</code> if
     *   there is no object which implements interfaces associated with that
     *   feature. If the <code>DOMObject</code> returned by this method
     *   implements the <code>Node</code> interface, it must delegate to the
     *   primary core <code>Node</code> and not return results inconsistent
     *   with the primary core <code>Node</code> such as attributes,
     *   childNodes, etc.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /** Ask whether we support a given DOM feature.
     *
     * In fact, we do not _fully_ support any DOM feature -- we're a
     * read-only subset -- so arguably we should always return false.
     * On the other hand, it may be more practically useful to return
     * true and simply treat the whole DOM as read-only, failing on the
     * methods we can't support. I'm not sure which would be more useful
     * to the caller.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  static class DTMNodeProxyImplementation implements DOMImplementation

  /** Inner class to support getDOMImplementation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public void setVersion(String version)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the version
   * number of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC @param version
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public String getVersion()

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the version
   * number of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying whether errors checking is enforced or not.
   * When set to <code>false</code>, the implementation is free to not
   * test every possible error case normally defined on DOM operations,
   * and not raise any <code>DOMException</code>. In case of error, the
   * behavior is undefined. This attribute is <code>true</code> by
   * defaults.
   * @since DOM Level 3
   *
   * NEEDSDOC @param strictErrorChecking
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying whether errors checking is enforced or not.
   * When set to <code>false</code>, the implementation is free to not
   * test every possible error case normally defined on DOM operations,
   * and not raise any <code>DOMException</code>. In case of error, the
   * behavior is undefined. This attribute is <code>true</code> by
   * defaults.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public void setStandalone(boolean standalone)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, whether this
   * document is standalone.
   * @since DOM Level 3
   *
   * NEEDSDOC @param standalone
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public boolean getStandalone()

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, whether this
   * document is standalone.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public void setEncoding(String encoding)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the encoding
   * of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC @param encoding
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the encoding
   * of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * NEEDSDOC Method adoptNode
   *
   *
   * NEEDSDOC @param source
   *
   * NEEDSDOC (adoptNode) @return
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * Get the owner element of an attribute.
   *
   *
   * @see org.w3c.dom.Attr as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param value
   * @see org.w3c.dom.Attr
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Attr
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Attr
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Attr
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param newAttr
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param namespaceURI
   * @param localName
   *
   *
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param namespaceURI
   * @param localName
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param namespaceURI
   * @param qualifiedName
   * @param value
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param namespaceURI
   * @param localName
   *
   *
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /** @see org.w3c.dom.Element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * Introduced in DOM Level 2.
   *
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param oldAttr
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param newAttr
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param name
   *
   *
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param name
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param name
   * @param value
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param name
   *
   *
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param offset
   * @param count
   * @param arg
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param offset
   * @param count
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param offset
   * @param arg
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param arg
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param offset
   * @param count
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param data
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param offset
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Text
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param elementId
   *
   *
   * @see org.w3c.dom.Document as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  private final void traverseChildren

  /**
   *
   * @param listVector
   * @param tempNode
   * @param namespaceURI
   * @param localname
   * @param isNamespaceURIWildCard
   * @param isLocalNameWildCard
   *
   * Private method to be used for recursive iterations to obtain elements by tag name
   * and namespaceURI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

   /**
   *
   * @param namespaceURI
   * @param localName
   *
   *
   * @see org.w3c.dom.Document as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param namespaceURI
   * @param qualifiedName
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param namespaceURI
   * @param qualifiedName
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param importedNode
   * @param deep
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document as of DOM Level 2 -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  private final void traverseChildren

  /**
   *
   * @param listVector
   * @param tempNode
   * @param tagname
   * @param isTagNameWildCard
   *
   *
   * Private method to be used for recursive iterations to obtain elements by tag name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

 /**
   *
   * @param tagname
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param name
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param name
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param target
   * @param data
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param data
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param data
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param data
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param tagName
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /** This is a bit of a problem in DTM, since a DTM may be a Document
   * Fragment and hence not have a clear-cut Document Element. We can
   * make it work in the well-formed cases but would that be confusing for others?
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param deep
   *
   *
   * @see org.w3c.dom.Node -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param newChild
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Node -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param oldChild
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Node -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param newChild
   * @param oldChild
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Node -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param newChild
   * @param refChild
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Node -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * Method hasAttributeNS
   *
   *
   * @param namespaceURI
   * @param localName
   *
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * Method hasAttribute
   *
   *
   * @param name
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final Node getOwnerNode()

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param nodeValue
   *
   * @throws DOMException
   * @see org.w3c.dom.Node -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final String getStringValue() throws DOMException

  /**
   * @return The string value of the node
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /** Ask whether we support a given DOM feature.
   * In fact, we do not _fully_ support any DOM feature -- we're a
   * read-only subset -- so arguably we should always return false.
   *
   * @param feature
   * @param version
   *
   * @return false
   * @see org.w3c.dom.Node as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final boolean supports(String feature, String version)

  /** Ask whether we support a given DOM feature.
   * In fact, we do not _fully_ support any DOM feature -- we're a
   * read-only subset -- so arguably we should always return false.
   * Or we could say that we support DOM Core Level 2 but all nodes
   * are read-only. Unclear which answer is least misleading.
   *
   * NON-DOM method. This was present in early drafts of DOM Level 2,
   * but was renamed isSupported. It's present here only because it's
   * cheap, harmless, and might help some poor fool who is still trying
   * to use an early Working Draft of the DOM.
   *
   * @param feature
   * @param version
   *
   * @return false
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param prefix
   *
   * @throws DOMException
   * @see org.w3c.dom.Node as of DOM Level 2 -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * @return The prefix for this node.
   * @see org.w3c.dom.Node as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * A PI's "target" states what processor channel the PI's data
   * should be directed to. It is defined differently in HTML and XML.
   * <p>
   * In XML, a PI's "target" is the first (whitespace-delimited) token
   * following the "<?" token that begins the PI.
   * <p>
   * In HTML, target is always null.
   * <p>
   * Note that getNodeName is aliased to getTarget.
   *
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final boolean sameNodeAs(Node other)

  /**
   * FUTURE DOM: Test node identity, in lieu of Node==Node
   *
   * @param other
   *
   * @return true if the given node has the same handle as this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * Test for equality based on node number.
   *
   * @param node A DTM node proxy reference.
   *
   * @return true if the given node has the same handle as this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final boolean equals(Node node)

  /**
   * Test for equality based on node number.
   *
   * @param node A DTM node proxy reference.
   *
   * @return true if the given node has the same handle as this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final int getDTMNodeNumber()

  /**
   * NON-DOM: Return the DTM node number
   *
   * @return The DTM node handle.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final DTM getDTM()

  /**
   * NON-DOM: Return the DTM model
   *
   * @return The DTM that this proxy is a representative for.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public DTMNodeProxy(DTM dtm, int node)

  /**
   * Create a DTMNodeProxy Node representing a specific Node in a DTM
   *
   * @param dtm The DTM Reference, must be non-null.
   * @param node The DTM node handle.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  static final DOMImplementation implementation=new DTMNodeProxyImplementation();

  /** The DOMImplementation object */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  private static final String EMPTYSTRING = "";

  /** The return value as Empty String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  int node;

  /** The DTM node handle. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public DTM dtm;

  /** The DTM for this node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
public class DTMNodeProxy

/**
 * <code>DTMNodeProxy</code> presents a DOM Node API front-end to the DTM model.
 * <p>
 * It does _not_ attempt to address the "node identity" question; no effort
 * is made to prevent the creation of multiple proxies referring to a single
 * DTM node. Users can create a mechanism for managing this, or relinquish the
 * use of "==" and use the .sameNodeAs() mechanism, which is under
 * consideration for future versions of the DOM.
 * <p>
 * DTMNodeProxy may be subclassed further to present specific DOM node types.
 *
 * @see org.w3c.dom
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

         /**
         * Method getSchemaTypeInfo.
         * @return TypeInfo
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

     /**
     * DOM Level 3: register the given attribute node as an ID attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    public void setIdAttribute(boolean id){

     /**
     * NON-DOM: set the type of this attribute to be ID type.
     *
     * @param id
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

      /**
    * DOM Level 3
     * Returns whether this text node contains whitespace in element content,
     * often abusively called "ignorable whitespace".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

     /**
     * DOM Level 3
     * Returns all text of <code>Text</code> nodes logically-adjacent text
     * nodes to this node, concatenated in document order.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

   /**
    * DOM Level 3
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    public void setActualEncoding(String value) {

    /**
     * DOM Level 3
     * An attribute specifying the actual encoding of this document. This is
     * <code>null</code> otherwise.
     * <br> This attribute represents the property [character encoding scheme]
     * defined in .
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    public String getActualEncoding() {

     /**
     * DOM Level 3
     * An attribute specifying the actual encoding of this document. This is
     * <code>null</code> otherwise.
     * <br> This attribute represents the property [character encoding scheme]
     * defined in .
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    protected String actualEncoding;

        /**DOM Level 3 feature: Document actualEncoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

        /**
     * DOM Level 3
     * The location of the document or <code>null</code> if undefined.
     * <br>Beware that when the <code>Document</code> supports the feature
     * "HTML" , the href attribute of the HTML BASE element takes precedence
     * over this attribute.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    protected String fDocumentURI;

    /** DOM Level 3 feature: documentURI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * The configuration used when <code>Document.normalizeDocument</code> is
     * invoked.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     *  DOM Level 3
     *  Normalize document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * DOM Level 3
     * Renaming node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

     /**
     * The absolute base URI of this node or <code>null</code> if undefined.
     * This value is computed according to . However, when the
     * <code>Document</code> supports the feature "HTML" , the base URI is
     * computed using first the value of the href attribute of the HTML BASE
     * element if any, and the value of the <code>documentURI</code>
     * attribute from the <code>Document</code> interface otherwise.
     * <br> When the node is an <code>Element</code>, a <code>Document</code>
     * or a a <code>ProcessingInstruction</code>, this attribute represents
     * the properties [base URI] defined in . When the node is a
     * <code>Notation</code>, an <code>Entity</code>, or an
     * <code>EntityReference</code>, this attribute represents the
     * properties [declaration base URI] in the . How will this be affected
     * by resolution of relative namespace URIs issue?It's not.Should this
     * only be on Document, Element, ProcessingInstruction, Entity, and
     * Notation nodes, according to the infoset? If not, what is it equal to
     * on other nodes? Null? An empty string? I think it should be the
     * parent's.No.Should this be read-only and computed or and actual
     * read-write attribute?Read-only and computed (F2F 19 Jun 2000 and
     * teleconference 30 May 2001).If the base HTML element is not yet
     * attached to a document, does the insert change the Document.baseURI?
     * Yes. (F2F 26 Sep 2001)
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

     /**
     * Compares a node with this node with regard to their position in the
     * document.
     * @param other The node to compare against this node.
     * @return Returns how the given node is positioned relatively to this
     *   node.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * This attribute returns the text content of this node and its
     * descendants. When it is defined to be null, setting it has no effect.
     * When set, any possible children this node may have are removed and
     * replaced by a single <code>Text</code> node containing the string
     * this attribute is set to. On getting, no serialization is performed,
     * the returned string does not contain any markup. No whitespace
     * normalization is performed, the returned string does not contain the
     * element content whitespaces . Similarly, on setting, no parsing is
     * performed either, the input string is taken as pure textual content.
     * <br>The string returned is made of the text content of this node
     * depending on its type, as defined below:
     * <table border='1'>
     * <tr>
     * <th>Node type</th>
     * <th>Content</th>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>
     * ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE,
     * DOCUMENT_FRAGMENT_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code>
     * attribute value of every child node, excluding COMMENT_NODE and
     * PROCESSING_INSTRUCTION_NODE nodes</td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE,
     * CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * <code>nodeValue</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * null</td>
     * </tr>
     * </table>
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.
     * @exception DOMException
     *   DOMSTRING_SIZE_ERR: Raised when it would return more characters than
     *   fit in a <code>DOMString</code> variable on the implementation
     *   platform.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

      /**
     * This attribute returns the text content of this node and its
     * descendants. When it is defined to be null, setting it has no effect.
     * When set, any possible children this node may have are removed and
     * replaced by a single <code>Text</code> node containing the string
     * this attribute is set to. On getting, no serialization is performed,
     * the returned string does not contain any markup. No whitespace
     * normalization is performed, the returned string does not contain the
     * element content whitespaces . Similarly, on setting, no parsing is
     * performed either, the input string is taken as pure textual content.
     * <br>The string returned is made of the text content of this node
     * depending on its type, as defined below:
     * <table border='1'>
     * <tr>
     * <th>Node type</th>
     * <th>Content</th>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>
     * ELEMENT_NODE, ENTITY_NODE, ENTITY_REFERENCE_NODE,
     * DOCUMENT_FRAGMENT_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>concatenation of the <code>textContent</code>
     * attribute value of every child node, excluding COMMENT_NODE and
     * PROCESSING_INSTRUCTION_NODE nodes</td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>ATTRIBUTE_NODE, TEXT_NODE,
     * CDATA_SECTION_NODE, COMMENT_NODE, PROCESSING_INSTRUCTION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * <code>nodeValue</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>DOCUMENT_NODE, DOCUMENT_TYPE_NODE, NOTATION_NODE</td>
     * <td valign='top' rowspan='1' colspan='1'>
     * null</td>
     * </tr>
     * </table>
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.
     * @exception DOMException
     *   DOMSTRING_SIZE_ERR: Raised when it would return more characters than
     *   fit in a <code>DOMString</code> variable on the implementation
     *   platform.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

     /**
     * Returns whether this node is the same node as the given one.
     * <br>This method provides a way to determine whether two
     * <code>Node</code> references returned by the implementation reference
     * the same object. When two <code>Node</code> references are references
     * to the same object, even if through a proxy, the references may be
     * used completely interchangably, such that all attributes have the
     * same values and calling the same DOM method on either reference
     * always has exactly the same effect.
     * @param other The node to test against.
     * @return Returns <code>true</code> if the nodes are the same,
     *   <code>false</code> otherwise.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

      /**
     *
     * DOM Level 3
     * Look up the prefix associated to the given namespace URI, starting from this node.
     *
     * @param namespaceURI
     * @return the prefix for the namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     *  DOM Level 3
     *  This method checks if the specified <code>namespaceURI</code> is the
     *  default namespace or not.
     *  @param namespaceURI The namespace URI to look for.
     *  @return  <code>true</code> if the specified <code>namespaceURI</code>
     *   is the default namespace, <code>false</code> otherwise.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

      /**
     * DOM Level 3
     * Look up the namespace URI associated to the given prefix, starting from this node.
     * Use lookupNamespaceURI(null) to lookup the default namespace
     *
     * @param namespaceURI
     * @return th URI for the namespace
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * Tests whether two nodes are equal.
     * <br>This method tests for equality of nodes, not sameness (i.e.,
     * whether the two nodes are references to the same object) which can be
     * tested with <code>Node.isSameNode</code>. All nodes that are the same
     * will also be equal, though the reverse may not be true.
     * <br>Two nodes are equal if and only if the following conditions are
     * satisfied: The two nodes are of the same type.The following string
     * attributes are equal: <code>nodeName</code>, <code>localName</code>,
     * <code>namespaceURI</code>, <code>prefix</code>, <code>nodeValue</code>
     * , <code>baseURI</code>. This is: they are both <code>null</code>, or
     * they have the same length and are character for character identical.
     * The <code>attributes</code> <code>NamedNodeMaps</code> are equal.
     * This is: they are both <code>null</code>, or they have the same
     * length and for each node that exists in one map there is a node that
     * exists in the other map and is equal, although not necessarily at the
     * same index.The <code>childNodes</code> <code>NodeLists</code> are
     * equal. This is: they are both <code>null</code>, or they have the
     * same length and contain equal nodes at the same index. This is true
     * for <code>Attr</code> nodes as for any other type of node. Note that
     * normalization can affect equality; to avoid this, nodes should be
     * normalized before being compared.
     * <br>For two <code>DocumentType</code> nodes to be equal, the following
     * conditions must also be satisfied: The following string attributes
     * are equal: <code>publicId</code>, <code>systemId</code>,
     * <code>internalSubset</code>.The <code>entities</code>
     * <code>NamedNodeMaps</code> are equal.The <code>notations</code>
     * <code>NamedNodeMaps</code> are equal.
     * <br>On the other hand, the following do not affect equality: the
     * <code>ownerDocument</code> attribute, the <code>specified</code>
     * attribute for <code>Attr</code> nodes, the
     * <code>isWhitespaceInElementContent</code> attribute for
     * <code>Text</code> nodes, as well as any user data or event listeners
     * registered on the nodes.
     * @param arg The node to compare equality with.
     * @param deep If <code>true</code>, recursively compare the subtrees; if
     *   <code>false</code>, compare only the nodes themselves (and its
     *   attributes, if it is an <code>Element</code>).
     * @return If the nodes, and possibly subtrees are equal,
     *   <code>true</code> otherwise <code>false</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

      /**
     *  This method returns a specialized object which implements the
     * specialized APIs of the specified feature and version. The
     * specialized object may also be obtained by using binding-specific
     * casting methods but is not necessarily expected to, as discussed in Mixed DOM implementations.
     * @param feature The name of the feature requested (case-insensitive).
     * @param version  This is the version number of the feature to test. If
     *   the version is <code>null</code> or the empty string, supporting
     *   any version of the feature will cause the method to return an
     *   object that supports at least one version of the feature.
     * @return  Returns an object which implements the specialized APIs of
     *   the specified feature and version, if any, or <code>null</code> if
     *   there is no object which implements interfaces associated with that
     *   feature. If the <code>DOMObject</code> returned by this method
     *   implements the <code>Node</code> interface, it must delegate to the
     *   primary core <code>Node</code> and not return results inconsistent
     *   with the primary core <code>Node</code> such as attributes,
     *   childNodes, etc.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     * Retrieves the object associated to a key on a this node. The object
     * must first have been set to this node by calling
     * <code>setUserData</code> with the same key.
     * @param key The key the object is associated to.
     * @return Returns the <code>DOMObject</code> associated to the given key
     *   on this node, or <code>null</code> if there was none.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /**
     *  This method returns a specialized object which implements the
     * specialized APIs of the specified feature and version. The
     * specialized object may also be obtained by using binding-specific
     * casting methods but is not necessarily expected to, as discussed in Mixed DOM implementations
.
     * @param feature The name of the feature requested (case-insensitive).
     * @param version  This is the version number of the feature to test. If
     *   the version is <code>null</code> or the empty string, supporting
     *   any version of the feature will cause the method to return an
     *   object that supports at least one version of the feature.
     * @return  Returns an object which implements the specialized APIs of
     *   the specified feature and version, if any, or <code>null</code> if
     *   there is no object which implements interfaces associated with that
     *   feature. If the <code>DOMObject</code> returned by this method
     *   implements the <code>Node</code> interface, it must delegate to the
     *   primary core <code>Node</code> and not return results inconsistent
     *   with the primary core <code>Node</code> such as attributes,
     *   childNodes, etc.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
    @Override

    /** Ask whether we support a given DOM feature.
     *
     * In fact, we do not _fully_ support any DOM feature -- we're a
     * read-only subset -- so arguably we should always return false.
     * On the other hand, it may be more practically useful to return
     * true and simply treat the whole DOM as read-only, failing on the
     * methods we can't support. I'm not sure which would be more useful
     * to the caller.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  static class DTMNodeProxyImplementation implements DOMImplementation

  /** Inner class to support getDOMImplementation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public void setVersion(String version)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the version
   * number of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC @param version
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public String getVersion()

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the version
   * number of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying whether errors checking is enforced or not.
   * When set to <code>false</code>, the implementation is free to not
   * test every possible error case normally defined on DOM operations,
   * and not raise any <code>DOMException</code>. In case of error, the
   * behavior is undefined. This attribute is <code>true</code> by
   * defaults.
   * @since DOM Level 3
   *
   * NEEDSDOC @param strictErrorChecking
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying whether errors checking is enforced or not.
   * When set to <code>false</code>, the implementation is free to not
   * test every possible error case normally defined on DOM operations,
   * and not raise any <code>DOMException</code>. In case of error, the
   * behavior is undefined. This attribute is <code>true</code> by
   * defaults.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public void setStandalone(boolean standalone)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, whether this
   * document is standalone.
   * @since DOM Level 3
   *
   * NEEDSDOC @param standalone
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public boolean getStandalone()

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, whether this
   * document is standalone.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public void setEncoding(String encoding)

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the encoding
   * of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC @param encoding
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * <p>EXPERIMENTAL! Based on the <a
   * href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010605'>Document
   * Object Model (DOM) Level 3 Core Working Draft of 5 June 2001.</a>.
   * <p>
   * An attribute specifying, as part of the XML declaration, the encoding
   * of this document. This is <code>null</code> when unspecified.
   * @since DOM Level 3
   *
   * NEEDSDOC ($objectName$) @return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * NEEDSDOC Method adoptNode
   *
   *
   * NEEDSDOC @param source
   *
   * NEEDSDOC (adoptNode) @return
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * Get the owner element of an attribute.
   *
   *
   * @see org.w3c.dom.Attr as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param value
   * @see org.w3c.dom.Attr
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Attr
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Attr
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Attr
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param newAttr
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param namespaceURI
   * @param localName
   *
   *
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param namespaceURI
   * @param localName
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param namespaceURI
   * @param qualifiedName
   * @param value
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param namespaceURI
   * @param localName
   *
   *
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /** @see org.w3c.dom.Element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * Introduced in DOM Level 2.
   *
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param oldAttr
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param newAttr
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param name
   *
   *
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param name
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param name
   * @param value
   *
   * @throws DOMException
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param name
   *
   *
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param offset
   * @param count
   * @param arg
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param offset
   * @param count
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param offset
   * @param arg
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param arg
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param offset
   * @param count
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param data
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.CharacterData
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param offset
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Text
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param elementId
   *
   *
   * @see org.w3c.dom.Document as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  private final void traverseChildren

  /**
   *
   * @param listVector
   * @param tempNode
   * @param namespaceURI
   * @param localname
   * @param isNamespaceURIWildCard
   * @param isLocalNameWildCard
   *
   * Private method to be used for recursive iterations to obtain elements by tag name
   * and namespaceURI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

   /**
   *
   * @param namespaceURI
   * @param localName
   *
   *
   * @see org.w3c.dom.Document as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param namespaceURI
   * @param qualifiedName
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param namespaceURI
   * @param qualifiedName
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param importedNode
   * @param deep
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document as of DOM Level 2 -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  private final void traverseChildren

  /**
   *
   * @param listVector
   * @param tempNode
   * @param tagname
   * @param isTagNameWildCard
   *
   *
   * Private method to be used for recursive iterations to obtain elements by tag name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

 /**
   *
   * @param tagname
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param name
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param name
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param target
   * @param data
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param data
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param data
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param data
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param tagName
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /** This is a bit of a problem in DTM, since a DTM may be a Document
   * Fragment and hence not have a clear-cut Document Element. We can
   * make it work in the well-formed cases but would that be confusing for others?
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Document
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param deep
   *
   *
   * @see org.w3c.dom.Node -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param newChild
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Node -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param oldChild
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Node -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param newChild
   * @param oldChild
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Node -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param newChild
   * @param refChild
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Node -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * Method hasAttributeNS
   *
   *
   * @param namespaceURI
   * @param localName
   *
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * Method hasAttribute
   *
   *
   * @param name
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final Node getOwnerNode()

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param nodeValue
   *
   * @throws DOMException
   * @see org.w3c.dom.Node -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final String getStringValue() throws DOMException

  /**
   * @return The string value of the node
   *
   * @throws DOMException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   *
   * @throws DOMException
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /** Ask whether we support a given DOM feature.
   * In fact, we do not _fully_ support any DOM feature -- we're a
   * read-only subset -- so arguably we should always return false.
   *
   * @param feature
   * @param version
   *
   * @return false
   * @see org.w3c.dom.Node as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final boolean supports(String feature, String version)

  /** Ask whether we support a given DOM feature.
   * In fact, we do not _fully_ support any DOM feature -- we're a
   * read-only subset -- so arguably we should always return false.
   * Or we could say that we support DOM Core Level 2 but all nodes
   * are read-only. Unclear which answer is least misleading.
   *
   * NON-DOM method. This was present in early drafts of DOM Level 2,
   * but was renamed isSupported. It's present here only because it's
   * cheap, harmless, and might help some poor fool who is still trying
   * to use an early Working Draft of the DOM.
   *
   * @param feature
   * @param version
   *
   * @return false
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   * @param prefix
   *
   * @throws DOMException
   * @see org.w3c.dom.Node as of DOM Level 2 -- DTMNodeProxy is read-only
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * @return The prefix for this node.
   * @see org.w3c.dom.Node as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node as of DOM Level 2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * A PI's "target" states what processor channel the PI's data
   * should be directed to. It is defined differently in HTML and XML.
   * <p>
   * In XML, a PI's "target" is the first (whitespace-delimited) token
   * following the "<?" token that begins the PI.
   * <p>
   * In HTML, target is always null.
   * <p>
   * Note that getNodeName is aliased to getTarget.
   *
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   *
   *
   * @see org.w3c.dom.Node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final boolean sameNodeAs(Node other)

  /**
   * FUTURE DOM: Test node identity, in lieu of Node==Node
   *
   * @param other
   *
   * @return true if the given node has the same handle as this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  @Override

  /**
   * Test for equality based on node number.
   *
   * @param node A DTM node proxy reference.
   *
   * @return true if the given node has the same handle as this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final boolean equals(Node node)

  /**
   * Test for equality based on node number.
   *
   * @param node A DTM node proxy reference.
   *
   * @return true if the given node has the same handle as this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final int getDTMNodeNumber()

  /**
   * NON-DOM: Return the DTM node number
   *
   * @return The DTM node handle.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public final DTM getDTM()

  /**
   * NON-DOM: Return the DTM model
   *
   * @return The DTM that this proxy is a representative for.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public DTMNodeProxy(DTM dtm, int node)

  /**
   * Create a DTMNodeProxy Node representing a specific Node in a DTM
   *
   * @param dtm The DTM Reference, must be non-null.
   * @param node The DTM node handle.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  static final DOMImplementation implementation=new DTMNodeProxyImplementation();

  /** The DOMImplementation object */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  private static final String EMPTYSTRING = "";

  /** The return value as Empty String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  int node;

  /** The DTM node handle. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
  public DTM dtm;

  /** The DTM for this node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMNodeProxy.java
public class DTMNodeProxy

/**
 * <code>DTMNodeProxy</code> presents a DOM Node API front-end to the DTM model.
 * <p>
 * It does _not_ attempt to address the "node identity" question; no effort
 * is made to prevent the creation of multiple proxies referring to a single
 * DTM node. Users can create a mechanism for managing this, or relinquish the
 * use of "==" and use the .sameNodeAs() mechanism, which is under
 * consideration for future versions of the DOM.
 * <p>
 * DTMNodeProxy may be subclassed further to present specific DOM node types.
 *
 * @see org.w3c.dom
 */
