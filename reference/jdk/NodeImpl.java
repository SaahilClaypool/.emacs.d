_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /** Serialize object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String toString() {

    /** NON-DOM method for debugging convenience. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    protected Node getContainer() {

    /**
     * For non-child nodes, the node which "points" to this node.
     * For example, the owning element for an attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    protected void synchronizeData() {

    /**
     * Override this method in subclass to hook in efficient
     * internal data structure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    protected int changes() {

    /**
     * Returns the number of changes to this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    protected void changed() {

    /**
     * Denotes that this node has changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Object getUserData() {

    /**
     * NON-DOM:
     * Returns the user data associated to this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public void setUserData(Object data) {

    /**
     * NON-DOM: As an alternative to subclassing the DOM, this implementation
     * has been extended with the ability to attach an object to each node.
     * (If you need multiple objects, you can attach a collection such as a
     * List or Map, then attach your application information to that.)
     * <p><b>Important Note:</b> You are responsible for removing references
     * to your data on nodes that are no longer used. Failure to do so will
     * prevent the nodes, your data is attached to, to be garbage collected
     * until the whole document is.
     *
     * @param data the object to store or null to remove any existing reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean getReadOnly() {

    /**
     * NON-DOM: Returns true if this node is read-only. This is a
     * shallow check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public void setReadOnly(boolean readOnly, boolean deep) {

    /**
     * NON-DOM: PR-DOM-Level-1-19980818 mentions readonly nodes in conjunction
     * with Entities, but provides no API to support this.
     * <P>
     * Most DOM users should not touch this method. Its anticpated use
     * is during construction of EntityRefernces, where it will be used to
     * lock the contents replicated from Entity so they can't be casually
     * altered. It _could_ be published as a DOM extension, if desired.
     * <P>
     * Note: since we never have any children deep is meaningless here,
     * ParentNode overrides this behavior.
     * @see ParentNode
     *
     * @param readOnly True or false as desired.
     * @param deep If true, children are also toggled. Note that this will
     *  not change the state of an EntityReference or its children,
     *  which are always read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Object getUserData(String key) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Object setUserData(String key,
                              Object data,
                              UserDataHandler handler) {

    /**
     * Associate an object to a key on this node. The object can later be
     * retrieved from this node by calling <code>getUserData</code> with the
     * same key.
     * @param key The key to associate the object to.
     * @param data The object to associate to the given key, or
     *   <code>null</code> to remove any existing association to that key.
     * @param handler The handler to associate to that key, or
     *   <code>null</code>.
     * @return Returns the <code>DOMObject</code> previously associated to
     *   the given key on this node, or <code>null</code> if there was none.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Object getFeature(String feature, String version) {

    /**
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean isEqualNode(Node arg) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String lookupNamespaceURI(String specifiedPrefix) {

    /**
     * DOM Level 3 - Experimental:
     * Look up the namespace URI associated to the given prefix, starting from this node.
     * Use lookupNamespaceURI(null) to lookup the default namespace
     *
     * @param namespaceURI
     * @return th URI for the namespace
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String lookupPrefix(String namespaceURI){

    /**
     *
     * DOM Level 3 - Experimental:
     * Look up the prefix associated to the given namespace URI, starting from this node.
     *
     * @param namespaceURI
     * @return the prefix for the namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean isDefaultNamespace(String namespaceURI){

    /**
     *  DOM Level 3: Experimental
     *  This method checks if the specified <code>namespaceURI</code> is the
     *  default namespace or not.
     *  @param namespaceURI The namespace URI to look for.
     *  @return  <code>true</code> if the specified <code>namespaceURI</code>
     *   is the default namespace, <code>false</code> otherwise.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean isSameNode(Node other) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public void setTextContent(String textContent)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String getTextContent() throws DOMException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public short compareDocumentPosition(Node other) throws DOMException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public short compareTreePosition(Node other) {

    /**
     * Compares a node with this node with regard to their position in the
     * tree and according to the document order. This order can be extended
     * by module that define additional types of nodes.
     * @param other The node to compare against this node.
     * @return Returns how the given node is positioned relatively to this
     *   node.
     * @since DOM Level 3
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String getBaseURI() {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String             getLocalName()

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Returns the local part of the qualified name of this node.
     * For nodes created with a DOM Level 1 method, such as createElement
     * from the Document interface, and for nodes of any type other than
     * ELEMENT_NODE and ATTRIBUTE_NODE this is the same as the nodeName
     * attribute.
     * @since WD-DOM-Level-2-19990923
     * @see AttrNSImpl
     * @see ElementNSImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public void setPrefix(String prefix)

    /**
     *  Introduced in DOM Level 2. <p>
     *
     *  The namespace prefix of this node, or null if it is unspecified. When
     *  this node is of any type other than ELEMENT_NODE and ATTRIBUTE_NODE
     *  this is always null and setting it has no effect.<p>
     *
     *  For nodes created with a DOM Level 1 method, such as createElement from
     *  the Document interface, this is null.<p>
     *
     *  Note that setting this attribute changes the nodeName attribute, which
     *  holds the qualified name, as well as the tagName and name attributes of
     *  the Element and Attr interfaces, when applicable.<p>
     *
     * @throws INVALID_CHARACTER_ERR Raised if the specified
     *  prefix contains an invalid character.
     *
     * @since WD-DOM-Level-2-19990923
     * @see AttrNSImpl
     * @see ElementNSImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String getPrefix()

    /**
     * Introduced in DOM Level 2. <p>
     *
     * The namespace prefix of this node, or null if it is unspecified. When
     * this node is of any type other than ELEMENT_NODE and ATTRIBUTE_NODE this
     * is always null and setting it has no effect.<p>
     *
     * For nodes created with a DOM Level 1 method, such as createElement
     * from the Document interface, this is null. <p>
     *
     * @since WD-DOM-Level-2-19990923
     * @see AttrNSImpl
     * @see ElementNSImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String getNamespaceURI()

    /**
     * Introduced in DOM Level 2. <p>
     *
     * The namespace URI of this node, or null if it is unspecified. When this
     * node is of any type other than ELEMENT_NODE and ATTRIBUTE_NODE, this is
     * always null and setting it has no effect. <p>
     *
     * This is not a computed value that is the result of a namespace lookup
     * based on an examination of the namespace declarations in scope. It is
     * merely the namespace URI given at creation time.<p>
     *
     * For nodes created with a DOM Level 1 method, such as createElement
     * from the Document interface, this is null.
     * @since WD-DOM-Level-2-19990923
     * @see AttrNSImpl
     * @see ElementNSImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean isSupported(String feature, String version)

    /**
     * Introduced in DOM Level 2. <p>
     * Tests whether the DOM implementation implements a specific feature and
     * that feature is supported by this node.
     * @param feature The package name of the feature to test. This is the same
     * name as what can be passed to the method hasFeature on
     * DOMImplementation.
     * @param version This is the version number of the package name to
     * test. In Level 2, version 1, this is the string "2.0". If the version is
     * not specified, supporting any version of the feature will cause the
     * method to return true.
     * @return boolean Returns true if this node defines a subtree within which
     * the specified feature is supported, false otherwise.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public void normalize() {

    /**
     * Puts all <code>Text</code> nodes in the full depth of the sub-tree
     * underneath this <code>Node</code>, including attribute nodes, into a
     * "normal" form where only markup (e.g., tags, comments, processing
     * instructions, CDATA sections, and entity references) separates
     * <code>Text</code> nodes, i.e., there are no adjacent <code>Text</code>
     * nodes.  This can be used to ensure that the DOM view of a document is
     * the same as if it were saved and re-loaded, and is useful when
     * operations (such as XPointer lookups) that depend on a particular
     * document tree structure are to be used.In cases where the document
     * contains <code>CDATASections</code>, the normalize operation alone may
     * not be sufficient, since XPointers do not differentiate between
     * <code>Text</code> nodes and <code>CDATASection</code> nodes.
     * <p>
     * Note that this implementation simply calls normalize() on this Node's
     * children. It is up to implementors or Node to override normalize()
     * to take action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node item(int index) {

    /**
     * NodeList method: Return the Nth immediate child of this node, or
     * null if the index is out of bounds.
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     *
     * @return org.w3c.dom.Node
     * @param Index int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public int getLength() {

    /**
     * NodeList method: Count the immediate children of this node
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     *
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node replaceChild(Node newChild, Node oldChild)

    /**
     * Make newChild occupy the location that oldChild used to
     * have. Note that newChild will first be removed from its previous
     * parent, if any. Equivalent to inserting newChild before oldChild,
     * then removing oldChild.
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     *
     * @return oldChild, in its new state (removed).
     *
     * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a
     * type that shouldn't be a child of this node, or if newChild is
     * one of our ancestors.
     *
     * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a
     * different owner document than we do.
     *
     * @throws DOMException(NOT_FOUND_ERR) if oldChild is not a child of
     * this node.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is
     * read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node removeChild(Node oldChild)

    /**
     * Remove a child from this Node. The removed child's subtree
     * remains intact so it may be re-inserted elsewhere.
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     *
     * @return oldChild, in its new state (removed).
     *
     * @throws DOMException(NOT_FOUND_ERR) if oldChild is not a child of
     * this node.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is
     * read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node insertBefore(Node newChild, Node refChild)

    /**
     * Move one or more node(s) to our list of children. Note that this
     * implicitly removes them from their previous parent.
     * <P>
     * By default we do not accept any children, ParentNode overrides this.
     * @see ParentNode
     *
     * @param newChild The Node to be moved to our subtree. As a
     * convenience feature, inserting a DocumentNode will instead insert
     * all its children.
     *
     * @param refChild Current child which newChild should be placed
     * immediately before. If refChild is null, the insertion occurs
     * after all existing Nodes, like appendChild().
     *
     * @return newChild, in its new state (relocated, or emptied in the case of
     * DocumentNode.)
     *
     * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a
     * type that shouldn't be a child of this node, or if newChild is an
     * ancestor of this node.
     *
     * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a
     * different owner document than we do.
     *
     * @throws DOMException(NOT_FOUND_ERR) if refChild is not a child of
     * this node.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is
     * read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node getLastChild() {

    /** The first child of this Node, or null if none.
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node getFirstChild() {

    /** The first child of this Node, or null if none.
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public NodeList getChildNodes() {

    /**
     * Obtain a NodeList enumerating all children of this node. If there
     * are none, an (initially) empty NodeList is returned.
     * <p>
     * NodeLists are "live"; as children are added/removed the NodeList
     * will immediately reflect those changes. Also, the NodeList refers
     * to the actual nodes, so changes to those nodes made via the DOM tree
     * will be reflected in the NodeList and vice versa.
     * <p>
     * In this implementation, Nodes implement the NodeList interface and
     * provide their own getChildNodes() support. Other DOMs may solve this
     * differently.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean hasChildNodes() {

    /**
     * Test whether this node has any children. Convenience shorthand
     * for (Node.getFirstChild()!=null)
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean hasAttributes() {

    /**
     *  Returns whether this node (if it is an element) has any attributes.
     * @return <code>true</code> if this node has any attributes,
     *   <code>false</code> otherwise.
     * @since DOM Level 2
     * @see ElementImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public NamedNodeMap getAttributes() {

    /**
     * Return the collection of attributes associated with this node,
     * or null if none. At this writing, Element is the only type of node
     * which will ever have attributes.
     *
     * @see ElementImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node getPreviousSibling() {

    /** The previous child of this node's parent, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node getNextSibling() {

    /** The next child of this node's parent, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node getParentNode() {

    /**
     * Obtain the DOM-tree parent of this node, or null if it is not
     * currently active in the DOM tree (perhaps because it has just been
     * created or removed). Note that Document, DocumentFragment, and
     * Attribute will never have parents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    protected int getNodeNumber() {

    /**
     * Returns the node number
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    void setOwnerDocument(CoreDocumentImpl doc) {

    /**
     * NON-DOM
     * set the ownerDocument of this node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    CoreDocumentImpl ownerDocument() {

    /**
     * same as above but returns internal type and this one is not overridden
     * by CoreDocumentImpl to return null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Document getOwnerDocument() {

    /**
     * Find the Document that this Node belongs to (the document in
     * whose context the Node was created). The Node may or may not
     * currently be part of that Document's actual contents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node cloneNode(boolean deep) {

    /**
     * Returns a duplicate of a given node. You can consider this a
     * generic "copy constructor" for nodes. The newly returned object should
     * be completely independent of the source object's subtree, so changes
     * in one after the clone has been made will not affect the other.
     * <P>
     * Note: since we never have any children deep is meaningless here,
     * ParentNode overrides this behavior.
     * @see ParentNode
     *
     * <p>
     * Example: Cloning a Text node will copy both the node and the text it
     * contains.
     * <p>
     * Example: Cloning something that has children -- Element or Attr, for
     * example -- will _not_ clone those children unless a "deep clone"
     * has been requested. A shallow clone of an Attr node will yield an
     * empty Attr of the same name.
     * <p>
     * NOTE: Clones will always be read/write, even if the node being cloned
     * is read-only, to permit applications using only the DOM API to obtain
     * editable copies of locked portions of the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node appendChild(Node newChild) throws DOMException {

    /**
     * Adds a child node to the end of the list of children for this node.
     * Convenience shorthand for insertBefore(newChild,null).
     * @see #insertBefore(Node, Node)
     * <P>
     * By default we do not accept any children, ParentNode overrides this.
     * @see ParentNode
     *
     * @return newChild, in its new state (relocated, or emptied in the case of
     * DocumentNode.)
     *
     * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a
     * type that shouldn't be a child of this node.
     *
     * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a
     * different owner document than we do.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is
     * read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public void setNodeValue(String x)

    /**
     * Sets the node value.
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String getNodeValue()

    /**
     * Returns the node value.
     * @throws DOMException(DOMSTRING_SIZE_ERR)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public abstract String getNodeName();

    /**
     * the name of this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public abstract short getNodeType();

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public NodeImpl() {}

    /** Constructor for serialization. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    protected NodeImpl(CoreDocumentImpl ownerDocument) {

    /**
     * No public constructor; only subclasses of Node should be
     * instantiated, and those normally via a Document's factory methods
     * <p>
     * Every Node knows what Document it belongs to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public static final short ELEMENT_DEFINITION_NODE = 21;

    /** Element definition node type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    static final long serialVersionUID = -6316591992167219696L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public static final short TREE_POSITION_DISCONNECTED = 0x00;

    /**
     * The two nodes are disconnected, they do not have any common ancestor.
     * This is the case of two nodes that are not in the same document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public static final short TREE_POSITION_EQUIVALENT  = 0x10;

    /**
     * The two nodes have an equivalent position. This is the case of two
     * attributes that have the same <code>ownerElement</code>, and two
     * nodes that are the same.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public static final short TREE_POSITION_ANCESTOR    = 0x04;

    /**
     * The node is an ancestor of the reference node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public static final short TREE_POSITION_PRECEDING   = 0x01;

    /**
     * The node precedes the reference node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
public abstract class NodeImpl

/**
 * NodeImpl provides the basic structure of a DOM tree. It is never used
 * directly, but instead is subclassed to add type and data
 * information, and additional methods, appropriate to each node of
 * the tree. Only its subclasses should be instantiated -- and those,
 * with the exception of Document itself, only through a specific
 * Document's factory methods.
 * <P>
 * The Node interface provides shared behaviors such as siblings and
 * children, both for consistancy and so that the most common tree
 * operations may be performed without constantly having to downcast
 * to specific node types. When there is no obvious mapping for one of
 * these queries, it will respond with null.
 * Note that the default behavior is that children are forbidden. To
 * permit them, the subclass ParentNode overrides several methods.
 * <P>
 * NodeImpl also implements NodeList, so it can return itself in
 * response to the getChildNodes() query. This eliminiates the need
 * for a separate ChildNodeList object. Note that this is an
 * IMPLEMENTATION DETAIL; applications should _never_ assume that
 * this identity exists.
 * <P>
 * All nodes in a single document must originate
 * in that document. (Note that this is much tighter than "must be
 * same implementation") Nodes are all aware of their ownerDocument,
 * and attempts to mismatch will throw WRONG_DOCUMENT_ERR.
 * <P>
 * However, to save memory not all nodes always have a direct reference
 * to their ownerDocument. When a node is owned by another node it relies
 * on its owner to store its ownerDocument. Parent nodes always store it
 * though, so there is never more than one level of indirection.
 * And when a node doesn't have an owner, ownerNode refers to its
 * ownerDocument.
 * <p>
 * This class doesn't directly support mutation events, however, it still
 * implements the EventTarget interface and forward all related calls to the
 * document so that the document class do so.
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/NodeImpl.java
public class NodeImpl extends DefaultNode {

/**
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /** Serialize object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String toString() {

    /** NON-DOM method for debugging convenience. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    protected Node getContainer() {

    /**
     * For non-child nodes, the node which "points" to this node.
     * For example, the owning element for an attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    protected void synchronizeData() {

    /**
     * Override this method in subclass to hook in efficient
     * internal data structure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    protected int changes() {

    /**
     * Returns the number of changes to this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    protected void changed() {

    /**
     * Denotes that this node has changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Object getUserData() {

    /**
     * NON-DOM:
     * Returns the user data associated to this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public void setUserData(Object data) {

    /**
     * NON-DOM: As an alternative to subclassing the DOM, this implementation
     * has been extended with the ability to attach an object to each node.
     * (If you need multiple objects, you can attach a collection such as a
     * List or Map, then attach your application information to that.)
     * <p><b>Important Note:</b> You are responsible for removing references
     * to your data on nodes that are no longer used. Failure to do so will
     * prevent the nodes, your data is attached to, to be garbage collected
     * until the whole document is.
     *
     * @param data the object to store or null to remove any existing reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean getReadOnly() {

    /**
     * NON-DOM: Returns true if this node is read-only. This is a
     * shallow check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public void setReadOnly(boolean readOnly, boolean deep) {

    /**
     * NON-DOM: PR-DOM-Level-1-19980818 mentions readonly nodes in conjunction
     * with Entities, but provides no API to support this.
     * <P>
     * Most DOM users should not touch this method. Its anticpated use
     * is during construction of EntityRefernces, where it will be used to
     * lock the contents replicated from Entity so they can't be casually
     * altered. It _could_ be published as a DOM extension, if desired.
     * <P>
     * Note: since we never have any children deep is meaningless here,
     * ParentNode overrides this behavior.
     * @see ParentNode
     *
     * @param readOnly True or false as desired.
     * @param deep If true, children are also toggled. Note that this will
     *  not change the state of an EntityReference or its children,
     *  which are always read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Object getUserData(String key) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Object setUserData(String key,
                              Object data,
                              UserDataHandler handler) {

    /**
     * Associate an object to a key on this node. The object can later be
     * retrieved from this node by calling <code>getUserData</code> with the
     * same key.
     * @param key The key to associate the object to.
     * @param data The object to associate to the given key, or
     *   <code>null</code> to remove any existing association to that key.
     * @param handler The handler to associate to that key, or
     *   <code>null</code>.
     * @return Returns the <code>DOMObject</code> previously associated to
     *   the given key on this node, or <code>null</code> if there was none.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Object getFeature(String feature, String version) {

    /**
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean isEqualNode(Node arg) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String lookupNamespaceURI(String specifiedPrefix) {

    /**
     * DOM Level 3 - Experimental:
     * Look up the namespace URI associated to the given prefix, starting from this node.
     * Use lookupNamespaceURI(null) to lookup the default namespace
     *
     * @param namespaceURI
     * @return th URI for the namespace
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String lookupPrefix(String namespaceURI){

    /**
     *
     * DOM Level 3 - Experimental:
     * Look up the prefix associated to the given namespace URI, starting from this node.
     *
     * @param namespaceURI
     * @return the prefix for the namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean isDefaultNamespace(String namespaceURI){

    /**
     *  DOM Level 3: Experimental
     *  This method checks if the specified <code>namespaceURI</code> is the
     *  default namespace or not.
     *  @param namespaceURI The namespace URI to look for.
     *  @return  <code>true</code> if the specified <code>namespaceURI</code>
     *   is the default namespace, <code>false</code> otherwise.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean isSameNode(Node other) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public void setTextContent(String textContent)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String getTextContent() throws DOMException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public short compareDocumentPosition(Node other) throws DOMException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public short compareTreePosition(Node other) {

    /**
     * Compares a node with this node with regard to their position in the
     * tree and according to the document order. This order can be extended
     * by module that define additional types of nodes.
     * @param other The node to compare against this node.
     * @return Returns how the given node is positioned relatively to this
     *   node.
     * @since DOM Level 3
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String getBaseURI() {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String             getLocalName()

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Returns the local part of the qualified name of this node.
     * For nodes created with a DOM Level 1 method, such as createElement
     * from the Document interface, and for nodes of any type other than
     * ELEMENT_NODE and ATTRIBUTE_NODE this is the same as the nodeName
     * attribute.
     * @since WD-DOM-Level-2-19990923
     * @see AttrNSImpl
     * @see ElementNSImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public void setPrefix(String prefix)

    /**
     *  Introduced in DOM Level 2. <p>
     *
     *  The namespace prefix of this node, or null if it is unspecified. When
     *  this node is of any type other than ELEMENT_NODE and ATTRIBUTE_NODE
     *  this is always null and setting it has no effect.<p>
     *
     *  For nodes created with a DOM Level 1 method, such as createElement from
     *  the Document interface, this is null.<p>
     *
     *  Note that setting this attribute changes the nodeName attribute, which
     *  holds the qualified name, as well as the tagName and name attributes of
     *  the Element and Attr interfaces, when applicable.<p>
     *
     * @throws INVALID_CHARACTER_ERR Raised if the specified
     *  prefix contains an invalid character.
     *
     * @since WD-DOM-Level-2-19990923
     * @see AttrNSImpl
     * @see ElementNSImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String getPrefix()

    /**
     * Introduced in DOM Level 2. <p>
     *
     * The namespace prefix of this node, or null if it is unspecified. When
     * this node is of any type other than ELEMENT_NODE and ATTRIBUTE_NODE this
     * is always null and setting it has no effect.<p>
     *
     * For nodes created with a DOM Level 1 method, such as createElement
     * from the Document interface, this is null. <p>
     *
     * @since WD-DOM-Level-2-19990923
     * @see AttrNSImpl
     * @see ElementNSImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String getNamespaceURI()

    /**
     * Introduced in DOM Level 2. <p>
     *
     * The namespace URI of this node, or null if it is unspecified. When this
     * node is of any type other than ELEMENT_NODE and ATTRIBUTE_NODE, this is
     * always null and setting it has no effect. <p>
     *
     * This is not a computed value that is the result of a namespace lookup
     * based on an examination of the namespace declarations in scope. It is
     * merely the namespace URI given at creation time.<p>
     *
     * For nodes created with a DOM Level 1 method, such as createElement
     * from the Document interface, this is null.
     * @since WD-DOM-Level-2-19990923
     * @see AttrNSImpl
     * @see ElementNSImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean isSupported(String feature, String version)

    /**
     * Introduced in DOM Level 2. <p>
     * Tests whether the DOM implementation implements a specific feature and
     * that feature is supported by this node.
     * @param feature The package name of the feature to test. This is the same
     * name as what can be passed to the method hasFeature on
     * DOMImplementation.
     * @param version This is the version number of the package name to
     * test. In Level 2, version 1, this is the string "2.0". If the version is
     * not specified, supporting any version of the feature will cause the
     * method to return true.
     * @return boolean Returns true if this node defines a subtree within which
     * the specified feature is supported, false otherwise.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public void normalize() {

    /**
     * Puts all <code>Text</code> nodes in the full depth of the sub-tree
     * underneath this <code>Node</code>, including attribute nodes, into a
     * "normal" form where only markup (e.g., tags, comments, processing
     * instructions, CDATA sections, and entity references) separates
     * <code>Text</code> nodes, i.e., there are no adjacent <code>Text</code>
     * nodes.  This can be used to ensure that the DOM view of a document is
     * the same as if it were saved and re-loaded, and is useful when
     * operations (such as XPointer lookups) that depend on a particular
     * document tree structure are to be used.In cases where the document
     * contains <code>CDATASections</code>, the normalize operation alone may
     * not be sufficient, since XPointers do not differentiate between
     * <code>Text</code> nodes and <code>CDATASection</code> nodes.
     * <p>
     * Note that this implementation simply calls normalize() on this Node's
     * children. It is up to implementors or Node to override normalize()
     * to take action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node item(int index) {

    /**
     * NodeList method: Return the Nth immediate child of this node, or
     * null if the index is out of bounds.
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     *
     * @return org.w3c.dom.Node
     * @param Index int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public int getLength() {

    /**
     * NodeList method: Count the immediate children of this node
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     *
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node replaceChild(Node newChild, Node oldChild)

    /**
     * Make newChild occupy the location that oldChild used to
     * have. Note that newChild will first be removed from its previous
     * parent, if any. Equivalent to inserting newChild before oldChild,
     * then removing oldChild.
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     *
     * @return oldChild, in its new state (removed).
     *
     * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a
     * type that shouldn't be a child of this node, or if newChild is
     * one of our ancestors.
     *
     * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a
     * different owner document than we do.
     *
     * @throws DOMException(NOT_FOUND_ERR) if oldChild is not a child of
     * this node.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is
     * read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node removeChild(Node oldChild)

    /**
     * Remove a child from this Node. The removed child's subtree
     * remains intact so it may be re-inserted elsewhere.
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     *
     * @return oldChild, in its new state (removed).
     *
     * @throws DOMException(NOT_FOUND_ERR) if oldChild is not a child of
     * this node.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is
     * read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node insertBefore(Node newChild, Node refChild)

    /**
     * Move one or more node(s) to our list of children. Note that this
     * implicitly removes them from their previous parent.
     * <P>
     * By default we do not accept any children, ParentNode overrides this.
     * @see ParentNode
     *
     * @param newChild The Node to be moved to our subtree. As a
     * convenience feature, inserting a DocumentNode will instead insert
     * all its children.
     *
     * @param refChild Current child which newChild should be placed
     * immediately before. If refChild is null, the insertion occurs
     * after all existing Nodes, like appendChild().
     *
     * @return newChild, in its new state (relocated, or emptied in the case of
     * DocumentNode.)
     *
     * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a
     * type that shouldn't be a child of this node, or if newChild is an
     * ancestor of this node.
     *
     * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a
     * different owner document than we do.
     *
     * @throws DOMException(NOT_FOUND_ERR) if refChild is not a child of
     * this node.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is
     * read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node getLastChild() {

    /** The first child of this Node, or null if none.
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node getFirstChild() {

    /** The first child of this Node, or null if none.
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public NodeList getChildNodes() {

    /**
     * Obtain a NodeList enumerating all children of this node. If there
     * are none, an (initially) empty NodeList is returned.
     * <p>
     * NodeLists are "live"; as children are added/removed the NodeList
     * will immediately reflect those changes. Also, the NodeList refers
     * to the actual nodes, so changes to those nodes made via the DOM tree
     * will be reflected in the NodeList and vice versa.
     * <p>
     * In this implementation, Nodes implement the NodeList interface and
     * provide their own getChildNodes() support. Other DOMs may solve this
     * differently.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean hasChildNodes() {

    /**
     * Test whether this node has any children. Convenience shorthand
     * for (Node.getFirstChild()!=null)
     * <P>
     * By default we do not have any children, ParentNode overrides this.
     * @see ParentNode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public boolean hasAttributes() {

    /**
     *  Returns whether this node (if it is an element) has any attributes.
     * @return <code>true</code> if this node has any attributes,
     *   <code>false</code> otherwise.
     * @since DOM Level 2
     * @see ElementImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public NamedNodeMap getAttributes() {

    /**
     * Return the collection of attributes associated with this node,
     * or null if none. At this writing, Element is the only type of node
     * which will ever have attributes.
     *
     * @see ElementImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node getPreviousSibling() {

    /** The previous child of this node's parent, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node getNextSibling() {

    /** The next child of this node's parent, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node getParentNode() {

    /**
     * Obtain the DOM-tree parent of this node, or null if it is not
     * currently active in the DOM tree (perhaps because it has just been
     * created or removed). Note that Document, DocumentFragment, and
     * Attribute will never have parents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    protected int getNodeNumber() {

    /**
     * Returns the node number
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    void setOwnerDocument(CoreDocumentImpl doc) {

    /**
     * NON-DOM
     * set the ownerDocument of this node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    CoreDocumentImpl ownerDocument() {

    /**
     * same as above but returns internal type and this one is not overridden
     * by CoreDocumentImpl to return null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Document getOwnerDocument() {

    /**
     * Find the Document that this Node belongs to (the document in
     * whose context the Node was created). The Node may or may not
     * currently be part of that Document's actual contents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node cloneNode(boolean deep) {

    /**
     * Returns a duplicate of a given node. You can consider this a
     * generic "copy constructor" for nodes. The newly returned object should
     * be completely independent of the source object's subtree, so changes
     * in one after the clone has been made will not affect the other.
     * <P>
     * Note: since we never have any children deep is meaningless here,
     * ParentNode overrides this behavior.
     * @see ParentNode
     *
     * <p>
     * Example: Cloning a Text node will copy both the node and the text it
     * contains.
     * <p>
     * Example: Cloning something that has children -- Element or Attr, for
     * example -- will _not_ clone those children unless a "deep clone"
     * has been requested. A shallow clone of an Attr node will yield an
     * empty Attr of the same name.
     * <p>
     * NOTE: Clones will always be read/write, even if the node being cloned
     * is read-only, to permit applications using only the DOM API to obtain
     * editable copies of locked portions of the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public Node appendChild(Node newChild) throws DOMException {

    /**
     * Adds a child node to the end of the list of children for this node.
     * Convenience shorthand for insertBefore(newChild,null).
     * @see #insertBefore(Node, Node)
     * <P>
     * By default we do not accept any children, ParentNode overrides this.
     * @see ParentNode
     *
     * @return newChild, in its new state (relocated, or emptied in the case of
     * DocumentNode.)
     *
     * @throws DOMException(HIERARCHY_REQUEST_ERR) if newChild is of a
     * type that shouldn't be a child of this node.
     *
     * @throws DOMException(WRONG_DOCUMENT_ERR) if newChild has a
     * different owner document than we do.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if this node is
     * read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public void setNodeValue(String x)

    /**
     * Sets the node value.
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public String getNodeValue()

    /**
     * Returns the node value.
     * @throws DOMException(DOMSTRING_SIZE_ERR)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public abstract String getNodeName();

    /**
     * the name of this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public abstract short getNodeType();

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public NodeImpl() {}

    /** Constructor for serialization. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    protected NodeImpl(CoreDocumentImpl ownerDocument) {

    /**
     * No public constructor; only subclasses of Node should be
     * instantiated, and those normally via a Document's factory methods
     * <p>
     * Every Node knows what Document it belongs to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public static final short ELEMENT_DEFINITION_NODE = 21;

    /** Element definition node type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    static final long serialVersionUID = -6316591992167219696L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public static final short TREE_POSITION_DISCONNECTED = 0x00;

    /**
     * The two nodes are disconnected, they do not have any common ancestor.
     * This is the case of two nodes that are not in the same document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public static final short TREE_POSITION_EQUIVALENT  = 0x10;

    /**
     * The two nodes have an equivalent position. This is the case of two
     * attributes that have the same <code>ownerElement</code>, and two
     * nodes that are the same.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public static final short TREE_POSITION_ANCESTOR    = 0x04;

    /**
     * The node is an ancestor of the reference node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
    public static final short TREE_POSITION_PRECEDING   = 0x01;

    /**
     * The node precedes the reference node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NodeImpl.java
public abstract class NodeImpl

/**
 * NodeImpl provides the basic structure of a DOM tree. It is never used
 * directly, but instead is subclassed to add type and data
 * information, and additional methods, appropriate to each node of
 * the tree. Only its subclasses should be instantiated -- and those,
 * with the exception of Document itself, only through a specific
 * Document's factory methods.
 * <P>
 * The Node interface provides shared behaviors such as siblings and
 * children, both for consistancy and so that the most common tree
 * operations may be performed without constantly having to downcast
 * to specific node types. When there is no obvious mapping for one of
 * these queries, it will respond with null.
 * Note that the default behavior is that children are forbidden. To
 * permit them, the subclass ParentNode overrides several methods.
 * <P>
 * NodeImpl also implements NodeList, so it can return itself in
 * response to the getChildNodes() query. This eliminiates the need
 * for a separate ChildNodeList object. Note that this is an
 * IMPLEMENTATION DETAIL; applications should _never_ assume that
 * this identity exists.
 * <P>
 * All nodes in a single document must originate
 * in that document. (Note that this is much tighter than "must be
 * same implementation") Nodes are all aware of their ownerDocument,
 * and attempts to mismatch will throw WRONG_DOCUMENT_ERR.
 * <P>
 * However, to save memory not all nodes always have a direct reference
 * to their ownerDocument. When a node is owned by another node it relies
 * on its owner to store its ownerDocument. Parent nodes always store it
 * though, so there is never more than one level of indirection.
 * And when a node doesn't have an owner, ownerNode refers to its
 * ownerDocument.
 * <p>
 * This class doesn't directly support mutation events, however, it still
 * implements the EventTarget interface and forward all related calls to the
 * document so that the document class do so.
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/NodeImpl.java
public class NodeImpl extends DefaultNode {

/**
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 */
