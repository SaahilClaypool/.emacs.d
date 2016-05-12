_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public void removeAll (){

    /**
      * NON-DOM remove all elements from this map
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected ArrayList cloneMap(ArrayList list) {

    /**
     * NON-DOM: copy content of this map into the specified ArrayList
     *
     * @param list   ArrayList to copy information into.
     * @return A copy of this node named map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected void removeItem(int index) {

    /**
      * NON-DOM: Remove attribute at specified index
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected int findNamePoint(String namespaceURI, String name) {

    /** This findNamePoint is for DOM Level 2 Namespaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected int findNamePoint(String name, int start) {

    /**
     * Subroutine: Locate the named item, or the point at which said item
     * should be added.
     *
     * @param name Name of a node to look up.
     *
     * @return If positive or zero, the index of the found item.
     * If negative, index of the appropriate point at which to insert
     * the item, encoded as -1-index and hence reconvertable by subtracting
     * it from -1. (Encoding because I don't want to recompare the strings
     * but don't want to burn bytes on a datatype to hold a flagged value.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected void setOwnerDocument(CoreDocumentImpl doc) {

    /**
     * NON-DOM
     * set the ownerDocument of this node, and the attributes it contains
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    boolean getReadOnly() {

    /**
     * Internal subroutine returns this NodeNameMap's (shallow) readOnly value.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    void setReadOnly(boolean readOnly, boolean deep) {

    /**
     * Internal subroutine to allow read-only Nodes to make their contained
     * NamedNodeMaps readonly too. I expect that in fact the shallow
     * version of this operation will never be
     *
     * @param readOnly boolean true to make read-only, false to permit editing.
     * @param deep boolean true to pass this request along to the contained
     * nodes, false to only toggle the NamedNodeMap itself. I expect that
     * the shallow version of this operation will never be used, but I want
     * to design it in now, while I'm thinking about it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public NamedNodeMapImpl cloneMap(NodeImpl ownerNode) {

    /**
     * Cloning a NamedNodeMap is a DEEP OPERATION; it always clones
     * all the nodes contained in the map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
     public Node removeNamedItemNS(String namespaceURI, String name)

    /**
     * Introduced in DOM Level 2. <p>
     * Removes a node specified by local name and namespace URI.
     * @param namespaceURI
     *                      The namespace URI of the node to remove.
     *                      When it is null or an empty string, this
     *                      method behaves like removeNamedItem.
     * @param name          The local name of the node to remove.
     * @return Node         The node removed from the map if a node with such
     *                      a local name and namespace URI exists.
     * @throws              NOT_FOUND_ERR: Raised if there is no node named
     *                      name in the map.

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    /***/

    /**
     * Removes a node specified by name.
     * @param name The name of a node to remove.
     * @return The node removed from the map if a node with such a name exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public Node setNamedItemNS(Node arg)

    /**
     * Adds a node using its namespaceURI and localName.
     * @see org.w3c.dom.NamedNodeMap#setNamedItem
     * @return If the new Node replaces an existing node the replaced Node is returned,
     *      otherwise null is returned.
     * @param arg A node to store in a named node map. The node will later be
     *      accessible using the value of the namespaceURI and localName
     *      attribute of the node. If a node with those namespace URI and
     *      local name is already present in the map, it is replaced by the new
     *      one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public Node setNamedItem(Node arg)

    /**
     * Adds a node using its nodeName attribute.
     * As the nodeName attribute is used to derive the name which the node must be
     * stored under, multiple nodes of certain types (those that have a "special" string
     * value) cannot be stored as the names would clash. This is seen as preferable to
     * allowing nodes to be aliased.
     * @see org.w3c.dom.NamedNodeMap#setNamedItem
     * @return If the new Node replaces an existing node the replaced Node is returned,
     *      otherwise null is returned.
     * @param arg
     *      A node to store in a named node map. The node will later be
     *      accessible using the value of the namespaceURI and localName
     *      attribute of the node. If a node with those namespace URI and
     *      local name is already present in the map, it is replaced by the new
     *      one.
     * @exception org.w3c.dom.DOMException The exception description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public Node getNamedItemNS(String namespaceURI, String localName) {

    /**
     * Introduced in DOM Level 2. <p>
     * Retrieves a node specified by local name and namespace URI.
     *
     * @param namespaceURI  The namespace URI of the node to retrieve.
     *                      When it is null or an empty string, this
     *                      method behaves like getNamedItem.
     * @param localName     The local name of the node to retrieve.
     * @return Node         A Node (of any type) with the specified name, or null if the specified
     *                      name did not identify any node in the map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public Node getNamedItem(String name) {

    /**
     * Retrieve a node by name.
     *
     * @param name Name of a node to look up.
     * @return the Node (of unspecified sub-class) stored with that name, or
     * null if no value has been assigned to that name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public Node item(int index) {

    /**
     * Retrieve an item from the map by 0-based index.
     *
     * @param index Which item to retrieve. Note that indices are just an
     * enumeration of the current contents; they aren't guaranteed to be
     * stable, nor do they imply any promises about the order of the
     * NamedNodeMap's contents. In other words, DO NOT assume either that
     * index(i) will always refer to the same entry, or that there is any
     * stable ordering of entries... and be prepared for double-reporting
     * or skips as insertion and deletion occur.
     *
     * @return the node which currenly has the specified index, or null if index
     * is greater than or equal to getLength().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public int getLength() {

    /**
     * Report how many nodes are currently stored in this NamedNodeMap.
     * Caveat: This is a count rather than an index, so the
     * highest-numbered node at any time can be accessed via
     * item(getLength()-1).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected NamedNodeMapImpl(NodeImpl ownerNode) {

    /** Constructs a named node map. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected List nodes;

    /** Nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    static final long serialVersionUID = -7039242451046758020L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
public class NamedNodeMapImpl

/**
 * NamedNodeMaps represent collections of Nodes that can be accessed
 * by name. Entity and Notation nodes are stored in NamedNodeMaps
 * attached to the DocumentType. Attributes are placed in a NamedNodeMap
 * attached to the elem they're related too. However, because attributes
 * require more work, such as firing mutation events, they are stored in
 * a subclass of NamedNodeMapImpl.
 * <P>
 * Only one Node may be stored per name; attempting to
 * store another will replace the previous value.
 * <P>
 * NOTE: The "primary" storage key is taken from the NodeName attribute of the
 * node. The "secondary" storage key is the namespaceURI and localName, when
 * accessed by DOM level 2 nodes. All nodes, even DOM Level 2 nodes are stored
 * in a single Vector sorted by the primary "nodename" key.
 * <P>
 * NOTE: item()'s integer index does _not_ imply that the named nodes
 * must be stored in an array; that's only an access method. Note too
 * that these indices are "live"; if someone changes the map's
 * contents, the indices associated with nodes may change.
 * <P>
 *
 * @xerces.internal
 *
 * @version $Id: NamedNodeMapImpl.java,v 1.8 2010-11-01 04:39:39 joehw Exp $
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/NamedNodeMapImpl.java
public class NamedNodeMapImpl implements NamedNodeMap {

/**
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public void removeAll (){

    /**
      * NON-DOM remove all elements from this map
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected ArrayList cloneMap(ArrayList list) {

    /**
     * NON-DOM: copy content of this map into the specified ArrayList
     *
     * @param list   ArrayList to copy information into.
     * @return A copy of this node named map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected void removeItem(int index) {

    /**
      * NON-DOM: Remove attribute at specified index
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected int findNamePoint(String namespaceURI, String name) {

    /** This findNamePoint is for DOM Level 2 Namespaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected int findNamePoint(String name, int start) {

    /**
     * Subroutine: Locate the named item, or the point at which said item
     * should be added.
     *
     * @param name Name of a node to look up.
     *
     * @return If positive or zero, the index of the found item.
     * If negative, index of the appropriate point at which to insert
     * the item, encoded as -1-index and hence reconvertable by subtracting
     * it from -1. (Encoding because I don't want to recompare the strings
     * but don't want to burn bytes on a datatype to hold a flagged value.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected void setOwnerDocument(CoreDocumentImpl doc) {

    /**
     * NON-DOM
     * set the ownerDocument of this node, and the attributes it contains
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    boolean getReadOnly() {

    /**
     * Internal subroutine returns this NodeNameMap's (shallow) readOnly value.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    void setReadOnly(boolean readOnly, boolean deep) {

    /**
     * Internal subroutine to allow read-only Nodes to make their contained
     * NamedNodeMaps readonly too. I expect that in fact the shallow
     * version of this operation will never be
     *
     * @param readOnly boolean true to make read-only, false to permit editing.
     * @param deep boolean true to pass this request along to the contained
     * nodes, false to only toggle the NamedNodeMap itself. I expect that
     * the shallow version of this operation will never be used, but I want
     * to design it in now, while I'm thinking about it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public NamedNodeMapImpl cloneMap(NodeImpl ownerNode) {

    /**
     * Cloning a NamedNodeMap is a DEEP OPERATION; it always clones
     * all the nodes contained in the map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
     public Node removeNamedItemNS(String namespaceURI, String name)

    /**
     * Introduced in DOM Level 2. <p>
     * Removes a node specified by local name and namespace URI.
     * @param namespaceURI
     *                      The namespace URI of the node to remove.
     *                      When it is null or an empty string, this
     *                      method behaves like removeNamedItem.
     * @param name          The local name of the node to remove.
     * @return Node         The node removed from the map if a node with such
     *                      a local name and namespace URI exists.
     * @throws              NOT_FOUND_ERR: Raised if there is no node named
     *                      name in the map.

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    /***/

    /**
     * Removes a node specified by name.
     * @param name The name of a node to remove.
     * @return The node removed from the map if a node with such a name exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public Node setNamedItemNS(Node arg)

    /**
     * Adds a node using its namespaceURI and localName.
     * @see org.w3c.dom.NamedNodeMap#setNamedItem
     * @return If the new Node replaces an existing node the replaced Node is returned,
     *      otherwise null is returned.
     * @param arg A node to store in a named node map. The node will later be
     *      accessible using the value of the namespaceURI and localName
     *      attribute of the node. If a node with those namespace URI and
     *      local name is already present in the map, it is replaced by the new
     *      one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public Node setNamedItem(Node arg)

    /**
     * Adds a node using its nodeName attribute.
     * As the nodeName attribute is used to derive the name which the node must be
     * stored under, multiple nodes of certain types (those that have a "special" string
     * value) cannot be stored as the names would clash. This is seen as preferable to
     * allowing nodes to be aliased.
     * @see org.w3c.dom.NamedNodeMap#setNamedItem
     * @return If the new Node replaces an existing node the replaced Node is returned,
     *      otherwise null is returned.
     * @param arg
     *      A node to store in a named node map. The node will later be
     *      accessible using the value of the namespaceURI and localName
     *      attribute of the node. If a node with those namespace URI and
     *      local name is already present in the map, it is replaced by the new
     *      one.
     * @exception org.w3c.dom.DOMException The exception description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public Node getNamedItemNS(String namespaceURI, String localName) {

    /**
     * Introduced in DOM Level 2. <p>
     * Retrieves a node specified by local name and namespace URI.
     *
     * @param namespaceURI  The namespace URI of the node to retrieve.
     *                      When it is null or an empty string, this
     *                      method behaves like getNamedItem.
     * @param localName     The local name of the node to retrieve.
     * @return Node         A Node (of any type) with the specified name, or null if the specified
     *                      name did not identify any node in the map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public Node getNamedItem(String name) {

    /**
     * Retrieve a node by name.
     *
     * @param name Name of a node to look up.
     * @return the Node (of unspecified sub-class) stored with that name, or
     * null if no value has been assigned to that name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public Node item(int index) {

    /**
     * Retrieve an item from the map by 0-based index.
     *
     * @param index Which item to retrieve. Note that indices are just an
     * enumeration of the current contents; they aren't guaranteed to be
     * stable, nor do they imply any promises about the order of the
     * NamedNodeMap's contents. In other words, DO NOT assume either that
     * index(i) will always refer to the same entry, or that there is any
     * stable ordering of entries... and be prepared for double-reporting
     * or skips as insertion and deletion occur.
     *
     * @return the node which currenly has the specified index, or null if index
     * is greater than or equal to getLength().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    public int getLength() {

    /**
     * Report how many nodes are currently stored in this NamedNodeMap.
     * Caveat: This is a count rather than an index, so the
     * highest-numbered node at any time can be accessed via
     * item(getLength()-1).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected NamedNodeMapImpl(NodeImpl ownerNode) {

    /** Constructs a named node map. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    protected List nodes;

    /** Nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
    static final long serialVersionUID = -7039242451046758020L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/NamedNodeMapImpl.java
public class NamedNodeMapImpl

/**
 * NamedNodeMaps represent collections of Nodes that can be accessed
 * by name. Entity and Notation nodes are stored in NamedNodeMaps
 * attached to the DocumentType. Attributes are placed in a NamedNodeMap
 * attached to the elem they're related too. However, because attributes
 * require more work, such as firing mutation events, they are stored in
 * a subclass of NamedNodeMapImpl.
 * <P>
 * Only one Node may be stored per name; attempting to
 * store another will replace the previous value.
 * <P>
 * NOTE: The "primary" storage key is taken from the NodeName attribute of the
 * node. The "secondary" storage key is the namespaceURI and localName, when
 * accessed by DOM level 2 nodes. All nodes, even DOM Level 2 nodes are stored
 * in a single Vector sorted by the primary "nodename" key.
 * <P>
 * NOTE: item()'s integer index does _not_ imply that the named nodes
 * must be stored in an array; that's only an access method. Note too
 * that these indices are "live"; if someone changes the map's
 * contents, the indices associated with nodes may change.
 * <P>
 *
 * @xerces.internal
 *
 * @version $Id: NamedNodeMapImpl.java,v 1.8 2010-11-01 04:39:39 joehw Exp $
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/NamedNodeMapImpl.java
public class NamedNodeMapImpl implements NamedNodeMap {

/**
 * @xerces.internal
 *
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 */
