_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMLocator.java
    public Node getOriginatingNode();

    /**
     * Return the node where the event occurred.
     *
     * @return The node that is the location for the event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/dom/DOMLocator.java
public interface DOMLocator extends SourceLocator {

/**
 * Indicates the position of a node in a source DOM, intended
 * primarily for error reporting.  To use a DOMLocator, the receiver of an
 * error must downcast the {@link javax.xml.transform.SourceLocator}
 * object returned by an exception. A {@link javax.xml.transform.Transformer}
 * may use this object for purposes other than error reporting, for instance,
 * to indicate the source node that originated a result node.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMLocator.java
    public String getUri();

    /**
     * The URI this locator is pointing to, or <code>null</code> if no URI is
     * available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMLocator.java
    public Node getRelatedNode();

    /**
     * The node this locator is pointing to, or <code>null</code> if no node
     * is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMLocator.java
    public int getUtf16Offset();

    /**
     * The UTF-16, as defined in [Unicode] and Amendment 1 of [ISO/IEC 10646], offset into the input source this locator is pointing to or
     * <code>-1</code> if there is no UTF-16 offset available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMLocator.java
    public int getByteOffset();

    /**
     * The byte offset into the input source this locator is pointing to or
     * <code>-1</code> if there is no byte offset available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMLocator.java
    public int getColumnNumber();

    /**
     * The column number this locator is pointing to, or <code>-1</code> if
     * there is no column number available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMLocator.java
public interface DOMLocator {

/**
 * <code>DOMLocator</code> is an interface that describes a location (e.g.
 * where an error occurred).
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document Object Model (DOM) Level 3 Core Specification</a>.
 * @since DOM Level 3
 */
