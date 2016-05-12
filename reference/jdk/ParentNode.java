_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
        private static final long serialVersionUID = 3258126977134310455L;

        /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    private void readObject(ObjectInputStream ois)

    /** Deserialize object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /** Serialize object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    void checkNormalizationAfterRemove(ChildNode previousSibling) {

    /**
     * Checks the normalized of this node after removing a child.
     * If the removed child causes this node to be unnormalized, then this
     * node is flagged accordingly.
     * The conditions for changing the normalized state are:
     * <ul>
     * <li>The removed child had two adjacent siblings that were text nodes.
     * </ul>
     *
     * @param previousSibling the previous sibling of the removed child, or
     * <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    void checkNormalizationAfterInsert(ChildNode insertedChild) {

    /**
     * Checks the normalized state of this node after inserting a child.
     * If the inserted child causes this node to be unnormalized, then this
     * node is flagged accordingly.
     * The conditions for changing the normalized state are:
     * <ul>
     * <li>The inserted child is a text node and one of its adjacent siblings
     * is also a text node.
     * <li>The inserted child is is itself unnormalized.
     * </ul>
     *
     * @param insertedChild the child node that was inserted into this node
     *
     * @throws NullPointerException if the inserted child is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    protected void synchronizeChildren() {

    /**
     * Override this method in subclass to hook in efficient
     * internal data structure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public void setReadOnly(boolean readOnly, boolean deep) {

    /**
     * Override default behavior so that if deep is true, children are also
     * toggled.
     * @see Node
     * <P>
     * Note: this will not change the state of an EntityReference or its
     * children, which are always read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public boolean isEqualNode(Node arg) {

    /**
     * DOM Level 3 WD- Experimental.
     * Override inherited behavior from NodeImpl to support deep equal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public void normalize() {

    /**
     * Override default behavior to call normalize() on this Node's
     * children. It is up to implementors or Node to override normalize()
     * to take action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
                public Node item(int index) {

                /**
                 * @see NodeList.item(int)
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
                public int getLength() {

                /**
                 * @see NodeList.getLength()
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    protected final NodeList getChildNodesUnoptimized() {

    /**
     * Create a NodeList to access children that is use by subclass elements
     * that have methods named getLength() or item(int).  ChildAndParentNode
     * optimizes getChildNodes() by implementing NodeList itself.  However if
     * a subclass Element implements methods with the same name as the NodeList
     * methods, they will override the actually methods in this class.
     * <p>
     * To use this method, the subclass should implement getChildNodes() and
     * have it call this method.  The resulting NodeList instance maybe
     * shared and cached in a transient field, but the cached value must be
     * cleared if the node is cloned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node item(int index) {

    /**
     * NodeList method: Return the Nth immediate child of this node, or
     * null if the index is out of bounds.
     * @return org.w3c.dom.Node
     * @param index int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    private Node nodeListItem(int index) {

    /**
     * Return the Nth immediate child of this node, or null if the index is
     * out of bounds.  Use to implement NodeList.item().
     * @param index int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public int getLength() {

    /**
     * NodeList method: Count the immediate children of this node
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    private int nodeListGetLength() {

    /**
     * Count the immediate children of this node.  Use to implement
     * NodeList.getLength().
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node replaceChild(Node newChild, Node oldChild)

    /**
     * Make newChild occupy the location that oldChild used to
     * have. Note that newChild will first be removed from its previous
     * parent, if any. Equivalent to inserting newChild before oldChild,
     * then removing oldChild.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    Node internalRemoveChild(Node oldChild, boolean replace)

    /** NON-DOM INTERNAL: Within DOM actions,we sometimes need to be able
     * to control which mutation events are spawned. This version of the
     * removeChild operation allows us to do so. It is not intended
     * for use by application programs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node removeChild(Node oldChild)

    /**
     * Remove a child from this Node. The removed child's subtree
     * remains intact so it may be re-inserted elsewhere.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    Node internalInsertBefore(Node newChild, Node refChild, boolean replace)

    /** NON-DOM INTERNAL: Within DOM actions,we sometimes need to be able
     * to control which mutation events are spawned. This version of the
     * insertBefore operation allows us to do so. It is not intended
     * for use by application programs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node insertBefore(Node newChild, Node refChild)

    /**
     * Move one or more node(s) to our list of children. Note that this
     * implicitly removes them from their previous parent.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node getLastChild() {

    /** The last child of this Node, or null if none. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node getFirstChild() {

    /** The first child of this Node, or null if none. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public boolean hasChildNodes() {

    /**
     * Test whether this node has any children. Convenience shorthand
     * for (Node.getFirstChild()!=null)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    void setOwnerDocument(CoreDocumentImpl doc) {

    /**
     * NON-DOM
     * set the ownerDocument of this node and its children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    CoreDocumentImpl ownerDocument() {

    /**
     * same as above but returns internal type and this one is not overridden
     * by CoreDocumentImpl to return null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Document getOwnerDocument() {

    /**
     * Find the Document that this Node belongs to (the document in
     * whose context the Node was created). The Node may or may not
     * currently be part of that Document's actual contents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node cloneNode(boolean deep) {

    /**
     * Returns a duplicate of a given node. You can consider this a
     * generic "copy constructor" for nodes. The newly returned object should
     * be completely independent of the source object's subtree, so changes
     * in one after the clone has been made will not affect the other.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public ParentNode() {}

    /** Constructor for serialization. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    protected ParentNode(CoreDocumentImpl ownerDocument) {

    /**
     * No public constructor; only subclasses of ParentNode should be
     * instantiated, and those normally via a Document's factory methods
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    protected transient NodeListCache fNodeListCache = null;

    /** NodeList cache */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    protected ChildNode firstChild = null;

    /** First child. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    protected CoreDocumentImpl ownerDocument;

    /** Owner document. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    static final long serialVersionUID = 2815829867152120872L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
public abstract class ParentNode

/**
 * ParentNode inherits from ChildNode and adds the capability of having child
 * nodes. Not every node in the DOM can have children, so only nodes that can
 * should inherit from this class and pay the price for it.
 * <P>
 * ParentNode, just like NodeImpl, also implements NodeList, so it can
 * return itself in response to the getChildNodes() query. This eliminiates
 * the need for a separate ChildNodeList object. Note that this is an
 * IMPLEMENTATION DETAIL; applications should _never_ assume that
 * this identity exists. On the other hand, subclasses may need to override
 * this, in case of conflicting names. This is the case for the classes
 * HTMLSelectElementImpl and HTMLFormElementImpl of the HTML DOM.
 * <P>
 * While we have a direct reference to the first child, the last child is
 * stored as the previous sibling of the first child. First child nodes are
 * marked as being so, and getNextSibling hides this fact.
 * <P>Note: Not all parent nodes actually need to also be a child. At some
 * point we used to have ParentNode inheriting from NodeImpl and another class
 * called ChildAndParentNode that inherited from ChildNode. But due to the lack
 * of multiple inheritance a lot of code had to be duplicated which led to a
 * maintenance nightmare. At the same time only a few nodes (Document,
 * DocumentFragment, Entity, and Attribute) cannot be a child so the gain in
 * memory wasn't really worth it. The only type for which this would be the
 * case is Attribute, but we deal with there in another special way, so this is
 * not applicable.
 * <p>
 * This class doesn't directly support mutation events, however, it notifies
 * the document when mutations are performed so that the document class do so.
 *
 * <p><b>WARNING</b>: Some of the code here is partially duplicated in
 * AttrImpl, be careful to keep these two classes in sync!
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @version $Id: ParentNode.java,v 1.6 2009/07/21 20:30:28 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
        private static final long serialVersionUID = 3258126977134310455L;

        /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    private void readObject(ObjectInputStream ois)

    /** Deserialize object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /** Serialize object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    void checkNormalizationAfterRemove(ChildNode previousSibling) {

    /**
     * Checks the normalized of this node after removing a child.
     * If the removed child causes this node to be unnormalized, then this
     * node is flagged accordingly.
     * The conditions for changing the normalized state are:
     * <ul>
     * <li>The removed child had two adjacent siblings that were text nodes.
     * </ul>
     *
     * @param previousSibling the previous sibling of the removed child, or
     * <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    void checkNormalizationAfterInsert(ChildNode insertedChild) {

    /**
     * Checks the normalized state of this node after inserting a child.
     * If the inserted child causes this node to be unnormalized, then this
     * node is flagged accordingly.
     * The conditions for changing the normalized state are:
     * <ul>
     * <li>The inserted child is a text node and one of its adjacent siblings
     * is also a text node.
     * <li>The inserted child is is itself unnormalized.
     * </ul>
     *
     * @param insertedChild the child node that was inserted into this node
     *
     * @throws NullPointerException if the inserted child is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    protected void synchronizeChildren() {

    /**
     * Override this method in subclass to hook in efficient
     * internal data structure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public void setReadOnly(boolean readOnly, boolean deep) {

    /**
     * Override default behavior so that if deep is true, children are also
     * toggled.
     * @see Node
     * <P>
     * Note: this will not change the state of an EntityReference or its
     * children, which are always read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public boolean isEqualNode(Node arg) {

    /**
     * DOM Level 3 WD- Experimental.
     * Override inherited behavior from NodeImpl to support deep equal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public void normalize() {

    /**
     * Override default behavior to call normalize() on this Node's
     * children. It is up to implementors or Node to override normalize()
     * to take action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
                public Node item(int index) {

                /**
                 * @see NodeList.item(int)
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
                public int getLength() {

                /**
                 * @see NodeList.getLength()
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    protected final NodeList getChildNodesUnoptimized() {

    /**
     * Create a NodeList to access children that is use by subclass elements
     * that have methods named getLength() or item(int).  ChildAndParentNode
     * optimizes getChildNodes() by implementing NodeList itself.  However if
     * a subclass Element implements methods with the same name as the NodeList
     * methods, they will override the actually methods in this class.
     * <p>
     * To use this method, the subclass should implement getChildNodes() and
     * have it call this method.  The resulting NodeList instance maybe
     * shared and cached in a transient field, but the cached value must be
     * cleared if the node is cloned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node item(int index) {

    /**
     * NodeList method: Return the Nth immediate child of this node, or
     * null if the index is out of bounds.
     * @return org.w3c.dom.Node
     * @param index int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    private Node nodeListItem(int index) {

    /**
     * Return the Nth immediate child of this node, or null if the index is
     * out of bounds.  Use to implement NodeList.item().
     * @param index int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public int getLength() {

    /**
     * NodeList method: Count the immediate children of this node
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    private int nodeListGetLength() {

    /**
     * Count the immediate children of this node.  Use to implement
     * NodeList.getLength().
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node replaceChild(Node newChild, Node oldChild)

    /**
     * Make newChild occupy the location that oldChild used to
     * have. Note that newChild will first be removed from its previous
     * parent, if any. Equivalent to inserting newChild before oldChild,
     * then removing oldChild.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    Node internalRemoveChild(Node oldChild, boolean replace)

    /** NON-DOM INTERNAL: Within DOM actions,we sometimes need to be able
     * to control which mutation events are spawned. This version of the
     * removeChild operation allows us to do so. It is not intended
     * for use by application programs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node removeChild(Node oldChild)

    /**
     * Remove a child from this Node. The removed child's subtree
     * remains intact so it may be re-inserted elsewhere.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    Node internalInsertBefore(Node newChild, Node refChild, boolean replace)

    /** NON-DOM INTERNAL: Within DOM actions,we sometimes need to be able
     * to control which mutation events are spawned. This version of the
     * insertBefore operation allows us to do so. It is not intended
     * for use by application programs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node insertBefore(Node newChild, Node refChild)

    /**
     * Move one or more node(s) to our list of children. Note that this
     * implicitly removes them from their previous parent.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node getLastChild() {

    /** The last child of this Node, or null if none. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node getFirstChild() {

    /** The first child of this Node, or null if none. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public boolean hasChildNodes() {

    /**
     * Test whether this node has any children. Convenience shorthand
     * for (Node.getFirstChild()!=null)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    void setOwnerDocument(CoreDocumentImpl doc) {

    /**
     * NON-DOM
     * set the ownerDocument of this node and its children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    CoreDocumentImpl ownerDocument() {

    /**
     * same as above but returns internal type and this one is not overridden
     * by CoreDocumentImpl to return null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Document getOwnerDocument() {

    /**
     * Find the Document that this Node belongs to (the document in
     * whose context the Node was created). The Node may or may not
     * currently be part of that Document's actual contents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public Node cloneNode(boolean deep) {

    /**
     * Returns a duplicate of a given node. You can consider this a
     * generic "copy constructor" for nodes. The newly returned object should
     * be completely independent of the source object's subtree, so changes
     * in one after the clone has been made will not affect the other.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    public ParentNode() {}

    /** Constructor for serialization. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    protected ParentNode(CoreDocumentImpl ownerDocument) {

    /**
     * No public constructor; only subclasses of ParentNode should be
     * instantiated, and those normally via a Document's factory methods
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    protected transient NodeListCache fNodeListCache = null;

    /** NodeList cache */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    protected ChildNode firstChild = null;

    /** First child. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    protected CoreDocumentImpl ownerDocument;

    /** Owner document. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
    static final long serialVersionUID = 2815829867152120872L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ParentNode.java
public abstract class ParentNode

/**
 * ParentNode inherits from ChildNode and adds the capability of having child
 * nodes. Not every node in the DOM can have children, so only nodes that can
 * should inherit from this class and pay the price for it.
 * <P>
 * ParentNode, just like NodeImpl, also implements NodeList, so it can
 * return itself in response to the getChildNodes() query. This eliminiates
 * the need for a separate ChildNodeList object. Note that this is an
 * IMPLEMENTATION DETAIL; applications should _never_ assume that
 * this identity exists. On the other hand, subclasses may need to override
 * this, in case of conflicting names. This is the case for the classes
 * HTMLSelectElementImpl and HTMLFormElementImpl of the HTML DOM.
 * <P>
 * While we have a direct reference to the first child, the last child is
 * stored as the previous sibling of the first child. First child nodes are
 * marked as being so, and getNextSibling hides this fact.
 * <P>Note: Not all parent nodes actually need to also be a child. At some
 * point we used to have ParentNode inheriting from NodeImpl and another class
 * called ChildAndParentNode that inherited from ChildNode. But due to the lack
 * of multiple inheritance a lot of code had to be duplicated which led to a
 * maintenance nightmare. At the same time only a few nodes (Document,
 * DocumentFragment, Entity, and Attribute) cannot be a child so the gain in
 * memory wasn't really worth it. The only type for which this would be the
 * case is Attribute, but we deal with there in another special way, so this is
 * not applicable.
 * <p>
 * This class doesn't directly support mutation events, however, it notifies
 * the document when mutations are performed so that the document class do so.
 *
 * <p><b>WARNING</b>: Some of the code here is partially duplicated in
 * AttrImpl, be careful to keep these two classes in sync!
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @version $Id: ParentNode.java,v 1.6 2009/07/21 20:30:28 joehw Exp $
 */
