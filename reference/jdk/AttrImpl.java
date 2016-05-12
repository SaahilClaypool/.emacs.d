_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    private void readObject(ObjectInputStream ois)

    /** Deserialize object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /** Serialize object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    protected void synchronizeChildren() {

    /**
     * Override this method in subclass to hook in efficient
     * internal data structure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public boolean isDerivedFrom(String typeNamespaceArg,
                                 String typeNameArg,
                                 int derivationMethod) {

    /**
     * Introduced in DOM Level 3. <p>
     * Checks if a type is derived from another by restriction. See:
     * http://www.w3.org/TR/DOM-Level-3-Core/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *        The namspace of the ancestor type declaration
     * @param ancestorName
     *        The name of the ancestor type declaration
     * @param type
     *        The reference type definition
     *
     * @return boolean True if the type is derived by restriciton for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public boolean isEqualNode(Node arg) {

    /**
     * DOM Level 3 WD- Experimental.
     * Override inherited behavior from ParentNode to support deep equal.
     * isEqualNode is always deep on Attr nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public Node item(int index) {

    /**
     * NodeList method: Return the Nth immediate child of this node, or
     * null if the index is out of bounds.
     * @return org.w3c.dom.Node
     * @param Index int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public int getLength() {

    /**
     * NodeList method: Count the immediate children of this node
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    Node internalRemoveChild(Node oldChild, boolean replace)

    /** NON-DOM INTERNAL: Within DOM actions,we sometimes need to be able
     * to control which mutation events are spawned. This version of the
     * removeChild operation allows us to do so. It is not intended
     * for use by application programs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    Node internalInsertBefore(Node newChild, Node refChild, boolean replace)

    /** NON-DOM INTERNAL: Within DOM actions,we sometimes need to be able
     * to control which mutation events are spawned. This version of the
     * insertBefore operation allows us to do so. It is not intended
     * for use by application programs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public Node getLastChild() {

    /** The last child of this Node, or null if none. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public Node getFirstChild() {

    /** The first child of this Node, or null if none. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public boolean hasChildNodes() {

    /**
     * Test whether this node has any children. Convenience shorthand
     * for (Node.getFirstChild()!=null)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String toString() {

    /** NON-DOM method for debugging convenience */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public void setType (Object type){

        /**
         * NON-DOM: used by the parser
         * @param type
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public void setSpecified(boolean arg) {

    /** NON-DOM, for use by parser */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public Element getOwnerElement() {

    /**
     * Returns the element node that this attribute is associated with,
     * or null if the attribute has not been added to an element.
     *
     * @since WD-DOM-Level-2-19990719
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public Element getElement() {

    /**
     * Returns the element node that this attribute is associated with,
     * or null if the attribute has not been added to an element.
     *
     * @see #getOwnerElement
     *
     * @deprecated Previous working draft of DOM Level 2. New method
     *             is <tt>getOwnerElement()</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public boolean getSpecified() {

    /**
     * The "specified" flag is true if and only if this attribute's
     * value was explicitly specified in the original document. Note that
     * the implementation, not the user, is in charge of this
     * property. If the user asserts an Attribute value (even if it ends
     * up having the same value as the default), it is considered a
     * specified attribute. If you really want to revert to the default,
     * delete the attribute from the Element, and the Implementation will
     * re-assert the default (if any) in its place, with the appropriate
     * specified=false setting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String getValue() {

    /**
     * The "string value" of an Attribute is its text representation,
     * which in turn is a concatenation of the string values of its children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public void setValue(String newvalue) {

    /**
     * The DOM doesn't clearly define what setValue(null) means. I've taken it
     * as "remove all children", which from outside should appear
     * similar to setting it to the empty string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String getName() {

    /**
     * In Attributes, NodeName is considered a synonym for the
     * attribute's Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String getNodeValue() {

    /**
     * In Attribute objects, NodeValue is considered a synonym for
     * Value.
     *
     * @see #getValue()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public TypeInfo getSchemaTypeInfo(){

    /**
     * Method getSchemaTypeInfo.
     * @return TypeInfo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String getTypeNamespace() {

    /**
     * @see org.w3c.dom.TypeInfo#getTypeNamespace()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String getTypeName() {

    /**
     * @see org.w3c.dom.TypeInfo#getTypeName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public void setNodeValue(String value) throws DOMException {

    /**
     * Implicit in the rerouting of getNodeValue to getValue is the
     * need to redefine setNodeValue, for symmetry's sake.  Note that
     * since we're explicitly providing a value, Specified should be set
     * true.... even if that value equals the default.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String getNodeName() {

    /**
     * Returns the attribute name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public boolean isId(){

    /** DOM Level 3: isId*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public void setIdAttribute(boolean id){

    /**
     * NON-DOM: set the type of this attribute to be ID type.
     *
     * @param id
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    void setOwnerDocument(CoreDocumentImpl doc) {

    /**
     * NON-DOM
     * set the ownerDocument of this node and its children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
        isSpecified(true);

        /** False for default attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    protected AttrImpl(CoreDocumentImpl ownerDocument, String name) {

    /**
     * Attribute has no public constructor. Please use the factory
     * method in the Document class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    // REVISIT: we are losing the type information in DOM during serialization

    /** Type information */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    protected String name;

    /** Attribute name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    protected Object value = null;

    /** This can either be a String or the first child node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    static final String DTD_URI = "http://www.w3.org/TR/REC-xml";

    /** DTD namespace. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    static final long serialVersionUID = 7277707688218972102L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
public class AttrImpl

/**
 * Attribute represents an XML-style attribute of an
 * Element. Typically, the allowable values are controlled by its
 * declaration in the Document Type Definition (DTD) governing this
 * kind of document.
 * <P>
 * If the attribute has not been explicitly assigned a value, but has
 * been declared in the DTD, it will exist and have that default. Only
 * if neither the document nor the DTD specifies a value will the
 * Attribute really be considered absent and have no value; in that
 * case, querying the attribute will return null.
 * <P>
 * Attributes may have multiple children that contain their data. (XML
 * allows attributes to contain entity references, and tokenized
 * attribute types such as NMTOKENS may have a child for each token.)
 * For convenience, the Attribute object's getValue() method returns
 * the string version of the attribute's value.
 * <P>
 * Attributes are not children of the Elements they belong to, in the
 * usual sense, and have no valid Parent reference. However, the spec
 * says they _do_ belong to a specific Element, and an INUSE exception
 * is to be thrown if the user attempts to explicitly share them
 * between elements.
 * <P>
 * Note that Elements do not permit attributes to appear to be shared
 * (see the INUSE exception), so this object's mutability is
 * officially not an issue.
 * <p>
 * Note: The ownerNode attribute is used to store the Element the Attr
 * node is associated with. Attr nodes do not have parent nodes.
 * Besides, the getOwnerElement() method can be used to get the element node
 * this attribute is associated with.
 * <P>
 * AttrImpl does not support Namespaces. AttrNSImpl, which inherits from
 * it, does.
 *
 * <p>AttrImpl used to inherit from ParentNode. It now directly inherits from
 * NodeImpl and provide its own implementation of the ParentNode's behavior.
 * The reason is that we now try and avoid to always create a Text node to
 * hold the value of an attribute. The DOM spec requires it, so we still have
 * to do it in case getFirstChild() is called for instance. The reason
 * attribute values are stored as a list of nodes is so that they can carry
 * more than a simple string. They can also contain EntityReference nodes.
 * However, most of the times people only have a single string that they only
 * set and get through Element.set/getAttribute or Attr.set/getValue. In this
 * new version, the Attr node has a value pointer which can either be the
 * String directly or a pointer to the first ChildNode. A flag tells which one
 * it currently is. Note that while we try to stick with the direct String as
 * much as possible once we've switched to a node there is no going back. This
 * is because we have no way to know whether the application keeps referring to
 * the node we once returned.
 * <p> The gain in memory varies on the density of attributes in the document.
 * But in the tests I've run I've seen up to 12% of memory gain. And the good
 * thing is that it also leads to a slight gain in speed because we allocate
 * fewer objects! I mean, that's until we have to actually create the node...
 * <p>
 * To avoid too much duplicated code, I got rid of ParentNode and renamed
 * ChildAndParentNode, which I never really liked, to ParentNode for
 * simplicity, this doesn't make much of a difference in memory usage because
 * there are only very few objects that are only a Parent. This is only true
 * now because AttrImpl now inherits directly from NodeImpl and has its own
 * implementation of the ParentNode's node behavior. So there is still some
 * duplicated code there.
 * <p>
 * This class doesn't directly support mutation events, however, it notifies
 * the document when mutations are performed so that the document class do so.
 *
 * <p><b>WARNING</b>: Some of the code here is partially duplicated in
 * ParentNode, be careful to keep these two classes in sync!
 *
 * @xerces.internal
 *
 * @see AttrNSImpl
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @version $Id: AttrImpl.java,v 1.5 2008/06/10 00:59:32 joehw Exp $
 * @since PR-DOM-Level-1-19980818.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/AttrImpl.java
    public String toString() {

    /** NON-DOM method for debugging convenience */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/AttrImpl.java
    public TypeInfo getSchemaTypeInfo(){

    /**
     * Method getSchemaTypeInfo.
     * @return TypeInfo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/AttrImpl.java
    public boolean isId(){

    /**
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/AttrImpl.java
    public AttrImpl(Element element, String prefix, String localpart, String rawname, String uri, String value) {

    /**
     * Constructs an attribute.
     *
     * @param element Element which owns this attribute
     * @param prefix The QName prefix.
     * @param localpart The QName localpart.
     * @param rawname The QName rawname.
     * @param uri The uri binding for the associated prefix.
     * @param value The value of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/AttrImpl.java
    public AttrImpl() {

    /** Default Constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/AttrImpl.java
public class AttrImpl extends NodeImpl

/**
 * This class represents a single attribute.
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 * @version $Id: AttrImpl.java,v 1.5 2010-11-01 04:40:01 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    private void readObject(ObjectInputStream ois)

    /** Deserialize object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /** Serialize object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    protected void synchronizeChildren() {

    /**
     * Override this method in subclass to hook in efficient
     * internal data structure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public boolean isDerivedFrom(String typeNamespaceArg,
                                 String typeNameArg,
                                 int derivationMethod) {

    /**
     * Introduced in DOM Level 3. <p>
     * Checks if a type is derived from another by restriction. See:
     * http://www.w3.org/TR/DOM-Level-3-Core/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *        The namspace of the ancestor type declaration
     * @param ancestorName
     *        The name of the ancestor type declaration
     * @param type
     *        The reference type definition
     *
     * @return boolean True if the type is derived by restriciton for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public boolean isEqualNode(Node arg) {

    /**
     * DOM Level 3 WD- Experimental.
     * Override inherited behavior from ParentNode to support deep equal.
     * isEqualNode is always deep on Attr nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public Node item(int index) {

    /**
     * NodeList method: Return the Nth immediate child of this node, or
     * null if the index is out of bounds.
     * @return org.w3c.dom.Node
     * @param Index int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public int getLength() {

    /**
     * NodeList method: Count the immediate children of this node
     * @return int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    Node internalRemoveChild(Node oldChild, boolean replace)

    /** NON-DOM INTERNAL: Within DOM actions,we sometimes need to be able
     * to control which mutation events are spawned. This version of the
     * removeChild operation allows us to do so. It is not intended
     * for use by application programs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    Node internalInsertBefore(Node newChild, Node refChild, boolean replace)

    /** NON-DOM INTERNAL: Within DOM actions,we sometimes need to be able
     * to control which mutation events are spawned. This version of the
     * insertBefore operation allows us to do so. It is not intended
     * for use by application programs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public Node getLastChild() {

    /** The last child of this Node, or null if none. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public Node getFirstChild() {

    /** The first child of this Node, or null if none. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public boolean hasChildNodes() {

    /**
     * Test whether this node has any children. Convenience shorthand
     * for (Node.getFirstChild()!=null)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String toString() {

    /** NON-DOM method for debugging convenience */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public void setType (Object type){

        /**
         * NON-DOM: used by the parser
         * @param type
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public void setSpecified(boolean arg) {

    /** NON-DOM, for use by parser */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public Element getOwnerElement() {

    /**
     * Returns the element node that this attribute is associated with,
     * or null if the attribute has not been added to an element.
     *
     * @since WD-DOM-Level-2-19990719
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public Element getElement() {

    /**
     * Returns the element node that this attribute is associated with,
     * or null if the attribute has not been added to an element.
     *
     * @see #getOwnerElement
     *
     * @deprecated Previous working draft of DOM Level 2. New method
     *             is <tt>getOwnerElement()</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public boolean getSpecified() {

    /**
     * The "specified" flag is true if and only if this attribute's
     * value was explicitly specified in the original document. Note that
     * the implementation, not the user, is in charge of this
     * property. If the user asserts an Attribute value (even if it ends
     * up having the same value as the default), it is considered a
     * specified attribute. If you really want to revert to the default,
     * delete the attribute from the Element, and the Implementation will
     * re-assert the default (if any) in its place, with the appropriate
     * specified=false setting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String getValue() {

    /**
     * The "string value" of an Attribute is its text representation,
     * which in turn is a concatenation of the string values of its children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public void setValue(String newvalue) {

    /**
     * The DOM doesn't clearly define what setValue(null) means. I've taken it
     * as "remove all children", which from outside should appear
     * similar to setting it to the empty string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String getName() {

    /**
     * In Attributes, NodeName is considered a synonym for the
     * attribute's Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String getNodeValue() {

    /**
     * In Attribute objects, NodeValue is considered a synonym for
     * Value.
     *
     * @see #getValue()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public TypeInfo getSchemaTypeInfo(){

    /**
     * Method getSchemaTypeInfo.
     * @return TypeInfo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String getTypeNamespace() {

    /**
     * @see org.w3c.dom.TypeInfo#getTypeNamespace()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String getTypeName() {

    /**
     * @see org.w3c.dom.TypeInfo#getTypeName()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public void setNodeValue(String value) throws DOMException {

    /**
     * Implicit in the rerouting of getNodeValue to getValue is the
     * need to redefine setNodeValue, for symmetry's sake.  Note that
     * since we're explicitly providing a value, Specified should be set
     * true.... even if that value equals the default.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public String getNodeName() {

    /**
     * Returns the attribute name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public boolean isId(){

    /** DOM Level 3: isId*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    public void setIdAttribute(boolean id){

    /**
     * NON-DOM: set the type of this attribute to be ID type.
     *
     * @param id
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    void setOwnerDocument(CoreDocumentImpl doc) {

    /**
     * NON-DOM
     * set the ownerDocument of this node and its children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
        isSpecified(true);

        /** False for default attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    protected AttrImpl(CoreDocumentImpl ownerDocument, String name) {

    /**
     * Attribute has no public constructor. Please use the factory
     * method in the Document class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    // REVISIT: we are losing the type information in DOM during serialization

    /** Type information */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    protected String name;

    /** Attribute name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    protected Object value = null;

    /** This can either be a String or the first child node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    static final String DTD_URI = "http://www.w3.org/TR/REC-xml";

    /** DTD namespace. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
    static final long serialVersionUID = 7277707688218972102L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttrImpl.java
public class AttrImpl

/**
 * Attribute represents an XML-style attribute of an
 * Element. Typically, the allowable values are controlled by its
 * declaration in the Document Type Definition (DTD) governing this
 * kind of document.
 * <P>
 * If the attribute has not been explicitly assigned a value, but has
 * been declared in the DTD, it will exist and have that default. Only
 * if neither the document nor the DTD specifies a value will the
 * Attribute really be considered absent and have no value; in that
 * case, querying the attribute will return null.
 * <P>
 * Attributes may have multiple children that contain their data. (XML
 * allows attributes to contain entity references, and tokenized
 * attribute types such as NMTOKENS may have a child for each token.)
 * For convenience, the Attribute object's getValue() method returns
 * the string version of the attribute's value.
 * <P>
 * Attributes are not children of the Elements they belong to, in the
 * usual sense, and have no valid Parent reference. However, the spec
 * says they _do_ belong to a specific Element, and an INUSE exception
 * is to be thrown if the user attempts to explicitly share them
 * between elements.
 * <P>
 * Note that Elements do not permit attributes to appear to be shared
 * (see the INUSE exception), so this object's mutability is
 * officially not an issue.
 * <p>
 * Note: The ownerNode attribute is used to store the Element the Attr
 * node is associated with. Attr nodes do not have parent nodes.
 * Besides, the getOwnerElement() method can be used to get the element node
 * this attribute is associated with.
 * <P>
 * AttrImpl does not support Namespaces. AttrNSImpl, which inherits from
 * it, does.
 *
 * <p>AttrImpl used to inherit from ParentNode. It now directly inherits from
 * NodeImpl and provide its own implementation of the ParentNode's behavior.
 * The reason is that we now try and avoid to always create a Text node to
 * hold the value of an attribute. The DOM spec requires it, so we still have
 * to do it in case getFirstChild() is called for instance. The reason
 * attribute values are stored as a list of nodes is so that they can carry
 * more than a simple string. They can also contain EntityReference nodes.
 * However, most of the times people only have a single string that they only
 * set and get through Element.set/getAttribute or Attr.set/getValue. In this
 * new version, the Attr node has a value pointer which can either be the
 * String directly or a pointer to the first ChildNode. A flag tells which one
 * it currently is. Note that while we try to stick with the direct String as
 * much as possible once we've switched to a node there is no going back. This
 * is because we have no way to know whether the application keeps referring to
 * the node we once returned.
 * <p> The gain in memory varies on the density of attributes in the document.
 * But in the tests I've run I've seen up to 12% of memory gain. And the good
 * thing is that it also leads to a slight gain in speed because we allocate
 * fewer objects! I mean, that's until we have to actually create the node...
 * <p>
 * To avoid too much duplicated code, I got rid of ParentNode and renamed
 * ChildAndParentNode, which I never really liked, to ParentNode for
 * simplicity, this doesn't make much of a difference in memory usage because
 * there are only very few objects that are only a Parent. This is only true
 * now because AttrImpl now inherits directly from NodeImpl and has its own
 * implementation of the ParentNode's node behavior. So there is still some
 * duplicated code there.
 * <p>
 * This class doesn't directly support mutation events, however, it notifies
 * the document when mutations are performed so that the document class do so.
 *
 * <p><b>WARNING</b>: Some of the code here is partially duplicated in
 * ParentNode, be careful to keep these two classes in sync!
 *
 * @xerces.internal
 *
 * @see AttrNSImpl
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @version $Id: AttrImpl.java,v 1.5 2008/06/10 00:59:32 joehw Exp $
 * @since PR-DOM-Level-1-19980818.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/AttrImpl.java
    public String toString() {

    /** NON-DOM method for debugging convenience */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/AttrImpl.java
    public TypeInfo getSchemaTypeInfo(){

    /**
     * Method getSchemaTypeInfo.
     * @return TypeInfo
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/AttrImpl.java
    public boolean isId(){

    /**
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/AttrImpl.java
    public AttrImpl(Element element, String prefix, String localpart, String rawname, String uri, String value) {

    /**
     * Constructs an attribute.
     *
     * @param element Element which owns this attribute
     * @param prefix The QName prefix.
     * @param localpart The QName localpart.
     * @param rawname The QName rawname.
     * @param uri The uri binding for the associated prefix.
     * @param value The value of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/AttrImpl.java
    public AttrImpl() {

    /** Default Constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/AttrImpl.java
public class AttrImpl extends NodeImpl

/**
 * This class represents a single attribute.
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 * @version $Id: AttrImpl.java,v 1.5 2010-11-01 04:40:01 joehw Exp $
 */
