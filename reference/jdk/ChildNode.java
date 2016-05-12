_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    public Node getPreviousSibling() {

    /** The previous child of this node's parent, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    public Node getNextSibling() {

    /** The next child of this node's parent, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    public Node getParentNode() {

    /**
     * Returns the parent node of this node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    public ChildNode() {}

    /** Constructor for serialization. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    protected ChildNode(CoreDocumentImpl ownerDocument) {

    /**
     * No public constructor; only subclasses of Node should be
     * instantiated, and those normally via a Document's factory methods
     * <p>
     * Every Node knows what Document it belongs to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    protected ChildNode nextSibling;

    /** Next sibling. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    protected ChildNode previousSibling;

    /** Previous sibling. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    static final long serialVersionUID = -6112455738802414002L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
public abstract class ChildNode

/**
 * ChildNode inherits from NodeImpl and adds the capability of being a child by
 * having references to its previous and next siblings.
 *
 * @xerces.internal
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    public Node getPreviousSibling() {

    /** The previous child of this node's parent, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    public Node getNextSibling() {

    /** The next child of this node's parent, or null if none */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    public Node getParentNode() {

    /**
     * Returns the parent node of this node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    public ChildNode() {}

    /** Constructor for serialization. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    protected ChildNode(CoreDocumentImpl ownerDocument) {

    /**
     * No public constructor; only subclasses of Node should be
     * instantiated, and those normally via a Document's factory methods
     * <p>
     * Every Node knows what Document it belongs to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    protected ChildNode nextSibling;

    /** Next sibling. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    protected ChildNode previousSibling;

    /** Previous sibling. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
    static final long serialVersionUID = -6112455738802414002L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ChildNode.java
public abstract class ChildNode

/**
 * ChildNode inherits from NodeImpl and adds the capability of being a child by
 * having references to its previous and next siblings.
 *
 * @xerces.internal
 *
 */
