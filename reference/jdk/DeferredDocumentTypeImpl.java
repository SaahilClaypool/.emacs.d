_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
    protected void synchronizeChildren() {

    /** Synchronizes the entities, notations, and elements. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
    protected void synchronizeData() {

    /** Synchronizes the data (name and value) for fast nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
    public int getNodeIndex() {

    /** Returns the node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
    DeferredDocumentTypeImpl(DeferredDocumentImpl ownerDocument, int nodeIndex) {

    /**
     * This is the deferred constructor. Only the fNodeIndex is given here.
     * All other data, can be requested from the ownerDocument via the index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
    protected transient int fNodeIndex;

    /** Node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
    static final long serialVersionUID = -2172579663227313509L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
public class DeferredDocumentTypeImpl

/**
 * This class represents a Document Type <em>declaraction</em> in
 * the document itself, <em>not</em> a Document Type Definition (DTD).
 * An XML document may (or may not) have such a reference.
 * <P>
 * DocumentType is an Extended DOM feature, used in XML documents but
 * not in HTML.
 * <P>
 * Note that Entities and Notations are no longer children of the
 * DocumentType, but are parentless nodes hung only in their
 * appropriate NamedNodeMaps.
 * <P>
 * This area is UNDERSPECIFIED IN REC-DOM-Level-1-19981001
 * Most notably, absolutely no provision was made for storing
 * and using Element and Attribute information. Nor was the linkage
 * between Entities and Entity References nailed down solidly.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
    protected void synchronizeChildren() {

    /** Synchronizes the entities, notations, and elements. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
    protected void synchronizeData() {

    /** Synchronizes the data (name and value) for fast nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
    public int getNodeIndex() {

    /** Returns the node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
    DeferredDocumentTypeImpl(DeferredDocumentImpl ownerDocument, int nodeIndex) {

    /**
     * This is the deferred constructor. Only the fNodeIndex is given here.
     * All other data, can be requested from the ownerDocument via the index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
    protected transient int fNodeIndex;

    /** Node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
    static final long serialVersionUID = -2172579663227313509L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentTypeImpl.java
public class DeferredDocumentTypeImpl

/**
 * This class represents a Document Type <em>declaraction</em> in
 * the document itself, <em>not</em> a Document Type Definition (DTD).
 * An XML document may (or may not) have such a reference.
 * <P>
 * DocumentType is an Extended DOM feature, used in XML documents but
 * not in HTML.
 * <P>
 * Note that Entities and Notations are no longer children of the
 * DocumentType, but are parentless nodes hung only in their
 * appropriate NamedNodeMaps.
 * <P>
 * This area is UNDERSPECIFIED IN REC-DOM-Level-1-19981001
 * Most notably, absolutely no provision was made for storing
 * and using Element and Attribute information. Nor was the linkage
 * between Entities and Entity References nailed down solidly.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
