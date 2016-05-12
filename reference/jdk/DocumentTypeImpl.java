_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /**
     * @serialData Serialized fields. Convert Map to Hashtable for backward
     * compatibility.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public NamedNodeMap getElements() {

    /**
     * NON-DOM: Access the collection of ElementDefinitions.
     * @see ElementDefinitionImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public void setReadOnly(boolean readOnly, boolean deep) {

    /**
     * NON-DOM: Subclassed to flip the entities' and notations' readonly switch
     * as well.
     * @see NodeImpl#setReadOnly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public NamedNodeMap getNotations() {

    /**
     * Access the collection of Notations defined in the DTD.  A
     * notation declares, by name, the format of an XML unparsed entity
     * or is used to formally declare a Processing Instruction target.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public NamedNodeMap getEntities() {

    /**
     * Access the collection of general Entities, both external and
     * internal, defined in the DTD. For example, in:
     * <p>
     * <pre>
     *   &lt;!doctype example SYSTEM "ex.dtd" [
     *     &lt;!ENTITY foo "foo"&gt;
     *     &lt;!ENTITY bar "bar"&gt;
     *     &lt;!ENTITY % baz "baz"&gt;
     *     ]&gt;
     * </pre>
     * <p>
     * The Entities map includes foo and bar, but not baz. It is promised that
     * only Nodes which are Entities will exist in this NamedNodeMap.
     * <p>
     * For HTML, this will always be null.
     * <p>
     * Note that "built in" entities such as &amp; and &lt; should be
     * converted to their actual characters before being placed in the DOM's
     * contained text, and should be converted back when the DOM is rendered
     * as XML or HTML, and hence DO NOT appear here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public String getName() {

    /**
     * Name of this document type. If we loaded from a DTD, this should
     * be the name immediately following the DOCTYPE keyword.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    protected int getNodeNumber() {

    /** NON-DOM
        Get the number associated with this doctype.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    void setOwnerDocument(CoreDocumentImpl doc) {

    /**
     * NON-DOM
     * set the ownerDocument of this node and its children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public boolean isEqualNode(Node arg) {

        /**
          * DOM Level 3 WD- Experimental.
          * Override inherited behavior from ParentNodeImpl to support deep equal.
          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public Node cloneNode(boolean deep) {

    /** Clones the node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public String getNodeName() {

    /**
     * Returns the document type name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public String getInternalSubset() {

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Return the internalSubset given as a string.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public void setInternalSubset(String internalSubset) {

    /**
     * NON-DOM. <p>
     *
     * Set the internalSubset given as a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public String getSystemId() {

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Return the system identifier of this Document type.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public String getPublicId() {

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Return the public identifier of this Document type.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public DocumentTypeImpl(CoreDocumentImpl ownerDocument,
                            String qualifiedName,
                            String publicID, String systemID) {

    /** Factory method for creating a document type node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public DocumentTypeImpl(CoreDocumentImpl ownerDocument, String name) {

    /** Factory method for creating a document type node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    private static final ObjectStreamField[] serialPersistentFields =

    /**
     * @serialField name String document type name
     * @serialField entities NamedNodeMapImpl entities
     * @serialField notations NamedNodeMapImpl notations
     * @serialField elements NamedNodeMapImpl elements
     * @serialField publicID String support public ID
     * @serialField systemID String support system ID
     * @serialField internalSubset String support internal subset
     * @serialField doctypeNumber int Doctype number
     * @serialField userData Hashtable user data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    // Doctype number.   Doc types which have no owner may be assigned

    /** The following are required for compareDocumentPosition
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    protected NamedNodeMapImpl elements;

    /** Elements. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    protected NamedNodeMapImpl notations;

    /** Notations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    protected NamedNodeMapImpl entities;

    /** Entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    protected String name;

    /** Document type name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    static final long serialVersionUID = 7751299192316526485L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
public class DocumentTypeImpl

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
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /**
     * @serialData Serialized fields. Convert Map to Hashtable for backward
     * compatibility.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public NamedNodeMap getElements() {

    /**
     * NON-DOM: Access the collection of ElementDefinitions.
     * @see ElementDefinitionImpl
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public void setReadOnly(boolean readOnly, boolean deep) {

    /**
     * NON-DOM: Subclassed to flip the entities' and notations' readonly switch
     * as well.
     * @see NodeImpl#setReadOnly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public NamedNodeMap getNotations() {

    /**
     * Access the collection of Notations defined in the DTD.  A
     * notation declares, by name, the format of an XML unparsed entity
     * or is used to formally declare a Processing Instruction target.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public NamedNodeMap getEntities() {

    /**
     * Access the collection of general Entities, both external and
     * internal, defined in the DTD. For example, in:
     * <p>
     * <pre>
     *   &lt;!doctype example SYSTEM "ex.dtd" [
     *     &lt;!ENTITY foo "foo"&gt;
     *     &lt;!ENTITY bar "bar"&gt;
     *     &lt;!ENTITY % baz "baz"&gt;
     *     ]&gt;
     * </pre>
     * <p>
     * The Entities map includes foo and bar, but not baz. It is promised that
     * only Nodes which are Entities will exist in this NamedNodeMap.
     * <p>
     * For HTML, this will always be null.
     * <p>
     * Note that "built in" entities such as &amp; and &lt; should be
     * converted to their actual characters before being placed in the DOM's
     * contained text, and should be converted back when the DOM is rendered
     * as XML or HTML, and hence DO NOT appear here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public String getName() {

    /**
     * Name of this document type. If we loaded from a DTD, this should
     * be the name immediately following the DOCTYPE keyword.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    protected int getNodeNumber() {

    /** NON-DOM
        Get the number associated with this doctype.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    void setOwnerDocument(CoreDocumentImpl doc) {

    /**
     * NON-DOM
     * set the ownerDocument of this node and its children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public boolean isEqualNode(Node arg) {

        /**
          * DOM Level 3 WD- Experimental.
          * Override inherited behavior from ParentNodeImpl to support deep equal.
          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public Node cloneNode(boolean deep) {

    /** Clones the node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public String getNodeName() {

    /**
     * Returns the document type name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public String getInternalSubset() {

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Return the internalSubset given as a string.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public void setInternalSubset(String internalSubset) {

    /**
     * NON-DOM. <p>
     *
     * Set the internalSubset given as a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public String getSystemId() {

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Return the system identifier of this Document type.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public String getPublicId() {

    /**
     * Introduced in DOM Level 2. <p>
     *
     * Return the public identifier of this Document type.
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public DocumentTypeImpl(CoreDocumentImpl ownerDocument,
                            String qualifiedName,
                            String publicID, String systemID) {

    /** Factory method for creating a document type node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    public DocumentTypeImpl(CoreDocumentImpl ownerDocument, String name) {

    /** Factory method for creating a document type node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    private static final ObjectStreamField[] serialPersistentFields =

    /**
     * @serialField name String document type name
     * @serialField entities NamedNodeMapImpl entities
     * @serialField notations NamedNodeMapImpl notations
     * @serialField elements NamedNodeMapImpl elements
     * @serialField publicID String support public ID
     * @serialField systemID String support system ID
     * @serialField internalSubset String support internal subset
     * @serialField doctypeNumber int Doctype number
     * @serialField userData Hashtable user data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    // Doctype number.   Doc types which have no owner may be assigned

    /** The following are required for compareDocumentPosition
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    protected NamedNodeMapImpl elements;

    /** Elements. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    protected NamedNodeMapImpl notations;

    /** Notations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    protected NamedNodeMapImpl entities;

    /** Entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    protected String name;

    /** Document type name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
    static final long serialVersionUID = 7751299192316526485L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentTypeImpl.java
public class DocumentTypeImpl

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
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @since  PR-DOM-Level-1-19980818.
 */
