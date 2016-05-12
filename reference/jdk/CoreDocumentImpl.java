_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /**
     * @serialData Serialized fields. Convert Maps to Hashtables for backward
     * compatibility.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void renamedElement(Element oldEl, Element newEl) {

    /**
     * A method to be called when an element has been renamed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void renamedAttrNode(Attr oldAt, Attr newAt) {

    /**
     * A method to be called when an attribute node has been renamed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void removedAttrNode(AttrImpl attr, NodeImpl oldOwner, String name) {

    /**
     * A method to be called when an attribute node has been removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void setAttrNode(AttrImpl attr, AttrImpl previous) {

    /**
     * A method to be called when an attribute node has been set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void modifiedAttrValue(AttrImpl attr, String oldvalue) {

    /**
     * A method to be called when an attribute value has been modified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void replacedCharacterData(NodeImpl node, String oldvalue, String value) {

    /**
     *  method to be called when a character data node has been replaced.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void replacingData(NodeImpl node) {

    /**
     * A method to be called when a character data node is about to be replaced
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void replacedNode(NodeImpl node) {

    /**
     * A method to be called when a node has been replaced in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void replacingNode(NodeImpl node) {

    /**
     * A method to be called when a node is about to be replaced in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void removedNode(NodeImpl node, boolean replace) {

    /**
     * A method to be called when a node has been removed from the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void removingNode(NodeImpl node, NodeImpl oldChild, boolean replace) {

    /**
     * A method to be called when a node is about to be removed from the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void insertedNode(NodeImpl node, NodeImpl newInternal, boolean replace) {

    /**
     * A method to be called when a node has been inserted in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void insertingNode(NodeImpl node, boolean replace) {

    /**
     * A method to be called when a node is about to be inserted in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void modifiedCharacterData(NodeImpl node, String oldvalue, String value, boolean replace) {

    /**
     * A method to be called when a character data node has been modified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void modifyingCharacterData(NodeImpl node, boolean replace) {

    /**
     * A method to be called when a character data node is about to be modified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void insertedText(NodeImpl node, int offset, int count) {

    /**
     * A method to be called when some text was inserted into a text node,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void deletedText(NodeImpl node, int offset, int count) {

    /**
     * A method to be called when some text was deleted from a text node,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void replacedText(NodeImpl node) {

    /**
     * A method to be called when some text was changed in a text node,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected Object getUserData(NodeImpl n) {

    /**
     * NON-DOM: kept for backward compatibility
     * Retreive user data related to a given node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected void setUserData(NodeImpl n, Object data) {

    /**
     * NON-DOM: kept for backward compatibility
     * Store user data related to a given node
     * This is a place where we could use weak references! Indeed, the node
     * here won't be GC'ed as long as some user data is attached to it, since
     * the userData table will have a reference to the node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    boolean isXML11Version(){

    /**
     * We could have more xml versions in future , but for now we could
     * do with this to handle XML 1.0 and 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected final void checkQName(String prefix, String local) {

    /**
     * Checks if the given qualified name is legal with respect
     * to the version of XML to which this document must conform.
     *
     * @param prefix prefix of qualified name
     * @param local local part of qualified name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    // Temporarily comment out this method, because

    /**
     * Call user data handlers to let them know the nodes they are related to
     * are being deleted. The alternative would be to do that on Node but
     * because the nodes are used as the keys we have a reference to them that
     * prevents them from being gc'ed until the document is. At the same time,
     * doing it here has the advantage of avoiding a finalize() method on Node,
     * which would affect all nodes and not just the ones that have a user
     * data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void callUserDataHandlers(Node n, Node c, short operation, Map<String, UserDataRecord> userData) {

    /**
     * Call user data handlers when a node is deleted (finalized)
     * @param n The node this operation applies to.
     * @param c The copy node or null.
     * @param operation The operation - import, clone, or delete.
     * @param handlers Data associated with n.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void callUserDataHandlers(Node n, Node c, short operation) {

    /**
     * Call user data handlers when a node is deleted (finalized)
     * @param n The node this operation applies to.
     * @param c The copy node or null.
     * @param operation The operation - import, clone, or delete.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void setUserDataTable(Node n, Map<String, UserDataRecord> data) {

    /**
     * Set user data table for the given node.
     * @param n The node this operation applies to.
     * @param data The user data table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    Map<String, UserDataRecord> removeUserDataTable(Node n) {

    /**
     * Remove user data table for the given node.
     * @param n The node this operation applies to.
     * @return The removed table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Object getUserData(Node n, String key) {

    /**
     * Retrieves the object associated to a key on a this node. The object
     * must first have been set to this node by calling
     * <code>setUserData</code> with the same key.
     * @param n The node the object is associated to.
     * @param key The key the object is associated to.
     * @return Returns the <code>DOMObject</code> associated to the given key
     *   on this node, or <code>null</code> if there was none.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Object setUserData(Node n, String key,
            Object data, UserDataHandler handler) {

    /**
     * Associate an object to a key on this node. The object can later be
     * retrieved from this node by calling <code>getUserData</code> with the
     * same key.
     * @param n The node to associate the object to.
     * @param key The key to associate the object to.
     * @param data The object to associate to the given key, or
     *   <code>null</code> to remove any existing association to that key.
     * @param handler The handler to associate to that key, or
     *   <code>null</code>.
     * @return Returns the <code>DOMObject</code> previously associated to
     *   the given key on this node, or <code>null</code> if there was none.
     * @since DOM Level 3
     *
     * REVISIT: we could use a free list of UserDataRecord here
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void freeNodeListCache(NodeListCache c) {

    /**
     * Puts the given NodeListCache in the free list.
     * Note: The owner node can keep using it until we reuse it
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    NodeListCache getNodeListCache(ParentNode owner) {

    /**
     * Returns a NodeListCache for the given node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected int changes() {

    /**
     * Returns the number of changes to this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected void changed() {

    /**
     * Denotes that this node has changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected boolean isKidOK(Node parent, Node child) {

    /**
     * Uses the kidOK lookup table to check whether the proposed
     * tree structure is legal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public static final boolean isValidQName(String prefix, String local, boolean xml11Version) {

    /**
     * Checks if the given qualified name is legal with respect
     * to the version of XML to which this document must conform.
     *
     * @param prefix prefix of qualified name
     * @param local local part of qualified name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public static final boolean isXMLName(String s, boolean xml11Version) {

    /**
     * Check the string against XML's definition of acceptable names for
     * elements and attributes and so on using the XMLCharacterProperties
     * utility class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Object clone() throws CloneNotSupportedException {

    /** Clone. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public NodeList getElementsByTagNameNS(String namespaceURI,
            String localName) {

    /**
     * Introduced in DOM Level 2. <p>
     * Returns a NodeList of all the Elements with a given local name and
     * namespace URI in the order in which they would be encountered in a
     * preorder traversal of the Document tree.
     * @param namespaceURI  The namespace URI of the elements to match
     *                      on. The special value "*" matches all
     *                      namespaces. When it is null or an empty
     *                      string, this method behaves like
     *                      getElementsByTagName.
     * @param localName     The local name of the elements to match on.
     *                      The special value "*" matches all local names.
     * @return NodeList     A new NodeList object containing all the matched
     *                      Elements.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Attr createAttributeNS(String namespaceURI, String qualifiedName,
            String localpart)

    /**
     * NON-DOM: a factory method used by the Xerces DOM parser
     * to create an element.
     *
     * @param namespaceURI  The namespace URI of the attribute to
     *                      create. When it is null or an empty string,
     *                      this method behaves like createAttribute.
     * @param qualifiedName The qualified name of the attribute to
     *                      instantiate.
     * @param localpart     The local name of the attribute to instantiate.
     *
     * @return Attr         A new Attr object.
     * @throws DOMException INVALID_CHARACTER_ERR: Raised if the specified
     * name contains an invalid character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Attr createAttributeNS(String namespaceURI, String qualifiedName)

    /**
     * Introduced in DOM Level 2. <p>
     * Creates an attribute of the given qualified name and namespace URI.
     * If the given namespaceURI is null or an empty string and the
     * qualifiedName has a prefix that is "xml", the created element
     * is bound to the predefined namespace
     * "http://www.w3.org/XML/1998/namespace" [Namespaces].
     *
     * @param namespaceURI  The namespace URI of the attribute to
     *                      create. When it is null or an empty string,
     *                      this method behaves like createAttribute.
     * @param qualifiedName The qualified name of the attribute to
     *                      instantiate.
     * @return Attr         A new Attr object.
     * @throws DOMException INVALID_CHARACTER_ERR: Raised if the specified
     * name contains an invalid character.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Element createElementNS(String namespaceURI, String qualifiedName,
            String localpart)

    /**
     * NON-DOM: a factory method used by the Xerces DOM parser
     * to create an element.
     *
     * @param namespaceURI The namespace URI of the element to
     *                     create.
     * @param qualifiedName The qualified name of the element type to
     *                      instantiate.
     * @param localpart  The local name of the attribute to instantiate.
     *
     * @return Element A new Element object with the following attributes:
     * @exception DOMException INVALID_CHARACTER_ERR: Raised if the specified
     *                   name contains an invalid character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Element createElementNS(String namespaceURI, String qualifiedName)

    /**
     * Introduced in DOM Level 2. <p>
     * Creates an element of the given qualified name and namespace URI.
     * If the given namespaceURI is null or an empty string and the
     * qualifiedName has a prefix that is "xml", the created element
     * is bound to the predefined namespace
     * "http://www.w3.org/XML/1998/namespace" [Namespaces].
     * @param namespaceURI The namespace URI of the element to
     *                     create.
     * @param qualifiedName The qualified name of the element type to
     *                      instantiate.
     * @return Element A new Element object with the following attributes:
     * @throws DOMException INVALID_CHARACTER_ERR: Raised if the specified
     * name contains an invalid character.
     * @throws DOMException NAMESPACE_ERR: Raised if the qualifiedName has a
     *                      prefix that is "xml" and the namespaceURI is
     *                      neither null nor an empty string nor
     *                      "http://www.w3.org/XML/1998/namespace", or
     *                      if the qualifiedName has a prefix different
     *                      from "xml" and the namespaceURI is null or an
     *                      empty string.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void removeIdentifier(String idName) {

    /**
     * Removes a previously registered element with the specified
     * identifier name.
     *
     * @see #putIdentifier
     * @see #getIdentifier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Element getIdentifier(String idName) {

    /**
     * Returns a previously registered element with the specified
     * identifier name, or null if no element is registered.
     *
     * @see #putIdentifier
     * @see #removeIdentifier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void putIdentifier(String idName, Element element) {

    /**
     * Registers an identifier name with a specified element node.
     * If the identifier is already registered, the new element
     * node replaces the previous node. If the specified element
     * node is null, removeIdentifier() is called.
     *
     * @see #getIdentifier
     * @see #removeIdentifier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected final void clearIdentifiers(){

    /**
     * Remove all identifiers from the ID table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Element getElementById(String elementId) {

    /**
     * Introduced in DOM Level 2
     * Returns the Element whose ID is given by elementId. If no such element
     * exists, returns null. Behavior is not defined if more than one element
     * has this ID.
     * <p>
     * Note: The DOM implementation must have information that says which
     * attributes are of type ID. Attributes with the name "ID" are not of type
     * ID unless so defined. Implementations that do not know whether
     * attributes are of type ID or not are expected to return null.
     * @see #getIdentifier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected void undeferChildren(Node node) {

    /**
     * Traverses the DOM Tree and expands deferred nodes and their
     * children.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node adoptNode(Node source) {

    /**
     * DOM Level 3 WD - Experimental
     * Change the node's ownerDocument, and its subtree, to this Document
     *
     * @param source The node to adopt.
     * @see #importNode
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    private Node importNode(Node source, boolean deep, boolean cloningDoc,
            Map<Node, String> reversedIdentifiers)

    /**
     * Overloaded implementation of DOM's importNode method. This method
     * provides the core functionality for the public importNode and cloneNode
     * methods.
     *
     * The reversedIdentifiers parameter is provided for cloneNode to preserve
     * the document's identifiers. The Map has Elements as the keys and
     * their identifiers as the values. When an element is being imported, a
     * check is done for an associated identifier. If one exists, the identifier
     * is registered with the new, imported element. If reversedIdentifiers is
     * null, the parameter is not applied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node importNode(Node source, boolean deep)

    /**
     * Copies a node from another document to this document. The new nodes are
     * created using this document's factory methods and are populated with the
     * data from the source's accessor methods defined by the DOM interfaces.
     * Its behavior is otherwise similar to that of cloneNode.
     * <p>
     * According to the DOM specifications, document nodes cannot be imported
     * and a NOT_SUPPORTED_ERR exception is thrown if attempted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected int getNodeNumber(Node node) {

    /**
     * NON-DOM: Get a number associated with a node created with respect to this
     * document. Needed for compareDocumentPosition when nodes are disconnected.
     * This is only used on demand.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected int getNodeNumber() {

    /**
     * NON-DOM: Get the number associated with this document. Used to order
     * documents in the implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public ElementDefinitionImpl createElementDefinition(String name)

    /**
     * NON-DOM Factory method: creates an element definition. Element
     * definitions hold default attribute values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Notation createNotation(String name)

    /**
     * NON-DOM Factory method; creates a Notation having this Document as its
     * OwnerDoc. (REC-DOM-Level-1-19981001 left the process of building DTD
     * information unspecified.)
     *
     * @param name The name of the Notation we wish to describe
     *
     * @throws DOMException(NOT_SUPPORTED_ERR) for HTML documents, where
     * notations are not permitted. (HTML not yet implemented.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Entity createEntity(String name)

    /**
     * NON-DOM Factory method; creates an Entity having this Document as its
     * OwnerDoc. (REC-DOM-Level-1-19981001 left the process of building DTD
     * information unspecified.)
     *
     * @param name The name of the Entity we wish to provide a value for.
     *
     * @throws DOMException(NOT_SUPPORTED_ERR) for HTML documents, where
     * nonstandard entities are not permitted. (HTML not yet implemented.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public DocumentType createDocumentType(String qualifiedName,
            String publicID,
            String systemID)

    /**
     * NON-DOM Factory method; creates a DocumentType having this Document as
     * its OwnerDoc. (REC-DOM-Level-1-19981001 left the process of building DTD
     * information unspecified.)
     *
     * @param name The name of the Entity we wish to provide a value for.
     *
     * @throws DOMException(NOT_SUPPORTED_ERR) for HTML documents, where DTDs
     * are not permitted. (HTML not yet implemented.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    boolean getMutationEvents() {

    /**
     * Returns true if the DOM implementation generates mutation events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void setMutationEvents(boolean set) {

    /**
     * Sets whether the DOM implementation generates mutation events upon
     * operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String saveXML(Node node)

    /**
     * DOM Level 3 WD - Experimental.
     * Save the document or the given node and all its descendants to a string
     * (i.e. serialize the document or node).
     * <br>The parameters used in the <code>LSSerializer</code> interface are
     * assumed to have their default values when invoking this method.
     * <br> The result of a call to this method is the same the result of a
     * call to <code>LSSerializer.writeToString</code> with the document as
     * the node to write.
     * @param node Specifies what to serialize, if this parameter is
     *   <code>null</code> the whole document is serialized, if it's
     *   non-null the given node is serialized.
     * @return The serialized document or <code>null</code> in case an error
     *   occurred.
     * @exception DOMException
     *   WRONG_DOCUMENT_ERR: Raised if the node passed in as the node
     *   parameter is from an other document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public boolean loadXML(String source) {

    /**
     * DOM Level 3 WD - Experimental.
     * Replace the content of the document with the result of parsing the
     * input string, this method is always synchronous.
     * @param source A string containing an XML document.
     * @return <code>true</code> if parsing the input string succeeded
     *   without errors, otherwise <code>false</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public boolean load(String uri) {

    /**
     * DOM Level 3 WD - Experimental.
     *
     * Replaces the content of the document with the result of parsing the
     * given URI. Invoking this method will either block the caller or
     * return to the caller immediately depending on the value of the async
     * attribute. Once the document is fully loaded a "load" event (as
     * defined in [<a href='http://www.w3.org/TR/2003/WD-DOM-Level-3-Events-20030331'>DOM Level 3 Events</a>]
     * , except that the <code>Event.targetNode</code> will be the document,
     * not an element) will be dispatched on the document. If an error
     * occurs, an implementation dependent "error" event will be dispatched
     * on the document. If this method is called on a document that is
     * currently loading, the current load is interrupted and the new URI
     * load is initiated.
     * <br> When invoking this method the parameters used in the
     * <code>DOMParser</code> interface are assumed to have their default
     * values with the exception that the parameters <code>"entities"</code>
     * , <code>"normalize-characters"</code>,
     * <code>"check-character-normalization"</code> are set to
     * <code>"false"</code>.
     * <br> The result of a call to this method is the same the result of a
     * call to <code>DOMParser.parseWithContext</code> with an input stream
     * referencing the URI that was passed to this call, the document as the
     * context node, and the action <code>ACTION_REPLACE_CHILDREN</code>.
     * @param uri The URI reference for the XML file to be loaded. If this is
     *  a relative URI, the base URI used by the implementation is
     *  implementation dependent.
     * @return If async is set to <code>true</code> <code>load</code> returns
     *   <code>true</code> if the document load was successfully initiated.
     *   If an error occurred when initiating the document load,
     *   <code>load</code> returns <code>false</code>.If async is set to
     *   <code>false</code> <code>load</code> returns <code>true</code> if
     *   the document was successfully loaded and parsed. If an error
     *   occurred when either loading or parsing the URI, <code>load</code>
     *   returns <code>false</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void abort() {

    /**
     * DOM Level 3 WD - Experimental.
     * If the document is currently being loaded as a result of the method
     * <code>load</code> being invoked the loading and parsing is
     * immediately aborted. The possibly partial result of parsing the
     * document is discarded and the document is cleared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setAsync(boolean async) {

    /**
     * DOM Level 3 WD - Experimental.
     * Indicates whether the method load should be synchronous or
     * asynchronous. When the async attribute is set to <code>true</code>
     * the load method returns control to the caller before the document has
     * completed loading. The default value of this property is
     * <code>false</code>.
     * <br>Setting the value of this attribute might throw NOT_SUPPORTED_ERR
     * if the implementation doesn't support the mode the attribute is being
     * set to. Should the DOM spec define the default value of this
     * property? What if implementing both async and sync IO is impractical
     * in some systems?  2001-09-14. default is <code>false</code> but we
     * need to check with Mozilla and IE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public boolean getAsync() {

    /**
     * DOM Level 3 WD - Experimental.
     * Indicates whether the method load should be synchronous or
     * asynchronous. When the async attribute is set to <code>true</code>
     * the load method returns control to the caller before the document has
     * completed loading. The default value of this property is
     * <code>false</code>.
     * <br>Setting the value of this attribute might throw NOT_SUPPORTED_ERR
     * if the implementation doesn't support the mode the attribute is being
     * set to. Should the DOM spec define the default value of this
     * property? What if implementing both async and sync IO is impractical
     * in some systems?  2001-09-14. default is <code>false</code> but we
     * need to check with Mozilla and IE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setDocumentURI(String documentURI){

    /**
     * DOM Level 3 WD - Experimental.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getBaseURI() {

    /**
     * Returns the absolute base URI of this node or null if the implementation
     * wasn't able to obtain an absolute URI. Note: If the URI is malformed, a
     * null is returned.
     *
     * @return The absolute base URI of this node or null.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public DOMConfiguration getDomConfig(){

    /**
     * DOM Level 3 CR - Experimental
     *
     *  The configuration used when <code>Document.normalizeDocument</code> is
     * invoked.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void normalizeDocument(){

    /**
     *  DOM Level 3 WD - Experimental
     *  Normalize document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node renameNode(Node n,String namespaceURI,String name)

    /**
     * DOM Level 3 WD - Experimental.
     * Renaming node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getDocumentURI(){

    /**
     * DOM Level 3 WD - Experimental.
     * The location of the document or <code>null</code> if undefined.
     * <br>Beware that when the <code>Document</code> supports the feature
     * "HTML" , the href attribute of the HTML BASE element takes precedence
     * over this attribute.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public boolean getStandalone() {

    /**
     * @deprecated This method is internal and only exists for
     * compatibility with older applications. New applications
     * should never call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public boolean getXmlStandalone() {

    /**
     * DOM Level 3 WD - Experimental.
     * standalone that specifies whether this document is standalone
     * (part of XML Declaration)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setStandalone(boolean value) {

    /**
     * @deprecated This method is internal and only exists for
     * compatibility with older applications. New applications
     * should never call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setXmlStandalone(boolean value)

    /**
     * DOM Level 3 CR - Experimental.
     *
     * Xmlstandalone - An attribute specifying, as part of the XML declaration,
     * whether this document is standalone
     * @exception DOMException
     *    NOT_SUPPORTED_ERR: Raised if this document does not support the
     *   "XML" feature.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getVersion() {

    /**
     * @deprecated This method is internal and only exists for
     * compatibility with older applications. New applications
     * should never call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getXmlVersion() {

    /**
     * DOM Level 3 WD - Experimental.
     * The version of this document (part of XML Declaration)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setVersion(String value) {

    /**
     * @deprecated This method is internal and only exists for
     * compatibility with older applications. New applications
     * should never call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setXmlVersion(String value) {

    /**
     * DOM Level 3 CR - Experimental.
     * version - An attribute specifying, as part of the XML declaration,
     * the version number of this document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getEncoding() {

    /**
     * @deprecated This method is internal and only exists for
     * compatibility with older applications. New applications
     * should never call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getXmlEncoding() {

    /**
     * DOM Level 3 WD - Experimental.
     * The encoding of this document (part of XML Declaration)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setEncoding(String value) {

    /**
     * @deprecated This method is internal and only exists for
     * compatibility with older applications. New applications
     * should never call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setXmlEncoding(String value) {

    /**
     * DOM Internal
     * (Was a DOM L3 Core WD public interface method setXMLEncoding )
     *
     * An attribute specifying, as part of the XML declaration,
     * the encoding of this document. This is null when unspecified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setInputEncoding(String value) {

    /**
     * DOM Internal
     * (Was a DOM L3 Core WD public interface method setActualEncoding )
     *
     * An attribute specifying the actual encoding of this document. This is
     * <code>null</code> otherwise.
     * <br> This attribute represents the property [character encoding scheme]
     * defined in .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getInputEncoding() {

    /**
     * DOM Level 3 CR - Experimental. (Was getActualEncoding)
     *
     * An attribute specifying the encoding used for this document
     * at the time of the parsing. This is <code>null</code> when
     * it is not known, such as when the <code>Document</code> was
     * created in memory.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public boolean getErrorChecking() {

    /**
     * Returns true if the DOM implementation performs error checking.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setErrorChecking(boolean check) {

    /**
     * Sets whether the DOM implementation performs error checking
     * upon operations. Turning off error checking only affects
     * the following DOM checks:
     * <ul>
     * <li>Checking strings to make sure that all characters are
     *     legal XML characters
     * <li>Hierarchy checking such as allowed children, checks for
     *     cycles, etc.
     * </ul>
     * <p>
     * Turning off error checking does <em>not</em> turn off the
     * following checks:
     * <ul>
     * <li>Read only checks
     * <li>Checks related to DOM events
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public DOMImplementation getImplementation() {

    /**
     * Retrieve information describing the abilities of this particular
     * DOM implementation. Intended to support applications that may be
     * using DOMs retrieved from several different sources, potentially
     * with different underlying representations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public NodeList getElementsByTagName(String tagname) {

    /**
     * Return a <em>live</em> collection of all descendent Elements (not just
     * immediate children) having the specified tag name.
     *
     * @param tagname The type of Element we want to gather. "*" will be
     * taken as a wildcard, meaning "all elements in the document."
     *
     * @see DeepNodeListImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Element getDocumentElement() {

    /**
     * Convenience method, allowing direct access to the child node
     * which is considered the root of the actual document content. For
     * HTML, where it is legal to have more than one Element at the top
     * level of the document, we pick the one with the tagName
     * "HTML". For XML there should be only one top-level
     *
     * (HTML not yet supported.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public DocumentType getDoctype() {

    /**
     * For XML, this provides access to the Document Type Definition.
     * For HTML documents, and XML documents which don't specify a DTD,
     * it will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Text createTextNode(String data) {

    /**
     * Factory method; creates a Text node having this Document as its
     * OwnerDoc.
     *
     * @param data The initial contents of the Text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public ProcessingInstruction createProcessingInstruction(String target,
            String data)

    /**
     * Factory method; creates a ProcessingInstruction having this Document
     * as its OwnerDoc.
     *
     * @param target The target "processor channel"
     * @param data Parameter string to be passed to the target.
     *
     * @throws DOMException(INVALID_NAME_ERR) if the target name is not
     * acceptable.
     *
     * @throws DOMException(NOT_SUPPORTED_ERR) for HTML documents. (HTML
     * not yet implemented.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public EntityReference createEntityReference(String name)

    /**
     * Factory method; creates an EntityReference having this Document
     * as its OwnerDoc.
     *
     * @param name The name of the Entity we wish to refer to
     *
     * @throws DOMException(NOT_SUPPORTED_ERR) for HTML documents, where
     * nonstandard entities are not permitted. (HTML not yet
     * implemented.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Element createElement(String tagName)

    /**
     * Factory method; creates an Element having this Document
     * as its OwnerDoc.
     *
     * @param tagName The name of the element type to instantiate. For
     * XML, this is case-sensitive. For HTML, the tagName parameter may
     * be provided in any case, but it must be mapped to the canonical
     * uppercase form by the DOM implementation.
     *
     * @throws DOMException(INVALID_NAME_ERR) if the tag name is not
     * acceptable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public DocumentFragment createDocumentFragment() {

    /**
     * Factory method; creates a DocumentFragment having this Document
     * as its OwnerDoc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Comment createComment(String data) {

    /**
     * Factory method; creates a Comment having this Document as its
     * OwnerDoc.
     *
     * @param data The initial contents of the Comment. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public CDATASection createCDATASection(String data)

    /**
     * Factory method; creates a CDATASection having this Document as
     * its OwnerDoc.
     *
     * @param data The initial contents of the CDATA
     *
     * @throws DOMException(NOT_SUPPORTED_ERR) for HTML documents. (HTML
     * not yet implemented.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Attr createAttribute(String name)

    /**
     * Factory method; creates an Attribute having this Document as its
     * OwnerDoc.
     *
     * @param name The name of the attribute. Note that the attribute's value is
     * _not_ established at the factory; remember to set it!
     *
     * @throws DOMException(INVALID_NAME_ERR)
     * if the attribute name is not acceptable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Object getFeature(String feature, String version) {

    /**
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node replaceChild(Node newChild, Node oldChild)

    /**
     * Since we cache the docElement (and, currently, docType),
     * replaceChild has to update the cache
     *
     * REVISIT: According to the spec it is not allowed to alter neither the
     * document element nor the document type in any way
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node removeChild(Node oldChild) throws DOMException {

    /**
     * Since insertBefore caches the docElement (and, currently, docType),
     * removeChild has to know how to undo the cache
     *
     * REVISIT: According to the spec it is not allowed to alter neither the
     * document element nor the document type in any way
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node insertBefore(Node newChild, Node refChild)

    /**
     * Since a Document may contain at most one top-level Element child,
     * and at most one DocumentType declaraction, we need to subclass our
     * add-children methods to implement this constraint.
     * Since appendChild() is implemented as insertBefore(,null),
     * altering the latter fixes both.
     * <p>
     * While I'm doing so, I've taken advantage of the opportunity to
     * cache documentElement and docType so we don't have to
     * search for them.
     *
     * REVISIT: According to the spec it is not allowed to alter neither the
     * document element nor the document type in any way
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected void cloneNode(CoreDocumentImpl newdoc, boolean deep) {

    /**
     * internal method to share code with subclass
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node cloneNode(boolean deep) {

    /**
     * Deep-clone a document, including fixing ownerDoc for the cloned
     * children. Note that this requires bypassing the WRONG_DOCUMENT_ERR
     * protection. I've chosen to implement it by calling importNode
     * which is DOM Level 2.
     *
     * @return org.w3c.dom.Node
     * @param deep boolean, iff true replicate children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getNodeName() {

    /** Returns the node name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public short getNodeType() {

    /** Returns the node type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public CoreDocumentImpl(DocumentType doctype, boolean grammarAccess) {

    /** For DOM2 support. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public CoreDocumentImpl(DocumentType doctype) {

    /**
     * For DOM2 support.
     * The createDocument factory method is in DOMImplementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public CoreDocumentImpl(boolean grammarAccess) {

    /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public CoreDocumentImpl() {

    /**
     * NON-DOM: Actually creating a Document is outside the DOM's spec,
     * since it has to operate in terms of a particular implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    private static final ObjectStreamField[] serialPersistentFields =

    /**
     * @serialField docType DocumentTypeImpl document type
     * @serialField docElement ElementImpl document element
     * @serialField fFreeNLCache NodeListCache NodeListCache free list
     * @serialField encoding String Document encoding
     * @serialField actualEncoding String Document actualEncoding
     * @serialField version String Document version
     * @serialField standalone boolean Document standalone
     * @serialField fDocumentURI String Document URI
     * @serialField userData Hashtable user data attached to the nodes. Note that
     * it was original called "userData". It has been changed to nodeUserData to
     * avoid confusion with those that are actually values of the map.
     * @serialField identifiers Hashtable identifiers
     * @serialField changes int flag indicates whether the node has changed
     * @serialField allowGrammarAccess boolean Allow grammar access
     * @serialField errorChecking boolean Bypass error checking
     * @serialField ancestorChecking boolean Ancestor checking
     * @serialField xmlVersionChanged boolean Indicate whether the version has changed
     * @serialField documentNumber int Document number
     * @serialField nodeCounter int Node counter
     * @serialField nodeTable Hashtable Node table
     * @serialField xml11Version boolean XML version
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    // Document number.   Documents are ordered across the implementation using

    /** The following are required for compareDocumentPosition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected boolean errorChecking = true;

    /** Bypass error checking. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected boolean allowGrammarAccess;

    /** Allow grammar access. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected int changes = 0;

    /**
     * Number of alterations made to this document since its creation.
     * Serves as a "dirty bit" so that live objects such as NodeList can
     * recognize when an alteration has been made and discard its cached
     * state information.
     * <p>
     * Any method that alters the tree structure MUST cause or be
     * accompanied by a call to changed(), to inform it that any outstanding
     * NodeLists may have to be updated.
     * <p>
     * (Required because NodeList is simultaneously "live" and integer-
     * indexed -- a bad decision in the DOM's design.)
     * <p>
     * Note that changes which do not affect the tree's structure -- changing
     * the node's name, for example -- do _not_ have to call changed().
     * <p>
     * Alternative implementation would be to use a cryptographic
     * Digest value rather than a count. This would have the advantage that
     * "harmless" changes (those producing equal() trees) would not force
     * NodeList to resynchronize. Disadvantage is that it's slightly more prone
     * to "false negatives", though that's the difference between "wildly
     * unlikely" and "absurdly unlikely". IF we start maintaining digests,
     * we should consider taking advantage of them.
     *
     * Note: This used to be done a node basis, so that we knew what
     * subtree changed. But since only DeepNodeList really use this today,
     * the gain appears to be really small compared to the cost of having
     * an int on every (parent) node plus having to walk up the tree all the
     * way to the root to mark the branch as changed everytime a node is
     * changed.
     * So we now have a single counter global to the document. It means that
     * some objects may flush their cache more often than necessary, but this
     * makes nodes smaller and only the document needs to be marked as changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    private final static int[] kidOK;

    /** Table for quick check of child insertion. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected Map<String, Node> identifiers;

    /** Identifiers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    private Map<Node, Map<String, UserDataRecord>> nodeUserData;

    /** Table for user data attached to this document nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected String fDocumentURI;

    /**Experimental DOM Level 3 feature: documentURI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected boolean standalone;

    /**Experimental DOM Level 3 feature: Document standalone */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected String version;

    /**Experimental DOM Level 3 feature: Document version */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected String actualEncoding;

    /**Experimental DOM Level 3 feature: Document actualEncoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected String encoding;

    /**Experimental DOM Level 3 feature: Document encoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    transient NodeListCache fFreeNLCache;

    /** NodeListCache free list */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected ElementImpl docElement;

    /** Document element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected DocumentTypeImpl docType;

    /** Document type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    static final long serialVersionUID = 0;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    //

    /**
     * TODO:: 1. Change XML11Char method names similar to XMLChar. That will
     * prevent lot of dirty version checking code.
     *
     * 2. IMO during cloneNode qname/isXMLName check should not be made.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
public class CoreDocumentImpl

/**
 * The Document interface represents the entire HTML or XML document.
 * Conceptually, it is the root of the document tree, and provides the
 * primary access to the document's data.
 * <P>
 * Since elements, text nodes, comments, processing instructions,
 * etc. cannot exist outside the context of a Document, the Document
 * interface also contains the factory methods needed to create these
 * objects. The Node objects created have a ownerDocument attribute
 * which associates them with the Document within whose context they
 * were created.
 * <p>
 * The CoreDocumentImpl class only implements the DOM Core. Additional modules
 * are supported by the more complete DocumentImpl subclass.
 * <p>
 * <b>Note:</b> When any node in the document is serialized, the
 * entire document is serialized along with it.
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @author Ralf Pfeiffer, IBM
 * @version $Id: CoreDocumentImpl.java,v 1.9 2010-11-01 04:39:37 joehw Exp $
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /**
     * @serialData Serialized fields. Convert Maps to Hashtables for backward
     * compatibility.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void renamedElement(Element oldEl, Element newEl) {

    /**
     * A method to be called when an element has been renamed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void renamedAttrNode(Attr oldAt, Attr newAt) {

    /**
     * A method to be called when an attribute node has been renamed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void removedAttrNode(AttrImpl attr, NodeImpl oldOwner, String name) {

    /**
     * A method to be called when an attribute node has been removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void setAttrNode(AttrImpl attr, AttrImpl previous) {

    /**
     * A method to be called when an attribute node has been set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void modifiedAttrValue(AttrImpl attr, String oldvalue) {

    /**
     * A method to be called when an attribute value has been modified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void replacedCharacterData(NodeImpl node, String oldvalue, String value) {

    /**
     *  method to be called when a character data node has been replaced.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void replacingData(NodeImpl node) {

    /**
     * A method to be called when a character data node is about to be replaced
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void replacedNode(NodeImpl node) {

    /**
     * A method to be called when a node has been replaced in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void replacingNode(NodeImpl node) {

    /**
     * A method to be called when a node is about to be replaced in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void removedNode(NodeImpl node, boolean replace) {

    /**
     * A method to be called when a node has been removed from the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void removingNode(NodeImpl node, NodeImpl oldChild, boolean replace) {

    /**
     * A method to be called when a node is about to be removed from the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void insertedNode(NodeImpl node, NodeImpl newInternal, boolean replace) {

    /**
     * A method to be called when a node has been inserted in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void insertingNode(NodeImpl node, boolean replace) {

    /**
     * A method to be called when a node is about to be inserted in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void modifiedCharacterData(NodeImpl node, String oldvalue, String value, boolean replace) {

    /**
     * A method to be called when a character data node has been modified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void modifyingCharacterData(NodeImpl node, boolean replace) {

    /**
     * A method to be called when a character data node is about to be modified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void insertedText(NodeImpl node, int offset, int count) {

    /**
     * A method to be called when some text was inserted into a text node,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void deletedText(NodeImpl node, int offset, int count) {

    /**
     * A method to be called when some text was deleted from a text node,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void replacedText(NodeImpl node) {

    /**
     * A method to be called when some text was changed in a text node,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected Object getUserData(NodeImpl n) {

    /**
     * NON-DOM: kept for backward compatibility
     * Retreive user data related to a given node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected void setUserData(NodeImpl n, Object data) {

    /**
     * NON-DOM: kept for backward compatibility
     * Store user data related to a given node
     * This is a place where we could use weak references! Indeed, the node
     * here won't be GC'ed as long as some user data is attached to it, since
     * the userData table will have a reference to the node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    boolean isXML11Version(){

    /**
     * We could have more xml versions in future , but for now we could
     * do with this to handle XML 1.0 and 1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected final void checkQName(String prefix, String local) {

    /**
     * Checks if the given qualified name is legal with respect
     * to the version of XML to which this document must conform.
     *
     * @param prefix prefix of qualified name
     * @param local local part of qualified name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    // Temporarily comment out this method, because

    /**
     * Call user data handlers to let them know the nodes they are related to
     * are being deleted. The alternative would be to do that on Node but
     * because the nodes are used as the keys we have a reference to them that
     * prevents them from being gc'ed until the document is. At the same time,
     * doing it here has the advantage of avoiding a finalize() method on Node,
     * which would affect all nodes and not just the ones that have a user
     * data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void callUserDataHandlers(Node n, Node c, short operation, Map<String, UserDataRecord> userData) {

    /**
     * Call user data handlers when a node is deleted (finalized)
     * @param n The node this operation applies to.
     * @param c The copy node or null.
     * @param operation The operation - import, clone, or delete.
     * @param handlers Data associated with n.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void callUserDataHandlers(Node n, Node c, short operation) {

    /**
     * Call user data handlers when a node is deleted (finalized)
     * @param n The node this operation applies to.
     * @param c The copy node or null.
     * @param operation The operation - import, clone, or delete.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void setUserDataTable(Node n, Map<String, UserDataRecord> data) {

    /**
     * Set user data table for the given node.
     * @param n The node this operation applies to.
     * @param data The user data table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    Map<String, UserDataRecord> removeUserDataTable(Node n) {

    /**
     * Remove user data table for the given node.
     * @param n The node this operation applies to.
     * @return The removed table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Object getUserData(Node n, String key) {

    /**
     * Retrieves the object associated to a key on a this node. The object
     * must first have been set to this node by calling
     * <code>setUserData</code> with the same key.
     * @param n The node the object is associated to.
     * @param key The key the object is associated to.
     * @return Returns the <code>DOMObject</code> associated to the given key
     *   on this node, or <code>null</code> if there was none.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Object setUserData(Node n, String key,
            Object data, UserDataHandler handler) {

    /**
     * Associate an object to a key on this node. The object can later be
     * retrieved from this node by calling <code>getUserData</code> with the
     * same key.
     * @param n The node to associate the object to.
     * @param key The key to associate the object to.
     * @param data The object to associate to the given key, or
     *   <code>null</code> to remove any existing association to that key.
     * @param handler The handler to associate to that key, or
     *   <code>null</code>.
     * @return Returns the <code>DOMObject</code> previously associated to
     *   the given key on this node, or <code>null</code> if there was none.
     * @since DOM Level 3
     *
     * REVISIT: we could use a free list of UserDataRecord here
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void freeNodeListCache(NodeListCache c) {

    /**
     * Puts the given NodeListCache in the free list.
     * Note: The owner node can keep using it until we reuse it
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    NodeListCache getNodeListCache(ParentNode owner) {

    /**
     * Returns a NodeListCache for the given node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected int changes() {

    /**
     * Returns the number of changes to this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected void changed() {

    /**
     * Denotes that this node has changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected boolean isKidOK(Node parent, Node child) {

    /**
     * Uses the kidOK lookup table to check whether the proposed
     * tree structure is legal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public static final boolean isValidQName(String prefix, String local, boolean xml11Version) {

    /**
     * Checks if the given qualified name is legal with respect
     * to the version of XML to which this document must conform.
     *
     * @param prefix prefix of qualified name
     * @param local local part of qualified name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public static final boolean isXMLName(String s, boolean xml11Version) {

    /**
     * Check the string against XML's definition of acceptable names for
     * elements and attributes and so on using the XMLCharacterProperties
     * utility class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Object clone() throws CloneNotSupportedException {

    /** Clone. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public NodeList getElementsByTagNameNS(String namespaceURI,
            String localName) {

    /**
     * Introduced in DOM Level 2. <p>
     * Returns a NodeList of all the Elements with a given local name and
     * namespace URI in the order in which they would be encountered in a
     * preorder traversal of the Document tree.
     * @param namespaceURI  The namespace URI of the elements to match
     *                      on. The special value "*" matches all
     *                      namespaces. When it is null or an empty
     *                      string, this method behaves like
     *                      getElementsByTagName.
     * @param localName     The local name of the elements to match on.
     *                      The special value "*" matches all local names.
     * @return NodeList     A new NodeList object containing all the matched
     *                      Elements.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Attr createAttributeNS(String namespaceURI, String qualifiedName,
            String localpart)

    /**
     * NON-DOM: a factory method used by the Xerces DOM parser
     * to create an element.
     *
     * @param namespaceURI  The namespace URI of the attribute to
     *                      create. When it is null or an empty string,
     *                      this method behaves like createAttribute.
     * @param qualifiedName The qualified name of the attribute to
     *                      instantiate.
     * @param localpart     The local name of the attribute to instantiate.
     *
     * @return Attr         A new Attr object.
     * @throws DOMException INVALID_CHARACTER_ERR: Raised if the specified
     * name contains an invalid character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Attr createAttributeNS(String namespaceURI, String qualifiedName)

    /**
     * Introduced in DOM Level 2. <p>
     * Creates an attribute of the given qualified name and namespace URI.
     * If the given namespaceURI is null or an empty string and the
     * qualifiedName has a prefix that is "xml", the created element
     * is bound to the predefined namespace
     * "http://www.w3.org/XML/1998/namespace" [Namespaces].
     *
     * @param namespaceURI  The namespace URI of the attribute to
     *                      create. When it is null or an empty string,
     *                      this method behaves like createAttribute.
     * @param qualifiedName The qualified name of the attribute to
     *                      instantiate.
     * @return Attr         A new Attr object.
     * @throws DOMException INVALID_CHARACTER_ERR: Raised if the specified
     * name contains an invalid character.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Element createElementNS(String namespaceURI, String qualifiedName,
            String localpart)

    /**
     * NON-DOM: a factory method used by the Xerces DOM parser
     * to create an element.
     *
     * @param namespaceURI The namespace URI of the element to
     *                     create.
     * @param qualifiedName The qualified name of the element type to
     *                      instantiate.
     * @param localpart  The local name of the attribute to instantiate.
     *
     * @return Element A new Element object with the following attributes:
     * @exception DOMException INVALID_CHARACTER_ERR: Raised if the specified
     *                   name contains an invalid character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Element createElementNS(String namespaceURI, String qualifiedName)

    /**
     * Introduced in DOM Level 2. <p>
     * Creates an element of the given qualified name and namespace URI.
     * If the given namespaceURI is null or an empty string and the
     * qualifiedName has a prefix that is "xml", the created element
     * is bound to the predefined namespace
     * "http://www.w3.org/XML/1998/namespace" [Namespaces].
     * @param namespaceURI The namespace URI of the element to
     *                     create.
     * @param qualifiedName The qualified name of the element type to
     *                      instantiate.
     * @return Element A new Element object with the following attributes:
     * @throws DOMException INVALID_CHARACTER_ERR: Raised if the specified
     * name contains an invalid character.
     * @throws DOMException NAMESPACE_ERR: Raised if the qualifiedName has a
     *                      prefix that is "xml" and the namespaceURI is
     *                      neither null nor an empty string nor
     *                      "http://www.w3.org/XML/1998/namespace", or
     *                      if the qualifiedName has a prefix different
     *                      from "xml" and the namespaceURI is null or an
     *                      empty string.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void removeIdentifier(String idName) {

    /**
     * Removes a previously registered element with the specified
     * identifier name.
     *
     * @see #putIdentifier
     * @see #getIdentifier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Element getIdentifier(String idName) {

    /**
     * Returns a previously registered element with the specified
     * identifier name, or null if no element is registered.
     *
     * @see #putIdentifier
     * @see #removeIdentifier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void putIdentifier(String idName, Element element) {

    /**
     * Registers an identifier name with a specified element node.
     * If the identifier is already registered, the new element
     * node replaces the previous node. If the specified element
     * node is null, removeIdentifier() is called.
     *
     * @see #getIdentifier
     * @see #removeIdentifier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected final void clearIdentifiers(){

    /**
     * Remove all identifiers from the ID table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Element getElementById(String elementId) {

    /**
     * Introduced in DOM Level 2
     * Returns the Element whose ID is given by elementId. If no such element
     * exists, returns null. Behavior is not defined if more than one element
     * has this ID.
     * <p>
     * Note: The DOM implementation must have information that says which
     * attributes are of type ID. Attributes with the name "ID" are not of type
     * ID unless so defined. Implementations that do not know whether
     * attributes are of type ID or not are expected to return null.
     * @see #getIdentifier
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected void undeferChildren(Node node) {

    /**
     * Traverses the DOM Tree and expands deferred nodes and their
     * children.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node adoptNode(Node source) {

    /**
     * DOM Level 3 WD - Experimental
     * Change the node's ownerDocument, and its subtree, to this Document
     *
     * @param source The node to adopt.
     * @see #importNode
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    private Node importNode(Node source, boolean deep, boolean cloningDoc,
            Map<Node, String> reversedIdentifiers)

    /**
     * Overloaded implementation of DOM's importNode method. This method
     * provides the core functionality for the public importNode and cloneNode
     * methods.
     *
     * The reversedIdentifiers parameter is provided for cloneNode to preserve
     * the document's identifiers. The Map has Elements as the keys and
     * their identifiers as the values. When an element is being imported, a
     * check is done for an associated identifier. If one exists, the identifier
     * is registered with the new, imported element. If reversedIdentifiers is
     * null, the parameter is not applied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node importNode(Node source, boolean deep)

    /**
     * Copies a node from another document to this document. The new nodes are
     * created using this document's factory methods and are populated with the
     * data from the source's accessor methods defined by the DOM interfaces.
     * Its behavior is otherwise similar to that of cloneNode.
     * <p>
     * According to the DOM specifications, document nodes cannot be imported
     * and a NOT_SUPPORTED_ERR exception is thrown if attempted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected int getNodeNumber(Node node) {

    /**
     * NON-DOM: Get a number associated with a node created with respect to this
     * document. Needed for compareDocumentPosition when nodes are disconnected.
     * This is only used on demand.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected int getNodeNumber() {

    /**
     * NON-DOM: Get the number associated with this document. Used to order
     * documents in the implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public ElementDefinitionImpl createElementDefinition(String name)

    /**
     * NON-DOM Factory method: creates an element definition. Element
     * definitions hold default attribute values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Notation createNotation(String name)

    /**
     * NON-DOM Factory method; creates a Notation having this Document as its
     * OwnerDoc. (REC-DOM-Level-1-19981001 left the process of building DTD
     * information unspecified.)
     *
     * @param name The name of the Notation we wish to describe
     *
     * @throws DOMException(NOT_SUPPORTED_ERR) for HTML documents, where
     * notations are not permitted. (HTML not yet implemented.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Entity createEntity(String name)

    /**
     * NON-DOM Factory method; creates an Entity having this Document as its
     * OwnerDoc. (REC-DOM-Level-1-19981001 left the process of building DTD
     * information unspecified.)
     *
     * @param name The name of the Entity we wish to provide a value for.
     *
     * @throws DOMException(NOT_SUPPORTED_ERR) for HTML documents, where
     * nonstandard entities are not permitted. (HTML not yet implemented.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public DocumentType createDocumentType(String qualifiedName,
            String publicID,
            String systemID)

    /**
     * NON-DOM Factory method; creates a DocumentType having this Document as
     * its OwnerDoc. (REC-DOM-Level-1-19981001 left the process of building DTD
     * information unspecified.)
     *
     * @param name The name of the Entity we wish to provide a value for.
     *
     * @throws DOMException(NOT_SUPPORTED_ERR) for HTML documents, where DTDs
     * are not permitted. (HTML not yet implemented.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    boolean getMutationEvents() {

    /**
     * Returns true if the DOM implementation generates mutation events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    void setMutationEvents(boolean set) {

    /**
     * Sets whether the DOM implementation generates mutation events upon
     * operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String saveXML(Node node)

    /**
     * DOM Level 3 WD - Experimental.
     * Save the document or the given node and all its descendants to a string
     * (i.e. serialize the document or node).
     * <br>The parameters used in the <code>LSSerializer</code> interface are
     * assumed to have their default values when invoking this method.
     * <br> The result of a call to this method is the same the result of a
     * call to <code>LSSerializer.writeToString</code> with the document as
     * the node to write.
     * @param node Specifies what to serialize, if this parameter is
     *   <code>null</code> the whole document is serialized, if it's
     *   non-null the given node is serialized.
     * @return The serialized document or <code>null</code> in case an error
     *   occurred.
     * @exception DOMException
     *   WRONG_DOCUMENT_ERR: Raised if the node passed in as the node
     *   parameter is from an other document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public boolean loadXML(String source) {

    /**
     * DOM Level 3 WD - Experimental.
     * Replace the content of the document with the result of parsing the
     * input string, this method is always synchronous.
     * @param source A string containing an XML document.
     * @return <code>true</code> if parsing the input string succeeded
     *   without errors, otherwise <code>false</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public boolean load(String uri) {

    /**
     * DOM Level 3 WD - Experimental.
     *
     * Replaces the content of the document with the result of parsing the
     * given URI. Invoking this method will either block the caller or
     * return to the caller immediately depending on the value of the async
     * attribute. Once the document is fully loaded a "load" event (as
     * defined in [<a href='http://www.w3.org/TR/2003/WD-DOM-Level-3-Events-20030331'>DOM Level 3 Events</a>]
     * , except that the <code>Event.targetNode</code> will be the document,
     * not an element) will be dispatched on the document. If an error
     * occurs, an implementation dependent "error" event will be dispatched
     * on the document. If this method is called on a document that is
     * currently loading, the current load is interrupted and the new URI
     * load is initiated.
     * <br> When invoking this method the parameters used in the
     * <code>DOMParser</code> interface are assumed to have their default
     * values with the exception that the parameters <code>"entities"</code>
     * , <code>"normalize-characters"</code>,
     * <code>"check-character-normalization"</code> are set to
     * <code>"false"</code>.
     * <br> The result of a call to this method is the same the result of a
     * call to <code>DOMParser.parseWithContext</code> with an input stream
     * referencing the URI that was passed to this call, the document as the
     * context node, and the action <code>ACTION_REPLACE_CHILDREN</code>.
     * @param uri The URI reference for the XML file to be loaded. If this is
     *  a relative URI, the base URI used by the implementation is
     *  implementation dependent.
     * @return If async is set to <code>true</code> <code>load</code> returns
     *   <code>true</code> if the document load was successfully initiated.
     *   If an error occurred when initiating the document load,
     *   <code>load</code> returns <code>false</code>.If async is set to
     *   <code>false</code> <code>load</code> returns <code>true</code> if
     *   the document was successfully loaded and parsed. If an error
     *   occurred when either loading or parsing the URI, <code>load</code>
     *   returns <code>false</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void abort() {

    /**
     * DOM Level 3 WD - Experimental.
     * If the document is currently being loaded as a result of the method
     * <code>load</code> being invoked the loading and parsing is
     * immediately aborted. The possibly partial result of parsing the
     * document is discarded and the document is cleared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setAsync(boolean async) {

    /**
     * DOM Level 3 WD - Experimental.
     * Indicates whether the method load should be synchronous or
     * asynchronous. When the async attribute is set to <code>true</code>
     * the load method returns control to the caller before the document has
     * completed loading. The default value of this property is
     * <code>false</code>.
     * <br>Setting the value of this attribute might throw NOT_SUPPORTED_ERR
     * if the implementation doesn't support the mode the attribute is being
     * set to. Should the DOM spec define the default value of this
     * property? What if implementing both async and sync IO is impractical
     * in some systems?  2001-09-14. default is <code>false</code> but we
     * need to check with Mozilla and IE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public boolean getAsync() {

    /**
     * DOM Level 3 WD - Experimental.
     * Indicates whether the method load should be synchronous or
     * asynchronous. When the async attribute is set to <code>true</code>
     * the load method returns control to the caller before the document has
     * completed loading. The default value of this property is
     * <code>false</code>.
     * <br>Setting the value of this attribute might throw NOT_SUPPORTED_ERR
     * if the implementation doesn't support the mode the attribute is being
     * set to. Should the DOM spec define the default value of this
     * property? What if implementing both async and sync IO is impractical
     * in some systems?  2001-09-14. default is <code>false</code> but we
     * need to check with Mozilla and IE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setDocumentURI(String documentURI){

    /**
     * DOM Level 3 WD - Experimental.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getBaseURI() {

    /**
     * Returns the absolute base URI of this node or null if the implementation
     * wasn't able to obtain an absolute URI. Note: If the URI is malformed, a
     * null is returned.
     *
     * @return The absolute base URI of this node or null.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public DOMConfiguration getDomConfig(){

    /**
     * DOM Level 3 CR - Experimental
     *
     *  The configuration used when <code>Document.normalizeDocument</code> is
     * invoked.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void normalizeDocument(){

    /**
     *  DOM Level 3 WD - Experimental
     *  Normalize document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node renameNode(Node n,String namespaceURI,String name)

    /**
     * DOM Level 3 WD - Experimental.
     * Renaming node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getDocumentURI(){

    /**
     * DOM Level 3 WD - Experimental.
     * The location of the document or <code>null</code> if undefined.
     * <br>Beware that when the <code>Document</code> supports the feature
     * "HTML" , the href attribute of the HTML BASE element takes precedence
     * over this attribute.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public boolean getStandalone() {

    /**
     * @deprecated This method is internal and only exists for
     * compatibility with older applications. New applications
     * should never call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public boolean getXmlStandalone() {

    /**
     * DOM Level 3 WD - Experimental.
     * standalone that specifies whether this document is standalone
     * (part of XML Declaration)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setStandalone(boolean value) {

    /**
     * @deprecated This method is internal and only exists for
     * compatibility with older applications. New applications
     * should never call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setXmlStandalone(boolean value)

    /**
     * DOM Level 3 CR - Experimental.
     *
     * Xmlstandalone - An attribute specifying, as part of the XML declaration,
     * whether this document is standalone
     * @exception DOMException
     *    NOT_SUPPORTED_ERR: Raised if this document does not support the
     *   "XML" feature.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getVersion() {

    /**
     * @deprecated This method is internal and only exists for
     * compatibility with older applications. New applications
     * should never call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getXmlVersion() {

    /**
     * DOM Level 3 WD - Experimental.
     * The version of this document (part of XML Declaration)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setVersion(String value) {

    /**
     * @deprecated This method is internal and only exists for
     * compatibility with older applications. New applications
     * should never call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setXmlVersion(String value) {

    /**
     * DOM Level 3 CR - Experimental.
     * version - An attribute specifying, as part of the XML declaration,
     * the version number of this document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getEncoding() {

    /**
     * @deprecated This method is internal and only exists for
     * compatibility with older applications. New applications
     * should never call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getXmlEncoding() {

    /**
     * DOM Level 3 WD - Experimental.
     * The encoding of this document (part of XML Declaration)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setEncoding(String value) {

    /**
     * @deprecated This method is internal and only exists for
     * compatibility with older applications. New applications
     * should never call this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setXmlEncoding(String value) {

    /**
     * DOM Internal
     * (Was a DOM L3 Core WD public interface method setXMLEncoding )
     *
     * An attribute specifying, as part of the XML declaration,
     * the encoding of this document. This is null when unspecified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setInputEncoding(String value) {

    /**
     * DOM Internal
     * (Was a DOM L3 Core WD public interface method setActualEncoding )
     *
     * An attribute specifying the actual encoding of this document. This is
     * <code>null</code> otherwise.
     * <br> This attribute represents the property [character encoding scheme]
     * defined in .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getInputEncoding() {

    /**
     * DOM Level 3 CR - Experimental. (Was getActualEncoding)
     *
     * An attribute specifying the encoding used for this document
     * at the time of the parsing. This is <code>null</code> when
     * it is not known, such as when the <code>Document</code> was
     * created in memory.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public boolean getErrorChecking() {

    /**
     * Returns true if the DOM implementation performs error checking.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public void setErrorChecking(boolean check) {

    /**
     * Sets whether the DOM implementation performs error checking
     * upon operations. Turning off error checking only affects
     * the following DOM checks:
     * <ul>
     * <li>Checking strings to make sure that all characters are
     *     legal XML characters
     * <li>Hierarchy checking such as allowed children, checks for
     *     cycles, etc.
     * </ul>
     * <p>
     * Turning off error checking does <em>not</em> turn off the
     * following checks:
     * <ul>
     * <li>Read only checks
     * <li>Checks related to DOM events
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public DOMImplementation getImplementation() {

    /**
     * Retrieve information describing the abilities of this particular
     * DOM implementation. Intended to support applications that may be
     * using DOMs retrieved from several different sources, potentially
     * with different underlying representations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public NodeList getElementsByTagName(String tagname) {

    /**
     * Return a <em>live</em> collection of all descendent Elements (not just
     * immediate children) having the specified tag name.
     *
     * @param tagname The type of Element we want to gather. "*" will be
     * taken as a wildcard, meaning "all elements in the document."
     *
     * @see DeepNodeListImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Element getDocumentElement() {

    /**
     * Convenience method, allowing direct access to the child node
     * which is considered the root of the actual document content. For
     * HTML, where it is legal to have more than one Element at the top
     * level of the document, we pick the one with the tagName
     * "HTML". For XML there should be only one top-level
     *
     * (HTML not yet supported.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public DocumentType getDoctype() {

    /**
     * For XML, this provides access to the Document Type Definition.
     * For HTML documents, and XML documents which don't specify a DTD,
     * it will be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Text createTextNode(String data) {

    /**
     * Factory method; creates a Text node having this Document as its
     * OwnerDoc.
     *
     * @param data The initial contents of the Text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public ProcessingInstruction createProcessingInstruction(String target,
            String data)

    /**
     * Factory method; creates a ProcessingInstruction having this Document
     * as its OwnerDoc.
     *
     * @param target The target "processor channel"
     * @param data Parameter string to be passed to the target.
     *
     * @throws DOMException(INVALID_NAME_ERR) if the target name is not
     * acceptable.
     *
     * @throws DOMException(NOT_SUPPORTED_ERR) for HTML documents. (HTML
     * not yet implemented.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public EntityReference createEntityReference(String name)

    /**
     * Factory method; creates an EntityReference having this Document
     * as its OwnerDoc.
     *
     * @param name The name of the Entity we wish to refer to
     *
     * @throws DOMException(NOT_SUPPORTED_ERR) for HTML documents, where
     * nonstandard entities are not permitted. (HTML not yet
     * implemented.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Element createElement(String tagName)

    /**
     * Factory method; creates an Element having this Document
     * as its OwnerDoc.
     *
     * @param tagName The name of the element type to instantiate. For
     * XML, this is case-sensitive. For HTML, the tagName parameter may
     * be provided in any case, but it must be mapped to the canonical
     * uppercase form by the DOM implementation.
     *
     * @throws DOMException(INVALID_NAME_ERR) if the tag name is not
     * acceptable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public DocumentFragment createDocumentFragment() {

    /**
     * Factory method; creates a DocumentFragment having this Document
     * as its OwnerDoc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Comment createComment(String data) {

    /**
     * Factory method; creates a Comment having this Document as its
     * OwnerDoc.
     *
     * @param data The initial contents of the Comment. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public CDATASection createCDATASection(String data)

    /**
     * Factory method; creates a CDATASection having this Document as
     * its OwnerDoc.
     *
     * @param data The initial contents of the CDATA
     *
     * @throws DOMException(NOT_SUPPORTED_ERR) for HTML documents. (HTML
     * not yet implemented.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Attr createAttribute(String name)

    /**
     * Factory method; creates an Attribute having this Document as its
     * OwnerDoc.
     *
     * @param name The name of the attribute. Note that the attribute's value is
     * _not_ established at the factory; remember to set it!
     *
     * @throws DOMException(INVALID_NAME_ERR)
     * if the attribute name is not acceptable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Object getFeature(String feature, String version) {

    /**
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node replaceChild(Node newChild, Node oldChild)

    /**
     * Since we cache the docElement (and, currently, docType),
     * replaceChild has to update the cache
     *
     * REVISIT: According to the spec it is not allowed to alter neither the
     * document element nor the document type in any way
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node removeChild(Node oldChild) throws DOMException {

    /**
     * Since insertBefore caches the docElement (and, currently, docType),
     * removeChild has to know how to undo the cache
     *
     * REVISIT: According to the spec it is not allowed to alter neither the
     * document element nor the document type in any way
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node insertBefore(Node newChild, Node refChild)

    /**
     * Since a Document may contain at most one top-level Element child,
     * and at most one DocumentType declaraction, we need to subclass our
     * add-children methods to implement this constraint.
     * Since appendChild() is implemented as insertBefore(,null),
     * altering the latter fixes both.
     * <p>
     * While I'm doing so, I've taken advantage of the opportunity to
     * cache documentElement and docType so we don't have to
     * search for them.
     *
     * REVISIT: According to the spec it is not allowed to alter neither the
     * document element nor the document type in any way
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected void cloneNode(CoreDocumentImpl newdoc, boolean deep) {

    /**
     * internal method to share code with subclass
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public Node cloneNode(boolean deep) {

    /**
     * Deep-clone a document, including fixing ownerDoc for the cloned
     * children. Note that this requires bypassing the WRONG_DOCUMENT_ERR
     * protection. I've chosen to implement it by calling importNode
     * which is DOM Level 2.
     *
     * @return org.w3c.dom.Node
     * @param deep boolean, iff true replicate children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public String getNodeName() {

    /** Returns the node name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public short getNodeType() {

    /** Returns the node type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public CoreDocumentImpl(DocumentType doctype, boolean grammarAccess) {

    /** For DOM2 support. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public CoreDocumentImpl(DocumentType doctype) {

    /**
     * For DOM2 support.
     * The createDocument factory method is in DOMImplementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public CoreDocumentImpl(boolean grammarAccess) {

    /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    public CoreDocumentImpl() {

    /**
     * NON-DOM: Actually creating a Document is outside the DOM's spec,
     * since it has to operate in terms of a particular implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    private static final ObjectStreamField[] serialPersistentFields =

    /**
     * @serialField docType DocumentTypeImpl document type
     * @serialField docElement ElementImpl document element
     * @serialField fFreeNLCache NodeListCache NodeListCache free list
     * @serialField encoding String Document encoding
     * @serialField actualEncoding String Document actualEncoding
     * @serialField version String Document version
     * @serialField standalone boolean Document standalone
     * @serialField fDocumentURI String Document URI
     * @serialField userData Hashtable user data attached to the nodes. Note that
     * it was original called "userData". It has been changed to nodeUserData to
     * avoid confusion with those that are actually values of the map.
     * @serialField identifiers Hashtable identifiers
     * @serialField changes int flag indicates whether the node has changed
     * @serialField allowGrammarAccess boolean Allow grammar access
     * @serialField errorChecking boolean Bypass error checking
     * @serialField ancestorChecking boolean Ancestor checking
     * @serialField xmlVersionChanged boolean Indicate whether the version has changed
     * @serialField documentNumber int Document number
     * @serialField nodeCounter int Node counter
     * @serialField nodeTable Hashtable Node table
     * @serialField xml11Version boolean XML version
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    // Document number.   Documents are ordered across the implementation using

    /** The following are required for compareDocumentPosition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected boolean errorChecking = true;

    /** Bypass error checking. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected boolean allowGrammarAccess;

    /** Allow grammar access. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected int changes = 0;

    /**
     * Number of alterations made to this document since its creation.
     * Serves as a "dirty bit" so that live objects such as NodeList can
     * recognize when an alteration has been made and discard its cached
     * state information.
     * <p>
     * Any method that alters the tree structure MUST cause or be
     * accompanied by a call to changed(), to inform it that any outstanding
     * NodeLists may have to be updated.
     * <p>
     * (Required because NodeList is simultaneously "live" and integer-
     * indexed -- a bad decision in the DOM's design.)
     * <p>
     * Note that changes which do not affect the tree's structure -- changing
     * the node's name, for example -- do _not_ have to call changed().
     * <p>
     * Alternative implementation would be to use a cryptographic
     * Digest value rather than a count. This would have the advantage that
     * "harmless" changes (those producing equal() trees) would not force
     * NodeList to resynchronize. Disadvantage is that it's slightly more prone
     * to "false negatives", though that's the difference between "wildly
     * unlikely" and "absurdly unlikely". IF we start maintaining digests,
     * we should consider taking advantage of them.
     *
     * Note: This used to be done a node basis, so that we knew what
     * subtree changed. But since only DeepNodeList really use this today,
     * the gain appears to be really small compared to the cost of having
     * an int on every (parent) node plus having to walk up the tree all the
     * way to the root to mark the branch as changed everytime a node is
     * changed.
     * So we now have a single counter global to the document. It means that
     * some objects may flush their cache more often than necessary, but this
     * makes nodes smaller and only the document needs to be marked as changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    private final static int[] kidOK;

    /** Table for quick check of child insertion. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected Map<String, Node> identifiers;

    /** Identifiers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    private Map<Node, Map<String, UserDataRecord>> nodeUserData;

    /** Table for user data attached to this document nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected String fDocumentURI;

    /**Experimental DOM Level 3 feature: documentURI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected boolean standalone;

    /**Experimental DOM Level 3 feature: Document standalone */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected String version;

    /**Experimental DOM Level 3 feature: Document version */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected String actualEncoding;

    /**Experimental DOM Level 3 feature: Document actualEncoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected String encoding;

    /**Experimental DOM Level 3 feature: Document encoding */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    transient NodeListCache fFreeNLCache;

    /** NodeListCache free list */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected ElementImpl docElement;

    /** Document element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    protected DocumentTypeImpl docType;

    /** Document type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    static final long serialVersionUID = 0;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
    //

    /**
     * TODO:: 1. Change XML11Char method names similar to XMLChar. That will
     * prevent lot of dirty version checking code.
     *
     * 2. IMO during cloneNode qname/isXMLName check should not be made.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDocumentImpl.java
public class CoreDocumentImpl

/**
 * The Document interface represents the entire HTML or XML document.
 * Conceptually, it is the root of the document tree, and provides the
 * primary access to the document's data.
 * <P>
 * Since elements, text nodes, comments, processing instructions,
 * etc. cannot exist outside the context of a Document, the Document
 * interface also contains the factory methods needed to create these
 * objects. The Node objects created have a ownerDocument attribute
 * which associates them with the Document within whose context they
 * were created.
 * <p>
 * The CoreDocumentImpl class only implements the DOM Core. Additional modules
 * are supported by the more complete DocumentImpl subclass.
 * <p>
 * <b>Note:</b> When any node in the document is serialized, the
 * entire document is serialized along with it.
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @author Ralf Pfeiffer, IBM
 * @version $Id: CoreDocumentImpl.java,v 1.9 2010-11-01 04:39:37 joehw Exp $
 * @since  PR-DOM-Level-1-19980818.
 */
