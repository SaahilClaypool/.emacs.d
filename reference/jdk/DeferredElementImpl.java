_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredElementImpl.java
    protected final void synchronizeData() {

    /** Synchronizes the data (name and value) for fast nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredElementImpl.java
    public final int getNodeIndex() {

    /** Returns the node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredElementImpl.java
    DeferredElementImpl(DeferredDocumentImpl ownerDoc, int nodeIndex) {

    /**
     * This is the deferred constructor. Only the fNodeIndex is given here. All
     * other data, can be requested from the ownerDocument via the index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredElementImpl.java
    protected transient int fNodeIndex;

    /** Node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredElementImpl.java
    static final long serialVersionUID = -7670981133940934842L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredElementImpl.java
public class DeferredElementImpl

/**
 * Elements represent most of the "markup" and structure of the
 * document.  They contain both the data for the element itself
 * (element name and attributes), and any contained nodes, including
 * document text (as children).
 * <P>
 * Elements may have Attributes associated with them; the API for this is
 * defined in Node, but the function is implemented here. In general, XML
 * applications should retrive Attributes as Nodes, since they may contain
 * entity references and hence be a fairly complex sub-tree. HTML users will
 * be dealing with simple string values, and convenience methods are provided
 * to work in terms of Strings.
 * <P>
 * DeferredElementImpl inherits from ElementImpl which does not support
 * Namespaces. DeferredElementNSImpl, which inherits from ElementNSImpl, does.
 * @see DeferredElementNSImpl
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredElementImpl.java
    protected final void synchronizeData() {

    /** Synchronizes the data (name and value) for fast nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredElementImpl.java
    public final int getNodeIndex() {

    /** Returns the node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredElementImpl.java
    DeferredElementImpl(DeferredDocumentImpl ownerDoc, int nodeIndex) {

    /**
     * This is the deferred constructor. Only the fNodeIndex is given here. All
     * other data, can be requested from the ownerDocument via the index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredElementImpl.java
    protected transient int fNodeIndex;

    /** Node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredElementImpl.java
    static final long serialVersionUID = -7670981133940934842L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredElementImpl.java
public class DeferredElementImpl

/**
 * Elements represent most of the "markup" and structure of the
 * document.  They contain both the data for the element itself
 * (element name and attributes), and any contained nodes, including
 * document text (as children).
 * <P>
 * Elements may have Attributes associated with them; the API for this is
 * defined in Node, but the function is implemented here. In general, XML
 * applications should retrive Attributes as Nodes, since they may contain
 * entity references and hence be a fairly complex sub-tree. HTML users will
 * be dealing with simple string values, and convenience methods are provided
 * to work in terms of Strings.
 * <P>
 * DeferredElementImpl inherits from ElementImpl which does not support
 * Namespaces. DeferredElementNSImpl, which inherits from ElementNSImpl, does.
 * @see DeferredElementNSImpl
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
