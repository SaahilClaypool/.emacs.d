_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    protected void reconcileDefaults(NamedNodeMapImpl defaults) {

    /**
     * Get this AttributeMap in sync with the given "defaults" map.
     * @param defaults The default attributes map to sync with.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    void moveSpecifiedAttributes(AttributeMap srcmap) {

    /**
     * Move specified attributes from the given map to this one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    protected void cloneContent(NamedNodeMapImpl srcmap) {

    /**
     * Override parent's method to set the ownerNode correctly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    public NamedNodeMapImpl cloneMap(NodeImpl ownerNode) {

    /**
     * Cloning a NamedNodeMap is a DEEP OPERATION; it always clones
     * all the nodes contained in the map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    final protected Node internalRemoveNamedItemNS(String namespaceURI,
            String name,
            boolean raiseEx) {

    /**
     * Internal removeNamedItemNS method allowing to specify whether an
     * exception must be thrown if the specified local name and namespace URI
     * is not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    Node safeRemoveNamedItemNS(String namespaceURI, String name) {

    /**
     * Same as removeNamedItem except that it simply returns null if the
     * specified local name and namespace URI is not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    public Node removeNamedItemNS(String namespaceURI, String name)

    /**
     * Introduced in DOM Level 2. <p>
     * Removes an attribute specified by local name and namespace URI.
     * @param namespaceURI
     *                      The namespace URI of the node to remove.
     *                      When it is null or an empty string, this
     *                      method behaves like removeNamedItem.
     * @param name          The local name of the node to remove. If the
     *                      removed attribute is known to have a default
     *                      value, an attribute immediately appears
     *                      containing the default value.
     * @return Node         The node removed from the map if a node with such
     *                      a local name and namespace URI exists.
     * @throws              NOT_FOUND_ERR: Raised if there is no node named
     *                      name in the map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    final protected Node internalRemoveNamedItem(String name, boolean raiseEx){

    /**
     * Internal removeNamedItem method allowing to specify whether an exception
     * must be thrown if the specified name is not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    protected Node removeItem(Node item, boolean addDefault)

    /**
     * NON-DOM: Remove the node object
     *
     * NOTE: Specifically removes THIS NODE -- not the node with this
     * name, nor the node with these contents. If node does not belong to
     * this named node map, we throw a DOMException.
     *
     * @param item       The node to remove
     * @param addDefault true -- magically add default attribute
     * @return Removed node
     * @exception DOMException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    Node safeRemoveNamedItem(String name) {

    /**
     * Same as removeNamedItem except that it simply returns null if the
     * specified name is not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    /***/

    /**
     * Removes an attribute specified by name.
     * @param name
     *      The name of a node to remove. If the
     *      removed attribute is known to have a default value, an
     *      attribute immediately appears containing the default value
     *      as well as the corresponding namespace URI, local name,
     *      and prefix when applicable.
     * @return The node removed from the map if a node with such a name exists.
     * @throws              NOT_FOUND_ERR: Raised if there is no node named
     *                      name in the map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    public Node setNamedItemNS(Node arg)

    /**
     * Adds an attribute using its namespaceURI and localName.
     * @see org.w3c.dom.NamedNodeMap#setNamedItem
     * @return If the new Node replaces an existing node the replaced Node is
     *      returned, otherwise null is returned.
     * @param arg A node to store in a named node map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    public Node setNamedItem(Node arg)

    /**
     * Adds an attribute using its nodeName attribute.
     * @see org.w3c.dom.NamedNodeMap#setNamedItem
     * @return If the new Node replaces an existing node the replaced Node is
     *      returned, otherwise null is returned.
     * @param arg
     *      An Attr node to store in this map.
     * @exception org.w3c.dom.DOMException The exception description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    protected AttributeMap(ElementImpl ownerNode, NamedNodeMapImpl defaults) {

    /** Constructs a named node map. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    static final long serialVersionUID = 8872606282138665383L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
public class AttributeMap extends NamedNodeMapImpl {

/**
 * AttributeMap inherits from NamedNodeMapImpl and extends it to deal with the
 * specifics of storing attributes. These are:
 * <ul>
 *  <li>managing ownership of attribute nodes
 *  <li>managing default attributes
 *  <li>firing mutation events
 * </ul>
 * <p>
 * This class doesn't directly support mutation events, however, it notifies
 * the document when mutations are performed so that the document class do so.
 *
 * @xerces.internal
 *
 * @version $Id: AttributeMap.java,v 1.7 2010-11-01 04:39:37 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    protected void reconcileDefaults(NamedNodeMapImpl defaults) {

    /**
     * Get this AttributeMap in sync with the given "defaults" map.
     * @param defaults The default attributes map to sync with.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    void moveSpecifiedAttributes(AttributeMap srcmap) {

    /**
     * Move specified attributes from the given map to this one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    protected void cloneContent(NamedNodeMapImpl srcmap) {

    /**
     * Override parent's method to set the ownerNode correctly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    public NamedNodeMapImpl cloneMap(NodeImpl ownerNode) {

    /**
     * Cloning a NamedNodeMap is a DEEP OPERATION; it always clones
     * all the nodes contained in the map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    final protected Node internalRemoveNamedItemNS(String namespaceURI,
            String name,
            boolean raiseEx) {

    /**
     * Internal removeNamedItemNS method allowing to specify whether an
     * exception must be thrown if the specified local name and namespace URI
     * is not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    Node safeRemoveNamedItemNS(String namespaceURI, String name) {

    /**
     * Same as removeNamedItem except that it simply returns null if the
     * specified local name and namespace URI is not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    public Node removeNamedItemNS(String namespaceURI, String name)

    /**
     * Introduced in DOM Level 2. <p>
     * Removes an attribute specified by local name and namespace URI.
     * @param namespaceURI
     *                      The namespace URI of the node to remove.
     *                      When it is null or an empty string, this
     *                      method behaves like removeNamedItem.
     * @param name          The local name of the node to remove. If the
     *                      removed attribute is known to have a default
     *                      value, an attribute immediately appears
     *                      containing the default value.
     * @return Node         The node removed from the map if a node with such
     *                      a local name and namespace URI exists.
     * @throws              NOT_FOUND_ERR: Raised if there is no node named
     *                      name in the map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    final protected Node internalRemoveNamedItem(String name, boolean raiseEx){

    /**
     * Internal removeNamedItem method allowing to specify whether an exception
     * must be thrown if the specified name is not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    protected Node removeItem(Node item, boolean addDefault)

    /**
     * NON-DOM: Remove the node object
     *
     * NOTE: Specifically removes THIS NODE -- not the node with this
     * name, nor the node with these contents. If node does not belong to
     * this named node map, we throw a DOMException.
     *
     * @param item       The node to remove
     * @param addDefault true -- magically add default attribute
     * @return Removed node
     * @exception DOMException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    Node safeRemoveNamedItem(String name) {

    /**
     * Same as removeNamedItem except that it simply returns null if the
     * specified name is not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    /***/

    /**
     * Removes an attribute specified by name.
     * @param name
     *      The name of a node to remove. If the
     *      removed attribute is known to have a default value, an
     *      attribute immediately appears containing the default value
     *      as well as the corresponding namespace URI, local name,
     *      and prefix when applicable.
     * @return The node removed from the map if a node with such a name exists.
     * @throws              NOT_FOUND_ERR: Raised if there is no node named
     *                      name in the map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    public Node setNamedItemNS(Node arg)

    /**
     * Adds an attribute using its namespaceURI and localName.
     * @see org.w3c.dom.NamedNodeMap#setNamedItem
     * @return If the new Node replaces an existing node the replaced Node is
     *      returned, otherwise null is returned.
     * @param arg A node to store in a named node map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    public Node setNamedItem(Node arg)

    /**
     * Adds an attribute using its nodeName attribute.
     * @see org.w3c.dom.NamedNodeMap#setNamedItem
     * @return If the new Node replaces an existing node the replaced Node is
     *      returned, otherwise null is returned.
     * @param arg
     *      An Attr node to store in this map.
     * @exception org.w3c.dom.DOMException The exception description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    protected AttributeMap(ElementImpl ownerNode, NamedNodeMapImpl defaults) {

    /** Constructs a named node map. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
    static final long serialVersionUID = 8872606282138665383L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/AttributeMap.java
public class AttributeMap extends NamedNodeMapImpl {

/**
 * AttributeMap inherits from NamedNodeMapImpl and extends it to deal with the
 * specifics of storing attributes. These are:
 * <ul>
 *  <li>managing ownership of attribute nodes
 *  <li>managing default attributes
 *  <li>firing mutation events
 * </ul>
 * <p>
 * This class doesn't directly support mutation events, however, it notifies
 * the document when mutations are performed so that the document class do so.
 *
 * @xerces.internal
 *
 * @version $Id: AttributeMap.java,v 1.7 2010-11-01 04:39:37 joehw Exp $
 */
