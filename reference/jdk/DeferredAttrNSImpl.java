_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
    protected void synchronizeChildren() {

    /**
     * Synchronizes the node's children with the internal structure.
     * Fluffing the children at once solves a lot of work to keep
     * the two structures in sync. The problem gets worse when
     * editing the tree -- this makes it a lot easier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
    protected void synchronizeData() {

    /** Synchronizes the data (name and value) for fast nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
    public int getNodeIndex() {

    /** Returns the node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
    DeferredAttrNSImpl(DeferredDocumentImpl ownerDocument, int nodeIndex) {

    /**
     * This is the deferred constructor. Only the fNodeIndex is given here.
     * All other data, can be requested from the ownerDocument via the index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
    protected transient int fNodeIndex;

    /** Node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
    static final long serialVersionUID = 6074924934945957154L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
public final class DeferredAttrNSImpl

/**
 * DeferredAttrNSImpl is to AttrNSImpl, what DeferredAttrImpl is to
 * AttrImpl.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @see DeferredAttrImpl
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
    protected void synchronizeChildren() {

    /**
     * Synchronizes the node's children with the internal structure.
     * Fluffing the children at once solves a lot of work to keep
     * the two structures in sync. The problem gets worse when
     * editing the tree -- this makes it a lot easier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
    protected void synchronizeData() {

    /** Synchronizes the data (name and value) for fast nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
    public int getNodeIndex() {

    /** Returns the node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
    DeferredAttrNSImpl(DeferredDocumentImpl ownerDocument, int nodeIndex) {

    /**
     * This is the deferred constructor. Only the fNodeIndex is given here.
     * All other data, can be requested from the ownerDocument via the index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
    protected transient int fNodeIndex;

    /** Node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
    static final long serialVersionUID = 6074924934945957154L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredAttrNSImpl.java
public final class DeferredAttrNSImpl

/**
 * DeferredAttrNSImpl is to AttrNSImpl, what DeferredAttrImpl is to
 * AttrImpl.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @see DeferredAttrImpl
 */
