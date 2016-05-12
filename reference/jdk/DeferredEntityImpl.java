_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
    protected void synchronizeChildren() {

    /** Synchronize the children. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
    protected void synchronizeData() {

    /**
     * Synchronize the entity data. This is special because of the way
     * that the "fast" version stores the information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
    public int getNodeIndex() {

    /** Returns the node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
    DeferredEntityImpl(DeferredDocumentImpl ownerDocument, int nodeIndex) {

    /**
     * This is the deferred constructor. Only the fNodeIndex is given here.
     * All other data, can be requested from the ownerDocument via the index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
    protected transient int fNodeIndex;

    /** Node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
    static final long serialVersionUID = 4760180431078941638L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
public class DeferredEntityImpl

/**
 * Entity nodes hold the reference data for an XML Entity -- either
 * parsed or unparsed. The nodeName (inherited from Node) will contain
 * the name (if any) of the Entity. Its data will be contained in the
 * Entity's children, in exactly the structure which an
 * EntityReference to this name will present within the document's
 * body.
 * <P>
 * Note that this object models the actual entity, _not_ the entity
 * declaration or the entity reference.
 * <P>
 * An XML processor may choose to completely expand entities before
 * the structure model is passed to the DOM; in this case, there will
 * be no EntityReferences in the DOM tree.
 * <P>
 * Quoting the 10/01 DOM Proposal,
 * <BLOCKQUOTE>
 * "The DOM Level 1 does not support editing Entity nodes; if a user
 * wants to make changes to the contents of an Entity, every related
 * EntityReference node has to be replaced in the structure model by
 * a clone of the Entity's contents, and then the desired changes
 * must be made to each of those clones instead. All the
 * descendants of an Entity node are readonly."
 * </BLOCKQUOTE>
 * I'm interpreting this as: It is the parser's responsibilty to call
 * the non-DOM operation setReadOnly(true,true) after it constructs
 * the Entity. Since the DOM explicitly decided not to deal with this,
 * _any_ answer will involve a non-DOM operation, and this is the
 * simplest solution.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
    protected void synchronizeChildren() {

    /** Synchronize the children. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
    protected void synchronizeData() {

    /**
     * Synchronize the entity data. This is special because of the way
     * that the "fast" version stores the information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
    public int getNodeIndex() {

    /** Returns the node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
    DeferredEntityImpl(DeferredDocumentImpl ownerDocument, int nodeIndex) {

    /**
     * This is the deferred constructor. Only the fNodeIndex is given here.
     * All other data, can be requested from the ownerDocument via the index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
    protected transient int fNodeIndex;

    /** Node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
    static final long serialVersionUID = 4760180431078941638L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredEntityImpl.java
public class DeferredEntityImpl

/**
 * Entity nodes hold the reference data for an XML Entity -- either
 * parsed or unparsed. The nodeName (inherited from Node) will contain
 * the name (if any) of the Entity. Its data will be contained in the
 * Entity's children, in exactly the structure which an
 * EntityReference to this name will present within the document's
 * body.
 * <P>
 * Note that this object models the actual entity, _not_ the entity
 * declaration or the entity reference.
 * <P>
 * An XML processor may choose to completely expand entities before
 * the structure model is passed to the DOM; in this case, there will
 * be no EntityReferences in the DOM tree.
 * <P>
 * Quoting the 10/01 DOM Proposal,
 * <BLOCKQUOTE>
 * "The DOM Level 1 does not support editing Entity nodes; if a user
 * wants to make changes to the contents of an Entity, every related
 * EntityReference node has to be replaced in the structure model by
 * a clone of the Entity's contents, and then the desired changes
 * must be made to each of those clones instead. All the
 * descendants of an Entity node are readonly."
 * </BLOCKQUOTE>
 * I'm interpreting this as: It is the parser's responsibilty to call
 * the non-DOM operation setReadOnly(true,true) after it constructs
 * the Entity. Since the DOM explicitly decided not to deal with this,
 * _any_ answer will involve a non-DOM operation, and this is the
 * simplest solution.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
