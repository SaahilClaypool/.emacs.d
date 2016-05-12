_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    static class ThrowableMethods {

    /**
     * Holder of methods from java.lang.Throwable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static LSException createLSException(short code, Throwable cause) {

    /**
     * Creates an LSException. On J2SE 1.4 and above the cause for the exception will be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static DOMException createDOMException(short code, Throwable cause) {

    /**
     * Creates a DOMException. On J2SE 1.4 and above the cause for the exception will be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static String getLocalName(Node node) {

    /** returns local name of this element if not null, otherwise
     returns the name of the node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static String getChildText(Node node) {

    /**
     * Returns the concatenated child text of the specified node.
     * This method only looks at the immediate children of type
     * <code>Node.TEXT_NODE</code> or the children of any child
     * node that is of type <code>Node.CDATA_SECTION_NODE</code>
     * for the concatenation.
     *
     * @param node The node to look at.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getNextSiblingElement(Node   node,
            String elemName,
            String attrName,
            String attrValue) {

    /**
     * Finds and returns the next sibling node with the given name and
     * attribute name, value pair. Since only elements have attributes,
     * the node returned will be of type Node.ELEMENT_NODE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastChildElement(Node   parent,
            String elemName,
            String attrName,
            String attrValue) {

    /**
     * Finds and returns the last child node with the given name and
     * attribute name, value pair.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstChildElement(Node   parent,
            String elemName,
            String attrName,
            String attrValue) {

    /**
     * Finds and returns the first child node with the given name and
     * attribute name, value pair.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getNextSiblingElementNS(Node node,
            String[][] elemNames) {

    /** Finds and returns the next sibling node with the given qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastChildElementNS(Node parent,
            String[][] elemNames) {

    /** Finds and returns the last child node with the given qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstChildElementNS(Node parent,
            String[][] elemNames) {

    /** Finds and returns the first child node with the given qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getNextSiblingElement(Node node, String elemNames[]) {

    /** Finds and returns the next sibling node with the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastChildElement(Node parent, String elemNames[]) {

    /** Finds and returns the last child node with the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstChildElement(Node parent, String elemNames[]) {

    /** Finds and returns the first child node with the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getNextSiblingElementNS(Node node,
            String uri, String localpart) {

    /** Finds and returns the next sibling node with the given qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastChildElementNS(Node parent,
            String uri, String localpart) {

    /** Finds and returns the last child node with the given qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstChildElementNS(Node parent,
            String uri, String localpart) {

    /** Finds and returns the first child node with the given qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getNextSiblingElement(Node node, String elemName) {

    /** Finds and returns the next sibling node with the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastChildElement(Node parent, String elemName) {

    /** Finds and returns the last child node with the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstChildElement(Node parent, String elemName) {

    /** Finds and returns the first child node with the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getNextSiblingElement(Node node) {

    /** Finds and returns the next sibling element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastVisibleChildElement(Node parent, Map<Node, String> hiddenNodes) {

    /** Finds and returns the last visible child element node.
     *  Overload previous method for non-Xerces node impl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastVisibleChildElement(Node parent) {

    /** Finds and returns the last visible child element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastChildElement(Node parent) {

    /** Finds and returns the last child element node.
     *  Overload previous method for non-Xerces node impl.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstVisibleChildElement(Node parent, Map<Node, String> hiddenNodes) {

    /** Finds and returns the first visible child element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstVisibleChildElement(Node parent) {

    /** Finds and returns the first visible child element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstChildElement(Node parent) {

    /** Finds and returns the first child element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static void copyInto(Node src, Node dest) throws DOMException {

    /**
     * Copies the source tree into the specified place in a destination
     * tree. The source node and its children are appended as children
     * of the destination node.
     * <p>
     * <em>Note:</em> This is an iterative implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    protected DOMUtil() {}

    /** This class cannot be instantiated. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
public class DOMUtil {

/**
 * Some useful utility methods.
 * This class was modified in Xerces2 with a view to abstracting as
 * much as possible away from the representation of the underlying
 * parsed structure (i.e., the DOM).  This was done so that, if Xerces
 * ever adopts an in-memory representation more efficient than the DOM
 * (such as a DTM), we should easily be able to convert our schema
 * parsing to utilize it.
 *
 * @version $Id: DOMUtil.java,v 1.7 2010-11-01 04:40:14 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    static class ThrowableMethods {

    /**
     * Holder of methods from java.lang.Throwable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static LSException createLSException(short code, Throwable cause) {

    /**
     * Creates an LSException. On J2SE 1.4 and above the cause for the exception will be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static DOMException createDOMException(short code, Throwable cause) {

    /**
     * Creates a DOMException. On J2SE 1.4 and above the cause for the exception will be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static String getLocalName(Node node) {

    /** returns local name of this element if not null, otherwise
     returns the name of the node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static String getChildText(Node node) {

    /**
     * Returns the concatenated child text of the specified node.
     * This method only looks at the immediate children of type
     * <code>Node.TEXT_NODE</code> or the children of any child
     * node that is of type <code>Node.CDATA_SECTION_NODE</code>
     * for the concatenation.
     *
     * @param node The node to look at.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getNextSiblingElement(Node   node,
            String elemName,
            String attrName,
            String attrValue) {

    /**
     * Finds and returns the next sibling node with the given name and
     * attribute name, value pair. Since only elements have attributes,
     * the node returned will be of type Node.ELEMENT_NODE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastChildElement(Node   parent,
            String elemName,
            String attrName,
            String attrValue) {

    /**
     * Finds and returns the last child node with the given name and
     * attribute name, value pair.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstChildElement(Node   parent,
            String elemName,
            String attrName,
            String attrValue) {

    /**
     * Finds and returns the first child node with the given name and
     * attribute name, value pair.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getNextSiblingElementNS(Node node,
            String[][] elemNames) {

    /** Finds and returns the next sibling node with the given qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastChildElementNS(Node parent,
            String[][] elemNames) {

    /** Finds and returns the last child node with the given qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstChildElementNS(Node parent,
            String[][] elemNames) {

    /** Finds and returns the first child node with the given qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getNextSiblingElement(Node node, String elemNames[]) {

    /** Finds and returns the next sibling node with the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastChildElement(Node parent, String elemNames[]) {

    /** Finds and returns the last child node with the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstChildElement(Node parent, String elemNames[]) {

    /** Finds and returns the first child node with the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getNextSiblingElementNS(Node node,
            String uri, String localpart) {

    /** Finds and returns the next sibling node with the given qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastChildElementNS(Node parent,
            String uri, String localpart) {

    /** Finds and returns the last child node with the given qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstChildElementNS(Node parent,
            String uri, String localpart) {

    /** Finds and returns the first child node with the given qualified name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getNextSiblingElement(Node node, String elemName) {

    /** Finds and returns the next sibling node with the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastChildElement(Node parent, String elemName) {

    /** Finds and returns the last child node with the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstChildElement(Node parent, String elemName) {

    /** Finds and returns the first child node with the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getNextSiblingElement(Node node) {

    /** Finds and returns the next sibling element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastVisibleChildElement(Node parent, Map<Node, String> hiddenNodes) {

    /** Finds and returns the last visible child element node.
     *  Overload previous method for non-Xerces node impl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastVisibleChildElement(Node parent) {

    /** Finds and returns the last visible child element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getLastChildElement(Node parent) {

    /** Finds and returns the last child element node.
     *  Overload previous method for non-Xerces node impl.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstVisibleChildElement(Node parent, Map<Node, String> hiddenNodes) {

    /** Finds and returns the first visible child element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstVisibleChildElement(Node parent) {

    /** Finds and returns the first visible child element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static Element getFirstChildElement(Node parent) {

    /** Finds and returns the first child element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    public static void copyInto(Node src, Node dest) throws DOMException {

    /**
     * Copies the source tree into the specified place in a destination
     * tree. The source node and its children are appended as children
     * of the destination node.
     * <p>
     * <em>Note:</em> This is an iterative implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
    protected DOMUtil() {}

    /** This class cannot be instantiated. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMUtil.java
public class DOMUtil {

/**
 * Some useful utility methods.
 * This class was modified in Xerces2 with a view to abstracting as
 * much as possible away from the representation of the underlying
 * parsed structure (i.e., the DOM).  This was done so that, if Xerces
 * ever adopts an in-memory representation more efficient than the DOM
 * (such as a DTM), we should easily be able to convert our schema
 * parsing to utilize it.
 *
 * @version $Id: DOMUtil.java,v 1.7 2010-11-01 04:40:14 joehw Exp $
 */
